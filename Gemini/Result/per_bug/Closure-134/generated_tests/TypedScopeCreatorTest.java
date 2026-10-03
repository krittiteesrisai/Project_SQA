package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for TypedScopeCreator focusing on high branch/condition coverage
 * and edge cases compatible with JUnit 4 and Defects4J environment.
 */
public class TypedScopeCreatorTest extends TestCase {

  private Compiler compiler;
  private TypedScopeCreator scopeCreator;
  private JSTypeRegistry typeRegistry;

  @Before
  public void setUp() throws Exception {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    scopeCreator = new TypedScopeCreator(compiler);
    typeRegistry = compiler.getTypeRegistry();
  }

  @Test
  public void testCreateGlobalScopeNullParent() {
    // Branch: parent == null -> Global Scope creation
    Node root = new Node(Token.SCRIPT);
    root.putProp(Node.SOURCENAME_PROP, "testcode.js");
    
    Scope scope = scopeCreator.createScope(root, null);
    assertNotNull(scope);
    assertTrue(scope.isGlobal());
  }

  @Test
  public void testCreateLocalScopeNonNullParent() {
    // Branch: parent != null -> Local Scope creation
    Node root = new Node(Token.SCRIPT);
    Scope parentScope = new Scope(root, compiler);
    
    Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.LP), new Node(Token.BLOCK));
    functionNode.putProp(Node.SOURCENAME_PROP, "testcode.js");
    
    Scope localScope = scopeCreator.createScope(functionNode, parentScope);
    assertNotNull(localScope);
    assertTrue(localScope.isLocal());
  }

  @Test
  public void testMultipleVarDefWithJsDocWarning() {
    // Edge case / Branch: VAR with multiple children and JSDoc triggers MULTIPLE_VAR_DEF warning
    Node script = new Node(Token.SCRIPT);
    script.putProp(Node.SOURCENAME_PROP, "testcode.js");

    Node varNode = new Node(Token.VAR, new Node(Token.NAME, "a"), new Node(Token.NAME, "b"));
    // Attach JSDoc info to trigger the warning condition when childCount > 1
    varNode.setJSDocInfo(new com.google.javascript.rhino.JSDocInfo());
    script.addChildToBack(varNode);

    Scope globalScope = scopeCreator.createInitialScope(script);
    TypedScopeCreator.GlobalScopeBuilder builder = 
        scopeCreator.new GlobalScopeBuilder(globalScope);
    
    NodeTraversal.traverse(compiler, script, builder);
    // Verifies that compiler reports at least one error/warning for multiple var def
    assertFalse(compiler.getErrors().isEmpty());
  }

  @Test
  public void testCatchBlockDefinition() {
    // Branch: Token.CATCH scope definition
    Node script = new Node(Token.SCRIPT);
    script.putProp(Node.SOURCENAME_PROP, "testcode.js");
    
    Node catchNode = new Node(Token.CATCH, new Node(Token.NAME, "err"));
    script.addChildToBack(catchNode);

    Scope globalScope = scopeCreator.createInitialScope(script);
    TypedScopeCreator.GlobalScopeBuilder builder = 
        scopeCreator.new GlobalScopeBuilder(globalScope);
    
    NodeTraversal.traverse(compiler, script, builder);
    assertNotNull(globalScope.getVar("err"));
  }

  @Test
  public void testGetPrototypePropertyOwnerValid() {
    // Edge Case: GETPROP where owner is a qualified name and ends with 'prototype'
    // Constructed via AST: a.b.prototype.c
    Node ownerNameNode = new Node(Token.NAME, "a");
    Node getPropAB = new Node(Token.GETPROP, ownerNameNode, new Node(Token.STRING, "b"));
    Node getPropProto = new Node(Token.GETPROP, getPropAB, new Node(Token.STRING, "prototype"));
    Node getPropC = new Node(Token.GETPROP, getPropProto, new Node(Token.STRING, "c"));

    // Indirectly testing via GlobalScopeBuilder stub declarations or assignments
    Node script = new Node(Token.SCRIPT);
    script.putProp(Node.SOURCENAME_PROP, "testcode.js");
    Node exprResult = new Node(Token.EXPR_RESULT, getPropC);
    script.addChildToBack(exprResult);

    Scope globalScope = scopeCreator.createInitialScope(script);
    TypedScopeCreator.GlobalScopeBuilder builder = 
        scopeCreator.new GlobalScopeBuilder(globalScope);
    
    NodeTraversal.traverse(compiler, script, builder);
    // Ensuring traversal completes without throwing exceptions on complex prototype chains
    assertNotNull(globalScope);
  }

  @Test
  public void testEnumDuplicateKeyAndInvalidConstant() {
    // Edge case: Enum with duplicate keys (ENUM_DUP) or non-constant keys (ENUM_NOT_CONSTANT)
    Node script = new Node(Token.SCRIPT);
    script.putProp(Node.SOURCENAME_PROP, "testcode.js");

    // var MyEnum = { FOO: 1, FOO: 2 }; (Duplicate keys)
    Node objectLit = new Node(Token.OBJECTLIT, 
        new Node(Token.STRING_KEY, "FOO", new Node(Token.NUMBER, "1")),
        new Node(Token.STRING_KEY, "FOO", new Node(Token.NUMBER, "2"))
    );
    Node nameNode = new Node(Token.NAME, "MyEnum", objectLit);
    Node varNode = new Node(Token.VAR, nameNode);
    
    com.google.javascript.rhino.JSDocInfoBuilder jsDocBuilder = 
        new com.google.javascript.rhino.JSDocInfoBuilder(false);
    jsDocBuilder.recordEnumParameterType(new com.google.javascript.rhino.jstype.EnumType(typeRegistry, "MyEnum", null));
    varNode.setJSDocInfo(jsDocBuilder.build());

    script.addChildToBack(varNode);

    Scope globalScope = scopeCreator.createInitialScope(script);
    TypedScopeCreator.GlobalScopeBuilder builder = 
        scopeCreator.new GlobalScopeBuilder(globalScope);
    
    NodeTraversal.traverse(compiler, script, builder);
    // Expecting compiler errors due to duplicate enum keys
    assertFalse(compiler.getErrors().isEmpty());
  }

  @Test
  public void testFunctionParamHandlingLocalScope() {
    // Edge case: LocalScopeBuilder handling parameters and arguments (Token.LP)
    Node script = new Node(Token.SCRIPT);
    script.putProp(Node.SOURCENAME_PROP, "testcode.js");

    Node funcName = new Node(Token.NAME, "myFunc");
    Node paramList = new Node(Token.LP, new Node(Token.NAME, "param1"));
    Node block = new Node(Token.BLOCK);
    Node funcNode = new Node(Token.FUNCTION, funcName, paramList, block);
    script.addChildToBack(funcNode);

    Scope globalScope = scopeCreator.createInitialScope(script);
    Scope localScope = new Scope(globalScope, funcNode);
    
    TypedScopeCreator.LocalScopeBuilder localBuilder = 
        scopeCreator.new LocalScopeBuilder(localScope);
    
    localBuilder.build();
    assertNotNull(localScope.getVar("param1"));
  }
}