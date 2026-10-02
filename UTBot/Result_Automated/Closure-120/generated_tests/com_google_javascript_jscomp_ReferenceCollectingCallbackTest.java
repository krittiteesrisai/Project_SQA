package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.lang.reflect.Constructor;
import com.google.javascript.jscomp.Scope.Var;
import java.util.LinkedHashMap;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import java.util.ArrayList;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.Scope.Arguments;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.jscomp.ReferenceCollectingCallback.BasicBlock;
import com.google.javascript.jscomp.InlineVariables.Mode;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.LinkedHashSet;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_ReferenceCollectingCallbackTest {
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-256);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", numberNode);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: blockStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNoSuchElementException() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(119);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
            java.base/java.util.LinkedList.pop(LinkedList.java:805)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:162) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isName()
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:149) */
        referenceCollectingCallback.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(111);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:162) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.pop();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(111);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:162) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getString().equals("arguments")
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:151) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: v = t.getScope().getArgumentsVar();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:154) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: n.getString().equals("arguments")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
    }
    
    @Test
    public void testVisit3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(115);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
    }
    
    @Test
    public void testVisit4() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        blockStack.add(null);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(111);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit5() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:162) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit6() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:634)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:154) */
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
    
    @Test
    public void testVisit7() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:154) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = stringNode1;
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit8() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVar(Scope.java:529)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:154) */
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
    
    @Test
    public void testVisit9() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:640)
            com.google.javascript.jscomp.ReferenceCollectingCallback.visit(ReferenceCollectingCallback.java:154) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = referenceCollectingCallbackClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = stringNode1;
        try {
            visitMethod.invoke(referenceCollectingCallback, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.getScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getScope(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getScope(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return var.scope;}
 *  */
    @Test
    public void testGetScope_ReturnVarScope() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Scope actual = referenceCollectingCallback.getScope(var);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getScope(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getScope(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return var.scope;
 *  */
    @Test
    public void testGetScope_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.getScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.getScope(ReferenceCollectingCallback.java:132) */
        referenceCollectingCallback.getScope(((Scope.Var) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.addReference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addReference(com.google.javascript.jscomp.Scope$Var, com.google.javascript.jscomp.ReferenceCollectingCallback$Reference)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#addReference(com.google.javascript.jscomp.Scope.Var,com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 * @utbot.executesCondition {@code (referenceInfo == null): False}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection#add(com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 *  */
    @Test
    public void testAddReference_ReferenceInfoNotEqualsNull() throws Exception  {
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
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", varType, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[2];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = ((Object) null);
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addReference(com.google.javascript.jscomp.Scope$Var, com.google.javascript.jscomp.ReferenceCollectingCallback$Reference)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#addReference(com.google.javascript.jscomp.Scope.Var,com.google.javascript.jscomp.ReferenceCollectingCallback.Reference)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ReferenceCollection referenceInfo = referenceMap.get(v);
 *  */
    @Test
    public void testAddReference_ThrowNullPointerException() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.addReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.addReference(ReferenceCollectingCallback.java:241) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", varType, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[2];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = ((Object) null);
        try {
            addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method addReference(com.google.javascript.jscomp.Scope$Var, com.google.javascript.jscomp.ReferenceCollectingCallback$Reference)
    
    @Test
    public void testAddReference1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        ReferenceCollectingCallback.Reference reference = ((ReferenceCollectingCallback.Reference) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference"));
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", varType, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[2];
        addReferenceMethodArguments[0] = ((Object) null);
        addReferenceMethodArguments[1] = reference;
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    
    @Test
    public void testAddReference2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(null, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Scope.Arguments arguments = new Scope.Arguments(null);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class argumentsType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", argumentsType, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[2];
        addReferenceMethodArguments[0] = arguments;
        addReferenceMethodArguments[1] = ((Object) null);
        addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method addReference(com.google.javascript.jscomp.Scope$Var, com.google.javascript.jscomp.ReferenceCollectingCallback$Reference)
    
    @Test
    public void testAddReference3() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.addReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:303)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.put(HashMap.java:610)
            com.google.javascript.jscomp.ReferenceCollectingCallback.addReference(ReferenceCollectingCallback.java:244) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[2];
        addReferenceMethodArguments[0] = var;
        addReferenceMethodArguments[1] = ((Object) null);
        try {
            addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testAddReference4() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(null, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.addReference] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:303)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            com.google.javascript.jscomp.ReferenceCollectingCallback.addReference(ReferenceCollectingCallback.java:241) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class referenceType = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback$Reference");
        Method addReferenceMethod = referenceCollectingCallbackClazz.getDeclaredMethod("addReference", varClazz, referenceType);
        addReferenceMethod.setAccessible(true);
        java.lang.Object[] addReferenceMethodArguments = new java.lang.Object[2];
        addReferenceMethodArguments[0] = var;
        addReferenceMethodArguments[1] = ((Object) null);
        try {
            addReferenceMethod.invoke(referenceCollectingCallback, addReferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} when: t.getScope().isGlobal()
 *  */
    @Test
    public void testExitScope_ThrowNoSuchElementException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:181) */
        referenceCollectingCallback.exitScope(null);
    }
    
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
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:181) */
        referenceCollectingCallback.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: t.getScope().isGlobal()
 *  */
    @Test
    public void testExitScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
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
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
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
        TypedScopeCreator scopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(scopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:946)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:950)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:209)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:640)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:182) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.pop();
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:181) */
        referenceCollectingCallback.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.getScope().isGlobal()
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException_1() throws Exception  {
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
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:182) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#isGlobal()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior#afterExitScope(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: behavior.afterExitScope(t, new ReferenceMapWrapper(referenceMap));
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException_2() throws Exception  {
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
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        scopes.add(scope);
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
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:187) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    @Test
    public void testExitScope1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        ReferenceCollectingCallback.BasicBlock basicBlock = ((ReferenceCollectingCallback.BasicBlock) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        blockStack.add(basicBlock);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) basicBlock);
        scopes.add(objectArray);
        scopes.add(objectArray);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(scope);
        scopeRoots.add(objectArray);
        scopeRoots.add(objectArray);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.ClassCastException: class [Ljava.lang.Object; cannot be cast to class com.google.javascript.rhino.Node ([Ljava.lang.Object; is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.Node is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @20d5bdb1)]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:640)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:182) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    
    @Test
    public void testExitScope2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        ReferenceCollectingCallback.BasicBlock basicBlock = ((ReferenceCollectingCallback.BasicBlock) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        blockStack.add(basicBlock);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:182) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    
    @Test
    public void testExitScope3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        ReferenceCollectingCallback.BasicBlock basicBlock = ((ReferenceCollectingCallback.BasicBlock) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        blockStack.add(basicBlock);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Object behavior = createInstance("com.google.javascript.jscomp.VariableReferenceCheck$ReferenceCheckingBehavior");
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "behavior", behavior);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        scopes.add(scope);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) basicBlock);
        scopes.add(objectArray);
        scopes.add(objectArray);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVars(Scope.java:567)
            com.google.javascript.jscomp.VariableReferenceCheck$ReferenceCheckingBehavior.afterExitScope(VariableReferenceCheck.java:93)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:187) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    
    @Test
    public void testExitScope4() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        blockStack.add(null);
        blockStack.add(null);
        ReferenceCollectingCallback.BasicBlock basicBlock = ((ReferenceCollectingCallback.BasicBlock) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        blockStack.add(basicBlock);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        scopeRoots.add(node);
        scopeRoots.add(node);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        scopeRoots.add(stringNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        MemoizedScopeCreator delegate = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "delegate", delegate);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:80)
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:82)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:640)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:182) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    
    @Test
    public void testExitScope5() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        ReferenceCollectingCallback.BasicBlock basicBlock = ((ReferenceCollectingCallback.BasicBlock) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        blockStack.add(basicBlock);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Object behavior = createInstance("com.google.javascript.jscomp.InlineVariables$InliningBehavior");
        InlineVariables this$0 = ((InlineVariables) createInstance("com.google.javascript.jscomp.InlineVariables"));
        InlineVariables.Mode mode = InlineVariables.Mode.ALL;
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "mode", mode);
        setField(behavior, "com.google.javascript.jscomp.InlineVariables$InliningBehavior", "this$0", this$0);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "behavior", behavior);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        scopes.add(scope);
        scopes.add(nodeTraversal);
        scopes.add(nodeTraversal);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope.getVars(Scope.java:567)
            com.google.javascript.jscomp.InlineVariables$InliningBehavior.collectAliasCandidates(InlineVariables.java:170)
            com.google.javascript.jscomp.InlineVariables$InliningBehavior.afterExitScope(InlineVariables.java:159)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:187) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    
    @Test
    public void testExitScope6() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        ReferenceCollectingCallback.BasicBlock basicBlock = ((ReferenceCollectingCallback.BasicBlock) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        blockStack.add(basicBlock);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Object behavior = createInstance("com.google.javascript.jscomp.InlineVariables$InliningBehavior");
        InlineVariables this$0 = ((InlineVariables) createInstance("com.google.javascript.jscomp.InlineVariables"));
        InlineVariables.Mode mode = InlineVariables.Mode.CONSTANTS_ONLY;
        setField(this$0, "com.google.javascript.jscomp.InlineVariables", "mode", mode);
        setField(behavior, "com.google.javascript.jscomp.InlineVariables$InliningBehavior", "this$0", this$0);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "behavior", behavior);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        scopes.add(scope);
        scopes.add(nodeTraversal);
        scopes.add(nodeTraversal);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceMapWrapper.getReferences(ReferenceCollectingCallback.java:264)
            com.google.javascript.jscomp.InlineVariables$InliningBehavior.maybeEscapedOrModifiedArguments(InlineVariables.java:228)
            com.google.javascript.jscomp.InlineVariables$InliningBehavior.doInlinesForScope(InlineVariables.java:197)
            com.google.javascript.jscomp.InlineVariables$InliningBehavior.afterExitScope(InlineVariables.java:160)
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:187) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    
    @Test
    public void testExitScope7() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedList blockStack = new LinkedList();
        ReferenceCollectingCallback.BasicBlock basicBlock = ((ReferenceCollectingCallback.BasicBlock) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$BasicBlock"));
        blockStack.add(basicBlock);
        blockStack.add(null);
        blockStack.add(null);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        java.lang.Object[] objectArray = new java.lang.Object[3];
        objectArray[0] = ((Object) basicBlock);
        scopes.add(objectArray);
        scopes.add(objectArray);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.exitScope(ReferenceCollectingCallback.java:184) */
        referenceCollectingCallback.exitScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isBlockBoundary(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return n.isCase();}
 *  */
    @Test
    public void testIsBlockBoundary_ParentEqualsNull() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", numberNodeType, numberNodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = numberNode;
        isBlockBoundaryMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return n.isCase();}
 *  */
    @Test
    public void testIsBlockBoundary_ParentEqualsNull_1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(111);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", numberNodeType, numberNodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = numberNode;
        isBlockBoundaryMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsBlockBoundary_ReturnTrue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(77);
        
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
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.returnsFrom {@code return n != parent.getFirstChild();}
 *  */
    @Test
    public void testIsBlockBoundary_NEqualsParentGetFirstChild() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(101);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = node;
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
        node.setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isBlockBoundary(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.isCase();
 *  */
    @Test
    public void testIsBlockBoundary_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:236) */
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
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#isBlockBoundary(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.isCase();
 *  */
    @Test
    public void testIsBlockBoundary_ThrowNullPointerException_1() throws Throwable  {
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:236) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isBlockBoundaryMethod = referenceCollectingCallbackClazz.getDeclaredMethod("isBlockBoundary", nodeType, nodeType);
        isBlockBoundaryMethod.setAccessible(true);
        java.lang.Object[] isBlockBoundaryMethodArguments = new java.lang.Object[2];
        isBlockBoundaryMethodArguments[0] = ((Object) null);
        isBlockBoundaryMethodArguments[1] = node;
        try {
            isBlockBoundaryMethod.invoke(null, isBlockBoundaryMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        TypedScopeCreator scopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(scopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:946)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:950)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:209)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:640)
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:171) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testEnterScope_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
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
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes1.put(numberNode, scope);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        TypedScopeCreator delegate = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(delegate, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "delegate", delegate);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:946)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:950)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:209)
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:82)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:640)
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:171) */
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
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:171) */
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
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:171) */
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
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:171) */
        referenceCollectingCallback.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getRootNode()}
 * @utbot.invokes {@link java.util.Deque#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.isEmpty()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_3() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
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
            com.google.javascript.jscomp.ReferenceCollectingCallback.enterScope(ReferenceCollectingCallback.java:172) */
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
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript(ReferenceCollectingCallback.java:119) */
        referenceCollectingCallback.hotSwapScript(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_3() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript(ReferenceCollectingCallback.java:119) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = referenceCollectingCallbackClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(referenceCollectingCallback, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_1() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript(ReferenceCollectingCallback.java:119) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = referenceCollectingCallbackClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(referenceCollectingCallback, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_2() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript(ReferenceCollectingCallback.java:119) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = referenceCollectingCallbackClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(referenceCollectingCallback, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_4() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript(ReferenceCollectingCallback.java:119) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = referenceCollectingCallbackClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(referenceCollectingCallback, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_5() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:494)
            com.google.javascript.jscomp.ReferenceCollectingCallback.hotSwapScript(ReferenceCollectingCallback.java:119) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = referenceCollectingCallbackClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(referenceCollectingCallback, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = referenceCollectingCallbackClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, stringNodeType, stringNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = stringNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) shouldTraverseMethod.invoke(referenceCollectingCallback, shouldTraverseMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = referenceCollectingCallbackClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, nodeType, nodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = ((Object) null);
        shouldTraverseMethodArguments[2] = stringNode;
        boolean actual = ((Boolean) shouldTraverseMethod.invoke(referenceCollectingCallback, shouldTraverseMethodArguments));
        
        assertTrue(actual);
    }
    
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(115);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = referenceCollectingCallbackClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, stringNodeType, stringNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = stringNode;
        shouldTraverseMethodArguments[2] = stringNode1;
        boolean actual = ((Boolean) shouldTraverseMethod.invoke(referenceCollectingCallback, shouldTraverseMethodArguments));
        
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(115);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(114);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = referenceCollectingCallbackClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, stringNodeType, stringNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = stringNode;
        shouldTraverseMethodArguments[2] = stringNode1;
        boolean actual = ((Boolean) shouldTraverseMethod.invoke(referenceCollectingCallback, shouldTraverseMethodArguments));
        
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
    public void testShouldTraverse_ThrowNullPointerException_4() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:236)
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:198) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = referenceCollectingCallbackClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, nodeType, nodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = ((Object) null);
        shouldTraverseMethodArguments[2] = stringNode;
        try {
            shouldTraverseMethod.invoke(referenceCollectingCallback, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isBlockBoundary(n, parent)
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.isBlockBoundary(ReferenceCollectingCallback.java:236)
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:198) */
        referenceCollectingCallback.shouldTraverse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.push(new BasicBlock(blockStack.peek(), n));
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(111);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:199) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = referenceCollectingCallbackClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, stringNodeType, stringNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = stringNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        try {
            shouldTraverseMethod.invoke(referenceCollectingCallback, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.push(new BasicBlock(blockStack.peek(), n));
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_2() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(113);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:199) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = referenceCollectingCallbackClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, nodeType, nodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = ((Object) null);
        shouldTraverseMethodArguments[2] = stringNode;
        try {
            shouldTraverseMethod.invoke(referenceCollectingCallback, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: blockStack.push(new BasicBlock(blockStack.peek(), n));
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_3() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.shouldTraverse(ReferenceCollectingCallback.java:199) */
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = referenceCollectingCallbackClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, nodeType, nodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = ((Object) null);
        shouldTraverseMethodArguments[2] = stringNode;
        try {
            shouldTraverseMethod.invoke(referenceCollectingCallback, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    public void testShouldTraverse_ThrowIllegalStateException() throws Throwable  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        ArrayDeque blockStack = new ArrayDeque();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "blockStack", blockStack);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class referenceCollectingCallbackClazz = Class.forName("com.google.javascript.jscomp.ReferenceCollectingCallback");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = referenceCollectingCallbackClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, stringNodeType, stringNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = stringNode;
        shouldTraverseMethodArguments[2] = stringNode1;
        try {
            shouldTraverseMethod.invoke(referenceCollectingCallback, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.getAllSymbols
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getAllSymbols()
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getAllSymbols()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.returnsFrom {@code return referenceMap.keySet();}
 *  */
    @Test
    public void testGetAllSymbols_MapKeySet() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(arguments, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        
        Set actual = ((Set) referenceCollectingCallback.getAllSymbols());
        
        Set expected = new LinkedHashSet();
        expected.add(arguments);
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getAllSymbols()
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getAllSymbols()}
 * @utbot.invokes {@link java.util.Map#keySet()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return referenceMap.keySet();
 *  */
    @Test
    public void testGetAllSymbols_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.getAllSymbols] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.getAllSymbols(ReferenceCollectingCallback.java:127) */
        referenceCollectingCallback.getAllSymbols();
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ReferenceCollectingCallback.getReferences
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getReferences(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferences(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return referenceMap.get(v);}
 *  */
    @Test
    public void testGetReferences_ReturnReferenceMapGet() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        
        ReferenceCollectingCallback.ReferenceCollection actual = referenceCollectingCallback.getReferences(((Scope.Var) null));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferences(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return referenceMap.get(v);}
 *  */
    @Test
    public void testGetReferences_ReturnReferenceMapGet_1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Node nameNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(var, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Scope.Arguments arguments = new Scope.Arguments(null);
        
        ReferenceCollectingCallback.ReferenceCollection actual = referenceCollectingCallback.getReferences(arguments);
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferences(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return referenceMap.get(v);}
 *  */
    @Test
    public void testGetReferences_ReturnReferenceMapGet_2() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        Scope.Arguments arguments = ((Scope.Arguments) createInstance("com.google.javascript.jscomp.Scope$Arguments"));
        Node nameNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(arguments, "com.google.javascript.jscomp.Scope$Var", "nameNode", nameNode);
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(arguments, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Node node = new Node(0);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = node;
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        ReferenceCollectingCallback.ReferenceCollection actual = referenceCollectingCallback.getReferences(var);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getReferences(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link ReferenceCollectingCallback}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ReferenceCollectingCallback#getReferences(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return referenceMap.get(v);
 *  */
    @Test
    public void testGetReferences_ThrowNullPointerException() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.getReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ReferenceCollectingCallback.getReferences(ReferenceCollectingCallback.java:140) */
        referenceCollectingCallback.getReferences(((Scope.Var) null));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getReferences(com.google.javascript.jscomp.Scope$Var)
    
    @Test
    public void testGetReferences1() throws Exception  {
        ReferenceCollectingCallback referenceCollectingCallback = ((ReferenceCollectingCallback) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback"));
        LinkedHashMap referenceMap = new LinkedHashMap();
        ReferenceCollectingCallback.ReferenceCollection referenceCollection = ((ReferenceCollectingCallback.ReferenceCollection) createInstance("com.google.javascript.jscomp.ReferenceCollectingCallback$ReferenceCollection"));
        referenceMap.put(null, referenceCollection);
        setField(referenceCollectingCallback, "com.google.javascript.jscomp.ReferenceCollectingCallback", "referenceMap", referenceMap);
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = ((Object) null);
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        /* This test fails because method [com.google.javascript.jscomp.ReferenceCollectingCallback.getReferences] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Scope$Var.hashCode(Scope.java:303)
            java.base/java.util.HashMap.hash(HashMap.java:338)
            java.base/java.util.HashMap.getNode(HashMap.java:568)
            java.base/java.util.LinkedHashMap.get(LinkedHashMap.java:441)
            com.google.javascript.jscomp.ReferenceCollectingCallback.getReferences(ReferenceCollectingCallback.java:140) */
        referenceCollectingCallback.getReferences(var);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields905725938331000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields905725938331000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass905725938357100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields905725938331000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass905725938357100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

