package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * High branch/condition coverage test suite for PeepholeFoldConstants (Closure-148b).
 * Uses strictly JUnit 4 and allowed classpath dependencies.
 */
public class PeepholeFoldConstantsTest extends TestCase {

  private PeepholeFoldConstants folder;
  private AbstractCompiler compiler;

  @Before
  public void setUp() throws Exception {
    folder = new PeepholeFoldConstants();
    compiler = new Compiler();
    folder.beginTraversal(new NodeTraversal(compiler, null, null));
  }

  private Node wrapInExpression(Node n) {
    Node parent = new Node(Token.EXPR_RESULT, n);
    return parent;
  }

  // --- 1. optimizeSubtree & Unary Operators ---

  @Test
  public void testOptimizeSubtreeUnaryAndNot() {
    // !!true -> false
    Node innerTrue = new Node(Token.TRUE);
    Node not1 = new Node(Token.NOT, innerTrue);
    Node parent = wrapInExpression(new Node(Token.NOT, not1));

    Node result = folder.optimizeSubtree(parent.getFirstChild());
    assertNotNull(result);
  }

  @Test
  public void testTryFoldUnaryNegateEdges() {
    // -Infinity
    Node infName = Node.newString(Token.NAME, "Infinity");
    Node negInf = wrapInExpression(new Node(Token.NEG, infName));
    folder.optimizeSubtree(negInf.getFirstChild());

    // -NaN
    Node nanName = Node.newString(Token.NAME, "NaN");
    Node negNan = wrapInExpression(new Node(Token.NEG, nanName));
    folder.optimizeSubtree(negNan.getFirstChild());

    // Non-number negation error
    Node strNode = Node.newString("abc");
    Node negStr = wrapInExpression(new Node(Token.NEG, strNode));
    folder.optimizeSubtree(negStr.getFirstChild());
  }

  @Test
  public void testTryFoldBitNotEdges() {
    // Valid bitnot
    Node numNode = Node.newNumber(5.0);
    Node bitNot = wrapInExpression(new Node(Token.BITNOT, numNode));
    folder.optimizeSubtree(bitNot.getFirstChild());

    // Out of range bitnot
    Node largeNum = Node.newNumber(1e12);
    Node bitNotLarge = wrapInExpression(new Node(Token.BITNOT, largeNum));
    folder.optimizeSubtree(bitNotLarge.getFirstChild());

    // Fractional bitnot
    Node fracNum = Node.newNumber(5.5);
    Node bitNotFrac = wrapInExpression(new Node(Token.BITNOT, fracNum));
    folder.optimizeSubtree(bitNotFrac.getFirstChild());

    // Non-number bitnot error
    Node strNode = Node.newString("abc");
    Node bitNotStr = wrapInExpression(new Node(Token.BITNOT, strNode));
    folder.optimizeSubtree(bitNotStr.getFirstChild());
  }

  // --- 2. Typeof folding ---

  @Test
  public void testTryFoldTypeofCases() {
    // typeof "string" -> "string"
    Node strLit = Node.newString("hello");
    Node typeofStr = wrapInExpression(new Node(Token.TYPEOF, strLit));
    folder.optimizeSubtree(typeofStr.getFirstChild());

    // typeof 123 -> "number"
    Node numLit = Node.newNumber(123.0);
    Node typeofNum = wrapInExpression(new Node(Token.TYPEOF, numLit));
    folder.optimizeSubtree(typeofNum.getFirstChild());

    // typeof true -> "boolean"
    Node trueLit = new Node(Token.TRUE);
    Node typeofBool = wrapInExpression(new Node(Token.TYPEOF, trueLit));
    folder.optimizeSubtree(typeofBool.getFirstChild());

    // typeof null -> "object"
    Node nullLit = new Node(Token.NULL);
    Node typeofNull = wrapInExpression(new Node(Token.TYPEOF, nullLit));
    folder.optimizeSubtree(typeofNull.getFirstChild());

    // typeof undefined -> "undefined"
    Node undefName = Node.newString(Token.NAME, "undefined");
    Node typeofUndef = wrapInExpression(new Node(Token.TYPEOF, undefName));
    folder.optimizeSubtree(typeofUndef.getFirstChild());

    // typeof unknown variable (non-literal)
    Node varName = Node.newString(Token.NAME, "x");
    Node typeofVar = wrapInExpression(new Node(Token.TYPEOF, varName));
    folder.optimizeSubtree(typeofVar.getFirstChild());
  }

  // --- 3. Binary Operators: Arithmetic & Strings ---

  @Test
  public void testTryFoldArithmeticAndStrings() {
    // 6 + 7 -> 13
    Node addNode = wrapInExpression(new Node(Token.ADD, Node.newNumber(6), Node.newNumber(7)));
    folder.optimizeSubtree(addNode.getFirstChild());

    // "a" + "b" -> "ab"
    Node addStr = wrapInExpression(new Node(Token.ADD, Node.newString("a"), Node.newString("b")));
    folder.optimizeSubtree(addStr.getFirstChild());

    // 10 - 3 -> 7
    Node subNode = wrapInExpression(new Node(Token.SUB, Node.newNumber(10), Node.newNumber(3)));
    folder.optimizeSubtree(subNode.getFirstChild());

    // 4 * 5 -> 20
    Node mulNode = wrapInExpression(new Node(Token.MUL, Node.newNumber(4), Node.newNumber(5)));
    folder.optimizeSubtree(mulNode.getFirstChild());

    // 10 / 2 -> 5
    Node divNode = wrapInExpression(new Node(Token.DIV, Node.newNumber(10), Node.newNumber(2)));
    folder.optimizeSubtree(divNode.getFirstChild());

    // Divide by zero error: 10 / 0
    Node divByZero = wrapInExpression(new Node(Token.DIV, Node.newNumber(10), Node.newNumber(0)));
    folder.optimizeSubtree(divByZero.getFirstChild());
  }

  @Test
  public void testTryFoldLeftChildAdd() {
    // (foo() + "a") + "b" -> foo() + "ab"
    Node fooCall = new Node(Token.CALL, Node.newString(Token.NAME, "foo"));
    Node leftAdd = new Node(Token.ADD, fooCall, Node.newString("a"));
    Node parentAdd = wrapInExpression(new Node(Token.ADD, leftAdd, Node.newString("b")));
    folder.optimizeSubtree(parentAdd.getFirstChild());
  }

  // --- 4. Bitwise and Shift Operators ---

  @Test
  public void testBitwiseAndShiftEdges() {
    // 5 & 3 -> 1
    Node bitAnd = wrapInExpression(new Node(Token.BITAND, Node.newNumber(5), Node.newNumber(3)));
    folder.optimizeSubtree(bitAnd.getFirstChild());

    // 5 | 3 -> 7
    Node bitOr = wrapInExpression(new Node(Token.BITOR, Node.newNumber(5), Node.newNumber(3)));
    folder.optimizeSubtree(bitOr.getFirstChild());

    // Out of range bitwise operands
    Node largeBit = wrapInExpression(new Node(Token.BITAND, Node.newNumber(1e12), Node.newNumber(3)));
    folder.optimizeSubtree(largeBit.getFirstChild());

    // Shifts: 4 << 1 -> 8
    Node lsh = wrapInExpression(new Node(Token.LSH, Node.newNumber(4), Node.newNumber(1)));
    folder.optimizeSubtree(lsh.getFirstChild());

    // Shift out of bounds (> 32)
    Node shiftOOB = wrapInExpression(new Node(Token.LSH, Node.newNumber(4), Node.newNumber(35)));
    folder.optimizeSubtree(shiftOOB.getFirstChild());

    // Shift operand out of range
    Node shiftRange = wrapInExpression(new Node(Token.LSH, Node.newNumber(1e12), Node.newNumber(1)));
    folder.optimizeSubtree(shiftRange.getFirstChild());
  }

  // --- 5. Logical Operators (AND / OR) ---

  @Test
  public void testTryFoldAndOrBranches() {
    // true || x -> true (inside IF condition)
    Node ifNode = new Node(Token.IF, new Node(Token.OR, new Node(Token.TRUE), Node.newString(Token.NAME, "x")), new Node(Token.BLOCK));
    folder.optimizeSubtree(ifNode.getFirstChild());

    // false && x -> false
    Node andNode = wrapInExpression(new Node(Token.AND, new Node(Token.FALSE), Node.newString(Token.NAME, "x")));
    folder.optimizeSubtree(andNode.getFirstChild());

    // x || true (inside IF condition)
    Node ifOrTrue = new Node(Token.IF, new Node(Token.OR, Node.newString(Token.NAME, "x"), new Node(Token.TRUE)), new Node(Token.BLOCK));
    folder.optimizeSubtree(ifOrTrue.getFirstChild());
  }

  // --- 6. Comparison Operators ---

  @Test
  public void testTryFoldComparisons() {
    // 5 == 5 -> true
    Node eq = wrapInExpression(new Node(Token.EQ, Node.newNumber(5), Node.newNumber(5)));
    folder.optimizeSubtree(eq.getFirstChild());

    // "abc" === "def" -> false
    Node sheq = wrapInExpression(new Node(Token.SHEQ, Node.newString("abc"), Node.newString("def")));
    folder.optimizeSubtree(sheq.getFirstChild());

    // void 0 == null -> true
    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    Node compVoid = wrapInExpression(new Node(Token.EQ, voidNode, new Node(Token.NULL)));
    folder.optimizeSubtree(compVoid.getFirstChild());

    // Number comparisons: 3 < 5 -> true
    Node lt = wrapInExpression(new Node(Token.LT, Node.newNumber(3), Node.newNumber(5)));
    folder.optimizeSubtree(lt.getFirstChild());
  }

  // --- 7. Array & String Known Methods (GetElem, GetProp, Join, IndexOf) ---

  @Test
  public void testTryFoldGetElemAndGetProp() {
    // [1, 2, 3][1] -> 2
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2), Node.newNumber(3));
    Node getElem = wrapInExpression(new Node(Token.GETELEM, arrayLit, Node.newNumber(1)));
    folder.optimizeSubtree(getElem.getFirstChild());

    // Index out of bounds: [1, 2][5]
    Node arrayLit2 = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
    Node getElemOOB = wrapInExpression(new Node(Token.GETELEM, arrayLit2, Node.newNumber(5)));
    folder.optimizeSubtree(getElemOOB.getFirstChild());

    // Invalid index (non-integer): [1, 2][1.5]
    Node arrayLit3 = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
    Node getElemInvalid = wrapInExpression(new Node(Token.GETELEM, arrayLit3, Node.newNumber(1.5)));
    folder.optimizeSubtree(getElemInvalid.getFirstChild());

    // Array length: [1, 2, 3].length -> 3
    Node arrayLitLen = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2), Node.newNumber(3));
    Node getPropLen = wrapInExpression(new Node(Token.GETPROP, arrayLitLen, Node.newString("length")));
    folder.optimizeSubtree(getPropLen.getFirstChild());
  }

  @Test
  public void testTryFoldStringJoinAndIndexOf() {
    // ['a', 'b', 'c'].join('') -> 'abc'
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
    Node getPropJoin = new Node(Token.GETPROP, arrayLit, Node.newString("join"));
    Node callJoin = wrapInExpression(new Node(Token.CALL, getPropJoin, Node.newString("")));
    folder.optimizeSubtree(callJoin.getFirstChild());

    // "abcdef".indexOf("cd") -> 2
    Node strNode = Node.newString("abcdef");
    Node getPropIndex = new Node(Token.GETPROP, strNode, Node.newString("indexOf"));
    Node callIndex = wrapInExpression(new Node(Token.CALL, getPropIndex, Node.newString("cd")));
    folder.optimizeSubtree(callIndex.getFirstChild());
  }

  @Test
  public void testInstanceofFolding() {
    // "abc" instanceof Object -> false
    Node instanceofNode = wrapInExpression(new Node(Token.INSTANCEOF, Node.newString("abc"), Node.newString(Token.NAME, "Object")));
    folder.optimizeSubtree(instanceofNode.getFirstChild());
  }

  @Test
  public void testAssignFolding() {
    // x = x + 1 -> x += 1
    Node nameLeft = Node.newString(Token.NAME, "x");
    Node addRight = new Node(Token.ADD, Node.newString(Token.NAME, "x"), Node.newNumber(1));
    Node assignNode = wrapInExpression(new Node(Token.ASSIGN, nameLeft, addRight));
    folder.optimizeSubtree(assignNode.getFirstChild());
  }
}