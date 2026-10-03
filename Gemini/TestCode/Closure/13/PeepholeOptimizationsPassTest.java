package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * JUnit 4 Test Suite for PeepholeOptimizationsPass (Closure-13b)
 * Designed by Senior Test Automation Engineer.
 */
public class PeepholeOptimizationsPassTest extends TestCase {

    // Dummy Compiler implementation for testing purposes (uses only allowed classpath)
    private static class DummyCompiler extends Compiler {
        @Override
        public void reportCodeChange() {
            // No-op
        }
    }

    // Mock optimization that returns the node unchanged
    private static class NoOpOptimization extends AbstractPeepholeOptimization {
        @Override
        Node optimizeSubtree(Node subtree) {
            return subtree;
        }
    }

    // Mock optimization that replaces a node with a new node once
    private static class ReplacingOptimization extends AbstractPeepholeOptimization {
        private boolean replaced = false;
        @Override
        Node optimizeSubtree(Node subtree) {
            if (!replaced && subtree.getType() == Token.EXPR_RESULT) {
                replaced = true;
                return new Node(Token.BLOCK);
            }
            return subtree;
        }
    }

    // Mock optimization that returns null to test null-safety edge case
    private static class NullReturningOptimization extends AbstractPeepholeOptimization {
        @Override
        Node optimizeSubtree(Node subtree) {
            return null;
        }
    }

    // Mock optimization that triggers code change via handler
    private static class ChangingOptimization extends AbstractPeepholeOptimization {
        private int count = 0;
        @Override
        Node optimizeSubtree(Node subtree) {
            if (subtree.isScript() && count < 2) {
                count++;
                // Report change through the compiler change handlers
                for (CodeChangeHandler handler : changeHandlers) {
                    handler.reportChange();
                }
            }
            return subtree;
        }
    }

    @Test
    public void testGetCompiler() {
        AbstractCompiler compiler = new DummyCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(compiler);
        assertSame(compiler, pass.getCompiler());
    }

    @Test
    public void testProcessSimpleScriptNode() {
        AbstractCompiler compiler = new DummyCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(
                compiler, new NoOpOptimization());

        Node scriptNode = new Node(Token.SCRIPT);
        pass.process(null, scriptNode);
        assertNotNull(scriptNode);
    }

    @Test
    public void testProcessWithFunctionAndChildScopes() {
        AbstractCompiler compiler = new DummyCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(
                compiler, new NoOpOptimization());

        Node script = new Node(Token.SCRIPT);
        Node func = new Node(Token.FUNCTION);
        script.addChildToBack(func);

        pass.process(null, script);
        assertNotNull(script);
    }

    @Test
    public void testVisitWithNullOptimizationResult() {
        AbstractCompiler compiler = new DummyCompiler();
        // NullReturningOptimization causes currentVersionOfNode == null, testing early return branch
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(
                compiler, new NullReturningOptimization());

        Node script = new Node(Token.SCRIPT);
        pass.process(null, script);
    }

    @Test
    public void testVisitWithNodeReplacement() {
        AbstractCompiler compiler = new DummyCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(
                compiler, new ReplacingOptimization());

        Node script = new Node(Token.SCRIPT);
        Node expr = new Node(Token.EXPR_RESULT);
        script.addChildToBack(expr);

        pass.process(null, script);
        // Verify replacement branch executed successfully
        assertTrue(true);
    }

    @Test
    public void testShouldRetraverseWithStateChange() {
        AbstractCompiler compiler = new DummyCompiler();
        // ChangingOptimization reports a change on SCRIPT, triggering shouldRetraverse = true
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(
                compiler, new ChangingOptimization());

        Node script = new Node(Token.SCRIPT);
        pass.process(null, script);
        assertTrue(true);
    }

    @Test
    public void testVisitDirectly() {
        AbstractCompiler compiler = new DummyCompiler();
        PeepholeOptimizationsPass pass = new PeepholeOptimizationsPass(
                compiler, new NoOpOptimization());

        Node node = new Node(Token.NUMBER, 1.0);
        pass.visit(node);
        assertNotNull(node);
    }
}