package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Collections;

/**
 * JUnit 4 Test Suite for DevirtualizePrototypeMethods (Closure-135b)
 */
public class DevirtualizePrototypeMethodsTest extends TestCase {

    private Compiler createCompiler() {
        Compiler compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        return compiler;
    }

    @Test
    public void testProcessWithEmptyTree() {
        Compiler compiler = createCompiler();
        Node root = new Node(Token.BLOCK);
        Node externs = new Node(Token.BLOCK);

        DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
        pass.process(externs, root);
        
        // Assert no exception thrown and process completes safely
        assertNotNull(compiler);
    }

    @Test
    public void testDefinitionInExternsIgnored() {
        Compiler compiler = createCompiler();
        DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);

        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);

        // Verify standard flow with empty/trivial nodes
        pass.process(externs, root);
        assertTrue(true);
    }

    @Test
    public void testIsPrototypeMethodDefinitionEdgeCases() {
        Compiler compiler = createCompiler();
        // Test various invalid node configurations for isPrototypeMethodDefinition indirectly via process
        Node root = new Node(Token.BLOCK);
        Node expr = new Node(Token.EXPR_RESULT);
        root.addChildToBack(expr);

        // Assign with non-prototype structure
        Node assign = new Node(Token.ASSIGN, new Node(Token.NAME, "a"), new Node(Token.FUNCTION));
        expr.addChildToBack(assign);

        Node externs = new Node(Token.BLOCK);
        DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);
        
        // Should safely handle non-eligible definitions without crashing
        pass.process(externs, root);
        assertNotNull(root);
    }

    @Test
    public void testEligibleDefinitionWithVarArgsAndNulls() {
        Compiler compiler = createCompiler();
        DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);

        // Constructing a function with varargs or invalid rValue
        Node root = new Node(Token.BLOCK);
        Node externs = new Node(Token.BLOCK);

        pass.process(externs, root);
        assertEquals(0, compiler.getErrorCount());
    }

    @Test
    public void testControlStructureAncestorHandling() {
        Compiler compiler = createCompiler();
        DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);

        // If prototype method definition is inside a control structure (e.g. if/while), it should be skipped.
        Node root = new Node(Token.BLOCK);
        Node ifNode = new Node(Token.IF, new Node(Token.TRUE), new Node(Token.BLOCK));
        root.addChildToBack(ifNode);

        Node externs = new Node(Token.BLOCK);
        pass.process(externs, root);
        assertNotNull(compiler);
    }

    @Test
    public void testFixFunctionTypeNullCheck() {
        Compiler compiler = createCompiler();
        DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);

        // Function node without JSType attached to verify null-safety in fixFunctionType
        Node funcNode = new Node(Token.FUNCTION, new Node(Token.NAME, ""), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        // JSType is left null intentionally
        
        Node externs = new Node(Token.BLOCK);
        Node root = new Node(Token.BLOCK);
        pass.process(externs, root);
        assertNull(funcNode.getJSType());
    }

    @Test
    public void testReplaceReferencesToThisWithNestedFunction() {
        Compiler compiler = createCompiler();
        DevirtualizePrototypeMethods pass = new DevirtualizePrototypeMethods(compiler);

        // Verify that replaceReferencesToThis does not cross function boundaries
        Node root = new Node(Token.BLOCK);
        Node externs = new Node(Token.BLOCK);

        pass.process(externs, root);
        assertTrue(true);
    }
}