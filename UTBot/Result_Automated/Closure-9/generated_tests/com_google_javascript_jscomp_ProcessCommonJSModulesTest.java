package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_ProcessCommonJSModulesTest {
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.getModule
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getModule()
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#getModule()}
 * @utbot.returnsFrom {@code return module;}
 *  */
    @Test
    public void testGetModule_ReturnModule() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        
        JSModule actual = processCommonJSModules.getModule();
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        processCommonJSModules.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        processCommonJSModules.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        processCommonJSModules.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        processCommonJSModules.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_5() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_6() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-256);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        processCommonJSModules.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_7() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(132);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(next, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_8() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(105);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SimpleSourceFile objectValue = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        String name = "";
        setField(objectValue, "com.google.javascript.rhino.jstype.SimpleSourceFile", "name", name);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
     */
    @Test
    public void testProcess() {
        ProcessCommonJSModules processCommonJSModules = new ProcessCommonJSModules(null, "abc", true);
        Node node = new Node(Integer.MIN_VALUE);
        node.setType(-1);
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[2];
        Node node1 = new Node(-1);
        node1.setType(Integer.MAX_VALUE);
        nodeArray[0] = node1;
        com.google.javascript.rhino.Node[] nodeArray1 = {};
        Node node2 = new Node(Integer.MIN_VALUE, nodeArray1);
        node2.setType(-1);
        Node node3 = new Node(Integer.MAX_VALUE, node2, Integer.MIN_VALUE, -1);
        node3.setType(-1);
        nodeArray[1] = node3;
        Node node4 = new Node(0, nodeArray, Integer.MAX_VALUE, Integer.MAX_VALUE);
        node4.setType(-1);
        
        processCommonJSModules.process(node, node4);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        processCommonJSModules.process(null, node);
    }
    
    @Test
    public void testProcess2() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        processCommonJSModules.process(node, node);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testProcess3() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testProcess4() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        String fileName = "";
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "fileName", fileName);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processCommonJSModulesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(processCommonJSModules, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess5() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        processCommonJSModules.process(null, node);
    }
    
    @Test
    public void testProcess6() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:456)
            com.google.javascript.jscomp.ProcessCommonJSModules.process(ProcessCommonJSModules.java:68) */
        processCommonJSModules.process(null, node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.guessCJSModuleName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method guessCJSModuleName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#guessCJSModuleName(java.lang.String)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessCommonJSModules#normalizeSourceName(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return toModuleName(normalizeSourceName(filename));
 *  */
    @Test
    public void testGuessCJSModuleName_ThrowNullPointerException() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.guessCJSModuleName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessCommonJSModules.normalizeSourceName(ProcessCommonJSModules.java:120)
            com.google.javascript.jscomp.ProcessCommonJSModules.guessCJSModuleName(ProcessCommonJSModules.java:72) */
        processCommonJSModules.guessCJSModuleName(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method guessCJSModuleName(java.lang.String)
    
    @Test
    public void testGuessCJSModuleName1() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        String filenamePrefix = "\u0000\u0000";
        setField(processCommonJSModules, "com.google.javascript.jscomp.ProcessCommonJSModules", "filenamePrefix", filenamePrefix);
        String string = "\u0001\u0001\u0001\u0000\u0000";
        
        String actual = processCommonJSModules.guessCJSModuleName(string);
        
        String expected = "module$\u0001\u0001\u0001\u0000\u0000";
        
        assertEquals(expected, actual);
    }
    
    @Test
    public void testGuessCJSModuleName2() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        String filenamePrefix = "";
        setField(processCommonJSModules, "com.google.javascript.jscomp.ProcessCommonJSModules", "filenamePrefix", filenamePrefix);
        String string = "";
        
        String actual = processCommonJSModules.guessCJSModuleName(string);
        
        String expected = "module$";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toModuleName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#toModuleName(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.util.regex.Pattern#quote(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: filename.replaceAll("^\\." + Pattern.quote(MODULE_SLASH), "").replaceAll(Pattern.quote(MODULE_SLASH), MODULE_NAME_SEPARATOR).replaceAll("\\.js$", "").replaceAll("-", "_")
 *  */
    @Test
    public void testToModuleName_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(ProcessCommonJSModules.java:90) */
        ProcessCommonJSModules.toModuleName(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method toModuleName(java.lang.String)
    
    @Test
    public void testToModuleName1() {
        String string = " ";
        
        String actual = ProcessCommonJSModules.toModuleName(string);
        
        String expected = "module$ ";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method toModuleName(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#toModuleName(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#replaceAll(java.lang.String,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: requiredFilename = requiredFilename.replaceAll("\\.js$", "");
 *  */
    @Test
    public void testToModuleName_ThrowNullPointerException1() {
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(ProcessCommonJSModules.java:101) */
        ProcessCommonJSModules.toModuleName(null, null);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method toModuleName(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#toModuleName(java.lang.String,java.lang.String)}
     */
    @Test
    public void testToModuleNameWithEmptyStringAndNonEmptyString() {
        String actual = ProcessCommonJSModules.toModuleName("", "1\uFFF80");
        
        String expected = "module$";
        
        assertEquals(expected, actual);
    }
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#toModuleName(java.lang.String,java.lang.String)}
     */
    @Test
    public void testToModuleNameWithNonEmptyStringAndEmptyString() {
        String actual = ProcessCommonJSModules.toModuleName("./", "");
        
        String expected = "module$";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method toModuleName(java.lang.String, java.lang.String)
    
    @Test
    public void testToModuleName2() {
        String string = " ";
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessCommonJSModules.toModuleName(ProcessCommonJSModules.java:102) */
        ProcessCommonJSModules.toModuleName(string, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessCommonJSModules.normalizeSourceName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeSourceName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#normalizeSourceName(java.lang.String)}
 * @utbot.executesCondition {@code (filename.indexOf(filenamePrefix) == 0): False}
 * @utbot.returnsFrom {@code return filename;}
 *  */
    @Test
    public void testNormalizeSourceName_FilenameIndexOfNotEqualsZero() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        String filenamePrefix = "  ";
        setField(processCommonJSModules, "com.google.javascript.jscomp.ProcessCommonJSModules", "filenamePrefix", filenamePrefix);
        String string = " ";
        
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeSourceNameMethod = processCommonJSModulesClazz.getDeclaredMethod("normalizeSourceName", stringType);
        normalizeSourceNameMethod.setAccessible(true);
        java.lang.Object[] normalizeSourceNameMethodArguments = new java.lang.Object[1];
        normalizeSourceNameMethodArguments[0] = string;
        String actual = ((String) normalizeSourceNameMethod.invoke(processCommonJSModules, normalizeSourceNameMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#normalizeSourceName(java.lang.String)}
 * @utbot.executesCondition {@code (filename.indexOf(filenamePrefix) == 0): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int)}
 * @utbot.returnsFrom {@code return filename;}
 *  */
    @Test
    public void testNormalizeSourceName_FilenameIndexOfEqualsZero() throws Exception  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        String filenamePrefix = "";
        setField(processCommonJSModules, "com.google.javascript.jscomp.ProcessCommonJSModules", "filenamePrefix", filenamePrefix);
        String string = "";
        
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeSourceNameMethod = processCommonJSModulesClazz.getDeclaredMethod("normalizeSourceName", stringType);
        normalizeSourceNameMethod.setAccessible(true);
        java.lang.Object[] normalizeSourceNameMethodArguments = new java.lang.Object[1];
        normalizeSourceNameMethodArguments[0] = string;
        String actual = ((String) normalizeSourceNameMethod.invoke(processCommonJSModules, normalizeSourceNameMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method normalizeSourceName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link ProcessCommonJSModules}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessCommonJSModules#normalizeSourceName(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: filename.indexOf(filenamePrefix) == 0
 *  */
    @Test
    public void testNormalizeSourceName_ThrowNullPointerException() throws Throwable  {
        ProcessCommonJSModules processCommonJSModules = ((ProcessCommonJSModules) createInstance("com.google.javascript.jscomp.ProcessCommonJSModules"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessCommonJSModules.normalizeSourceName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessCommonJSModules.normalizeSourceName(ProcessCommonJSModules.java:120) */
        Class processCommonJSModulesClazz = Class.forName("com.google.javascript.jscomp.ProcessCommonJSModules");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeSourceNameMethod = processCommonJSModulesClazz.getDeclaredMethod("normalizeSourceName", stringType);
        normalizeSourceNameMethod.setAccessible(true);
        java.lang.Object[] normalizeSourceNameMethodArguments = new java.lang.Object[1];
        normalizeSourceNameMethodArguments[0] = ((Object) null);
        try {
            normalizeSourceNameMethod.invoke(processCommonJSModules, normalizeSourceNameMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields881551911657000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields881551911657000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass881551911664700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields881551911657000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass881551911664700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

