# วิเคราะห์และแนวทางการทดสอบ

คลาส `InlineObjectLiterals` เป็น `CompilerPass` ภายในของ Closure Compiler ซึ่งทำงานผ่าน AST ของ Rhino/Closure ทั้งหมด การทดสอบ unit-level ที่ตรงประเด็นและเป็นมาตรฐานของโปรเจกต์นี้คือการ extend `CompilerTestCase` (คลาสช่วยทดสอบที่มีอยู่แล้วใน `com.google.javascript.jscomp` package เดียวกัน — **หมายเหตุ: ไม่ได้แสดงซอร์สในโจทย์ แต่เป็น infrastructure ที่ต้องมีอยู่แล้วเพื่อทดสอบ pass ในแพ็กเกจนี้ได้จริง**) แล้วป้อนซอร์ส JS เข้าไปเทียบผลลัพธ์ก่อน/หลัง เพื่อบังคับ path ต่าง ๆ ใน `isVarInlineForbidden`, `isInlinableObject`, `computeVarList`, `splitObject`

> ⚠️ หมายเหตุสำคัญ (ตามข้อ 4): เมธอด/ค่าคงที่บางส่วน เช่น `CompilerTestCase#test/testSame`, `Compiler#getUniqueNameIdSupplier()`, ค่าคงที่ `RenameProperties.RENAME_PROPERTY_FUNCTION_NAME`, ลำดับการคืนค่าของ `safeNameIdSupplier` (เริ่มที่ 0 เพิ่มทีละ 1), และลำดับการ iterate ของ `Scope#getVars()` (ตามลำดับประกาศ) **ไม่ได้ปรากฏในซอร์สที่ให้มา** แต่เป็นสมมติฐานที่จำเป็นต่อการเขียนผลลัพธ์คาดหวัง (expected output) — จะระบุ comment กำกับไว้ในโค้ดทุกจุดที่อ้างอิงสมมติฐานเหล่านี้

```java
package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * Unit tests for {@link InlineObjectLiterals}.
 *
 * NOTE: This test class extends CompilerTestCase, the standard test harness
 * used throughout com.google.javascript.jscomp for CompilerPass subclasses.
 * CompilerTestCase itself is not part of the class under test's source, but
 * is required infrastructure assumed to be present in the same package/classpath.
 */
public class InlineObjectLiteralsTest extends CompilerTestCase {

  public InlineObjectLiteralsTest() {
    super("");
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    // ASSUMPTION: Compiler#getUniqueNameIdSupplier() exists and returns a
    // Supplier<String> producing sequential ids "0","1","2",... starting
    // fresh for each new Compiler instance created per test. Not shown in
    // the provided source of InlineObjectLiterals.
    return new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
  }

  @Override
  protected int getNumRepetitions() {
    // The pass mutates the AST destructively; run only once per test.
    return 1;
  }

  // =====================================================================
  // isVarInlineForbidden() branches
  // =====================================================================

  @Test
  public void testGlobalVarNotInlined() {
    // var.isGlobal() == true -> forbidden, whole var untouched.
    testSame("var x = {a: 1, b: 2}; x.a + x.b;");
  }

  @Test
  public void testRenamePropertyFunctionNameNotInlined() {
    // ASSUMPTION: RenameProperties.RENAME_PROPERTY_FUNCTION_NAME literal
    // value is "JSCompiler_renameProperty" (known Closure Compiler constant,
    // not shown in the given source snippet).
    testSame(
        "function f() {" +
        "  var JSCompiler_renameProperty = {a: 1};" +
        "  return JSCompiler_renameProperty.a;" +
        "}");
  }

  @Test
  public void testStaleVarSkippedAfterCrossVarBlacklisting() {
    // ASSUMPTION: Scope#getVars() iterates in declaration order (b before a).
    // Processing 'b' first inlines it; while rewriting the reassignment
    // "b = {y: a}", blacklistVarReferencesInTree() walks the value tree and
    // marks variable 'a' as stale. When the loop later reaches 'a',
    // isVarInlineForbidden() short-circuits true via staleVars.contains(v),
    // so 'a' is left completely untouched.
    test(
        "function f() {" +
        "  var b = {y: 1};" +
        "  var a = {x: 1};" +
        "  b = {y: a};" +
        "  return b.y;" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_y_0 = 1;" +
        "  var a = {x: 1};" +
        "  JSCompiler_object_inline_y_0 = a, true;" +
        "  return JSCompiler_object_inline_y_0;" +
        "}");
  }

  // =====================================================================
  // isInlinableObject(): parent.isGetProp() branch
  // =====================================================================

  @Test
  public void testMethodCallOnObjectNotInlined() {
    // gramps.isCall() && gramps.getFirstChild() == parent -> return false
    // (x used as 'this' for a call through x.a()).
    testSame(
        "function f() {" +
        "  var x = {a: function() { return this; }};" +
        "  x.a();" +
        "}");
  }

  @Test
  public void testGetPropAsCallArgumentStillInlinable() {
    // parent.isGetProp() true, but gramps.getFirstChild() != parent
    // (x.a passed as an argument, not as call target) -> "continue", no block.
    test(
        "function f() {" +
        "  var x = {a: 1};" +
        "  g(x.a);" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0 = 1;" +
        "  g(JSCompiler_object_inline_a_0);" +
        "}");
  }

  @Test
  public void testUnknownPropertyOnEmptyObjectBecomesUndefinedVar() {
    // Boundary: object literal with zero keys -> the key-copy for-loop in
    // isInlinableObject()/computeVarList() never executes (0 iterations).
    // Demonstrates the documented "blind spot": a GETPROP for a key that was
    // never in the literal is still rewritten to a (now undefined) variable.
    test(
        "function f() {" +
        "  var x = {};" +
        "  return x.a;" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0;" +
        "  return JSCompiler_object_inline_a_0;" +
        "}");
  }

  // =====================================================================
  // isInlinableObject(): isVarOrAssignExprLhs() branch
  // =====================================================================

  @Test
  public void testFullReferenceNotInlined() {
    // Whole-object reference "g(x)": parent is neither VAR nor ASSIGN-lhs
    // of an EXPR_RESULT -> isVarOrAssignExprLhs() false -> return false.
    testSame(
        "function f() {" +
        "  var x = {a: 1, b: 2};" +
        "  g(x);" +
        "}");
  }

  @Test
  public void testAssignNotAsExprStatementNotInlined() {
    // parent.isAssign() true but parent.getParent().isExprResult() is false
    // (assign is nested inside another var initializer) -> lhs check fails.
    testSame(
        "function f() {" +
        "  var x;" +
        "  var y = (x = {a: 1});" +
        "  return x.a;" +
        "}");
  }

  // =====================================================================
  // isInlinableObject(): val == null / val not ObjectLit branches
  // =====================================================================

  @Test
  public void testVarWithNoInitializerLaterAssigned() {
    // Declaration val == null -> "continue" (no ret change); later ASSIGN
    // supplies the object literal. Also exercises "defined == false" path
    // in splitObject() because init.getParent() is ASSIGN, not VAR.
    test(
        "function f() {" +
        "  var x;" +
        "  x = {a: 1};" +
        "  return x.a;" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0;" +
        "  JSCompiler_object_inline_a_0 = 1, true;" +
        "  return JSCompiler_object_inline_a_0;" +
        "}");
  }

  @Test
  public void testNonObjectLiteralAssignmentNotInlined() {
    // val.isObjectLit() == false ("x = 5") -> return false immediately.
    testSame(
        "function f() {" +
        "  var x = {a: 1};" +
        "  x = 5;" +
        "  return x.a;" +
        "}");
  }

  // =====================================================================
  // isInlinableObject(): getter/setter branch
  // =====================================================================

  @Test
  public void testGetterNotInlined() {
    // NOTE: assumes default parser/language mode of CompilerTestCase accepts
    // ES5 object-literal getter syntax. If not, this test may require an
    // explicit language-mode setup not shown in the given source.
    testSame(
        "function f() {" +
        "  var x = {get a() { return 1; }};" +
        "  return x.a;" +
        "}");
  }

  @Test
  public void testSetterNotInlined() {
    // Same assumption as above, for ES5 setter syntax.
    testSame(
        "function f() {" +
        "  var x = {set a(v) {}};" +
        "  x.a = 2;" +
        "}");
  }

  // =====================================================================
  // isInlinableObject(): self-referential assignment branch
  // =====================================================================

  @Test
  public void testSelfReferentialAssignmentNotInlined() {
    // childVal == refNode matched on the first while-loop check (0 extra
    // iterations up the tree) -> return false.
    testSame(
        "function f() {" +
        "  var x = {a: 1};" +
        "  x = {a: x.a};" +
        "}");
  }

  @Test
  public void testSelfReferentialNestedExpressionNotInlined() {
    // childVal reached only after the while-loop walks up one extra level
    // (x.a is nested inside a '+' expression) -> exercises multi-iteration
    // path of the while loop before matching.
    testSame(
        "function f() {" +
        "  var x = {a: 1};" +
        "  x = {a: x.a + 1};" +
        "}");
  }

  // =====================================================================
  // Positive inlining paths / loop coverage in computeVarList & splitObject
  // =====================================================================

  @Test
  public void testLocalVarInlinedBasicProperties() {
    test(
        "function f() { var x = {a: 1, b: 2}; return x.a + x.b; }",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0 = 1;" +
        "  var JSCompiler_object_inline_b_1 = 2;" +
        "  return JSCompiler_object_inline_a_0 + JSCompiler_object_inline_b_1;" +
        "}");
  }

  @Test
  public void testMultiplePropertiesMixedAccess() {
    // Exercises the object-literal key iteration loop with 3 keys and the
    // varmap-insertion-order preservation in splitObject().
    test(
        "function f() {" +
        "  var x = {a: 1, b: 2, c: 3};" +
        "  return x.b;" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0 = 1;" +
        "  var JSCompiler_object_inline_b_1 = 2;" +
        "  var JSCompiler_object_inline_c_2 = 3;" +
        "  return JSCompiler_object_inline_b_1;" +
        "}");
  }

  @Test
  public void testMultipleAssignmentsSameKeyReused() {
    // Exercises "if (varmap.containsKey(varname)) continue;" branch in
    // computeVarList() for a key seen again in a later assignment/usage.
    test(
        "function f() {" +
        "  var x = {a: 1};" +
        "  x = {a: 2};" +
        "  return x.a;" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0 = 1;" +
        "  JSCompiler_object_inline_a_0 = 2, true;" +
        "  return JSCompiler_object_inline_a_0;" +
        "}");
  }

  @Test
  public void testVarDeclarationWithoutValueRemoved() {
    // Exercises "else if (ref.getParent().isVar())" branch in splitObject():
    // an empty "var x;" declaration reference must be entirely removed.
    test(
        "function f() {" +
        "  var x;" +
        "  x = {a: 1};" +
        "  x = {a: 2};" +
        "  return x.a;" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0;" +
        "  JSCompiler_object_inline_a_0 = 1, true;" +
        "  JSCompiler_object_inline_a_0 = 2, true;" +
        "  return JSCompiler_object_inline_a_0;" +
        "}");
  }

  @Test
  public void testDeclarationOnlyGetsInlinedEvenIfUnused() {
    // Boundary: single VAR-with-value reference is itself sufficient to be
    // "inlinable" (ret = true), even though the variable is never read.
    test(
        "function f() { var x = {a: 1}; }",
        "function f() { var JSCompiler_object_inline_a_0 = 1; }");
  }

  @Test
  public void testMultipleVarsInSameScopeBothInlined() {
    // Exercises the for-loop over multiple Vars in afterExitScope(),
    // ensuring independent, non-interfering processing of two vars.
    test(
        "function f() {" +
        "  var x = {a: 1};" +
        "  var y = {b: 2};" +
        "  return x.a + y.b;" +
        "}",
        "function f() {" +
        "  var JSCompiler_object_inline_a_0 = 1;" +
        "  var JSCompiler_object_inline_b_1 = 2;" +
        "  return JSCompiler_object_inline_a_0 + JSCompiler_object_inline_b_1;" +
        "}");
  }

  // =====================================================================
  // Boundary / degenerate inputs
  // =====================================================================

  @Test
  public void testEmptyProgramNoCrash() {
    testSame("");
  }

  @Test
  public void testNoVarsInScopeNoCrash() {
    testSame("function f() { return 1; }");
  }
}
```

## สรุปตาราง Test Method → Branch/Condition ที่ครอบคลุม

| Test Method | Branch / Condition ที่ทดสอบ |
|---|---|
| `testGlobalVarNotInlined` | `isVarInlineForbidden`: `var.isGlobal() == true` |
| `testRenamePropertyFunctionNameNotInlined` | `isVarInlineForbidden`: ชื่อตรงกับ `RENAME_PROPERTY_FUNCTION_NAME` |
| `testStaleVarSkippedAfterCrossVarBlacklisting` | `isVarInlineForbidden`: `staleVars.contains(var)==true` (มาจาก `blacklistVarReferencesInTree`) |
| `testMethodCallOnObjectNotInlined` | `isInlinableObject`: `gramps.isCall() && gramps.getFirstChild()==parent` → `return false` |
| `testGetPropAsCallArgumentStillInlinable` | `isInlinableObject`: GETPROP เป็น argument ไม่ใช่ callee → `continue` (ไม่บล็อก) |
| `testUnknownPropertyOnEmptyObjectBecomesUndefinedVar` | boundary: object literal ว่าง (loop 0 รอบ) + blind-spot behavior |
| `testFullReferenceNotInlined` | `isVarOrAssignExprLhs` false เพราะ parent ไม่ใช่ VAR/ASSIGN |
| `testAssignNotAsExprStatementNotInlined` | `isVarOrAssignExprLhs`: ASSIGN แต่ parent ไม่ใช่ EXPR_RESULT |
| `testVarWithNoInitializerLaterAssigned` | `val == null` → continue; `defined==false` ใน `splitObject` |
| `testNonObjectLiteralAssignmentNotInlined` | `!val.isObjectLit()` → `return false` |
| `testGetterNotInlined` / `testSetterNotInlined` | `child.isGetterDef()/isSetterDef()` → `return false` |
| `testSelfReferentialAssignmentNotInlined` | self-reference while-loop match ทันที (0 iteration ก่อน match) |
| `testSelfReferentialNestedExpressionNotInlined` | self-reference while-loop match หลัง walk ขึ้นหลายระดับ |
| `testLocalVarInlinedBasicProperties` | เส้นทาง inline สำเร็จพื้นฐาน, `defined==true` |
| `testMultiplePropertiesMixedAccess` | loop คีย์หลายตัวใน `computeVarList`/`splitObject`, ลำดับ insertion |
| `testMultipleAssignmentsSameKeyReused` | `computeVarList`: `varmap.containsKey` → `continue` |
| `testVarDeclarationWithoutValueRemoved` | `splitObject`: `ref.getParent().isVar()` (ลบ var เปล่า) |
| `testDeclarationOnlyGetsInlinedEvenIfUnused` | boundary: reference เดียว (declaration) ก็ inline ได้ |
| `testMultipleVarsInSameScopeBothInlined` | loop `for (Iterator<Var> ...)` ใน `afterExitScope` หลายตัวแปร |
| `testEmptyProgramNoCrash` / `testNoVarsInScopeNoCrash` | boundary: input ว่าง/ไม่มีตัวแปร ไม่ throw exception |

หมายเหตุปิดท้าย: branch บางส่วน เช่น `var.isExtern()` แยกจาก `var.isGlobal()` ไม่สามารถทดสอบแยกได้จริง เพราะตัวแปรใน externs ย่อมเป็น global เสมอ (short-circuit OR ทำให้ `isExtern()` ไม่ถูก evaluate อิสระ) และ `compiler.getCodingConvention().isExported(...)` ไม่ได้ถูกทดสอบเพราะพฤติกรรม coding convention ไม่ปรากฏในซอร์สที่ให้มา จึงไม่กล้าเดา behavior ตามข้อกำหนด