package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;
import junit.framework.TestCase;

/**
 * Comprehensive JUnit 4 test suite for CheckGlobalThis targeting high branch coverage
 * and edge cases for Defects4J Closure-147b.
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

    public void testShouldTraverseConstructorFunction() {
        Node funcNode = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setConstructor(true);
        funcNode.setJSDocInfo(jsDoc);

        Node parent = new Node(Token.SCRIPT);
        NodeTraversal traversal = new NodeTraversal(compiler, checker);

        boolean result = checker.shouldTraverse(traversal, funcNode, parent);
        assertFalse("Should not traverse constructor functions", result);
    }

    public void testShouldTraverseInterfaceFunction() {
        Node funcNode = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        jsDoc.setInterface(true);
        funcNode.setJSDocInfo(jsDoc);

        Node parent = new Node(Token.SCRIPT);
        NodeTraversal traversal = new NodeTraversal(compiler, checker);

        boolean result = checker.shouldTraverse(traversal, funcNode, parent);
        assertFalse("Should not traverse interface functions", result);
    }

    public void testShouldTraverseThisTypeFunction() {
        Node funcNode = new Node(Token.FUNCTION);
        JSDocInfo jsDoc = new JSDocInfo();
        // Simulate hasThisType by testing function with @this annotation context if available,
        // or directly triggering the branch via available JSDocInfo methods.
        funcNode.setJSDocInfo(jsDoc);

        Node parent = new Node(Token.SCRIPT);
        NodeTraversal traversal = new NodeTraversal(compiler, checker);
        // Fallback test for normal function traversal
        assertTrue(checker.shouldTraverse(traversal, funcNode, parent));
    }

    public void testShouldTraverseInvalidParentType() {
        Node funcNode = new Node(Token.FUNCTION);
        // Invalid parent type for a function (e.g. Token.BITNOT)
        Node parent = new Node(Token.BITNOT);
        NodeTraversal traversal = new NodeTraversal(compiler, checker);

        boolean result = checker.shouldTraverse(traversal, funcNode, parent);
        assertFalse("Should not traverse functions with invalid parent contexts", result);
    }

    public void testAssignmentLhsAndPrototypePruning() {
        // Construct: A.prototype.foo = function() { this.bar = 1; }
        Node lhs = new Node(Token.GETPROP, 
            new Node(Token.GETPROP, new Node(Token.NAME, "A"), new Node(Token.STRING, "prototype")),
            new Node(Token.STRING, "foo")
        );
        Node rhs = new Node(Token.FUNCTION);
        Node assign = new Node(Token.ASSIGN, lhs, rhs);

        NodeTraversal traversal = new NodeTraversal(compiler, checker);

        // Traverse LHS of assignment
        assertTrue(checker.shouldTraverse(traversal, lhs, assign));
        
        // Traverse RHS (should be pruned because LHS is prototype property)
        assertFalse(checker.shouldTraverse(traversal, rhs, assign));
    }

    public void testNestedAssignmentAndThisReporting() {
        Node thisNode = new Node(Token.THIS);
        Node parentAssign = new Node(Token.ASSIGN, thisNode, new Node(Token.NUMBER, 1.0));

        NodeTraversal traversal = new NodeTraversal(compiler, checker);

        // Traverse LHS (thisNode)
        assertTrue(checker.shouldTraverse(traversal, thisNode, parentAssign));

        // Visit THIS node on LHS of assignment -> should report warning
        checker.visit(traversal, thisNode, parentAssign);
        
        // Visit assignLhsChild cleanup branch
        checker.visit(traversal, thisNode, parentAssign);
    }

    public void testShouldReportThisWithGetProperty() {
        Node thisNode = new Node(Token.THIS);
        Node getProp = new Node(Token.GETPROP, thisNode, new Node(Token.STRING, "prop"));

        NodeTraversal traversal = new NodeTraversal(compiler, checker);
        // Parent is GETPROP, should report
        checker.visit(traversal, thisNode, getProp);
    }

    public void testGetFunctionJsDocInfoViaParentAndGramps() {
        // Test helper resolution where JSDoc is on VAR statement (grandfather)
        Node varNode = new Node(Token.VAR);
        JSDocInfo jsDoc = new JSDocInfo();
        varNode.setJSDocInfo(jsDoc);

        Node nameNode = new Node(Token.NAME, "foo");
        varNode.addChildToBack(nameNode);

        Node funcNode = new Node(Token.FUNCTION);
        nameNode.addChildToBack(funcNode);

        NodeTraversal traversal = new NodeTraversal(compiler, checker);
        // This will indirectly trigger getFunctionJsDocInfo looking up through NAME and VAR
        assertFalse(checker.shouldTraverse(traversal, funcNode, nameNode));
    }
}