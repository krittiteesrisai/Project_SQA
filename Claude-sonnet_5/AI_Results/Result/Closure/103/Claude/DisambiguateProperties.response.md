# หมายเหตุสำคัญก่อนเริ่ม (ตามข้อกำหนดที่ 4)

`DisambiguateProperties` เป็น **package-private class** ที่ constructor เป็น `private` เข้าถึงได้เฉพาะผ่าน static factory (`forJSTypeSystem`) ซึ่งต้องใช้ `AbstractCompiler`/`Compiler` จริงที่ผ่านการ type-check มาแล้ว การจะสร้าง instance และรัน `process()` ได้จริงจำเป็นต้องพึ่งพา infrastructure ทดสอบมาตรฐานของโปรเจกต์ (คลาส `CompilerTestCase` ซึ่งอยู่ใน package เดียวกัน `com.google.javascript.jscomp` และถูก compile รวมอยู่ใน classpath ของโปรเจกต์อยู่แล้ว ไม่ใช่ jar ภายนอก) — **ผมไม่มี source ของ `CompilerTestCase`/`Compiler` ให้ในโจทย์** จึงอ้างอิง API ที่เป็นที่รู้จักกันดีในโปรเจกต์นี้ (`testSame(js)`, `test(js, expected)`, `enableTypeCheck(CheckLevel)`, `getProcessor(Compiler)`) — **หากสมมติฐานเรื่อง signature เหล่านี้ผิด ต้องปรับ import/สัญญาณเมธอกให้ตรงกับ `CompilerTestCase` จริงในโปรเจกต์** (คอมเมนต์ไว้ในโค้ดด้วย)

จุดที่ปลอดภัยที่สุดและอ้างอิงจาก source ที่ให้มา **โดยตรง 100%** คือเมธอด `getRenamedTypesForTesting()` และ `getProperty()` ซึ่งเป็น package-private/protected และมีคอมเมนต์ "Public for testing" กำกับอยู่แล้ว — ผมจึงใช้เมธอดนี้เป็นหลักในการ assert เพื่อลดการเดา "ชื่อ property ที่ถูก rename" (ซึ่งขึ้นกับ `JSType.toString()` ที่ไม่ได้ให้ source มา จึงไม่กล้าฟันธง exact string)

```java
package com.google.javascript.jscomp;

// import แบบ explicit ตามข้อกำหนด (แม้จะอยู่ package เดียวกันอยู่แล้ว - Java อนุญาตให้ import ซ้ำใน
// package เดียวกันได้ ไม่ error)
import com.google.javascript.jscomp.DisambiguateProperties;

import com.google.common.collect.Multimap;

/**
 * Unit test สำหรับ {@link DisambiguateProperties} (Defects4J Closure-103b)
 *
 * หมายเหตุ: คลาสนี้ extends {@link CompilerTestCase} (อยู่ใน package เดียวกัน, ไม่ใช่ jar ภายนอก)
 * เพื่อให้สามารถ parse + type-check + รัน pass จริงได้ ซึ่งจำเป็นเพราะ constructor ของ
 * DisambiguateProperties เป็น private และต้องพึ่ง AbstractCompiler ที่ทำงานได้จริง
 *
 * สมมติฐานเกี่ยวกับ API ของ CompilerTestCase (ไม่ได้ให้ source มาในโจทย์ จึงอ้างอิงจาก
 * ธรรมเนียมมาตรฐานของโปรเจกต์นี้ - ถ้าไม่ตรง ต้องแก้ไข):
 *   - protected CompilerTestCase(String externs)
 *   - protected abstract CompilerPass getProcessor(Compiler compiler)
 *   - protected void enableTypeCheck(CheckLevel level)
 *   - protected void test(String js, String expected)
 *   - protected void testSame(String js)
 *
 * เนื่องจาก JSType.toString() (รูปแบบชื่อที่ถูก rename เช่น "Foo$a" หรือ "Foo.prototype$a")
 * ไม่ได้ถูกให้ source มาด้วย จึง "ห้ามเดา" exact string และเลือกใช้
 * getRenamedTypesForTesting() (ซึ่งมี source ให้ครบ) เป็นหลักในการตรวจสอบ branch logic
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class DisambiguatePropertiesTest extends CompilerTestCase {

  // ประกาศ Baz ไว้ใน externs สำหรับทดสอบ FindExternProperties / addTypeToSkip
  private static final String EXTERNS =
      "/** @constructor */ function Baz() {}\n" +
      "Baz.prototype.a = 0;\n";

  // เก็บ reference ของ pass ที่ถูกสร้างล่าสุด เพื่อเรียก getRenamedTypesForTesting()/getProperty()
  // (ทั้งสองเป็น package-private/protected เข้าถึงได้เพราะอยู่ package เดียวกัน)
  private DisambiguateProperties lastPass;

  public DisambiguatePropertiesTest() {
    super(EXTERNS);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    enableTypeCheck(CheckLevel.WARNING);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    lastPass = DisambiguateProperties.forJSTypeSystem(compiler);
    return lastPass;
  }

  // ---------------------------------------------------------------------
  // 1) Boundary: empty program -> for-loop ใน process()/renameProperties() ทำงาน 0 รอบ
  // ---------------------------------------------------------------------
  public void testEmptyProgram() {
    testSame("");
  }

  // ---------------------------------------------------------------------
  // 2) Malformed/ไม่ match: GETELEM ไม่ถูกจับใน visit() เพราะ token ไม่ใช่ GETPROP/OBJECTLIT
  //    (ครอบคลุม branch "else ไม่ทำอะไร" ของ if/else if ใน FindRenameableProperties.visit)
  // ---------------------------------------------------------------------
  public void testBracketAccessIsIgnored() {
    testSame("var foo = {}; foo['a'] = 1; foo['a'];");
  }

  // ---------------------------------------------------------------------
  // 3) Object literal: loop เดินข้าม key ที่ไม่ใช่ Token.STRING (numeric key)
  //    และ property ที่มาจาก object literal type (anonymous, ไม่มี reference name)
  //    จะถูก invalidate เพราะ JSTypeSystem.isInvalidatingType คืน true (!hasReferenceName())
  //    -> scheduleRenaming คืน false -> invalidate() -> skipRenaming = true
  // ---------------------------------------------------------------------
  public void testObjectLiteral_NumericKeySkipped_AndPropertyInvalidated() {
    testSame("var o = {1: 'x', y: 2};");
    Multimap renamed = lastPass.getRenamedTypesForTesting();
    // property "y" ถูก invalidate ทั้งหมด -> ไม่ควรมี entry ใน map (ตาม source ของ
    // getRenamedTypesForTesting: if (!prop.skipRenaming) ... )
    assertTrue(renamed.get("y").isEmpty());
  }

  // ---------------------------------------------------------------------
  // 4) Single type only -> shouldRename() == false (equivalence class ขนาด 1)
  //    -> singleTypeProps++, ไม่มีการ rename
  // ---------------------------------------------------------------------
  public void testSingleType_NoRename() {
    testSame(
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype.a = 0;\n" +
        "var f = new Foo();\n" +
        "f.a;\n");

    Multimap renamed = lastPass.getRenamedTypesForTesting();
    // มี 1 equivalence class ของ property "a"
    assertEquals(1, renamed.get("a").size());
  }

  // ---------------------------------------------------------------------
  // 5) Two unrelated types -> 2 equivalence classes -> shouldRename() == true
  //    (ครอบคลุม branch addType(): relatedType==null -> getTypes().add(top))
  // ---------------------------------------------------------------------
  public void testTwoUnrelatedTypes_CreatesTwoEquivalenceClasses() {
    testSame(  // ใช้ testSame เพราะไม่ต้องพึ่ง exact rename string (ดูหมายเหตุด้านบน)
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype.a = 0;\n" +
        "/** @constructor */ function Bar() {}\n" +
        "Bar.prototype.a = 0;\n" +
        "var f = new Foo();\n" +
        "f.a;\n" +
        "var b = new Bar();\n" +
        "b.a;\n");

    Multimap renamed = lastPass.getRenamedTypesForTesting();
    // Foo และ Bar ไม่เกี่ยวข้องกัน -> ต้องมี 2 equivalence class แยกกันสำหรับ "a"
    // (แสดงว่า shouldRename() จะ true และ propsRenamed++ ใน renameProperties())
    assertEquals(2, renamed.get("a").size());
  }

  // ---------------------------------------------------------------------
  // 6) Prototype sharing (เสมือน inheritance) -> topType (Foo.prototype) เดียวกัน
  //    ทั้งสองฝั่ง -> รวมกันเป็น equivalence class เดียว -> ไม่ rename
  // ---------------------------------------------------------------------
  public void testSharedPrototype_MergesIntoOneClass_NoRename() {
    testSame(
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype.a = 0;\n" +
        "/** @constructor */ function Bar() {}\n" +
        "Bar.prototype = Foo.prototype;\n" +
        "var f = new Foo();\n" +
        "f.a;\n" +
        "var b = new Bar();\n" +
        "b.a;\n");

    Multimap renamed = lastPass.getRenamedTypesForTesting();
    assertEquals(1, renamed.get("a").size());
  }

  // ---------------------------------------------------------------------
  // 7) Extern property -> FindExternProperties.visit(): addTypeToSkip() +
  //    getInstanceFromPrototype() != null branch (เพิ่ม instance type ลง typesToSkip ด้วย)
  //    ในขณะที่ property เดียวกันถูกใช้กับ type อื่นใน source -> เกิดการ rename
  //    บางส่วน (shouldRename(rootType) true/false ทั้งสอง branch ใน renameProperties())
  // ---------------------------------------------------------------------
  public void testExternType_IsSkipped_SourceTypeIsNot() {
    testSame(
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype.a = 1;\n" +
        "var f = new Foo();\n" +
        "f.a;\n" +
        "var bz = new Baz();\n" +
        "bz.a;\n");

    Multimap renamed = lastPass.getRenamedTypesForTesting();
    // Baz (จาก externs) ถูก mark ใน typesToSkip -> ไม่ปรากฏใน map
    // ส่วน Foo (จาก source) ควรปรากฏเป็น class แยก 1 class
    assertEquals(1, renamed.get("a").size());
  }

  // ---------------------------------------------------------------------
  // 8) Interface -> recordInterfaces(): สอง class ที่ implement interface เดียวกัน
  //    และ interface ประกาศ property เดียวกัน -> ถูก union เข้าด้วยกันผ่าน relatedType
  //    -> รวมเป็น equivalence class เดียว แม้ Foo/Bar จะไม่เกี่ยวข้องกันโดยตรง
  // ---------------------------------------------------------------------
  public void testInterfaceRelatesUnrelatedImplementors() {
    testSame(
        "/** @interface */ function I() {}\n" +
        "I.prototype.a = function() {};\n" +
        "/** @constructor @implements {I} */ function Foo() {}\n" +
        "Foo.prototype.a = function() {};\n" +
        "/** @constructor @implements {I} */ function Bar() {}\n" +
        "Bar.prototype.a = function() {};\n" +
        "var f = new Foo();\n" +
        "f.a();\n" +
        "var b = new Bar();\n" +
        "b.a();\n");

    Multimap renamed = lastPass.getRenamedTypesForTesting();
    // Foo และ Bar ถูก union เข้าด้วยกันผ่าน interface I -> เหลือ 1 class
    assertEquals(1, renamed.get("a").size());
  }

  // ---------------------------------------------------------------------
  // 9) Unknown type (parameter ไม่มี JSDoc) -> isInvalidatingType(UNKNOWN_TYPE) == true
  //    -> scheduleRenaming คืน false -> invalidate() -> skipRenaming = true ทั้ง global
  //    แม้จะมี Foo/Bar ที่ไม่เกี่ยวข้องกันอยู่ก็ตาม (property ต้องไม่ถูก rename เลย)
  // ---------------------------------------------------------------------
  public void testUnknownTypeAccess_InvalidatesPropertyGlobally() {
    testSame(
        "function f(x) { return x.a; }\n" + // x ไม่มี @param -> unknown type
        "/** @constructor */ function Foo() {}\n" +
        "Foo.prototype.a = 0;\n" +
        "/** @constructor */ function Bar() {}\n" +
        "Bar.prototype.a = 0;\n" +
        "var foo = new Foo();\n" +
        "foo.a;\n" +
        "var bar = new Bar();\n" +
        "bar.a;\n");

    Multimap renamed = lastPass.getRenamedTypesForTesting();
    // property "a" ถูก invalidate ทั้งหมด (skipRenaming==true) -> ไม่ปรากฏใน map เลย
    assertTrue(renamed.get("a").isEmpty());
  }

  // ---------------------------------------------------------------------
  // 10) ทดสอบ getProperty() โดยตรง (protected, source ให้มาครบ):
  //     branch containsKey(name) == false (สร้างใหม่) และ true (คืนตัวเดิม)
  // ---------------------------------------------------------------------
  public void testGetPropertyCaching() {
    // ต้อง initialize lastPass ก่อนด้วยการรันอย่างน้อยหนึ่งครั้ง
    testSame("");

    Object p1 = lastPass.getProperty("__uniqueTestPropName__");
    Object p2 = lastPass.getProperty("__uniqueTestPropName__");
    // เรียกครั้งที่สองต้องคืน instance เดิม (ไม่สร้างใหม่) -> ครอบคลุม branch
    // "if (!properties.containsKey(name))" ทั้ง true และ false
    assertSame(p1, p2);

    Object p3 = lastPass.getProperty("__anotherUniquePropName__");
    assertNotSame(p1, p3);
  }
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyProgram` | `process()` loop มิสแมทช์ 0 รอบ, `renameProperties()` for-loop 0 รอบ (boundary กรณีไม่มีข้อมูล) |
| `testBracketAccessIsIgnored` | `visit()`: token ไม่ใช่ `GETPROP`/`OBJECTLIT` (branch "ไม่ทำอะไร"), malformed/ไม่ match input |
| `testObjectLiteral_NumericKeySkipped_AndPropertyInvalidated` | `handleObjectLit`: loop ข้าม child ที่ไม่ใช่ `Token.STRING`; `isInvalidatingType` true สำหรับ anonymous object type; `scheduleRenaming` คืน false → `invalidate()` |
| `testSingleType_NoRename` | `Property.addType`: `relatedType==null` branch; `shouldRename()`: equivalence class size ≤1 → false; `renameProperties()` else-branch (`singleTypeProps++`) |
| `testTwoUnrelatedTypes_CreatesTwoEquivalenceClasses` | `shouldRename()` true (>1 class); `renameProperties()` if-branch (`propsRenamed++`); `getRenamedTypesForTesting` non-empty/non-skip path |
| `testSharedPrototype_MergesIntoOneClass_NoRename` | `getTypeWithProperty` loop เดินขึ้น prototype chain, `hasOwnProperty` true; equivalence class รวมกันเป็น 1 |
| `testExternType_IsSkipped_SourceTypeIsNot` | `FindExternProperties.visit`: `isInvalidatingType(type)` false → `addTypeToSkip`; `getInstanceFromPrototype != null` branch; `shouldRename(T type)` ทั้ง true/false; `expandTypesToSkip()` while-loop (≥1 รอบ) |
| `testInterfaceRelatesUnrelatedImplementors` | `recordInterfaces`: `getImplementedInterfaces()` loop, `getTypeWithProperty(p.name,itype)!=null` branch, `constructor.getSuperClassConstructor()` walk, `addType` with `relatedType!=null` (union branch) |
| `testUnknownTypeAccess_InvalidatesPropertyGlobally` | `processProperty`: `isInvalidatingType(type)` true (UNKNOWN_TYPE) → return null; `scheduleRenaming`: `isInvalidatingType(null)` true → `invalidate()`; ยืนยัน invalidation แพร่กระจาย global |
| `testGetPropertyCaching` | `getProperty()`: `!properties.containsKey(name)` ทั้ง true (สร้างใหม่) และ false (คืนของเดิม) |

**สิ่งที่ไม่ได้ครอบคลุม (ตามข้อกำหนดที่ 4 — ไม่กล้าเดา):**
- Branch `isTypeToSkip(top)==true` ภายใน `Property.addType` (เช่น enum type/autobox) — ต้องพึ่ง externs และ semantics ของ enum/autobox ที่ไม่มี source ยืนยันชัดเจนในโจทย์ จึงไม่ทดสอบเพื่อเลี่ยงการเดา
- ค่า exact string ของชื่อ property ที่ถูก rename (เช่น `"Foo$a"`) เนื่องจากขึ้นกับ `JSType.toString()` ที่ไม่มี source ให้ตรวจสอบ จึงใช้ `getRenamedTypesForTesting()` แทนตามที่อธิบายไว้ด้านบน
- `process()` ส่วน `TypeMismatch`/`addInvalidatingType(JSType)` (union vs non-union) — ต้องพึ่งพากลไก type-mismatch warning ของ `TypeValidator` ที่ไม่มี signature ให้ในโจทย์ จึงไม่ยืนยัน behavior แน่ชัด