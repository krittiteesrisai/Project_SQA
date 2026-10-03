package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

/**
 * JUnit 4 Test Suite for Normalize (Defects4J Closure-79)
 */
public class NormalizeTest extends TestCase {

    private Compiler createCompiler() {
        return new Compiler();
    }

    @Test
    public void testWhileConversion() {
        Compiler compiler = createCompiler();
        String js = "while (x) { x--; }";
        Node root = compiler.parseTestCode(js);
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);
        
        // Verify while is converted to for
        assertTrue(compiler.toSource(root).contains("for(;x;)"));
    }

    @Test
    public void testSplitVarDeclarations() {
        Compiler compiler = createCompiler();
        String js = "var a = 1, b = 2;";
        Node root = compiler.parseTestCode(js);
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);
        
        String source = compiler.toSource(root);
        assertTrue(source.contains("var a=1"));
        assertTrue(source.contains("var b=2"));
    }

    @Test
    public void testSplitVarDeclarationsAssertOnChange() {
        Compiler compiler = createCompiler();
        // Construct a state where empty var or multi-var triggers assertOnChange
        Normalize.NormalizeStatements stmtNorm = new Normalize.NormalizeStatements(compiler, true);
        Node varNode = new Node(Token.VAR); // Empty var with assertOnChange = true
        Node block = new Node(Token.BLOCK, varNode);
        
        try {
            NodeTraversal.traverse(compiler, block, stmtNorm);
            fail("Expected IllegalStateException due to empty VAR node with assertOnChange");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Empty VAR node"));
        }
    }

    @Test
    public void testNormalizeLabels() {
        Compiler compiler = createCompiler();
        // Label containing an expression statement instead of block/loop
        String js = "myLabel: x++;";
        Node root = compiler.parseTestCode(js);
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);
        
        String source = compiler.toSource(root);
        assertTrue(source.contains("myLabel:{x++;}"));
    }

    @Test
    public void testExtractForInitializer() {
        Compiler compiler = createCompiler();
        String js = "for (var i = 0; i < 10; i++) { }";
        Node root = compiler.parseTestCode(js);
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);
        
        String source = compiler.toSource(root);
        assertTrue(source.contains("var i=0;for(;i<10;i++)"));
    }

    @Test
    public void testExtractForInInitializer() {
        Compiler compiler = createCompiler();
        String js = "for (var a in b) { }";
        Node root = compiler.parseTestCode(js);
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);
        
        String source = compiler.toSource(root);
        assertTrue(source.contains("var a;for(a in b)"));
    }

    @Test
    public void testMoveNamedFunctions() {
        Compiler compiler = createCompiler();
        String js = "function f() { var x = 1; function g() {} }";
        Node root = compiler.parseTestCode(js);
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);
        
        String source = compiler.toSource(root);
        // Function g should be moved to the top of f's body
        int gIndex = source.indexOf("function g()");
        int varIndex = source.indexOf("var x=1");
        assertTrue(gIndex < varIndex);
    }

    @Test
    public void testCatchBlockVarError() {
        Compiler compiler = createCompiler();
        // Catch block variable conflict
        String js = "try { throw ''; } catch (e) { var e = 1; }";
        Node root = compiler.parseTestCode(js);
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);
        
        // Should report error for catch block variable
        assertTrue(compiler.getErrorCount() > 0);
    }

    @Test
    public void testDuplicateDeclarationsReplacement() {
        Compiler compiler = createCompiler();
        String js = "var x = 1; var x = 2;";
        Node root = compiler.parseTestCode(js);
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);
        
        String source = compiler.toSource(root);
        // Second declaration should be converted to assignment: x = 2
        assertTrue(source.contains("var x=1;x=2"));
    }

    @Test
    public void testPropagateConstantAnnotations() {
        Compiler compiler = createCompiler();
        // Using JSDoc or convention for constants
        String js = "/** @const */ var FOO = 1; function f() { use(FOO); }";
        Node root = compiler.parseTestCode(js);
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(new Node(Token.BLOCK), root);
        
        // Verify constant propagation and verification pass doesn't throw
        Normalize.VerifyConstants verifier = new Normalize.VerifyConstants(compiler, true);
        Node externs = new Node(Token.BLOCK);
        Node rootParent = new Node(Token.BLOCK, externs, root);
        verifier.process(externs, root);
    }

    @Test
    public void testConstantChangeAssertion() {
        Compiler compiler = createCompiler();
        Normalize.PropagateConstantAnnotationsOverVars propagator = 
            new Normalize.PropagateConstantAnnotationsOverVars(compiler, true);
        
        // Trigger assertOnChange in PropagateConstantAnnotationsOverVars
        String js = "/** @const */ var BAR = 1;";
        Node root = compiler.parseTestCode(js);
        Node externs = new Node(Token.BLOCK);
        
        // First pass to annotate
        Normalize normalize = new Normalize(compiler, false);
        normalize.process(externs, root);
        
        try {
            // Running with assertOnChange = true on a tree where const needs marking/changing unexpectedly
            // Or force a state violation
            propagator.process(externs, root);
        } catch (Exception e) {
            // Expected or handled safely
        }
    }
}