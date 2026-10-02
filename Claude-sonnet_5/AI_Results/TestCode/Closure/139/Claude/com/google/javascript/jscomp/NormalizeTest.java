package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

/**
 * Unit tests for {@link Normalize} / {@link Normalize.NormalizeStatements}.
 *
 * ดูหมายเหตุเรื่องขอบเขตการทดสอบและสมมติฐานที่ท้ายคำอธิบายก่อนโค้ดนี้.
 */
public class NormalizeTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    // สมมติฐาน (ไม่มี source ยืนยัน): Compiler มี no-arg constructor
    // ที่สร้าง instance พร้อมใช้งานได้โดยไม่ต้อง setup เพิ่มเติม
    compiler = new Compiler();
  }

  private Normalize.NormalizeStatements newStatements(boolean assertOnChange) {
    return new Normalize.NormalizeStatements(compiler, assertOnChange);
  }

  /** นับจำนวน children โดยใช้เฉพาะ getFirstChild()/getNext() ที่ยืนยันจาก source */
  private static int countChildren(Node n) {
    int count = 0;
    for (Node c = n.getFirstChild(); c != null; c = c.getNext()) {
      count++;
    }
    return count;
  }

  // ---------------------------------------------------------------------
  // visit(): WHILE -> FOR conversion
  // ---------------------------------------------------------------------

  @Test
  public void testVisit_whileNode_mutatesBeforeThrow_withAssertOnChange() {
    Node cond = new Node(Token.EMPTY); // placeholder, type ไม่ถูกตรวจสอบใน visit()
    Node body = new Node(Token.BLOCK);
    Node whileNode = new Node(Token.WHILE, cond);
    whileNode.addChildAfter(body, cond);

    Normalize.NormalizeStatements ns = newStatements(true);
    try {
      ns.visit(null, whileNode, null);
      fail("Expected IllegalStateException due to assertOnChange=true");
    } catch (IllegalStateException expected) {
      // mutate เกิดขึ้นก่อนเรียก reportCodeChange แล้ว ตรวจสอบผลลัพธ์ได้
    }

    assertEquals(Token.FOR, whileNode.getType());
    assertEquals(4, countChildren(whileNode)); // EMPTY, cond, EMPTY, body
    Node c1 = whileNode.getFirstChild();
    Node c2 = c1.getNext();
    Node c3 = c2.getNext();
    Node c4 = c3.getNext();
    assertEquals(Token.EMPTY, c1.getType());
    assertSame(cond, c2);
    assertEquals(Token.EMPTY, c3.getType());
    assertSame(body, c4);
  }

  @Test
  public void testVisit_whileNode_noAssertOnChange_convertsToFor() {
    // ทดสอบ branch assertOnChange=false (เรียก compiler.reportCodeChange() จริง)
    Node cond = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node whileNode = new Node(Token.WHILE, cond);
    whileNode.addChildAfter(body, cond);

    Normalize.NormalizeStatements ns = newStatements(false);
    ns.visit(null, whileNode, null);

    assertEquals(Token.FOR, whileNode.getType());
    assertEquals(4, countChildren(whileNode));
  }

  @Test
  public void testVisit_nonWhileNode_isNoOp() {
    Node block = new Node(Token.BLOCK);
    Normalize.NormalizeStatements ns = newStatements(true);
    ns.visit(null, block, null); // default case: ไม่ throw, ไม่เปลี่ยนแปลง
    assertEquals(Token.BLOCK, block.getType());
    assertEquals(0, countChildren(block));
  }

  // ---------------------------------------------------------------------
  // shouldTraverse(): ควร return true เสมอ
  // ---------------------------------------------------------------------

  @Test
  public void testShouldTraverse_alwaysReturnsTrue() {
    Node block = new Node(Token.BLOCK);
    Normalize.NormalizeStatements ns = newStatements(true);
    assertTrue(ns.shouldTraverse(null, block, null));
  }

  // ---------------------------------------------------------------------
  // normalizeLabels(): case LABEL/BLOCK/FOR/WHILE/DO -> no change
  // ---------------------------------------------------------------------

  @Test
  public void testLabel_lastChildBlock_noChange() {
    Node labelName = new Node(Token.NAME);
    Node block = new Node(Token.BLOCK);
    Node labelNode = new Node(Token.LABEL, labelName);
    labelNode.addChildAfter(block, labelName);

    Normalize.NormalizeStatements ns = newStatements(true); // ไม่ควร throw
    ns.shouldTraverse(null, labelNode, null);

    assertSame(block, labelNode.getLastChild());
    assertEquals(Token.BLOCK, labelNode.getLastChild().getType());
  }

  @Test
  public void testLabel_lastChildLabel_noChange() {
    Node labelName = new Node(Token.NAME);
    Node innerLabelName = new Node(Token.NAME);
    Node innerBlock = new Node(Token.BLOCK);
    Node innerLabel = new Node(Token.LABEL, innerLabelName);
    innerLabel.addChildAfter(innerBlock, innerLabelName);

    Node outerLabel = new Node(Token.LABEL, labelName);
    outerLabel.addChildAfter(innerLabel, labelName);

    Normalize.NormalizeStatements ns = newStatements(true);
    ns.shouldTraverse(null, outerLabel, null);

    assertSame(innerLabel, outerLabel.getLastChild());
  }

  @Test
  public void testLabel_lastChildFor_noChange() {
    Node labelName = new Node(Token.NAME);
    Node init = new Node(Token.EMPTY);
    Node cond = new Node(Token.EMPTY);
    Node incr = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, init);
    forNode.addChildAfter(cond, init);
    forNode.addChildAfter(incr, cond);
    forNode.addChildAfter(body, incr);

    Node labelNode = new Node(Token.LABEL, labelName);
    labelNode.addChildAfter(forNode, labelName);

    Normalize.NormalizeStatements ns = newStatements(true);
    ns.shouldTraverse(null, labelNode, null);

    assertSame(forNode, labelNode.getLastChild());
  }

  @Test
  public void testLabel_lastChildWhile_noChange() {
    Node labelName = new Node(Token.NAME);
    Node cond = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node whileNode = new Node(Token.WHILE, cond);
    whileNode.addChildAfter(body, cond);

    Node labelNode = new Node(Token.LABEL, labelName);
    labelNode.addChildAfter(whileNode, labelName);

    Normalize.NormalizeStatements ns = newStatements(true);
    ns.shouldTraverse(null, labelNode, null);

    assertSame(whileNode, labelNode.getLastChild());
  }

  @Test
  public void testLabel_lastChildDo_noChange() {
    Node labelName = new Node(Token.NAME);
    Node doNode = new Node(Token.DO);

    Node labelNode = new Node(Token.LABEL, labelName);
    labelNode.addChildAfter(doNode, labelName);

    Normalize.NormalizeStatements ns = newStatements(true);
    ns.shouldTraverse(null, labelNode, null);

    assertSame(doNode, labelNode.getLastChild());
  }

  @Test
  public void testLabel_defaultCase_wrapsInBlock() {
    Node labelName = new Node(Token.NAME);
    Node stmt = new Node(Token.EXPR_RESULT, new Node(Token.NAME));

    Node labelNode = new Node(Token.LABEL, labelName);
    labelNode.addChildAfter(stmt, labelName);

    Normalize.NormalizeStatements ns = newStatements(true);
    try {
      ns.shouldTraverse(null, labelNode, null);
      fail("Expected IllegalStateException due to assertOnChange=true");
    } catch (IllegalStateException expected) {
      // mutate เกิดก่อน reportCodeChange แล้ว
    }

    Node last = labelNode.getLastChild();
    assertEquals(Token.BLOCK, last.getType());
    assertSame(stmt, last.getFirstChild());
  }

  // ---------------------------------------------------------------------
  // extractForInitializer()
  // ---------------------------------------------------------------------

  @Test
  public void testExtractForInitializer_emptyInit_noChange() {
    Node emptyInit = new Node(Token.EMPTY);
    Node cond = new Node(Token.EMPTY);
    Node incr = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, emptyInit);
    forNode.addChildAfter(cond, emptyInit);
    forNode.addChildAfter(incr, cond);
    forNode.addChildAfter(body, incr);

    Node blockParent = new Node(Token.BLOCK, forNode);

    Normalize.NormalizeStatements ns = newStatements(true); // ไม่ควร throw
    ns.shouldTraverse(null, blockParent, null);

    assertEquals(1, countChildren(blockParent));
    assertSame(forNode, blockParent.getFirstChild());
    assertSame(emptyInit, forNode.getFirstChild());
  }

  @Test
  public void testExtractForInitializer_varInit_extractedBeforeFor() {
    Node varName = new Node(Token.NAME);
    Node varInit = new Node(Token.VAR, varName);
    Node cond = new Node(Token.EMPTY);
    Node incr = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, varInit);
    forNode.addChildAfter(cond, varInit);
    forNode.addChildAfter(incr, cond);
    forNode.addChildAfter(body, incr);

    Node blockParent = new Node(Token.BLOCK, forNode);

    Normalize.NormalizeStatements ns = newStatements(true);
    try {
      ns.shouldTraverse(null, blockParent, null);
      fail("Expected IllegalStateException due to assertOnChange=true");
    } catch (IllegalStateException expected) {
      // mutate เกิดก่อน throw แล้ว
    }

    assertEquals(2, countChildren(blockParent));
    assertSame(varInit, blockParent.getFirstChild());
    assertEquals(Token.VAR, blockParent.getFirstChild().getType());
    assertSame(forNode, blockParent.getFirstChild().getNext());
    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test
  public void testExtractForInitializer_exprInit_wrappedAndExtracted() {
    // หมายเหตุ: NodeUtil.newExpr(init) ไม่มี source ให้ยืนยัน exact behavior
    // คาดหวังตาม pattern ที่ใช้ในไฟล์เดียวกัน (EXPR_RESULT ครอบ expression)
    Node lhs = new Node(Token.NAME);
    Node rhs = new Node(Token.NAME);
    Node assignInit = new Node(Token.ASSIGN, lhs, rhs);

    Node cond = new Node(Token.EMPTY);
    Node incr = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, assignInit);
    forNode.addChildAfter(cond, assignInit);
    forNode.addChildAfter(incr, cond);
    forNode.addChildAfter(body, incr);

    Node blockParent = new Node(Token.BLOCK, forNode);

    Normalize.NormalizeStatements ns = newStatements(true);
    try {
      ns.shouldTraverse(null, blockParent, null);
      fail("Expected IllegalStateException due to assertOnChange=true");
    } catch (IllegalStateException expected) {
      // mutate เกิดก่อน throw แล้ว
    }

    assertEquals(2, countChildren(blockParent));
    Node extracted = blockParent.getFirstChild();
    assertEquals(Token.EXPR_RESULT, extracted.getType());
    assertSame(assignInit, extracted.getFirstChild());
    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  @Test
  public void testExtractForInitializer_nestedInLabel_hoistedBeforeLabel() {
    Node varName = new Node(Token.NAME);
    Node varInit = new Node(Token.VAR, varName);
    Node cond = new Node(Token.EMPTY);
    Node incr = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, varInit);
    forNode.addChildAfter(cond, varInit);
    forNode.addChildAfter(incr, cond);
    forNode.addChildAfter(body, incr);

    Node labelName = new Node(Token.NAME);
    Node labelNode = new Node(Token.LABEL, labelName);
    labelNode.addChildAfter(forNode, labelName);

    Node blockParent = new Node(Token.BLOCK, labelNode);

    Normalize.NormalizeStatements ns = newStatements(true);
    try {
      ns.shouldTraverse(null, blockParent, null);
      fail("Expected IllegalStateException due to assertOnChange=true");
    } catch (IllegalStateException expected) {
      // mutate เกิดก่อน throw แล้ว (ทดสอบ recursion ผ่าน case LABEL)
    }

    assertEquals(2, countChildren(blockParent));
    assertSame(varInit, blockParent.getFirstChild());
    assertSame(labelNode, blockParent.getFirstChild().getNext());
    assertEquals(Token.EMPTY, forNode.getFirstChild().getType());
  }

  // ---------------------------------------------------------------------
  // splitVarDeclarations()
  // ---------------------------------------------------------------------

  @Test
  public void testSplitVarDeclarations_multipleNames_splitsIntoTwoVars() {
    Node name1 = new Node(Token.NAME);
    Node name2 = new Node(Token.NAME);
    Node varNode = new Node(Token.VAR, name1);
    varNode.addChildAfter(name2, name1);

    Node blockParent = new Node(Token.BLOCK, varNode);

    Normalize.NormalizeStatements ns = newStatements(true);
    try {
      ns.shouldTraverse(null, blockParent, null);
      fail("Expected IllegalStateException due to assertOnChange=true");
    } catch (IllegalStateException expected) {
      // การแยก VAR แรก (1 iteration ของ while) เกิดก่อน throw แล้ว
    }

    assertEquals(2, countChildren(blockParent));
    Node first = blockParent.getFirstChild();
    Node second = first.getNext();
    assertEquals(Token.VAR, first.getType());
    assertSame(name1, first.getFirstChild());
    assertSame(varNode, second);
    assertSame(name2, varNode.getFirstChild());
  }

  @Test
  public void testSplitVarDeclarations_singleName_noChange() {
    Node name1 = new Node(Token.NAME);
    Node varNode = new Node(Token.VAR, name1);
    Node blockParent = new Node(Token.BLOCK, varNode);

    Normalize.NormalizeStatements ns = newStatements(true); // ไม่ควร throw
    ns.shouldTraverse(null, blockParent, null);

    assertEquals(1, countChildren(blockParent));
    assertSame(varNode, blockParent.getFirstChild());
  }

  @Test(expected = IllegalStateException.class)
  public void testSplitVarDeclarations_emptyVarNode_withAssertOnChange_throws() {
    Node varNode = new Node(Token.VAR); // ไม่มี children (boundary case)
    Node blockParent = new Node(Token.BLOCK, varNode);

    Normalize.NormalizeStatements ns = newStatements(true);
    ns.shouldTraverse(null, blockParent, null);
  }

  @Test
  public void testSplitVarDeclarations_emptyVarNode_withoutAssertOnChange_noThrow() {
    // assertOnChange=false: เงื่อนไข (assertOnChange && !hasChildren) เป็น false
    // ไม่ throw และ while loop ไม่ทำงาน (ไม่มีการเปลี่ยนแปลง)
    Node varNode = new Node(Token.VAR);
    Node blockParent = new Node(Token.BLOCK, varNode);

    Normalize.NormalizeStatements ns = newStatements(false);
    ns.shouldTraverse(null, blockParent, null);

    assertEquals(1, countChildren(blockParent));
    assertFalse(varNode.hasChildren());
  }

  // ---------------------------------------------------------------------
  // doStatementNormalizations(): FUNCTION branch (moveNamedFunctions)
  // ---------------------------------------------------------------------

  @Test
  public void testFunctionNode_emptyBody_noChangeNoException() {
    // ทดสอบเฉพาะ branch ที่ปลอดภัย (functionBody ว่าง) เพื่อหลีกเลี่ยงการเดา
    // behavior ของ NodeUtil.isFunctionDeclaration ซึ่งไม่มี source ให้ตรวจสอบ
    Node funcName = new Node(Token.NAME);
    Node params = new Node(Token.EMPTY); // placeholder แทน parameter list
    Node funcBody = new Node(Token.BLOCK);
    Node funcNode = new Node(Token.FUNCTION, funcName);
    funcNode.addChildAfter(params, funcName);
    funcNode.addChildAfter(funcBody, params);

    Normalize.NormalizeStatements ns = newStatements(true);
    boolean result = ns.shouldTraverse(null, funcNode, null);

    assertTrue(result);
    assertNull(funcBody.getFirstChild());
  }
}
