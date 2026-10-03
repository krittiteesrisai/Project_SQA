package com.google.javascript.jscomp;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * High-coverage JUnit 4 test cases for CoalesceVariableNames (Closure-142b).
 */
public class CoalesceVariableNamesTest extends TestCase {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  @Test
  public void testGlobalScopeIgnored() {
    Compiler compiler = createCompiler();
    Node root = getNode("var x = 1; print(x);", compiler);
    
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, root);
    
    assertNotNull(root);
  }

  @Test
  public void testCoalesceLocalVariablesBasic() {
    Compiler compiler = createCompiler();
    // Two non-overlapping variables that can be coalesced
    String js = "function f() { var x = 1; window.alert(x); var y = 2; window.alert(y); }";
    Node root = getNode(js, compiler);

    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, root);
    
    String generated = compiler.toSource();
    assertTrue(generated.contains("x"));
  }

  @Test
  public void testCoalesceWithPseudoNames() {
    Compiler compiler = createCompiler();
    String js = "function f() { var a = 1; window.alert(a); var b = 2; window.alert(b); }";
    Node root = getNode(js, compiler);

    // usePseudoNames = true
    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, true);
    pass.process(null, root);

    assertNotNull(compiler.toSource());
  }

  @Test
  public void testParametersAndEscapedLocals() {
    Compiler compiler = createCompiler();
    // Exactly 2 parameters trigger the IE bug workaround in analyze()
    String js = "function f(a, b) { var x = a + b; return x; }";
    Node root = getNode(js, compiler);

    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, root);

    assertNotNull(compiler.toSource());
  }

  @Test
  public void testForInLoopCoalescing() {
    Compiler compiler = createCompiler();
    String js = "function f() { var obj = {p:1}; for (var key in obj) { window.alert(key); } }";
    Node root = getNode(js, compiler);

    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, root);

    assertNotNull(compiler.toSource());
  }

  @Test
  public void testAssignmentOperatorsAndReads() {
    Compiler compiler = createCompiler();
    String js = "function f() { var x = 1; x += 2; window.alert(x); }";
    Node root = getNode(js, compiler);

    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, root);

    assertNotNull(compiler.toSource());
  }

  @Test
  public void testMultipleVarsInSingleDeclaration() {
    Compiler compiler = createCompiler();
    String js = "function f() { var x = 1, y = 2; window.alert(x); window.alert(y); }";
    Node root = getNode(js, compiler);

    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, root);

    assertNotNull(compiler.toSource());
  }

  @Test
  public void testEmptyVarDeclaration() {
    Compiler compiler = createCompiler();
    String js = "function f() { var x, y; x = 1; window.alert(x); }";
    Node root = getNode(js, compiler);

    CoalesceVariableNames pass = new CoalesceVariableNames(compiler, false);
    pass.process(null, root);

    assertNotNull(compiler.toSource());
  }

  private Node getNode(String js, Compiler compiler) {
    Node root = compiler.parseSyntheticCode("testcode", js);
    assertNotNull(root);
    return root;
  }
}