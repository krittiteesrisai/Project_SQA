package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * High-coverage JUnit 4 test suite for TypedScopeCreator (Defects4J Closure-70b).
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
    public void testCreateGlobalScopeNullParent() {
        // Trigger global scope branch (parent == null)
        Node root = new Node(Token.SCRIPT);
        Scope scope = scopeCreator.createScope(root, null);

        assertNotNull("Global scope should not be null", scope);
        assertTrue("Scope should be global", scope.isGlobal());
        assertNotNull("Global scope should contain Object native type", scope.getVar("Object"));
    }

    @Test
    public void testCreateLocalScopeNonNullParent() {
        // Trigger local scope branch (parent != null)
        Node globalRoot = new Node(Token.SCRIPT);
        Scope globalScope = scopeCreator.createScope(globalRoot, null);

        Node functionNode = new Node(Token.FUNCTION, new Node(Token.NAME, "foo"), new Node(Token.LP), new Node(Token.BLOCK));
        Scope localScope = scopeCreator.createScope(functionNode, globalScope);

        assertNotNull("Local scope should not be null", localScope);
        assertFalse("Scope should not be global", localScope.isGlobal());
    }

    @Test
    public void testCreateInitialScopeNativeBindings() {
        Node root = new Node(Token.SCRIPT);
        Scope initialScope = scopeCreator.createInitialScope(root);

        assertNotNull(initialScope.getVar("Array"));
        assertNotNull(initialScope.getVar("Date"));
        assertNotNull(initialScope.getVar("undefined"));
        assertNotNull(initialScope.getVar("ActiveXObject"));
        assertNotNull(initialScope.getVar("goog.typedef"));
    }

    @Test
    public void testMalformedTypedefReporting() {
        // Test malformed typedef where realType is null
        Node script = new Node(Token.SCRIPT);
        Node nameNode = new Node(Token.NAME, "myTypedef");
        Node varNode = new Node(Token.VAR, nameNode);
        
        // JSDocInfo with typedef tag but missing type expression evaluating to null
        com.google.javascript.rhino.JSDocInfoBuilder jsDocBuilder = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        jsDocBuilder.recordTypedef(null);
        varNode.setJSDocInfo(jsDocBuilder.build());
        script.addChildToBack(varNode);

        Scope scope = scopeCreator.createScope(script, null);
        assertNotNull(scope);
        // Verify compiler error reporting mechanism was invoked for malformed typedef
        assertTrue("Compiler should have reported warnings/errors for malformed typedef", compiler.hasErrors() || compiler.getErrorCount() > 0 || compiler.getWarningCount() > 0);
    }

    @Test
    public void testPrototypePropertyAssignmentHandling() {
        // Test prototype assignment and re-declaration branches
        Node script = new Node(Token.SCRIPT);
        Node ctorNode = new Node(Token.FUNCTION, new Node(Token.NAME, "MyClass"), new Node(Token.LP), new Node(Token.BLOCK));
        
        com.google.javascript.rhino.JSDocInfoBuilder ctorDoc = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        ctorDoc.recordConstructor();
        ctorNode.setJSDocInfo(ctorDoc.build());
        script.addChildToBack(ctorNode);

        Scope scope = scopeCreator.createScope(script, null);
        assertNotNull(scope.getVar("MyClass"));
        assertNotNull(scope.getVar("MyClass.prototype"));
    }

    @Test
    public void testEnumInitializerValidation() {
        // Test enum initialization without valid object literal or qualified name
        Node script = new Node(Token.SCRIPT);
        Node nameNode = new Node(Token.NAME, "MyEnum");
        nameNode.addChildToBack(new Node(Token.NUMBER, "123")); // Invalid enum initializer
        Node varNode = new Node(Token.VAR, nameNode);

        com.google.javascript.rhino.JSDocInfoBuilder enumDoc = new com.google.javascript.rhino.JSDocInfoBuilder(false);
        enumDoc.recordEnumParameterType(com.google.javascript.rhino.jstype.JSTypeRegistry.dataSizeWarning); 
        // Using valid enum parameter type setup via JSDocInfoBuilder
        varNode.setJSDocInfo(enumDoc.build());
        script.addChildToBack(varNode);

        Scope scope = scopeCreator.createScope(script, null);
        assertNotNull(scope);
    }
}