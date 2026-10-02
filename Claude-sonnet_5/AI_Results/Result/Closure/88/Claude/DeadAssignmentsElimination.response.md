# วิเคราะห์และแนวทางการทดสอบ

`DeadAssignmentsElimination` ผูกติดกับโครงสร้างภายในของ Closure Compiler อย่างมาก (Scope, ControlFlowGraph, LiveVariablesAnalysis) การจะสร้าง state เหล่านี้ด้วยมือทำได้ยากและเสี่ยงต่อการ "เดา" พฤติกรรม ดังนั้นผมเลือกใช้ `CompilerTestCase` (คลาสช่วยทดสอบมาตรฐานที่อยู่ใน source tree เดียวกันของโปรเจกต์ Closure Compiler เอง ไม่ใช่ jar ภายนอก) ซึ่งจะ parse/รัน pass/เทียบ AST ให้ — เป็นวิธีเดียวกับที่ทีม Closure ใช้ทดสอบไฟล์นี้จริง `CompilerTestCase` สืบทอดจาก `junit.framework.TestCase` (JUnit3 style) แต่ยังรันได้ภายใต้ JUnit4 runner (ผ่าน `JUnit38ClassRunner` ที่ JUnit4 มี built-in ไว้รองรับ backward-compat) — จึงยังอยู่ใน "JUnit 4 framework" ตามที่กำหนด ไม่มีการเพิ่ม library อื่นนอกเหนือจากที่อนุญาต

จุดที่ไม่มั่นใจ 100% (เช่น semantics ของ `Scope.isDeclared(name,false)`, การคำนวณ liveness ข้าม loop back-edge ที่ซับซ้อนมาก, และ branch ของ escaped-locals ที่ดูเหมือนจะ unreachable เพราะถูกกันไว้ก่อนด้วย `containsFunction`) ผมได้ **คอมเมนต์กำกับไว้ในโค้ด** ตามข้อกำหนดที่ 4

```java
package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * Unit tests for {@link DeadAssignmentsElimination}.
 *
 * หมายเหตุ: ใช้ {@link CompilerTestCase} (อยู่ใน source tree เดียวกันของโปรเจกต์
 * Closure Compiler, ไม่ใช่ jar ภายนอก) เพื่อ parse/รัน pass/เปรียบเทียบ AST
 * เนื่องจากคลาสเป้าหมายผูกกับ Scope/ControlFlowGraph/LiveVariablesAnalysis
 * อย่างแน่นหนา การสร้าง state เหล่านี้เองโดยไม่ผ่าน pipeline จริงจะเป็นการ
 * "เดา" พฤติกรรมภายในที่ไม่ได้ระบุไว้ในซอร์สที่ให้มา
 */
public class DeadAssignmentsEliminationTest extends CompilerTestCase {

  public DeadAssignmentsEliminationTest() {
    super();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new DeadAssignmentsElimination(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    // ป้องกันปัญหาการรัน pass ซ้ำหลายรอบกับ CFG/annotation ที่ถูกแก้ไขแล้ว
    return 1;
  }

  private void inFunction(String src) {
    testSame("function _FUNCTION(){" + src + "}");
  }

  private void inFunction(String src, String expected) {
    test("function _FUNCTION(){" + src + "}",
         "function _FUNCTION(){" + expected + "}");
  }

  // ---------------------------------------------------------------------
  // 1) Gate ใน enterScope(): global scope / inner function / no removable
  // ---------------------------------------------------------------------

  public void testGlobalScopeNotProcessed() {
    // scope.isGlobal() == true -> enterScope return ทันที ไม่มีการวิเคราะห์เลย
    testSame("var x; x = 1; x = 2; x;");
  }

  public void testInnerFunctionPreventsElimination() {
    // NodeUtil.containsFunction(fnBlock) == true -> return (ไม่ทำอะไร)
    inFunction("var x; x = 1; x = 2; function inner(){} alert(x);");
  }

  public void testNoRemovableAssignsSkipped() {
    // ไม่มี ASSIGN/INC/DEC ใด ๆ ที่ match matchRemovableAssigns (var init ไม่นับ)
    inFunction("var x = 1; return x;");
  }

  public void testVarDeclarationAloneSkipped() {
    // boundary: มีแค่ declaration ไม่มีการใช้ ไม่มี assignment op เลย
    inFunction("var x;");
  }

  public void testEmptyFunctionBodyNoCrash() {
    // boundary/empty: function body ว่างเปล่า ต้องไม่ throw และไม่เปลี่ยนแปลง
    inFunction("");
  }

  // ---------------------------------------------------------------------
  // 2) tryRemoveAssignment(): ASSIGN ("=") พื้นฐาน dead/live
  // ---------------------------------------------------------------------

  public void testSimpleDeadAssignmentBecomesExpression() {
    // x=1 ตายเพราะถูก overwrite โดย x=2 โดยไม่มีการอ่านคั่นกลาง
    inFunction("var x; x = 1; x = 2; return x;",
               "var x; 1; x = 2; return x;");
  }

  public void testLiveAssignmentNotRemoved() {
    // state.getOut().isLive(var) == true -> return (ไม่ลบ)
    inFunction("var x; x = 1; return x;");
  }

  public void testIdentityAssignmentAlwaysRemoved() {
    // a = a ต้องถูกลบไม่ว่า liveness จะเป็นอย่างไร (เช็คก่อน isLive)
    inFunction("var x; x = 1; x = x; return x;",
               "var x; x = 1; x; return x;");
  }

  public void testChainedAssignmentRecursion() {
    // a = b = 1; ทั้งคู่ไม่ถูกใช้ต่อ -> recursion ลบ rhs (b=1) ก่อน แล้วค่อยลบ a=...
    inFunction("var a, b; a = b = 1; return 1;",
               "var a, b; 1; return 1;");
  }

  // ---------------------------------------------------------------------
  // 3) Compound assignment operator (+=, -=, ...)
  // ---------------------------------------------------------------------

  public void testCompoundAssignmentConvertedToExpression() {
    // x=1 ยังใช้อยู่ (ถูกอ่านที่ x+=2) จึงไม่ถูกลบ, x+=2 ตาย -> แปลงเป็น x+2
    inFunction("var x; x = 1; x += 2; return 1;",
               "var x; x = 1; x + 2; return 1;");
  }

  // ---------------------------------------------------------------------
  // 4) INC/DEC
  // ---------------------------------------------------------------------

  public void testDeadIncrementBecomesVoid() {
    // x++ ที่เป็น bare expression statement และตาย -> แทนด้วย void 0
    inFunction("var x; x = 1; x++; x = 2; return x;",
               "var x; x = 1; void 0; x = 2; return x;");
  }

  public void testForConditionDeadAssignmentRemoved() {
    // FOR case: เงื่อนไข "j=5" ตาย (j ไม่ถูกใช้ที่ไหนอีก) -> ถูกลบเหลือ literal
    inFunction("var i, j; for (i = 0; j = 5; i++) { } return 1;",
               "var i, j; for (i = 0; 5; i++) { } return 1;");
  }

  public void testIncDecAsRhsValueNotRemoved() {
    // parent เป็น ASSIGN (y = x++) ไม่ใช่ EXPR_RESULT/FOR-non-condition
    // -> ตกไปที่ else "return;" (ไม่แก้ค่า เพราะค่าถูกใช้ต่อ)
    inFunction("var x, y; y = x++; return y;");
  }

  /**
   * หมายเหตุสำคัญ (fault-detection):
   * ในสาขา INC/DEC ของ tryRemoveAssignment มีเงื่อนไข
   *   else if (n.getType() == Token.COMMA && n != parent.getLastChild())
   * แต่ ณ จุดนี้ n คือ node INC/DEC เท่านั้น (ไม่ใช่ COMMA) จึงเงื่อนไขนี้
   * เป็น "unreachable" เสมอ (ควรเช็ค parent.getType()==COMMA แทน)
   * ผลคือ dead x++ ที่อยู่ใน comma-expression แบบไม่ใช่ตัวสุดท้าย จะไม่ถูกลบ
   * ทั้งที่ควรจะลบได้ปลอดภัย (เพราะค่าไม่ถูกใช้)
   * เทสนี้ยืนยัน "พฤติกรรมปัจจุบันของซอร์สที่ให้มา" (buggy) เพื่อไม่เดา
   * behavior ที่ไม่มีอยู่จริง แต่ทำหน้าที่เป็นเอกสารระบุข้อบกพร่องที่พบ
   * และยังคง exercise branch เดิมของโค้ด (else-if chain ทั้งหมด) ครบถ้วน
   */
  public void testIncDecInCommaExpressionNotRemoved_DocumentsSuspectedDefect() {
    inFunction("var x; x = 0; (x++, foo()); return 1;");
  }

  // ---------------------------------------------------------------------
  // 5) lhs ไม่ใช่ NAME / ตัวแปรไม่ได้ประกาศ
  // ---------------------------------------------------------------------

  public void testPropertyAssignmentNotTouched() {
    // !NodeUtil.isName(lhs) -> return ทันที (obj.prop ไม่ถูกแก้)
    inFunction("var x; x = 1; x = 2; obj.prop = 3; obj.prop = 4; return x;",
               "var x; 1; x = 2; obj.prop = 3; obj.prop = 4; return x;");
  }

  public void testUndeclaredVariableNotTouched() {
    // สมมติฐาน: scope.isDeclared(name,false) คืนค่า false สำหรับตัวแปร
    // implicit-global ที่ไม่ได้ประกาศด้วย var ใน scope นี้ -> return (ไม่แก้)
    // (ไม่มั่นใจ 100% เรื่อง semantics ของ isDeclared แต่สอดคล้องกับ
    // การอ่านโค้ดตามลำดับ: เช็ค isDeclared ก่อน getVar)
    inFunction("y = 1; y = 2; return 1;");
  }

  // ---------------------------------------------------------------------
  // 6) SWITCH / CASE / RETURN (hasChildren true/false)
  // ---------------------------------------------------------------------

  public void testEmptyReturnSkipsAssignmentCheck() {
    // RETURN ไม่มีลูก -> n.hasChildren()==false -> continue (ไม่เรียก tryRemoveAssignment)
    // แต่ x=1 (คนละ CFG node) ยังถูกลบตามปกติ
    inFunction("var x; x = 1; return;",
               "var x; 1; return;");
  }

  public void testReturnWithDeadAssignmentInExpression() {
    // RETURN มีลูก -> hasChildren()==true -> tryRemoveAssignment(firstChild)
    inFunction("var x; return x = 1;",
               "var x; return 1;");
  }

  public void testSwitchExpressionDeadAssignment() {
    inFunction("var x; switch (x = 1) { default: } return 1;",
               "var x; switch (1) { default: } return 1;");
  }

  public void testCaseExpressionDeadAssignment() {
    inFunction("var x, y; switch (y) { case (x = 1): break; } return 1;",
               "var x, y; switch (y) { case 1: break; } return 1;");
  }

  // ---------------------------------------------------------------------
  // 7) IF / WHILE / DO / FOR (condition) / FOR-IN
  // ---------------------------------------------------------------------

  public void testIfConditionTraversedAndRemoved() {
    inFunction("var x, y; y = 1; if (x = 1) { } return 1;",
               "var x, y; 1; if (1) { } return 1;");
  }

  public void testWhileLoopConditionTraversed() {
    // x ถูกอ่านที่เงื่อนไข while เสมอ (ทุก path) -> ไม่มี assignment ใดตาย
    inFunction("var x; x = 1; while (x < 10) { x = x + 1; } return 1;");
  }

  public void testDoWhileConditionTraversed() {
    inFunction("var x; x = 1; do { x = x + 1; } while (x < 10); return 1;");
  }

  public void testForLoopTraversal() {
    // case FOR, !isForIn -> ตรวจ condition (i<10) ซึ่งไม่มี assignment
    // และตรวจ default-case ของ FOR-init/FOR-increment (i=0, i++) ซึ่ง live เสมอ
    inFunction("var i, x; x = 1; x = 2; for (i = 0; i < 10; i++) { } return x;",
               "var i, x; 1; x = 2; for (i = 0; i < 10; i++) { } return x;");
  }

  public void testForInLoopSkipsConditionCheck() {
    // case FOR, isForIn == true -> continue (ไม่เรียก tryRemoveAssignment เลย)
    inFunction("var x, y, z; z = 1; z = 2; for (x in y) { } return z;",
               "var x, y, z; 1; z = 2; for (x in y) { } return z;");
  }

  // ---------------------------------------------------------------------
  // 8) process(): null-check (Preconditions.checkNotNull)
  // ---------------------------------------------------------------------

  public void testProcessNullExternsThrowsNpe() {
    Compiler compiler = new Compiler();
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    try {
      pass.process(null, new Node(Token.SCRIPT));
      fail("Expected NullPointerException for null externs");
    } catch (NullPointerException expected) {
      // ok
    }
  }

  public void testProcessNullRootThrowsNpe() {
    Compiler compiler = new Compiler();
    DeadAssignmentsElimination pass = new DeadAssignmentsElimination(compiler);
    try {
      pass.process(new Node(Token.SCRIPT), null);
      fail("Expected NullPointerException for null root");
    } catch (NullPointerException expected) {
      // ok
    }
  }

  // ---------------------------------------------------------------------
  // หมายเหตุ: ไม่ได้เขียนเทสสำหรับ branch
  //   if (liveness.getEscapedLocals().contains(var)) { return; }
  // เพราะจากการอ่านซอร์สโค้ด: ทุก scope ที่มี inner function (ซึ่งเป็นเงื่อนไข
  // เดียวที่ทำให้เกิด escaped local ผ่าน closure) จะถูกดักไว้ก่อนแล้วด้วย
  // NodeUtil.containsFunction(fnBlock) ใน enterScope() ทำให้ analysis ไม่รันเลย
  // จึงไม่มั่นใจว่า branch นี้ reachable ได้จริงจากซอร์สที่ให้มา - ไม่ขอเดา
  // และไม่เขียนเทสยืนยัน branch นี้โดยตรง
  // ---------------------------------------------------------------------
}
```

## สรุปตาราง Branch/Condition ที่ครอบคลุม

| เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|
| testGlobalScopeNotProcessed | `enterScope`: `scope.isGlobal()==true` |
| testInnerFunctionPreventsElimination | `enterScope`: `containsFunction(fnBlock)==true` |
| testNoRemovableAssignsSkipped / testVarDeclarationAloneSkipped | `enterScope`: `NodeUtil.has(...)==false` |
| testEmptyFunctionBodyNoCrash | boundary/empty input, gate เดียวกัน |
| testSimpleDeadAssignmentBecomesExpression | ASSIGN dead, `isAssign(n)` true path |
| testLiveAssignmentNotRemoved | `state.getOut().isLive(var)==true` |
| testIdentityAssignmentAlwaysRemoved | identity `a=a` branch |
| testChainedAssignmentRecursion | recursion เข้า rhs ก่อน (`rhs!=null`) |
| testCompoundAssignmentConvertedToExpression | `isAssignmentOp(n)` (compound) branch |
| testDeadIncrementBecomesVoid | INC/DEC + `isExpressionNode(parent)==true` |
| testForConditionDeadAssignmentRemoved | INC/DEC-like removal ผ่าน FOR-condition path + ยืนยันการลบจริงใน context FOR |
| testIncDecAsRhsValueNotRemoved | INC/DEC สุด else `return;` (ไม่มีเงื่อนไขใดตรง) |
| testIncDecInCommaExpressionNotRemoved_DocumentsSuspectedDefect | COMMA branch (unreachable defect) — เอกสารข้อบกพร่อง |
| testPropertyAssignmentNotTouched | `!NodeUtil.isName(lhs)` branch |
| testUndeclaredVariableNotTouched | `!scope.isDeclared(name,false)` branch |
| testEmptyReturnSkipsAssignmentCheck | `case RETURN: hasChildren()==false` |
| testReturnWithDeadAssignmentInExpression | `case RETURN: hasChildren()==true` |
| testSwitchExpressionDeadAssignment | `case SWITCH: hasChildren()==true` |
| testCaseExpressionDeadAssignment | `case CASE: hasChildren()==true` |
| testIfConditionTraversedAndRemoved | `case IF` |
| testWhileLoopConditionTraversed | `case WHILE` |
| testDoWhileConditionTraversed | `case DO` |
| testForLoopTraversal | `case FOR: !isForIn` + default-case fallthrough |
| testForInLoopSkipsConditionCheck | `case FOR: isForIn==true` (continue) |
| testProcessNullExternsThrowsNpe / testProcessNullRootThrowsNpe | `Preconditions.checkNotNull` ทั้งสองบรรทัดใน `process()` |