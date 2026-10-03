package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.FunctionType;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;

public class ScopeTest {

    // --- Helper Stub for AbstractCompiler ---
    private static class DummyCompiler extends Compiler {
        private final JSTypeRegistry registry;

        public DummyCompiler(JSTypeRegistry registry) {
            this.registry = registry;
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return registry;
        }
    }

    @Test
    public void testGlobalScopeCreation() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Node rootNode = new Node(Token.BLOCK);

        Scope globalScope = new Scope(rootNode, compiler);

        assertTrue(globalScope.isGlobal());
        assertFalse(globalScope.isLocal());
        assertNull(globalScope.getParent());
        assertEquals(0, globalScope.getDepth());
        assertFalse(globalScope.isBottom());
        assertEquals(rootNode, globalScope.getRootNode());
        assertNotNull(globalScope.getTypeOfThis());
    }

    @Test
    public void testBottomScopeCreation() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        Node rootNode = new Node(Token.BLOCK);
        ObjectType dummyThisType = registry.getCreateNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE);

        Scope bottomScope = new Scope(rootNode, dummyThisType);

        assertTrue(bottomScope.isBottom());
        assertEquals(0, bottomScope.getDepth());
        assertEquals(dummyThisType, bottomScope.getTypeOfThis());
        assertNull(bottomScope.getParent());
    }

    @Test
    public void testNestedScopeCreationWithFunctionType() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Node globalRoot = new Node(Token.BLOCK);
        Scope globalScope = new Scope(globalRoot, compiler);

        Node funcNode = new Node(Token.FUNCTION);
        // จำลอง FunctionType บน node
        FunctionType funcType = registry.createFunctionType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE), new Node(Token.PARAM_LIST));
        funcNode.setJSType(funcType);

        Scope nestedScope = new Scope(globalScope, funcNode);

        assertFalse(nestedScope.isGlobal());
        assertTrue(nestedScope.isLocal());
        assertEquals(globalScope, nestedScope.getParent());
        assertEquals(1, nestedScope.getDepth());
        assertEquals(funcType.getTypeOfThis(), nestedScope.getTypeOfThis());
        assertEquals(globalScope, nestedScope.getGlobalScope());
    }

    @Test
    public void testNestedScopeCreationWithoutFunctionType() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Node globalRoot = new Node(Token.BLOCK);
        Scope globalScope = new Scope(globalRoot, compiler);

        Node blockNode = new Node(Token.BLOCK); // ไม่มี FunctionType

        Scope nestedScope = new Scope(globalScope, blockNode);

        assertEquals(globalScope.getTypeOfThis(), nestedScope.getTypeOfThis());
    }

    @Test(expected = NullPointerException.class)
    public void testNestedScopeNullParentThrowsNPE() {
        Node node = new Node(Token.BLOCK);
        new Scope(null, node);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNestedScopeSameRootNodeThrowsIAE() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Node node = new Node(Token.BLOCK);
        Scope globalScope = new Scope(node, compiler);
        new Scope(globalScope, node); // Root node ซ้ำกับ parent
    }

    @Test
    public void testVariableDeclarationAndLookup() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);

        Node nameNode = new Node(Token.NAME, "x");
        Scope.Var var = globalScope.declare("x", nameNode, null, null, true);

        assertNotNull(var);
        assertEquals("x", var.getName());
        assertEquals(nameNode, var.getNameNode());
        assertTrue(var.isTypeInferred());
        assertEquals(1, globalScope.getVarCount());
        assertEquals(var, globalScope.getVar("x"));
        assertEquals(var, globalScope.getSlot("x"));
        assertEquals(var, globalScope.getOwnSlot("x"));
        assertNull(globalScope.getOwnSlot("nonexistent"));

        // Test Iterator and Vars
        Iterator<Scope.Var> it = globalScope.getVars();
        assertTrue(it.hasNext());
        assertEquals(var, it.next());

        // Test isDeclared
        assertTrue(globalScope.isDeclared("x", true));
        assertFalse(globalScope.isDeclared("y", true));
    }

    @Test(expected = IllegalStateException.class)
    public void testDeclareEmptyNameThrowsISE() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);
        globalScope.declare("", new Node(Token.NAME), null, null);
    }

    @Test(expected = IllegalStateException.class)
    public void testDeclareDuplicateNameThrowsISE() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);
        globalScope.declare("x", new Node(Token.NAME, "x"), null, null);
        globalScope.declare("x", new Node(Token.NAME, "x"), null, null);
    }

    @Test
    public void testUndeclareVariable() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);

        Node nameNode = new Node(Token.NAME, "x");
        Scope.Var var = globalScope.declare("x", nameNode, null, null);
        assertEquals(1, globalScope.getVarCount());

        globalScope.undeclare(var);
        assertEquals(0, globalScope.getVarCount());
        assertNull(globalScope.getVar("x"));
    }

    @Test
    public void testHierarchicalScopeVarLookup() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);
        Scope localScope = new Scope(globalScope, new Node(Token.FUNCTION));

        Scope.Var globalVar = globalScope.declare("g", new Node(Token.NAME, "g"), null, null);
        Scope.Var localVar = localScope.declare("l", new Node(Token.NAME, "l"), null, null);

        // Local scope should see both local and global vars
        assertEquals(localVar, localScope.getVar("l"));
        assertEquals(globalVar, localScope.getVar("g"));
        assertNull(localScope.getOwnSlot("g")); // OwnSlot shouldn't check parent

        // isDeclared with recurse
        assertTrue(localScope.isDeclared("g", true));
        assertFalse(localScope.isDeclared("g", false));
    }

    @Test
    public void testVarMethodsEdgeCases() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);

        // Var with null nameNode
        Scope.Var nullNodeVar = new Scope.Var(true, "n", null, null, globalScope, 0, null, false, null);
        assertNull(nullNodeVar.getParentNode());
        assertFalse(nullNodeVar.isConst());
        assertNull(nullNodeVar.getNameNode());
        assertEquals("<non-file>", nullNodeVar.getInputName());
        assertFalse(nullNodeVar.isNoShadow());

        // Var with Function parent node (Initial Value)
        Node funcParent = new Node(Token.FUNCTION);
        Node nameNode1 = new Node(Token.NAME, "f");
        funcParent.addChildToBack(nameNode1);
        Scope.Var funcVar = new Scope.Var(false, "f", nameNode1, null, globalScope, 1, null, false, null);
        assertEquals(funcParent, funcVar.getParentNode());
        assertEquals(funcParent, funcVar.getInitialValue());
        assertTrue(funcVar.isGlobal());
        assertFalse(funcVar.isLocal());
        assertTrue(funcVar.isExtern());

        // Var with Assign parent node (Initial Value)
        Node assignParent = new Node(Token.ASSIGN);
        Node nameNode2 = new Node(Token.NAME, "a");
        Node initVal = new Node(Token.NUMBER);
        assignParent.addChildToBack(nameNode2);
        assignParent.addChildToBack(initVal);
        Scope.Var assignVar = new Scope.Var(false, "a", nameNode2, null, globalScope, 2, null, false, null);
        assertEquals(initVal, assignVar.getInitialValue());

        // Var with Var parent node (Initial Value)
        Node varParent = new Node(Token.VAR);
        Node nameNode3 = new Node(Token.NAME, "v");
        Node varInit = new Node(Token.STRING);
        nameNode3.addChildToBack(varInit);
        varParent.addChildToBack(nameNode3);
        Scope.Var varVar = new Scope.Var(false, "v", nameNode3, null, globalScope, 3, null, false, null);
        assertEquals(varInit, varVar.getInitialValue());

        // Var with default/other parent node (Initial Value -> null)
        Node exprParent = new Node(Token.EXPR_RESULT);
        Node nameNode4 = new Node(Token.NAME, "e");
        exprParent.addChildToBack(nameNode4);
        Scope.Var exprVar = new Scope.Var(false, "e", nameNode4, null, globalScope, 4, null, false, null);
        assertNull(exprVar.getInitialValue());
    }

    @Test
    public void testVarSetTypeAndResolveType() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);

        // Inferred var allows setType
        Scope.Var inferredVar = globalScope.declare("inf", new Node(Token.NAME, "inf"), null, null, true);
        inferredVar.setType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
        assertNotNull(inferredVar.getType());

        // ResolveType with null type
        inferredVar.resolveType(null);
    }

    @Test(expected = IllegalStateException.class)
    public void testVarSetTypeNotInferredThrowsISE() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);

        // Declared (not inferred) var throws ISE on setType
        Scope.Var declaredVar = globalScope.declare("dec", new Node(Token.NAME, "dec"), null, null, false);
        declaredVar.setType(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE));
    }

    @Test
    public void testVarEqualsAndHashCode() {
        JSTypeRegistry registry = new JSTypeRegistry(null, true);
        DummyCompiler compiler = new DummyCompiler(registry);
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);

        Node nameNode = new Node(Token.NAME, "x");
        Scope.Var var1 = new Scope.Var(true, "x", nameNode, null, globalScope, 0, null, false, null);
        Scope.Var var2 = new Scope.Var(true, "x", nameNode, null, globalScope, 1, null, false, null);
        Scope.Var var3 = new Scope.Var(true, "y", new Node(Token.NAME, "y"), null, globalScope, 2, null, false, null);

        assertTrue(var1.equals(var2));
        assertFalse(var1.equals(var3));
        assertFalse(var1.equals("NotAVar"));
        assertEquals(var1.hashCode(), var2.hashCode());
        assertEquals("Scope.Var x", var1.toString());
    }
}