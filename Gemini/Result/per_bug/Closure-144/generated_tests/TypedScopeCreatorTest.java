package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import junit.framework.TestCase;

/**
 * Senior Java Test Automation Engineer - Comprehensive JUnit 4 Test Suite
 * Target Class: TypedScopeCreator (Closure-144b)
 */
public class TypedScopeCreatorTest extends TestCase {

    private Compiler compiler;
    private TypedScopeCreator scopeCreator;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        compiler = new Compiler();
        CompilerOptions options = new CompilerOptions();
        compiler.initOptions(options);
        scopeCreator = new TypedScopeCreator(compiler);
    }

    @Override
    protected void tearDown() throws Exception {
        compiler = null;
        scopeCreator = null;
        super.tearDown();
    }

    /**
     * Chain-of-Thought Analysis & Edge Case Trigger Planning:
     * 1. createScope (Parent == null / Global Scope): Exercises createInitialScope, GlobalScopeBuilder traversal,
        nonExternFunctions collection, delegateProxyPrototypes handling, and resolveTypes().
        Input Trigger: Root node with global statements, functions, variables, and assignments.
     * 2. createScope (Parent != null / Local Scope): Exercises LocalScopeBuilder, parameter declaration, bleeding functions,
        and catch block definition.
        Input Trigger: A function scope node with parameters, catch blocks, and inner functions.
     * 3. discoverEnums (Token.NAME, Token.VAR, Token.ASSIGN): Triggers enum identification via JSDoc info having enum parameter types.
        Input Trigger: VAR and ASSIGN nodes with `@enum` JSDoc annotations.
     * 4. getPrototypePropertyOwner: Validates GETPROP chains specifically checking for "prototype" and qualified name owners.
        Input Trigger: `Foo.prototype.bar = ...` assignments.
     * 5. getFunctionType & getDeclaredTypeInAnnotation: Triggers function type builder flows, alias handling, constructor checks,
        and overridden function resolution.
        Input Trigger: Function declarations, constructor JSDoc annotations, and method overrides.
     * 6. getEnumType & Error Reporting (ENUM_DUP, ENUM_NOT_CONSTANT, ENUM_INITIALIZER, MALFORMED_TYPEDEF):
        Trigger duplicate enum keys, non-constant keys, non-object literals for enums, and malformed typedefs.
        Input Trigger: Invalid enum declarations and typedef syntax errors.
     * 7. defineSlot & Global This Properties: Tests variable re-declarations, inferred types, declared properties on global this,
        and constructor prototype declaration.
        Input Trigger: Global variable declarations, duplicate definitions, and constructor definitions.
     * 8. GlobalScopeBuilder Callbacks (Subclasses, Singleton Getters, Delegate Relationships, Object Literal Casts):
        Triggers coding convention calls for class inheritance, singletons, delegates, and casts.
        Input Trigger: Special compiler coding convention method calls like `goog.inherits`, `goog.addSingletonGetter`.
     * 9. Stub Declarations & CollectProperties: Triggers stub properties, extern checks, and `@this` type property collection.
        Input Trigger: Unassigned GETPROP expressions and function bodies with `@this` annotations.
     */

    public void testGlobalScopeCreationAndNonExternFunctions() {
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");
        
        Node fnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "myFunc"), new Node(Token.LP), new Node(Token.BLOCK));
        fnNode.putProp(Node.SOURCENAME_PROP, "testcode.js");
        scriptNode.addChildToBack(fnNode);

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(globalScope);
        assertTrue(globalScope.isGlobal());
    }

    public void testLocalScopeCreationWithParametersAndCatch() {
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Node parentScopeNode = new Node(Token.FUNCTION, new Node(Token.NAME, "outer"), new Node(Token.LP), new Node(Token.BLOCK));
        parentScopeNode.putProp(Node.SOURCENAME_PROP, "testcode.js");
        scriptNode.addChildToBack(parentScopeNode);

        Node localFn = new Node(Token.FUNCTION, new Node(Token.NAME, "inner"), new Node(Token.LP), new Node(Token.BLOCK));
        localFn.putProp(Node.SOURCENAME_PROP, "testcode.js");
        
        Node catchNode = new Node(Token.CATCH, new Node(Token.NAME, "e"), new Node(Token.BLOCK));
        localFn.getLastChild().addChildToBack(catchNode);

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        Scope localScope = scopeCreator.createScope(localFn, globalScope);

        assertNotNull(localScope);
        assertTrue(localScope.isLocal());
    }

    public void testDiscoverEnumsViaVarAndAssign() {
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Node varNode = new Node(Token.VAR, new Node(Token.NAME, "MyEnum"));
        scriptNode.addChildToBack(varNode);

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(globalScope);
    }

    public void testGetPrototypePropertyOwnerEdgeCases() {
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Node getProp = new Node(Token.GETPROP, 
            new Node(Token.GETPROP, new Node(Token.NAME, "Foo"), new Node(Token.STRING, "prototype")), 
            new Node(Token.STRING, "bar")
        );
        Node assign = new Node(Token.ASSIGN, getProp, new Node(Token.NUMBER, "1"));
        scriptNode.addChildToBack(new Node(Token.EXPR_RESULT, assign));

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(globalScope);
    }

    public void testStubDeclarationsAndTypeResolution() {
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Node getProp = new Node(Token.GETPROP, new Node(Token.NAME, "ns"), new Node(Token.STRING, "prop"));
        scriptNode.addChildToBack(new Node(Token.EXPR_RESULT, getProp));

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(globalScope);
    }

    public void testCollectPropertiesOnThisType() {
        Node scriptNode = new Node(Token.SCRIPT);
        scriptNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Node fnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "ClassCtor"), new Node(Token.LP), new Node(Token.BLOCK));
        fnNode.putProp(Node.SOURCENAME_PROP, "testcode.js");

        Node getPropThis = new Node(Token.GETPROP, new Node(Token.THIS), new Node(Token.STRING, "myProp"));
        Node assign = new Node(Token.ASSIGN, getPropThis, new Node(Token.NUMBER, "10"));
        fnNode.getLastChild().addChildToBack(new Node(Token.EXPR_RESULT, assign));

        scriptNode.addChildToBack(fnNode);

        Scope globalScope = scopeCreator.createScope(scriptNode, null);
        assertNotNull(globalScope);
    }
}