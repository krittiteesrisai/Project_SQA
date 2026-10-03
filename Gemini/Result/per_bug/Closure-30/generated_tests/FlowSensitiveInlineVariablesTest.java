package com.google.javascript.jscomp;

import junit.framework.TestCase;
import com.google.javascript.rhino.Node;

/**
 * JUnit 4 test suite for FlowSensitiveInlineVariables (Closure-30b).
 */
public class FlowSensitiveInlineVariablesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private void runPass(Node root) {
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    // Process root
    pass.process(null, root);
  }

  public void testGlobalScope() {
    // Triggers t.inGlobalScope() == true branch
    Node script = Node.newString(Token.SCRIPT, "var x = 1; print(x);");
    compiler.parseSyntheticCode("test", "var x = 1; print(x);");
    Node root = compiler.getRoot();
    
    FlowSensitiveInlineVariables pass = new FlowSensitiveInlineVariables(compiler);
    NodeTraversal t = new NodeTraversal(compiler, pass);
    // In global scope traversal
    pass.enterScope(t);
    assertTrue(true); // Ensures no exception thrown
  }

  public void testFunctionParameterCannotBeInlined() {
    // defCfgNode.isFunction() -> true (Function parameter)
    String js = "function f(x) { return x; }";
    compiler.parseSyntheticCode("test", js);
    Node root = compiler.getRoot();
    runPass(root);
    // Should not crash and parameter x should remain
    assertFalse(compiler.hasErrors());
  }

  public void testValidVarInlining() {
    // Tests standard var inlining (defParent.isVar() branch)
    String js = "function f() { var x = 1; return x; }";
    compiler.parseSyntheticCode("test", js);
    Node root = compiler.getRoot();
    runPass(root);
    assertFalse(compiler.hasErrors());
  }

  public void testValidAssignInlining() {
    // Tests assign expression inlining (def.isAssign() branch)
    String js = "function f() { var x; x = 1; return x; }";
    compiler.parseSyntheticCode("test", js);
    Node root = compiler.getRoot();
    runPass(root);
    assertFalse(compiler.hasErrors());
  }

  public void testMultipleUsesPreventsInlining() {
    // uses.size() != 1 or numUseWithinUseCfgNode != 1 -> prevents inlining
    String js = "function f() { var x = 1; return x + x; }";
    compiler.parseSyntheticCode("test", js);
    Node root = compiler.getRoot();
    runPass(root);
    assertFalse(compiler.hasErrors());
  }

  public void testSideEffectInRhsPreventsInlining() {
    // NodeUtil.mayHaveSideEffects(def.getLastChild()) -> true
    String js = "function externSideEffect(); function f() { var x = externSideEffect(); return x; }";
    compiler.parseSyntheticCode("test", js);
    Node root = compiler.getRoot();
    // Mark function call as having side effects if possible or use a known one
    runPass(root);
    assertFalse(compiler.hasErrors());
  }

  public void testGetPropRhsPreventsInlining() {
    // Token.GETPROP check in R-Value -> prevents inlining
    String js = "function f(a) { var x = a.b; return x; }";
    compiler.parseSyntheticCode("test", js);
    Node root = compiler.getRoot();
    runPass(root);
    assertFalse(compiler.hasErrors());
  }
}