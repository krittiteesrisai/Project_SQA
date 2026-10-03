package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test class for PeepholeFoldConstants (Closure-74b)
 * Achieving high Branch/Condition Coverage and Edge Case testing.
 */
public class PeepholeFoldConstantsTest {

  private PeepholeFoldConstants optimizer;
  private AbstractCompiler compiler;

  @Before
  public void setUp() {
    optimizer = new PeepholeFoldConstants();
    compiler = new Compiler();
    // กำหนด Compiler ให้กับ Optimizer เพื่อให้กลไก reportCodeChange ทำงานได้ปกติ
    optimizer.beginTraversal(compiler);
  }

  // --- Helper Methods to build AST Nodes ---
  private Node createParentWithChild(int parentType, Node child) {
    Node parent = new Node(parentType);
    parent.addChildToBack(child);
    return parent;
  }

  private Node createBinaryNode(int type, Node left, Node right) {
    Node parent = new Node(type, left, right);
    return parent;
  }

  // --- 1. Test optimizeSubtree Switch Branches ---
  @Test
  public void testOptimizeSubtreeCall() {
    // Token.CALL -> tryFoldKnownMethods (e.g., [1,2].join())
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
    Node getProp = new Node(Token.GETPROP, arrayLit, Node.newString("join"));
    Node call = new Node(Token.CALL, getProp);
    Node parent = createParentWithChild(Token.EXPR_RESULT, call);

    Node result = optimizer.optimizeSubtree(call);
    assertNotNull(result);
  }

  @Test
  public void testOptimizeSubtreeNew() {
    // Token.NEW -> tryFoldCtorCall
    Node newCtor = new Node(Token.NEW, Node.newString(Token.NAME, "Object"));
    Node parent = createParentWithChild(Token.EXPR_RESULT, newCtor);
    Node result = optimizer.optimizeSubtree(newCtor);
    assertNotNull(result);
  }

  @Test
  public void testOptimizeSubtreeTypeof() {
    // Token.TYPEOF -> tryFoldTypeof
    Node typeofNode = new Node(Token.TYPEOF, Node.newNumber(5));
    Node parent = createParentWithChild(Token.EXPR_RESULT, typeofNode);
    Node result = optimizer.optimizeSubtree(typeofNode);
    assertEquals(Token.STRING, result.getType());
    assertEquals("number", result.getString());
  }

  @Test
  public void testOptimizeSubtreeUnary() {
    // Token.NEG -> tryFoldUnaryOperator
    Node negNode = new Node(Token.NEG, Node.newNumber(5));
    Node parent = createParentWithChild(Token.EXPR_RESULT, negNode);
    Node result = optimizer.optimizeSubtree(negNode);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(-5.0, result.getDouble(), 0.001);
  }

  @Test
  public void testOptimizeSubtreeVoid() {
    // Token.VOID -> tryReduceVoid
    Node voidNode = new Node(Token.VOID, Node.newNumber(5));
    Node parent = createParentWithChild(Token.EXPR_RESULT, voidNode);
    Node result = optimizer.optimizeSubtree(voidNode);
    assertNotNull(result);
  }

  // --- 2. Test tryFoldGetElem Edge Cases & Boundary Limits ---
  @Test
  public void testGetElemNonNumberIndex() {
    // ดัชนีไม่ใช่ตัวเลข (เช่น ใช้ string เป็น index)
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(10));
    Node getElem = createBinaryNode(Token.GETELEM, arrayLit, Node.newString("invalid"));
    Node parent = createParentWithChild(Token.EXPR_RESULT, getElem);

    Node result = optimizer.optimizeSubtree(getElem);
    assertEquals(getElem, result); // ไม่ควรถูกพับ
  }

  @Test
  public void testGetElemFractionalIndex() {
    // ดัชนีเป็นทศนิยม -> INVALID_GETELEM_INDEX_ERROR
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(10), Node.newNumber(20));
    Node getElem = createBinaryNode(Token.GETELEM, arrayLit, Node.newNumber(1.5));
    Node parent = createParentWithChild(Token.EXPR_RESULT, getElem);

    Node result = optimizer.optimizeSubtree(getElem);
    assertEquals(getElem, result);
  }

  @Test
  public void testGetElemNegativeIndex() {
    // ดัชนีติดลบ -> INDEX_OUT_OF_BOUNDS_ERROR
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(10));
    Node getElem = createBinaryNode(Token.GETELEM, arrayLit, Node.newNumber(-1));
    Node parent = createParentWithChild(Token.EXPR_RESULT, getElem);

    Node result = optimizer.optimizeSubtree(getElem);
    assertEquals(getElem, result);
  }

  @Test
  public void testGetElemOutOfBounds() {
    // ดัชนีเกินความยาวอาเรย์ -> INDEX_OUT_OF_BOUNDS_ERROR
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(10));
    Node getElem = createBinaryNode(Token.GETELEM, arrayLit, Node.newNumber(5));
    Node parent = createParentWithChild(Token.EXPR_RESULT, getElem);

    Node result = optimizer.optimizeSubtree(getElem);
    assertEquals(getElem, result);
  }

  @Test
  public void testGetElemEmptySlot() {
    // อาเรย์มีช่องว่าง (Token.EMPTY)
    Node emptyNode = new Node(Token.EMPTY);
    Node arrayLit = new Node(Token.ARRAYLIT, emptyNode);
    Node getElem = createBinaryNode(Token.GETELEM, arrayLit, Node.newNumber(0));
    Node parent = createParentWithChild(Token.EXPR_RESULT, getElem);

    Node result = optimizer.optimizeSubtree(getElem);
    // ควรแปลงเป็น undefined
    assertNotNull(result);
  }

  // --- 3. Test tryFoldShift Edge Cases ---
  @Test
  public void testShiftOperandOutOfRange() {
    // lval อยู่นอกช่วง 32-bit integer
    Node lsh = createBinaryNode(Token.LSH, Node.newNumber(Math.pow(2, 40)), Node.newNumber(2));
    Node parent = createParentWithChild(Token.EXPR_RESULT, lsh);

    Node result = optimizer.optimizeSubtree(lsh);
    assertEquals(lsh, result);
  }

  @Test
  public void testShiftAmountOutOfBounds() {
    // ระยะการ shift มากกว่า 32 หรือติดลบ -> SHIFT_AMOUNT_OUT_OF_BOUNDS
    Node lsh = createBinaryNode(Token.LSH, Node.newNumber(10), Node.newNumber(35));
    Node parent = createParentWithChild(Token.EXPR_RESULT, lsh);

    Node result = optimizer.optimizeSubtree(lsh);
    assertEquals(lsh, result);
  }

  @Test
  public void testFractionalShiftOperand() {
    // ตัวถูก shift หรือจำนวน shift เป็นทศนิยม -> FRACTIONAL_BITWISE_OPERAND
    Node lsh = createBinaryNode(Token.LSH, Node.newNumber(10.5), Node.newNumber(2));
    Node parent = createParentWithChild(Token.EXPR_RESULT, lsh);

    Node result = optimizer.optimizeSubtree(lsh);
    assertEquals(lsh, result);
  }

  @Test
  public void testValidUnsignedRightShift() {
    // ทดสอบการทำ URSH (unsigned right shift)
    Node ursh = createBinaryNode(Token.URSH, Node.newNumber(-1), Node.newNumber(1));
    Node parent = createParentWithChild(Token.EXPR_RESULT, ursh);

    Node result = optimizer.optimizeSubtree(ursh);
    assertEquals(Token.NUMBER, result.getType());
  }

  // --- 4. Test String Methods (IndexOf, Substr, Substring) ---
  @Test
  public void testStringSubstrInvalidArgs() {
    // .substr() กับค่าติดลบ หรือพารามิเตอร์เกินคาดหวัง
    Node stringNode = Node.newString("hello");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("substr"));
    Node call = new Node(Token.CALL, getProp, Node.newNumber(-1), Node.newNumber(2));
    Node parent = createParentWithChild(Token.EXPR_RESULT, call);

    Node result = optimizer.optimizeSubtree(call);
    assertEquals(call, result); // ไม่พับเนื่องจาก start < 0
  }

  @Test
  public void testStringSubstringInvalidBounds() {
    // .substring() กับ end เกินความยาวสตริง
    Node stringNode = Node.newString("hello");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("substring"));
    Node call = new Node(Token.CALL, getProp, Node.newNumber(1), Node.newNumber(10));
    Node parent = createParentWithChild(Token.EXPR_RESULT, call);

    Node result = optimizer.optimizeSubtree(call);
    assertEquals(call, result);
  }
}