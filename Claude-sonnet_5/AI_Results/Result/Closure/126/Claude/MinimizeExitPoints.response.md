# วิเคราะห์และแนวทางการทดสอบ

`MinimizeExitPoints` เป็น package-private class ที่ทำงานกับ AST (`Node`) ของ Closure Compiler โดยตรง ไม่ได้ทำ parsing JS string จึงต้องสร้าง AST ด้วยมือ (ผ่าน `Node`/`IR`/`Token`) แล้วเรียกเมธอด `tryMinimizeExits(...)` และ `visit(...)` ตรง ๆ (ทั้งสอง package-private เข้าถึงได้เพราะ test อยู่ package เดียวกัน)

**ข้อควรระวัง (ตามข้อกำหนดที่ 4):** ซอร์สที่ให้มาไม่ได้แสดง signature ของ `Node`, `IR`, `Token`, `NodeUtil`, `Compiler` ทั้งหมด ผมเลือกใช้เฉพาะ API ที่ **ยืนยันได้จากซอร์สโค้ดจริง** (`n.getType()`, `n.isIf()`, `n.isTry()`, `n.isLabel()`, `n.isBlock()`, `n.isEmpty()`, `hasChildren()`, `hasOneChild()`, `getFirstChild/getLastChild/getNext/getParent`, `addChildToBack`, `IR.block()`) ให้มากที่สุด และใช้ helper `new Node(type)` + `addChildToBack` แทนการเดา constructor แบบหลาย-argument เพื่อลดความเสี่ยง ส่วนที่ต้อง "เดา" (เช่น `Node.newString`, ชื่อ `Token.IF/TRY/CATCH/EXPR_RESULT/NAME/FUNCTION/WHILE/DO`, การที่ `NodeUtil.getLoopCodeBlock`/`getImpureBooleanValue` ทำงานตามสัญชาตญาณมาตรฐานของ Closure AST) จะมี **คอมเมนต์ ASSUMPTION กำกับไว้ชัดเจน** ทุกจุด

**จุดสำคัญ:** โค้ดใน `tryMinimizeIfBlockExits`... จุด try/finally มีคอมเมนต์ว่า **"Don't try to minimize the exits of finally blocks"** แต่โค้ดถัดมากลับเรียก `tryMinimizeExits(finallyBlock, ...)` จริง ๆ — นี่คือ fault ที่ตรงกับ Closure-126 ผมเขียนเทสเพื่อ "จับ" ความขัดแย้งนี้โดยตรง (`testTryNode_WithFinally_BUG_...`)

```java
package com.google.javascript.jscomp;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link MinimizeExitPoints} (Defects4J Closure-126b).
 *
 * ASSUMPTIONS (ไม่สามารถยืนยันได้ 100% จากซอร์สที่ให้มา แต่จำเป็นต้องใช้เพื่อสร้าง AST
 * สำหรับทดสอบ, มีคอมเมนต์กำกับซ้ำอีกครั้งตรงจุดที่ใช้งาน):
 * 1) Node มี public constructor Node(int type) และ public addChildToBack(Node).
 * 2) IR.block() สร้าง BLOCK node เปล่า (ยืนยันได้จากซอร์สจริง: IR.block().srcref(...)).
 * 3) Token.IF, Token.TRY, Token.CATCH, Token.EXPR_RESULT, Token.NAME, Token.FUNCTION,
 *    Token.WHILE, Token.DO, Token.TRUE, Token.FALSE มีอยู่จริงตามชื่อมาตรฐานของ Closure AST.
 * 4) Node.newString(int type, String s) ใช้สร้าง node ที่มี getString() คืนค่า s.
 * 5) NodeUtil.getLoopCodeBlock(WHILE) คืนลูกตัวสุดท้าย (body), และสำหรับ DO,
 *    body คือลูกตัวแรก (ยืนยันได้บางส่วนจากซอร์ส: n.getFirstChild() ถูกใช้เป็น body ของ DO
 *    ตรง ๆ ในสาขา BREAK-handling).
 * 6) NodeUtil.getImpureBooleanValue(TRUE/FALSE literal) คืนค่าตาม literal นั้นตรง ๆ.
 * 7) Compiler มี public no-arg constructor และ reportCodeChange() ไม่ final (override ได้).
 */
public class MinimizeExitPointsTest {

  private MinimizeExitPoints pass;

  @Before
  public void setUp() {
    // สร้าง Compiler แบบเบาที่สุด แล้ว override reportCodeChange() เป็น no-op
    // เพื่อตัดการพึ่งพา state ภายในของ Compiler ที่ยังไม่ได้ init (options/error manager)
    Compiler compiler = new Compiler() {
      @Override
      public void reportCodeChange() {
        // no-op สำหรับ unit test นี้
      }
    };
    pass = new MinimizeExitPoints(compiler);
  }

  // ---------- Helpers ----------

  private static Node node(int type, Node... children) {
    Node result = new Node(type);
    for (Node c : children) {
      result.addChildToBack(c);
    }
    return result;
  }

  private static Node blockOf(Node... children) {
    Node b = IR.block();
    for (Node c : children) {
      b.addChildToBack(c);
    }
    return b;
  }

  private static Node nameNode(String value) {
    // ASSUMPTION: ดู header comment ข้อ 4
    return Node.newString(Token.NAME, value);
  }

  // ===================== matchingExitNode (ผ่าน tryMinimizeExits) =====================

  @Test
  public void testMatchingExit_ReturnNoValue_Removed() {
    Node ret = node(Token.RETURN);
    Node parent = blockOf(ret);
    pass.tryMinimizeExits(ret, Token.RETURN, null);
    assertFalse("bare return ต้องถูกลบ", parent.hasChildren());
  }

  @Test
  public void testMatchingExit_ReturnWithValue_NotRemoved() {
    Node ret = node(Token.RETURN, node(Token.TRUE));
    Node parent = blockOf(ret);
    pass.tryMinimizeExits(ret, Token.RETURN, null);
    assertTrue("return ที่มีค่าต้องไม่ถูกลบ", parent.hasChildren());
    assertSame(ret, parent.getFirstChild());
  }

  @Test
  public void testMatchingExit_PlainBreakNoLabelRequired_Removed() {
    Node brk = node(Token.BREAK);
    Node parent = blockOf(brk);
    pass.tryMinimizeExits(brk, Token.BREAK, null);
    assertFalse(parent.hasChildren());
  }

  @Test
  public void testMatchingExit_BreakWithMatchingLabel_Removed() {
    Node brk = node(Token.BREAK, nameNode("L1"));
    Node parent = blockOf(brk);
    pass.tryMinimizeExits(brk, Token.BREAK, "L1");
    assertFalse(parent.hasChildren());
  }

  @Test
  public void testMatchingExit_BreakWithNonMatchingLabel_NotRemoved() {
    Node brk = node(Token.BREAK, nameNode("L2"));
    Node parent = blockOf(brk);
    pass.tryMinimizeExits(brk, Token.BREAK, "L1");
    assertTrue(parent.hasChildren());
  }

  @Test
  public void testMatchingExit_BreakPlainButLabelRequired_NotRemoved() {
    Node brk = node(Token.BREAK); // ไม่มีลูก -> ไม่มี label
    Node parent = blockOf(brk);
    pass.tryMinimizeExits(brk, Token.BREAK, "L1");
    assertTrue(parent.hasChildren());
  }

  @Test
  public void testMatchingExit_ContinueMatch_Removed() {
    Node cont = node(Token.CONTINUE);
    Node parent = blockOf(cont);
    pass.tryMinimizeExits(cont, Token.CONTINUE, null);
    assertFalse(parent.hasChildren());
  }

  // ===================== IF branch =====================

  @Test
  public void testIfNode_BothBranchesRecursed() {
    Node thenBlock = blockOf(node(Token.RETURN));
    Node elseBlock = blockOf(node(Token.RETURN));
    Node ifNode = node(Token.IF, node(Token.TRUE), thenBlock, elseBlock);

    pass.tryMinimizeExits(ifNode, Token.RETURN, null);

    assertFalse("then-block ต้องถูก minimize", thenBlock.hasChildren());
    assertFalse("else-block ต้องถูก minimize", elseBlock.hasChildren());
  }

  @Test
  public void testIfNode_NoElseBranch_NoException() {
    Node thenBlock = blockOf(node(Token.RETURN));
    Node ifNode = node(Token.IF, node(Token.TRUE), thenBlock); // ไม่มี else

    pass.tryMinimizeExits(ifNode, Token.RETURN, null); // ต้องไม่ throw

    assertFalse(thenBlock.hasChildren());
  }

  // ===================== TRY / CATCH / FINALLY =====================

  @Test
  public void testTryNode_NoCatchNoFinally() {
    Node tryBlock = blockOf(node(Token.RETURN));
    Node emptyCatches = blockOf(); // ไม่มี catch handler
    Node tryNode = node(Token.TRY, tryBlock, emptyCatches);

    pass.tryMinimizeExits(tryNode, Token.RETURN, null);

    assertFalse("try-block ต้องถูก minimize", tryBlock.hasChildren());
  }

  @Test
  public void testTryNode_WithCatchHandler_CatchBlockRecursed() {
    Node catchBody = blockOf(node(Token.RETURN));
    Node catchNode = node(Token.CATCH, node(Token.TRUE), catchBody);
    Node catchesBlock = blockOf(catchNode);
    Node tryBlock = blockOf(node(Token.EXPR_RESULT));
    Node tryNode = node(Token.TRY, tryBlock, catchesBlock);

    pass.tryMinimizeExits(tryNode, Token.RETURN, null);

    assertFalse("catch-block ต้องถูก minimize", catchBody.hasChildren());
  }

  /**
   * *** จุดสำคัญ: ทดสอบ fault ของ Closure-126 ***
   * คอมเมนต์ในซอร์สระบุชัดว่า "Don't try to minimize the exits of finally
   * blocks" แต่โค้ดจริงกลับเรียก tryMinimizeExits() บน finally block
   * (ขัดกับคอมเมนต์ของมันเอง) เทสนี้ยืนยัน "สัญญา" ตามคอมเมนต์ ดังนั้นจึง
   * คาดหวังว่าจะ FAIL บนซอร์สที่มี bug นี้ (Closure-126b) — ซึ่งคือเป้าหมาย
   * ของการทดสอบนี้โดยตรง
   */
  @Test
  public void testTryNode_WithFinally_BUG_FinallyExitsShouldNotBeMinimized() {
    Node finallyBlock = blockOf(node(Token.RETURN));
    Node tryBlock = blockOf(node(Token.EXPR_RESULT));
    Node emptyCatches = blockOf();
    Node tryNode = node(Token.TRY, tryBlock, emptyCatches, finallyBlock);

    pass.tryMinimizeExits(tryNode, Token.RETURN, null);

    assertTrue(
        "ตามคอมเมนต์ในซอร์ส finally-block exits ต้องไม่ถูกแก้ไข",
        finallyBlock.hasChildren());
  }

  // ===================== LABEL =====================

  @Test
  public void testLabelNode_RecursesIntoBody() {
    Node body = blockOf(node(Token.RETURN));
    Node labelNode = node(Token.LABEL, nameNode("L"), body);

    pass.tryMinimizeExits(labelNode, Token.RETURN, null);

    assertFalse(body.hasChildren());
  }

  // ===================== Bail-out paths =====================

  @Test
  public void testNonQualifyingNode_BailsOutWithoutChange() {
    Node stmt = node(Token.EXPR_RESULT);
    Node parent = blockOf(stmt);

    pass.tryMinimizeExits(stmt, Token.RETURN, null);

    assertTrue(parent.hasChildren());
    assertSame(stmt, parent.getFirstChild());
  }

  @Test
  public void testEmptyBlock_BailsOutWithoutChange() {
    Node empty = blockOf();
    pass.tryMinimizeExits(empty, Token.RETURN, null); // ต้องไม่ throw
    assertFalse(empty.hasChildren());
  }

  // ===================== Block-scan / tryMinimizeIfBlockExits (indirect) =====================

  @Test
  public void testBlockScan_IfWithNullElse_SiblingMergedIntoNewElseBlock() {
    Node thenStmt = node(Token.RETURN);
    Node ifNode = node(Token.IF, node(Token.TRUE), thenStmt); // ไม่มี else
    Node sibling = node(Token.EXPR_RESULT);
    Node outer = blockOf(ifNode, sibling);

    pass.tryMinimizeExits(outer, Token.RETURN, null);

    assertSame(ifNode, outer.getFirstChild());
    assertSame(ifNode, outer.getLastChild()); // sibling ถูกย้ายออกจาก outer แล้ว
  }

  @Test
  public void testBlockScan_IfWithEmptyTrueBlock_NoMergeHappens() {
    Node emptyThen = blockOf(); // BLOCK ไม่มีลูก -> ไม่มี exit candidate
    Node ifNode = node(Token.IF, node(Token.TRUE), emptyThen);
    Node sibling = node(Token.EXPR_RESULT);
    Node outer = blockOf(ifNode, sibling);

    pass.tryMinimizeExits(outer, Token.RETURN, null);

    assertSame(ifNode, outer.getFirstChild());
    assertSame(sibling, outer.getLastChild());
    assertFalse(emptyThen.hasChildren());
  }

  @Test
  public void testBlockScan_IfWithExistingBlockElse_SiblingsAppendedToExistingBlock() {
    Node thenStmt = node(Token.RETURN);
    Node existingStmt = node(Token.EXPR_RESULT);
    Node elseBlock = blockOf(existingStmt);
    Node ifNode = node(Token.IF, node(Token.TRUE), thenStmt, elseBlock);
    Node sibling = node(Token.EXPR_RESULT);
    Node outer = blockOf(ifNode, sibling);

    pass.tryMinimizeExits(outer, Token.RETURN, null);

    assertSame(ifNode, outer.getFirstChild());
    assertSame(ifNode, outer.getLastChild());
    assertSame(existingStmt, elseBlock.getFirstChild());
    assertSame(sibling, elseBlock.getLastChild());
  }

  @Test
  public void testBlockScan_IfWithSingleStatementElse_WrappedIntoNewBlock() {
    Node thenStmt = node(Token.RETURN);
    Node elseStmt = node(Token.EXPR_RESULT); // single statement, ไม่ใช่ BLOCK
    Node ifNode = node(Token.IF, node(Token.TRUE), thenStmt, elseStmt);
    Node sibling = node(Token.EXPR_RESULT);
    Node outer = blockOf(ifNode, sibling);

    pass.tryMinimizeExits(outer, Token.RETURN, null);

    assertSame(ifNode, outer.getFirstChild());
    assertSame(ifNode, outer.getLastChild());

    Node newElseBlock = ifNode.getLastChild();
    assertTrue(newElseBlock.isBlock());
    assertSame(elseStmt, newElseBlock.getFirstChild());
    assertSame(sibling, newElseBlock.getLastChild());
  }

  // ===================== visit() switch dispatch =====================
  // หมายเหตุ: พารามิเตอร์ NodeTraversal ไม่ถูกใช้ในตัว method visit() เลย
  // จึงเรียก pass.visit(null, n, parent) ได้โดยตรงและปลอดภัย

  @Test
  public void testVisit_LabelCase_DelegatesWithLabelName() {
    Node body = blockOf(node(Token.BREAK, nameNode("L1")));
    Node labelNode = node(Token.LABEL, nameNode("L1"), body);

    pass.visit(null, labelNode, null);

    assertFalse(body.hasChildren());
  }

  @Test
  public void testVisit_WhileCase_DelegatesToLoopBody() {
    // ASSUMPTION: ดู header comment ข้อ 5
    Node body = blockOf(node(Token.CONTINUE));
    Node whileNode = node(Token.WHILE, node(Token.TRUE), body);

    pass.visit(null, whileNode, null);

    assertFalse(body.hasChildren());
  }

  @Test
  public void testVisit_DoCase_ConditionNotStaticallyFalse_BreakNotTouched() {
    // DO ถูกสร้างเป็น (body, condition) — body ใช้ n.getFirstChild() ตรง ๆ
    Node breakStmt = node(Token.BREAK);
    Node body = blockOf(breakStmt);
    Node doNode = node(Token.DO, body, node(Token.TRUE)); // ไม่ false

    pass.visit(null, doNode, null);

    // รอบแรกมองหาแค่ CONTINUE เท่านั้น เพราะ condition ไม่ใช่ false เสมอ
    // BREAK จึงต้องไม่ถูกแก้ไข
    assertTrue(body.hasChildren());
    assertSame(breakStmt, body.getFirstChild());
  }

  @Test
  public void testVisit_DoCase_ConditionStaticallyFalse_BreakAlsoMinimized() {
    Node breakStmt = node(Token.BREAK);
    Node body = blockOf(breakStmt);
    Node doNode = node(Token.DO, body, node(Token.FALSE)); // condition เป็น false เสมอ

    pass.visit(null, doNode, null);

    // ตาม comment ในซอร์ส: เมื่อ condition เป็น false เสมอ ให้ minimize
    // BREAK เหมือน CONTINUE ได้
    assertFalse(body.hasChildren());
  }

  @Test
  public void testVisit_FunctionCase_DelegatesToBody() {
    Node body = blockOf(node(Token.RETURN));
    Node functionNode = node(Token.FUNCTION, body); // visit() ใช้แค่ getLastChild()

    pass.visit(null, functionNode, null);

    assertFalse(body.hasChildren());
  }

  @Test
  public void testVisit_UnrelatedNodeType_NoOp() {
    Node stmt = node(Token.EXPR_RESULT);
    Node parent = blockOf(stmt);

    pass.visit(null, stmt, parent); // ไม่ match case ใดใน switch

    assertTrue(parent.hasChildren());
    assertSame(stmt, parent.getFirstChild());
  }

  // ===================== process() smoke test (bonus) =====================

  @Test
  public void testProcess_SmokeTest_NoExceptionOnTrivialTree() {
    // smoke test ของ public entry point process(); คงต้นไม้ให้เรียบง่าย
    // (ไม่มี LABEL/FOR/WHILE/DO/FUNCTION) เพื่อลดความเสี่ยงต่อ NodeTraversal
    // infra ที่ต้องอาศัย structure เต็มรูปแบบ
    Node root = blockOf();
    pass.process(IR.block(), root); // ต้องไม่ throw
    assertFalse(root.hasChildren());
  }
}
```

## สรุปการครอบคลุม Branch/Condition

| กลุ่ม | เมธอดเทส | Branch/Condition ที่ครอบคลุม |
|---|---|---|
| matchingExitNode | testMatchingExit_ReturnNoValue_Removed | RETURN, `!hasChildren()`==true → ลบ |
| | testMatchingExit_ReturnWithValue_NotRemoved | RETURN, `!hasChildren()`==false → ไม่ลบ |
| | testMatchingExit_PlainBreakNoLabelRequired_Removed | BREAK, labelName==null, `!hasChildren()`==true |
| | testMatchingExit_BreakWithMatchingLabel_Removed | BREAK, labelName!=null, label ตรงกัน |
| | testMatchingExit_BreakWithNonMatchingLabel_NotRemoved | BREAK, labelName!=null, label ไม่ตรง |
| | testMatchingExit_BreakPlainButLabelRequired_NotRemoved | BREAK, labelName!=null แต่ node ไม่มี children |
| | testMatchingExit_ContinueMatch_Removed | type อื่น (CONTINUE) เข้าเงื่อนไข type==type |
| IF | testIfNode_BothBranchesRecursed | `n.isIf()`==true, elseBlock!=null==true |
| | testIfNode_NoElseBranch_NoException | `n.isIf()`==true, elseBlock!=null==false |
| TRY | testTryNode_NoCatchNoFinally | `hasCatchHandler`==false, `hasFinally`==false |
| | testTryNode_WithCatchHandler_CatchBlockRecursed | `hasCatchHandler`==true branch |
| | **testTryNode_WithFinally_BUG_...** | `hasFinally`==true branch — **ดักจับ fault Closure-126** |
| LABEL | testLabelNode_RecursesIntoBody | `n.isLabel()`==true |
| Bail-out | testNonQualifyingNode_BailsOutWithoutChange | `!n.isBlock()` → return |
| | testEmptyBlock_BailsOutWithoutChange | `n.getLastChild()==null` → return |
| Block-scan / if-merge | testBlockScan_IfWithNullElse_... | destBlock==null branch |
| | testBlockScan_IfWithEmptyTrueBlock_... | `!srcBlock.hasChildren()` → return early |
| | testBlockScan_IfWithExistingBlockElse_... | destBlock.isBlock() branch (reuse block) |
| | testBlockScan_IfWithSingleStatementElse_... | destBlock ไม่ null/ไม่ empty/ไม่ block → wrap ใหม่ |