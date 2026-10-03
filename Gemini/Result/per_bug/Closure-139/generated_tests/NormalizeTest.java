/*
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Before;

/**
 * Unit tests for Normalize compiler pass focusing on high branch/condition coverage
 * and edge cases corresponding to Closure-139b.
 */
public class NormalizeTest extends TestCase {

  private Compiler compiler;

  @Before
  public void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // Initialize basic compiler options/configs if necessary
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  private void testNormalize(String js, String expected) {
    testNormalize(js, expected, false);
  }

  private void testNormalize(String js, String expected, boolean assertOnChange) {
    Node root = compiler.parseSyntheticCode("testcode", js);
    Node externs = new Node(Token.BLOCK);
    
    Normalize normalizer = new Normalize(compiler, assertOnChange);
    normalizer.process(externs, root);
    
    String result = compiler.toSource(root);
    assertEquals(expected, result);
  }

  @Test
  public void testSplitVarDeclarations() {
    // Tests splitting multiple var declarations into single statements
    test("var a = 1, b = 2;", "var a = 1;var b = 2;");
  }

  @Test
  public void testConvertWhileToFor() {
    // Tests while loop conversion to for loop
    test("while(x) { foo(); }", "for(;x;) {foo()}");
  }

  @Test
  public void testMoveNamedFunctions() {
    // Tests moving unhoisted named function declarations to the top
    test("function f() {} var a = 1; function g() {}", "function f() {}function g() {var a = 1}");
  }

  @Test
  public void testNormalizeLabels() {
    // Tests label normalization wrapping non-block/non-loop statements in a block
    test("myLabel: foo();", "myLabel:{foo()}");
  }

  @Test
  public void testExtractForInitializer() {
    // Tests pulling initializers out of for loops
    test("for(var i = 0; i < 10; i++) { foo(); }", "var i = 0;for(;i < 10;i++) {foo()}");
  }

  @Test
  public void testDuplicateDeclarationsAssignment() {
    // Tests duplicate var declaration with initialization: var a = 1; var a = 2; -> var a = 1; a = 2;
    test("var a = 1; var a = 2;", "var a = 1;a = 2;");
  }

  @Test
  public void testDuplicateDeclarationsInForIn() {
    // Tests duplicate declaration inside for-in loop structure
    test("var a; for (a in obj) { var a; }", "var a;for (a in obj) {a}");
  }

  @Test
  public void testDuplicateDeclarationsInLabel() {
    // Tests duplicate declaration inside a labeled statement without initialization
    test("myLabel: { var a; var a; }", "myLabel:{var a;;}");
  }

  @Test
  public void testEmptyVarNodeThrowsException() {
    // Tests assertOnChange branch when an empty VAR node is encountered (Edge case for splitVarDeclarations)
    try {
      Node root = new Node(Token.BLOCK);
      Node varNode = new Node(Token.VAR); // Empty var node
      root.addChildToBack(varNode);
      Node externs = new Node(Token.BLOCK);

      Normalize normalizer = new Normalize(compiler, true); // assertOnChange = true
      normalizer.process(externs, root);
      fail("Expected IllegalStateException due to empty VAR node under assertOnChange");
    } catch (IllegalStateException e) {
      assertTrue(e.getMessage().contains("Empty VAR node"));
    }
  }

  @Test
  public void testConstantAnnotationsPropogation() {
    // Tests constant annotation propagation pass
    compiler.parseSyntheticCode("testcode", "/** @const */ var FOO = 1; var y = FOO;");
    Node root = compiler.getRoot();
    Node externs = new Node(Token.BLOCK);
    
    Normalize.PropogateConstantAnnotations prop = 
        new Normalize.PropogateConstantAnnotations(compiler, false);
    prop.process(externs, root);
    
    // Verify that the reference gets marked
    assertTrue(root.getLastChild().getFirstChild().getBooleanProp(Node.IS_CONSTANT_NAME));
  }

  @Test
  public void testVerifyConstantsConsistency() {
    // Tests VerifyConstants consistency check across identical naming usages
    Node root = compiler.parseSyntheticCode("testcode", "var FOO = 1; var x = FOO;");
    Node externs = new Node(Token.BLOCK);
    
    Normalize.VerifyConstants verifier = 
        new Normalize.VerifyConstants(compiler, false);
    verifier.process(externs, root);
  }

  @Test(expected = IllegalStateException.class)
  public void testVerifyConstantsInconsistentAnnotation() {
    // Tests VerifyConstants throwing state exception when constant annotation is inconsistent
    Node root = compiler.parseSyntheticCode("testcode", "var FOO = 1; var x = FOO;");
    Node externs = new Node(Token.BLOCK);
    
    // Force inconsistent constant property manually
    Node nameNode = root.getFirstChild().getFirstChild().getFirstChild(); // Name node of FOO
    nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, true);
    
    // Second usage without constant property but mapped otherwise or forced check
    Normalize.VerifyConstants verifier = 
        new Normalize.VerifyConstants(compiler, true);
    verifier.process(externs, root);
  }

  private void test(String js, String expected) {
    testNormalize(js, expected, false);
  }
}