package com.google.javascript.jscomp;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for ScopedAliases (Closure-24b)
 * Focuses on high branch/condition coverage and edge cases.
 */
public class ScopedAliasesTest {

  private Compiler compiler;

  @Before
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private void test(String js, String expected) {
    test(js, expected, null);
  }

  private void test(String js, String expected, DiagnosticType expectedError) {
    CompilerPass pass = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", js);
    compiler.setRoot(root);
    
    // Run traversal and transformation
    pass.process(null, root);

    if (expectedError != null) {
      assertTrue("Expected error: " + expectedError.key, compiler.getErrorManager().getErrorCount() > 0);
    } else {
      assertFalse("Unexpected compilation errors", compiler.hasErrors());
      String actual = compiler.toSource(root);
      assertEquals(expected, actual);
    }
  }

  @Test
  public void testValidScopeAlias() {
    String js = "goog.scope(function() { var dom = goog.dom; dom.createElement('div'); });";
    String expected = "goog.dom.createElement(\"div\");";
    test(js, expected);
  }

  @Test
  public void testTransitiveAlias() {
    String js = "goog.scope(function() { var g = goog; var dom = g.dom; dom.createElement('div'); });";
    String expected = "goog.dom.createElement(\"div\");";
    test(js, expected);
  }

  @Test
  public void testScopeUsedImproperly() {
    String js = "var x = goog.scope(function() { var dom = goog.dom; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testScopeBadParametersCount() {
    String js = "goog.scope();";
    test(js, "", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testScopeBadParametersNonFunction() {
    String js = "goog.scope(123);";
    test(js, "", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testScopeBadParametersNamedFunction() {
    String js = "goog.scope(function foo() {});";
    test(js, "", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testScopeBadParametersWithParams() {
    String js = "goog.scope(function(a) {});";
    test(js, "", ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testScopeReferencesThis() {
    String js = "goog.scope(function() { var x = this; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testScopeUsesReturn() {
    String js = "goog.scope(function() { return; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testScopeUsesThrow() {
    String js = "goog.scope(function() { throw new Error(); });";
    test(js, "", ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testScopeNonAliasLocal() {
    String js = "goog.scope(function() { var x = 5; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testScopeAliasRedefined() {
    String js = "goog.scope(function() { var dom = goog.dom; dom = 1; });";
    test(js, "", ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testAliasedTypeNode() {
    String js = "goog.scope(function() { var dom = goog.dom; /** @type {dom.Table} */ var x = null; });";
    String expected = "var x = null;";
    test(js, expected);
  }

  @Test
  public void testAliasedTypeNodeWithoutDot() {
    String js = "goog.scope(function() { var dom = goog.dom; /** @type {dom} */ var x = null; });";
    String expected = "var x = null;";
    test(js, expected);
  }

  @Test
  public void testShouldTraverseGlobalNonScopeFunction() {
    String js = "function globalFunc() { function inner() {} }";
    String expected = "function globalFunc() {\n  function inner() {\n  }\n}";
    test(js, expected);
  }
}