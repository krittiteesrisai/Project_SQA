package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.AnalyzePrototypeProperties.NameInfo;
import com.google.javascript.rhino.InputId;
import java.util.LinkedHashMap;
import java.util.Deque;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_AnalyzePrototypePropertiesTest {
    ///region Test suites for executable com.google.javascript.jscomp.AnalyzePrototypeProperties.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148) */
        analyzePrototypeProperties.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Class symbolTypeClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object property = getEnumConstantByName(symbolTypeClazz, "PROPERTY");
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "PROPERTY", property);
        JSModule firstModule = ((JSModule) createInstance("com.google.javascript.jscomp.JSModule"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "firstModule", firstModule);
        AnalyzePrototypeProperties.NameInfo externNode = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "externNode", externNode);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(last, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.formatNodePosition(NodeTraversal.java:322)
            com.google.javascript.jscomp.NodeTraversal.formatNodeContext(NodeTraversal.java:265)
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess2() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "canModifyExterns", true);
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:152) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess3() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "canModifyExterns", true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:152) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess4() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess5() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:152) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess6() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:152) */
        analyzePrototypeProperties.process(node, null);
    }
    
    @Test
    public void testProcess7() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:152) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess8() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = stringNode1;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess9() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.process(AnalyzePrototypeProperties.java:148) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(analyzePrototypeProperties, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllNameInfo()
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getAllNameInfo()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<NameInfo> result = Lists.newArrayList(propertyNameInfo.values());
 *  */
    @Test
    public void testGetAllNameInfo_ThrowNullPointerException() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo(AnalyzePrototypeProperties.java:164) */
        analyzePrototypeProperties.getAllNameInfo();
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getAllNameInfo()}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.invokes {@link com.google.common.collect.Lists#newArrayList(java.lang.Iterable)}
 * @utbot.invokes {@link java.util.Map#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: result.addAll(varNameInfo.values());
 *  */
    @Test
    public void testGetAllNameInfo_ThrowNullPointerException_1() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        LinkedHashMap propertyNameInfo = new LinkedHashMap();
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "propertyNameInfo", propertyNameInfo);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getAllNameInfo(AnalyzePrototypeProperties.java:165) */
        analyzePrototypeProperties.getAllNameInfo();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNameInfoForName(java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType)
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): False}
 * @utbot.executesCondition {@code (map.containsKey(name)): True}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.returnsFrom {@code return map.get(name);}
 *  */
    @Test
    public void testGetNameInfoForName_MapContainsKey() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Class symbolTypeClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object property = getEnumConstantByName(symbolTypeClazz, "PROPERTY");
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "PROPERTY", property);
        LinkedHashMap varNameInfo = new LinkedHashMap();
        varNameInfo.put(null, null);
        String string = "";
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        varNameInfo.put(string, nameInfo);
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "varNameInfo", varNameInfo);
        
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeClazz);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        AnalyzePrototypeProperties.NameInfo actual = ((AnalyzePrototypeProperties.NameInfo) getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNameInfoForName(java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType)
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): True}
 * @utbot.executesCondition {@code (map.containsKey(name)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.graph.LinkedDirectedGraph#createNode(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: symbolGraph.createNode(nameInfo);
 *  */
    @Test
    public void testGetNameInfoForName_ThrowClassCastException() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        NameReferenceGraph symbolGraph = ((NameReferenceGraph) createInstance("com.google.javascript.jscomp.NameReferenceGraph"));
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "symbolGraph", symbolGraph);
        LinkedHashMap propertyNameInfo = new LinkedHashMap();
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "propertyNameInfo", propertyNameInfo);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName] produces [java.lang.ClassCastException: class com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo cannot be cast to class com.google.javascript.jscomp.NameReferenceGraph$Name (com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo and com.google.javascript.jscomp.NameReferenceGraph$Name are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @41e46c22)]
            com.google.javascript.jscomp.NameReferenceGraph.createNode(NameReferenceGraph.java:59)
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(AnalyzePrototypeProperties.java:184) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Class symbolTypeType = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeType);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        try {
            getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: map.containsKey(name)
 *  */
    @Test
    public void testGetNameInfoForName_ThrowNullPointerException() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Class symbolTypeClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object property = getEnumConstantByName(symbolTypeClazz, "PROPERTY");
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "PROPERTY", property);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(AnalyzePrototypeProperties.java:179) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeClazz);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        try {
            getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: map.containsKey(name)
 *  */
    @Test
    public void testGetNameInfoForName_ThrowNullPointerException_1() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(AnalyzePrototypeProperties.java:179) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Class symbolTypeType = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeType);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        try {
            getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link AnalyzePrototypeProperties}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.AnalyzePrototypeProperties#getNameInfoForName(java.lang.String,com.google.javascript.jscomp.AnalyzePrototypeProperties.SymbolType)}
 * @utbot.executesCondition {@code (type == PROPERTY): True}
 * @utbot.executesCondition {@code (map.containsKey(name)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.graph.LinkedDirectedGraph#createNode(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: symbolGraph.createNode(nameInfo);
 *  */
    @Test
    public void testGetNameInfoForName_ThrowNullPointerException_2() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        LinkedHashMap propertyNameInfo = new LinkedHashMap();
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "propertyNameInfo", propertyNameInfo);
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(AnalyzePrototypeProperties.java:184) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class stringType = Class.forName("java.lang.String");
        Class symbolTypeType = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", stringType, symbolTypeType);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = ((Object) null);
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        try {
            getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getNameInfoForName(java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType)
    
    @Test
    public void testGetNameInfoForName1() throws Exception  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Class symbolTypeClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object property = getEnumConstantByName(symbolTypeClazz, "PROPERTY");
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "PROPERTY", property);
        LinkedHashMap propertyNameInfo = new LinkedHashMap();
        String string = "\u0000";
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        propertyNameInfo.put(string, nameInfo);
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "propertyNameInfo", propertyNameInfo);
        String string1 = "\u0000";
        
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class string1Type = Class.forName("java.lang.String");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", string1Type, symbolTypeClazz);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = string1;
        getNameInfoForNameMethodArguments[1] = property;
        AnalyzePrototypeProperties.NameInfo actual = ((AnalyzePrototypeProperties.NameInfo) getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments));
        
        String actualName = actual.name;
        assertNull(actualName);
        
        boolean actualReferenced = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "referenced"));
        assertFalse(actualReferenced);
        
        Deque actualDeclarations = actual.getDeclarations();
        assertNull(actualDeclarations);
        
        JSModule actualDeepestCommonModuleRef = actual.getDeepestCommonModuleRef();
        assertNull(actualDeepestCommonModuleRef);
        
        boolean actualReadClosureVariables = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo", "readClosureVariables"));
        assertFalse(actualReadClosureVariables);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getNameInfoForName(java.lang.String, com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType)
    
    @Test
    public void testGetNameInfoForName2() throws Throwable  {
        AnalyzePrototypeProperties analyzePrototypeProperties = ((AnalyzePrototypeProperties) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties"));
        Class symbolTypeClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties$SymbolType");
        Object property = getEnumConstantByName(symbolTypeClazz, "VAR");
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "PROPERTY", property);
        LinkedHashMap varNameInfo = new LinkedHashMap();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        AnalyzePrototypeProperties.NameInfo nameInfo = ((AnalyzePrototypeProperties.NameInfo) createInstance("com.google.javascript.jscomp.AnalyzePrototypeProperties$NameInfo"));
        varNameInfo.put(string, nameInfo);
        setField(analyzePrototypeProperties, "com.google.javascript.jscomp.AnalyzePrototypeProperties", "varNameInfo", varNameInfo);
        String string1 = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AnalyzePrototypeProperties.getNameInfoForName(AnalyzePrototypeProperties.java:184) */
        Class analyzePrototypePropertiesClazz = Class.forName("com.google.javascript.jscomp.AnalyzePrototypeProperties");
        Class string1Type = Class.forName("java.lang.String");
        Method getNameInfoForNameMethod = analyzePrototypePropertiesClazz.getDeclaredMethod("getNameInfoForName", string1Type, symbolTypeClazz);
        getNameInfoForNameMethod.setAccessible(true);
        java.lang.Object[] getNameInfoForNameMethodArguments = new java.lang.Object[2];
        getNameInfoForNameMethodArguments[0] = string1;
        getNameInfoForNameMethodArguments[1] = ((Object) null);
        try {
            getNameInfoForNameMethod.invoke(analyzePrototypeProperties, getNameInfoForNameMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields916049552260800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields916049552260800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass916049552266900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916049552260800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916049552266900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getEnumConstantByName(Class<?> enumClass, String name) throws IllegalAccessException {
        java.lang.reflect.Field[] fields = enumClass.getDeclaredFields();
        for (java.lang.reflect.Field field : fields) {
            String fieldName = field.getName();
            if (field.isEnumConstant() && fieldName.equals(name)) {
                field.setAccessible(true);
                
                return field.get(null);
            }
        }
        
        return null;
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields916049553035600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields916049553035600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass916049553038900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields916049553035600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass916049553038900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

