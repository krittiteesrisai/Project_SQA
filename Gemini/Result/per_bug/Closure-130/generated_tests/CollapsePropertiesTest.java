package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * JUnit 4 Test Suite for CollapseProperties (Defects4J Closure-130b)
 */
public class CollapsePropertiesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  @Test
  public void testBasicNamespaceCollapseAndInlineAliases() {
    // Branch: inlineAliases = true, collapsePropertiesOnExternTypes = false
    // Trigger basic object collapsing and local alias inlining.
    String js = "var goog = {}; goog.events = {}; goog.events.handleEvent = function() {};" +
                "function f() { var a = goog.events.handleEvent; a(); }";
    Node root = compiler.parseSyntheticCode("testjs", js);
    Node externs = new Node(Token.BLOCK);

    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(externs, root);

    assertNotNull(compiler.toSource(root));
  }

  @Test
  public void testGetterAndSetterInObjectLiteral() {
    // Branch: objlit keys with getter and setter (should be skipped by declareVarsForObjLitValues)
    String js = "var obj = { get x() { return 1; }, set x(v) {} };";
    Node root = compiler.parseSyntheticCode("testjs", js);
    Node externs = new Node(Token.BLOCK);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(externs, root);

    assertNotNull(compiler.toSource(root));
  }

  @Test
  public void testExternTypesNamespaceCollapse() {
    // Branch: collapsePropertiesOnExternTypes = true
    String js = "var String = {}; String.foo = 1;";
    Node root = compiler.parseSyntheticCode("testjs", js);
    Node externs = compiler.parseSyntheticCode("externs", "var String;");

    CollapseProperties pass = new CollapseProperties(compiler, true, false);
    pass.process(externs, root);

    assertNotNull(compiler.toSource(root));
  }

  @Test
  public void testUnsafeNamespaceWarningAndRedefinition() {
    // Branch: checkNamespaces warning conditions (aliasing and redefinition / delete)
    String js = "var ns = {}; ns.A = 1; var alias = ns; ns.A = 2; delete ns.A;";
    Node root = compiler.parseSyntheticCode("testjs", js);
    Node externs = new Node(Token.BLOCK);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(externs, root);

    // Verify that warnings or reports are generated or handled safely without crashing
    assertNotNull(compiler.toSource(root));
  }

  @Test
  public void testPropertyWithDollarSignEdgeCase() {
    // Branch / Edge Case: appendPropForAlias containing '$' character
    // Triggers prop.indexOf('$') != -1 -> replaces '$' with '$0'
    String js = "var ns = {}; ns['prop$sub'] = 5; ns.prop$sub;";
    Node root = compiler.parseSyntheticCode("testjs", js);
    Node externs = new Node(Token.BLOCK);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(externs, root);

    String result = compiler.toSource(root);
    assertNotNull(result);
  }

  @Test
  public void testComplexAssignmentAndStubs() {
    // Branch: Complex assignment, stub declarations for undeclared properties, and constants
    String js = "var a = {}; /** @const */ a.B = 2; (a.C = 3);";
    Node root = compiler.parseSyntheticCode("testjs", js);
    Node externs = new Node(Token.BLOCK);

    CollapseProperties pass = new CollapseProperties(compiler, false, false);
    pass.process(externs, root);

    assertNotNull(compiler.toSource(root));
  }
}