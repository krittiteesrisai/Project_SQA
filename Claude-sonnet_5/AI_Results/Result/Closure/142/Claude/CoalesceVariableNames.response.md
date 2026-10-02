# แนวทางการทดสอบ

`CoalesceVariableNames` เป็น `CompilerPass` ที่ทำงานผูกกับ `Scope`, `ControlFlowGraph`, `LiveVariablesAnalysis` และ `NodeTraversal` ของ Closure Compiler อย่างแน่นหนา จึง**ไม่สามารถทดสอบแบบ isolate ด้วย mock ง่าย ๆ ได้จริง** วิธีที่ codebase นี้ใช้ทดสอบ `CompilerPass` ทุกตัวคือผ่านคลาส `CompilerTestCase` (อยู่ใน source tree เดียวกัน, extends `junit.framework.TestCase`) ซึ่ง JUnit 4 runner รองรับการรันคลาสที่ extends `TestCase` ได้อยู่แล้ว (ผ่าน `JUnit38ClassRunner`) ผมจึงใช้แนวทางนี้ พร้อมกำกับ `@Test` ไว้เพื่อความชัดเจนตามข้อกำหนด แต่ methods ยังต้องใช้ชื่อขึ้นต้นด้วย `test` เพื่อให้ framework เดิม (JUnit3 lifecycle ของ `TestCase`) เรียกได้จริง

> **หมายเหตุสำคัญ**: ผลลัพธ์ที่แน่นอนของการ "รวมชื่อตัวแปร" (coalesce) ขึ้นกับ `GraphColoring`/`GreedyGraphColoring` และ `LinkedUndirectedGraph` ซึ่ง**ไม่ได้ให้ source มาด้วย** ผมจึงใช้ข้อมูลที่มีในซอร์ส (comparator `v1.index - v2.index` ที่ใช้เป็น tie-breaker) เพื่อ **อนุมาน** ว่าตัวแปรที่ประกาศก่อน (index ต่ำกว่า) จะเป็น representative — จุดนี้ผมคอมเมนต์กำกับไว้ทุกครั้งว่าเป็นข้อสันนิษฐาน ส่วน test ที่ยืนยันได้ชัดเจน 100% จากซอร์ส (เช่น กรณี interfere / global scope / LP-param) จะไม่มีข้อสันนิษฐานนี้

```java
package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * Unit tests สำหรับ CoalesceVariableNames (Closure-142b)
 *
 * หมายเหตุ: CoalesceVariableNames เป็น package-private class ที่ทำงานเป็น
 * CompilerPass ผูกกับ Scope/ControlFlowGraph/LiveVariablesAnalysis จึงต้องทดสอบ
 * ผ่าน CompilerTestCase (test harness มาตรฐานของ codebase นี้สำหรับทดสอบ
 * CompilerPass ทุกตัว, อยู่ใน source tree เดียวกัน ไม่ใช่ jar ภายนอก)
 *
 * CompilerTestCase extends junit.framework.TestCase (JUnit3) แต่ JUnit4
 * รองรับการรันคลาสลักษณะนี้ผ่าน JUnit38ClassRunner โดยอัตโนมัติ (ใช้ชื่อ method
 * ที่ขึ้นต้นด้วย "test" ในการค้นหา testcase) ผมใส่ @Test ประกอบไว้เพื่อให้
 * สอดคล้องกับข้อกำหนด แต่การรันจริงยังพึ่งพา naming convention "testXxx"
 */
public class CoalesceVariableNamesTest extends CompilerTestCase {

  /** flag ควบคุมพฤติกรรม debug-name ของ pass (พารามิเตอร์ตัวที่ 2 ของ constructor) */
  private boolean usePseudoNames = false;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    usePseudoNames = false;
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    // CoalesceVariableNames.process(externs, root) เรียก
    // NodeTraversal.traverse(compiler, root, this) อยู่แล้ว จึง reuse ได้ตรง ๆ
    return new CoalesceVariableNames(compiler, usePseudoNames);
  }

  // ---------- helper ----------
  private void inFunction(String src, String expected) {
    test("function _(){" + src + "}", "function _(){" + expected + "}");
  }

  private void inFunction(String src) {
    testSame("function _(){" + src + "}");
  }

  // =====================================================================
  // 1) กรณีปกติ: ตัวแปรสองตัวที่ live range ไม่ overlap ควรถูก coalesce
  // =====================================================================
  @Test
  public void testTwoNonOverlappingVars_Coalesced() {
    // สมมติฐาน (ไม่ยืนยัน 100%): ตัวแปรที่ประกาศก่อน (index ต่ำกว่า, x)
    // จะเป็น representative ตาม coloringTieBreaker (v1.index - v2.index)
    inFunction(
        "var x; x = 1; print(x); var y; y = 2; print(y);",
        "var x; x = 1; print(x); x = 2; print(x);");
  }

  // =====================================================================
  // 2) ตัวแปรที่ live range ทับกัน (ใช้พร้อมกัน) ต้องไม่ถูก coalesce
  //    ครอบคลุม branch: (v1OutLive && v2OutLive) || (in-live ทั้งคู่) => connect ตรง
  // =====================================================================
  @Test
  public void testTwoOverlappingVars_NotCoalesced() {
    inFunction("var x = 1; var y = 2; print(x + y);");
  }

  // =====================================================================
  // 3) enterScope: scope.isGlobal() == true => return ทันที
  //    => colorings ไม่ถูก push => visit(): colorings.isEmpty() == true => return
  // =====================================================================
  @Test
  public void testGlobalScopeUnaffected() {
    // ที่ top-level (global scope) แม้รูปแบบจะเหมือนกรณีที่ 1 ทุกอย่าง
    // ก็ต้องไม่ถูกแก้ไข เพราะ pass ไม่ทำงานใน global scope
    testSame("var x; x = 1; print(x); var y; y = 2; print(y);");
  }

  // =====================================================================
  // 4) พารามิเตอร์ฟังก์ชัน (parent เป็น Token.LP) ต้อง interfere กันเสมอ
  //    ตามบรรทัด: if (v1.parent==LP && v2.parent==LP) connectIfNotFound(...)
  //    แม้ live range จะไม่ overlap ก็ต้องไม่ coalesce
  // =====================================================================
  @Test
  public void testFunctionParamsAlwaysInterfere() {
    testSame("function f(a, b) { a = 1; print(a); b = 2; print(b); }");
  }

  // =====================================================================
  // 5) วิ่งไปเจอ NAME ที่ไม่ใช่ local (vNode == null) => "not a local" => return
  //    (ตัวแปร global ถูกอ้างถึงจากใน function แต่ไม่ได้อยู่ใน scope ของ function)
  // =====================================================================
  @Test
  public void testGlobalVariableReferencedInsideFunction_NotRenamed() {
    test(
        "var g = 1; function f(){ var x = 2; print(x); print(g); }",
        "var g = 1; function f(){ var x = 2; print(x); print(g); }");
  }

  // =====================================================================
  // 6) ฟังก์ชันที่ประกาศซ้อนกันไม่ถูกแก้ชื่อ (function-type Var ถูกกันออกจาก
  //    interference graph ด้วย !NodeUtil.isFunction(v.getParentNode());
  //    NAME node ที่เป็นชื่อฟังก์ชันเองก็ไม่ผ่าน NodeUtil.isFunction(parent) guard)
  // =====================================================================
  @Test
  public void testNestedNamedFunctionsNotRenamed() {
    inFunction("function inner1(){} function inner2(){} inner1(); inner2();");
  }

  // =====================================================================
  // 7) removeVarDeclaration: var.getChildCount() != 1 (หลายชื่อในสเตทเมนต์เดียว)
  //    และตัวที่ถูก coalesce ไม่มี initializer => ลบเฉพาะ declarator นั้น
  //    (var x, y; -> var x;)
  // =====================================================================
  @Test
  public void testMultiNameVarStatement_RemoveOnlyMergedDeclarator() {
    // สมมติฐาน: x (index ต่ำกว่า) เป็น representative
    inFunction(
        "var x, y; x = 1; print(x); y = 2; print(y);",
        "var x; x = 1; print(x); x = 2; print(x);");
  }

  // =====================================================================
  // 8) removeVarDeclaration: var.getChildCount()==1 && name.hasChildren()
  //    => แปลง "var y = 2;" เป็น expression assignment "x = 2;"
  // =====================================================================
  @Test
  public void testSingleVarWithInitializer_ConvertedToAssignment() {
    inFunction(
        "var x = 1; print(x); var y = 2; print(y);",
        "var x = 1; print(x); x = 2; print(x);");
  }

  // =====================================================================
  // 9) removeVarDeclaration: var.getChildCount()==1 && !name.hasChildren()
  //    => ลบ var statement ทั้งอัน (NodeUtil.removeChild(parent, var))
  //    (ครอบคลุมผ่านรูปแบบ "var y;" แยกจาก assignment)
  // =====================================================================
  @Test
  public void testSingleVarNoInitializer_StatementRemovedEntirely() {
    inFunction(
        "var x; x = 1; print(x); var y; y = 5; print(y);",
        "var x; x = 1; print(x); x = 5; print(x);");
  }

  // =====================================================================
  // 10) removeVarDeclaration: NodeUtil.isForIn(parent) branch
  //     "for (var y in obj)" -> "for (x in obj)"
  // =====================================================================
  @Test
  public void testForInVarDeclaration_Rewritten() {
    // สมมติฐาน: x ไม่ live ระหว่าง loop จึงไม่ interfere กับ y และ x เป็น representative
    inFunction(
        "var x = 1; print(x); for (var y in obj) { print(y); }",
        "var x = 1; print(x); for (x in obj) { print(x); }");
  }

  // =====================================================================
  // 11) usePseudoNames == true: รวมชื่อด้วย Joiner.on("_") จาก TreeSet
  //     (เรียงตัวอักษร) และลบ var declaration ของตัวที่ไม่ใช่ superNode
  // =====================================================================
  @Test
  public void testUsePseudoNames_MergedNameJoin() {
    usePseudoNames = true;
    // สมมติฐาน: allMergedNames = {"x","y"} -> TreeSet เรียง x,y -> "x_y"
    inFunction(
        "var x = 1; print(x); var y = 2; print(y);",
        "var x_y = 1; print(x_y); x_y = 2; print(x_y);");
  }

  // =====================================================================
  // 12) usePseudoNames == true แต่ไม่มีการ merge จริง (allMergedNames.size()==1)
  //     => return ทันที ไม่เปลี่ยนชื่อ
  // =====================================================================
  @Test
  public void testUsePseudoNames_SingleVarKeepsOriginalName() {
    usePseudoNames = true;
    inFunction("var x = 1; print(x);");
  }

  // =====================================================================
  // 13) isAssignTo: compound-assignment (NodeUtil.isAssignmentOp) นับเป็น def
  //     ตรวจสอบว่า pass ทำงานได้ถูกต้อง/ไม่ throw กับ compound assignment
  //     (best-effort: ตรวจผลลัพธ์แบบกว้าง เพราะรายละเอียด isAssignmentOp
  //      ไม่ได้อยู่ในซอร์สที่ให้มา จึงไม่ยืนยัน exact string 100%)
  // =====================================================================
  @Test
  public void testCompoundAssignmentDoesNotBreakPass() {
    // ยืนยันแค่ว่าไม่ throw exception และ y ไม่ถูกอ้างถึงหลงเหลือแบบไม่ปลอดภัย
    // -> ใช้ testSame กับกรณีที่ x,y ใช้ compound assign และ interfere กันแน่นอน
    // (x ยังมีค่าที่ต้องใช้ตอน y ถูกกำหนดค่า จึงไม่ควร coalesce)
    inFunction("var x = 1; x += 1; var y = 2; print(x); print(y);");
  }

  // =====================================================================
  // 14) Boundary: function ว่าง ไม่มี statement/ตัวแปรเลย
  // =====================================================================
  @Test
  public void testEmptyFunctionBody_NoOp() {
    testSame("function f(){}");
  }

  // =====================================================================
  // 15) Boundary: มีตัวแปร local เดียวในสโคป ไม่มีคู่ให้ coalesce
  //     (ป้องกัน exception จาก loop คู่ตัวแปรในกรณีตัวแปรเดียว)
  // =====================================================================
  @Test
  public void testSingleLocalVariable_NoCrash() {
    inFunction("var x = 1; print(x);");
  }

  // =====================================================================
  // 16) Boundary "malformed-ish": ตัวแปรที่ประกาศแต่ไม่ถูกใช้เลย
  //     (dead variable, ไม่มี read -> ไม่ crash, ไม่ควรถูกยุ่งถ้าไม่มีคู่ให้รวม)
  // =====================================================================
  @Test
  public void testUnusedDeclaredVariable_NoCrash() {
    inFunction("var x; var y = 1; print(y);");
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| Test Method | Branch/Condition ที่ครอบคลุม | หมายเหตุความเชื่อมั่น |
|---|---|---|
| testTwoNonOverlappingVars_Coalesced | `LiveRangeChecker` path (else-branch ของ interference), `!usePseudoNames` → rename + `removeVarDeclaration` (childCount==1, no initializer) | สันนิษฐาน tie-breaker เลือกตัวแปรที่ index ต่ำกว่า |
| testTwoOverlappingVars_NotCoalesced | `(state.getIn.isLive(v1)&&isLive(v2)) \|\| (v1OutLive&&v2OutLive)` → connect ตรง, `vNode.getValue().equals(coalescedVar)` == true → return | มั่นใจสูง (derive ตรงจาก source) |
| testGlobalScopeUnaffected | `enterScope`: `scope.isGlobal()` == true → return; `visit`: `colorings.isEmpty()` == true → return | มั่นใจสูง |
| testFunctionParamsAlwaysInterfere | `v1.getParentNode().getType()==LP && v2...==LP` → connect เสมอ | มั่นใจสูง |
| testGlobalVariableReferencedInsideFunction_NotRenamed | `vNode == null` → "not a local" → return | มั่นใจสูง |
| testNestedNamedFunctionsNotRenamed | `!NodeUtil.isFunction(v.getParentNode())` (exclude จาก graph), `NodeUtil.isFunction(parent)` guard ใน `visit` | มั่นใจสูง |
| testMultiNameVarStatement_RemoveOnlyMergedDeclarator | `removeVarDeclaration`: else branch, `var.getChildCount()!=1` + `!name.hasChildren()` | สันนิษฐาน representative var |
| testSingleVarWithInitializer_ConvertedToAssignment | `childCount==1 && name.hasChildren()` → สร้าง ASSIGN + `NodeUtil.newExpr` (parent ไม่ใช่ FOR) | สันนิษฐาน representative var |
| testSingleVarNoInitializer_StatementRemovedEntirely | `childCount==1 && !name.hasChildren()` → `NodeUtil.removeChild` | สันนิษฐาน representative var |
| testForInVarDeclaration_Rewritten | `NodeUtil.isForIn(parent)` branch | สันนิษฐาน representative var + no interference |
| testUsePseudoNames_MergedNameJoin | `usePseudoNames==true` path, `Joiner.on("_").join`, `!vNode.getValue().equals(coalescedVar) && NodeUtil.isVar(parent)` → remove decl | สันนิษฐาน representative var/ชื่อ pseudo |
| testUsePseudoNames_SingleVarKeepsOriginalName | `allMergedNames.size()==1` → return | มั่นใจสูง |
| testCompoundAssignmentDoesNotBreakPass | `isAssignTo`: branch `NodeUtil.isAssignmentOp(n)` (compound-op เป็น def) | ไม่ยืนยัน exact output, ตรวจ sanity เท่านั้น |
| testEmptyFunctionBody_NoOp | boundary: ไม่มี statement, loop ว่าง | มั่นใจสูง |
| testSingleLocalVariable_NoCrash | boundary: ตัวแปรเดียว, double-loop คู่ตัวแปรไม่มีคู่ | มั่นใจสูง |
| testUnusedDeclaredVariable_NoCrash | boundary: ตัวแปรไม่ถูกอ่านเลย (dead variable) | มั่นใจสูง |

**Branch ที่ไม่ครอบคลุม (ยอมรับและระบุเหตุผลตามข้อกำหนด #4)**: การวน `while (t.getScope().isDeclared(pseudoName, true)) pseudoName += "$";` (ชนกันของ pseudo-name) ไม่ได้เขียนทดสอบเฉพาะ เพราะต้องอาศัยพฤติกรรมภายในของ `Scope.isDeclared` และการจัดคู่ merge ที่ไม่สามารถยืนยันได้แน่นอนจากซอร์สที่ให้มาเพียงอย่างเดียว จึงเสี่ยงต่อการ "เดา behavior" ซึ่งขัดกับข้อกำหนด