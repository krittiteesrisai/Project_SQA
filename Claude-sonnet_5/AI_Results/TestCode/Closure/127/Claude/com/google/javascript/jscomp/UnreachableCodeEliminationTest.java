package com.google.javascript.jscomp;

import org.junit.Test;

/**
 * Unit test สำหรับ {@link UnreachableCodeElimination} (Defects4J: Closure-127b)
 *
 * ทดสอบผ่าน {@code CompilerTestCase} ซึ่งเป็นคลาสช่วยทดสอบที่อยู่ใน source tree
 * เดียวกันกับคลาสเป้าหมาย (ไม่ใช่ jar ภายนอกตามรายการที่กำหนด) เนื่องจากคลาสเป้าหมาย
 * ต้องพึ่งพา CFG/Reachability ที่คำนวณจริงจาก AbstractCompiler การ mock ทั้งหมด
 * จะทำให้ต้องเดา behavior ภายในที่ไม่มีอยู่ในซอร์สที่ให้มา
 */
public class UnreachableCodeEliminationTest extends CompilerTestCase {

  private boolean removeNoOpStatements = false;

  public UnreachableCodeEliminationTest() {
    // externs ว่าง เพราะเทสส่วนใหญ่ไม่ต้องพึ่ง built-in externs
    super("");
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    removeNoOpStatements = false;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new UnreachableCodeElimination(compiler, removeNoOpStatements);
  }

  // ========================================================================
  // กลุ่ม 1: การข้ามการประมวลผลใน visit() (parent==null / isFunction / isScript)
  // ========================================================================

  @Test
  public void testFunctionDeclarationNeverTouchedEvenIfUnreachable() {
    // Branch: n.isFunction() ใน visit() -> return ทันที แม้ node จะ unreachable
    // (fault-detection: ถ้า guard นี้หลุด ฟังก์ชัน g จะถูกลบทิ้งอย่างผิดๆ)
    testSame("function f(){ return; function g(){} }");
  }

  @Test
  public void testEmptyFunctionBodyDoesNotThrow() {
    // Boundary: ไม่มี statement ใด ๆ ให้ traverse เลย (CFG มีแค่ entry/exit)
    testSame("function f(){}");
  }

  @Test
  public void testEmptyProgramDoesNotThrow() {
    // Boundary: null/empty input ระดับ top-level
    testSame("");
  }

  // ========================================================================
  // กลุ่ม 2: gNode.getAnnotation() != REACHABLE -> removeDeadExprStatementSafely
  // ========================================================================

  @Test
  public void testRemoveDeadCodeAfterReturn_defaultCase() {
    // Branch: unreachable node -> removeDeadExprStatementSafely -> default -> removeNode
    test("function f(){ return; var x = 1; }",
         "function f(){ return; }");
  }

  @Test
  public void testKeepDeadVarDeclarationWithoutInitializer() {
    // Branch: n.isVar() && !n.getFirstChild().hasChildren() -> return (ไม่ลบ)
    testSame("function f(){ return; var x; }");
  }

  @Test
  public void testDoNotRemoveUnreachableDoWhile() {
    // Branch: switch(n.getType()) case Token.DO -> return (ไม่ลบ DO ที่ unreachable)
    testSame("function f(){ return; do { x(); } while (y); }");
  }

  @Test
  public void testDoNotRemoveUnreachableEmptyBlock() {
    // Branch: n.isBlock() && !n.hasChildren() -> return (ไม่ลบ block ว่าง)
    testSame("function f(){ return; { } }");
  }

  // หมายเหตุ (uncertain): กรณี n.isEmpty() (empty statement ";"), การรวม BLOCK เป็น
  // ส่วนของ TRY container (isTryCatchNodeContainer), และ CATCH + maybeAddFinally
  // ไม่ถูกทดสอบแยกในที่นี้ เนื่องจากไม่มีรายละเอียด implementation ของ
  // NodeUtil.isTryCatchNodeContainer / NodeUtil.maybeAddFinally ในซอร์สที่ให้มา
  // การกำหนด expected AST แบบ black-box อย่างแม่นยำจึงมีความเสี่ยงสูงที่จะ "เดา"
  // พฤติกรรมที่ไม่ได้ระบุไว้ จึงงดเว้นตามข้อกำหนดที่ 4

  // ========================================================================
  // กลุ่ม 3: tryRemoveUnconditionalBranching - RETURN
  // ========================================================================

  @Test
  public void testRemoveUselessReturnInsideIf() {
    // Branch: RETURN ไม่มี children, outEdges==1, next==null, target==follow -> removeNode
    test("function f(){ if (x) { return; } }",
         "function f(){ if (x) {} }");
  }

  @Test
  public void testRemoveUselessReturnInsideElse() {
    // เหมือนด้านบนแต่ครอบคลุม branch อีกฝั่งของ if/else
    test("function f(){ if (x) { y(); } else { return; } }",
         "function f(){ if (x) { y(); } else {} }");
  }

  @Test
  public void testRemoveTrailingUselessReturnAtEndOfFunction() {
    // Branch เดียวกับข้างบน แต่ return เป็น statement สุดท้ายของฟังก์ชันเลย
    test("function f(){ return; }",
         "function f(){}");
  }

  @Test
  public void testKeepReturnWithValue() {
    // Branch: case Token.RETURN: if (n.hasChildren()) break; -> ไม่พยายามลบเลย
    testSame("function f(){ if (a) { return 1; } return 2; }");
  }

  // ========================================================================
  // กลุ่ม 4: tryRemoveUnconditionalBranching - BREAK / CONTINUE
  // ========================================================================

  @Test
  public void testRemoveUselessBreakAtEndOfLoop() {
    // Branch: case BREAK, outEdges==1, next==null, target==follow -> removeNode
    test("function f(){ while (x) { break; } }",
         "function f(){ while (x) {} }");
  }

  @Test
  public void testRemoveUselessContinueAtEndOfLoop() {
    // Branch: case CONTINUE, ตรรกะเดียวกันกับ BREAK
    test("function f(){ while (x) { continue; } }",
         "function f(){ while (x) {} }");
  }

  @Test
  public void testKeepBreakFollowedByPersistentDeadVarDecl() {
    // Branch: n.getNext() != null -> ไม่พยายามลบ break
    // ("var y;" หลัง break เป็น dead code แต่ไม่ถูกลบ เพราะไม่มี initializer
    //  ตาม branch ในกลุ่ม 2 จึงทำให้ next() ของ break ไม่เป็น null ตลอดไป)
    testSame("function f(){ while (x) { break; var y; } }");
  }

  @Test
  public void testCascadingUselessBreakInLabeledBlock_singleLevel() {
    // ตัวอย่างจาก javadoc ของ tryRemoveUnconditionalBranching (break -> break...)
    // ทดสอบเพียง 1 ชั้นเพื่อความมั่นใจในผลลัพธ์ เพราะกรณีหลายชั้นขึ้นกับรายละเอียด
    // การคำนวณ CFG follow node ที่ไม่ได้ระบุไว้ชัดในซอร์สที่ให้มา (คอมเมนต์กำกับตามข้อ 4)
    test("function f(){ a: { break a; } }",
         "function f(){ a: {} }");
  }

  // ========================================================================
  // กลุ่ม 5: removeNoOpStatements flag
  // ========================================================================

  @Test
  public void testRemoveNoOpStatementWhenFlagEnabled() {
    removeNoOpStatements = true;
    // Branch: removeNoOpStatements && !mayHaveSideEffects(n) -> removeDeadExprStatementSafely
    test("function f(){ true; }",
         "function f(){}");
  }

  @Test
  public void testKeepNoOpStatementWhenFlagDisabled() {
    removeNoOpStatements = false;
    // Branch: reachable + removeNoOpStatements==false -> ไป tryRemoveUnconditionalBranching
    // ซึ่งไม่มีผลกับ statement ที่ไม่ใช่ RETURN/BREAK/CONTINUE -> ไม่มีการเปลี่ยนแปลง
    testSame("function f(){ true; }");
  }

  @Test
  public void testKeepStatementWithSideEffectsEvenWhenFlagEnabled() {
    removeNoOpStatements = true;
    // Branch: NodeUtil.mayHaveSideEffects(n, compiler) == true -> เงื่อนไข AND เป็น false -> ไม่ลบ
    testSame("function f(){ x(); }");
  }

  // ========================================================================
  // กลุ่ม 6: กรณีพิเศษ/ไม่แน่ใจ (คอมเมนต์กำกับตามข้อกำหนดที่ 4)
  // ========================================================================

  @Test
  public void testForInLoopStructurePreservedWithNoOpRemovalEnabled() {
    // เกี่ยวข้องกับ branch: NodeUtil.isForIn(parent) -> return (ไม่ลบ node ใน for-in header)
    // หมายเหตุ (uncertain): ไม่สามารถยืนยันได้แน่ชัดจากซอร์สที่ให้มาว่า node ใดใน
    // for-in header จะถูกเรียก visit() โดยตรงและมี gNode ใน CFG จริงหรือไม่
    // จึงทดสอบเพียงระดับสังเกตว่าโครงสร้าง for-in ไม่ถูกทำลาย/ไม่ throw exception
    removeNoOpStatements = true;
    testSame("function f(){ for (var i in obj) {} }");
  }
}
