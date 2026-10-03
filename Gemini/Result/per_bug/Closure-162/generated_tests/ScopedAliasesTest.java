package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;

/**
 * Comprehensive JUnit 4 Test Suite for ScopedAliases (Closure-162b)
 * Target: Maximum Branch/Condition Coverage & Edge Cases (Defects4J)
 */
public class ScopedAliasesTest extends TestCase {

  private Compiler compiler;
  private PreprocessorSymbolTable preprocessorSymbolTable;
  private CompilerOptions options;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    options = new CompilerOptions();
    compiler.initOptions(options);
    preprocessorSymbolTable = null; // Can be configured if needed
  }

  private void runCompilerPass(Node root) {
    ScopedAliases pass = new ScopedAliases(compiler, preprocessorSymbolTable, new CompilerOptions.NullAliasTransformationHandler());
    pass.process(null, root);
  }

  // --- 1. Edge Cases: Invalid Scope Calls & Parameters ---

  public void testGoogScopeUsedImproperly() {
    // goog.scope used inside an assignment or expression where it shouldn't be alone
    Node script = getNodeFromString("var x = goog.scope(function() {});");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  public void testGoogScopeBadParametersNoParam() {
    Node script = getNodeFromString("goog.scope();");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  public void testGoogScopeBadParametersTooManyParams() {
    Node script = getNodeFromString("goog.scope(function() {}, 123);");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  public void testGoogScopeBadParametersNamedFunction() {
    Node script = getNodeFromString("goog.scope(function myFunc() {});");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  public void testGoogScopeBadParametersWithFunctionParams() {
    Node script = getNodeFromString("goog.scope(function(param) {});");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  // --- 2. Edge Cases: Forbidden Keywords inside goog.scope ---

  public void testGoogScopeReferencesThis() {
    Node script = getNodeFromString("goog.scope(function() { var y = this.foo; });");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  public void testGoogScopeUsesReturn() {
    Node script = getNodeFromString("goog.scope(function() { return 1; });");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  public void testGoogScopeUsesThrow() {
    Node script = getNodeFromString("goog.scope(function() { throw new Error(); });");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  // --- 3. Edge Cases: Alias Validation & Errors ---

  public void testGoogScopeNonAliasLocal() {
    Node script = getNodeFromString("goog.scope(function() { var nonAlias = 123; });");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  public void testGoogScopeAliasRedefined() {
    Node script = getNodeFromString("goog.scope(function() { var dom = goog.dom; dom = 1; });");
    runCompilerPass(script);
    assertTrue(compiler.getErrorManager().getErrorCount() > 0);
  }

  // --- 4. Happy Paths & Complex Branch Coverages ---

  public void testValidScopedAliasesAndVarDetaching() {
    // Single var child block
    Node script = getNodeFromString("goog.scope(function() { var dom = goog.dom; dom.createElement('div'); });");
    runCompilerPass(script);
    assertFalse(compiler.getErrorManager().hasErrors());
  }

  public void testMultipleVarChildrenDetachingBranch() {
    // Multiple vars in a single var statement (tests parent.hasOneChild() branch = false)
    Node script = getNodeFromString("goog.scope(function() { var dom = goog.dom, array = goog.array; dom.createElement('div'); });");
    runCompilerPass(script);
    assertFalse(compiler.getErrorManager().hasErrors());
  }

  public void testNestedFunctionTraversalControl() {
    // Traversal should skip normal functions in global scope but allow inner function inside goog.scope
    Node script = getNodeFromString(
        "function normalFunc() {} \n" +
        "goog.scope(function() { \n" +
        "  var dom = goog.dom; \n" +
        "  function inner() { dom.createElement('div'); } \n" +
        "  inner(); \n" +
        "});"
    );
    runCompilerPass(script);
    assertFalse(compiler.getErrorManager().hasErrors());
  }

  public void testTypeNodeFixingWithAndWithoutDot() {
    // Tests JSDoc type fixing branches in fixTypeNode
    Node script = getNodeFromString(
        "goog.scope(function() {\n" +
        "  var dom = goog.dom;\n" +
        "  /** @type {dom} */ var x;\n" +
        "  /** @type {dom.TagName} */ var y;\n" +
        "});"
    );
    runCompilerPass(script);
    assertFalse(compiler.getErrorManager().hasErrors());
  }

  // --- Helper to parse JS source into AST Node ---
  private Node getNodeFromString(String jsSource) {
    CompilerPass p = new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
      }
    };
    return compiler.parseSyntheticCode("testcode", jsSource);
  }
}