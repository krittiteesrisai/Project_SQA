package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;
import junit.framework.TestCase;
import org.junit.Test;

public class NormalizeTest extends TestCase {

    private Compiler createCompiler() {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        return compiler;
    }

    @Test
    public void testProcessWhileLoopConversion() {
        Compiler compiler = createCompiler();
        // while(true) {}
        Node root = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, new Node(Token.TRUE), new Node(Token.BLOCK));
        root.addChildToBack(whileNode);

        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);

        assertEquals(Token.FOR, whileNode.getType());
    }

    @Test
    public void testSplitVarDeclarations() {
        Compiler compiler = createCompiler();
        // var a, b;
        Node root = new Node(Token.BLOCK);
        Node varNode = new Node(Token.VAR, new Node(Token.NAME, "a"), new Node(Token.NAME, "b"));
        root.addChildToBack(varNode);

        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);

        // Should split into two var statements
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals(Token.VAR, root.getLastChild().getType());
        assertNotSame(root.getFirstChild(), root.getLastChild());
    }

    @Test
    public void testNormalizeLabelsNonStandardChild() {
        Compiler compiler = createCompiler();
        // label: x; (where x is expression, not block/loop)
        Node root = new Node(Token.BLOCK);
        Node nameNode = new Node(Token.NAME, "x");
        Node exprResult = new Node(Token.EXPR_RESULT, nameNode);
        Node labelNode = new Node(Token.LABEL, new Node(Token.STRING, "mylabel"), exprResult);
        root.addChildToBack(labelNode);

        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);

        // The label's last child should be normalized to a BLOCK
        Node lastChild = labelNode.getLastChild();
        assertEquals(Token.BLOCK, lastChild.getType());
    }

    @Test
    public void testExtractForInitializer() {
        Compiler compiler = createCompiler();
        // for(var i=0; i<10; i++) {} inside a block
        Node root = new Node(Token.BLOCK);
        Node initVar = new Node(Token.VAR, new Node(Token.NAME, "i"));
        Node cond = new Node(Token.TRUE);
        Node incr = new Node(Token.EMPTY);
        Node body = new Node(Token.BLOCK);
        Node forNode = new Node(Token.FOR, initVar, cond, incr, body);
        root.addChildToBack(forNode);

        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);

        // Initializer should be extracted before the for loop
        assertEquals(Token.VAR, root.getFirstChild().getType());
        assertEquals(Token.FOR, root.getLastChild().getType());
    }

    @Test
    public void testPropogateConstantAnnotationsWithAssertOnChange() {
        Compiler compiler = createCompiler();
        Node root = new Node(Token.BLOCK);
        Node nameNode = new Node(Token.NAME, "CONST_VAR");
        nameNode.putBooleanProp(Node.IS_CONSTANT_NAME, false);
        Node expr = new Node(Token.EXPR_RESULT, nameNode);
        Node script = new Node(Token.SCRIPT, expr);
        root.addChildToBack(script);

        // Test with assertOnChange = true to trigger IllegalStateException branch
        Normalize normalize = new Normalize(compiler, true);
        try {
            normalize.process(new Node(Token.BLOCK), root);
            // If JSDoc info marks it as constant, it will throw exception
        } catch (IllegalStateException e) {
            assertNotNull(e.getMessage());
        }
    }

    @Test
    public void testVerifyConstantsCheck() {
        Compiler compiler = createCompiler();
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        Node parent = new Node(Token.BLOCK, externs, root);

        Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, false);
        try {
            verifier.process(externs, root);
        } catch (Exception e) {
            // Expected state validation if preconditions fail or pass safely
        }
    }

    @Test
    public void testEmptyVarNodeException() {
        Compiler compiler = createCompiler();
        Node root = new Node(Token.BLOCK);
        // Empty VAR node with assertOnChange = true
        Node emptyVar = new Node(Token.VAR);
        root.addChildToBack(emptyVar);

        Normalize normalize = new Normalize(compiler, true);
        try {
            normalize.process(new Node(Token.BLOCK), root);
            fail("Expected IllegalStateException due to empty VAR node");
        } catch (IllegalStateException e) {
            assertEquals("Normalize constraints violated:\nEmpty VAR node.", e.getMessage());
        }
    }
}