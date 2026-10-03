package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Collection;

/**
 * High-coverage JUnit 4 test suite for AnalyzePrototypeProperties (Closure-163b).
 */
public class AnalyzePrototypePropertiesTest extends TestCase {

  private Compiler compiler;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
  }

  @Test
  public void testConstructorWithoutModuleGraph() {
    // Branch: moduleGraph == null
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, true, true);
    Collection<AnalyzePrototypeProperties.NameInfo> allInfo = pass.getAllNameInfo();
    assertNotNull(allInfo);
  }

  @Test
  public void testConstructorWithModuleGraph() {
    // Branch: moduleGraph != null
    JSModule m1 = new JSModule("m1");
    JSModule m2 = new JSModule("m2");
    JSModuleGraph moduleGraph = new JSModuleGraph(Lists.newArrayList(m1, m2));

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, moduleGraph, false, false);
    assertNotNull(pass.getAllNameInfo());
  }

  @Test
  public void testProcessPrototypeAssignmentAndObjectLiteral() {
    // Constructs AST for:
    // function Foo() {}
    // Foo.prototype.bar = function() {};
    // Foo.prototype = { baz: function() {} };
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    Node fooDecl = NodeUtil.newName(compiler.getCodingConvention(), "Foo", Node.newNumber(1), "Foo");
    Node funcNode = new Node(Token.FUNCTION, Node.newString(Token.NAME, "Foo"), new Node(Token.LP), new Node(Token.BLOCK));
    Node varNode = new Node(Token.VAR, funcNode);
    root.addChildToBack(varNode);

    // Foo.prototype.bar = function() {}
    Node getPropBar = new Node(Token.GETPROP, 
        new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "prototype")),
        Node.newString(Token.STRING, "bar"));
    Node assignBar = new Node(Token.ASSIGN, getPropBar, new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK)));
    root.addChildToBack(new Node(Token.EXPR_RESULT, assignBar));

    // Foo.prototype = { baz: function() {} }
    Node getPropProto = new Node(Token.GETPROP, Node.newString(Token.NAME, "Foo"), Node.newString(Token.STRING, "prototype"));
    Node objLit = new Node(Token.OBJECTLIT, Node.newString(Token.STRING, "baz"), new Node(Token.FUNCTION, Node.newString(Token.NAME, ""), new Node(Token.LP), new Node(Token.BLOCK)));
    Node assignProto = new Node(Token.ASSIGN, getPropProto, objLit);
    root.addChildToBack(new Node(Token.EXPR_RESULT, assignProto));

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, true, true);
    pass.process(externs, root);

    Collection<AnalyzePrototypeProperties.NameInfo> nameInfos = pass.getAllNameInfo();
    assertFalse(nameInfos.isEmpty());
  }

  @Test
  public void testGlobalFunctionDeclarationAndExterns() {
    // Tests global function declarations and extern property traversal
    Node externs = new Node(Token.BLOCK);
    Node externGetProp = new Node(Token.GETPROP, Node.newString(Token.NAME, "window"), Node.newString(Token.STRING, "externProp"));
    externs.addChildToBack(new Node(Token.EXPR_RESULT, externGetProp));

    Node root = new Node(Token.BLOCK);
    Node globalFunc = new Node(Token.FUNCTION, Node.newString(Token.NAME, "globalFunc"), new Node(Token.LP), new Node(Token.BLOCK));
    root.addChildToBack(new Node(Token.EXPR_RESULT, globalFunc));

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
    pass.process(externs, root);

    assertNotNull(pass.getAllNameInfo());
  }

  @Test
  public void testClosureVariableAccessEdgeCase() {
    // Edge case: Inner function reading outer non-global variable (closure variables)
    Node externs = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);

    // Simulate scope and closure variable reference
    Node innerFunc = new Node(Token.FUNCTION, Node.newString(Token.NAME, "inner"), new Node(Token.LP), new Node(Token.BLOCK));
    Node nameNode = Node.newString(Token.NAME, "outerVar");
    innerFunc.getLastChild().addChildToBack(new Node(Token.EXPR_RESULT, nameNode));
    root.addChildToBack(innerFunc);

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, true, true);
    pass.process(externs, root);
    assertNotNull(pass.getAllNameInfo());
  }
}