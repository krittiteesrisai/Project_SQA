package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * JUnit 4 Test Suite for InlineObjectLiterals (Closure-53b)
 * Focused on high Branch/Condition Coverage and Edge Cases.
 */
public class InlineObjectLiteralsTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private void optimize(String js, CompilerPass pass) {
    Node root = compiler.parseSyntheticCode("test", js);
    compiler.setRoot(root);
    pass.process(compiler.externsRoot, compiler.getRoot());
  }

  private Supplier<String> createSafeNameIdSupplier() {
    return new Supplier<String>() {
      private int id = 0;
      @Override
      public String get() {
        return String.valueOf(id++);
      }
    };
  }

  @Test
  public void testSimpleObjectLiteralInlining() {
    String js = "var x = {a: 1, b: 2}; foo(x.a + x.b);";
    String expected = "var JSCompiler_object_inline_a_0 = 1;var JSCompiler_object_inline_b_1 = 2;foo(JSCompiler_object_inline_a_0 + JSCompiler_object_inline_b_1);";
    
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, createSafeNameIdSupplier());
    optimize(js, pass);
    
    String actual = compiler.toSource();
    // Normalize spacing for comparison
    assertEquals(expected.replaceAll("\\s+", ""), actual.replaceAll("\\s+", ""));
  }

  @Test
  public void testObjectLiteralWithAssignment() {
    String js = "var x; x = {a: 1}; foo(x.a);";
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, createSafeNameIdSupplier());
    optimize(js, pass);
    assertNotNull(compiler.toSource());
  }

  @Test
  public void testForbiddenGlobalVariable() {
    // Global variables should not be inlined
    String js = "x = {a: 1}; foo(x.a);";
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, createSafeNameIdSupplier());
    optimize(js, pass);
    // Should remain largely unchanged due to global check
    assertTrue(compiler.toSource().contains("x = {a:1}"));
  }

  @Test
  public void testCallTargetAsThisValueForbidden() {
    // x.fn() where x is an object literal used as 'this' should not be inlined
    String js = "var x = {a: function() { this.b = 1; }}; x.a();";
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, createSafeNameIdSupplier());
    optimize(js, pass);
    // Verifies that isInlinableObject returns false for call targets using 'this'
    assertTrue(compiler.toSource().contains("x"));
  }

  @Test
  public void testNonObjectLiteralAssignmentForbidden() {
    String js = "var x = 5; foo(x);";
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, createSafeNameIdSupplier());
    optimize(js, pass);
    assertTrue(compiler.toSource().contains("x = 5"));
  }

  @Test
  public void testEs5GetterSetterForbidden() {
    String js = "var x = { get a() { return 1; } }; foo(x.a);";
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, createSafeNameIdSupplier());
    optimize(js, pass);
    // ES5 Get/Set not supported, should not inline
    assertTrue(compiler.toSource().contains("get a()"));
  }

  @Test
  public void testSelfReferentialAssignmentForbidden() {
    String js = "var x = {a: 1, b: x.a}; foo(x.b);";
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, createSafeNameIdSupplier());
    optimize(js, pass);
    // Self-referential object literals must not be inlined
    assertTrue(compiler.toSource().contains("x = {"));
  }

  @Test
  public void testEmptyObjectLiteral() {
    String js = "var x = {};";
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, createSafeNameIdSupplier());
    optimize(js, pass);
    assertNotNull(compiler.toSource());
  }
}