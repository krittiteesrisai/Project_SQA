package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Senior Java Test Automation Engineer implementation for TypedScopeCreator (Closure-171b).
 * Strict adherence to JUnit 4 and permitted classpath dependencies.
 */
public class TypedScopeCreatorTest {

    private Compiler compiler;
    private TypedScopeCreator scopeCreator;

    @Before
    public void setUp() {
        compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        scopeCreator = new TypedScopeCreator(compiler);
    }

    @Test
    public void testCreateGlobalScopeAndInitialScope() {
        // Trigger global scope branches (parent == null) and native type declarations
        Node scriptNode = new Node(Token.SCRIPT);
        Node root = new Node(Token.BLOCK, scriptNode);
        root.putBooleanProp(Node.SYNTHETIC, true);

        Scope globalScope = scopeCreator.createScope(root, null);
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());
        assertNotNull(globalScope.getVar("Object"));
        assertNotNull(globalScope.getVar("Array"));
    }

    @Test
    public void testCreateLocalScope() {
        // Trigger local scope branches (parent != null)
        Node scriptNode = new Node(Token.SCRIPT);
        Node root = new Node(Token.BLOCK, scriptNode);
        Scope globalScope = scopeCreator.createScope(root, null);

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "myFunc"), new Node(Token.PARAM_LIST), new Node(Token.BLOCK));
        Scope localScope = scopeCreator.createScope(fnNode, globalScope);
        
        assertNotNull(localScope);
        assertFalse(localScope.isGlobal());
        assertEquals(globalScope, localScope.getParent());
    }

    @Test
    public void testPatchGlobalScope() {
        // Trigger patchGlobalScope logic and variable removal/re-traversal
        Node scriptNode = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR, new Node(Token.NAME, "x"));
        scriptNode.addChildToBack(varNode);
        
        Node root = new Node(Token.BLOCK, scriptNode);
        Scope globalScope = scopeCreator.createScope(root, null);
        assertNotNull(globalScope.getVar("x"));

        // Patch with modified script
        Node newScriptNode = new Node(Token.SCRIPT);
        scopeCreator.patchGlobalScope(globalScope, newScriptNode);
    }

    @Test
    public void testDiscoverEnumsAndTypedefs() {
        // Trigger enum and typedef discovery paths
        Node nameNode = new Node(Token.NAME, "MyEnum");
        Node varNode = new Node(Token.VAR, nameNode);
        Node root = new Node(Token.BLOCK, varNode);

        Scope scope = scopeCreator.createInitialScope(root);
        assertNotNull(scope);
    }

    @Test
    public void testClassDefiningCallsAndEdgeCases() {
        // Trigger checkForClassDefiningCalls branches with null / valid coding conventions
        Node callNode = new Node(Token.CALL, new Node(Token.NAME, "goog.inherits"));
        Node root = new Node(Token.BLOCK, callNode);
        
        Scope globalScope = scopeCreator.createScope(root, null);
        assertNotNull(globalScope);
    }

    @Test(expected = NullPointerException.class)
    public void testDeferredSetTypeNullCheckBoundary() {
        // Boundary test for DeferredSetType handling null parameters
        TypedScopeCreator.DeferredSetType deferred = 
            scopeCreator.new DeferredSetType(null, null);
    }
}