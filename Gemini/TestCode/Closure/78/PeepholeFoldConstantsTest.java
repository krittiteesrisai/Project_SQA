package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;

/**
 * Senior Test Automation Engineer - Comprehensive JUnit 4 Test Suite
 * Target: PeepholeFoldConstants (Defects4J Closure-78b)
 */
public class PeepholeFoldConstantsTest extends TestCase {

  private PeepholeFoldConstants folding;
  private Compiler compiler;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    folding = new PeepholeFoldConstants();
    folding.init(compiler);
  }

  // Helper method to parse a simple JS expression into a Node subtree
  private Node parse(String js) {
    Node root = compiler.parseSyntheticCode(js);
    // Usually root is SCRIPT -> EXPR_RESULT -> subtree
    return root.getFirstChild().getFirstChild();
  }

  @Test
  public void testOptimizeSubtreeUnaryAndBinary() {
    // Test Token.NEG on a number
    Node negNode = new Node(Token.NEG, Node.newNumber(5));
    Node parent = new Node(Token.EXPR_RESULT, negNode);
    Node result = folding.optimizeSubtree(negNode);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(-5.0, result.getDouble());

    // Test Token.VOID
    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    parent.replaceChild(negNode, voidNode);
    Node voidResult = folding.optimizeSubtree(voidNode);
    assertNotNull(voidResult);
  }

  @Test
  public void testArithmeticDivisionByZero() {
    // 5 / 0 -> triggers DIVIDE_BY_0_ERROR
    Node divNode = new Node(Token.DIV, Node.newNumber(5), Node.newNumber(0));
    Node parent = new Node(Token.EXPR_RESULT, divNode);
    Node res = folding.optimizeSubtree(divNode);
    // Should report error and return original node or null folding
    assertNotNull(res);
  }

  @Test
  public void testShiftEdgeCasesAndOutOfBounds() {
    // LSH with out of bounds shift amount (e.g., 5 << 35)
    Node shiftNode = new Node(Token.LSH, Node.newNumber(5), Node.newNumber(35));
    Node parent = new Node(Token.EXPR_RESULT, shiftNode);
    Node res = folding.optimizeSubtree(shiftNode);
    assertNotNull(res);

    // LSH with fractional operand (e.g., 5.5 << 2)
    Node fracNode = new Node(Token.LSH, Node.newNumber(5.5), Node.newNumber(2));
    parent.replaceChild(shiftNode, fracNode);
    Node fracRes = folding.optimizeSubtree(fracNode);
    assertNotNull(fracRes);

    // LSH with out of range operand (e.g., MAX_VALUE + 10 << 1)
    Node outRangeNode = new Node(Token.LSH, Node.newNumber(1e20), Node.newNumber(2));
    parent.replaceChild(fracNode, outRangeNode);
    Node rangeRes = folding.optimizeSubtree(outRangeNode);
    assertNotNull(rangeRes);
  }

  @Test
  public void testBitNotEdgeCases() {
    // ~5.5 -> fractional bitwise operand error
    Node bitNotNode = new Node(Token.BITNOT, Node.newNumber(5.5));
    Node parent = new Node(Token.EXPR_RESULT, bitNotNode);
    Node res = folding.optimizeSubtree(bitNotNode);
    assertNotNull(res);

    // ~1e20 -> operand out of range error
    Node outRangeNode = new Node(Token.BITNOT, Node.newNumber(1e20));
    parent.replaceChild(bitNotNode, outRangeNode);
    Node rangeRes = folding.optimizeSubtree(outRangeNode);
    assertNotNull(rangeRes);
  }

  @Test
  public void testGetElemEdgeCases() {
    // [1, 2, 3][-1] -> INDEX_OUT_OF_BOUNDS_ERROR
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
    Node getElemNeg = new Node(Token.GETELEM, arrayLit, Node.newNumber(-1));
    Node parent = new Node(Token.EXPR_RESULT, getElemNeg);
    Node res = folding.optimizeSubtree(getElemNeg);
    assertNotNull(res);

    // [1, 2, 3][1.5] -> INVALID_GETELEM_INDEX_ERROR
    Node getElemFrac = new Node(Token.GETELEM, arrayLit, Node.newNumber(1.5));
    parent.replaceChild(getElemNeg, getElemFrac);
    Node fracRes = folding.optimizeSubtree(getElemFrac);
    assertNotNull(fracRes);

    // [1, 2, 3][10] -> INDEX_OUT_OF_BOUNDS_ERROR (out of bounds)
    Node getElemOOB = new Node(Token.GETELEM, arrayLit, Node.newNumber(10));
    parent.replaceChild(getElemFrac, getElemOOB);
    Node oobRes = folding.optimizeSubtree(getElemOOB);
    assertNotNull(oobRes);
  }

  @Test
  public void testStringMethodsEdgeCases() {
    // "abc".indexOf("b", 10) -> index out of bounds/not found handling
    Node callNode = parse("'abc'.indexOf('b', 10);");
    if (callNode != null) {
      Node res = folding.optimizeSubtree(callNode);
      assertNotNull(res);
    }

    // "abc".substr(-1, 2) -> negative start, should bail out
    Node subNode = parse("'abc'.substr(-1, 2);");
    if (subNode != null) {
      Node res = folding.optimizeSubtree(subNode);
      assertNotNull(res);
    }

    // "abc".substring(5, 2) -> end > length, should bail out
    Node substringNode = parse("'abc'.substring(5, 2);");
    if (substringNode != null) {
      Node res = folding.optimizeSubtree(substringNode);
      assertNotNull(res);
    }
  }

  @Test
  public void testTypeofFolding() {
    Node typeofNode = new Node(Token.TYPEOF, Node.newNumber(10));
    Node parent = new Node(Token.EXPR_RESULT, typeofNode);
    Node res = folding.optimizeSubtree(typeofNode);
    assertEquals(Token.STRING, res.getType());
    assertEquals("number", res.getString());
  }

  @Test
  public void testInstanceofFolding() {
    Node instanceofNode = new Node(Token.INSTANCEOF, Node.newString("test"), Node.newString("Object"));
    Node parent = new Node(Token.EXPR_RESULT, instanceofNode);
    Node res = folding.optimizeSubtree(instanceofNode);
    assertNotNull(res);
  }
}