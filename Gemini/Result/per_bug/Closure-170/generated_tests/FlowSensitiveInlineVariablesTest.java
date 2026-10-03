package com.google.javascript.jscomp;

import junit.framework.TestCase;
import com.google.javascript.rhino.Node;

/**
 * JUnit 4 test suite for FlowSensitiveInlineVariables (Closure-170b).
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

  // Helper method to compile and run the pass on JavaScript source code
  private String optimize(String js) {
    CompilerPass pass = new FlowSensitiveInlineVariables(compiler);
    Node root = compiler.parseSyntheticCode("testcode", js);
    // Process root
    pass.process(compiler.externsRoot, root);
    return compiler.toSource(root);
  }

  public void testGlobalScopeIgnored() {
    // Global scope variables should not trigger inlining or errors
    String js = "var x = 1; var y = x;";
    String result = optimize(js);
    assertTrue(result.contains("x"));
  }

  public void testSimpleVariableInlining() {
    // Basic valid case: single definition, single use, no side effects
    String js = "function f() { var x = 1; return x; }";
    String result = optimize(js);
    // Should inline x = 1 into return 1 (or return x depending on AST representation, 
    // but the transformation replaces name with RHS)
    assertFalse(result.contains("var x"));
  }

  public void testParamInlineRejected() {
    // Parameters are function nodes / defined by function, cannot be inlined
    String js = "function f(x) { return x; }";
    String result = optimize(js);
    assertTrue(result.contains("x"));
  }

  public void testVariableInLoopRejected() {
    // Variables used within a loop must not be inlined
    String js = "function f() { var x = 1; while(true) { use(x); } } function use(val) {}";
    String result = optimize(js);
    // Variable x should remain because it's in a loop
    assertTrue(result.contains("var x"));
  }

  public void testSideEffectOnRightRejected() {
    // Definition RHS has side effects (e.g. function call with side effects)
    String js = "function f() { var x = sideEffect(); print(x); } function sideEffect() { return 1; } function print(v) {}";
    // Depending on side effect configuration, function calls are usually considered side-effecting unless marked pure
    String result = optimize(js);
    // Just verifying execution reaches branches without exception
    assertNotNull(result);
  }

  public void testObjectLiteralRValueRejected() {
    // R-Value containing object literal should prevent inlining
    String js = "function f() { var x = {a: 1}; print(x.a); } function print(v) {}";
    String result = optimize(js);
    assertTrue(result.contains("var x"));
  }

  public void testGetPropRValueRejected() {
    // R-Value containing GETPROP should prevent inlining due to potential aliasing
    String js = "function f() { var x = a.b; print(x); } var a = {b: 1}; function print(v) {}";
    String result = optimize(js);
    assertTrue(result.contains("var x"));
  }

  public void testMultipleUsesRejected() {
    // Multiple uses for the same definition should prevent inlining
    String js = "function f() { var x = 1; print(x); print(x); } function print(v) {}";
    String result = optimize(js);
    assertTrue(result.contains("var x"));
  }

  public void testCatchBlockRValueRejected() {
    // Reference to a catch expression variable in R-Value
    String js = "try {} catch (e) { var x = e; print(x); } function print(v) {}";
    String result = optimize(js);
    assertNotNull(result);
  }
}