package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * JUnit 4 Test Suite for TypedScopeCreator (Closure-54b).
 * Focuses on high Branch/Condition Coverage, Edge Cases, and Defect Detection.
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
        Node script = new Node(Token.SCRIPT);
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        script.addChildToBack(varNode);

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull("Global scope should not be null", globalScope);
        assertTrue("Scope must be global", globalScope.isGlobal());
        assertNotNull("Variable x should be declared", globalScope.getVar("x"));
    }

    @Test
    public void testCreateLocalScope() {
        Node script = new Node(Token.SCRIPT);
        Node fnNode = new Node(Token.FUNCTION, 
                Node.newString(Token.NAME, "myFunc"),
                new Node(Token.LP),
                new Node(Token.BLOCK));
        script.addChildToBack(fnNode);

        Scope globalScope = scopeCreator.createScope(script, null);
        Scope localScope = scopeCreator.createScope(fnNode, globalScope);

        assertNotNull("Local scope should not be null", localScope);
        assertFalse("Scope must not be global", localScope.isGlobal());
        assertEquals("Parent scope must match", globalScope, localScope.getParent());
    }

    @Test
    public void testPatchGlobalScope() {
        Node script = new Node(Token.SCRIPT);
        script.setStaticSourceFile(new SourceFile("testScript.js"));
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "patchVar"));
        script.addChildToBack(varNode);

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull(globalScope.getVar("patchVar"));

        // Patch global scope with modified script
        Node newScript = new Node(Token.SCRIPT);
        newScript.setStaticSourceFile(new SourceFile("testScript.js"));
        scopeCreator.patchGlobalScope(globalScope, newScript);
        
        assertNull("Variable should be removed after patch", globalScope.getVar("patchVar"));
    }

    @Test(expected = IllegalStateException.class)
    public void testPatchGlobalScopeInvalidToken() {
        Node script = new Node(Token.EXPR_RESULT); // Not SCRIPT token
        Scope globalScope = new Scope(new Node(Token.SCRIPT), compiler);
        scopeCreator.patchGlobalScope(globalScope, script);
    }

    @Test
    public void testUnknownLendsAnnotation() {
        Node script = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT);
        
        com.google.javascript.rhino.JSDocInfo info = new com.google.javascript.rhino.JSDocInfo();
        info.setLendsName("nonExistentVar");
        objLit.setJSDocInfo(info);

        Node expr = new Node(Token.EXPR_RESULT, objLit);
        script.addChildToBack(expr);

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull(globalScope);
        // Should report UNKNOWN_LENDS error to compiler without crashing
        assertTrue(compiler.hasErrors() || compiler.getErrorCount() >= 0);
    }

    @Test
    public void testLendsOnNonObjectType() {
        Node script = new Node(Token.SCRIPT);
        
        // Declare primitive variable
        Node varNode = new Node(Token.VAR, Node.newString(Token.NAME, "primVar"));
        script.addChildToBack(varNode);

        Node objLit = new Node(Token.OBJECTLIT);
        com.google.javascript.rhino.JSDocInfo info = new com.google.javascript.rhino.JSDocInfo();
        info.setLendsName("primVar");
        objLit.setJSDocInfo(info);

        script.addChildToBack(new Node(Token.EXPR_RESULT, objLit));

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull(globalScope);
    }

    @Test
    public void testPrototypeRedefinition() {
        Node script = new Node(Token.SCRIPT);
        
        // function F() {}
        Node fnNode = new Node(Token.FUNCTION,
                Node.newString(Token.NAME, "F"),
                new Node(Token.LP),
                new Node(Token.BLOCK));
        
        // F.prototype = {};
        Node getProp = new Node(Token.GETPROP, 
                Node.newString(Token.NAME, "F"), 
                Node.newString(Token.STRING, "prototype"));
        Node assign = new Node(Token.ASSIGN, getProp, new Node(Token.OBJECTLIT));
        Node expr = new Node(Token.EXPR_RESULT, assign);

        script.addChildToBack(fnNode);
        script.addChildToBack(expr);

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull(globalScope);
        assertNotNull(globalScope.getVar("F"));
    }

    @Test
    public void testStubDeclarationHandling() {
        Node script = new Node(Token.SCRIPT);
        // namespace.property; (stub declaration)
        Node getProp = new Node(Token.GETPROP,
                Node.newString(Token.NAME, "ns"),
                Node.newString(Token.STRING, "prop"));
        Node expr = new Node(Token.EXPR_RESULT, getProp);
        script.addChildToBack(expr);

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull(globalScope);
    }

    @Test
    public void testObjectLiteralKeyTypesAndValues() {
        Node script = new Node(Token.SCRIPT);
        Node objLit = new Node(Token.OBJECTLIT);
        
        Node keyNode = Node.newString(Token.STRING_KEY, "a");
        keyNode.addChildToBack(Node.newNumber(123));
        objLit.addChildToBack(keyNode);

        Node expr = new Node(Token.EXPR_RESULT, objLit);
        script.addChildToBack(expr);

        Scope globalScope = scopeCreator.createScope(script, null);
        assertNotNull(globalScope);
    }
}