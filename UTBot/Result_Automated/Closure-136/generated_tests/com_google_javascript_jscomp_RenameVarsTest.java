package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.FunctionNode;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.RenameVars.Assignment;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static java.util.Collections.emptyMap;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_RenameVarsTest {
    ///region Test suites for executable com.google.javascript.jscomp.RenameVars.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.RenameVars.process(RenameVars.java:274) */
        renameVars.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        StringBuilder assignmentLog = new StringBuilder("");
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignmentLog", assignmentLog);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.RenameVars.process(RenameVars.java:274) */
        renameVars.process(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.RenameVars.process(RenameVars.java:274) */
        renameVars.process(node, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.RenameVars.process(RenameVars.java:274) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renameVarsClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(renameVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess2() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.process(RenameVars.java:278) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renameVarsClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(renameVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess3() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.RenameVars.process(RenameVars.java:274) */
        renameVars.process(scriptOrFnNode, node);
    }
    
    @Test
    public void testProcess4() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.process(RenameVars.java:278) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renameVarsClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(renameVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess5() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        StringBuilder assignmentLog = new StringBuilder("");
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignmentLog", assignmentLog);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(132);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.RenameVars.process(RenameVars.java:275) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renameVarsClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = ((Object) null);
        try {
            processMethod.invoke(renameVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess6() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.RenameVars.process(RenameVars.java:274) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = renameVarsClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(renameVars, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenameVars.getPseudoName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPseudoName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getPseudoName(java.lang.String)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(char)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.invokes {@link java.lang.StringBuilder#toString()}
 * @utbot.returnsFrom {@code return '$' + s + "$$";}
 *  */
    @Test
    public void testGetPseudoName_StringBuilderToString() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "generatePseudoNames", true);
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Method getPseudoNameMethod = renameVarsClazz.getDeclaredMethod("getPseudoName", stringType);
        getPseudoNameMethod.setAccessible(true);
        java.lang.Object[] getPseudoNameMethodArguments = new java.lang.Object[1];
        getPseudoNameMethodArguments[0] = ((Object) null);
        String actual = ((String) getPseudoNameMethod.invoke(renameVars, getPseudoNameMethodArguments));
        
        String expected = "$null$$";
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPseudoName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getPseudoName(java.lang.String)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(generatePseudoNames);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetPseudoName_ThrowIllegalStateException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Method getPseudoNameMethod = renameVarsClazz.getDeclaredMethod("getPseudoName", stringType);
        getPseudoNameMethod.setAccessible(true);
        java.lang.Object[] getPseudoNameMethodArguments = new java.lang.Object[1];
        getPseudoNameMethodArguments[0] = ((Object) null);
        try {
            getPseudoNameMethod.invoke(renameVars, getPseudoNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenameVars.getNewGlobalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNewGlobalName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewGlobalName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (a.newName != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNewGlobalName_ANewNameEqualsNull() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Object assignments = createInstance("java.util.Collections$UnmodifiableNavigableMap");
        LinkedHashMap m = new LinkedHashMap();
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        m.put(null, assignment);
        setField(assignments, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNewGlobalNameMethod = renameVarsClazz.getDeclaredMethod("getNewGlobalName", stringNodeType);
        getNewGlobalNameMethod.setAccessible(true);
        java.lang.Object[] getNewGlobalNameMethodArguments = new java.lang.Object[1];
        getNewGlobalNameMethodArguments[0] = stringNode;
        String actual = ((String) getNewGlobalNameMethod.invoke(renameVars, getNewGlobalNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewGlobalName(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (a.newName != null): True}
 * @utbot.executesCondition {@code (!a.newName.equals(oldName)): True}
 * @utbot.executesCondition {@code (generatePseudoNames): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return a.newName;}
 *  */
    @Test
    public void testGetNewGlobalName_NotGeneratePseudoNames() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Object assignments = createInstance("java.util.Collections$UnmodifiableSortedMap");
        LinkedHashMap m = new LinkedHashMap();
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        String newName = "";
        assignment.newName = newName;
        m.put(null, assignment);
        setField(assignments, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNewGlobalNameMethod = renameVarsClazz.getDeclaredMethod("getNewGlobalName", stringNodeType);
        getNewGlobalNameMethod.setAccessible(true);
        java.lang.Object[] getNewGlobalNameMethodArguments = new java.lang.Object[1];
        getNewGlobalNameMethodArguments[0] = stringNode;
        String actual = ((String) getNewGlobalNameMethod.invoke(renameVars, getNewGlobalNameMethodArguments));
        
        assertEquals(newName, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNewGlobalName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewGlobalName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Assignment a = assignments.get(oldName);
 *  */
    @Test
    public void testGetNewGlobalName_ThrowClassCastException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Object assignments = createInstance("java.util.Collections$UnmodifiableNavigableMap$EmptyNavigableMap");
        LinkedHashMap m = new LinkedHashMap();
        Object object = createInstance("java.lang.Object");
        m.put(null, object);
        setField(assignments, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewGlobalName] produces [java.lang.ClassCastException: class java.lang.Object cannot be cast to class com.google.javascript.jscomp.RenameVars$Assignment (java.lang.Object is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.RenameVars$Assignment is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.RenameVars.getNewGlobalName(RenameVars.java:327) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNewGlobalNameMethod = renameVarsClazz.getDeclaredMethod("getNewGlobalName", stringNodeType);
        getNewGlobalNameMethod.setAccessible(true);
        java.lang.Object[] getNewGlobalNameMethodArguments = new java.lang.Object[1];
        getNewGlobalNameMethodArguments[0] = stringNode;
        try {
            getNewGlobalNameMethod.invoke(renameVars, getNewGlobalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewGlobalName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String oldName = n.getString();
 *  */
    @Test
    public void testGetNewGlobalName_ThrowNullPointerException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewGlobalName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.getNewGlobalName(RenameVars.java:326) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNewGlobalNameMethod = renameVarsClazz.getDeclaredMethod("getNewGlobalName", nodeType);
        getNewGlobalNameMethod.setAccessible(true);
        java.lang.Object[] getNewGlobalNameMethodArguments = new java.lang.Object[1];
        getNewGlobalNameMethodArguments[0] = ((Object) null);
        try {
            getNewGlobalNameMethod.invoke(renameVars, getNewGlobalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewGlobalName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.SortedMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Assignment a = assignments.get(oldName);
 *  */
    @Test
    public void testGetNewGlobalName_ThrowNullPointerException_1() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewGlobalName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.getNewGlobalName(RenameVars.java:327) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNewGlobalNameMethod = renameVarsClazz.getDeclaredMethod("getNewGlobalName", stringNodeType);
        getNewGlobalNameMethod.setAccessible(true);
        java.lang.Object[] getNewGlobalNameMethodArguments = new java.lang.Object[1];
        getNewGlobalNameMethodArguments[0] = stringNode;
        try {
            getNewGlobalNameMethod.invoke(renameVars, getNewGlobalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewGlobalName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Assignment a = assignments.get(oldName);
 *  */
    @Test
    public void testGetNewGlobalName_ThrowNullPointerException_2() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewGlobalName] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:345)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.google.javascript.jscomp.RenameVars.getNewGlobalName(RenameVars.java:327) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNewGlobalNameMethod = renameVarsClazz.getDeclaredMethod("getNewGlobalName", stringNodeType);
        getNewGlobalNameMethod.setAccessible(true);
        java.lang.Object[] getNewGlobalNameMethodArguments = new java.lang.Object[1];
        getNewGlobalNameMethodArguments[0] = stringNode;
        try {
            getNewGlobalNameMethod.invoke(renameVars, getNewGlobalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewGlobalName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.newName != null && !a.newName.equals(oldName)
 *  */
    @Test
    public void testGetNewGlobalName_ThrowNullPointerException_3() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Object assignments = createInstance("java.util.Collections$UnmodifiableSortedMap");
        LinkedHashMap m = new LinkedHashMap();
        setField(assignments, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewGlobalName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.getNewGlobalName(RenameVars.java:328) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNewGlobalNameMethod = renameVarsClazz.getDeclaredMethod("getNewGlobalName", stringNodeType);
        getNewGlobalNameMethod.setAccessible(true);
        java.lang.Object[] getNewGlobalNameMethodArguments = new java.lang.Object[1];
        getNewGlobalNameMethodArguments[0] = stringNode;
        try {
            getNewGlobalNameMethod.invoke(renameVars, getNewGlobalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNewGlobalName(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewGlobalName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String oldName = n.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetNewGlobalName_ThrowUnsupportedOperationException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNewGlobalNameMethod = renameVarsClazz.getDeclaredMethod("getNewGlobalName", functionNodeType);
        getNewGlobalNameMethod.setAccessible(true);
        java.lang.Object[] getNewGlobalNameMethodArguments = new java.lang.Object[1];
        getNewGlobalNameMethodArguments[0] = functionNode;
        try {
            getNewGlobalNameMethod.invoke(renameVars, getNewGlobalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewGlobalName(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String oldName = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetNewGlobalName_ThrowIllegalStateException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNewGlobalNameMethod = renameVarsClazz.getDeclaredMethod("getNewGlobalName", functionNodeType);
        getNewGlobalNameMethod.setAccessible(true);
        java.lang.Object[] getNewGlobalNameMethodArguments = new java.lang.Object[1];
        getNewGlobalNameMethodArguments[0] = functionNode;
        try {
            getNewGlobalNameMethod.invoke(renameVars, getNewGlobalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getNewGlobalName
    
    public void testGetNewGlobalName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenameVars.getNewLocalName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNewLocalName(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code (!a.newName.equals(oldTempName)): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetNewLocalName_ANewNameEquals() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        String string = "";
        localTempNames.add(string);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(root, "java.util.TreeMap$Entry", "key", string);
        RenameVars.Assignment value = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        value.newName = string;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(assignments, "java.util.TreeMap", "root", root);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = 0;
        String actual = ((String) getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code (!a.newName.equals(oldTempName)): True}
 * @utbot.executesCondition {@code (generatePseudoNames): False}
 * @utbot.returnsFrom {@code return a.newName;}
 *  */
    @Test
    public void testGetNewLocalName_NotGeneratePseudoNames() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        String string = "\u0000";
        localTempNames.add(string);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(root, "java.util.TreeMap$Entry", "key", string);
        RenameVars.Assignment value = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        String newName = "";
        value.newName = newName;
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(assignments, "java.util.TreeMap", "root", root);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = 0;
        String actual = ((String) getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments));
        
        assertEquals(newName, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNewLocalName(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Assignment a = assignments.get(oldTempName);
 *  */
    @Test
    public void testGetNewLocalName_ThrowClassCastException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        String string = "";
        localTempNames.add(string);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        byte[] key = {};
        setField(root, "java.util.TreeMap$Entry", "key", key);
        setField(assignments, "java.util.TreeMap", "root", root);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewLocalName] produces [java.lang.ClassCastException: class [B cannot be cast to class java.lang.String ([B and java.lang.String are in module java.base of loader 'bootstrap')]
            java.base/java.lang.String.compareTo(String.java:140)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:350)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.google.javascript.jscomp.RenameVars.getNewLocalName(RenameVars.java:340) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = 0;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: Assignment a = assignments.get(oldTempName);
 *  */
    @Test
    public void testGetNewLocalName_ThrowClassCastException_1() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        String string = "\u0000";
        localTempNames.add(string);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        Object root = createInstance("java.util.TreeMap$Entry");
        setField(root, "java.util.TreeMap$Entry", "key", string);
        short[] value = {};
        setField(root, "java.util.TreeMap$Entry", "value", value);
        setField(assignments, "java.util.TreeMap", "root", root);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewLocalName] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.jscomp.RenameVars$Assignment ([S is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.RenameVars$Assignment is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.RenameVars.getNewLocalName(RenameVars.java:340) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = 0;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.IndexOutOfBoundsException} in: String oldTempName = localTempNames.get(index);
 *  */
    @Test
    public void testGetNewLocalName_ThrowIndexOutOfBoundsException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        localTempNames.add(null);
        localTempNames.add(null);
        localTempNames.add(null);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewLocalName] produces [java.lang.IndexOutOfBoundsException: Index -1 out of bounds for length 3]
            java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
            java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
            java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:266)
            java.base/java.util.Objects.checkIndex(Objects.java:359)
            java.base/java.util.ArrayList.get(ArrayList.java:427)
            com.google.javascript.jscomp.RenameVars.getNewLocalName(RenameVars.java:339) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = -1;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link java.util.ArrayList#get(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String oldTempName = localTempNames.get(index);
 *  */
    @Test
    public void testGetNewLocalName_ThrowNullPointerException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewLocalName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.getNewLocalName(RenameVars.java:339) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = -255;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link java.util.SortedMap#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Assignment a = assignments.get(oldTempName);
 *  */
    @Test
    public void testGetNewLocalName_ThrowNullPointerException_1() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        localTempNames.add(null);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewLocalName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.getNewLocalName(RenameVars.java:340) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = 0;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Assignment a = assignments.get(oldTempName);
 *  */
    @Test
    public void testGetNewLocalName_ThrowNullPointerException_2() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        localTempNames.add(null);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewLocalName] produces [java.lang.NullPointerException]
            java.base/java.util.Objects.requireNonNull(Objects.java:208)
            java.base/java.util.TreeMap.getEntry(TreeMap.java:345)
            java.base/java.util.TreeMap.get(TreeMap.java:279)
            com.google.javascript.jscomp.RenameVars.getNewLocalName(RenameVars.java:340) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = 0;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !a.newName.equals(oldTempName)
 *  */
    @Test
    public void testGetNewLocalName_ThrowNullPointerException_3() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        localTempNames.add(null);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        Object assignments = createInstance("java.util.Collections$UnmodifiableNavigableMap$EmptyNavigableMap");
        LinkedHashMap m = new LinkedHashMap();
        setField(assignments, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewLocalName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.getNewLocalName(RenameVars.java:341) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = 0;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !a.newName.equals(oldTempName)
 *  */
    @Test
    public void testGetNewLocalName_ThrowNullPointerException_4() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        localTempNames.add(null);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        Object assignments = createInstance("java.util.Collections$UnmodifiableNavigableMap$EmptyNavigableMap");
        LinkedHashMap m = new LinkedHashMap();
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        m.put(null, assignment);
        setField(assignments, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewLocalName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.getNewLocalName(RenameVars.java:341) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = 0;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code (!a.newName.equals(oldTempName)): True}
 * @utbot.executesCondition {@code (generatePseudoNames): True}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getPseudoName(n.getString());
 *  */
    @Test
    public void testGetNewLocalName_ThrowNullPointerException_5() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        localTempNames.add(null);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        Object assignments = createInstance("java.util.Collections$UnmodifiableNavigableMap$EmptyNavigableMap");
        LinkedHashMap m = new LinkedHashMap();
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        String newName = "\u0000";
        assignment.newName = newName;
        m.put(null, assignment);
        setField(assignments, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "generatePseudoNames", true);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.getNewLocalName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.getNewLocalName(RenameVars.java:343) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = ((Object) null);
        getNewLocalNameMethodArguments[1] = 0;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNewLocalName(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return getPseudoName(n.getString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetNewLocalName_ThrowIllegalStateException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        localTempNames.add(null);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        Object assignments = createInstance("java.util.Collections$UnmodifiableNavigableMap$EmptyNavigableMap");
        LinkedHashMap m = new LinkedHashMap();
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        String newName = "";
        assignment.newName = newName;
        m.put(null, assignment);
        setField(assignments, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "generatePseudoNames", true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", scriptOrFnNodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = scriptOrFnNode;
        getNewLocalNameMethodArguments[1] = 0;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getNewLocalName(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return getPseudoName(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetNewLocalName_ThrowUnsupportedOperationException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        ArrayList localTempNames = new ArrayList();
        localTempNames.add(null);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "localTempNames", localTempNames);
        Object assignments = createInstance("java.util.Collections$UnmodifiableNavigableMap$EmptyNavigableMap");
        LinkedHashMap m = new LinkedHashMap();
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        String newName = "";
        assignment.newName = newName;
        m.put(null, assignment);
        setField(assignments, "java.util.Collections$UnmodifiableMap", "m", m);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "generatePseudoNames", true);
        Node node = new Node(0);
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method getNewLocalNameMethod = renameVarsClazz.getDeclaredMethod("getNewLocalName", nodeType, intType);
        getNewLocalNameMethod.setAccessible(true);
        java.lang.Object[] getNewLocalNameMethodArguments = new java.lang.Object[2];
        getNewLocalNameMethodArguments[0] = node;
        getNewLocalNameMethodArguments[1] = 0;
        try {
            getNewLocalNameMethod.invoke(renameVars, getNewLocalNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getNewLocalName
    
    public void testGetNewLocalName_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 2 occurrences of:
        // Failed requirement.
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenameVars.getVariableMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getVariableMap()
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#getVariableMap()}
 * @utbot.returnsFrom {@code return new VariableMap(renameMap);}
 *  */
    @Test
    public void testGetVariableMap_Return() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        LinkedHashMap renameMap = new LinkedHashMap();
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "renameMap", renameMap);
        
        VariableMap actual = renameVars.getVariableMap();
        
        VariableMap expected = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        Map map = new LinkedHashMap();
        setField(expected, "com.google.javascript.jscomp.VariableMap", "map", map);
        
        Map expectedMap = ((Map) getFieldValue(expected, "com.google.javascript.jscomp.VariableMap", "map"));
        Map actualMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.VariableMap", "map"));
        assertTrue(deepEquals(expectedMap, actualMap));
        
        Map actualReverseMap = ((Map) getFieldValue(actual, "com.google.javascript.jscomp.VariableMap", "reverseMap"));
        assertNull(actualReverseMap);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenameVars.assignNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method assignNames(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#assignNames(java.util.Set)}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.invokes {@link java.util.Set#iterator()}
 * @utbot.invokes {@link java.util.List#size()}
 *  */
    @Test
    public void testAssignNames_ListSize() throws Exception  {
        char[] prevNONFIRST_CHAR = NameGenerator.NONFIRST_CHAR;
        char[] prevFIRST_CHAR = NameGenerator.FIRST_CHAR;
        try {
            char[] nonfirstChar = new char[40];
            nonfirstChar[0] = 'a';
            nonfirstChar[1] = 'b';
            nonfirstChar[2] = 'c';
            nonfirstChar[3] = 'd';
            nonfirstChar[4] = 'e';
            nonfirstChar[5] = 'f';
            nonfirstChar[6] = 'g';
            nonfirstChar[7] = 'h';
            nonfirstChar[8] = 'i';
            nonfirstChar[9] = 'j';
            nonfirstChar[10] = 'k';
            nonfirstChar[11] = 'l';
            nonfirstChar[12] = 'm';
            nonfirstChar[13] = 'n';
            nonfirstChar[14] = 'o';
            nonfirstChar[15] = 'p';
            nonfirstChar[16] = 'q';
            nonfirstChar[17] = 'r';
            nonfirstChar[18] = 's';
            nonfirstChar[19] = 't';
            nonfirstChar[20] = 'u';
            nonfirstChar[21] = 'v';
            nonfirstChar[22] = 'w';
            nonfirstChar[23] = 'x';
            nonfirstChar[24] = 'y';
            nonfirstChar[25] = 'z';
            nonfirstChar[26] = 'A';
            nonfirstChar[27] = 'B';
            nonfirstChar[28] = 'C';
            nonfirstChar[29] = 'D';
            nonfirstChar[30] = 'E';
            nonfirstChar[31] = 'F';
            nonfirstChar[32] = 'G';
            nonfirstChar[33] = 'H';
            nonfirstChar[34] = 'I';
            nonfirstChar[35] = 'J';
            nonfirstChar[36] = 'K';
            nonfirstChar[37] = 'L';
            nonfirstChar[38] = 'M';
            nonfirstChar[39] = 'N';
            Class nameGeneratorClazz = Class.forName("com.google.javascript.jscomp.NameGenerator");
            setStaticField(nameGeneratorClazz, "NONFIRST_CHAR", nonfirstChar);
            char[] firstChar = new char[40];
            firstChar[0] = 'a';
            firstChar[1] = 'b';
            firstChar[2] = 'c';
            firstChar[3] = 'd';
            firstChar[4] = 'e';
            firstChar[5] = 'f';
            firstChar[6] = 'g';
            firstChar[7] = 'h';
            firstChar[8] = 'i';
            firstChar[9] = 'j';
            firstChar[10] = 'k';
            firstChar[11] = 'l';
            firstChar[12] = 'm';
            firstChar[13] = 'n';
            firstChar[14] = 'o';
            firstChar[15] = 'p';
            firstChar[16] = 'q';
            firstChar[17] = 'r';
            firstChar[18] = 's';
            firstChar[19] = 't';
            firstChar[20] = 'u';
            firstChar[21] = 'v';
            firstChar[22] = 'w';
            firstChar[23] = 'x';
            firstChar[24] = 'y';
            firstChar[25] = 'z';
            firstChar[26] = 'A';
            firstChar[27] = 'B';
            firstChar[28] = 'C';
            firstChar[29] = 'D';
            firstChar[30] = 'E';
            firstChar[31] = 'F';
            firstChar[32] = 'G';
            firstChar[33] = 'H';
            firstChar[34] = 'I';
            firstChar[35] = 'J';
            firstChar[36] = 'K';
            firstChar[37] = 'L';
            firstChar[38] = 'M';
            firstChar[39] = 'N';
            setStaticField(nameGeneratorClazz, "FIRST_CHAR", firstChar);
            RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
            String prefix = "";
            setField(renameVars, "com.google.javascript.jscomp.RenameVars", "prefix", prefix);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            
            Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
            Class linkedHashSetType = Class.forName("java.util.Set");
            Method assignNamesMethod = renameVarsClazz.getDeclaredMethod("assignNames", linkedHashSetType);
            assignNamesMethod.setAccessible(true);
            java.lang.Object[] assignNamesMethodArguments = new java.lang.Object[1];
            assignNamesMethodArguments[0] = linkedHashSet;
            assignNamesMethod.invoke(renameVars, assignNamesMethodArguments);
            
            Set finalRenameVarsReservedNames = ((Set) getFieldValue(renameVars, "com.google.javascript.jscomp.RenameVars", "reservedNames"));
            
            assertNull(finalRenameVarsReservedNames);
        } finally {
            setStaticField(NameGenerator.class, "NONFIRST_CHAR", prevNONFIRST_CHAR);
            setStaticField(NameGenerator.class, "FIRST_CHAR", prevFIRST_CHAR);
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method assignNames(java.util.Set)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#assignNames(java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NameGenerator globalNameGenerator = new NameGenerator(reservedNames, prefix, reservedCharacters);
 *  */
    @Test
    public void testAssignNames_ThrowNullPointerException_2() throws Throwable  {
        char[] prevNONFIRST_CHAR = NameGenerator.NONFIRST_CHAR;
        char[] prevFIRST_CHAR = NameGenerator.FIRST_CHAR;
        try {
            char[] nonfirstChar = new char[40];
            nonfirstChar[0] = 'a';
            nonfirstChar[1] = 'b';
            nonfirstChar[2] = 'c';
            nonfirstChar[3] = 'd';
            nonfirstChar[4] = 'e';
            nonfirstChar[5] = 'f';
            nonfirstChar[6] = 'g';
            nonfirstChar[7] = 'h';
            nonfirstChar[8] = 'i';
            nonfirstChar[9] = 'j';
            nonfirstChar[10] = 'k';
            nonfirstChar[11] = 'l';
            nonfirstChar[12] = 'm';
            nonfirstChar[13] = 'n';
            nonfirstChar[14] = 'o';
            nonfirstChar[15] = 'p';
            nonfirstChar[16] = 'q';
            nonfirstChar[17] = 'r';
            nonfirstChar[18] = 's';
            nonfirstChar[19] = 't';
            nonfirstChar[20] = 'u';
            nonfirstChar[21] = 'v';
            nonfirstChar[22] = 'w';
            nonfirstChar[23] = 'x';
            nonfirstChar[24] = 'y';
            nonfirstChar[25] = 'z';
            nonfirstChar[26] = 'A';
            nonfirstChar[27] = 'B';
            nonfirstChar[28] = 'C';
            nonfirstChar[29] = 'D';
            nonfirstChar[30] = 'E';
            nonfirstChar[31] = 'F';
            nonfirstChar[32] = 'G';
            nonfirstChar[33] = 'H';
            nonfirstChar[34] = 'I';
            nonfirstChar[35] = 'J';
            nonfirstChar[36] = 'K';
            nonfirstChar[37] = 'L';
            nonfirstChar[38] = 'M';
            nonfirstChar[39] = 'N';
            Class nameGeneratorClazz = Class.forName("com.google.javascript.jscomp.NameGenerator");
            setStaticField(nameGeneratorClazz, "NONFIRST_CHAR", nonfirstChar);
            char[] firstChar = new char[40];
            firstChar[0] = 'a';
            firstChar[1] = 'b';
            firstChar[2] = 'c';
            firstChar[3] = 'd';
            firstChar[4] = 'e';
            firstChar[5] = 'f';
            firstChar[6] = 'g';
            firstChar[7] = 'h';
            firstChar[8] = 'i';
            firstChar[9] = 'j';
            firstChar[10] = 'k';
            firstChar[11] = 'l';
            firstChar[12] = 'm';
            firstChar[13] = 'n';
            firstChar[14] = 'o';
            firstChar[15] = 'p';
            firstChar[16] = 'q';
            firstChar[17] = 'r';
            firstChar[18] = 's';
            firstChar[19] = 't';
            firstChar[20] = 'u';
            firstChar[21] = 'v';
            firstChar[22] = 'w';
            firstChar[23] = 'x';
            firstChar[24] = 'y';
            firstChar[25] = 'z';
            firstChar[26] = 'A';
            firstChar[27] = 'B';
            firstChar[28] = 'C';
            firstChar[29] = 'D';
            firstChar[30] = 'E';
            firstChar[31] = 'F';
            firstChar[32] = 'G';
            firstChar[33] = 'H';
            firstChar[34] = 'I';
            firstChar[35] = 'J';
            firstChar[36] = 'K';
            firstChar[37] = 'L';
            firstChar[38] = 'M';
            firstChar[39] = 'N';
            setStaticField(nameGeneratorClazz, "FIRST_CHAR", firstChar);
            RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
            LinkedHashSet reservedNames = new LinkedHashSet();
            setField(renameVars, "com.google.javascript.jscomp.RenameVars", "reservedNames", reservedNames);
            char[] reservedCharacters = {};
            setField(renameVars, "com.google.javascript.jscomp.RenameVars", "reservedCharacters", reservedCharacters);
            
            /* This test fails because method [com.google.javascript.jscomp.RenameVars.assignNames] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.NameGenerator.checkPrefix(NameGenerator.java:92)
                com.google.javascript.jscomp.NameGenerator.<init>(NameGenerator.java:69)
                com.google.javascript.jscomp.RenameVars.assignNames(RenameVars.java:382) */
            Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
            Class setType = Class.forName("java.util.Set");
            Method assignNamesMethod = renameVarsClazz.getDeclaredMethod("assignNames", setType);
            assignNamesMethod.setAccessible(true);
            java.lang.Object[] assignNamesMethodArguments = new java.lang.Object[1];
            assignNamesMethodArguments[0] = ((Object) null);
            try {
                assignNamesMethod.invoke(renameVars, assignNamesMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameGenerator.class, "NONFIRST_CHAR", prevNONFIRST_CHAR);
            setStaticField(NameGenerator.class, "FIRST_CHAR", prevFIRST_CHAR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#assignNames(java.util.Set)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NameGenerator globalNameGenerator = new NameGenerator(reservedNames, prefix, reservedCharacters);
 *  */
    @Test
    public void testAssignNames_ThrowNullPointerException() throws Throwable  {
        char[] prevNONFIRST_CHAR = NameGenerator.NONFIRST_CHAR;
        char[] prevFIRST_CHAR = NameGenerator.FIRST_CHAR;
        try {
            char[] nonfirstChar = new char[40];
            nonfirstChar[0] = 'a';
            nonfirstChar[1] = 'b';
            nonfirstChar[2] = 'c';
            nonfirstChar[3] = 'd';
            nonfirstChar[4] = 'e';
            nonfirstChar[5] = 'f';
            nonfirstChar[6] = 'g';
            nonfirstChar[7] = 'h';
            nonfirstChar[8] = 'i';
            nonfirstChar[9] = 'j';
            nonfirstChar[10] = 'k';
            nonfirstChar[11] = 'l';
            nonfirstChar[12] = 'm';
            nonfirstChar[13] = 'n';
            nonfirstChar[14] = 'o';
            nonfirstChar[15] = 'p';
            nonfirstChar[16] = 'q';
            nonfirstChar[17] = 'r';
            nonfirstChar[18] = 's';
            nonfirstChar[19] = 't';
            nonfirstChar[20] = 'u';
            nonfirstChar[21] = 'v';
            nonfirstChar[22] = 'w';
            nonfirstChar[23] = 'x';
            nonfirstChar[24] = 'y';
            nonfirstChar[25] = 'z';
            nonfirstChar[26] = 'A';
            nonfirstChar[27] = 'B';
            nonfirstChar[28] = 'C';
            nonfirstChar[29] = 'D';
            nonfirstChar[30] = 'E';
            nonfirstChar[31] = 'F';
            nonfirstChar[32] = 'G';
            nonfirstChar[33] = 'H';
            nonfirstChar[34] = 'I';
            nonfirstChar[35] = 'J';
            nonfirstChar[36] = 'K';
            nonfirstChar[37] = 'L';
            nonfirstChar[38] = 'M';
            nonfirstChar[39] = 'N';
            Class nameGeneratorClazz = Class.forName("com.google.javascript.jscomp.NameGenerator");
            setStaticField(nameGeneratorClazz, "NONFIRST_CHAR", nonfirstChar);
            char[] firstChar = new char[40];
            firstChar[0] = 'a';
            firstChar[1] = 'b';
            firstChar[2] = 'c';
            firstChar[3] = 'd';
            firstChar[4] = 'e';
            firstChar[5] = 'f';
            firstChar[6] = 'g';
            firstChar[7] = 'h';
            firstChar[8] = 'i';
            firstChar[9] = 'j';
            firstChar[10] = 'k';
            firstChar[11] = 'l';
            firstChar[12] = 'm';
            firstChar[13] = 'n';
            firstChar[14] = 'o';
            firstChar[15] = 'p';
            firstChar[16] = 'q';
            firstChar[17] = 'r';
            firstChar[18] = 's';
            firstChar[19] = 't';
            firstChar[20] = 'u';
            firstChar[21] = 'v';
            firstChar[22] = 'w';
            firstChar[23] = 'x';
            firstChar[24] = 'y';
            firstChar[25] = 'z';
            firstChar[26] = 'A';
            firstChar[27] = 'B';
            firstChar[28] = 'C';
            firstChar[29] = 'D';
            firstChar[30] = 'E';
            firstChar[31] = 'F';
            firstChar[32] = 'G';
            firstChar[33] = 'H';
            firstChar[34] = 'I';
            firstChar[35] = 'J';
            firstChar[36] = 'K';
            firstChar[37] = 'L';
            firstChar[38] = 'M';
            firstChar[39] = 'N';
            setStaticField(nameGeneratorClazz, "FIRST_CHAR", firstChar);
            RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
            LinkedHashSet reservedNames = new LinkedHashSet();
            setField(renameVars, "com.google.javascript.jscomp.RenameVars", "reservedNames", reservedNames);
            
            /* This test fails because method [com.google.javascript.jscomp.RenameVars.assignNames] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.NameGenerator.checkPrefix(NameGenerator.java:92)
                com.google.javascript.jscomp.NameGenerator.<init>(NameGenerator.java:69)
                com.google.javascript.jscomp.RenameVars.assignNames(RenameVars.java:382) */
            Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
            Class setType = Class.forName("java.util.Set");
            Method assignNamesMethod = renameVarsClazz.getDeclaredMethod("assignNames", setType);
            assignNamesMethod.setAccessible(true);
            java.lang.Object[] assignNamesMethodArguments = new java.lang.Object[1];
            assignNamesMethodArguments[0] = ((Object) null);
            try {
                assignNamesMethod.invoke(renameVars, assignNamesMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameGenerator.class, "NONFIRST_CHAR", prevNONFIRST_CHAR);
            setStaticField(NameGenerator.class, "FIRST_CHAR", prevFIRST_CHAR);
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#assignNames(java.util.Set)}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Assignment a: varsToRename)
 *  */
    @Test
    public void testAssignNames_ThrowNullPointerException_1() throws Throwable  {
        char[] prevNONFIRST_CHAR = NameGenerator.NONFIRST_CHAR;
        char[] prevFIRST_CHAR = NameGenerator.FIRST_CHAR;
        try {
            char[] nonfirstChar = new char[40];
            nonfirstChar[0] = 'a';
            nonfirstChar[1] = 'b';
            nonfirstChar[2] = 'c';
            nonfirstChar[3] = 'd';
            nonfirstChar[4] = 'e';
            nonfirstChar[5] = 'f';
            nonfirstChar[6] = 'g';
            nonfirstChar[7] = 'h';
            nonfirstChar[8] = 'i';
            nonfirstChar[9] = 'j';
            nonfirstChar[10] = 'k';
            nonfirstChar[11] = 'l';
            nonfirstChar[12] = 'm';
            nonfirstChar[13] = 'n';
            nonfirstChar[14] = 'o';
            nonfirstChar[15] = 'p';
            nonfirstChar[16] = 'q';
            nonfirstChar[17] = 'r';
            nonfirstChar[18] = 's';
            nonfirstChar[19] = 't';
            nonfirstChar[20] = 'u';
            nonfirstChar[21] = 'v';
            nonfirstChar[22] = 'w';
            nonfirstChar[23] = 'x';
            nonfirstChar[24] = 'y';
            nonfirstChar[25] = 'z';
            nonfirstChar[26] = 'A';
            nonfirstChar[27] = 'B';
            nonfirstChar[28] = 'C';
            nonfirstChar[29] = 'D';
            nonfirstChar[30] = 'E';
            nonfirstChar[31] = 'F';
            nonfirstChar[32] = 'G';
            nonfirstChar[33] = 'H';
            nonfirstChar[34] = 'I';
            nonfirstChar[35] = 'J';
            nonfirstChar[36] = 'K';
            nonfirstChar[37] = 'L';
            nonfirstChar[38] = 'M';
            nonfirstChar[39] = 'N';
            Class nameGeneratorClazz = Class.forName("com.google.javascript.jscomp.NameGenerator");
            setStaticField(nameGeneratorClazz, "NONFIRST_CHAR", nonfirstChar);
            char[] firstChar = new char[40];
            firstChar[0] = 'a';
            firstChar[1] = 'b';
            firstChar[2] = 'c';
            firstChar[3] = 'd';
            firstChar[4] = 'e';
            firstChar[5] = 'f';
            firstChar[6] = 'g';
            firstChar[7] = 'h';
            firstChar[8] = 'i';
            firstChar[9] = 'j';
            firstChar[10] = 'k';
            firstChar[11] = 'l';
            firstChar[12] = 'm';
            firstChar[13] = 'n';
            firstChar[14] = 'o';
            firstChar[15] = 'p';
            firstChar[16] = 'q';
            firstChar[17] = 'r';
            firstChar[18] = 's';
            firstChar[19] = 't';
            firstChar[20] = 'u';
            firstChar[21] = 'v';
            firstChar[22] = 'w';
            firstChar[23] = 'x';
            firstChar[24] = 'y';
            firstChar[25] = 'z';
            firstChar[26] = 'A';
            firstChar[27] = 'B';
            firstChar[28] = 'C';
            firstChar[29] = 'D';
            firstChar[30] = 'E';
            firstChar[31] = 'F';
            firstChar[32] = 'G';
            firstChar[33] = 'H';
            firstChar[34] = 'I';
            firstChar[35] = 'J';
            firstChar[36] = 'K';
            firstChar[37] = 'L';
            firstChar[38] = 'M';
            firstChar[39] = 'N';
            setStaticField(nameGeneratorClazz, "FIRST_CHAR", firstChar);
            RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
            String prefix = "";
            setField(renameVars, "com.google.javascript.jscomp.RenameVars", "prefix", prefix);
            
            /* This test fails because method [com.google.javascript.jscomp.RenameVars.assignNames] produces [java.lang.NullPointerException]
                com.google.javascript.jscomp.RenameVars.assignNames(RenameVars.java:394) */
            Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
            Class setType = Class.forName("java.util.Set");
            Method assignNamesMethod = renameVarsClazz.getDeclaredMethod("assignNames", setType);
            assignNamesMethod.setAccessible(true);
            java.lang.Object[] assignNamesMethodArguments = new java.lang.Object[1];
            assignNamesMethodArguments[0] = ((Object) null);
            try {
                assignNamesMethod.invoke(renameVars, assignNamesMethodArguments);
            } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
                throw invocationTargetException.getTargetException();
            }
        } finally {
            setStaticField(NameGenerator.class, "NONFIRST_CHAR", prevNONFIRST_CHAR);
            setStaticField(NameGenerator.class, "FIRST_CHAR", prevFIRST_CHAR);
        }
    }
    ///endregion
    
    ///region FUZZER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method assignNames(java.util.Set)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.RenameVars}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#assignNames(java.util.Set)}
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAssignNamesThrowsIAE() throws Throwable  {
        Map map = emptyMap();
        VariableMap variableMap = new VariableMap(map);
        char[] charArray = {'?', '\u0000', '\u0000'};
        HashSet hashSet = new HashSet();
        hashSet.add("10");
        hashSet.add("abc");
        hashSet.add("#$\\\"'");
        hashSet.add("");
        hashSet.add("L ");
        RenameVars renameVars = new RenameVars(null, "\n\t\r", false, false, true, variableMap, charArray, hashSet);
        HashSet hashSet1 = new HashSet();
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class hashSet1Type = Class.forName("java.util.Set");
        Method assignNamesMethod = renameVarsClazz.getDeclaredMethod("assignNames", hashSet1Type);
        assignNamesMethod.setAccessible(true);
        java.lang.Object[] assignNamesMethodArguments = new java.lang.Object[1];
        assignNamesMethodArguments[0] = hashSet1;
        try {
            assignNamesMethod.invoke(renameVars, assignNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenameVars.okToRenameVar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method okToRenameVar(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#okToRenameVar(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return !compiler.getCodingConvention().isExported(name, isLocal);}
 *  */
    @Test
    public void testOkToRenameVar_ReturnNotCompilerGetCodingConventionIsExported() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options_.setCodingConvention(codingConvention);
        compiler.options_ = options_;
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "compiler", compiler);
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method okToRenameVarMethod = renameVarsClazz.getDeclaredMethod("okToRenameVar", stringType, booleanType);
        okToRenameVarMethod.setAccessible(true);
        java.lang.Object[] okToRenameVarMethodArguments = new java.lang.Object[2];
        okToRenameVarMethodArguments[0] = ((Object) null);
        okToRenameVarMethodArguments[1] = false;
        boolean actual = ((Boolean) okToRenameVarMethod.invoke(renameVars, okToRenameVarMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#okToRenameVar(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return !compiler.getCodingConvention().isExported(name, isLocal);}
 *  */
    @Test
    public void testOkToRenameVar_ReturnNotCompilerGetCodingConventionIsExported_2() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options_.setCodingConvention(codingConvention);
        compiler.options_ = options_;
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "compiler", compiler);
        String string = "";
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method okToRenameVarMethod = renameVarsClazz.getDeclaredMethod("okToRenameVar", stringType, booleanType);
        okToRenameVarMethod.setAccessible(true);
        java.lang.Object[] okToRenameVarMethodArguments = new java.lang.Object[2];
        okToRenameVarMethodArguments[0] = string;
        okToRenameVarMethodArguments[1] = true;
        boolean actual = ((Boolean) okToRenameVarMethod.invoke(renameVars, okToRenameVarMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#okToRenameVar(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return !compiler.getCodingConvention().isExported(name, isLocal);}
 *  */
    @Test
    public void testOkToRenameVar_ReturnNotCompilerGetCodingConventionIsExported_5() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options_.setCodingConvention(codingConvention);
        compiler.options_ = options_;
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "compiler", compiler);
        String string = "$super";
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method okToRenameVarMethod = renameVarsClazz.getDeclaredMethod("okToRenameVar", stringType, booleanType);
        okToRenameVarMethod.setAccessible(true);
        java.lang.Object[] okToRenameVarMethodArguments = new java.lang.Object[2];
        okToRenameVarMethodArguments[0] = string;
        okToRenameVarMethodArguments[1] = true;
        boolean actual = ((Boolean) okToRenameVarMethod.invoke(renameVars, okToRenameVarMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#okToRenameVar(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return !compiler.getCodingConvention().isExported(name, isLocal);}
 *  */
    @Test
    public void testOkToRenameVar_ReturnNotCompilerGetCodingConventionIsExported_1() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options_ = options_;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "compiler", compiler);
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method okToRenameVarMethod = renameVarsClazz.getDeclaredMethod("okToRenameVar", stringType, booleanType);
        okToRenameVarMethod.setAccessible(true);
        java.lang.Object[] okToRenameVarMethodArguments = new java.lang.Object[2];
        okToRenameVarMethodArguments[0] = ((Object) null);
        okToRenameVarMethodArguments[1] = true;
        boolean actual = ((Boolean) okToRenameVarMethod.invoke(renameVars, okToRenameVarMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#okToRenameVar(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return !compiler.getCodingConvention().isExported(name, isLocal);}
 *  */
    @Test
    public void testOkToRenameVar_ReturnNotCompilerGetCodingConventionIsExported_3() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options_ = options_;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "compiler", compiler);
        String string = "";
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method okToRenameVarMethod = renameVarsClazz.getDeclaredMethod("okToRenameVar", stringType, booleanType);
        okToRenameVarMethod.setAccessible(true);
        java.lang.Object[] okToRenameVarMethodArguments = new java.lang.Object[2];
        okToRenameVarMethodArguments[0] = string;
        okToRenameVarMethodArguments[1] = false;
        boolean actual = ((Boolean) okToRenameVarMethod.invoke(renameVars, okToRenameVarMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#okToRenameVar(java.lang.String,boolean)}
 * @utbot.returnsFrom {@code return !compiler.getCodingConvention().isExported(name, isLocal);}
 *  */
    @Test
    public void testOkToRenameVar_ReturnNotCompilerGetCodingConventionIsExported_4() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options_ = options_;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "compiler", compiler);
        String string = "_";
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method okToRenameVarMethod = renameVarsClazz.getDeclaredMethod("okToRenameVar", stringType, booleanType);
        okToRenameVarMethod.setAccessible(true);
        java.lang.Object[] okToRenameVarMethodArguments = new java.lang.Object[2];
        okToRenameVarMethodArguments[0] = string;
        okToRenameVarMethodArguments[1] = false;
        boolean actual = ((Boolean) okToRenameVarMethod.invoke(renameVars, okToRenameVarMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method okToRenameVar(java.lang.String, boolean)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#okToRenameVar(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !compiler.getCodingConvention().isExported(name, isLocal);
 *  */
    @Test
    public void testOkToRenameVar_ThrowNullPointerException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.okToRenameVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.okToRenameVar(RenameVars.java:480) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method okToRenameVarMethod = renameVarsClazz.getDeclaredMethod("okToRenameVar", stringType, booleanType);
        okToRenameVarMethod.setAccessible(true);
        java.lang.Object[] okToRenameVarMethodArguments = new java.lang.Object[2];
        okToRenameVarMethodArguments[0] = ((Object) null);
        okToRenameVarMethodArguments[1] = false;
        try {
            okToRenameVarMethod.invoke(renameVars, okToRenameVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#okToRenameVar(java.lang.String,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#isExported(java.lang.String,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return !compiler.getCodingConvention().isExported(name, isLocal);
 *  */
    @Test
    public void testOkToRenameVar_ThrowNullPointerException_1() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options_ = options_;
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.okToRenameVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.okToRenameVar(RenameVars.java:480) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Method okToRenameVarMethod = renameVarsClazz.getDeclaredMethod("okToRenameVar", stringType, booleanType);
        okToRenameVarMethod.setAccessible(true);
        java.lang.Object[] okToRenameVarMethodArguments = new java.lang.Object[2];
        okToRenameVarMethodArguments[0] = ((Object) null);
        okToRenameVarMethodArguments[1] = false;
        try {
            okToRenameVarMethod.invoke(renameVars, okToRenameVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reusePreviouslyUsedVariableMap()
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#reusePreviouslyUsedVariableMap()}
 * @utbot.invokes {@link java.util.SortedMap#values()}
 * @utbot.invokes {@link java.util.Collection#iterator()}
 *  */
    @Test
    public void testReusePreviouslyUsedVariableMap_CollectionIterator() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        setField(assignments, "java.util.AbstractMap", "values", values);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Method reusePreviouslyUsedVariableMapMethod = renameVarsClazz.getDeclaredMethod("reusePreviouslyUsedVariableMap");
        reusePreviouslyUsedVariableMapMethod.setAccessible(true);
        java.lang.Object[] reusePreviouslyUsedVariableMapMethodArguments = new java.lang.Object[0];
        reusePreviouslyUsedVariableMapMethod.invoke(renameVars, reusePreviouslyUsedVariableMapMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method reusePreviouslyUsedVariableMap()
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#reusePreviouslyUsedVariableMap()}
 * @utbot.iterates iterate the loop {@code for(Assignment a: assignments.values())} once
 * @utbot.throwsException {@link java.lang.ClassCastException} in: for(Assignment a: assignments.values())
 *  */
    @Test
    public void testReusePreviouslyUsedVariableMap_ThrowClassCastException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        HashSet values = new HashSet();
        Integer integer = 0;
        values.add(integer);
        setField(assignments, "java.util.AbstractMap", "values", values);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap] produces [java.lang.ClassCastException: class java.lang.Integer cannot be cast to class com.google.javascript.jscomp.RenameVars$Assignment (java.lang.Integer is in module java.base of loader 'bootstrap'; com.google.javascript.jscomp.RenameVars$Assignment is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @16eb36e1)]
            com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap(RenameVars.java:363) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Method reusePreviouslyUsedVariableMapMethod = renameVarsClazz.getDeclaredMethod("reusePreviouslyUsedVariableMap");
        reusePreviouslyUsedVariableMapMethod.setAccessible(true);
        java.lang.Object[] reusePreviouslyUsedVariableMapMethodArguments = new java.lang.Object[0];
        try {
            reusePreviouslyUsedVariableMapMethod.invoke(renameVars, reusePreviouslyUsedVariableMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#reusePreviouslyUsedVariableMap()}
 * @utbot.invokes {@link java.util.SortedMap#values()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Assignment a: assignments.values())
 *  */
    @Test
    public void testReusePreviouslyUsedVariableMap_ThrowNullPointerException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap(RenameVars.java:363) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Method reusePreviouslyUsedVariableMapMethod = renameVarsClazz.getDeclaredMethod("reusePreviouslyUsedVariableMap");
        reusePreviouslyUsedVariableMapMethod.setAccessible(true);
        java.lang.Object[] reusePreviouslyUsedVariableMapMethodArguments = new java.lang.Object[0];
        try {
            reusePreviouslyUsedVariableMapMethod.invoke(renameVars, reusePreviouslyUsedVariableMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#reusePreviouslyUsedVariableMap()}
 * @utbot.iterates iterate the loop {@code for(Assignment a: assignments.values())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String prevNewName = prevUsedRenameMap.lookupNewName(a.oldName);
 *  */
    @Test
    public void testReusePreviouslyUsedVariableMap_ThrowNullPointerException_1() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        VariableMap prevUsedRenameMap = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "prevUsedRenameMap", prevUsedRenameMap);
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        setField(assignments, "java.util.AbstractMap", "values", values);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap(RenameVars.java:364) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Method reusePreviouslyUsedVariableMapMethod = renameVarsClazz.getDeclaredMethod("reusePreviouslyUsedVariableMap");
        reusePreviouslyUsedVariableMapMethod.setAccessible(true);
        java.lang.Object[] reusePreviouslyUsedVariableMapMethodArguments = new java.lang.Object[0];
        try {
            reusePreviouslyUsedVariableMapMethod.invoke(renameVars, reusePreviouslyUsedVariableMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#reusePreviouslyUsedVariableMap()}
 * @utbot.iterates iterate the loop {@code for(Assignment a: assignments.values())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String prevNewName = prevUsedRenameMap.lookupNewName(a.oldName);
 *  */
    @Test
    public void testReusePreviouslyUsedVariableMap_ThrowNullPointerException_2() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        String oldName = "";
        setField(assignment, "com.google.javascript.jscomp.RenameVars$Assignment", "oldName", oldName);
        values.add(assignment);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        setField(assignments, "java.util.AbstractMap", "values", values);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap(RenameVars.java:364) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Method reusePreviouslyUsedVariableMapMethod = renameVarsClazz.getDeclaredMethod("reusePreviouslyUsedVariableMap");
        reusePreviouslyUsedVariableMapMethod.setAccessible(true);
        java.lang.Object[] reusePreviouslyUsedVariableMapMethodArguments = new java.lang.Object[0];
        try {
            reusePreviouslyUsedVariableMapMethod.invoke(renameVars, reusePreviouslyUsedVariableMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#reusePreviouslyUsedVariableMap()}
 * @utbot.invokes {@link java.lang.String#startsWith(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(Assignment a: assignments.values())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.oldName.startsWith(LOCAL_VAR_PREFIX) || (!externNames.contains(a.oldName) && prevNewName.startsWith(prefix))
 *  */
    @Test
    public void testReusePreviouslyUsedVariableMap_ThrowNullPointerException_4() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        LinkedHashSet reservedNames = new LinkedHashSet();
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "reservedNames", reservedNames);
        VariableMap prevUsedRenameMap = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        setField(prevUsedRenameMap, "com.google.javascript.jscomp.VariableMap", "map", reservedNames);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "prevUsedRenameMap", prevUsedRenameMap);
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        values.add(assignment);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        setField(assignments, "java.util.AbstractMap", "values", values);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap] produces [java.lang.NullPointerException] */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Method reusePreviouslyUsedVariableMapMethod = renameVarsClazz.getDeclaredMethod("reusePreviouslyUsedVariableMap");
        reusePreviouslyUsedVariableMapMethod.setAccessible(true);
        java.lang.Object[] reusePreviouslyUsedVariableMapMethodArguments = new java.lang.Object[0];
        try {
            reusePreviouslyUsedVariableMapMethod.invoke(renameVars, reusePreviouslyUsedVariableMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#reusePreviouslyUsedVariableMap()}
 * @utbot.iterates iterate the loop {@code for(Assignment a: assignments.values())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: prevNewName == null || reservedNames.contains(prevNewName)
 *  */
    @Test
    public void testReusePreviouslyUsedVariableMap_ThrowNullPointerException_3() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        VariableMap prevUsedRenameMap = ((VariableMap) createInstance("com.google.javascript.jscomp.VariableMap"));
        LinkedHashMap map = new LinkedHashMap();
        String string = "";
        map.put(null, string);
        setField(prevUsedRenameMap, "com.google.javascript.jscomp.VariableMap", "map", map);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "prevUsedRenameMap", prevUsedRenameMap);
        TreeMap assignments = ((TreeMap) createInstance("java.util.TreeMap"));
        ArrayList values = new ArrayList();
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        values.add(assignment);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        values.add(null);
        setField(assignments, "java.util.AbstractMap", "values", values);
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignments", assignments);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.reusePreviouslyUsedVariableMap(RenameVars.java:365) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Method reusePreviouslyUsedVariableMapMethod = renameVarsClazz.getDeclaredMethod("reusePreviouslyUsedVariableMap");
        reusePreviouslyUsedVariableMapMethod.setAccessible(true);
        java.lang.Object[] reusePreviouslyUsedVariableMapMethodArguments = new java.lang.Object[0];
        try {
            reusePreviouslyUsedVariableMapMethod.invoke(renameVars, reusePreviouslyUsedVariableMapMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.RenameVars.finalizeNameAssignment
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method finalizeNameAssignment(com.google.javascript.jscomp.RenameVars$Assignment, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#finalizeNameAssignment(com.google.javascript.jscomp.RenameVars.Assignment,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.RenameVars.Assignment#setNewName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: a.setNewName(newName);
 *  */
    @Test
    public void testFinalizeNameAssignment_ThrowNullPointerException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.finalizeNameAssignment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.finalizeNameAssignment(RenameVars.java:459) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.RenameVars$Assignment");
        Class stringType = Class.forName("java.lang.String");
        Method finalizeNameAssignmentMethod = renameVarsClazz.getDeclaredMethod("finalizeNameAssignment", assignmentType, stringType);
        finalizeNameAssignmentMethod.setAccessible(true);
        java.lang.Object[] finalizeNameAssignmentMethodArguments = new java.lang.Object[2];
        finalizeNameAssignmentMethodArguments[0] = ((Object) null);
        finalizeNameAssignmentMethodArguments[1] = ((Object) null);
        try {
            finalizeNameAssignmentMethod.invoke(renameVars, finalizeNameAssignmentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#finalizeNameAssignment(com.google.javascript.jscomp.RenameVars.Assignment,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: renameMap.put(a.oldName, newName);
 *  */
    @Test
    public void testFinalizeNameAssignment_ThrowNullPointerException_1() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.finalizeNameAssignment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.finalizeNameAssignment(RenameVars.java:462) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.RenameVars$Assignment");
        Class stringType = Class.forName("java.lang.String");
        Method finalizeNameAssignmentMethod = renameVarsClazz.getDeclaredMethod("finalizeNameAssignment", assignmentType, stringType);
        finalizeNameAssignmentMethod.setAccessible(true);
        java.lang.Object[] finalizeNameAssignmentMethodArguments = new java.lang.Object[2];
        finalizeNameAssignmentMethodArguments[0] = assignment;
        finalizeNameAssignmentMethodArguments[1] = ((Object) null);
        try {
            finalizeNameAssignmentMethod.invoke(renameVars, finalizeNameAssignmentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#finalizeNameAssignment(com.google.javascript.jscomp.RenameVars.Assignment,java.lang.String)}
 * @utbot.invokes {@link java.util.Map#put(java.lang.Object,java.lang.Object)}
 * @utbot.invokes {@link java.lang.StringBuilder#append(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assignmentLog.append(a.oldName).append(" => ").append(newName).append('\n');
 *  */
    @Test
    public void testFinalizeNameAssignment_ThrowNullPointerException_2() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        LinkedHashMap renameMap = new LinkedHashMap();
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "renameMap", renameMap);
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        String oldName = "";
        setField(assignment, "com.google.javascript.jscomp.RenameVars$Assignment", "oldName", oldName);
        
        /* This test fails because method [com.google.javascript.jscomp.RenameVars.finalizeNameAssignment] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.RenameVars.finalizeNameAssignment(RenameVars.java:465) */
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.RenameVars$Assignment");
        Class stringType = Class.forName("java.lang.String");
        Method finalizeNameAssignmentMethod = renameVarsClazz.getDeclaredMethod("finalizeNameAssignment", assignmentType, stringType);
        finalizeNameAssignmentMethod.setAccessible(true);
        java.lang.Object[] finalizeNameAssignmentMethodArguments = new java.lang.Object[2];
        finalizeNameAssignmentMethodArguments[0] = assignment;
        finalizeNameAssignmentMethodArguments[1] = ((Object) null);
        try {
            finalizeNameAssignmentMethod.invoke(renameVars, finalizeNameAssignmentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method finalizeNameAssignment(com.google.javascript.jscomp.RenameVars$Assignment, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link RenameVars}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.RenameVars#finalizeNameAssignment(com.google.javascript.jscomp.RenameVars.Assignment,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.RenameVars.Assignment#setNewName(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: a.setNewName(newName);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testFinalizeNameAssignment_ThrowIllegalStateException() throws Throwable  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        String newName = "";
        assignment.newName = newName;
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.RenameVars$Assignment");
        Class stringType = Class.forName("java.lang.String");
        Method finalizeNameAssignmentMethod = renameVarsClazz.getDeclaredMethod("finalizeNameAssignment", assignmentType, stringType);
        finalizeNameAssignmentMethod.setAccessible(true);
        java.lang.Object[] finalizeNameAssignmentMethodArguments = new java.lang.Object[2];
        finalizeNameAssignmentMethodArguments[0] = assignment;
        finalizeNameAssignmentMethodArguments[1] = ((Object) null);
        try {
            finalizeNameAssignmentMethod.invoke(renameVars, finalizeNameAssignmentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method finalizeNameAssignment(com.google.javascript.jscomp.RenameVars$Assignment, java.lang.String)
    
    @Test
    public void testFinalizeNameAssignment1() throws Exception  {
        RenameVars renameVars = ((RenameVars) createInstance("com.google.javascript.jscomp.RenameVars"));
        LinkedHashMap renameMap = new LinkedHashMap();
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "renameMap", renameMap);
        StringBuilder assignmentLog = new StringBuilder("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000");
        setField(renameVars, "com.google.javascript.jscomp.RenameVars", "assignmentLog", assignmentLog);
        RenameVars.Assignment assignment = ((RenameVars.Assignment) createInstance("com.google.javascript.jscomp.RenameVars$Assignment"));
        
        Class renameVarsClazz = Class.forName("com.google.javascript.jscomp.RenameVars");
        Class assignmentType = Class.forName("com.google.javascript.jscomp.RenameVars$Assignment");
        Class stringType = Class.forName("java.lang.String");
        Method finalizeNameAssignmentMethod = renameVarsClazz.getDeclaredMethod("finalizeNameAssignment", assignmentType, stringType);
        finalizeNameAssignmentMethod.setAccessible(true);
        java.lang.Object[] finalizeNameAssignmentMethodArguments = new java.lang.Object[2];
        finalizeNameAssignmentMethodArguments[0] = assignment;
        finalizeNameAssignmentMethodArguments[1] = ((Object) null);
        finalizeNameAssignmentMethod.invoke(renameVars, finalizeNameAssignmentMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields909897642596800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields909897642596800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass909897642603700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields909897642596800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass909897642603700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
    }
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields909897642942200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields909897642942200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass909897642946100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields909897642942200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass909897642946100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
    static class FieldsPair {
        final Object o1;
        final Object o2;
    
        public FieldsPair(Object o1, Object o2) {
            this.o1 = o1;
            this.o2 = o2;
        }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            FieldsPair that = (FieldsPair) o;
            return java.util.Objects.equals(o1, that.o1) && java.util.Objects.equals(o2, that.o2);
        }
    
        @Override
        public int hashCode() {
            return java.util.Objects.hash(o1, o2);
        }
    }
    
    private static boolean deepEquals(Object o1, Object o2) {
        return deepEquals(o1, o2, new java.util.HashSet<>());
    }
    
    private static boolean deepEquals(Object o1, Object o2, java.util.Set<FieldsPair> visited) {
        visited.add(new FieldsPair(o1, o2));
    
        if (o1 == o2) {
            return true;
        }
    
        if (o1 == null || o2 == null) {
            return false;
        }
    
        if (o1 instanceof Iterable) {
            if (!(o2 instanceof Iterable)) {
                return false;
            }
    
            return iterablesDeepEquals((Iterable<?>) o1, (Iterable<?>) o2, visited);
        }
        
        if (o2 instanceof Iterable) {
            return false;
        }
        
        if (o1 instanceof java.util.stream.BaseStream) {
            if (!(o2 instanceof java.util.stream.BaseStream)) {
                return false;
            }
    
            return streamsDeepEquals((java.util.stream.BaseStream<?, ?>) o1, (java.util.stream.BaseStream<?, ?>) o2, visited);
        }
    
        if (o2 instanceof java.util.stream.BaseStream) {
            return false;
        }
    
        if (o1 instanceof java.util.Map) {
            if (!(o2 instanceof java.util.Map)) {
                return false;
            }
    
            return mapsDeepEquals((java.util.Map<?, ?>) o1, (java.util.Map<?, ?>) o2, visited);
        }
        
        if (o2 instanceof java.util.Map) {
            return false;
        }
    
        Class<?> firstClass = o1.getClass();
        if (firstClass.isArray()) {
            if (!o2.getClass().isArray()) {
                return false;
            }
    
            // Primitive arrays should not appear here
            return arraysDeepEquals(o1, o2, visited);
        }
    
        // common classes
    
        // check if class has custom equals method (including wrappers and strings)
        // It is very important to check it here but not earlier because iterables and maps also have custom equals 
        // based on elements equals 
        if (hasCustomEquals(firstClass)) {
            return o1.equals(o2);
        }
    
        // common classes without custom equals, use comparison by fields
        final java.util.List<java.lang.reflect.Field> fields = new java.util.ArrayList<>();
        while (firstClass != Object.class) {
            fields.addAll(java.util.Arrays.asList(firstClass.getDeclaredFields()));
            // Interface should not appear here
            firstClass = firstClass.getSuperclass();
        }
    
        for (java.lang.reflect.Field field : fields) {
            field.setAccessible(true);
            try {
                final Object field1 = field.get(o1);
                final Object field2 = field.get(o2);
                if (!visited.contains(new FieldsPair(field1, field2)) && !deepEquals(field1, field2, visited)) {
                    return false;
                }
            } catch (IllegalArgumentException e) {
                return false;
            } catch (IllegalAccessException e) {
                // should never occur because field was set accessible
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean arraysDeepEquals(Object arr1, Object arr2, java.util.Set<FieldsPair> visited) {
        final int length = java.lang.reflect.Array.getLength(arr1);
        if (length != java.lang.reflect.Array.getLength(arr2)) {
            return false;
        }
    
        for (int i = 0; i < length; i++) {
            if (!deepEquals(java.lang.reflect.Array.get(arr1, i), java.lang.reflect.Array.get(arr2, i), visited)) {
                return false;
            }
        }
    
        return true;
    }
    
    private static boolean iterablesDeepEquals(Iterable<?> i1, Iterable<?> i2, java.util.Set<FieldsPair> visited) {
        final java.util.Iterator<?> firstIterator = i1.iterator();
        final java.util.Iterator<?> secondIterator = i2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean streamsDeepEquals(
        java.util.stream.BaseStream<?, ?> s1, 
        java.util.stream.BaseStream<?, ?> s2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<?> firstIterator = s1.iterator();
        final java.util.Iterator<?> secondIterator = s2.iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            if (!deepEquals(firstIterator.next(), secondIterator.next(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean mapsDeepEquals(
        java.util.Map<?, ?> m1, 
        java.util.Map<?, ?> m2, 
        java.util.Set<FieldsPair> visited
    ) {
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> firstIterator = m1.entrySet().iterator();
        final java.util.Iterator<? extends java.util.Map.Entry<?, ?>> secondIterator = m2.entrySet().iterator();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            final java.util.Map.Entry<?, ?> firstEntry = firstIterator.next();
            final java.util.Map.Entry<?, ?> secondEntry = secondIterator.next();
    
            if (!deepEquals(firstEntry.getKey(), secondEntry.getKey(), visited)) {
                return false;
            }
    
            if (!deepEquals(firstEntry.getValue(), secondEntry.getValue(), visited)) {
                return false;
            }
        }
    
        if (firstIterator.hasNext()) {
            return false;
        }
    
        return !secondIterator.hasNext();
    }
    
    private static boolean hasCustomEquals(Class<?> clazz) {
        while (!Object.class.equals(clazz)) {
            try {
                clazz.getDeclaredMethod("equals", Object.class);
                return true;
            } catch (Exception e) { 
                // Interface should not appear here
                clazz = clazz.getSuperclass();
            }
        }
    
        return false;
    }
    
    private static void setStaticField(Class<?> clazz, String fieldName, Object fieldValue) throws NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field field;
    
        try {
        do {
            try {
                field = clazz.getDeclaredField(fieldName);
            } catch (Exception e) {
                clazz = clazz.getSuperclass();
                field = null;
            }
        } while (field == null);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields909897646515800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields909897646515800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass909897646519500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields909897646515800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass909897646519500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(null, fieldValue);
        }
        catch(java.lang.reflect.InvocationTargetException e){
            e.printStackTrace();
        }
        catch(NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

