package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * Unit tests for {@link CollapseVariableDeclarations}.
 *
 * ใช้ CompilerTestCase (test utility มาตรฐานของ Closure Compiler ใน package เดียวกัน)
 * เพื่อ parse/run pass/compare AST ผลลัพธ์ การตัดสินใจ expected output ทุกกรณี
 * มาจากการ trace โค้ดต้นฉบับทีละบรรทัด ไม่ได้เดา behavior ที่ไม่มีในซอร์ส
 */
public class CollapseVariableDeclarationsTest extends CompilerTestCase {

  // สมมติฐาน: CompilerTestCase มี default (no-arg) constructor ใช้งานได้
  // และค่า lifecycle stage เริ่มต้นไม่ใช่ normalized (ตรงกับ precondition ของ pass)

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new CollapseVariableDeclarations(compiler);
  }

  // ---------------------------------------------------------------------
  // Boundary: ไม่มีสิ่งที่จะ collapse ได้ -> collapses.isEmpty() == true
  // ---------------------------------------------------------------------

  @Test
  public void testEmptyScript() {
    // ไม่มี statement ใด ๆ -> process() ไม่ทำอะไร (branch: collapses.isEmpty()==true)
    testSame("");
  }

  @Test
  public void testSingleVarStubNoCollapse() {
    // มี var เดียวไม่มีตัวตามหลัง -> hasNodesToCollapse=false -> ไม่มี Collapse ถูกสร้าง
    testSame("var a;");
  }

  @Test
  public void testSingleVarWithValueNoCollapse() {
    // เหมือนด้านบนแต่มี initializer -> ครอบคลุม branch "not blacklisted"
    // ใน blacklistStubVars (child.getFirstChild() != null)
    testSame("var a = 1;");
  }

  // ---------------------------------------------------------------------
  // Basic var-to-var collapsing (loop เดินซ้ำผ่านหลาย sibling)
  // ---------------------------------------------------------------------

  @Test
  public void testCollapsingTwoVarStubs() {
    test("var a; var b;", "var a, b;");
  }

  @Test
  public void testCollapsingTwoVarsWithValues() {
    test("var a = 1; var b = 2;", "var a=1, b=2;");
  }

  @Test
  public void testCollapsingThreeVarsMixed() {
    // ตรวจสอบ while-loop เดินซ้ำมากกว่า 1 รอบ (3 statement)
    test("var a; var b = 1; var c = 2;", "var a, b=1, c=2;");
  }

  // ---------------------------------------------------------------------
  // blacklistedVars: stub var ("var a;") ห้ามถูก redeclare ด้วย assign ตามหลัง
  // (workaround สำหรับบั๊ก Firefox ตามคอมเมนต์ในซอร์ส)
  // ---------------------------------------------------------------------

  @Test
  public void testStubVarsBlockAssignRedeclare() {
    // a และ b เป็น stub var -> ถูก blacklist -> a=1;/b=2; ไม่ถูก merge เข้าไปใน var
    // แต่ตัว "var a; var b;" เองยัง collapse กันได้ตามปกติ
    test("var a; var b; a=1; b=2;", "var a, b; a=1; b=2;");
  }

  @Test
  public void testMultiNameStubVarBlacklist() {
    // ตรวจ loop ภายใน blacklistStubVars ที่วนผ่านหลาย NAME child ใน var เดียว
    testSame("var a, b; a=1; b=2;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared: ทุกเงื่อนไขที่เป็น true ครบ -> merge assign เข้ากับ var เดิม
  // (ผลลัพธ์จริงจากการ trace applyCollapses(): เกิดการ "redeclare" ชื่อซ้ำในบรรทัดเดียว
  //  พร้อม JSDoc @suppress duplicate ถูกแนบไว้ที่ node var แต่ไม่ assert เนื้อหา JSDoc
  //  เพราะไม่ยืนยัน behavior การเทียบ JSDoc ของ CompilerTestCase.test())
  // ---------------------------------------------------------------------

  @Test
  public void testAssignRedeclareMergeWithInitializedVar() {
    // a ประกาศด้วย initializer (ไม่ถูก blacklist) จึงถูก redeclare ได้จริง
    test("var a = 1; a = 5; var b = 2;", "var a=1, a=5, b=2;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared == false เพราะ lhs ไม่ใช่ NAME (เช่น property access)
  // ---------------------------------------------------------------------

  @Test
  public void testPropertyAssignNotRedeclarable() {
    testSame("var a; a.x = 1;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared == false เพราะ s.getVar(...) == null (ไม่เคยประกาศตัวแปรนี้)
  // ---------------------------------------------------------------------

  @Test
  public void testAssignToUndeclaredVarNotCollapsed() {
    testSame("var a = 1; b = 2;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared == false เพราะ var.getScope() != s (ตัวแปร global ถูกอ้างจาก
  // scope ของฟังก์ชันภายใน)
  // ---------------------------------------------------------------------

  @Test
  public void testAssignInDifferentScopeNotCollapsed() {
    testSame("var a = 1; function f() { var x; a = 2; }");
  }

  // ---------------------------------------------------------------------
  // parent.isIf(): VAR ที่เป็น then/else clause ของ IF โดยตรง (ไม่มี block)
  // ต้องไม่ถูก collapse ตามคอมเมนต์ในซอร์ส
  // ---------------------------------------------------------------------

  @Test
  public void testIfWithoutBlockVarsNotCollapsed() {
    testSame("if (x) var a = 1; else var b = 1;");
  }

  @Test
  public void testVarsInsideIfBlockStillCollapse() {
    // parent คือ BLOCK ไม่ใช่ IF โดยตรง -> ยัง collapse กันได้ตามปกติ
    test("if (x) { var a; var b; }", "if (x) { var a, b; }");
  }

  // ---------------------------------------------------------------------
  // hasVar ต้องเป็น true จึงจะเกิด collapse แม้ hasNodesToCollapse เป็น true แล้วก็ตาม
  // ---------------------------------------------------------------------

  @Test
  public void testChainBreaksOnHasVarFalse() {
    // "var a=1; var b=2;" collapse กันได้ตามปกติ (หยุดที่ foo() เพราะไม่ใช่ var/assign)
    // ส่วน "a=3; b=4;" เป็น chain ของ assign ล้วน ๆ ไม่มี var คั่นอยู่เลย
    // -> hasVar ยังเป็น false ตลอด -> ไม่เกิดการ collapse สำหรับคู่นี้
    test("var a = 1; var b = 2; foo(); a = 3; b = 4;",
         "var a=1, b=2; foo(); a=3; b=4;");
  }

  // ---------------------------------------------------------------------
  // canBeRedeclared == false เพราะ NodeUtil.isExprAssign เป็น false (ไม่ใช่ assign)
  // ---------------------------------------------------------------------

  @Test
  public void testNoCollapseWhenOnlyFunctionCalls() {
    testSame("foo(); bar();");
  }
}
