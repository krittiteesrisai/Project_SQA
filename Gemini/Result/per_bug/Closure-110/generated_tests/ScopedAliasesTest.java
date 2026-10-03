package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import junit.framework.TestCase;

/**
 * Unit tests for ScopedAliases (Closure-110b) focusing on high branch/condition coverage
 * using only JUnit 4 and allowed classpath libraries.
 */
public class ScopedAliasesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private void test(String javascript, String expected) {
    test(javascript, expected, null);
  }

  private void test(String javascript, String expected, DiagnosticType error) {
    compiler.getErrorManager().reset();
    Node root = compiler.parseSyntheticCode("testcode", javascript);
    Node externs = new Node(Token.BLOCK);
    
    ScopedAliases pass = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(externs, root);

    if (error != null) {
      assertTrue("Expected error: " + error, compiler.getErrorCount() > 0);
      boolean found = false;
      for (JSError err : compiler.getErrorManager().getErrors()) {
        if (err.getType() == error) {
          found = true;
          break;
        }
      }
      assertTrue("Expected specific error type " + error, found);
    } else {
      assertEquals("Unexpected compilation errors: " + compiler.getErrorManager().getErrors(), 0, compiler.getErrorCount());
      String result = compiler.toSource(root);
      assertEquals(expected, result);
    }
  }

  public void testValidScopeAlias() {
    String js = "goog.scope(function() { var dom = goog.dom; dom.createElement('div'); });";
    String expected = "goog.dom.createElement(\"div\");";
    test(js, expected);
  }

  public void testScopeUsedImproperly() {
    String js = "var x = goog.scope(function() {});";
    test(js, "", ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  public void testScopeBadParametersNoParam() {
    String js = "goog.scope();";
    test(js, "", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  public void testScopeBadParametersTooManyParams() {
    String js = "goog.scope(function() {}, 1);";
    test(js, "", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  public void testScopeBadParametersNamedFunction() {
    String js = "goog.scope(function foo() {});";
    test(js, "", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  public void testScopeBadParametersWithArguments() {
    String js = "goog.scope(function(a) {});";
    test(js, "", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  public void testScopeReferencesThis() {
    String js = "goog.scope(function() { this.x = 1; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  public void testScopeUsesReturn() {
    String js = "goog.scope(function() { return 1; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  public void testScopeUsesThrow() {
    String js = "goog.scope(function() { throw new Error(); });";
    test(js, "", ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  public void testAliasRedefined() {
    String js = "goog.scope(function() { var dom = goog.dom; dom = 1; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  public void testNonAliasLocal() {
    String js = "goog.scope(function() { var localNotAlias = 1; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  public void testAliasCycle() {
    String js = "goog.scope(function() { var a = b; var b = a; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_ALIAS_CYCLE);
  }

  public void testAliasedTypeNode() {
    String js = "goog.scope(function() { var dom = goog.dom; /** @type {dom.TagName} */ var x; });";
    String expected = "/** @type {goog.dom.TagName} */\nvar x;";
    test(js, expected);
  }
}