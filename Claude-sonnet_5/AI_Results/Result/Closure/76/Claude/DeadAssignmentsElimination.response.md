# หมายเหตุสำคัญก่อนเริ่ม (ตามข้อกำหนดที่ 4)

คลาส `DeadAssignmentsElimination` ทำงานผ่าน `NodeTraversal`, `Scope`, `ControlFlowGraph`, `LiveVariablesAnalysis` ซึ่งเป็นโครงสร้างภายในของ Closure Compiler ทั้งหมด การจะสร้าง Scope/CFG ที่ถูกต้องด้วยมือ (ไม่ผ่าน parser จริง) เป็นไปไม่ได้ในทางปฏิบัติ และเป็นวิธีที่ **โปรเจกต์ Closure Compiler เองใช้ทดสอบพาสนี้จริง** คือให้คลาสทดสอบ extends `CompilerTestCase` (คลาสช่วยทดสอบที่อยู่ใน `com.google.javascript.jscomp` เดียวกันกับคลาสเป้าหมาย ไม่ใช่ third-party jar แยก จึง compile อยู่ใน source tree เดียวกันและอยู่ใน classpath ของโปรเจกต์อยู่แล้ว) ผมจึงเลือกใช้แนวทางนี้ เพราะเป็นวิธีเดียวที่จะทดสอบ branch ของ liveness-based dead code elimination ได้จริงและถูกต้อง — **ขอกำกับไว้ว่านี่คือข้อสมมติที่จำเป็น (ไม่ใช่การเดา behavior ของคลาสเป้าหมาย)**

เนื่องจาก `CompilerTestCase` สืบทอดมาจาก `junit.framework.TestCase` (สไตล์ JUnit 3) เมธอด `testXxx()` จะถูก JUnit4 runner (`JUnit38ClassRunner`) เรียกโดยอัตโนมัติ จึง**ไม่ใช้ `@Test` annotation** กับเมธอดเหล่านี้ (เพราะจะถูกมองข้าม) ส่วน assertion ของ Exception ใช้ try/catch + fail() แบบ JUnit3

การเปรียบเทียบผลลัพธ์ของ `test()/testSame()` เป็นการเทียบ **โครงสร้าง AST** ไม่ใช่ string ตรงตัว จึงไม่ต้องกังวลเรื่อง whitespace/semicolon

```java
package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;

/**
 * Unit tests for {@link DeadAssignmentsElimination}.
 *
 * หมายเหตุ: ทดสอบผ่าน CompilerTestCase (utility ที่อยู่ใน source tree เดียวกับ
 * com.google.javascript.jscomp) เนื่องจากคลาสเป้าหมายต้องพึ่งพา Scope /
 * ControlFlowGraph / LiveVariablesAnalysis ที่สร้างได้ถูกต้องผ่าน parser จริงเท่านั้น
 * การ mock ด้วยมือจะทำให้ผลทดสอบไม่สะท้อน behavior จริงของ liveness analysis
 */
public class DeadAssignmentsEliminationTest extends CompilerTestCase {

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new DeadAssignmentsElimination(compiler);
  }

  // ---------- Helper ----------
  private void inFunction(String src) {
    testSame("function FUNC() {" + src + "}");
  }

  private void inFunction(String src, String expected) {
    test("function FUNC() {" + src + "}",
         "function FUNC() {" + expected + "}");
  }

  // =========================================================
  // 1. enterScope(): global scope -> ข้าม analysis ทั้งหมด
  // =========================================================
  public void testGlobalScopeAssignmentsNotRemoved() {
    // แม้ x=1 จะ "dead" ตามหลัก liveness แต่เนื่องจากเป็น global scope
    // จึงต้องไม่ถูกแก้ไขเลย (if (scope.isGlobal()) return;)
    testSame("var x; x = 1; x = 2; print(x);");
  }

  // =========================================================
  // 2. enterScope(): ไม่มี removable-assign ใน fnBlock -> return early
  // =========================================================
  public void testNoRemovableAssignmentsNoChange() {
    inFunction("var x; print(x);");
  }

  public void testEmptyFunctionBodyNoChange() {
    inFunction("");
  }

  // =========================================================
  // 3. enterScope(): containsFunction(fnBlock) == true -> return early
  // =========================================================
  public void testNestedFunctionPreventsAnalysis() {
    // x=1 ควรจะ "dead" (ถูก overwrite ด้วย x=2 ก่อนถูกอ่าน) แต่เนื่องจากมี
    // function ซ้อนอยู่ภายใน block เดียวกัน การวิเคราะห์ทั้งหมดของสโคปนี้
    // จึงถูกข้ามไปเลย -> ไม่มีการเปลี่ยนแปลงใด ๆ
    inFunction("var x; function g(){}; x = 1; x = 2; print(x);");
  }

  // =========================================================
  // 4. tryRemoveAssignment(): กรณี ASSIGN ปกติ (dead / live)
  // =========================================================
  public void testSimpleDeadAssignmentRemoved() {
    inFunction("var x; x = 1; x = 2; print(x);",
               "var x; 1; x = 2; print(x);");
  }

  public void testLiveAssignmentNotRemoved() {
    inFunction("var x; x = 1; print(x); x = 2; print(x);");
  }

  // =========================================================
  // 5. tryRemoveAssignment(): compound assignment op (+=, ฯลฯ)
  //    -> แปลงเป็น binary op เมื่อ dead
  // =========================================================
  public void testDeadCompoundAssignmentConvertedToBinaryOp() {
    inFunction("var x; x = 1; x += 2; x = 3; print(x);",
               "var x; x = 1; x + 2; x = 3; print(x);");
  }

  // =========================================================
  // 6. tryRemoveAssignment(): INC/DEC เป็น expression statement -> void 0
  // =========================================================
  public void testDeadIncrementStatementReplacedWithVoid() {
    inFunction("var x; x = 1; x++; x = 2; print(x);",
               "var x; x = 1; void 0; x = 2; print(x);");
  }

  // =========================================================
  // 7. tryRemoveAssignment(): INC/DEC ใน update-clause ของ FOR -> EMPTY
  // =========================================================
  public void testDeadIncrementInForUpdateClauseReplacedWithEmpty() {
    inFunction(
        "var x; var i; for (i = 0; i < 10; x++) { } x = 5; print(x);",
        "var x; var i; for (i = 0; i < 10; ) { } x = 5; print(x);");
  }

  // =========================================================
  // 8. tryRemoveAssignment(): INC/DEC ที่ parent ไม่ตรงเงื่อนไขใดเลย
  //    -> เข้า else -> "Cannot replace" -> ไม่แก้ไข (fallback branch)
  //    หมายเหตุ: ผลลัพธ์ "ไม่เปลี่ยนแปลง" นี้ตรงกับทั้งกรณี branch ถูกเรียก
  //    และกรณีไม่ถูกเรียกเลย จึงยืนยัน branch ได้จาก source trace เท่านั้น
  // =========================================================
  public void testIncrementInReturnLeftUnchanged() {
    inFunction("var x; return x++;");
  }

  // =========================================================
  // 9. self-assignment (a = a) ถูกลบทิ้งเสมอ ไม่ว่า liveness จะเป็นอย่างไร
  // =========================================================
  public void testSelfAssignmentAlwaysRemoved() {
    inFunction("var x; x = 5; x = x; print(x);",
               "var x; x = 5; x; print(x);");
  }

  // =========================================================
  // 10. tryRemoveDeadAssignments(): switch-case ของ IF / WHILE / DO
  // =========================================================
  public void testIfConditionDeadAssignmentRemoved() {
    inFunction("var x; if (x = 1) {} x = 2; print(x);",
               "var x; if (1) {} x = 2; print(x);");
  }

  public void testWhileConditionDeadAssignmentRemoved() {
    inFunction("var x; while (x = 1) { break; } x = 2; print(x);",
               "var x; while (1) { break; } x = 2; print(x);");
  }

  public void testDoWhileConditionDeadAssignmentRemoved() {
    inFunction("var x; do { } while (x = 1); x = 2; print(x);",
               "var x; do { } while (1); x = 2; print(x);");
  }

  // =========================================================
  // 11. case Token.FOR: !isForIn -> ประมวลผล condition expression
  // =========================================================
  public void testForConditionDeadAssignmentRemoved() {
    inFunction("var x; for (;x = 1;) { break; } x = 2; print(x);",
               "var x; for (;1;) { break; } x = 2; print(x);");
  }

  // =========================================================
  // 12. case Token.FOR: isForIn == true -> continue โดยไม่เรียก
  //     tryRemoveAssignment กับ header เลย (smoke test / no crash)
  // =========================================================
  public void testForInLoopHeaderNotProcessed() {
    inFunction("var x; var obj; for (x in obj) { print(x); }");
  }

  // =========================================================
  // 13. case Token.SWITCH / Token.CASE: hasChildren() -> firstChild
  // =========================================================
  public void testSwitchDiscriminantDeadAssignmentRemoved() {
    inFunction(
        "var x; var y; switch (x = 1) { case 2: y = 3; } x = 4; print(x); print(y);",
        "var x; var y; switch (1) { case 2: y = 3; } x = 4; print(x); print(y);");
  }

  public void testCaseLabelDeadAssignmentRemoved() {
    inFunction(
        "var x; var y; switch (y) { case (x = 1): break; } x = 2; print(x);",
        "var x; var y; switch (y) { case 1: break; } x = 2; print(x);");
  }

  // =========================================================
  // 14. case Token.RETURN: hasChildren() true/false, child เป็น/ไม่เป็น assign
  // =========================================================
  public void testReturnWithDeadAssignmentBeforeItRemoved() {
    // ทดสอบว่า RETURN ที่ไม่มี children (hasChildren()==false) ไม่ทำให้เกิด
    // ข้อผิดพลาด และไม่กระทบการลบ dead assignment ของ statement ก่อนหน้า
    inFunction("var x; x = 1; return;",
               "var x; 1; return;");
  }

  public void testReturnWithNonAssignmentChildNoChange() {
    inFunction("var x; x = 5; return x;");
  }

  public void testReturnDeadAssignmentRemoved() {
    // return x = 1; -> x ไม่ถูกอ่านอีกหลังจากนี้ (function จบแล้ว)
    // จึงถือว่า dead -> ASSIGN ถูกแทนที่ด้วย rhs
    inFunction("var x; return x = 1;",
               "var x; return 1;");
  }

  // =========================================================
  // 15. Recursion บน RHS ก่อน (dead_x = dead_y = 1;)
  // =========================================================
  public void testOuterDeadInnerLiveNestedAssignment() {
    // inner (y=1) ยังมีชีวิตอยู่เพราะถูก print(y) อ่านต่อ -> ไม่ถูกลบ
    // outer (x=...) dead เพราะถูก x=2 overwrite ก่อนถูกอ่าน -> ถูกลบ
    // เหลือแค่ inner assignment ยืนอยู่เดี่ยว ๆ
    inFunction(
        "var x; var y; x = (y = 1); x = 2; print(x); print(y);",
        "var x; var y; y = 1; x = 2; print(x); print(y);");
  }

  public void testCascadingNestedDeadAssignmentsRemoved() {
    // ทั้ง inner (y) และ outer (x) dead ทั้งคู่ -> ลบทั้งคู่ เหลือ literal 1;
    inFunction(
        "var x; var y; x = y = 1; x = 2; y = 3; print(x); print(y);",
        "var x; var y; 1; x = 2; y = 3; print(x); print(y);");
  }

  // =========================================================
  // 16. process(): Preconditions.checkNotNull(externs/root)
  // =========================================================
  public void testProcessNullExternsThrowsNPE() {
    DeadAssignmentsElimination pass =
        new DeadAssignmentsElimination(new Compiler());
    try {
      pass.process(null, new Node(com.google.javascript.rhino.Token.BLOCK));
      fail("Expected NullPointerException when externs is null");
    } catch (NullPointerException expected) {
      // expected
    }
  }

  public void testProcessNullRootThrowsNPE() {
    DeadAssignmentsElimination pass =
        new DeadAssignmentsElimination(new Compiler());
    try {
      pass.process(new Node(com.google.javascript.rhino.Token.BLOCK), null);
      fail("Expected NullPointerException when root is null");
    } catch (NullPointerException expected) {
      // expected
    }
  }
}
```

## ตารางสรุป Branch/Condition ที่ครอบคลุม

| เมธอดทดสอบ | Branch/Condition ที่ครอบคลุม |
|---|---|
| testGlobalScopeAssignmentsNotRemoved | `enterScope`: `scope.isGlobal()==true` → return |
| testNoRemovableAssignmentsNoChange, testEmptyFunctionBodyNoChange | `enterScope`: `NodeUtil.has(...)==false` → return |
| testNestedFunctionPreventsAnalysis | `enterScope`: `containsFunction(fnBlock)==true` → return |
| testSimpleDeadAssignmentRemoved | `tryRemoveAssignment`: ASSIGN + dead (`out.isLive==false`) → replace with rhs |
| testLiveAssignmentNotRemoved | `state.getOut().isLive(var)==true` → return (ไม่ลบ) |
| testDeadCompoundAssignmentConvertedToBinaryOp | `isAssignmentOp && !isAssign` → แปลงเป็น binary op |
| testDeadIncrementStatementReplacedWithVoid | INC/DEC + `isExpressionNode(parent)==true` → VOID |
| testDeadIncrementInForUpdateClauseReplacedWithEmpty | INC/DEC + `parent==FOR && !isForIn && cond!=n` → EMPTY |
| testIncrementInReturnLeftUnchanged | INC/DEC เข้า else สุดท้าย (ไม่มี branch ใดตรง) → ไม่แก้ไข |
| testSelfAssignmentAlwaysRemoved | เงื่อนไข identity assign `a=a` → ลบทันทีไม่ดู liveness |
| testIfConditionDeadAssignmentRemoved | `switch(n.getType())` case `IF` |
| testWhileConditionDeadAssignmentRemoved | case `WHILE` |
| testDoWhileConditionDeadAssignmentRemoved | case `DO` |
| testForConditionDeadAssignmentRemoved | case `FOR` + `!isForIn()==true` |
| testForInLoopHeaderNotProcessed | case `FOR` + `isForIn()==true` (ข้าม) |
| testSwitchDiscriminantDeadAssignmentRemoved | case `SWITCH`, `hasChildren()==true` |
| testCaseLabelDeadAssignmentRemoved | case `CASE`, `hasChildren()==true` |
| testReturnWithDeadAssignmentBeforeItRemoved | case `RETURN`, `hasChildren()==false` |
| testReturnWithNonAssignmentChildNoChange | RETURN child ไม่ใช่ assign → else-recursion loop ไม่เปลี่ยนอะไร |
| testReturnDeadAssignmentRemoved | case `RETURN`, `hasChildren()==true` + ASSIGN dead |
| testOuterDeadInnerLiveNestedAssignment | recursion บน `rhs` ก่อน, inner live/outer dead |
| testCascadingNestedDeadAssignmentsRemoved | recursion บน `rhs`, ทั้ง inner และ outer dead (cascading) |
| testProcessNullExternsThrowsNPE | `Preconditions.checkNotNull(externs)` |
| testProcessNullRootThrowsNPE | `Preconditions.checkNotNull(root)` |

**ข้อจำกัดที่ยังไม่ครอบคลุม (ระบุตามข้อกำหนดที่ 4 แทนการเดา):**
- Branch `n.getType() == Token.COMMA` ใน `tryRemoveAssignment` (ส่วน INC/DEC) **ไม่สามารถเข้าถึงได้จริง** เพราะอยู่ภายใต้เงื่อนไขที่ `n` ถูกยืนยันแล้วว่าเป็น `INC`/`DEC` เท่านั้น (ไม่ใช่ `COMMA`) — จึงไม่สามารถเขียนเทสให้ branch นี้เป็น true ได้ตามซอร์สที่ให้มา
- `liveness.getEscapedLocals().contains(var)` — ตาม logic ของ `enterScope`, scope ที่ผ่านการ `containsFunction` check (ไม่มี nested function) ไม่ควรมีตัวแปรที่ escape ผ่าน closure ได้ จึงไม่สามารถสร้างเทสที่ทำให้เงื่อนไขนี้เป็น `true` ได้อย่างมั่นใจโดยไม่เดา
- Branch ของ `isVariableStillLiveWithinExpression`/`isVariableReadBeforeKill` ที่เกี่ยวกับ `AND/OR/HOOK` มี logic ซับซ้อนมาก และมีลักษณะ code ที่ไม่สมบูรณ์ (fall-through switch แบบไม่มี break ที่ดูผิดปกติ) — ไม่ใส่เทสที่ assert ผลลัพธ์เฉพาะเจาะจงเพื่อป้องกันการเดา behavior ผิด