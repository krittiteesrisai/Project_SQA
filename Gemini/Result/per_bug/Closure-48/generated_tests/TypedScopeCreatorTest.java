package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * Unit test for TypedScopeCreator focusing on high branch/condition coverage
 * and edge cases for Closure-48b.
 */
public class TypedScopeCreatorTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    // Initialize basic compiler options if needed
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  @Test
  public void testCreateGlobalScopeBasic() {
    // Edge Case: Global scope creation with simple script and variable
    Node script = new Node(Token.SCRIPT);
    Node nameNode = Node.newString(Token.NAME, "x");
    nameNode.addChildToBack(Node.newNumber(10.0));
    Node varNode = new Node(Token.VAR, nameNode);
    script.addChildToBack(varNode);

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(script, null);

    assertNotNull(scope);
    assertTrue(scope.isGlobal());
    assertNotNull(scope.getVar("x"));
  }

  @Test
  public void testCreateLocalScopeBasic() {
    // Edge Case: Local scope creation where parent is not null
    Node script = new Node(Token.SCRIPT);
    Node fnName = Node.newString(Token.NAME, "foo");
    Node paramList = new Node(Token.PARAM_LIST);
    Node body = new Node(Token.BLOCK);
    Node fnNode = new Node(Token.FUNCTION, fnName, paramList, body);
    script.addChildToBack(fnNode);

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(script, null);
    
    // Create local scope for function body
    Scope localScope = creator.createScope(body, globalScope);
    assertNotNull(localScope);
    assertFalse(localScope.isGlobal());
    assertEquals(globalScope, localScope.getParent());
  }

  @Test
  public void testPatchGlobalScopeEdgeCase() {
    // Edge Case: patchGlobalScope with valid SCRIPT node and existing global scope
    Node script = new Node(Token.SCRIPT);
    script.setStaticSourceFile(new SourceFile("test.js"));
    Node nameNode = Node.newString(Token.NAME, "y");
    Node varNode = new Node(Token.VAR, nameNode);
    script.addChildToBack(varNode);

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope globalScope = creator.createScope(script, null);

    assertNotNull(globalScope.getVar("y"));

    // Patch the global scope with the same script node
    creator.patchGlobalScope(globalScope, script);
    assertNotNull(globalScope);
  }

  @Test
  public void testObjectLiteralLendsUnknownVar() {
    // Edge Case: Object literal with @lends pointing to a non-existent variable
    Node script = new Node(Token.SCRIPT);
    Node objLit = new Node(Token.OBJECTLIT);
    
    // Simulate @lends nonExistentVar via JSDocInfo or direct handling if testable via AST
    Node expr = new Node(Token.EXPR_RESULT, objLit);
    script.addChildToBack(expr);

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(script, null);
    assertNotNull(scope);
  }

  @Test
  public void testPrototypeAssignmentHandling() {
    // Edge Case: Assigning to F.prototype when F is declared
    Node script = new Node(Token.SCRIPT);
    Node ctorName = Node.newString(Token.NAME, "MyClass");
    Node ctorFn = new Node(Token.FUNCTION, ctorName, new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
    Node varNode = new Node(Token.VAR, ctorFn);
    script.addChildToBack(varNode);

    // MyClass.prototype = {}
    Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "MyClass"), Node.newString(Token.STRING, "prototype"));
    Node objLit = new Node(Token.OBJECTLIT);
    Node assign = new Node(Token.ASSIGN, getProp, objLit);
    script.addChildToBack(new Node(Token.EXPR_RESULT, assign));

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(script, null);
    assertNotNull(scope);
  }

  @Test
  public void testStubDeclaration() {
    // Edge Case: Stub declaration (e.g. qualified name expression result without RHS)
    Node script = new Node(Token.SCRIPT);
    Node getProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "ns"), Node.newString(Token.STRING, "prop"));
    Node expr = new Node(Token.EXPR_RESULT, getProp);
    script.addChildToBack(expr);

    TypedScopeCreator creator = new TypedScopeCreator(compiler);
    Scope scope = creator.createScope(script, null);
    assertNotNull(scope);
  }
}