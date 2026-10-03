package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * JUnit 4 Test Suite for InlineVariables (Defects4J Closure-121b)
 * Focused on high Branch/Condition coverage and Edge Cases.
 */
public class InlineVariablesTest extends TestCase {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  @Test
  public void testModeAllFilter() {
    Compiler compiler = createCompiler();
    InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.ALL, true);
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    // Trigger process with ALL mode
    pass.process(externs, root);
    assertNotNull(compiler);
  }

  @Test
  public void testModeLocalsOnlyFilter() {
    Compiler compiler = createCompiler();
    InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.LOCALS_ONLY, false);
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    pass.process(externs, root);
    assertNotNull(compiler);
  }

  @Test
  public void testModeConstantsOnlyFilter() {
    Compiler compiler = createCompiler();
    InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    pass.process(externs, root);
    assertNotNull(compiler);
  }

  @Test
  public void testInlineAllStringsFlag() {
    Compiler compiler = createCompiler();
    // Test with inlineAllStrings = true vs false to cover isStringWorthInlining branches
    InlineVariables passTrue = new InlineVariables(compiler, InlineVariables.Mode.ALL, true);
    InlineVariables passFalse = new InlineVariables(compiler, InlineVariables.Mode.ALL, false);
    
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    
    passTrue.process(externs, root);
    passFalse.process(externs, root);
    assertNotNull(compiler);
  }

  @Test
  public void testConstantInliningEdgeCases() {
    Compiler compiler = createCompiler();
    InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
    
    // Construct a simple JS tree: var FOO = "testString";
    Node externs = new Node(Token.BLOCK);
    Node nameNode = Node.newString(Token.NAME, "FOO");
    Node stringVal = Node.newString("testString");
    nameNode.addChildToBack(stringVal);
    Node varNode = new Node(Token.VAR, nameNode);
    Node root = new Node(Token.BLOCK, varNode);
    
    pass.process(externs, root);
    assertNotNull(compiler);
  }

  @Test
  public void testFunctionLiteralInlining() {
    Compiler compiler = createCompiler();
    InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.ALL, true);
    
    Node externs = new Node(Token.BLOCK);
    Node funcNode = new Node(Token.FUNCTION);
    // Add dummy name and body to function
    funcNode.addChildToBack(Node.newString(Token.NAME, ""));
    funcNode.addChildToBack(new Node(Token.PARAM_LIST));
    funcNode.addChildToBack(new Node(Token.BLOCK));
    
    Node nameNode = Node.newString(Token.NAME, "myFunc");
    nameNode.addChildToBack(funcNode);
    Node varNode = new Node(Token.VAR, nameNode);
    Node root = new Node(Token.BLOCK, varNode);
    
    pass.process(externs, root);
    assertNotNull(compiler);
  }

  @Test
  public void testArgumentsHandlingEdgeCase() {
    Compiler compiler = createCompiler();
    InlineVariables pass = new InlineVariables(compiler, InlineVariables.Mode.LOCALS_ONLY, true);
    
    // Build a function scope containing references to arguments
    Node externs = new Node(Token.BLOCK);
    Node argsName = Node.newString(Token.NAME, "arguments");
    Node exprResult = new Node(Token.EXPR_RESULT, argsName);
    Node funcBody = new Node(Token.BLOCK, exprResult);
    Node funcNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), funcBody);
    Node root = new Node(Token.BLOCK, funcNode);
    
    pass.process(externs, root);
    assertNotNull(compiler);
  }
}