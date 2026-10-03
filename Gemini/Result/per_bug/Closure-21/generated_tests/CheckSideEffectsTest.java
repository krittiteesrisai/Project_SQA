package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfoBuilder;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;

/**
 * Comprehensive JUnit 4 Test Suite for CheckSideEffects (Defects4J Closure-21b).
 */
public class CheckSideEffectsTest extends TestCase {

  private Compiler compiler;
  private CheckLevel warningLevel;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    warningLevel = CheckLevel.WARNING;
  }

  @Test
  public void testEmptyAndCommaNodesIgnored() {
    // Branch: n.isEmpty() || n.isComma()
    CheckSideEffects pass = new CheckSideEffects(compiler, warningLevel, false);
    Node emptyNode = new Node(Token.EMPTY);
    Node commaNode = new Node(Token.COMMA);
    Node parent = new Node(Token.BLOCK, emptyNode);

    pass.visit(null, emptyNode, parent);
    pass.visit(null, commaNode, parent);
    // Should return early without reporting errors
    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testNullParentIgnored() {
    // Branch: parent == null
    CheckSideEffects pass = new CheckSideEffects(compiler, warningLevel, false);
    Node rootNode = new Node(Token.BLOCK);
    
    pass.visit(null, rootNode, null);
    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testExprResultIgnored() {
    // Branch: n.isExprResult()
    CheckSideEffects pass = new CheckSideEffects(compiler, warningLevel, false);
    Node exprResult = new Node(Token.EXPR_RESULT);
    Node parent = new Node(Token.BLOCK, exprResult);

    pass.visit(null, exprResult, parent);
    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testQualifiedNameWithJSDocIgnored() {
    // Branch: n.isQualifiedName() && n.getJSDocInfo() != null
    CheckSideEffects pass = new CheckSideEffects(compiler, warningLevel, false);
    Node qName = Node.newString(Token.NAME, "a.b.c");
    JSDocInfoBuilder docBuilder = new JSDocInfoBuilder(false);
    qName.setJSDocInfo(docBuilder.build());
    Node parent = new Node(Token.EXPR_RESULT, qName);

    pass.visit(null, qName, parent);
    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testStringLiteralWarning() {
    // Branch: n.isString() warning message specialization
    CheckSideEffects pass = new CheckSideEffects(compiler, warningLevel, false);
    Node strNode = Node.newString("uncapped string literal");
    Node parent = new Node(Token.EXPR_RESULT, strNode);
    NodeTraversal traversal = new NodeTraversal(compiler, pass);

    pass.visit(traversal, strNode, parent);
    assertEquals(1, compiler.getWarnings().length);
    assertTrue(compiler.getWarnings()[0].description.contains("missing '+'"));
  }

  @Test
  public void testSimpleOperatorWarning() {
    // Branch: isSimpleOp warning message specialization
    CheckSideEffects pass = new CheckSideEffects(compiler, warningLevel, false);
    Node opNode = new Node(Token.EQ); // Simple operator ==
    Node parent = new Node(Token.EXPR_RESULT, opNode);
    NodeTraversal traversal = new NodeTraversal(compiler, pass);

    pass.visit(traversal, opNode, parent);
    assertEquals(1, compiler.getWarnings().length);
    assertTrue(compiler.getWarnings()[0].description.contains("eq"));
  }

  @Test
  public void testProtectSideEffectsAndStripProtection() {
    // Test protectSideEffectFreeCode = true and StripProtection pass
    CheckSideEffects pass = new CheckSideEffects(compiler, warningLevel, true);
    Node numberNode = Node.newNumber(42.0);
    Node exprResult = new Node(Token.EXPR_RESULT, numberNode);
    Node script = new Node(Token.SCRIPT, exprResult);
    Node externs = new Node(Token.SCRIPT);

    compiler.-synthesizeExternsInput(); // Ensure externs input is available
    pass.process(externs, script);

    // Verify protection applied
    assertEquals(Token.CALL, exprResult.getFirstChild().getType());

    // Verify strip protection removes it
    CheckSideEffects.StripProtection stripper = new CheckSideEffects.StripProtection(compiler);
    stripper.process(externs, script);
    
    assertEquals(Token.NUMBER, exprResult.getFirstChild().getType());
  }

  @Test
  public void testCommaParentLogic() {
    // Branch: parent.getType() == Token.COMMA with unused result
    CheckSideEffects pass = new CheckSideEffects(compiler, warningLevel, false);
    Node nameNode = Node.newString(Token.NAME, "x");
    Node commaParent = new Node(Token.COMMA, Node.newNumber(1), nameNode);
    Node exprResult = new Node(Token.EXPR_RESULT, commaParent);
    NodeTraversal traversal = new NodeTraversal(compiler, pass);

    pass.visit(traversal, nameNode, commaParent);
    assertEquals(1, compiler.getWarnings().length);
  }

  @Test
  public void testForLoopExceptionBranch() {
    // Branch: parent.getType() == Token.FOR with 4 children, valid child positions
    CheckSideEffects pass = new CheckSideEffects(compiler, warningLevel, false);
    Node init = new Node(Token.EMPTY);
    Node cond = new Node(Token.EMPTY);
    Node incr = Node.newNumber(5.0); // Side-effect free expression in loop init or incr
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, init, cond, incr, body);
    NodeTraversal traversal = new NodeTraversal(compiler, pass);

    pass.visit(traversal, incr, forNode);
    assertEquals(1, compiler.getWarnings().length);
  }
}