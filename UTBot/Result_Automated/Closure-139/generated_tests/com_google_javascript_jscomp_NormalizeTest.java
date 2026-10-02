package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.ArrayList;
import com.google.javascript.jscomp.CodeChangeHandler.RecentChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public final class com_google_javascript_jscomp_NormalizeTest {
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:82) */
        normalize.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:82) */
        normalize.process(null, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(126);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:82) */
        normalize.process(null, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "\u0000\u0000\u0000";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.formatNodePosition(NodeTraversal.java:297)
            com.google.javascript.jscomp.NodeTraversal.formatNodeContext(NodeTraversal.java:242)
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:229)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:82) */
        normalize.process(null, functionNode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testProcess1() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(124);
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess2() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(124);
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        normalize.process(functionNode, node);
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess3() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess4() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(124);
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
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
    
    @Test(expected = StackOverflowError.class)
    public void testProcess5() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
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
    
    @Test(expected = StackOverflowError.class)
    public void testProcess6() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(124);
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess7() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(124);
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess8() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess9() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess10() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess11() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next2 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next2, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "next", next2);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
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
    
    @Test(expected = StackOverflowError.class)
    public void testProcess12() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(126);
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess13() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess14() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(115);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess15() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(126);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(114);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:284)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:261)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:87) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess16() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(126);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(120);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:82) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess17() throws Exception  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(118);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:284)
            com.google.javascript.jscomp.NodeTraversal.traverseRoots(NodeTraversal.java:261)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:87) */
        normalize.process(null, functionNode);
    }
    
    @Test
    public void testProcess18() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:82) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess19() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(115);
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:82) */
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
    public void testProcess20() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:82) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess21() throws Throwable  {
        Normalize normalize = new Normalize(null, true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.Normalize.process(Normalize.java:82) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testProcess22() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(stringNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess23() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess24() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(126);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(123);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess25() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(126);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(120);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess26() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(126);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess27() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(126);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(117);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess28() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(126);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(124);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(last, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode1, "com.google.javascript.rhino.Node", "last", last);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess29() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(126);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", functionNodeType, functionNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = functionNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess30() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", functionNodeType, functionNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = functionNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess31() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess32() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testProcess33() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Normalize normalize = new Normalize(compiler, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "\u0000";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        normalize.process(null, scriptOrFnNode);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess34() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Normalize normalize = new Normalize(compiler, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(115);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        normalize.process(null, functionNode);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess35() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Normalize normalize = new Normalize(compiler, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(functionNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        normalize.process(functionNode, functionNode1);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess36() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Normalize normalize = new Normalize(compiler, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-254);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(115);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "\u0000\u0000";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        normalize.process(null, node);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess37() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Normalize normalize = new Normalize(compiler, false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(115);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next2 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next2, "com.google.javascript.rhino.Node", "next", first);
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = normalizeClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(normalize, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess38() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Normalize normalize = new Normalize(compiler, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(115);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(124);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        normalize.process(null, functionNode);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess39() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Normalize normalize = new Normalize(compiler, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(115);
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode next4 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next3, "com.google.javascript.rhino.Node", "next", next4);
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(first1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next5 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next5, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next5);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        normalize.process(null, scriptOrFnNode);
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
    public void testReportCodeChange_2() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#reportCodeChange(java.lang.String)}
 *  */
    @Test
    public void testReportCodeChange_3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "locked", true);
        codeChangeHandlers.add(symbolTable);
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
        SymbolTable symbolTable = ((SymbolTable) createInstance("com.google.javascript.jscomp.SymbolTable"));
        Object cache = createInstance("com.google.javascript.jscomp.SymbolTable$MemoizedData");
        setField(symbolTable, "com.google.javascript.jscomp.SymbolTable", "cache", cache);
        codeChangeHandlers.add(symbolTable);
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
            com.google.javascript.jscomp.Normalize.reportCodeChange(Normalize.java:77) */
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.Normalize.removeDuplicateDeclarations
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeDuplicateDeclarations(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link Normalize}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.Normalize#removeDuplicateDeclarations(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.traverse(root);
 *  */
    @Test
    public void testRemoveDuplicateDeclarations_ThrowNullPointerException() throws Throwable  {
        Normalize normalize = new Normalize(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.Normalize.removeDuplicateDeclarations] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.Normalize.removeDuplicateDeclarations(Normalize.java:503) */
        Class normalizeClazz = Class.forName("com.google.javascript.jscomp.Normalize");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDuplicateDeclarationsMethod = normalizeClazz.getDeclaredMethod("removeDuplicateDeclarations", nodeType);
        removeDuplicateDeclarationsMethod.setAccessible(true);
        java.lang.Object[] removeDuplicateDeclarationsMethodArguments = new java.lang.Object[1];
        removeDuplicateDeclarationsMethodArguments[0] = ((Object) null);
        try {
            removeDuplicateDeclarationsMethod.invoke(normalize, removeDuplicateDeclarationsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        
                java.lang.reflect.Method methodForGetDeclaredFields937689638124500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields937689638124500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass937689638133700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields937689638124500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass937689638133700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

