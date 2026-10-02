# หมายเหตุสำคัญก่อนเริ่ม

`InlineObjectLiterals` และ inner class `InliningBehavior` เป็น **package-private / private** และ logic ทั้งหมดถูกขับเคลื่อนผ่าน `ReferenceCollectingCallback` ซึ่งต้องพึ่งพา AST จริงจาก Rhino parser (`Node`, `Scope`, `Var` ฯลฯ) การ mock คลาสเหล่านี้แทบเป็นไปไม่ได้ในทางปฏิบัติ

วิธีทดสอบที่ Closure Compiler ใช้จริงกับ `CompilerPass` ทุกตัว (และเป็นวิธีเดียวที่จะเข้าถึง private logic ได้) คือการรัน pass ผ่าน **`CompilerTestCase`** (อยู่ใน package เดียวกัน คือ `com.google.javascript.jscomp`, extends `junit.framework.TestCase` ซึ่งอยู่ใน `junit.jar` ที่อนุญาต และ JUnit4 runner รองรับ TestCase แบบ backward-compatible โดยอัตโนมัติ) แล้วเปรียบเทียบ source code ก่อน/หลัง transform

**ข้อสมมติที่ต้องระบุตามข้อกำหนด #4 (ไม่มีอยู่ในซอร์สที่ให้มา แต่จำเป็นต้องอ้างอิงเพื่อเขียนเทสได้):**
- `CompilerTestCase` มี `test(js, expected)`, `testSame(js)`, `getProcessor(Compiler)`, `getNumRepetitions()` ตาม convention มาตรฐานของ Closure Compiler
- `compiler.getUniqueNameIdSupplier()` เริ่มนับจาก `0` และรีเซ็ตใหม่ทุก test (เพราะ `setUp()` สร้าง `Compiler` ใหม่ทุกครั้ง)
- `Scope.getRootNode()` ของ function scope คืน FUNCTION node, `.getLastChild()` คือ BLOCK, `.getFirstChild()` คือ statement แรกในฟังก์ชัน

จุดใดที่ยังไม่มั่นใจ 100% จะคอมเมนต์กำกับไว้ในโค้ด

```java
package com.google.javascript.jscomp;

/**
 * Unit test สำหรับ InlineObjectLiterals (Defects4J Closure-5b)
 *
 * เนื่องจากคลาสเป้าหมายเป็น package-private และ logic หลักอยู่ใน private inner
 * class InliningBehavior ซึ่งไม่มี public API ให้เรียกตรง ๆ การทดสอบจึงต้องรัน
 * ผ่าน infrastructure มาตรฐานของ Closure Compiler คือ CompilerTestCase
 * (ประกาศ testXxx() แบบ JUnit3 style ซึ่ง JUnit4 runner รองรับ backward
 * compatibility โดยอัตโนมัติผ่าน junit.jar)
 */
public class InlineObjectLiteralsTest extends CompilerTestCase {

  public InlineObjectLiteralsTest() {
    super("");
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new InlineObjectLiterals(
        compiler, compiler.getUniqueNameIdSupplier());
  }

  @Override
  protected int getNumRepetitions() {
    // Pass นี้ไม่ idempotent (ชื่อ tmp var เปลี่ยนทุกครั้งที่รัน) จึงต้องรันครั้งเดียว
    return 1;
  }

  // ---------------------------------------------------------------
  // 1) isVarInlineForbidden(): var.isGlobal() == true -> ห้าม inline เสมอ
  //    ("Additionally, exclude global variables for now")
  // ---------------------------------------------------------------
  public void testGlobalVariableNeverInlined() {
    testSame("var x = {a:1, b:2}; x.a; x.b;");
  }

  // ---------------------------------------------------------------
  // 2) Local var, well-defined (defined = isWellDefined() && init.getParent().isVar() == true)
  //    ครอบคลุม: isInlinableObject ret=true ผ่าน GETPROP ที่ validProperties, 
  //    splitObject กิ่ง defined=true, fillInitialValues, removeChild(vnode)
  // ---------------------------------------------------------------
  public void testLocalVariableBasicSplit() {
    test(
        "function f() { var x = {a:1, b:2}; return x.a + x.b; }",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0 = 1;" +
        "  var JSCompiler_object_inline_b_1 = 2;" +
        "  return JSCompiler_object_inline_a_0 + JSCompiler_object_inline_b_1;" +
        "}");
  }

  // ---------------------------------------------------------------
  // 3) Full/direct reference (x ทั้งตัว) -> isInlinableObject คืน false
  //    เพราะ !isVarOrAssignExprLhs(name) เมื่อ x ถูกส่งเป็น argument
  // ---------------------------------------------------------------
  public void testFullReferenceNotInlined() {
    testSame("function f() { var x = {a:1, b:2}; foo(x); }");
  }

  // ---------------------------------------------------------------
  // 4) x.fn() ที่ gramps.isCall() && gramps.getFirstChild()==parent
  //    -> return false ทันที (อาจใช้ x เป็น 'this')
  // ---------------------------------------------------------------
  public void testMethodCallNotInlined() {
    testSame(
        "function f() {" +
        "  var x = {fn: function() { return this; }};" +
        "  x.fn();" +
        "}");
  }

  // ---------------------------------------------------------------
  // 5) delete x.a -> propName ไม่อยู่ validProperties ตอนตรวจ
  //    และ NodeUtil.isVarOrSimpleAssignLhs(parent,gramps) == false -> return false
  // ---------------------------------------------------------------
  public void testDeletePropertyNotInlined() {
    testSame("function f() { var x = {a:1}; delete x.a; }");
  }

  // ---------------------------------------------------------------
  // 6) val == null (var x; ไม่มีค่า) -> continue
  //    ต่อด้วย x.a = 1 (GETPROP เป็น simple-assign-lhs -> validProperties.add)
  //    แต่ไม่มี object literal assignment เต็มรูปแบบ -> ret ไม่เคยเป็น true
  // ---------------------------------------------------------------
  public void testVarNoValueThenPropertyAssignNotInlined() {
    testSame("function f() { var x; x.a = 1; }");
  }

  // ---------------------------------------------------------------
  // 7) val.isObjectLit() == false (x = 5) -> return false
  // ---------------------------------------------------------------
  public void testNonObjectLiteralAssignmentNotInlined() {
    testSame("function f() { var x = {a:1}; x = 5; }");
  }

  // ---------------------------------------------------------------
  // 8) child.isGetterDef() -> return false (ES5 getter ไม่รองรับ)
  // ---------------------------------------------------------------
  public void testGetterNotInlined() {
    testSame("function f() { var x = {get a() { return 1; }}; }");
  }

  // ---------------------------------------------------------------
  // 9) child.isSetterDef() -> return false (ES5 setter ไม่รองรับ)
  // ---------------------------------------------------------------
  public void testSetterNotInlined() {
    testSame("function f() { var x = {set a(v) {}}; }");
  }

  // ---------------------------------------------------------------
  // 10) Self-referential assignment: x = {b: x.a} -> return false
  //     (childVal เท่ากับ refNode ของ reference อื่นใน object เดียวกัน)
  // ---------------------------------------------------------------
  public void testSelfReferentialAssignmentNotInlined() {
    testSame("function f() { var x = {a: 1}; x = {b: x.a}; }");
  }

  // ---------------------------------------------------------------
  // 11) "blind spot": propName ไม่เคยอยู่ใน validProperties (x.b ที่ literal
  //     ไม่มี key 'b') และไม่ใช่ var/simple-assign-lhs -> return false
  //     (ตามคอมเมนต์ในซอร์ส: "bailing out if we see a reference to a
  //     property that isn't defined on the object literal")
  // ---------------------------------------------------------------
  public void testUndefinedPropertyAccessNotInlined() {
    testSame("function f() { var x = {a:1}; var y = x.b; }");
  }

  // ---------------------------------------------------------------
  // 12) RENAME_PROPERTY_FUNCTION_NAME -> ห้าม inline เสมอ (isVarInlineForbidden)
  // ---------------------------------------------------------------
  public void testRenamePropertyFunctionNameNotInlined() {
    testSame(
        "function f() {" +
        "  var " + RenameProperties.RENAME_PROPERTY_FUNCTION_NAME +
        " = {a:1, b:2};" +
        "}");
  }

  // ---------------------------------------------------------------
  // 13) computeVarList(): ref.isLvalue()==false, isInitializingDeclaration()==false,
  //     ref.getParent().isVar()==true (ประกาศ "var x;" เปล่า ๆ) -> ไม่เพิ่ม varmap
  //     ร่วมกับ defined = false (init.getParent().isVar() == false เพราะ init
  //     คือ ASSIGN ไม่ใช่ VAR) -> ใช้ vnode = Scope root's first statement
  //     ครอบคลุม replaceAssignmentExpression(): nodes ไม่ว่าง, all-set หมด,
  //     comma-tree ต่อกัน, และ removeChild ของ "var x;" ผ่านกิ่ง
  //     ref.getParent().isVar() ใน loop ท้ายของ splitObject
  //
  //     หมายเหตุ: กิ่งนี้ซับซ้อนและอิงพฤติกรรมของ Scope/ReferenceCollectingCallback
  //     ที่ไม่ได้แสดงในซอร์สที่ให้มา ผลลัพธ์ด้านล่างมาจากการไล่ trace โค้ดด้วยมือ
  //     ไม่ใช่ผลจากการรันจริง จึงมีความเสี่ยงว่าคลาดเคลื่อนได้ -- ควร verify อีกครั้ง
  // ---------------------------------------------------------------
  public void testDeclarationThenLaterAssignmentInlined() {
    test(
        "function f() {" +
        "  var x;" +
        "  x = {a: 1, b: 2};" +
        "  return x.a + x.b;" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0;" +
        "  var JSCompiler_object_inline_b_1;" +
        "  JSCompiler_object_inline_a_0 = 1, " +
        "  JSCompiler_object_inline_b_1 = 2, true;" +
        "  return JSCompiler_object_inline_a_0 + JSCompiler_object_inline_b_1;" +
        "}");
  }

  // ---------------------------------------------------------------
  // 14) ref.getParent().isVar() ใน splitObject loop สุดท้าย (การลบ "var x;" เดิม
  //     ที่ไม่มีค่า เมื่อ defined == true ก็ยังถูกลบผ่าน removeChild(vnode) ไปแล้ว
  //     กรณีนี้ครอบคลุมกรณี "var x;" ที่เหลืออยู่ในรายการ reference แยกจาก init)
  // ---------------------------------------------------------------
  public void testPlainDeclarationRemovedAfterInline() {
    test(
        "function f() {" +
        "  var x = {a: 1};" +
        "  var unused; unused = 1;" + // ตัวแปรอื่นไม่เกี่ยวข้อง กันไม่ให้ scope ว่าง
        "  return x.a;" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0 = 1;" +
        "  var unused; unused = 1;" +
        "  return JSCompiler_object_inline_a_0;" +
        "}");
  }

  // ---------------------------------------------------------------
  // หมายเหตุ: กิ่ง/เงื่อนไขที่ระบุได้จากซอร์ส แต่ "ไม่ได้" เขียนเทสยืนยัน exact
  // output เนื่องจากไม่สามารถยืนยัน behavior ได้แน่ชัดจากซอร์สที่ให้มาเพียง
  // ไฟล์เดียว (ป้องกันการเดา behavior ตามข้อกำหนด #4):
  //
  // - compiler.getCodingConvention().isExported(var.name) == true:
  //   ต้องพึ่ง CodingConvention concrete class ที่ไม่ได้อยู่ในซอร์สนี้
  // - staleVars.contains(var) == true (ตัวแปรหนึ่ง reference เข้าไปในค่าของอีก
  //   ตัวแปรที่กำลังถูก inline พร้อมกันในสโคปเดียวกัน): ขึ้นกับลำดับการ iterate
  //   ของ t.getScope().getVars() ซึ่งไม่ได้ระบุไว้ในซอร์สที่ให้มา
  // - กรณี "x = {}" (empty object literal) reassignment ที่ nodes.isEmpty()==true
  //   ใน replaceAssignmentExpression (replacement = IR.trueNode()): วิเคราะห์แล้ว
  //   ว่า isInlinableObject อาจยอมให้ผ่านได้ทั้งที่ property เดิมหายไป (ผลจาก
  //   "blind spot" ที่ระบุในคอมเมนต์ของซอร์ส) จุดนี้มีโอกาสสูงที่จะเป็นพื้นที่ของ
  //   fault จริง แนะนำให้ทดสอบเพิ่มเติมด้วยการรันจริงเพื่อยืนยัน expected output
  //   ก่อนใส่ assertion ที่แน่นอน
  // ---------------------------------------------------------------
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| # | เมธอดเทส | Branch / Condition ที่ครอบคลุม |
|---|----------|----------------------------------|
| 1 | `testGlobalVariableNeverInlined` | `isVarInlineForbidden`: `var.isGlobal() == true` → skip |
| 2 | `testLocalVariableBasicSplit` | `isInlinableObject` ret=true ผ่าน GETPROP valid; `splitObject` กิ่ง `defined=true` (isWellDefined && init.getParent().isVar()); `fillInitialValues`; ลบ vnode |
| 3 | `testFullReferenceNotInlined` | `!isVarOrAssignExprLhs(name)` → return false |
| 4 | `testMethodCallNotInlined` | `parent.isGetProp()` + `gramps.isCall() && gramps.getFirstChild()==parent` → return false |
| 5 | `testDeletePropertyNotInlined` | propName not in validProperties + `!NodeUtil.isVarOrSimpleAssignLhs` → return false |
| 6 | `testVarNoValueThenPropertyAssignNotInlined` | `val == null` → continue; GETPROP เป็น simple-assign-lhs → validProperties.add แต่ ret ไม่เป็น true |
| 7 | `testNonObjectLiteralAssignmentNotInlined` | `!val.isObjectLit()` → return false |
| 8 | `testGetterNotInlined` | `child.isGetterDef()` → return false |
| 9 | `testSetterNotInlined` | `child.isSetterDef()` → return false |
| 10 | `testSelfReferentialAssignmentNotInlined` | self-referential check (`refNode == childVal`) → return false |
| 11 | `testUndefinedPropertyAccessNotInlined` | "blind spot" branch: propName ไม่อยู่ validProperties + ไม่ใช่ var/assign lhs → return false |
| 12 | `testRenamePropertyFunctionNameNotInlined` | `isVarInlineForbidden`: `RENAME_PROPERTY_FUNCTION_NAME.equals(var.name)` |
| 13 | `testDeclarationThenLaterAssignmentInlined` | `computeVarList` กิ่ง `ref.getParent().isVar()` (no-op); `defined=false` branch ใน `splitObject`; `replaceAssignmentExpression` เต็มรูปแบบ (comma-tree, all-keys covered) |
| 14 | `testPlainDeclarationRemovedAfterInline` | loop สุดท้ายของ `splitObject`: กิ่ง `ref.getParent().isVar()` → `removeChild` |

**กิ่งที่ระบุได้แต่ไม่ได้ทดสอบยืนยัน exact behavior** (เพื่อไม่ละเมิดข้อกำหนดห้ามเดา): `isExported()==true`, `staleVars.contains(var)==true`, และกรณี `nodes.isEmpty()` ใน `replaceAssignmentExpression` (empty object literal reassignment) — ระบุไว้เป็นคอมเมนต์ในโค้ดพร้อมคำแนะนำให้ตรวจสอบเพิ่มเติม