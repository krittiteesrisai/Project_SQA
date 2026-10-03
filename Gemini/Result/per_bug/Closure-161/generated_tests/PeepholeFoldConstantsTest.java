package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Comprehensive JUnit 4 Test Suite for PeepholeFoldConstants (Defects4J Closure-161b)
 * Target: Maximum Branch/Condition Coverage and Edge Case Fault Triggering.
 */
public class PeepholeFoldConstantsTest {

  private PeepholeFoldConstants foldingOptimizer;
  private AbstractCompiler compiler;

  @Before
  public void setUp() {
    foldingOptimizer = new PeepholeFoldConstants();
    compiler = new Compiler();
    // Initialize compiler minimal state needed for code changes/reports
    foldingOptimizer.init(compiler);
  }

  @Test
  public void testOptimizeSubtreeNullAndBasicBranches() {
    // Edge case: subtree with null or default unhandled tokens
    Node emptyNode = new Node(Token.EMPTY);
    Node result = foldingOptimizer.optimizeSubtree(emptyNode);
    assertNotNull(result);
  }

  @Test
  public void testTryFoldTypeof() {
    // typeof(6) --> "number"
    Node typeofNode = new Node(Token.TYPEOF, Node.newNumber(6.0));
    Node parent = new Node(Token.SCRIPT, typeofNode);
    
    Node optimized = foldingOptimizer.optimizeSubtree(typeofNode);
    assertEquals(Token.STRING, optimized.getType());
    assertEquals("number", optimized.getString());
  }

  @Test
  public void testTryFoldTypeofNonLiteral() {
    // typeof(foo) where foo is a NAME without constant literal should remain untouched
    Node nameNode = new Node(Token.NAME, "foo");
    Node typeofNode = new Node(Token.TYPEOF, nameNode);
    Node parent = new Node(Token.SCRIPT, typeofNode);

    Node optimized = foldingOptimizer.optimizeSubtree(typeofNode);
    assertEquals(Token.TYPEOF, optimized.getType());
  }

  @Test
  public void testTryFoldUnaryNotBoundary() {
    // !0 should not be folded back to false (per special check)
    Node numZero = Node.newNumber(0.0);
    Node notNode = new Node(Token.NOT, numZero);
    Node parent = new Node(Token.SCRIPT, notNode);

    Node optimized = foldingOptimizer.optimizeSubtree(notNode);
    assertEquals(Token.NOT, optimized.getType());
  }

  @Test
  public void testTryFoldUnaryNegSpecialValues() {
    // -NaN -> NaN
    Node nanName = Node.newString(Token.NAME, "NaN");
    Node negNode = new Node(Token.NEG, nanName);
    Node parent = new Node(Token.SCRIPT, negNode);

    Node optimized = foldingOptimizer.optimizeSubtree(negNode);
    assertEquals(Token.NAME, optimized.getType());
    assertEquals("NaN", optimized.getString());
  }

  @Test
  public void testTryFoldBitNotOutOfRange() {
    // Bitwise operand out of range or fractional
    Node largeNum = Node.newNumber(Math.pow(2, 35));
    Node bitNotNode = new Node(Token.BITNOT, largeNum);
    Node parent = new Node(Token.SCRIPT, bitNotNode);

    Node optimized = foldingOptimizer.optimizeSubtree(bitNotNode);
    assertEquals(Token.BITNOT, optimized.getType());
  }

  @Test
  public void testTryFoldArithmeticDivisionByZero() {
    // Division by zero should return null from performArithmeticOp, preventing fold crash
    Node left = Node.newNumber(10.0);
    Node right = Node.newNumber(0.0);
    Node divNode = new Node(Token.DIV, left, right);
    Node parent = new Node(Token.SCRIPT, divNode);

    Node optimized = foldingOptimizer.optimizeSubtree(divNode);
    assertEquals(Token.DIV, optimized.getType());
  }

  @Test
  public void testTryFoldArithmeticModByZero() {
    Node left = Node.newNumber(10.0);
    Node right = Node.newNumber(0.0);
    Node modNode = new Node(Token.MOD, left, right);
    Node parent = new Node(Token.SCRIPT, modNode);

    Node optimized = foldingOptimizer.optimizeSubtree(modNode);
    assertEquals(Token.MOD, optimized.getType());
  }

  @Test
  public void testTryFoldArrayAccessValidAndBounds() {
    // [1, 2, 3][1] --> 2
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1.0), Node.newNumber(2.0), Node.newNumber(3.0));
    Node getElem = new Node(Token.GETELEM, arrayLit, Node.newNumber(1.0));
    Node parent = new Node(Token.EXPR_RESULT, getElem);

    Node optimized = foldingOptimizer.optimizeSubtree(getElem);
    assertEquals(Token.NUMBER, optimized.getType());
    assertEquals(2.0, optimized.getDouble(), 0.001);
  }

  @Test
  public void testTryFoldArrayAccessOutOfBounds() {
    // [1, 2][5] -> Index out of bounds error branch
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1.0), Node.newNumber(2.0));
    Node getElem = new Node(Token.GETELEM, arrayLit, Node.newNumber(5.0));
    Node parent = new Node(Token.EXPR_RESULT, getElem);

    Node optimized = foldingOptimizer.optimizeSubtree(getElem);
    assertEquals(Token.GETELEM, optimized.getType());
  }

  @Test
  public void testTryFoldArrayAccessInvalidIndex() {
    // [1, 2][1.5] -> Non-integer index error branch
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1.0), Node.newNumber(2.0));
    Node getElem = new Node(Token.GETELEM, arrayLit, Node.newNumber(1.5));
    Node parent = new Node(Token.EXPR_RESULT, getElem);

    Node optimized = foldingOptimizer.optimizeSubtree(getElem);
    assertEquals(Token.GETELEM, optimized.getType());
  }

  @Test
  public void testTryFoldObjectPropAccessValid() {
    // {a: 1}.a --> 1
    Node key = Node.newString(Token.STRING, "a");
    key.addChildToBack(Node.newNumber(1.0));
    Node objLit = new Node(Token.OBJECTLIT, key);
    Node getProp = new Node(Token.GETPROP, objLit, Node.newString(Token.STRING, "a"));
    Node parent = new Node(Token.EXPR_RESULT, getProp);

    Node optimized = foldingOptimizer.optimizeSubtree(getProp);
    assertEquals(Token.NUMBER, optimized.getType());
    assertEquals(1.0, optimized.getDouble(), 0.001);
  }

  @Test
  public void testTryFoldObjectPropAccessAssignmentTarget() {
    // {a: 1}.a += 2 -> Assignment target check should prevent folding
    Node key = Node.newString(Token.STRING, "a");
    key.addChildToBack(Node.newNumber(1.0));
    Node objLit = new Node(Token.OBJECTLIT, key);
    Node getProp = new Node(Token.GETPROP, objLit, Node.newString(Token.STRING, "a"));
    Node assign = new Node(Token.ASSIGN_ADD, getProp, Node.newNumber(2.0));
    Node parent = new Node(Token.EXPR_RESULT, assign);

    Node optimized = foldingOptimizer.optimizeSubtree(assign);
    assertEquals(Token.ASSIGN_ADD, optimized.getType());
  }
}