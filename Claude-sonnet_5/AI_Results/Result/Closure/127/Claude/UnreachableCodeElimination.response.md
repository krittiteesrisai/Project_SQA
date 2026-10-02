# หมายเหตุสำคัญก่อนเริ่ม (โปรดอ่าน)

คลาส `UnreachableCodeElimination` เป็น package-private class ที่พึ่งพาโครงสร้างภายในของ Closure Compiler อย่างลึก (`AbstractCompiler`, `ControlFlowAnalysis`, `GraphReachability`, `NodeUtil`, `NodeTraversal` ฯลฯ) การสร้าง mock ทุกส่วนเพื่อ unit test แบบ isolate สมบูรณ์จะต้อง "เดา" พฤติกรรมของคลาสเหล่านี้ซึ่งไม่มีอยู่ในซอร์สที่ให้มา — จึงขัดกับข้อกำหนดที่ 4

ดังนั้นวิธีที่ปลอดภัยที่สุดในการทดสอบพฤติกรรม (behavior) ของคลาสนี้โดยไม่ต้องเดาโค้ดภายในที่ไม่ได้ให้มา คือใช้ `CompilerTestCase` ซึ่งเป็น test-support class ที่อยู่ใน **source tree เดียวกัน** กับคลาสเป้าหมาย (ไม่ใช่ third-party jar แยกต่างหาก) เพื่อ compile ตัวอย่างซอร์ส JS จริงแล้วตรวจสอบผลลัพธ์ AST ที่ผ่าน `process()` — วิธีนี้คือวิธีที่ต้นฉบับโปรเจกต์ Closure Compiler ใช้ทดสอบคลาสนี้เองเช่นกัน

จุดใดที่ผมไม่สามารถยืนยัน branch ที่ถูกกระตุ้นจริงได้ 100% จากซอร์สที่ให้มา (เช่น BLOCK-inside-TRY, CATCH+finally, FOR-IN header, EMPTY statement, cascading break หลายชั้น) จะมีคอมเมนต์กำกับไว้ชัดเจนตามข้อกำหนดที่ 4

```java
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
```

## สรุปการครอบคลุม Branch/Condition ในแต่ละเมธอด

| Test Method | Branch/Condition ที่ครอบคลุม |
|---|---|
| testFunctionDeclarationNeverTouchedEvenIfUnreachable | `visit()`: `n.isFunction()` → return ทันที |
| testEmptyFunctionBodyDoesNotThrow | Boundary: ฟังก์ชันไม่มี statement เลย |
| testEmptyProgramDoesNotThrow | Boundary/empty input ระดับ top-level |
| testRemoveDeadCodeAfterReturn_defaultCase | `gNode.getAnnotation()!=REACHABLE` → `removeDeadExprStatementSafely` → default case → `removeNode` |
| testKeepDeadVarDeclarationWithoutInitializer | `n.isVar() && !firstChild.hasChildren()` → return (ไม่ลบ) |
| testDoNotRemoveUnreachableDoWhile | `switch`: `case Token.DO` → return |
| testDoNotRemoveUnreachableEmptyBlock | `n.isBlock() && !n.hasChildren()` → return |
| testRemoveUselessReturnInsideIf | `case RETURN` (no children) → fallthrough → outEdges==1, next==null, target==follow → removeNode |
| testRemoveUselessReturnInsideElse | เหมือนข้างบน แต่ else-branch (if/else ทั้งสองสาขา) |
| testRemoveTrailingUselessReturnAtEndOfFunction | RETURN ที่ท้ายฟังก์ชัน, target==function exit |
| testKeepReturnWithValue | `case RETURN: if (n.hasChildren()) break;` → ไม่พยายามลบ |
| testRemoveUselessBreakAtEndOfLoop | `case BREAK`, outEdges==1, next==null, target==follow |
| testRemoveUselessContinueAtEndOfLoop | `case CONTINUE`, ตรรกะเดียวกับ BREAK |
| testKeepBreakFollowedByPersistentDeadVarDecl | `n.getNext()!=null` → ไม่ลบ (ร่วมกับ branch var-no-initializer) |
| testCascadingUselessBreakInLabeledBlock_singleLevel | do-while(codeChanged) fixpoint loop + BREAK removal ใน labeled block |
| testRemoveNoOpStatementWhenFlagEnabled | `removeNoOpStatements && !mayHaveSideEffects(n)` = true → removeDeadExprStatementSafely |
| testKeepNoOpStatementWhenFlagDisabled | เงื่อนไขเดียวกัน แต่ flag=false → ไม่ลบ, ไป tryRemoveUnconditionalBranching (no-op) |
| testKeepStatementWithSideEffectsEvenWhenFlagEnabled | `mayHaveSideEffects==true` → เงื่อนไข AND false → ไม่ลบ |
| testForInLoopStructurePreservedWithNoOpRemovalEnabled | (uncertain) `NodeUtil.isForIn(parent)` guard — ทดสอบเชิงสังเกตเท่านั้น |

**กรณีที่ไม่ได้ทดสอบและเหตุผล (ตามข้อกำหนดที่ 4):**
- `n.isEmpty()` (empty statement `;`) — ไม่แน่ใจว่า parser คง node EMPTY ไว้หรือถูกลดรูปตั้งแต่ parse
- `BLOCK` เป็นส่วนของ `TRY` container (`isTryCatchNodeContainer`) และ `CATCH` + `maybeAddFinally` — ไม่มี implementation ให้ในซอร์ส ไม่สามารถยืนยัน expected AST แบบ black-box ได้อย่างมั่นใจ
- `outEdges.size()!=1` สำหรับ BREAK/CONTINUE — ต้องพึ่งพา CFG edge modeling ของ try/finally ที่ไม่ได้ระบุรายละเอียดในซอร์สที่ให้มา
- Cascading break หลายชั้น (3+ levels) ตามตัวอย่างใน javadoc — ทดสอบเพียง 1 ชั้นเพื่อลดความเสี่ยงจากการเดาผลลัพธ์ที่แม่นยำ