package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;

/**
 * Senior Java Test Automation Engineer crafted test suite for ScopedAliases (Closure-108b).
 */
public class ScopedAliasesTest extends TestCase {

  private Compiler compiler;
  private PreprocessorSymbolTable preprocessorSymbolTable;
  private CompilerOptions options;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    options = new CompilerOptions();
    compiler.initOptions(options);
    preprocessorSymbolTable = null; // Can be set if needed for specific branches
  }

  private void testScopedAliases(String jsInput, String expectedOutput) {
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", jsInput);
    compiler.processCode();
    
    // Perform traversal and pass execution manually or via Compiler instance
    // For direct testing, we run NodeTraversal with ScopedAliases Traversal or use Compiler wrapper.
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);

    if (expectedOutput != null) {
      String actualOutput = compiler.toSource(root);
      assertEquals(expectedOutput, actualOutput);
    }
  }

  @Test
  public void testValidSimpleScope() {
    String input = "goog.scope(function() { var dom = goog.dom; var DIV = dom.TagName.DIV; dom.createElement(DIV); });";
    String expected = "goog.dom.createElement(goog.dom.TagName.DIV);";
    testScopedAliases(input, expected);
    assertFalse(compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testScopeUsedImproperly() {
    // goog.scope must be alone in a single statement (e.g. assigned or used in expression)
    String input = "var x = goog.scope(function() { var dom = goog.dom; return dom; });";
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    
    assertTrue("Should report GOOG_SCOPE_USED_IMPROPERLY", compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testScopeHasBadParameters_NoParams() {
    String input = "goog.scope();";
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    
    assertTrue("Should report GOOG_SCOPE_HAS_BAD_PARAMETERS for missing function", compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testScopeHasBadParameters_FunctionWithParam() {
    String input = "goog.scope(function(a) { });";
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    
    assertTrue("Should report GOOG_SCOPE_HAS_BAD_PARAMETERS for function parameter", compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testScopeReferencesThis() {
    String input = "goog.scope(function() { var x = this.foo; });";
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    
    assertTrue("Should report GOOG_SCOPE_REFERENCES_THIS", compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testScopeUsesReturn() {
    String input = "goog.scope(function() { return 1; });";
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    
    assertTrue("Should report GOOG_SCOPE_USES_RETURN", compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testScopeUsesThrow() {
    String input = "goog.scope(function() { throw new Error(); });";
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    
    assertTrue("Should report GOOG_SCOPE_USES_THROW", compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testAliasRedefined() {
    String input = "goog.scope(function() { var dom = goog.dom; dom = 1; });";
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    
    assertTrue("Should report GOOG_SCOPE_ALIAS_REDEFINED", compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testAliasCycle() {
    String input = "goog.scope(function() { var a = b; var b = a; a.foo(); b.bar(); });";
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    
    assertTrue("Should report GOOG_SCOPE_ALIAS_CYCLE", compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testNonAliasLocal() {
    String input = "goog.scope(function() { var x = 10; x; });";
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    
    assertTrue("Should report GOOG_SCOPE_NON_ALIAS_LOCAL", compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testTransitiveAliases() {
    String input = "goog.scope(function() { var g = goog; var dom = g.dom; dom.createElement(); });";
    String expected = "goog.dom.createElement();";
    testScopedAliases(input, expected);
    assertFalse(compiler.getErrorManager().hasErrors());
  }

  @Test
  public void testAliasedTypeNodeUsage() {
    String input = "goog.scope(function() { var dom = goog.dom;\n" +
                   "/** @type {dom.TagName} */ var x = null;\n" +
                   "dom.createElement(x); });";
    // Verifies AliasedTypeNode branches and fixTypeNode execution
    CompilerPass pass = new ScopedAliases(compiler, preprocessorSymbolTable, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    Node root = compiler.parseSyntheticCode("testcode", input);
    Node externs = compiler.parseSyntheticCode("externs", "");
    pass.process(externs, root);
    assertFalse(compiler.getErrorManager().hasErrors());
  }
}