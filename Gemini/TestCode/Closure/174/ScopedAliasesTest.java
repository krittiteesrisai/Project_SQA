package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * ชุดทดสอบสำหรับคลาส ScopedAliases (Defects4J Closure-174b)
 * มุ่งเน้นการครอบคลุม Branch/Condition Coverage ขั้นสูงสุดและทดสอบ Edge Cases
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

  private void testProcess(String js, String expectedJs) {
    testProcess(js, expectedJs, false);
  }

  private void testProcess(String js, String expectedJs, boolean expectError) {
    Node root = compiler.parseSyntheticCode("testcode", js);
    Node externs = compiler.parseSyntheticCode("externs", "");
    
    ScopedAliases pass = new ScopedAliases(compiler, null, new CompilerOptions.NullAliasTransformationHandler());
    pass.process(externs, root);

    if (expectError) {
      assertTrue("Expected compilation errors", compiler.hasErrors());
    } else {
      assertFalse("Unexpected compilation errors: " + compiler.getErrorManager().getSummary(), compiler.hasErrors());
      String result = compiler.toSource(root);
      assertEquals(expectedJs, result);
    }
  }

  @Test
  public void testValidSimpleScopeAlias() {
    String js = "goog.scope(function() { var dom = goog.dom; dom.createElement('div'); });";
    String expected = "goog.dom.createElement(\"div\");";
    testProcess(js, expected);
  }

  @Test
  public void testMultipleAndTransitiveAliases() {
    String js = "goog.scope(function() { var g = goog; var dom = g.dom; dom.createElement('div'); });";
    String expected = "goog.dom.createElement(\"div\");";
    testProcess(js, expected);
  }

  @Test
  public void testAliasedTypeNode() {
    String js = "goog.scope(function() { /** @type {goog.dom.DomHelper} */ var dom = goog.dom; });";
    String expected = "";
    testProcess(js, expected);
  }

  @Test
  public void testScopeUsedImproperly() {
    // goog.scope must be alone in a single statement (e.g. assigned or used in binary op)
    String js = "var x = goog.scope(function() {});";
    testProcess(js, "", true);
  }

  @Test
  public void testScopeBadParametersCount() {
    String js = "goog.scope();";
    testProcess(js, "", true);
  }

  @Test
  public void testScopeBadParametersNamedFunction() {
    String js = "goog.scope(function foo() {});";
    testProcess(js, "", true);
  }

  @Test
  public void testScopeBadParametersWithArgs() {
    String js = "goog.scope(function(a) {});";
    testProcess(js, "", true);
  }

  @Test
  public void testScopeReferencesThis() {
    String js = "goog.scope(function() { this.x = 1; });";
    testProcess(js, "", true);
  }

  @Test
  public void testScopeUsesReturn() {
    String js = "goog.scope(function() { return 1; });";
    testProcess(js, "", true);
  }

  @Test
  public void testScopeUsesThrow() {
    String js = "goog.scope(function() { throw new Error(); });";
    testProcess(js, "", true);
  }

  @Test
  public void testScopeAliasRedefined() {
    String js = "goog.scope(function() { var dom = goog.dom; dom = 1; });";
    testProcess(js, "", true);
  }

  @Test
  public void testScopeAliasCycle() {
    // Creating an alias cycle or unresolvable reference setup
    String js = "goog.scope(function() { var a = b; var b = a; });";
    testProcess(js, "", true);
  }

  @Test
  public void testScopeNonAliasLocal() {
    // Local variable that is not an alias (e.g., assigning a literal or local expression)
    String js = "goog.scope(function() { var x = 10; });";
    testProcess(js, "", true);
  }

  @Test
  public void testEmptyRootAndNoScopeCalls() {
    String js = "var a = 1;";
    String expected = "var a=1;";
    testProcess(js, expected);
  }
}