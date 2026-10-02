# AnalyzePrototypePropertiesTest.java

## หมายเหตุสำคัญก่อนโค้ด (ข้อจำกัดและสมมติฐาน)

- คลาสเป้าหมาย `AnalyzePrototypeProperties` เป็น **package-private** และผูกกับ infrastructure ภายในของ Closure Compiler อย่างมาก (Node, NodeTraversal, Scope, JSModule ฯลฯ) ซึ่งไม่ได้อยู่ใน third-party jar ที่ระบุ แต่เป็นส่วนหนึ่งของ **source/compiled classes เดียวกัน** กับคลาสเป้าหมาย (อยู่ใน classpath โดย implicit เมื่อ build โปรเจกต์) จึงจำเป็นต้องเขียน test class ไว้ใน package เดียวกัน (`com.google.javascript.jscomp`)
- เพื่อสร้าง AST จริงและรัน pass ได้อย่างถูกต้อง ใช้ `CompilerTestCase` ซึ่งเป็น test-utility ที่มาพร้อมกับ source ของ Closure Compiler เอง (ไม่ใช่ third-party lib) — เป็นวิธีมาตรฐานที่ใช้ทดสอบทุก `CompilerPass` ใน codebase นี้ เนื่องจาก `CompilerTestCase` สืบทอดจาก `junit.framework.TestCase` (JUnit3 style) เมธอดทดสอบจึงตั้งชื่อแบบ `testXxx()` โดยไม่มี `@Test` annotation ซึ่ง JUnit4 runner (junit.jar) รองรับการรันอัตโนมัติผ่าน `JUnit38ClassRunner`
- จุดที่ไม่แน่ใจ behavior ที่แท้จริง (เช่น `NodeUtil.isExprAssign`, `CodingConvention.isExported`, การรองรับ `moduleGraph != null`) จะเขียนคอมเมนต์กำกับไว้ชัดเจน และหลีกเลี่ยงการ assert ผลลัพธ์ที่ไม่แน่ใจ

```java
package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;

/**
 * Unit tests for {@link AnalyzePrototypeProperties}.
 *
 * ดูหมายเหตุเรื่อง CompilerTestCase / JUnit3-style method naming ที่ด้านบนของไฟล์นี้
 * (คำอธิบายแนบมาพร้อมคำตอบ)
 */
public class AnalyzePrototypePropertiesTest extends CompilerTestCase {

  private AnalyzePrototypeProperties lastPass;
  private boolean canModifyExterns = false;
  private boolean anchorUnusedVars = false;

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        // moduleGraph = null เสมอในชุดทดสอบนี้ -> ไม่ครอบคลุม branch
        // "moduleGraph != null" ของ constructor เนื่องจากต้องสร้าง
        // JSModuleGraph จริงซึ่งมี API ที่ไม่ได้แสดงในซอร์สที่ให้มา
        lastPass = new AnalyzePrototypeProperties(
            compiler, null, canModifyExterns, anchorUnusedVars);
        lastPass.process(externs, root);
      }
    };
  }

  private AnalyzePrototypeProperties.NameInfo getNameInfo(String name) {
    for (AnalyzePrototypeProperties.NameInfo info : lastPass.getAllNameInfo()) {
      if (name.equals(info.name)) {
        return info;
      }
    }
    return null;
  }

  private void assertReferenced(String name) {
    AnalyzePrototypeProperties.NameInfo info = getNameInfo(name);
    assertNotNull("Expected NameInfo for '" + name + "' to exist", info);
    assertTrue("Expected '" + name + "' to be referenced", info.isReferenced());
  }

  private void assertNotReferenced(String name) {
    AnalyzePrototypeProperties.NameInfo info = getNameInfo(name);
    assertNotNull("Expected NameInfo for '" + name + "' to exist", info);
    assertFalse("Expected '" + name + "' to be NOT referenced",
        info.isReferenced());
  }

  // ---------------------------------------------------------------------
  // Boundary: empty program + IMPLICITLY_USED_PROPERTIES / constructor
  // ---------------------------------------------------------------------

  public void testEmptyProgram_ImplicitPropertiesAreReferenced() {
    testSame("");
    // length/toString/valueOf ถูก connect จาก externNode ซึ่ง markReference(null)
    // ไว้แล้วใน constructor -> ต้องถูก mark referenced เสมอ ไม่ว่า input จะว่างเปล่า
    assertReferenced("length");
    assertReferenced("toString");
    assertReferenced("valueOf");
  }

  // ---------------------------------------------------------------------
  // Global function declaration (named function statement)
  // ---------------------------------------------------------------------

  public void testNamedGlobalFunctionDeclarationAndCall_IsReferenced() {
    testSame("function foo() {} foo();");
    assertReferenced("foo");
  }

  public void testNamedGlobalFunctionDeclarationNeverCalled_IsNotReferenced() {
    testSame("function foo() {}");
    assertNotReferenced("foo");
  }

  // ---------------------------------------------------------------------
  // Global function declaration (var = function expression)
  // ---------------------------------------------------------------------

  public void testVarGlobalFunctionDeclarationAndCall_IsReferenced() {
    testSame("var foo = function() {}; foo();");
    assertReferenced("foo");
  }

  public void testVarGlobalFunctionDeclarationNeverCalled_IsNotReferenced() {
    testSame("var foo = function() {};");
    assertNotReferenced("foo");
  }

  // ---------------------------------------------------------------------
  // anchorUnusedVars = true -> ทุก global function ถูก mark referenced เสมอ
  // (ไม่พึ่งพา CodingConvention.isExported เพราะเป็น OR ที่ short-circuit
  //  ด้วย anchorUnusedVars=true อยู่แล้ว)
  // ---------------------------------------------------------------------

  public void testAnchorUnusedVars_ForcesGlobalFunctionReferenced() {
    anchorUnusedVars = true;
    testSame("function foo() {}");
    assertReferenced("foo");
  }

  // ---------------------------------------------------------------------
  // Prototype property assignment: Foo.prototype.bar = function() {...}
  // (isPrototypePropertyAssign = true, processPrototypeParent GETPROP-case)
  // ---------------------------------------------------------------------

  public void testPrototypePropertyMethodCall_IsReferenced() {
    testSame(
        "function A() {} " +
        "A.prototype.getFoo = function() { return 3; };" +
        "var x = new A(); x.getFoo();");
    assertReferenced("getFoo");
  }

  public void testPrototypePropertyMethodNeverCalled_IsNotReferenced() {
    testSame(
        "function A() {} " +
        "A.prototype.getFoo = function() { return 3; };");
    assertNotReferenced("getFoo");
  }

  // ---------------------------------------------------------------------
  // Prototype property assigned to non-function value:
  // ทดสอบว่า isPrototypePropertyAssign คืน true แม้ RHS ไม่ใช่ function
  // (ตามคอมเมนต์ "Process prototype assignments to non-functions")
  // ---------------------------------------------------------------------

  public void testPrototypePropertyAssignedNonFunctionValue_CreatesNameInfo() {
    testSame("function A() {} A.prototype.bar = 5;");
    assertNotNull(
        "Expected NameInfo created for non-function prototype "
            + "property assignment 'bar'",
        getNameInfo("bar"));
  }

  // ---------------------------------------------------------------------
  // Prototype property via object literal: Foo.prototype = {bar: fn}
  // (processPrototypeParent ASSIGN-case)
  // ---------------------------------------------------------------------

  public void testPrototypeLiteralProperty_IsReferenced() {
    testSame(
        "function A() {} " +
        "A.prototype = { getBar: function() { return 4; } };" +
        "var x = new A(); x.getBar();");
    assertReferenced("getBar");
  }

  // ---------------------------------------------------------------------
  // Object literal (ไม่ใช่ prototype assign) -> ทุก key ที่ไม่ quote นับเป็น use
  // ---------------------------------------------------------------------

  public void testObjectLiteralProperties_CountAsUse() {
    testSame("var x = {a: 1, b: 2}; x.a; x.b;");
    assertReferenced("a");
    assertReferenced("b");
  }

  public void testQuotedObjectLiteralProperty_IsNotCountedAsUse() {
    // propNameNode.isQuotedString() == true -> ข้าม addSymbolUse
    // ไม่มีการอ้างอิงอื่นถึง 'a' จึงไม่ควรมี NameInfo ถูกสร้างขึ้นเลย
    testSame("var x = {'a': 1};");
    assertNull(getNameInfo("a"));
  }

  // ---------------------------------------------------------------------
  // readClosureVariables: for-loop เดิน stack เพื่อหา scope ที่ตรงกันแล้ว break
  //
  // กรณีที่ 1: ตัวแปรถูกประกาศ "ในฟังก์ชันของ getFoo เอง" -> loop จะ break
  // ที่ context ของฟังก์ชัน getFoo (ซึ่งเป็น anonymousNode context ไม่ใช่
  // context ของ "getFoo" property) ก่อนจะไล่ลงไปถึง context ของ "getFoo"
  // -> "getFoo".readClosureVariables ต้องยังเป็น false
  // ---------------------------------------------------------------------

  public void testClosureVariableDeclaredInSameFunction_DoesNotMarkProperty() {
    testSame(
        "function A() {} " +
        "A.prototype.getFoo = function() {" +
        "  var localVar = 1;" +
        "  return function() { return localVar; };" +
        "};");
    AnalyzePrototypeProperties.NameInfo info = getNameInfo("getFoo");
    assertNotNull(info);
    assertFalse(info.readsClosureVariables());
  }

  // กรณีที่ 2: ตัวแปรถูกประกาศ "นอกฟังก์ชันของ getFoo" (ใน IIFE ที่ครอบอยู่)
  // และถูกอ่านจาก closure ที่ซ้อนอยู่ภายใน getFoo อีกชั้น -> loop จะเดินผ่าน
  // context ของ "getFoo" (ซึ่ง scope เป็น null เสมอ ไม่ตรงกับ scope ของตัวแปร)
  // ก่อนจะ break ที่ context ของ IIFE -> "getFoo".readClosureVariables = true
  // ---------------------------------------------------------------------

  public void testClosureVariableDeclaredInEnclosingScope_MarksProperty() {
    testSame(
        "function A() {} " +
        "(function() {" +
        "  var outerVar = 1;" +
        "  A.prototype.getFoo = function() {" +
        "    return function() { return outerVar; };" +
        "  };" +
        "})();");
    AnalyzePrototypeProperties.NameInfo info = getNameInfo("getFoo");
    assertNotNull(info);
    assertTrue(info.readsClosureVariables());
  }

  // ---------------------------------------------------------------------
  // Extern properties: canModifyExterns == false -> ProcessExternProperties
  // เดิน extern root และ connect externNode -> ทุก GETPROP ที่พบ
  // ---------------------------------------------------------------------

  public void testExternProperty_ReferencedWhenCannotModifyExterns() {
    canModifyExterns = false;
    test("var e; e.externProp;", "var x = 1;", "var x = 1;");
    assertReferenced("externProp");
  }

  public void testExternProperty_NotProcessedWhenCanModifyExterns() {
    canModifyExterns = true;
    test("var e; e.externProp;", "var x = 1;", "var x = 1;");
    // เมื่อ canModifyExterns == true, ProcessExternProperties ไม่ถูกรันเลย
    // ('!canModifyExterns' == false) จึงไม่มี NameInfo ของ 'externProp' ถูกสร้าง
    assertNull(getNameInfo("externProp"));
  }

  // ---------------------------------------------------------------------
  // isPrototypePropertyAssign: assign.getParent().isExprResult() == false
  // (ห่อ assignment ไว้ใน var declaration) -> ไม่ assert ผลลัพธ์ NameInfo
  // ที่แน่นอน เพราะพึ่งพา NodeUtil.isExprAssign ซึ่งไม่ได้แสดงในซอร์สที่ให้มา
  // ตรวจสอบเพียงว่า pass ทำงานได้โดยไม่มี exception
  // ---------------------------------------------------------------------

  public void testPrototypeAssignNotAtExprResult_DoesNotThrow() {
    testSame("function A() {} var y = (A.prototype.bar = function() {});");
  }

  // ---------------------------------------------------------------------
  // getAllNameInfo(): รวมทั้ง propertyNameInfo และ varNameInfo
  // ---------------------------------------------------------------------

  public void testGetAllNameInfo_IncludesBothPropertiesAndVars() {
    testSame(
        "function foo() {} " +
        "function A() {} " +
        "A.prototype.bar = function() {};");
    assertNotNull(getNameInfo("foo")); // VAR
    assertNotNull(getNameInfo("A"));   // VAR
    assertNotNull(getNameInfo("bar")); // PROPERTY
  }
}
```

## ตารางสรุปการครอบคลุม (Branch/Condition Coverage)

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| `testEmptyProgram_ImplicitPropertiesAreReferenced` | Constructor: `IMPLICITLY_USED_PROPERTIES` loop, `moduleGraph == null` → `connect(externNode, null, ...)`, boundary input ว่างเปล่า |
| `testNamedGlobalFunctionDeclarationAndCall_IsReferenced` | `isGlobalFunctionDeclaration` (named function), `parent.isName()==false` branch, `processGlobalFunctionDeclaration` false ที่ call-site → `addGlobalUseOfSymbol` |
| `testNamedGlobalFunctionDeclarationNeverCalled_IsNotReferenced` | เช็คว่าไม่มี edge เข้า NameInfo เมื่อไม่ถูกเรียกใช้ |
| `testVarGlobalFunctionDeclarationAndCall_IsReferenced` | `isGlobalFunctionDeclaration` (`n.isFunction() && n.getParent().isName()`), `parent.isName()==true` branch |
| `testVarGlobalFunctionDeclarationNeverCalled_IsNotReferenced` | ไม่มี `addGlobalUseOfSymbol` เมื่อไม่ exported/anchorUnusedVars |
| `testAnchorUnusedVars_ForcesGlobalFunctionReferenced` | `anchorUnusedVars == true` branch ใน `processGlobalFunctionDeclaration` |
| `testPrototypePropertyMethodCall_IsReferenced` | `isPrototypePropertyAssign` true, `processPrototypeParent` (`Token.GETPROP` case), `addSymbolUse` |
| `testPrototypePropertyMethodNeverCalled_IsNotReferenced` | Declaration ถูกบันทึกแต่ไม่ referenced |
| `testPrototypePropertyAssignedNonFunctionValue_CreatesNameInfo` | `isPrototypePropertyAssign` true สำหรับ RHS ที่ไม่ใช่ function |
| `testPrototypeLiteralProperty_IsReferenced` | `processPrototypeParent` (`Token.ASSIGN` case, `map.isObjectLit()`), loop สร้าง `LiteralProperty` |
| `testObjectLiteralProperties_CountAsUse` | `n.isObjectLit()` true, ไม่ใช่ prototype-assign object literal, `!propNameNode.isQuotedString()` branch |
| `testQuotedObjectLiteralProperty_IsNotCountedAsUse` | `propNameNode.isQuotedString()==true` branch (skip) |
| `testClosureVariableDeclaredInSameFunction_DoesNotMarkProperty` | `var.getScope() != t.getScope()` loop, break ก่อนถึง context ของ property |
| `testClosureVariableDeclaredInEnclosingScope_MarksProperty` | loop เดินผ่าน context ของ property จนตั้งค่า `readClosureVariables=true` |
| `testExternProperty_ReferencedWhenCannotModifyExterns` | `!canModifyExterns` true → `ProcessExternProperties` traversal |
| `testExternProperty_NotProcessedWhenCanModifyExterns` | `!canModifyExterns` false → ข้าม extern traversal |
| `testPrototypeAssignNotAtExprResult_DoesNotThrow` | `assign.getParent().isExprResult()==false` branch (isPrototypePropertyAssign false) |
| `testGetAllNameInfo_IncludesBothPropertiesAndVars` | `getAllNameInfo()` รวม `propertyNameInfo` + `varNameInfo` |

**Branch ที่ไม่ได้ครอบคลุม (ระบุไว้อย่างชัดเจน):** เส้นทาง `moduleGraph != null` ใน constructor และ `PropagateReferences` ที่ใช้ `moduleGraph.dependsOn(...)` เนื่องจากต้องสร้าง `JSModuleGraph`/`JSModule` จริงซึ่ง API ไม่ได้แสดงในซอร์สที่ให้มา, และ branch ของ `CodingConvention.isExported(propName)` เนื่องจากพฤติกรรมขึ้นกับ implementation ของ `CodingConvention` ที่ไม่ได้แสดงในซอร์สนี้