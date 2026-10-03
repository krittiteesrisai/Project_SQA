package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.JSDocInfo;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;

/**
 * Senior Java Test Automation Engineer - Comprehensive JUnit 4 Test Suite
 * Target: Defects4J Closure-102b (Normalize class)
 */
public class NormalizeTest extends TestCase {

    private Compiler createCompiler() {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        return compiler;
    }

    @Test
    public void testWhileConversionToFor() {
        Compiler compiler = createCompiler();
        Node root = new Node(Token.BLOCK);
        Node whileNode = new Node(Token.WHILE, Node.newString(Token.NAME, "true"), new Node(Token.BLOCK));
        root.addChildToBack(whileNode);

        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);

        Assert.assertEquals("While node should be converted to FOR", Token.FOR, whileNode.getType());
    }

    @Test
    public void testNormalizeLabelsEdgeCases() {
        Compiler compiler = createCompiler();
        Node root = new Node(Token.BLOCK);
        // Label with an expression instead of block/loop (triggers label normalization branch)
        Node labelNode = new Node(Token.LABEL, Node.newString(Token.NAME, "L"), new Node(Token.EXPR_RESULT, Node.newNumber(1)));
        root.addChildToBack(labelNode);

        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);

        Assert.assertEquals(Token.BLOCK, labelNode.getLastChild().getType());
    }

    @Test
    public void testExtractForInitializerVarAndExpression() {
        Compiler compiler = createCompiler();
        Node script = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        script.addChildToBack(block);

        // for(var i=0; i<10; i++) {} -> var i=0 should be extracted
        Node varInit = new Node(Token.VAR, Node.newString(Token.NAME, "i"));
        Node forNode = new Node(Token.FOR, varInit, Node.newString(Token.NAME, "true"), new Node(Token.EMPTY), new Node(Token.BLOCK));
        block.addChildToBack(forNode);

        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), script);

        Assert.assertEquals(2, block.getChildCount());
        Assert.assertEquals(Token.VAR, block.getFirstChild().getType());
    }

    @Test
    public void testSplitVarDeclarationsAndAssertOnChange() {
        Compiler compiler = createCompiler();
        Node script = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        script.addChildToBack(block);

        // var a, b; multiple declarations
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "a"), Node.newString(Token.NAME, "b"));
        block.addChildToBack(varNode);

        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), script);

        Assert.assertTrue("Multiple var declarations should be split", block.getChildCount() >= 2);
    }

    @Test(expected = IllegalStateException.class)
    public void testEmptyVarNodeAssertOnChange() {
        Compiler compiler = createCompiler();
        Node script = new Node(Token.SCRIPT);
        Node block = new Node(Token.BLOCK);
        script.addChildToBack(block);

        // Empty var node with assertOnChange = true should throw IllegalStateException
        Node varNode = new Node(Token.VAR);
        block.addChildToBack(varNode);

        Normalize normalize = new Normalize(compiler, true);
        normalize.process(new Node(Token.BLOCK), script);
    }

    @Test
    public void testMoveNamedFunctions() {
        Compiler compiler = createCompiler();
        Node script = new Node(Token.SCRIPT);
        Node fn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "f"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        
        Node body = fn.getLastChild();
        body.addChildToBack(new Node(Token.EXPR_RESULT, Node.newNumber(1)));
        // Named function declaration further down in body
        Node innerFn = new Node(Token.FUNCTION, Node.newString(Token.NAME, "inner"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        body.addChildToBack(innerFn);

        script.addChildToBack(fn);

        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), script);

        Assert.assertEquals("Inner function should be moved to front", innerFn, body.getFirstChild());
    }

    @Test
    public void testPropogateConstantAnnotations() {
        Compiler compiler = createCompiler();
        Node script = new Node(Token.SCRIPT);
        Node nameNode = Node.newString(Token.NAME, "MY_CONST");
        script.addChildToBack(new Node(Token.EXPR_RESULT, nameNode));

        Normalize.PropogateConstantAnnotations prop = new Normalize.PropogateConstantAnnotations(compiler, false);
        // Process should execute without errors
        prop.process(new Node(Token.BLOCK), script);
    }

    @Test
    public void testVerifyConstantsPass() {
        Compiler compiler = createCompiler();
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        root.addChildToBack(new Node(Token.EXPR_RESULT, Node.newString(Token.NAME, "SOME_VAR")));
        externs.addChildToBack(root);

        Normalize.VerifyConstants verify = new Normalize.VerifyConstants(compiler, false);
        // Should traverse successfully
        verify.process(externs, root);
    }
}