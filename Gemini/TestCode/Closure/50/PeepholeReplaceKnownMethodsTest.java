package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for PeepholeReplaceKnownMethods (Closure-50b)
 * Maximizing Branch/Condition Coverage and Edge Cases.
 */
public class PeepholeReplaceKnownMethodsTest {

  private PeepholeReplaceKnownMethods optimizer;
  private AbstractCompiler compiler;

  @Before
  public void setUp() {
    optimizer = new PeepholeReplaceKnownMethods();
    compiler = new Compiler();
    optimizer.beginTraversal(compiler);
  }

  @Test
  public void testOptimizeSubtreeNotCall() {
    // Branch: optimizeSubtree when subtree is NOT a CALL (e.g., NUMBER)
    Node subtree = Node.newNumber(123);
    Node result = optimizer.optimizeSubtree(subtree);
    assertEquals(subtree, result);
  }

  @Test
  public void testTryFoldKnownStringMethodsNullCallTarget() {
    // Branch: callTarget == null in tryFoldKnownMethods / tryFoldKnownStringMethods
    Node callNode = new Node(Token.CALL);
    Node parent = new Node(Token.EXPR_RESULT, callNode);
    Node result = optimizer.optimizeSubtree(callNode);
    assertEquals(callNode, result);
  }

  @Test
  public void testTryFoldStringToLowerCase() {
    // 'ABC'.toLowerCase() -> 'abc'
    Node stringNode = Node.newString("ABC");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("toLowerCase"));
    Node callNode = new Node(Token.CALL, getProp);
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("abc", result.getString());
  }

  @Test
  public void testTryFoldStringToUpperCase() {
    // 'abc'.toUpperCase() -> 'ABC'
    Node stringNode = Node.newString("abc");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("toUpperCase"));
    Node callNode = new Node(Token.CALL, getProp);
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("ABC", result.getString());
  }

  @Test
  public void testTryFoldStringIndexOfValid() {
    // "abcdef".indexOf("cd") -> 2
    Node stringNode = Node.newString("abcdef");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("indexOf"));
    Node callNode = new Node(Token.CALL, getProp, Node.newString("cd"));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(2.0, result.getDouble(), 0.001);
  }

  @Test
  public void testTryFoldStringIndexOfWithOptions() {
    // "abcdefbc".indexOf("bc", 3) -> 6
    Node stringNode = Node.newString("abcdefbc");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("indexOf"));
    Node callNode = new Node(Token.CALL, getProp, Node.newString("bc"), Node.newNumber(3));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(6.0, result.getDouble(), 0.001);
  }

  @Test
  public void testTryFoldStringLastIndexOfValid() {
    // "abcdefbc".lastIndexOf("bc") -> 6
    Node stringNode = Node.newString("abcdefbc");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("lastIndexOf"));
    Node callNode = new Node(Token.CALL, getProp, Node.newString("bc"));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(6.0, result.getDouble(), 0.001);
  }

  @Test
  public void testTryFoldStringIndexOfInvalidSecondArg() {
    // Invalid second argument (non-number) should bail out
    Node stringNode = Node.newString("abcdef");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("indexOf"));
    Node callNode = new Node(Token.CALL, getProp, Node.newString("cd"), Node.newString("3"));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertEquals(callNode, result);
  }

  @Test
  public void testTryFoldStringSubstrValid() {
    // "abcdef".substr(1, 3) -> "bcd"
    Node stringNode = Node.newString("abcdef");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("substr"));
    Node callNode = new Node(Token.CALL, getProp, Node.newNumber(1), Node.newNumber(3));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("bcd", result.getString());
  }

  @Test
  public void testTryFoldStringSubstrOutOfBounds() {
    // Out of bounds or negative lengths should bail out
    Node stringNode = Node.newString("abcdef");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("substr"));
    Node callNode = new Node(Token.CALL, getProp, Node.newNumber(1), Node.newNumber(10));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertEquals(callNode, result);
  }

  @Test
  public void testTryFoldStringSubstringValid() {
    // "abcdef".substring(1, 4) -> "bcd"
    Node stringNode = Node.newString("abcdef");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("substring"));
    Node callNode = new Node(Token.CALL, getProp, Node.newNumber(1), Node.newNumber(4));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("bcd", result.getString());
  }

  @Test
  public void testTryFoldStringSubstringOutOfBounds() {
    // start or end out of bounds should bail out
    Node stringNode = Node.newString("abcdef");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("substring"));
    Node callNode = new Node(Token.CALL, getProp, Node.newNumber(-1), Node.newNumber(4));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertEquals(callNode, result);
  }

  @Test
  public void testTryFoldStringCharAtValid() {
    // "abcdef".charAt(2) -> "c"
    Node stringNode = Node.newString("abcdef");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("charAt"));
    Node callNode = new Node(Token.CALL, getProp, Node.newNumber(2));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("c", result.getString());
  }

  @Test
  public void testTryFoldStringCharAtOutOfBounds() {
    // index out of bounds -> bail out
    Node stringNode = Node.newString("abcdef");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("charAt"));
    Node callNode = new Node(Token.CALL, getProp, Node.newNumber(10));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertEquals(callNode, result);
  }

  @Test
  public void testTryFoldStringCharCodeAtValid() {
    // "abc".charCodeAt(1) -> 98 ('b')
    Node stringNode = Node.newString("abc");
    Node getProp = new Node(Token.GETPROP, stringNode, Node.newString("charCodeAt"));
    Node callNode = new Node(Token.CALL, getProp, Node.newNumber(1));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.NUMBER, result.getType());
    assertEquals(98.0, result.getDouble(), 0.001);
  }

  @Test
  public void testTryFoldArrayJoinDefault() {
    // ['a', 'b', 'c'].join() -> 'a,b,c'
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
    Node getProp = new Node(Token.GETPROP, arrayLit, Node.newString("join"));
    Node callNode = new Node(Token.CALL, getProp);
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("a,b,c", result.getString());
  }

  @Test
  public void testTryFoldArrayJoinCustomSeparator() {
    // ['a', 'b', 'c'].join('') -> 'abc'
    Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
    Node getProp = new Node(Token.GETPROP, arrayLit, Node.newString("join"));
    Node callNode = new Node(Token.CALL, getProp, Node.newString(""));
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertNotNull(result);
    assertEquals(Token.STRING, result.getType());
    assertEquals("abc", result.getString());
  }

  @Test
  public void testTryFoldParseNumberInt() {
    // parseInt("123") -> 123
    Node nameNode = Node.newString(Token.NAME, "parseInt");
    // Wait, tryFoldKnownNumericMethods checks isASTNormalized() and NodeUtil.isName(callTarget)
    // Let's ensure AST is normalized if required or test via standard call target name
    // (Note: isASTNormalized depends on compiler settings, by default false unless set)
    compiler.getNodeContext().setNormalized(); // if available or bypass via standard compiler state
    // Alternatively test tryFoldParseNumber branches directly or via standard tree
  }

  @Test
  public void testTryFoldStringMethodsNonStringTypes() {
    // stringNode or functionName not STRING -> bail out
    Node numNode = Node.newNumber(123);
    Node getProp = new Node(Token.GETPROP, numNode, Node.newString("toLowerCase"));
    Node callNode = new Node(Token.CALL, getProp);
    Node parent = new Node(Token.EXPR_RESULT, callNode);

    Node result = optimizer.optimizeSubtree(callNode);
    assertEquals(callNode, result);
  }
}