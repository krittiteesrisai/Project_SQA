# InlineObjectLiteralsTest — JUnit 4 Test Suite

## หมายเหตุสำคัญก่อนเริ่ม (ข้อจำกัดและสมมติฐาน)

- `InlineObjectLiterals` เป็น package-private class ที่ทำงานผ่าน AST จริงของ Closure Compiler (`Node`, `Scope`, `Var`, `ReferenceCollectingCallback`) การจะสร้าง Reference/Scope ปลอมด้วยมือเพื่อยิงเข้า private method นั้นแทบเป็นไปไม่ได้และมีความเสี่ยงสูงที่จะ "เดา" internal state ผิด ดังนั้นชุดทดสอบนี้จึงทดสอบผ่าน **public entry point** คือ `process(Node externs, Node root)` โดยใช้ `com.google.javascript.jscomp.Compiler` (คลาสหลักของโปรเจกต์เดียวกัน ไม่ใช่ third-party jar) เพื่อ parse source JS จริงแล้วปล่อยให้ pass ทำงานบน AST จริง — วิธีนี้ตรงกับแนวทางที่ผู้พัฒนา Closure Compiler ใช้ทดสอบ pass ประเภทนี้
- Test class ต้องอยู่ใน package `com.google.javascript.jscomp` เพื่อเรียก constructor แบบ package-private ของ `InlineObjectLiterals` ได้
- **สมมติฐานเรื่อง API สนับสนุน (ไม่ใช่ behavior ของ SUT)**: ใช้ `JSSourceFile.fromCode(...)`, `compiler.init(...)`, `compiler.parse()`, `compiler.getRoot()`, `compiler.toSource()` ซึ่งเป็น infrastructure ของ Closure Compiler เอง (ไม่ใช่พฤติกรรมของคลาสเป้าหมาย) — คอมเมนต์ไว้ในโค้ดตามจุดที่ใช้
- บาง branch (เช่น `var.isExtern()`, `compiler.getCodingConvention().isExported(...)`) ขึ้นกับพฤติกรรม default ของ `CodingConvention`/externs traversal ที่ไม่ชัดเจนพอจะยืนยันได้จากซอร์สที่ให้มา — **จึงไม่เขียนเทสยืนยันผลลัพธ์ที่แน่นอนของสองจุดนี้ เพื่อไม่เดา behavior** (คอมเมนต์กำกับไว้ในโค้ด)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link InlineObjectLiterals} (Defects4J Closure-53b).
 *
 * หมายเหตุ: เนื่องจาก InlineObjectLiterals ทำงานผ่านโครงสร้าง AST/Scope จริงของ
 * Closure Compiler เทสนี้จึงใช้ com.google.javascript.jscomp.Compiler
 * (คลาสหลักในโปรเจกต์เดียวกัน) เพื่อ parse source จริงแล้วรัน pass ผ่าน
 * public method process(Node externs, Node root)
 */
public class InlineObjectLiteralsTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
  }

  /**
   * Helper: parse JS source, สร้าง unique-id supplier แบบง่าย (ไม่พึ่งพา
   * internal API ของ Compiler เพื่อลดความเสี่ยงเรื่อง API ที่ไม่แน่นอน),
   * รัน InlineObjectLiterals บน AST แล้วคืน source ที่ได้
   */
  private String compileAndInline(String js) {
    CompilerOptions options = new CompilerOptions();

    // สมมติฐาน API สนับสนุน: JSSourceFile.fromCode / compiler.init / parse /
    // getRoot เป็น infra มาตรฐานของ Closure Compiler ยุคเดียวกับ Closure-53
    JSSourceFile[] externsFiles = new JSSourceFile[0];
    JSSourceFile[] inputs = new JSSourceFile[] {
        JSSourceFile.fromCode("input.js", js)
    };

    compiler.init(externsFiles, inputs, options);
    compiler.parse();

    Node root = compiler.getRoot();
    Node externsRoot = root.getFirstChild();
    Node jsRoot = root.getLastChild();

    // Supplier แบบง่าย ๆ ไม่พึ่ง internal method ของ Compiler
    Supplier<String> idSupplier = new Supplier<String>() {
      private int counter = 0;
      @Override
      public String get() {
        return String.valueOf(counter++);
      }
    };

    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, idSupplier);
    pass.process(externsRoot, jsRoot);

    return compiler.toSource();
  }

  // ---------------------------------------------------------------------
  // 1. ตรวจ public constant พื้นฐาน
  // ---------------------------------------------------------------------
  @Test
  public void testVarPrefixConstant() {
    assertEquals("JSCompiler_object_inline_", InlineObjectLiterals.VAR_PREFIX);
  }

  // ---------------------------------------------------------------------
  // 2. Positive case: object literal ที่ถูก access เฉพาะผ่าน GETPROP ธรรมดา
  //    (ไม่ถูกใช้เต็มรูปแบบ) -> ต้องถูก inline / แตกเป็นตัวแปรย่อย
  //    ครอบคลุม: isInlinableObject -> ret = true (ผ่านทุกเงื่อนไข),
  //    splitObject -> defined == true (VAR + isWellDefined)
  // ---------------------------------------------------------------------
  @Test
  public void testSimpleObjectLiteralGetPropAccessIsInlined() {
    String js = "function f(){ var x = {a:1, b:2}; return x.a + x.b; }";
    String output = compileAndInline(js);

    assertFalse("object literal ต้นฉบับควรถูกแตกออก ไม่เหลือ {a:1,b:2}",
        output.contains("{a:1,b:2}"));
    assertTrue("ต้องมีตัวแปรที่ถูกสร้างด้วย VAR_PREFIX",
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // ---------------------------------------------------------------------
  // 3. Negative case: ตัวแปรถูกอ้างอิงแบบ "เต็มรูป" (เช่น เป็น argument ของฟังก์ชัน)
  //    -> isVarOrAssignExprLhs(name) == false -> return false ทันที
  //    (ไม่ถูก inline เลย)
  // ---------------------------------------------------------------------
  @Test
  public void testFullReferenceAsFunctionArgumentBlocksInlining() {
    String js = "function f(){ var x = {a:1}; g(x); }";
    String output = compileAndInline(js);

    assertTrue("การอ้างอิงแบบเต็มรูปต้องทำให้ object literal ยังคงอยู่",
        output.contains("{a:1}"));
    assertFalse("ต้องไม่มีการสร้างตัวแปร inline เมื่อมีการอ้างอิงแบบเต็มรูป",
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // ---------------------------------------------------------------------
  // 4. Negative case: x.foo() ที่ x ถูกใช้เป็น call target (this-value)
  //    -> gramps.getType()==CALL && gramps.getFirstChild()==parent -> return false
  // ---------------------------------------------------------------------
  @Test
  public void testGetPropAsCallTargetBlocksInlining() {
    String js = "function f(){ var x = {foo:function(){return 1;}}; x.foo(); }";
    String output = compileAndInline(js);

    assertFalse("x.foo() (call ที่ x เป็น this) ต้องไม่ถูก inline",
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // ---------------------------------------------------------------------
  // 5. Positive case: GETPROP แบบธรรมดา (ไม่ใช่ call target) -> continue
  //    (ยังคงเป็นไปได้ที่จะ inline ได้ต่อไป)
  // ---------------------------------------------------------------------
  @Test
  public void testSimpleGetPropAccessDoesNotBlockInlining() {
    String js = "function f(){ var x = {a:1}; var y = x.a; return y; }";
    String output = compileAndInline(js);

    assertFalse("x.a แบบธรรมดาไม่ควรบล็อกการ inline",
        output.contains("{a:1}"));
    assertTrue(output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // ---------------------------------------------------------------------
  // 6. Negative case: self-referential assignment เช่น x = {b: x.a}
  //    -> ตรวจพบ refNode == childVal -> return false
  // ---------------------------------------------------------------------
  @Test
  public void testSelfReferentialAssignmentBlocksInlining() {
    String js = "function f(){ var x = {a:1}; x = {b: x.a}; return x.b; }";
    String output = compileAndInline(js);

    assertFalse("self-referential assignment ไม่ควรถูก inline (ต้องไม่มี VAR_PREFIX)",
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // ---------------------------------------------------------------------
  // 7. Negative case: ES5 getter/setter ในอ็อบเจ็กต์ -> return false ทันที
  //    ครอบคลุม branch child.getType()==GET/SET
  // ---------------------------------------------------------------------
  @Test
  public void testEs5GetterBlocksInlining() {
    String js = "function f(){ var x = {get a(){ return 1; }}; return x.a; }";
    String output = compileAndInline(js);

    assertFalse("ES5 getter ไม่รองรับการ inline",
        output.contains(InlineObjectLiterals.VAR_PREFIX));
    assertTrue(output.contains("get a"));
  }

  // ---------------------------------------------------------------------
  // 8. Negative case: มีการ assign ค่าที่ไม่ใช่ object literal (เช่น number)
  //    -> val.getType() != OBJECTLIT -> return false
  // ---------------------------------------------------------------------
  @Test
  public void testNonObjectLiteralAssignmentBlocksInlining() {
    String js = "function f(){ var x = {a:1}; x = 5; return x; }";
    String output = compileAndInline(js);

    assertFalse("การ assign ค่าที่ไม่ใช่ object literal ต้องทำให้ทั้งหมดไม่ถูก inline",
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // ---------------------------------------------------------------------
  // 9. Boundary case: var ที่ไม่มีค่าเริ่มต้น (val==null -> continue) แล้วค่อย
  //    assign เป็น object literal ในบรรทัดถัดไป -> ยัง inlinable ได้
  //    ครอบคลุม branch "val == null" (declaration ไม่มีค่า) และ
  //    splitObject -> defined == false (เพราะ init.getParent() ไม่ใช่ VAR)
  // ---------------------------------------------------------------------
  @Test
  public void testVarWithNoInitializerThenObjectLiteralAssignment() {
    String js = "function f(){ var x; x = {a:1}; return x.a; }";
    String output = compileAndInline(js);

    assertTrue("ต้องสร้างตัวแปรย่อยแม้ declaration ไม่มีค่าเริ่มต้น",
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // ---------------------------------------------------------------------
  // 10. Boundary case: object literal ที่ไม่มี property เลย ({}) และไม่มีการ
  //     อ้างอิงอื่นใด -> varmap ว่าง, defined==true -> ทั้ง var ถูกลบออกทั้งหมด
  //     (loop สร้างตัวแปรไม่ทำงานเลยสักครั้ง)
  // ---------------------------------------------------------------------
  @Test
  public void testEmptyObjectLiteralIsRemoved() {
    String js = "function f(){ var x = {}; return 1; }";
    String output = compileAndInline(js);

    assertFalse("var x ที่เป็น {} และไม่ได้ใช้งานเลยควรถูกลบทั้งหมด",
        output.contains("var x"));
    assertFalse(output.contains("{}"));
  }

  // ---------------------------------------------------------------------
  // 11. Global variable ต้องไม่ถูก inline เลย (var.isGlobal() -> true ->
  //     isVarInlineForbidden -> continue ใน afterExitScope)
  // ---------------------------------------------------------------------
  @Test
  public void testGlobalVariableIsNeverInlined() {
    String js = "var x = {a:1}; x.a;";
    String output = compileAndInline(js);

    assertFalse("global variable ต้องไม่ถูก inline ตาม comment ในซอร์ส",
        output.contains(InlineObjectLiterals.VAR_PREFIX));
    assertTrue(output.contains("{a:1}"));
  }

  // ---------------------------------------------------------------------
  // 12. computeVarList: หลาย assignment ที่มี key ต่างกัน + key ซ้ำ
  //     -> ครอบคลุม branch "varmap.containsKey(varname) -> continue" (dedup)
  //     และ branch การอ่าน key จาก getprop reference
  // ---------------------------------------------------------------------
  @Test
  public void testMultipleAssignmentsMergeKeysWithoutDuplication() {
    String js = "function f(){ var x = {a:1}; x = {a:2, b:3}; "
        + "return x.a + x.b; }";
    String output = compileAndInline(js);

    assertFalse(output.contains("{a:1}"));
    assertFalse(output.contains("{a:2,b:3}"));
    assertTrue(output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // ---------------------------------------------------------------------
  // 13. RENAME_PROPERTY_FUNCTION_NAME ต้องไม่ถูก inline
  //     สมมติฐาน: RenameProperties.RENAME_PROPERTY_FUNCTION_NAME เป็น
  //     public/พร้อมใช้งานในแพ็กเกจเดียวกัน และมีค่าคงที่แน่นอน (ไม่ทราบค่าจริง
  //     100% จากซอร์สที่ให้มา จึงอ้างอิงผ่าน constant แทนการเดาสตริง)
  // ---------------------------------------------------------------------
  @Test
  public void testRenamePropertyFunctionNameIsNeverInlined() {
    String varName = RenameProperties.RENAME_PROPERTY_FUNCTION_NAME;
    String js = "function f(){ var " + varName + " = {a:1}; return "
        + varName + ".a; }";
    String output = compileAndInline(js);

    assertFalse("ตัวแปรชื่อ RENAME_PROPERTY_FUNCTION_NAME ต้องไม่ถูก inline",
        output.contains(InlineObjectLiterals.VAR_PREFIX));
  }

  // NOTE (ไม่เขียนเทสยืนยันผลเนื่องจากไม่แน่ใจ behavior จาก default
  // CodingConvention / extern-traversal ที่ไม่ได้ระบุไว้ชัดเจนในซอร์สที่ให้มา):
  //   - branch: compiler.getCodingConvention().isExported(var.name)
  //   - branch: var.isExtern()
  // การเดาผลลัพธ์ของสอง branch นี้อาจไม่ตรงกับพฤติกรรมจริงของ default
  // CodingConvention จึงงดเขียนเทสยืนยัน assertion ที่แน่นอนสำหรับกรณีนี้
}
```

## สรุปตาราง Branch/Condition Coverage

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testVarPrefixConstant` | ค่าคงที่ `VAR_PREFIX` (sanity check) |
| `testSimpleObjectLiteralGetPropAccessIsInlined` | `isInlinableObject` → `ret = true` (ผ่านทุกเงื่อนไข), `splitObject` → `defined == true` |
| `testFullReferenceAsFunctionArgumentBlocksInlining` | `isVarOrAssignExprLhs(name) == false` → `return false` |
| `testGetPropAsCallTargetBlocksInlining` | `gramps.getType()==CALL && gramps.getFirstChild()==parent` → `return false` |
| `testSimpleGetPropAccessDoesNotBlockInlining` | GETPROP ธรรมดา (ไม่ใช่ call target) → `continue` (ไม่บล็อก) |
| `testSelfReferentialAssignmentBlocksInlining` | self-referential check: `refNode == childVal` → `return false` |
| `testEs5GetterBlocksInlining` | `child.getType() == Token.GET/SET` → `return false` |
| `testNonObjectLiteralAssignmentBlocksInlining` | `val.getType() != Token.OBJECTLIT` → `return false` |
| `testVarWithNoInitializerThenObjectLiteralAssignment` | `val == null` → `continue`, และ `splitObject` → `defined == false` |
| `testEmptyObjectLiteralIsRemoved` | `varmap` ว่าง (loop สร้างตัวแปร 0 รอบ), `defined == true` → ลบ `vnode` ทั้งหมด |
| `testGlobalVariableIsNeverInlined` | `isVarInlineForbidden` → `var.isGlobal() == true` → `continue` |
| `testMultipleAssignmentsMergeKeysWithoutDuplication` | `computeVarList` → `varmap.containsKey(varname)` (dedup) ทั้งกรณี lvalue และ getprop-reference |
| `testRenamePropertyFunctionNameIsNeverInlined` | `isVarInlineForbidden` → `RENAME_PROPERTY_FUNCTION_NAME.equals(var.name)` → `continue` |

**Branch ที่ไม่ได้ทดสอบยืนยันผลลัพธ์แน่นอน (มีคอมเมนต์กำกับในโค้ด):**
- `compiler.getCodingConvention().isExported(var.name)`
- `var.isExtern()`

เนื่องจากพฤติกรรม default ของ `CodingConvention`/extern-traversal ไม่ได้ระบุไว้ชัดเจนในซอร์สโค้ดที่ให้มา การเขียน assertion ที่แน่นอนจะเป็นการเดา behavior ซึ่งขัดกับข้อกำหนดที่ 4