package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;

/**
 * High-coverage JUnit 4 test suite for FoldConstants (Closure-105b).
 */
public class FoldConstantsTest extends TestCase {

  private Compiler compiler;
  private FoldConstants folder;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    // กำหนดค่าเริ่มต้นเบื้องต้นให้ Compiler ถ้าจำเป็น
    compiler.initOptions(new CompilerOptions());
    folder = new FoldConstants(compiler);
  }

  // Helper method เพื่อจำลองการกระทำ NodeTraversal
  private void processNode(Node root) {
    folder.process(null, root);
  }

  @Test
  public void testTypeofFolding() {
    // typeof "string" -> "string"
    Node typeofNode = new Node(Token.TYPEOF, Node.newString("hello"));
    Node parent = new Node(Token.EXPR_RESULT, typeofNode);
    
    processNode(parent);
    assertEquals(Token.STRING, parent.getFirstChild().getType());
    assertEquals("string", parent.getFirstChild().getString());
  }

  @Test
  public void testNegateInfinityAndNaN() {
    // -Infinity ควรคงเดิมเนื่องจากเป็นสเปเชียลคาสต์
    Node nameInfinity = Node.newString(Token.NAME, "Infinity");
    Node negInf = new Node(Token.NEG, nameInfinity);
    Node parent1 = new Node(Token.EXPR_RESULT, negInf);
    processNode(parent1);
    assertEquals(Token.NEG, parent1.getFirstChild().getType());

    // -NaN ควรเปลี่ยนเป็น NaN
    Node nameNaN = Node.newString(Token.NAME, "NaN");
    Node negNaN = new Node(Token.NEG, nameNaN);
    Node parent2 = new Node(Token.EXPR_RESULT, negNaN);
    processNode(parent2);
    assertEquals(Token.NAME, parent2.getFirstChild().getType());
    assertEquals("NaN", parent2.getFirstChild().getString());
  }

  @Test
  public void testDivideByZeroError() {
    // 5 / 0 จะต้อง trigger DIVIDE_BY_0_ERROR
    Node divNode = new Node(Token.DIV, Node.newNumber(5.0), Node.newNumber(0.0));
    Node parent = new Node(Token.EXPR_RESULT, divNode);
    processNode(parent);
    
    assertTrue("Should report divide by zero error", compiler.getErrorCount() > 0);
  }

  @Test
  public void testGetElemOutOfBoundsAndInvalidIndex() {
    // [1, 2, 3][-1] -> INDEX_OUT_OF_BOUNDS_ERROR
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
    Node getElem = new Node(Token.GETELEM, arrayLit, Node.newNumber(-1));
    Node parent = new Node(Token.EXPR_RESULT, getElem);
    
    processNode(parent);
    assertTrue("Should report index out of bounds", compiler.getErrorCount() > 0);

    // [1, 2, 3][1.5] -> INVALID_GETELEM_INDEX_ERROR
    Compiler freshCompiler = new Compiler();
    freshCompiler.initOptions(new CompilerOptions());
    FoldConstants freshFolder = new FoldConstants(freshCompiler);
    
    Node arrayLit2 = new Node(Token.ARRAYLIT, Node.newNumber(1), Node.newNumber(2));
    Node getElem2 = new Node(Token.GETELEM, arrayLit2, Node.newNumber(1.5));
    Node parent2 = new Node(Token.EXPR_RESULT, getElem2);
    
    freshFolder.process(null, parent2);
    assertTrue("Should report invalid array index", freshCompiler.getErrorCount() > 0);
  }

  @Test
  public void testShiftOutOfBoundsAndFractional() {
    // 5 << 35 -> SHIFT_AMOUNT_OUT_OF_BOUNDS
    Compiler freshCompiler = new Compiler();
    freshCompiler.initOptions(new CompilerOptions());
    FoldConstants freshFolder = new FoldConstants(freshCompiler);

    Node lsh = new Node(Token.LSH, Node.newNumber(5), Node.newNumber(35));
    Node parent = new Node(Token.EXPR_RESULT, lsh);
    
    freshFolder.process(null, parent);
    assertTrue("Should report shift amount out of bounds", freshCompiler.getErrorCount() > 0);
  }

  @Test
  public void testAndOrFolding() {
    // true || x => true
    Node orNode = new Node(Token.OR, new Node(Token.TRUE), new Node(Token.NAME, "x"));
    Node parent = new Node(Token.EXPR_RESULT, orNode);
    processNode(parent);
    assertEquals(Token.TRUE, parent.getFirstChild().getType());
  }

  @Test
  public void testStringIndexOfFolding() {
    // "abcdef".indexOf("cd") -> 2
    Node getProp = new Node(Token.GETPROP, Node.newString("abcdef"), Node.newString("indexOf"));
    Node call = new Node(Token.CALL, getProp, Node.newString("cd"));
    Node parent = new Node(Token.EXPR_RESULT, call);
    
    processNode(parent);
    assertEquals(Token.NUMBER, parent.getFirstChild().getType());
    assertEquals(2.0, parent.getFirstChild().getDouble());
  }

  @Test
  public void testRegExpConstructorFolding() {
    // new RegExp("abc", "i") -> /abc/i
    Node newRegExp = new Node(Token.NEW, Node.newString(Token.NAME, "RegExp"), Node.newString("abc"), Node.newString("i"));
    Node parent = new Node(Token.EXPR_RESULT, newRegExp);
    
    processNode(parent);
    assertEquals(Token.REGEXP, parent.getFirstChild().getType());
  }
}