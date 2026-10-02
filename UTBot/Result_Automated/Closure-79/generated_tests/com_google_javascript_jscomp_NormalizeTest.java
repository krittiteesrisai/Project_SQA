package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.Normalize.NormalizeStatements;
import java.util.ArrayDeque;
import java.util.ArrayList;
import com.google.javascript.jscomp.CodeChangeHandler.RecentChange;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class com_google_javascript_jscomp_NormalizeTest {
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:122) */
        normalize.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() {
        Normalize normalize = new Normalize(null, false);
        Node node = new Node(126);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:122) */
        normalize.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:122) */
        normalize.process(null, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(115);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -256);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:122) */
        normalize.process(null, functionNode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        Node node = new Node(0);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:122) */
        normalize.process(node, functionNode);
    }
    
    @Test
    public void testProcess2() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(118);
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:122) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", scriptOrFnNodeType, scriptOrFnNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = scriptOrFnNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess3() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:257)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:126) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = functionNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess4() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:257)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:126) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess5() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        Node node = new Node(0);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(126);
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        last.setType(124);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 39);
        NodeTraversal objectValue = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Normalize.NormalizeStatements callback = ((Normalize.NormalizeStatements) createInstance("com.google.javascript.jscomp.Normalize$NormalizeStatements"));
        setField(objectValue, "com.google.javascript.jscomp.NodeTraversal", "callback", callback);
        ArrayDeque scopes = new ArrayDeque();
        setField(objectValue, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(objectValue, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:122) */
        normalize.process(node, functionNode);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testProcess6() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Normalize normalize = new Normalize(compiler, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        normalize.process(scriptOrFnNode, node);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess7() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Normalize normalize = new Normalize(compiler, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        normalize.process(scriptOrFnNode, node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.reportCodeChange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reportCodeChange(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 *  */
    @Test
    public void testReportCodeChange() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 *  */
    @Test
    public void testReportCodeChange_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        codeChangeHandlers.add(recentChange);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reportCodeChange(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 * @utbot.executesCondition {@code (assertOnChange): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#reportCodeChange()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testReportCodeChange_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.reportCodeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:115) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        try {
            reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method reportCodeChange(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 * @utbot.executesCondition {@code (assertOnChange): True}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: assertOnChange
 *  */
    @Test(expected = IllegalStateException.class)
    public void testReportCodeChange_ThrowIllegalStateException() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        try {
            reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 * @utbot.executesCondition {@code (assertOnChange): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#reportCodeChange()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: compiler.reportCodeChange();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testReportCodeChange_ThrowIllegalStateException_1() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        CodeChangeHandler.ForbiddenChange forbiddenChange = ((CodeChangeHandler.ForbiddenChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$ForbiddenChange"));
        codeChangeHandlers.add(forbiddenChange);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        Normalize normalize = new Normalize(compiler, false);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringType = Class.forName("java.lang.String");
        Method reportCodeChangeMethod = normalizeClazz.getDeclaredMethod("reportCodeChange", stringType);
        reportCodeChangeMethod.setAccessible(true);
        java.lang.Object[] reportCodeChangeMethodArguments = new java.lang.Object[1];
        reportCodeChangeMethodArguments[0] = ((Object) null);
        try {
            reportCodeChangeMethod.invoke(normalize, reportCodeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseAndNormalizeSyntheticCode(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#parseAndNormalizeSyntheticCode(com.google.javascript.jscomp.AbstractCompiler,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#parseSyntheticCode(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node js = compiler.parseSyntheticCode(code);
 *  */
    @Test
    public void testParseAndNormalizeSyntheticCode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.parseAndNormalizeSyntheticCode(Normalize.java:87) */
        Normalize.parseAndNormalizeSyntheticCode(null, null, null);
    }
    ///endregion
    
    ///region Errors report for parseAndNormalizeSyntheticCode
    
    public void testParseAndNormalizeSyntheticCode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 10 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method parseAndNormalizeTestCode(com.google.javascript.jscomp.AbstractCompiler, java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#parseAndNormalizeTestCode(com.google.javascript.jscomp.AbstractCompiler,java.lang.String,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#parseTestCode(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node js = compiler.parseTestCode(code);
 *  */
    @Test
    public void testParseAndNormalizeTestCode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Normalize.parseAndNormalizeTestCode(Normalize.java:101) */
        Normalize.parseAndNormalizeTestCode(null, null, null);
    }
    ///endregion
    
    ///region Errors report for parseAndNormalizeTestCode
    
    public void testParseAndNormalizeTestCode_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields898200695091500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields898200695091500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass898200695097700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields898200695091500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass898200695097700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

