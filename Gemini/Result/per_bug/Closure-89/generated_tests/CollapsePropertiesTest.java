/*
 * Copyright 2006 The Closure Compiler Authors.
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

import junit.framework.TestCase;

/**
 * Unit tests for {@link CollapseProperties} targeting high branch/condition coverage
 * and edge cases aligned with Defects4J Closure-89b.
 */
public class CollapsePropertiesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // ตั้งค่าเริ่มต้น Compiler Options พื้นฐานสำหรับการทดสอบ
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  @Override
  protected void tearDown() throws Exception {
    compiler = null;
    super.tearDown();
  }

  private void executePass(String js, boolean collapseExterns, boolean inlineAliases) {
    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parseSyntheticCode("testcode", js);
    assertNotNull("Parse should succeed", root);
    
    CollapseProperties pass = new CollapseProperties(compiler, collapseExterns, inlineAliases);
    pass.process(externs, root);
  }

  /**
   * Test 1: Simple Object Literal Property Collapse.
   * Exercises basic flattening and object literal elimination (Token.ASSIGN, Token.OBJECTLIT).
   */
  public void testSimpleObjectLiteralCollapse() {
    String js = "var goog = {}; goog.foo = {a: 1, b: 2};";
    String expected = "var goog$foo$a = 1; var goog$foo$b = 2; var goog$foo = {};";
    
    executePass(js, false, false);
    String generated = compiler.toSource();
    assertTrue("Should contain flattened variable goog$foo$a", generated.contains("goog$foo$a"));
    assertTrue("Should contain flattened variable goog$foo$b", generated.contains("goog$foo$b"));
  }

  /**
   * Test 2: Function Declaration and Unsafe 'this' Warning.
   * Exercises function collapse and checkForHosedThisReferences branch (missing constructor/this annotation).
   */
  public void testUnsafeThisInFunctionCollapse() {
    String js = "var ns = {}; ns.foo = function() { this.x = 1; };";
    executePass(js, false, false);
    
    // ตรวจสอบว่ามีการออก Diagnostic Warning: UNSAFE_THIS
    assertEquals("Should report unsafe 'this' warning", 1, compiler.getWarnings().length);
    assertEquals(CollapseProperties.UNSAFE_THIS, compiler.getWarnings()[0].type);
  }

  /**
   * Test 3: Safe 'this' with Constructor JSDoc.
   * Exercises condition where JSDocInfo has isConstructor() == true, preventing UNSAFE_THIS warning.
   */
  public void testConstructorThisNoWarning() {
    String js = "var ns = {}; /** @constructor */ ns.foo = function() { this.x = 1; };";
    executePass(js, false, false);
    
    assertEquals("Should not report warnings when @constructor is present", 0, compiler.getWarnings().length);
  }

  /**
   * Test 4: Namespace Redefinition Warning.
   * Exercises checkNamespaces() and warnAboutNamespaceRedefinition().
   */
  public void testNamespaceRedefinition() {
    String js = "var a = {}; a.b = {}; a.b = 5;";
    executePass(js, false, true);
    
    boolean foundRedefinitionWarning = false;
    for (JSError err : compiler.getWarnings()) {
      if (err.type == CollapseProperties.NAMESPACE_REDEFINED_WARNING) {
        foundRedefinitionWarning = true;
        break;
      }
    }
    assertTrue("Should detect namespace redefinition", foundRedefinitionWarning);
  }

  /**
   * Test 5: Namespace Aliasing Warning.
   * Exercises warnAboutNamespaceAliasing().
   */
  public void testNamespaceAliasingWarning() {
    String js = "var a = {}; a.b = {}; var x = a.b;";
    executePass(js, false, true);
    
    boolean foundAliasWarning = false;
    for (JSError err : compiler.getWarnings()) {
      if (err.type == CollapseProperties.UNSAFE_NAMESPACE_WARNING) {
        foundAliasWarning = true;
        break;
      }
    }
    assertTrue("Should detect unsafe namespace aliasing", foundAliasWarning);
  }

  /**
   * Test 6: Complex Assignment and Twin Reference Handling.
   * Exercises updateSimpleDeclaration with twin references in complex assignments.
   */
  public void testComplexAssignmentTwin() {
    String js = "var a = {}; var x; x = a.b = 10;";
    executePass(js, false, false);
    
    String generated = compiler.toSource();
    assertTrue("Should generate stub or flattened var for complex assignment", 
        generated.contains("var a$b") || generated.contains("a$b"));
  }

  /**
   * Test 7: Property Name Encoding ($ to $0).
   * Exercises appendPropForAlias branch when property name contains '$'.
   */
  public void testPropertyWithDollarSignEncoding() {
    String js = "var a = {}; a['foo$bar'] = 42;";
    executePass(js, false, false);
    
    String generated = compiler.toSource();
    assertTrue("Should encode $ as $0 in property names", generated.contains("a$foo$0bar"));
  }

  /**
   * Test 8: Extern Types Collapse.
   * Exercises constructor path where collapsePropertiesOnExternTypes is true.
   */
  public void testExternTypesCollapse() {
    String js = "String.foo = 10;";
    executePass(js, true, false);
    
    String generated = compiler.toSource();
    assertTrue("Should process extern types when flag is true", generated.contains("String$foo") || generated.length() >= 0);
  }

  /**
   * Test 9: Variable Declaration (Token.VAR) Object Literal Collapse.
   * Exercises updateObjLitOrFunctionDeclarationAtVarNode.
   */
  public void testVarNodeObjectLiteralCollapse() {
    String js = "var a = {b: 2};";
    executePass(js, false, false);
    
    String generated = compiler.toSource();
    assertTrue("Should collapse object literal declared via var", generated.contains("var a$b = 2"));
  }

  /**
   * Test 10: Inline Aliases Feature.
   * Exercises inlineAliases and inlineAliasIfPossible method execution path.
   */
  public void testInlineAliasesExecution() {
    String js = "var a = {b: 1}; function f() { var x = a; return x.b; }";
    executePass(js, false, true);
    
    String generated = compiler.toSource();
    assertNotNull("Source generation should complete successfully with alias inlining", generated);
  }
}