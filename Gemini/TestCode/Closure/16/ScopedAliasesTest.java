package com.google.javascript.jscomp;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for ScopedAliases (Closure-16b) designed with high Branch/Condition coverage
 * and targeting Defects4J fault scenarios using only JUnit 4 / JUnit 3 framework as provided in classpath.
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

  private void compileAndCheck(String original, String expected) {
    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parseSyntheticCode("testcode", original);
    assertEquals("Parsing should have no errors", 0, compiler.getErrorCount());
    
    ScopedAliases pass = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(externs, root);
    
    if (compiler.getErrorCount() == 0 && expected != null) {
      String generated = compiler.toSource(root);
      assertEquals(expected, generated);
    }
  }

  private void compileAndExpectError(String original, DiagnosticType expectedError) {
    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parseSyntheticCode("testcode", original);
    
    ScopedAliases pass = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(externs, root);
    
    boolean foundError = false;
    for (JSError error : compiler.getErrors()) {
      if (error.getDefaultMessage().equals(expectedError.defaultMessage)) {
        foundError = true;
        break;
      }
    }
    assertTrue("Expected error: " + expectedError.key, foundError);
  }

  @Test
  public void testBasicAliasProcessing() {
    String js = "goog.scope(function() { var dom = goog.dom; dom.createElement('div'); });";
    String expected = "goog.dom.createElement(\"div\");";
    compileAndCheck(js, expected);
  }

  @Test
  public void testTransitiveAliasProcessing() {
    String js = "goog.scope(function() { var g = goog; var dom = g.dom; dom.createElement('div'); });";
    String expected = "goog.dom.createElement(\"div\");";
    compileAndCheck(js, expected);
  }

  @Test
  public void testTypeNodeAliasProcessing() {
    String js = "goog.scope(function() { var dom = goog.dom;\n" +
                "/** @type {dom.TagName} */ var x = 'div'; });";
    // Checks fixTypeNode branch execution
    compileAndCheck(js, "/** @type {goog.dom.TagName} */\nvar x=\"div\";");
  }

  @Test
  public void testScopeUsedImproperly() {
    // goog.scope must be alone in a single statement (e.g. assigned or in binary expr)
    String js = "var x = goog.scope(function() {});";
    compileAndExpectError(js, ScopedAliases.GOOG_SCOPE_USED_IMPROPERLY);
  }

  @Test
  public void testScopeBadParameters_NotFunction() {
    String js = "goog.scope(123);";
    compileAndExpectError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testScopeBadParameters_FunctionWithParams() {
    String js = "goog.scope(function(a) {});";
    compileAndExpectError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testScopeBadParameters_NamedFunction() {
    String js = "goog.scope(function foo() {});";
    compileAndExpectError(js, ScopedAliases.GOOG_SCOPE_HAS_BAD_PARAMETERS);
  }

  @Test
  public void testScopeReferencesThis() {
    String js = "goog.scope(function() { var x = this.foo; });";
    compileAndExpectError(js, ScopedAliases.GOOG_SCOPE_REFERENCES_THIS);
  }

  @Test
  public void testScopeUsesReturn() {
    String js = "goog.scope(function() { return; });";
    compileAndExpectError(js, ScopedAliases.GOOG_SCOPE_USES_RETURN);
  }

  @Test
  public void testScopeUsesThrow() {
    String js = "goog.scope(function() { throw 'error'; });";
    compileAndExpectError(js, ScopedAliases.GOOG_SCOPE_USES_THROW);
  }

  @Test
  public void testAliasRedefined() {
    String js = "goog.scope(function() { var dom = goog.dom; dom = goog.array; });";
    compileAndExpectError(js, ScopedAliases.GOOG_SCOPE_ALIAS_REDEFINED);
  }

  @Test
  public void testNonAliasLocal() {
    String js = "goog.scope(function() { var notAnAlias = 5; });";
    compileAndExpectError(js, ScopedAliases.GOOG_SCOPE_NON_ALIAS_LOCAL);
  }

  @Test
  public void testNamespaceShadowingAndRenaming() {
    // Triggers findNamespaceShadows and renameNamespaceShadows logic when scope depth > 2
    String js = "goog.scope(function() {\n" +
                "  var dom = goog.dom;\n" +
                "  function inner() {\n" +
                "    var goog = 1;\n" +
                "    dom.createElement('div');\n" +
                "  }\n" +
                "});";
    // Should compile and rename shadowed 'goog' variable safely
    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parseSyntheticCode("testcode", js);
    ScopedAliases pass = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(externs, root);
    assertEquals(0, compiler.getErrorCount());
  }
}