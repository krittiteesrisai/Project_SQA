package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.FunctionNode;
import java.util.ArrayDeque;
import java.util.LinkedList;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import java.util.ArrayList;
import com.google.javascript.jscomp.Scope.Var;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_ReferenceCollectingCallbackTest {
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        referenceCollectingCallback.visit(null, scriptOrFnNode, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-256);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        
        referenceCollectingCallback.visit(null, scriptOrFnNode, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        referenceCollectingCallback.visit(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var v = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:116) */
        referenceCollectingCallback.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.NAME
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:115) */
        referenceCollectingCallback.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(113);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:124) */
        referenceCollectingCallback.visit(null, functionNode, functionNode1);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(111);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:124) */
        referenceCollectingCallback.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var v = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:116) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Var v = t.getScope().getVar(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        referenceCollectingCallback.visit(nodeTraversal, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(119);
        
        referenceCollectingCallback.visit(null, functionNode, functionNode1);
    }
    
    @Test
    public void testVisit2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(101);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first);
        
        referenceCollectingCallback.visit(nodeTraversal, functionNode, functionNode1);
    }
    
    @Test
    public void testVisit3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(111);
        
        referenceCollectingCallback.visit(null, functionNode, null);
    }
    
    @Test
    public void testVisit4() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        LinkedHashMap vars = new LinkedHashMap();
        setField(scope, "com.google.javascript.jscomp.Scope", "vars", vars);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit5() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(100);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:124) */
        referenceCollectingCallback.visit(nodeTraversal, functionNode, functionNode1);
    }
    
    @Test
    public void testVisit6() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(111);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:124) */
        referenceCollectingCallback.visit(null, functionNode, null);
    }
    
    @Test
    public void testVisit7() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(nodeTraversal);
        scopes.add(nodeTraversal);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(scope);
        scopeRoots.add(nodeTraversal);
        scopeRoots.add(nodeTraversal);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.NodeTraversal cannot be cast to class com.google.javascript.rhino.Node (com.google.javascript.jscomp.NodeTraversal and com.google.javascript.rhino.Node are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3f59ace3)]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:576)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:116) */
        referenceCollectingCallback.visit(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testVisit8() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        scopeRoots.add(node);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        SyntacticScopeCreator scopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(scopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler", compiler);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.ArrayIndexOutOfBoundsException: Index 45 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:305)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:576)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:116) */
        referenceCollectingCallback.visit(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testVisit9() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(111);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:124) */
        referenceCollectingCallback.visit(null, functionNode, functionNode1);
    }
    
    @Test
    public void testVisit10() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:576)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:116) */
        referenceCollectingCallback.visit(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testVisit11() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        scopeRoots.add(node);
        scopeRoots.add(null);
        scopeRoots.add(node);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes1.put(node, scope);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:53)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:576)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:116) */
        referenceCollectingCallback.visit(nodeTraversal, functionNode, functionNode1);
    }
    
    @Test
    public void testVisit12() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        MemoizedScopeCreator delegate = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "delegate", delegate);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:51)
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:53)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:576)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:116) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = scriptOrFnNode;
        visitMethodArguments[2] = numberNode;
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit13() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        scopeRoots.add(functionNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        SyntacticScopeCreator scopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(scopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler", compiler);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.<init>(Scope.java:288)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:73)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:576)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:116) */
        referenceCollectingCallback.visit(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit14() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(nodeTraversal);
        scopes.add(nodeTraversal);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        referenceCollectingCallback.visit(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeTraversal.traverse(compiler, root, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.ReferenceCollectingCallback.process(ReferenceCollectingCallback.java:100) */
        referenceCollectingCallback.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.addReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.Scope$Var, com.google.javascript.jscomp.ReferenceCollectingCallback$Reference)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#addReference(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.Scope.Var,com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 *  */
    @Test
    public void testAddReference() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        ArrayList references = new ArrayList();
        references.add(null);
        references.add(null);
        references.add(null);
        setField(referenceCollection, "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", "references", references);
        referenceMap.put(null, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varType, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = ((Object) null);
        addReferenceMethodArguments[2] = ((Object) null);
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#addReference(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.Scope.Var,com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 *  */
    @Test
    public void testAddReference_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        ScriptOrFnNode nameNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        ArrayList references = new ArrayList();
        references.add(null);
        references.add(null);
        references.add(null);
        setField(referenceCollection, "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", "references", references);
        referenceMap.put(var, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[2];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        Scope.Var var1 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        var1.nameNode = nameNode;
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = var1;
        addReferenceMethodArguments[2] = ((Object) null);
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#addReference(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.Scope.Var,com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 *  */
    @Test
    public void testAddReference_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Node nameNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        var.nameNode = nameNode;
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        ArrayList references = new ArrayList();
        references.add(null);
        references.add(null);
        references.add(null);
        setField(referenceCollection, "com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection", "references", references);
        referenceMap.put(var, referenceCollection);
        Scope.Var var1 = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Object nameNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(var1, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode1);
        referenceMap.put(var1, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[2];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        Scope.Var var2 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        Node nameNode2 = new Node(0);
        var2.nameNode = nameNode2;
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = var2;
        addReferenceMethodArguments[2] = ((Object) null);
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addReference(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.Scope$Var, com.google.javascript.jscomp.ReferenceCollectingCallback$Reference)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#addReference(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.Scope.Var,com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ReferenceCollection referenceInfo = referenceMap.get(v);
 *  */
    @Test
    public void testAddReference_ThrowNullPointerException() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.addReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.addReference(ReferenceCollectingCallback.java:194) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varType, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = ((Object) null);
        addReferenceMethodArguments[2] = ((Object) null);
        try {
            addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#addReference(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.Scope.Var,com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 * @utbot.executesCondition {@code (referenceInfo == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection#add(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testAddReference_ThrowNullPointerException_1() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[2];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.addReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:268)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            com.google.javascript.jscomp.ReferenceCollectingCallback.addReference(ReferenceCollectingCallback.java:197) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", nodeTraversalType, varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[3];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = var;
        addReferenceMethodArguments[2] = ((Object) null);
        try {
            addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.getReferenceCollection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferenceCollection(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferenceCollection(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return referenceMap.get(v);}
 *  */
    @Test
    public void testGetReferenceCollection_ReturnReferenceMapGet() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[2];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        ReferenceCollectingCallback.ReferenceCollection actual = referenceCollectingCallback.getReferenceCollection(var);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferenceCollection(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return referenceMap.get(v);}
 *  */
    @Test
    public void testGetReferenceCollection_ReturnReferenceMapGet_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(var, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[2];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        Scope.Var var1 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        ScriptOrFnNode nameNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        var1.nameNode = nameNode1;
        
        ReferenceCollectingCallback.ReferenceCollection actual = referenceCollectingCallback.getReferenceCollection(var1);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferenceCollection(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return referenceMap.get(v);}
 *  */
    @Test
    public void testGetReferenceCollection_ReturnReferenceMapGet_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Object nameNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        referenceMap.put(var, null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class anonymousObjectType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, anonymousObjectType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[2];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        Scope.Var var1 = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        var1.nameNode = nameNode;
        
        ReferenceCollectingCallback.ReferenceCollection actual = referenceCollectingCallback.getReferenceCollection(var1);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReferenceCollection(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferenceCollection(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return referenceMap.get(v);
 *  */
    @Test
    public void testGetReferenceCollection_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.getReferenceCollection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.getReferenceCollection(ReferenceCollectingCallback.java:107) */
        referenceCollectingCallback.getReferenceCollection(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: blockStack.pop();
 *  */
    @Test
    public void testExitScope_ThrowNoSuchElementException_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
            java.base/java.util.LinkedList.pop(LinkedList.java:805)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:141) */
        referenceCollectingCallback.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior#afterExitScope(com.google.javascript.jscomp.NodeTraversal,java.util.Map)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: behavior.afterExitScope(t, referenceMap);
 *  */
    @Test
    public void testExitScope_ThrowNoSuchElementException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:141) */
        referenceCollectingCallback.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.pop();
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:141) */
        referenceCollectingCallback.exitScope(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (isBlockBoundary(n, parent)): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, scriptOrFnNode, null);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Node node = new Node(108);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, null, node);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} twice
    /// execute conditions:
    ///     {@code (isBlockBoundary(n, parent)): True}
    /// invoke:
    ///     {@link java.util.Deque#peek()} twice,
    ///     {@link org.utbot.engine.overrides.collections.UtLinkedList#peekFirst()} twice,
    ///     {@link com.google.javascript.jscomp.NodeUtil#isHoistedFunctionDeclaration(com.google.javascript.rhino.Node)} twice,
    ///     {@link java.util.Deque#push(java.lang.Object)} twice,
    ///     {@link org.utbot.engine.overrides.collections.UtLinkedList#addFirst(java.lang.Object)} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node node = new Node(77);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, scriptOrFnNode, node);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Node node1 = new Node(119);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, node, node1);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_4() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(119);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, scriptOrFnNode, node);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_5() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(125);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(119);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, functionNode, node);
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_6() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(126);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(105);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(119);
        
        boolean actual = referenceCollectingCallback.shouldTraverse(null, scriptOrFnNode, functionNode);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isBlockBoundary(n, parent)
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:189)
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:151) */
        referenceCollectingCallback.shouldTraverse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isBlockBoundary(n, parent)
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:189)
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:151) */
        referenceCollectingCallback.shouldTraverse(null, null, node);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.push(new BasicBlock(blockStack.peek(), n));
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(111);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:152) */
        referenceCollectingCallback.shouldTraverse(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.push(new BasicBlock(blockStack.peek(), n));
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Node node = new Node(115);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:152) */
        referenceCollectingCallback.shouldTraverse(null, null, node);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.push(new BasicBlock(blockStack.peek(), n));
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_4() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:152) */
        referenceCollectingCallback.shouldTraverse(null, null, node);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link java.util.Deque#peek()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testShouldTraverse_ThrowIllegalStateException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        referenceCollectingCallback.shouldTraverse(null, node, scriptOrFnNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEnterScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        SyntacticScopeCreator scopeCreator = ((SyntacticScopeCreator) createInstance("com.google.javascript.jscomp.SyntacticScopeCreator"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "typeRegistry", typeRegistry);
        setField(scopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "compiler", compiler);
        String sourceName = "";
        setField(scopeCreator, "com.google.javascript.jscomp.SyntacticScopeCreator", "sourceName", sourceName);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 45 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:744)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:748)
            com.google.javascript.jscomp.Scope.<init>(Scope.java:305)
            com.google.javascript.jscomp.SyntacticScopeCreator.createScope(SyntacticScopeCreator.java:71)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:576)
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:132) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = t.getScope().getRootNode();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:132) */
        referenceCollectingCallback.enterScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = t.getScope().getRootNode();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:132) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node n = t.getScope().getRootNode();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:132) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node n = t.getScope().getRootNode();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnterScope_ThrowIllegalStateException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        scopeRoots.add(node);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        scopes1.put(node, scope);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBlockBoundary(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsBlockBoundary_ReturnTrue() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = scriptOrFnNode;
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return n.getType() == Token.CASE;}
 *  */
    @Test
    public void testIsBlockBoundary_NGetTypeNotEqualsTokenCASE() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", scriptOrFnNodeType, scriptOrFnNodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = scriptOrFnNode;
        isBlockBoundaryMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.returnsFrom {@code return n != parent.getFirstChild();}
 *  */
    @Test
    public void testIsBlockBoundary_NNotEqualsParentGetFirstChild() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = node;
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return n.getType() == Token.CASE;}
 *  */
    @Test
    public void testIsBlockBoundary_NGetTypeEqualsTokenCASE() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(111);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = node;
        isBlockBoundaryMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.returnsFrom {@code return n != parent.getFirstChild();}
 *  */
    @Test
    public void testIsBlockBoundary_NEqualsParentGetFirstChild() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(98);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = scriptOrFnNode;
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isBlockBoundary(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.getType() == Token.CASE;
 *  */
    @Test
    public void testIsBlockBoundary_ThrowNullPointerException_1() throws Throwable  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:189) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = scriptOrFnNode;
        try {
            isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.getType() == Token.CASE;
 *  */
    @Test
    public void testIsBlockBoundary_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:189) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = ((Object) null);
        try {
            isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method isBlockBoundary(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
     */
    @Test
    public void testIsBlockBoundaryReturnsFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(115);
        node.setType(262252);
        Node node1 = new Node(113);
        node1.setType(-1);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = node;
        isBlockBoundaryMethodArguments[1] = node1;
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Util methods
    
    private static Object createInstance(String className) throws Exception {
        Class<?> clazz = Class.forName(className);
        return Class.forName("sun.misc.Unsafe").getDeclaredMethod("allocateInstance", Class.class)
            .invoke(getUnsafeInstance(), clazz);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields935200116921800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields935200116921800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass935200116930100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields935200116921800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass935200116930100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

