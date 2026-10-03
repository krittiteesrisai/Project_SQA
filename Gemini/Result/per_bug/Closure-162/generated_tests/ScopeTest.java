package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

/**
 * Senior JUnit 4 Test Automation Suite for Closure-162b Scope class.
 */
public class ScopeTest {

    // Mock/Dummy AbstractCompiler for Global Scope creation
    private static class DummyCompiler extends AbstractCompiler {
        private final JSTypeRegistry typeRegistry = new JSTypeRegistry(null, true);

        @Override public JSTypeRegistry getTypeRegistry() { return typeRegistry; }
        @Override public void parse(CompilerInput input) {}
        @Override public CompilerOptions getOptions() { return null; }
        @Override public void relaxErrorManager() {}
        @Override public void error(JSError n) {}
        @Override public DiagnosticGroup getDiagnosticGroups() { return null; }
        @Override public void report(JSError n) {}
        @Override public CheckLevel getErrorLevel(DiagnosticGroup group) { return null; }
        @Override public void replaceScript(JSModule module, SCRIPT newScript) {}
        @Override public void addNewScript(SCRIPT script) {}
        @Override public String getSourceLine(String file, int lineno) { return null; }
        @Override public Region getSourceRegion(String file, int lineno) { return null; }
        @Override public boolean hasHaltingErrors() { return false; }
        @Override public boolean acceptEcmaScript5() { return false; }
        @Override public void setJsdocBuilder(JSDocInfoParser jsdocBuilder) {}
    }

    @Test
    public void testGlobalScopeCreation() {
        DummyCompiler compiler = new DummyCompiler();
        Node rootNode = new Node(Token.BLOCK);
        Scope globalScope = new Scope(rootNode, compiler);

        assertTrue(globalScope.isGlobal());
        assertFalse(globalScope.isLocal());
        assertNull(globalScope.getParent());
        assertEquals(0, globalScope.getDepth());
        assertEquals(rootNode, globalScope.getRootNode());
        assertNotNull(globalScope.getTypeOfThis());
    }

    @Test
    public void testBottomScopeCreation() {
        Node rootNode = new Node(Token.BLOCK);
        DummyCompiler compiler = new DummyCompiler();
        ObjectType thisType = compiler.getTypeRegistry().getNativeObjectType(com.google.javascript.rhino.jstype.JSTypeNative.GLOBAL_THIS);
        Scope bottomScope = new Scope(rootNode, thisType);

        assertTrue(bottomScope.isBottom());
        assertEquals(0, bottomScope.getDepth());
        assertEquals(thisType, bottomScope.getTypeOfThis());
    }

    @Test
    public void testNestedScopeCreationWithFunctionType() {
        DummyCompiler compiler = new DummyCompiler();
        Node globalRoot = new Node(Token.BLOCK);
        Scope globalScope = new Scope(globalRoot, compiler);

        Node funcRoot = new Node(Token.FUNCTION);
        // Simulate function type node
        Scope funcScope = new Scope(globalScope, funcRoot);

        assertFalse(funcScope.isGlobal());
        assertTrue(funcScope.isLocal());
        assertEquals(1, funcScope.getDepth());
        assertEquals(globalScope, funcScope.getParent());
        assertEquals(funcRoot, funcScope.getRootNode());
    }

    @Test
    public void testVariableDeclarationAndRetrieval() {
        DummyCompiler compiler = new DummyCompiler();
        Scope scope = new Scope(new Node(Token.BLOCK), compiler);

        Node nameNode = Node.newString(Token.NAME, "myVar");
        Scope.Var var = scope.declare("myVar", nameNode, null, null, true);

        assertNotNull(var);
        assertEquals("myVar", var.getName());
        assertEquals(var, scope.getVar("myVar"));
        assertEquals(var, scope.getSlot("myVar"));
        assertEquals(var, scope.getOwnSlot("myVar"));
        assertEquals(1, scope.getVarCount());
        assertTrue(scope.isDeclared("myVar", false));
    }

    @Test(expected = IllegalStateException.class)
    public void testDuplicateDeclarationThrowsException() {
        DummyCompiler compiler = new DummyCompiler();
        Scope scope = new Scope(new Node(Token.BLOCK), compiler);

        Node nameNode1 = Node.newString(Token.NAME, "dup");
        Node nameNode2 = Node.newString(Token.NAME, "dup");

        scope.declare("dup", nameNode1, null, null, true);
        // Should trigger Preconditions.checkState(vars.get(name) == null);
        scope.declare("dup", nameNode2, null, null, true);
    }

    @Test(expected = IllegalStateException.class)
    public void testInvalidEmptyNameDeclaration() {
        DummyCompiler compiler = new DummyCompiler();
        Scope scope = new Scope(new Node(Token.BLOCK), compiler);
        // Should trigger Preconditions.checkState(name != null && name.length() > 0);
        scope.declare("", new Node(Token.NAME), null, null, true);
    }

    @Test
    public void testUndeclareVariable() {
        DummyCompiler compiler = new DummyCompiler();
        Scope scope = new Scope(new Node(Token.BLOCK), compiler);

        Node nameNode = Node.newString(Token.NAME, "tempVar");
        Scope.Var var = scope.declare("tempVar", nameNode, null, null, true);

        assertEquals(1, scope.getVarCount());
        scope.undeclare(var);
        assertEquals(0, scope.getVarCount());
        assertNull(scope.getVar("tempVar"));
    }

    @Test
    public void testParentScopeVariableRecurseLookup() {
        DummyCompiler compiler = new DummyCompiler();
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);
        Node parentNode = Node.newString(Token.NAME, "globalVar");
        globalScope.declare("globalVar", parentNode, null, null, true);

        Scope localScope = new Scope(globalScope, new Node(Token.FUNCTION));

        // Test getVar recursing up to parent
        Scope.Var found = localScope.getVar("globalVar");
        assertNotNull(found);
        assertEquals("globalVar", found.getName());

        // Test isDeclared with recurse = true vs false
        assertTrue(localScope.isDeclared("globalVar", true));
        assertFalse(localScope.isDeclared("globalVar", false));
    }

    @Test
    public void testGlobalScopeTraversal() {
        DummyCompiler compiler = new DummyCompiler();
        Scope globalScope = new Scope(new Node(Token.BLOCK), compiler);
        Scope localScope = new Scope(globalScope, new Node(Token.FUNCTION));

        assertEquals(globalScope, localScope.getGlobalScope());
        assertEquals(globalScope, globalScope.getGlobalScope());
    }

    @Test
    public void testArgumentsVarLazyInitialization() {
        DummyCompiler compiler = new DummyCompiler();
        Scope scope = new Scope(new Node(Token.BLOCK), compiler);

        Scope.Var args1 = scope.getArgumentsVar();
        Scope.Var args2 = scope.getArgumentsVar();

        assertNotNull(args1);
        assertSame(args1, args2);
        assertEquals("arguments", args1.getName());
    }

    @Test
    public void testVarGetInitialValueBranches() {
        // Test FUNCTION parent node
        Node funcNode = new Node(Token.FUNCTION);
        Node nameNode1 = new Node(Token.NAME, funcNode);
        Scope.Var varFunc = new Scope.Var(false, "f", nameNode1, null, null, 0, null, false, null);
        assertEquals(funcNode, varFunc.getInitialValue());

        // Test ASSIGN parent node
        Node assignNode = new Node(Token.ASSIGN, new Node(Token.NAME), new Node(Token.NUMBER));
        Node nameNode2 = new Node(Token.NAME, assignNode);
        Scope.Var varAssign = new Scope.Var(false, "a", nameNode2, null, null, 0, null, false, null);
        assertEquals(assignNode.getLastChild(), varAssign.getInitialValue());

        // Test VAR parent node
        Node initVal = new Node(Token.NUMBER);
        Node varParent = new Node(Token.VAR, initVal);
        Node nameNode3 = new Node(Token.NAME, varParent);
        Scope.Var varVar = new Scope.Var(false, "v", nameNode3, null, null, 0, null, false, null);
        assertEquals(initVal, varVar.getInitialValue());

        // Test Default / Null case (e.g. Block parent)
        Node blockParent = new Node(Token.BLOCK);
        Node nameNode4 = new Node(Token.NAME, blockParent);
        Scope.Var varDefault = new Scope.Var(false, "d", nameNode4, null, null, 0, null, false, null);
        assertNull(varDefault.getInitialValue());
    }

    @Test
    public void testVarUtilityMethodsAndEquals() {
        DummyCompiler compiler = new DummyCompiler();
        Scope scope = new Scope(new Node(Token.BLOCK), compiler);
        Node nameNode = Node.newString(Token.NAME, "x");
        Scope.Var var1 = scope.declare("x", nameNode, null, null, true);
        Scope.Var var2 = scope.declare("y", Node.newString(Token.NAME, "y"), null, null, true);

        assertEquals(nameNode, var1.getNode());
        assertEquals(nameNode, var1.getNameNode());
        assertNull(var1.getSourceFile());
        assertEquals(var1, var1.getSymbol());
        assertEquals(var1, var1.getDeclaration());
        assertFalse(var1.isBleedingFunction());
        assertTrue(var1.isGlobal());
        assertFalse(var1.isLocal());
        assertTrue(var1.isConst() == NodeUtil.isConstantName(nameNode));
        assertFalse(var1.isDefine());
        assertEquals("<non-file>", var1.getInputName());
        assertFalse(var1.isNoShadow());
        
        // Equals & HashCode
        assertTrue(var1.equals(var1));
        assertFalse(var1.equals(var2));
        assertFalse(var1.equals("not a var"));
        assertEquals(nameNode.hashCode(), var1.hashCode());
        assertNotNull(var1.toString());
    }

    @Test
    public void testArgumentsEqualsAndHashCode() {
        DummyCompiler compiler = new DummyCompiler();
        Scope scope1 = new Scope(new Node(Token.BLOCK), compiler);
        Scope scope2 = new Scope(new Node(Token.BLOCK), compiler);

        Scope.Arguments args1 = new Scope.Arguments(scope1);
        Scope.Arguments args2 = new Scope.Arguments(scope1);
        Scope.Arguments args3 = new Scope.Arguments(scope2);

        assertTrue(args1.equals(args2));
        assertFalse(args1.equals(args3));
        assertFalse(args1.equals("not an arguments obj"));
        assertEquals(System.identityHashCode(args1), args1.hashCode());
    }

    @Test
    public void testDeclarativelyUnboundVarsWithoutTypes() {
        DummyCompiler compiler = new DummyCompiler();
        Scope scope = new Scope(new Node(Token.BLOCK), compiler);

        Iterator<Scope.Var> unboundIter = scope.getDeclarativelyUnboundVarsWithoutTypes();
        assertNotNull(unboundIter);
        assertFalse(unboundIter.hasNext());
    }
}