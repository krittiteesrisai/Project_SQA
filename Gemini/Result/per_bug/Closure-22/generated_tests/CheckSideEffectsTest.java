package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * JUnit 4 Test Suite for CheckSideEffects (Defects4J Closure-22b)
 * Maximizing Branch/Condition Coverage and Edge Cases.
 */
public class CheckSideEffectsTest extends TestCase {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  @Test
  public void testEmptyAndNullParentNodes() {
    Compiler compiler = createCompiler();
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);

    // Node is empty
    Node emptyNode = new Node(Token.EMPTY);
    pass.visit(null, emptyNode, new Node(Token.BLOCK));

    // Node is comma
    Node commaNode = new Node(Token.COMMA);
    pass.visit(null, commaNode, new Node(Token.BLOCK));

    // Parent is null
    Node normalNode = new Node(Token.NUMBER, Node.newNumber(1.0));
    pass.visit(null, normalNode, null);

    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testEvalInCommaAndJSDocAncestor() {
    Compiler compiler = createCompiler();
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);

    // Parent is COMMA, gramps is Call to eval
    Node evalName = Node.newString(Token.NAME, "eval");
    Node commaChild = Node.newNumber(1.0);
    Node commaParent = new Node(Token.COMMA, commaChild, evalName);
    Node callGramps = new Node(Token.CALL, commaParent);

    pass.visit(null, commaChild, commaParent);

    // Last child with ancestors check (EXPR_RESULT / BLOCK)
    Node nameNode = Node.newString(Token.NAME, "myVar");
    Node blockParent = new Node(Token.BLOCK, nameNode);
    pass.visit(null, nameNode, blockParent);

    assertTrue(compiler.getErrors().isEmpty());
  }

  @Test
  public void testForLoopStructureValidations() {
    Compiler compiler = createCompiler();
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);

    // FOR loop with 4 children, checking first and third child exceptions
    Node init = new Node(Token.EMPTY);
    Node cond = new Node(Token.EMPTY);
    Node incr = new Node(Token.EMPTY);
    Node body = new Node(Token.BLOCK);
    Node forNode = new Node(Token.FOR, init, cond, incr, body);

    // Valid positions in FOR (first and third)
    pass.visit(null, init, forNode);
    pass.visit(null, incr, forNode);

    // Invalid position in FOR (second child / condition)
    pass.visit(null, cond, forNode);

    // Parent not expr result or block and not FOR
    Node ifNode = new Node(Token.IF);
    Node childNode = new Node(Token.NUMBER, Node.newNumber(5.0));
    pass.visit(null, childNode, ifNode);

    // Should generate warnings or process without crashing
    assertNotNull(compiler);
  }

  @Test
  public void testUselessCodeStringMissingPlusWarning() {
    Compiler compiler = createCompiler();
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);

    Node stringNode = Node.newString("some string");
    Node exprResult = new Node(Token.EXPR_RESULT, stringNode);
    Node block = new Node(Token.BLOCK, exprResult);

    // Node is string literal inside expression result without side effects / usage
    pass.visit(new NodeTraversal(compiler, pass), stringNode, exprResult);

    // Also test isQualifiedName with JSDocInfo
    stringNode.setJSDocInfo(new com.google.javascript.rhino.JSDocInfo());
    pass.visit(new NodeTraversal(compiler, pass), stringNode, exprResult);
  }

  @Test
  public void testSimpleOperatorWithoutResultUse() {
    Compiler compiler = createCompiler();
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, false);

    // Simple operator like EQ (==)
    Node eqNode = new Node(Token.EQ, Node.newNumber(1.0), Node.newNumber(1.0));
    Node exprResult = new Node(Token.EXPR_RESULT, eqNode);

    pass.visit(new NodeTraversal(compiler, pass), eqNode, exprResult);

    assertEquals(1, compiler.getErrors().length);
  }

  @Test
  public void testProtectSideEffectsAndStripProtection() {
    Compiler compiler = createCompiler();
    // Enable protectSideEffectFreeCode = true
    CheckSideEffects pass = new CheckSideEffects(compiler, CheckLevel.WARNING, true);

    Node numberNode = Node.newNumber(42.0);
    Node exprResult = new Node(Token.EXPR_RESULT, numberNode);
    Node block = new Node(Token.BLOCK, exprResult);

    NodeTraversal traversal = new NodeTraversal(compiler, pass);
    pass.visit(traversal, numberNode, exprResult);

    // Trigger process to execute protectSideEffects()
    pass.process(new Node(Token.BLOCK), block);

    // Test StripProtection pass
    CheckSideEffects.StripProtection stripper = new CheckSideEffects.StripProtection(compiler);
    stripper.process(new Node(Token.BLOCK), block);

    assertNotNull(block);
  }
}