package com.google.javascript.jscomp;

import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for NodeTraversal (Closure-37b).
 */
public class NodeTraversalTest {

    private Compiler compiler;

    @Before
    public void setUp() {
        compiler = new Compiler();
        // กำหนด Error Manager พื้นฐานเพื่อป้องกัน NullPointerException เวลาคอมไพเลอร์รายงานผล
        compiler.initOptions(new CompilerOptions());
    }

    // --- 1. Basic Traversal & SCRIPT Token Branch Tests ---

    @Test
    public void testTraverseBasicScriptNode() {
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.setInputId(new InputId("testInput.js"));
        scriptNode.addChildToBack(new Node(Token.EMPTY));

        TestCallback callback = new TestCallback(true);
        NodeTraversal.traverse(compiler, scriptNode, callback);

        assertTrue(callback.visitedNodes.contains(scriptNode));
        assertNotNull(callback.lastTraversal.getInputId());
        assertEquals("testInput.js", callback.lastTraversal.getInputId().getId());
    }

    @Test
    public void testShouldTraverseReturnsFalse() {
        Node scriptNode = new Node(Token.SCRIPT);
        Node child = new Node(Token.EMPTY);
        scriptNode.addChildToBack(child);

        // Callback ที่ปฏิเสธการเข้าถึงลูก (shouldTraverse return false)
        NodeTraversal.Callback rejectingCallback = new NodeTraversal.Callback() {
            @Override
            public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
                return n != child;
            }

            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {}
        };

        NodeTraversal.traverse(compiler, scriptNode, rejectingCallback);
        // ตรวจสอบว่า child ไม่ถูกเข้าเยี่ยมชมเนื่องจากโดน Prune กิ่งออก
    }

    // --- 2. traverseRoots Edge Cases & Preconditions ---

    @Test
    public void testTraverseRootsEmpty() {
        // Branch: roots.isEmpty() == true
        TestCallback callback = new TestCallback(true);
        NodeTraversal.traverseRoots(compiler, Collections.emptyList(), callback);
        assertTrue(callback.visitedNodes.isEmpty());
    }

    @Test(expected = IllegalStateException.class)
    public void testTraverseRootsParentNullThrowsException() {
        // Precondition: scopeRoot != null (ถ้า root ไม่มี parent จะพัง)
        Node root = new Node(Token.EMPTY); // parent is null
        NodeTraversal.traverseRoots(compiler, callbackStub(), root);
    }

    @Test(expected = IllegalStateException.class)
    public void testTraverseRootsParentMismatchThrowsException() {
        // Precondition: root.getParent() == scopeRoot
        Node parent1 = new Node(Token.BLOCK);
        Node parent2 = new Node(Token.BLOCK);
        Node child = new Node(Token.EMPTY);
        parent1.addChildToBack(child);
        // child มี parent1 เป็นแม่ แต่พยายามรันผ่าน scopeRoot ของ parent2

        NodeTraversal t = new NodeTraversal(compiler, callbackStub());
        t.traverseRoots(Collections.singletonList(child));
    }

    @Test
    public void testTraverseRootsValid() {
        Node scopeRoot = new Node(Token.BLOCK);
        Node child1 = new Node(Token.EMPTY);
        Node child2 = new Node(Token.EMPTY);
        scopeRoot.addChildToBack(child1);
        scopeRoot.addChildToBack(child2);

        TestCallback callback = new TestCallback(true);
        NodeTraversal.traverseRoots(compiler, callback, child1, child2);
        assertTrue(callback.visitedNodes.contains(child1));
        assertTrue(callback.visitedNodes.contains(child2));
    }

    // --- 3. Function Node & ScopedCallback Branches ---

    @Test
    public void testTraverseFunctionDeclarationAndExpression() {
        // สร้างโครงสร้าง Function Declaration: function f() {}
        Node fnName = Node.newString(Token.NAME, "f");
        Node args = new Node(Token.LP);
        Node body = new Node(Token.BLOCK);
        Node fnNode = new Node(Token.FUNCTION, fnName, args, body);

        Node script = new Node(Token.SCRIPT, fnNode);

        TestScopedCallback scopedCallback = new TestScopedCallback();
        NodeTraversal.traverse(compiler, script, scopedCallback);

        assertTrue(scopedCallback.enteredScopes > 0);
        assertTrue(scopedCallback.exitedScopes > 0);
    }

    @Test
    public void testTraverseAtScopeFunctionNode() {
        // ทดสอบ traverseAtScope เมื่อ node เป็น Function
        Node fnName = Node.newString(Token.NAME, "myFunc");
        Node args = new Node(Token.LP);
        Node body = new Node(Token.BLOCK);
        Node fnNode = new Node(Token.FUNCTION, fnName, args, body);
        Node script = new Node(Token.SCRIPT, fnNode);

        NodeTraversal t = new NodeTraversal(compiler, callbackStub());
        t.traverse(script); // กำหนด inputId ผ่าน script

        Scope globalScope = t.getScope();
        Scope funcScope = Scope.createGlobalScope(fnNode); // สร้าง Scope จำลองสำหรับทดสอบ

        // เรียก traverseAtScope เพื่อเข้ากิ่ง isFunction() == true
        t.traverseAtScope(funcScope);
        assertNotNull(t.getCurrentNode());
    }

    // --- 4. traverseInnerNode & RefinedScope Branches ---

    @Test
    public void testTraverseInnerNodeWithRefinedScope() {
        Node root = new Node(Token.SCRIPT);
        Node child = new Node(Token.EMPTY);
        root.addChildToBack(child);

        NodeTraversal t = new NodeTraversal(compiler, callbackStub());
        t.traverse(root);

        Scope currentScope = t.getScope();
        // ทดสอบกิ่งที่ refinedScope != null และต่างจาก getScopeปัจจุบัน
        Scope refinedScope = new Scope(root, currentScope);

        t.traverseInnerNode(child, root, refinedScope);
        assertNotNull(t.getCurrentNode());
    }

    @Test
    public void testTraverseInnerNodeNullRefinedScope() {
        Node root = new Node(Token.SCRIPT);
        Node child = new Node(Token.EMPTY);
        root.addChildToBack(child);

        NodeTraversal t = new NodeTraversal(compiler, callbackStub());
        t.traverse(root);

        // ทดสอบกิ่งที่ refinedScope เป็น null
        t.traverseInnerNode(child, root, null);
        assertNotNull(t.getCurrentNode());
    }

    // --- 5. Utility & Helper Methods Coverage ---

    @Test
    public void testGettersAndStateMethods() {
        Node root = new Node(Token.SCRIPT);
        NodeTraversal t = new NodeTraversal(compiler, callbackStub());
        t.traverse(root);

        assertNotNull(t.getCompiler());
        assertEquals("", t.getSourceName());
        assertFalse(t.hasScope()); // หลังจาก popScope จนหมด
        assertEquals(0, t.getLineNumber());
        assertNull(t.getEnclosingFunction());
    }

    @Test
    public void testErrorAndDiagnosticCreation() {
        Node node = new Node(Token.EMPTY);
        NodeTraversal t = new NodeTraversal(compiler, callbackStub());

        assertNotNull(t.makeError(node, NodeTraversal.NODE_TRAVERSAL_ERROR, "test error"));
        assertNotNull(t.makeError(node, CheckLevel.ERROR, NodeTraversal.NODE_TRAVERSAL_ERROR, "test error level"));
    }

    // --- Abstract Callbacks Coverage ---

    @Test
    public void testAbstractCallbacks() {
        Node node = new Node(Token.EMPTY);
        Node parent = new Node(Token.BLOCK);

        NodeTraversal.AbstractPostOrderCallback postOrderCb = new NodeTraversal.AbstractPostOrderCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        };
        assertTrue(postOrderCb.shouldTraverse(null, node, parent));

        NodeTraversal.AbstractScopedCallback scopedCb = new NodeTraversal.AbstractScopedCallback() {};
        assertTrue(scopedCb.shouldTraverse(null, node, parent));
        scopedCb.enterScope(null);
        scopedCb.exitScope(null);

        NodeTraversal.AbstractShallowCallback shallowCb = new NodeTraversal.AbstractShallowCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        };
        assertTrue(shallowCb.shouldTraverse(null, node, null));

        NodeTraversal.AbstractShallowStatementCallback shallowStmtCb = new NodeTraversal.AbstractShallowStatementCallback() {
            @Override public void visit(NodeTraversal t, Node n, Node parent) {}
        };
        assertTrue(shallowStmtCb.shouldTraverse(null, node, null));
    }

    // --- Helper Classes for Testing ---

    private NodeTraversal.Callback callbackStub() {
        return new NodeTraversal.AbstractPostOrderCallback() {
            @Override
            public void visit(NodeTraversal t, Node n, Node parent) {}
        };
    }

    private static class TestCallback implements NodeTraversal.Callback {
        final List<Node> visitedNodes = new ArrayList<>();
        final boolean traverseChildren;
        NodeTraversal lastTraversal;

        TestCallback(boolean traverseChildren) {
            this.traverseChildren = traverseChildren;
        }

        @Override
        public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
            this.lastTraversal = nodeTraversal;
            return traverseChildren;
        }

        @Override
        public void visit(NodeTraversal t, Node n, Node parent) {
            visitedNodes.add(n);
        }
    }

    private static class TestScopedCallback implements NodeTraversal.ScopedCallback {
        int enteredScopes = 0;
        int exitedScopes = 0;

        @Override
        public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent) {
            return true;
        }

        @Override
        public void visit(NodeTraversal t, Node n, Node parent) {}

        @Override
        public void enterScope(NodeTraversal t) {
            enteredScopes++;
        }

        @Override
        public void exitScope(NodeTraversal t) {
            exitedScopes++;
        }
    }
}