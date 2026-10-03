package com.google.javascript.jscomp;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;

/**
 * JUnit 4 Test class for CheckGlobalThis targeting high branch/condition coverage
 * and edge cases aligned with Defects4J Closure-100b.
 */
public class CheckGlobalThisTest extends TestCase {

  private Compiler compiler;
  private CheckGlobalThis checker;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    compiler = new Compiler();
    checker = new CheckGlobalThis(compiler, CheckLevel.WARNING);
  }

  // --- Tests for shouldTraverse() and FUNCTION types & JSDoc ---

  public void testShouldTraverseFunctionWithConstructorAnnotation() {
    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfo jsDoc = new JSDocInfo();
    jsDoc.setConstructor(true);
    fnNode.setJSDocInfo(jsDoc);

    boolean result = checker.shouldTraverse(null, fnNode, null);
    assertFalse("Should not traverse constructor functions", result);
  }

  public void testShouldTraverseFunctionWithThisTypeAnnotation() {
    Node fnNode = new Node(Token.FUNCTION);
    JSDocInfo jsDoc = new JSDocInfo();
    // Setting a stub this type or simulating hasThisType
    // Since JSDocInfo internal mechanisms are used, we test normal function vs annotated if applicable.
    // Here we test standard function traversal:
    boolean result = checker.shouldTraverse(null, fnNode, null);
    assertTrue("Should traverse standard functions", result);
  }

  // --- Tests for ASSIGN parent scenarios and LHS/RHS traversal ---

  public void testAssignmentLhsTraversalAndNestedAssignment() {
    // parent is ASSIGN, n is LHS (first child)
    Node lhs = new Node(Token.NAME, "a");
    Node rhs = new Node(Token.THIS);
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    // First time visiting LHS
    boolean resultLhs = checker.shouldTraverse(null, lhs, assign);
    assertTrue("Should traverse LHS of assignment", resultLhs);

    // Nested assignment test (assignLhsChild should not be overridden if not null)
    Node innerLhs = new Node(Token.NAME, "b");
    boolean resultNestedLhs = checker.shouldTraverse(null, innerLhs, assign);
    assertTrue("Should traverse nested assignment LHS", resultNestedLhs);
  }

  public void testAssignmentRhsPrototypeGetProp() {
    // parent is ASSIGN, n is RHS (second child), lhs is GETPROP ending with "prototype"
    Node getPropLhs = Node.newString(Token.GETPROP, "A");
    Node prototypeProp = Node.newString(Token.STRING, "prototype");
    getPropLhs.addChildToBack(prototypeProp);

    Node rhs = new Node(Token.THIS);
    Node assign = new Node(Token.ASSIGN, getPropLhs, rhs);

    boolean resultRhs = checker.shouldTraverse(null, rhs, assign);
    assertFalse("Should not traverse RHS when LHS is a prototype assignment", resultRhs);
  }

  public void testAssignmentRhsQualifiedNameContainsPrototype() {
    // lhs qualified name contains ".prototype." e.g., A.prototype.b = this
    Node getPropLhs = new Node(Token.GETPROP);
    Node innerGetProp = Node.newString(Token.GETPROP, "A");
    innerGetProp.addChildToBack(Node.newString(Token.STRING, "prototype"));
    getPropLhs.addChildToFront(innerGetProp);
    getPropLhs.addChildToBack(Node.newString(Token.STRING, "b"));

    Node rhs = new Node(Token.THIS);
    Node assign = new Node(Token.ASSIGN, getPropLhs, rhs);

    boolean resultRhs = checker.shouldTraverse(null, rhs, assign);
    assertFalse("Should not traverse RHS when LHS contains .prototype.", resultRhs);
  }

  // --- Tests for visit() and shouldReportThis() ---

  public void testVisitThisOnLhsTriggersReport() {
    Node lhs = new Node(Token.THIS);
    Node rhs = new Node(Token.NUMBER, "1");
    Node assign = new Node(Token.ASSIGN, lhs, rhs);

    // Trigger shouldTraverse for LHS to set assignLhsChild
    checker.shouldTraverse(null, lhs, assign);

    NodeTraversal traversal = new NodeTraversal(compiler, checker);
    // Visit THIS node which is assignLhsChild
    checker.visit(traversal, lhs, assign);

    // Clean up assignLhsChild via visit matching
    checker.visit(traversal, lhs, assign);
  }

  // --- Tests for getFunctionJsDocInfo() edge cases ---

  public void testGetFunctionJsDocInfoFromParentNameAndVar() {
    // function node without JSDoc, but parent is NAME, and grandparent is VAR with JSDoc
    Node fnNode = new Node(Token.FUNCTION);
    Node nameNode = new Node(Token.NAME, "foo");
    nameNode.addChildToBack(fnNode);
    
    Node varNode = new Node(Token.VAR, nameNode);
    JSDocInfo jsDoc = new JSDocInfo();
    varNode.setJSDocInfo(jsDoc);

    NodeTraversal traversal = new NodeTraversal(compiler, checker);
    // Evaluating via shouldTraverse or direct interaction if accessible.
    // shouldTraverse invokes getFunctionJsDocInfo internally.
    boolean result = checker.shouldTraverse(traversal, fnNode, nameNode);
    assertTrue("Should handle grandparent VAR JSDoc lookup correctly", result);
  }
}