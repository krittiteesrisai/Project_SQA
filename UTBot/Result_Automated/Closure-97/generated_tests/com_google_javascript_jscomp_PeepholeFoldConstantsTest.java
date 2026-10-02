package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.FunctionNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_PeepholeFoldConstantsTest {
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldLeftChildAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = functionNode;
        Node actual = ((Node) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = functionNode;
        tryFoldLeftChildAddMethodArguments[2] = functionNode1;
        Node actual = ((Node) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ReturnN_3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(63);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = functionNode;
        Node actual = ((Node) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ReturnN_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(21);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = functionNode;
        tryFoldLeftChildAddMethodArguments[2] = functionNode1;
        Node actual = ((Node) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = functionNode;
        Node actual = ((Node) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_NodeGetType() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(21);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = functionNode;
        tryFoldLeftChildAddMethodArguments[2] = node;
        Node actual = ((Node) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldLeftChildAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd(PeepholeFoldConstants.java:487) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd(PeepholeFoldConstants.java:487) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = node;
        try {
            tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd(PeepholeFoldConstants.java:487) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldLeftChildAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: NodeUtil.isLiteralValue(right) && left.getType() == Token.ADD && left.getChildCount() == 2
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldLeftChildAdd_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldLeftChildAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldLeftChildAdd1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(122);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = numberNode;
        tryFoldLeftChildAddMethodArguments[2] = stringNode;
        Node actual = ((Node) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldLeftChildAdd2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(21);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = stringNode;
        tryFoldLeftChildAddMethodArguments[2] = stringNode1;
        Node actual = ((Node) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldLeftChildAdd3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(21);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = stringNode;
        tryFoldLeftChildAddMethodArguments[2] = stringNode1;
        Node actual = ((Node) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldLeftChildAdd4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(21);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(39);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", functionNodeType, functionNodeType, functionNodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = functionNode;
        tryFoldLeftChildAddMethodArguments[1] = stringNode;
        tryFoldLeftChildAddMethodArguments[2] = stringNode1;
        FunctionNode actual = ((FunctionNode) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int functionNodeSourcePosition = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldLeftChildAdd5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", functionNodeType, functionNodeType, functionNodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = functionNode;
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = stringNode;
        FunctionNode actual = ((FunctionNode) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int functionNodeSourcePosition = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldLeftChildAdd6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(21);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(41);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(29);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", functionNodeType, functionNodeType, functionNodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = functionNode;
        tryFoldLeftChildAddMethodArguments[1] = stringNode;
        tryFoldLeftChildAddMethodArguments[2] = stringNode1;
        FunctionNode actual = ((FunctionNode) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int functionNodeSourcePosition = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldLeftChildAdd7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(47);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", functionNodeType, functionNodeType, functionNodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = functionNode;
        tryFoldLeftChildAddMethodArguments[1] = stringNode;
        tryFoldLeftChildAddMethodArguments[2] = stringNode;
        FunctionNode actual = ((FunctionNode) tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int functionNodeSourcePosition = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldLeftChildAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldLeftChildAdd8() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(43);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd(PeepholeFoldConstants.java:487) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = stringNode;
        try {
            tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildAdd9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(47);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildAdd(PeepholeFoldConstants.java:487) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = stringNode;
        try {
            tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryFoldLeftChildAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryFoldLeftChildAdd10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(21);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(39);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = node;
        tryFoldLeftChildAddMethodArguments[1] = stringNode;
        tryFoldLeftChildAddMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testTryFoldLeftChildAdd11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(21);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(43);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = node;
        tryFoldLeftChildAddMethodArguments[1] = stringNode;
        tryFoldLeftChildAddMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testTryFoldLeftChildAdd12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = stringNode;
        try {
            tryFoldLeftChildAddMethod.invoke(peepholeFoldConstants, tryFoldLeftChildAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldUnaryOperator(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal == TernaryValue.UNKNOWN): False}
 *  */
    @Test
    public void testTryFoldUnaryOperator_LeftValNotEqualsTernaryValueUNKNOWN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(28);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(63);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", nodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = node;
        Node actual = ((Node) tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node nodeLast = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        assertTrue(deepEquals(nodeLast, actualLast));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        Node nodeParent = node.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        int nodeParentType = nodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(nodeParentType, actualParentType);
        
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal == TernaryValue.UNKNOWN): False}
 *  */
    @Test
    public void testTryFoldUnaryOperator_LeftValNotEqualsTernaryValueUNKNOWN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(28);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(41);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", functionNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = functionNode;
        FunctionNode actual = ((FunctionNode) tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node functionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        int functionNodeFirstType = functionNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(functionNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int functionNodeFirstSourcePosition = ((Integer) getFieldValue(functionNodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node functionNodeLast = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        Node functionNodeParent = functionNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        int functionNodeParentType = functionNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(functionNodeParentType, actualParentType);
        
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal == TernaryValue.UNKNOWN): True}
 *  */
    @Test
    public void testTryFoldUnaryOperator_LeftValEqualsTernaryValueUNKNOWN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", functionNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = functionNode;
        FunctionNode actual = ((FunctionNode) tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node functionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        int functionNodeFirstType = functionNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(functionNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int functionNodeFirstSourcePosition = ((Integer) getFieldValue(functionNodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node functionNodeLast = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        assertTrue(deepEquals(functionNodeLast, actualLast));
        
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        Node functionNodeParent = functionNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        assertTrue(deepEquals(functionNodeParent, actualParent));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldUnaryOperator(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldUnaryOperator_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(0);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", nodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = node;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TernaryValue leftVal = NodeUtil.getBooleanValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldUnaryOperator_ThrowIllegalStateException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", scriptOrFnNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: TernaryValue leftVal = NodeUtil.getBooleanValue(left);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldUnaryOperator_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", scriptOrFnNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TernaryValue leftVal = NodeUtil.getBooleanValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldUnaryOperator_ThrowIllegalStateException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(39);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", scriptOrFnNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldUnaryOperator_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", nodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = node;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldUnaryOperator(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasOneChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.hasOneChild());
 *  */
    @Test
    public void testTryFoldUnaryOperator_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:206) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", nodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = ((Object) null);
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldUnaryOperator(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldUnaryOperator1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node$NumberNode", "number", 2.225073859543332E-308);
        (((Node) first)).setType(39);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", stringNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = stringNode;
        Object actual = tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = ((Integer) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node stringNodeLast = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int stringNodeParentEncodedSourceStart = (((ScriptOrFnNode) stringNodeParent)).getEncodedSourceStart();
        int actualParentEncodedSourceStart = (((ScriptOrFnNode) actualParent)).getEncodedSourceStart();
        assertEquals(stringNodeParentEncodedSourceStart, actualParentEncodedSourceStart);
        
        int stringNodeParentEncodedSourceEnd = (((ScriptOrFnNode) stringNodeParent)).getEncodedSourceEnd();
        int actualParentEncodedSourceEnd = (((ScriptOrFnNode) actualParent)).getEncodedSourceEnd();
        assertEquals(stringNodeParentEncodedSourceEnd, actualParentEncodedSourceEnd);
        
        String actualParentSourceName = (((ScriptOrFnNode) actualParent)).getSourceName();
        assertNull(actualParentSourceName);
        
        int stringNodeParentBaseLineno = (((ScriptOrFnNode) stringNodeParent)).getBaseLineno();
        int actualParentBaseLineno = (((ScriptOrFnNode) actualParent)).getBaseLineno();
        assertEquals(stringNodeParentBaseLineno, actualParentBaseLineno);
        
        int stringNodeParentEndLineno = (((ScriptOrFnNode) stringNodeParent)).getEndLineno();
        int actualParentEndLineno = (((ScriptOrFnNode) actualParent)).getEndLineno();
        assertEquals(stringNodeParentEndLineno, actualParentEndLineno);
        
        ObjArray actualParentFunctions = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualParentFunctions);
        
        ObjArray actualParentRegexps = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualParentRegexps);
        
        ObjArray actualParentItsVariables = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualParentItsVariables);
        
        ObjArray actualParentItsConst = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualParentItsConst);
        
        ObjToIntMap actualParentItsVariableNames = ((ObjToIntMap) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualParentItsVariableNames);
        
        int stringNodeParentVarStart = ((Integer) getFieldValue(stringNodeParent, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualParentVarStart = ((Integer) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(stringNodeParentVarStart, actualParentVarStart);
        
        Object actualParentCompilerData = (((ScriptOrFnNode) actualParent)).getCompilerData();
        assertNull(actualParentCompilerData);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        
    }
    
    @Test
    public void testTryFoldUnaryOperator2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) first)).setType(39);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", stringNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = stringNode;
        Object actual = tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double stringNodeFirstNumber = ((Double) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(stringNodeFirstNumber, actualFirstNumber, 1.0E-6);
        
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(stringNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int stringNodeFirstSourcePosition = ((Integer) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node stringNodeLast = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int stringNodeParentEncodedSourceStart = (((ScriptOrFnNode) stringNodeParent)).getEncodedSourceStart();
        int actualParentEncodedSourceStart = (((ScriptOrFnNode) actualParent)).getEncodedSourceStart();
        assertEquals(stringNodeParentEncodedSourceStart, actualParentEncodedSourceStart);
        
        int stringNodeParentEncodedSourceEnd = (((ScriptOrFnNode) stringNodeParent)).getEncodedSourceEnd();
        int actualParentEncodedSourceEnd = (((ScriptOrFnNode) actualParent)).getEncodedSourceEnd();
        assertEquals(stringNodeParentEncodedSourceEnd, actualParentEncodedSourceEnd);
        
        String actualParentSourceName = (((ScriptOrFnNode) actualParent)).getSourceName();
        assertNull(actualParentSourceName);
        
        int stringNodeParentBaseLineno = (((ScriptOrFnNode) stringNodeParent)).getBaseLineno();
        int actualParentBaseLineno = (((ScriptOrFnNode) actualParent)).getBaseLineno();
        assertEquals(stringNodeParentBaseLineno, actualParentBaseLineno);
        
        int stringNodeParentEndLineno = (((ScriptOrFnNode) stringNodeParent)).getEndLineno();
        int actualParentEndLineno = (((ScriptOrFnNode) actualParent)).getEndLineno();
        assertEquals(stringNodeParentEndLineno, actualParentEndLineno);
        
        ObjArray actualParentFunctions = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualParentFunctions);
        
        ObjArray actualParentRegexps = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualParentRegexps);
        
        ObjArray actualParentItsVariables = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualParentItsVariables);
        
        ObjArray actualParentItsConst = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualParentItsConst);
        
        ObjToIntMap actualParentItsVariableNames = ((ObjToIntMap) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualParentItsVariableNames);
        
        int stringNodeParentVarStart = ((Integer) getFieldValue(stringNodeParent, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualParentVarStart = ((Integer) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(stringNodeParentVarStart, actualParentVarStart);
        
        Object actualParentCompilerData = (((ScriptOrFnNode) actualParent)).getCompilerData();
        assertNull(actualParentCompilerData);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldUnaryOperator(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldUnaryOperator3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(27);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node$NumberNode", "number", 2.172923689949E-311);
        (((Node) first)).setType(122);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:52)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:278) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", numberNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(27);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node$NumberNode", "number", 1.0);
        (((Node) first)).setType(122);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:572)
            com.google.javascript.rhino.Node.replaceChild(Node.java:716)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:274) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", nodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = node;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(43);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:572)
            com.google.javascript.rhino.Node.replaceChild(Node.java:716)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:237) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", scriptOrFnNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator6() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(27);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) first)).setType(44);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:52)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:282) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", numberNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(27);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node$NumberNode", "number", 2.849159185112802E154);
        (((Node) first)).setType(44);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:52)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:282) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", nodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = node;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator8() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(27);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(63);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:52)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:288) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", nodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = node;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:572)
            com.google.javascript.rhino.Node.replaceChild(Node.java:716)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:258) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", scriptOrFnNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(27);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(41);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:52)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:288) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", functionNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = functionNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(27);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(43);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:52)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:288) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", scriptOrFnNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(29);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:52)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:264) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", nodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = node;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(26);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(47);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:572)
            com.google.javascript.rhino.Node.replaceChild(Node.java:716)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:237) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", nodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = node;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:572)
            com.google.javascript.rhino.Node.replaceChild(Node.java:716)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:223) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", numberNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldUnaryOperator15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:572)
            com.google.javascript.rhino.Node.replaceChild(Node.java:716)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:223) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", numberNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldBinaryOperator(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldBinaryOperator_ReturnSubtree() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(0);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", nodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = node;
        Node actual = ((Node) tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldBinaryOperator_ReturnSubtree_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", nodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = node;
        Node actual = ((Node) tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldArithmetic(subtree, left, right);}
 *  */
    @Test
    public void testTryFoldBinaryOperator_ReturnTryFoldArithmetic() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(22);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", nodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = node;
        Node actual = ((Node) tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: Token.URSH}
 * @utbot.returnsFrom {@code return tryFoldShift(subtree, left, right);}
 *  */
    @Test
    public void testTryFoldBinaryOperator_PeepholeFoldConstantsTryFoldShift() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(19);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", nodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = node;
        Node actual = ((Node) tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: Token.GETPROP}
 * @utbot.returnsFrom {@code return tryFoldGetProp(subtree, left, right);}
 *  */
    @Test
    public void testTryFoldBinaryOperator_PeepholeFoldConstantsTryFoldGetProp() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", nodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = node;
        Node actual = ((Node) tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: Token.GETELEM}
 * @utbot.returnsFrom {@code return tryFoldGetElem(subtree, left, right);}
 *  */
    @Test
    public void testTryFoldBinaryOperator_PeepholeFoldConstantsTryFoldGetElem() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(35);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", nodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = node;
        Node actual = ((Node) tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldArithmetic(subtree, left, right);}
 *  */
    @Test
    public void testTryFoldBinaryOperator_ReturnTryFoldArithmetic_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(22);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(39);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", nodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = node;
        Node actual = ((Node) tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: default}
 *  */
    @Test
    public void testTryFoldBinaryOperator_ReturnSubtree_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(47);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", scriptOrFnNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node scriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        int scriptOrFnNodeFirstType = scriptOrFnNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(scriptOrFnNodeFirstType, actualFirstType);
        
        Node scriptOrFnNodeFirstNext = scriptOrFnNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int scriptOrFnNodeFirstNextSourcePosition = ((Integer) getFieldValue(scriptOrFnNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldBinaryOperator(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = subtree.getFirstChild();
 *  */
    @Test
    public void testTryFoldBinaryOperator_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator(PeepholeFoldConstants.java:89) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", nodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = ((Object) null);
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldBinaryOperator(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldBinaryOperator1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        int numberNodeFirstNextEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirstNext)).getEncodedSourceStart();
        int actualFirstNextEncodedSourceStart = (((ScriptOrFnNode) actualFirstNext)).getEncodedSourceStart();
        assertEquals(numberNodeFirstNextEncodedSourceStart, actualFirstNextEncodedSourceStart);
        
        int numberNodeFirstNextEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirstNext)).getEncodedSourceEnd();
        int actualFirstNextEncodedSourceEnd = (((ScriptOrFnNode) actualFirstNext)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstNextEncodedSourceEnd, actualFirstNextEncodedSourceEnd);
        
        String actualFirstNextSourceName = (((ScriptOrFnNode) actualFirstNext)).getSourceName();
        assertNull(actualFirstNextSourceName);
        
        int numberNodeFirstNextBaseLineno = (((ScriptOrFnNode) numberNodeFirstNext)).getBaseLineno();
        int actualFirstNextBaseLineno = (((ScriptOrFnNode) actualFirstNext)).getBaseLineno();
        assertEquals(numberNodeFirstNextBaseLineno, actualFirstNextBaseLineno);
        
        int numberNodeFirstNextEndLineno = (((ScriptOrFnNode) numberNodeFirstNext)).getEndLineno();
        int actualFirstNextEndLineno = (((ScriptOrFnNode) actualFirstNext)).getEndLineno();
        assertEquals(numberNodeFirstNextEndLineno, actualFirstNextEndLineno);
        
        ObjArray actualFirstNextFunctions = ((ObjArray) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstNextFunctions);
        
        ObjArray actualFirstNextRegexps = ((ObjArray) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstNextRegexps);
        
        ObjArray actualFirstNextItsVariables = ((ObjArray) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstNextItsVariables);
        
        ObjArray actualFirstNextItsConst = ((ObjArray) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstNextItsConst);
        
        ObjToIntMap actualFirstNextItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstNextItsVariableNames);
        
        int numberNodeFirstNextVarStart = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstNextVarStart = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstNextVarStart, actualFirstNextVarStart);
        
        Object actualFirstNextCompilerData = (((ScriptOrFnNode) actualFirstNext)).getCompilerData();
        assertNull(actualFirstNextCompilerData);
        
        int numberNodeFirstNextType = numberNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(numberNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(19);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(39);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        int numberNodeFirstNextType = numberNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(numberNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(45);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(44);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        int numberNodeFirstNextType = numberNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(numberNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(16);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(63);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        int numberNodeFirstNextType = numberNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(numberNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator8() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(63);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        int numberNodeFirstNextType = numberNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(numberNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator9() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(9);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator10() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator11() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", scriptOrFnNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node scriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        int scriptOrFnNodeFirstType = scriptOrFnNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(scriptOrFnNodeFirstType, actualFirstType);
        
        Node scriptOrFnNodeFirstNext = scriptOrFnNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        Node scriptOrFnNodeFirstNextFirst = ((Node) getFieldValue(scriptOrFnNodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int scriptOrFnNodeFirstNextFirstSourcePosition = ((Integer) getFieldValue(scriptOrFnNodeFirstNextFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextFirstSourcePosition = ((Integer) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    
    @Test
    public void testTryFoldBinaryOperator12() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(14);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node numberNodeFirst = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstEncodedSourceStart = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(numberNodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int numberNodeFirstEncodedSourceEnd = (((ScriptOrFnNode) numberNodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(numberNodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int numberNodeFirstBaseLineno = (((ScriptOrFnNode) numberNodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(numberNodeFirstBaseLineno, actualFirstBaseLineno);
        
        int numberNodeFirstEndLineno = (((ScriptOrFnNode) numberNodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(numberNodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int numberNodeFirstVarStart = ((Integer) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(numberNodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        int numberNodeFirstNextType = numberNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(numberNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = ((Integer) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(numberNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node numberNodeFirstFirst = ((Node) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldBinaryOperator(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldBinaryOperator13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(17);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(29);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:179)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:188)
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:223)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:720)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator(PeepholeFoldConstants.java:144) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldBinaryOperator14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(100);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(43);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:463)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator(PeepholeFoldConstants.java:114) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", scriptOrFnNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldBinaryOperator15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(100);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(47);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:463)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator(PeepholeFoldConstants.java:114) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", scriptOrFnNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldBinaryOperator16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(44);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:463)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator(PeepholeFoldConstants.java:114) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", functionNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = functionNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldBinaryOperator17() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(40);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:463)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator(PeepholeFoldConstants.java:114) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldBinaryOperator(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBinaryOperator18() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(18);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) first)).setType(39);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBinaryOperator19() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(18);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(39);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldBinaryOperator20() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(45);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBinaryOperator21() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(22);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(39);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBinaryOperator22() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBinaryOperator23() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldBinaryOperator24() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBinaryOperator25() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(39);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", numberNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = numberNode;
        try {
            tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldStringIndexOf(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): True}
 *  */
    @Test
    public void testTryFoldStringIndexOf_LeftEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(37);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(37);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): True}
 *  */
    @Test
    public void testTryFoldStringIndexOf_RightEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (lstringNode.getType() != Token.STRING): True}
 *  */
    @Test
    public void testTryFoldStringIndexOf_LstringNodeGetTypeNotEqualsTokenSTRING() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(44);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", functionNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = functionNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node functionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        int functionNodeFirstType = functionNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(functionNodeFirstType, actualFirstType);
        
        Node functionNodeFirstNext = functionNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        int functionNodeFirstNextType = functionNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(functionNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int functionNodeFirstNextSourcePosition = ((Integer) getFieldValue(functionNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node functionNodeFirstFirst = ((Node) getFieldValue(functionNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        int functionNodeFirstFirstType = functionNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(functionNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (lstringNode.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code ((!functionName.getString().equals("indexOf") && !functionName.getString().equals("lastIndexOf"))): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getStringValue(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldStringIndexOf_NotFunctionNameGetStringEqualsAndNotFunctionNameGetStringEquals() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(43);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", functionNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = functionNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node functionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        int functionNodeFirstType = functionNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(functionNodeFirstType, actualFirstType);
        
        Node functionNodeFirstNext = functionNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        int functionNodeFirstNextType = functionNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(functionNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int functionNodeFirstNextSourcePosition = ((Integer) getFieldValue(functionNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node functionNodeFirstFirst = ((Node) getFieldValue(functionNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        int functionNodeFirstFirstType = functionNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(functionNodeFirstFirstType, actualFirstFirstType);
        
        Node functionNodeFirstFirstNext = functionNodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        String functionNodeFirstFirstNextStr = ((String) getFieldValue(functionNodeFirstFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstFirstNextStr = ((String) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(functionNodeFirstFirstNextStr, actualFirstFirstNextStr);
        
        int functionNodeFirstFirstNextType = functionNodeFirstFirstNext.getType();
        int actualFirstFirstNextType = actualFirstFirstNext.getType();
        assertEquals(functionNodeFirstFirstNextType, actualFirstFirstNextType);
        
        assertTrue(deepEquals(functionNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(functionNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(functionNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(functionNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(functionNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(functionNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(functionNodeFirstFirstNext, actualFirstFirstNext));
        
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldStringIndexOf(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (left == null): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getNext()} once
    /// execute conditions:
    ///     {@code (right == null): False}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#isGetProp(com.google.javascript.rhino.Node)} once
    /// return from: {@code return n;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): False}
 *  */
    @Test
    public void testTryFoldStringIndexOf_NodeUtilIsGetProp() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 *  */
    @Test
    public void testTryFoldStringIndexOf_NotNodeUtilIsImmutableValue_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstNextStr);
        
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 *  */
    @Test
    public void testTryFoldStringIndexOf_NotNodeUtilIsImmutableValue() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 *  */
    @Test
    public void testTryFoldStringIndexOf_NotNodeUtilIsImmutableValue_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(29);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", functionNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = functionNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node functionNodeFirst = ((Node) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        int functionNodeFirstType = functionNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(functionNodeFirstType, actualFirstType);
        
        Node functionNodeFirstNext = functionNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        int functionNodeFirstNextType = functionNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(functionNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        Node functionNodeFirstNextFirst = ((Node) getFieldValue(functionNodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        int functionNodeFirstNextFirstType = functionNodeFirstNextFirst.getType();
        int actualFirstNextFirstType = actualFirstNextFirst.getType();
        assertEquals(functionNodeFirstNextFirstType, actualFirstNextFirstType);
        
        assertTrue(deepEquals(functionNodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstFirst = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirstFirst);
        
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int functionNodeFirstNextFirstSourcePosition = ((Integer) getFieldValue(functionNodeFirstNextFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextFirstSourcePosition = ((Integer) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(functionNodeFirstNext, actualFirstNext));
        
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        assertTrue(deepEquals(functionNodeFirst, actualFirst));
        
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
        assertTrue(deepEquals(functionNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringIndexOf(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringIndexOf_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = node;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isGetProp(left) || !NodeUtil.isImmutableValue(right)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringIndexOf_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = node;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (lstringNode.getType() != Token.STRING): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: (!functionName.getString().equals("indexOf") && !functionName.getString().equals("lastIndexOf"))
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringIndexOf_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(44);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", functionNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = functionNode;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringIndexOf(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringIndexOf(PeepholeFoldConstants.java:943) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = ((Object) null);
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node functionName = lstringNode.getNext();
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringIndexOf(PeepholeFoldConstants.java:962) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = node;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (lstringNode.getType() != Token.STRING): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (!functionName.getString().equals("indexOf") && !functionName.getString().equals("lastIndexOf"))
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(44);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringIndexOf(PeepholeFoldConstants.java:965) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", functionNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = functionNode;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringIndexOf(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (lstringNode.getType() != Token.STRING): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (!functionName.getString().equals("indexOf") && !functionName.getString().equals("lastIndexOf"))
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(44);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringIndexOf(PeepholeFoldConstants.java:965) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", functionNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[1];
        tryFoldStringIndexOfMethodArguments[0] = functionNode;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeFoldConstants, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldKnownMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldKnownMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(0);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_8() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(37);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(37);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstNextStr);
        
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(44);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(63);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", scriptOrFnNodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node scriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        int scriptOrFnNodeFirstType = scriptOrFnNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(scriptOrFnNodeFirstType, actualFirstType);
        
        Node scriptOrFnNodeFirstNext = scriptOrFnNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        int scriptOrFnNodeFirstNextType = scriptOrFnNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(scriptOrFnNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int scriptOrFnNodeFirstNextSourcePosition = ((Integer) getFieldValue(scriptOrFnNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node scriptOrFnNodeFirstFirst = ((Node) getFieldValue(scriptOrFnNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        int scriptOrFnNodeFirstFirstType = scriptOrFnNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(scriptOrFnNodeFirstFirstType, actualFirstFirstType);
        
        Node scriptOrFnNodeFirstFirstNext = scriptOrFnNodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        String scriptOrFnNodeFirstFirstNextStr = ((String) getFieldValue(scriptOrFnNodeFirstFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstFirstNextStr = ((String) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(scriptOrFnNodeFirstFirstNextStr, actualFirstFirstNextStr);
        
        assertTrue(deepEquals(scriptOrFnNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirstNext, actualFirstFirstNext));
        
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirstFirst, actualFirstFirst));
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldKnownMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subtree = tryFoldStringJoin(subtree);
 *  */
    @Test
    public void testTryFoldKnownMethods_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldKnownMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin(PeepholeFoldConstants.java:1003)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldKnownMethods(PeepholeFoldConstants.java:928) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = ((Object) null);
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subtree = tryFoldStringJoin(subtree);
 *  */
    @Test
    public void testTryFoldKnownMethods_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldKnownMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin(PeepholeFoldConstants.java:1023)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldKnownMethods(PeepholeFoldConstants.java:928) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", scriptOrFnNodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subtree = tryFoldStringJoin(subtree);
 *  */
    @Test
    public void testTryFoldKnownMethods_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(29);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(122);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldKnownMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin(PeepholeFoldConstants.java:1020)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldKnownMethods(PeepholeFoldConstants.java:928) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", scriptOrFnNodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subtree = tryFoldStringJoin(subtree);
 *  */
    @Test
    public void testTryFoldKnownMethods_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(122);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(63);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldKnownMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin(PeepholeFoldConstants.java:1023)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldKnownMethods(PeepholeFoldConstants.java:928) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldKnownMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldKnownMethods_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(29);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(38);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: subtree = tryFoldStringJoin(subtree);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldKnownMethods_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(122);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(63);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next1.setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldKnownMethods", functionNodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = functionNode;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeFoldConstants, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInstanceof(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(left)): False}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldInstanceof_NotNodeUtilIsLiteralValue() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(52);
        Node node = new Node(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = scriptOrFnNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInstanceof(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.mayHaveSideEffects(right)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldInstanceof_NodeUtilMayHaveSideEffects() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(52);
        Node node = new Node(64);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = scriptOrFnNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInstanceof(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.INSTANCEOF);): True}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(left)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !NodeUtil.mayHaveSideEffects(right)
 *  */
    @Test
    public void testTryFoldInstanceof_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(52);
        Node node = new Node(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:368)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:355)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:351)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:306) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = scriptOrFnNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = ((Object) null);
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInstanceof(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.INSTANCEOF);
 *  */
    @Test
    public void testTryFoldInstanceof_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:301) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", nodeType, nodeType, nodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = ((Object) null);
        tryFoldInstanceofMethodArguments[1] = ((Object) null);
        tryFoldInstanceofMethodArguments[2] = ((Object) null);
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInstanceof(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.INSTANCEOF);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.INSTANCEOF);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldInstanceof_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = scriptOrFnNode;
        tryFoldInstanceofMethodArguments[1] = ((Object) null);
        tryFoldInstanceofMethodArguments[2] = ((Object) null);
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldTypeof(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return originalTypeofNode;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): True}
 *  */
    @Test
    public void testTryFoldTypeof_ArgumentNodeEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(32);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        Node actual = ((Node) tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(32);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode)): True}
 *  */
    @Test
    public void testTryFoldTypeof_NotNodeUtilIsLiteralValue() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(29);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        Node actual = ((Node) tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int nodeFirstFirstSourcePosition = ((Integer) getFieldValue(nodeFirstFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstFirstSourcePosition = ((Integer) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode)): True}
 *  */
    @Test
    public void testTryFoldTypeof_NotNodeUtilIsLiteralValue_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(63);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        Node actual = ((Node) tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int nodeFirstFirstSourcePosition = ((Integer) getFieldValue(nodeFirstFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstFirstSourcePosition = ((Integer) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldTypeof(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (argumentNode == null): False}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)} once
    /// execute conditions:
    ///     {@code (!NodeUtil.isLiteralValue(argumentNode)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// activate {@code switch(argumentNode.getType()) case: default}, execute conditions:
    ///     {@code (typeNameString != null): False}
    /// return from: {@code return originalTypeofNode;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldTypeof_ReturnOriginalTypeofNode() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(47);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        Node actual = ((Node) tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldTypeof_ReturnOriginalTypeofNode_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(29);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(41);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        Node actual = ((Node) tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int nodeFirstFirstSourcePosition = ((Integer) getFieldValue(nodeFirstFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstFirstSourcePosition = ((Integer) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldTypeof_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);): True}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: argumentNode == null || !NodeUtil.isLiteralValue(argumentNode)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldTypeof_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:157) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = ((Object) null);
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);): True}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(43);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:196) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);): True}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(39);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:196) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);): True}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:196) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);): True}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(122);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:196) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);): True}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:196) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", nodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = node;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method optimizeSubtree(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once,
    ///     com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node) once
    /// return from: {@code return tryFoldBinaryOperator(subtree);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldBinaryOperator(subtree);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTryFoldBinaryOperator() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(31);
        
        Node actual = peepholeFoldConstants.optimizeSubtree(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(31);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: default}
 * @utbot.returnsFrom {@code return tryFoldBinaryOperator(subtree);}
 *  */
    @Test
    public void testOptimizeSubtree_SwitchSubtreeGetTypeCasedefault_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(18);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Node actual = peepholeFoldConstants.optimizeSubtree(node);
        
        int nodeType = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldBinaryOperator(subtree);}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnTryFoldBinaryOperator_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(31);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        ScriptOrFnNode actual = ((ScriptOrFnNode) peepholeFoldConstants.optimizeSubtree(scriptOrFnNode));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node scriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        int scriptOrFnNodeFirstType = scriptOrFnNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(scriptOrFnNodeFirstType, actualFirstType);
        
        Node scriptOrFnNodeFirstNext = scriptOrFnNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(scriptOrFnNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int scriptOrFnNodeFirstNextSourcePosition = ((Integer) getFieldValue(scriptOrFnNodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: default}
 * @utbot.returnsFrom {@code return tryFoldBinaryOperator(subtree);}
 *  */
    @Test
    public void testOptimizeSubtree_SwitchSubtreeGetTypeCasedefault() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(28);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        ScriptOrFnNode actual = ((ScriptOrFnNode) peepholeFoldConstants.optimizeSubtree(scriptOrFnNode));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node scriptOrFnNodeFirst = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        int scriptOrFnNodeFirstType = scriptOrFnNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(scriptOrFnNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int scriptOrFnNodeFirstSourcePosition = ((Integer) getFieldValue(scriptOrFnNodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: Token.TYPEOF}
 * @utbot.returnsFrom {@code return tryFoldTypeof(subtree);}
 *  */
    @Test
    public void testOptimizeSubtree_PeepholeFoldConstantsTryFoldTypeof() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(32);
        
        Node actual = peepholeFoldConstants.optimizeSubtree(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(32);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(subtree.getType())
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException() {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree(PeepholeFoldConstants.java:71) */
        peepholeFoldConstants.optimizeSubtree(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: Token.BITNOT}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return tryFoldUnaryOperator(subtree);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOptimizeSubtree_ThrowIllegalStateException() {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(26);
        
        peepholeFoldConstants.optimizeSubtree(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: Token.BITNOT}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return tryFoldUnaryOperator(subtree);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOptimizeSubtree_ThrowIllegalStateException_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(29);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        peepholeFoldConstants.optimizeSubtree(functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!right.hasChildren()): True}
 * @utbot.executesCondition {@code (right.getFirstChild().getNext() != right.getLastChild()): True}
 *  */
    @Test
    public void testTryFoldAssign_RightGetFirstChildGetNextNotEqualsRightGetLastChild() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(86);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", nodeType, nodeType, nodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = node;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = functionNode;
        Node actual = ((Node) tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(86);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!right.hasChildren()): False}
 *  */
    @Test
    public void testTryFoldAssign_RightHasChildren() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = scriptOrFnNode;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!right.hasChildren()): True}
 * @utbot.executesCondition {@code (right.getFirstChild().getNext() != right.getLastChild()): False}
 * @utbot.executesCondition {@code (NodeUtil.mayHaveSideEffects(left)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldAssign_NodeUtilMayHaveSideEffects() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Node node = new Node(49);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = scriptOrFnNode;
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.ASSIGN);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !right.hasChildren() || right.getFirstChild().getNext() != right.getLastChild()
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:332) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = scriptOrFnNode;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = ((Object) null);
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.ASSIGN);
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:329) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", nodeType, nodeType, nodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = ((Object) null);
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = ((Object) null);
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.ASSIGN);): True}
 * @utbot.executesCondition {@code (!right.hasChildren()): True}
 * @utbot.executesCondition {@code (right.getFirstChild().getNext() != right.getLastChild()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: NodeUtil.mayHaveSideEffects(left)
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:368)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:355)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:351)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:338) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = scriptOrFnNode;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = functionNode;
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.ASSIGN);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.ASSIGN);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldAssign_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = scriptOrFnNode;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = ((Object) null);
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstant
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAddConstant(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstant(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldArithmetic(n, left, right);}
 *  */
    @Test
    public void testTryFoldAddConstant_ReturnTryFoldArithmetic() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstant", nodeType, nodeType, nodeType);
        tryFoldAddConstantMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantMethodArguments[0] = ((Object) null);
        tryFoldAddConstantMethodArguments[1] = functionNode;
        tryFoldAddConstantMethodArguments[2] = functionNode;
        Node actual = ((Node) tryFoldAddConstantMethod.invoke(peepholeFoldConstants, tryFoldAddConstantMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstant(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldArithmetic(n, left, right);}
 *  */
    @Test
    public void testTryFoldAddConstant_ReturnTryFoldArithmetic_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstant", nodeType, nodeType, nodeType);
        tryFoldAddConstantMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantMethodArguments[0] = ((Object) null);
        tryFoldAddConstantMethodArguments[1] = functionNode;
        tryFoldAddConstantMethodArguments[2] = functionNode1;
        Node actual = ((Node) tryFoldAddConstantMethod.invoke(peepholeFoldConstants, tryFoldAddConstantMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAddConstant(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstant(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.STRING): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.STRING
 *  */
    @Test
    public void testTryFoldAddConstant_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstant] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstant(PeepholeFoldConstants.java:519) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstant", nodeType, nodeType, nodeType);
        tryFoldAddConstantMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantMethodArguments[0] = ((Object) null);
        tryFoldAddConstantMethodArguments[1] = functionNode;
        tryFoldAddConstantMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddConstantMethod.invoke(peepholeFoldConstants, tryFoldAddConstantMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstant(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.STRING || right.getType() == Token.STRING
 *  */
    @Test
    public void testTryFoldAddConstant_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstant] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstant(PeepholeFoldConstants.java:518) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstant", nodeType, nodeType, nodeType);
        tryFoldAddConstantMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantMethodArguments[0] = ((Object) null);
        tryFoldAddConstantMethodArguments[1] = ((Object) null);
        tryFoldAddConstantMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddConstantMethod.invoke(peepholeFoldConstants, tryFoldAddConstantMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAddConstant(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstant(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.STRING): False}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAddConstant_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstant", nodeType, nodeType, nodeType);
        tryFoldAddConstantMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantMethodArguments[0] = ((Object) null);
        tryFoldAddConstantMethodArguments[1] = functionNode;
        tryFoldAddConstantMethodArguments[2] = functionNode1;
        try {
            tryFoldAddConstantMethod.invoke(peepholeFoldConstants, tryFoldAddConstantMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstant(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAddConstant_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstant", nodeType, nodeType, nodeType);
        tryFoldAddConstantMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantMethodArguments[0] = ((Object) null);
        tryFoldAddConstantMethodArguments[1] = functionNode;
        tryFoldAddConstantMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddConstantMethod.invoke(peepholeFoldConstants, tryFoldAddConstantMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldShift(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldShift_RightGetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = functionNode;
        tryFoldShiftMethodArguments[2] = functionNode1;
        Node actual = ((Node) tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldShift_LeftGetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = functionNode;
        tryFoldShiftMethodArguments[2] = ((Object) null);
        Node actual = ((Node) tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldShift(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (!(lval >= Integer.MIN_VALUE && lval <= Integer.MAX_VALUE)): True}
 * @utbot.executesCondition {@code (!(rval >= 0 && rval < 32)): True}
 * @utbot.executesCondition {@code (lvalInt != lval): False}
 * @utbot.executesCondition {@code (rvalInt != rval): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTryFoldShift_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 256.0);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", -0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:687) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = numberNode;
        tryFoldShiftMethodArguments[2] = numberNode1;
        try {
            tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldShift_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:654) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = functionNode;
        tryFoldShiftMethodArguments[2] = ((Object) null);
        try {
            tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.NUMBER && right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldShift_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:653) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = ((Object) null);
        tryFoldShiftMethodArguments[2] = ((Object) null);
        try {
            tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldShift(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double lval = left.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldShift_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = functionNode;
        tryFoldShiftMethodArguments[2] = functionNode;
        try {
            tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double rval = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldShift_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = numberNode;
        tryFoldShiftMethodArguments[2] = functionNode;
        try {
            tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBitAndOr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldBitAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldBitAndOr_RightGetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        Node node = new Node(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = node;
        tryFoldBitAndOrMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldBitAndOr_LeftGetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        Node node = new Node(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = node;
        tryFoldBitAndOrMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (lval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (rval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (rval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (lvalInt != lval): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 *  */
    @Test
    public void testTryFoldBitAndOr_LvalIntNotEqualsLval() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(11);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 2.147483647E9);
        (((Node) numberNode1)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = functionNode;
        tryFoldBitAndOrMethodArguments[1] = numberNode;
        tryFoldBitAndOrMethodArguments[2] = numberNode1;
        FunctionNode actual = ((FunctionNode) tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int functionNodeSourcePosition = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldBitAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (left.getType() == Token.NUMBER): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// execute conditions:
    ///     {@code (right.getType() == Token.NUMBER): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getDouble()} twice
    /// return from: {@code return n;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (lval > Integer.MAX_VALUE): True}
 *  */
    @Test
    public void testTryFoldBitAndOr_LvalGreaterThanIntegerMAX_VALUE() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 2.68156158598852E154);
        (((Node) numberNode)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = numberNode;
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (lval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (rval < Integer.MIN_VALUE): True}
 *  */
    @Test
    public void testTryFoldBitAndOr_RvalLessThanIntegerMIN_VALUE() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", -4.294967296000001E9);
        (((Node) numberNode1)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = numberNode;
        tryFoldBitAndOrMethodArguments[2] = numberNode1;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (lval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (rval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (rval > Integer.MAX_VALUE): True}
 *  */
    @Test
    public void testTryFoldBitAndOr_RvalGreaterThanIntegerMAX_VALUE() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 2.68156158598852E154);
        (((Node) numberNode1)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = numberNode;
        tryFoldBitAndOrMethodArguments[2] = numberNode1;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): True}
 *  */
    @Test
    public void testTryFoldBitAndOr_LvalLessThanIntegerMIN_VALUE() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -4.294967296000001E9);
        (((Node) numberNode)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = numberNode;
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldBitAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.BITAND || n.getType() == Token.BITOR);): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.NUMBER && right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldBitAndOr_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBitAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBitAndOr(PeepholeFoldConstants.java:604) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.BITAND || n.getType() == Token.BITOR);): False}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldBitAndOr_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        Node node = new Node(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBitAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBitAndOr(PeepholeFoldConstants.java:605) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = node;
        tryFoldBitAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.BITAND || n.getType() == Token.BITOR);): True}
 * @utbot.executesCondition {@code (n.getType() == Token.BITOR): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.NUMBER && right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldBitAndOr_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(9);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBitAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBitAndOr(PeepholeFoldConstants.java:604) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.BITAND || n.getType() == Token.BITOR);
 *  */
    @Test
    public void testTryFoldBitAndOr_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBitAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBitAndOr(PeepholeFoldConstants.java:601) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeType, nodeType, nodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = ((Object) null);
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldBitAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.BITAND || n.getType() == Token.BITOR);): False}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double rval = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBitAndOr_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = numberNode;
        tryFoldBitAndOrMethodArguments[2] = functionNode;
        try {
            tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.BITAND || n.getType() == Token.BITOR);): False}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double lval = left.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBitAndOr_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(11);
        Node node = new Node(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = node;
        tryFoldBitAndOrMethodArguments[2] = functionNode;
        try {
            tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBitAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.BITAND || n.getType() == Token.BITOR);): True}
 * @utbot.executesCondition {@code (n.getType() == Token.BITOR): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.BITAND || n.getType() == Token.BITOR);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldBitAndOr_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[3];
        tryFoldBitAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldBitAndOrMethod.invoke(peepholeFoldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAndOr_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(4);
        Node node = new Node(43);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldAndOrMethodArguments[1] = node;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAndOr_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Node node1 = new Node(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", nodeType, nodeType, nodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = node;
        tryFoldAndOrMethodArguments[1] = node1;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Node actual = ((Node) tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int nodeSourcePosition = ((Integer) getFieldValue(node, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node nodeParent = node.getParent();
        Node actualParent = actual.getParent();
        String actualParentFunctionName = (((FunctionNode) actualParent)).getFunctionName();
        assertNull(actualParentFunctionName);
        
        boolean actualParentItsNeedsActivation = ((Boolean) getFieldValue(actualParent, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualParentItsNeedsActivation);
        
        int nodeParentItsFunctionType = ((Integer) getFieldValue(nodeParent, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualParentItsFunctionType = ((Integer) getFieldValue(actualParent, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(nodeParentItsFunctionType, actualParentItsFunctionType);
        
        boolean actualParentItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualParent, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualParentItsIgnoreDynamicScope);
        
        int nodeParentEncodedSourceStart = (((ScriptOrFnNode) nodeParent)).getEncodedSourceStart();
        int actualParentEncodedSourceStart = (((ScriptOrFnNode) actualParent)).getEncodedSourceStart();
        assertEquals(nodeParentEncodedSourceStart, actualParentEncodedSourceStart);
        
        int nodeParentEncodedSourceEnd = (((ScriptOrFnNode) nodeParent)).getEncodedSourceEnd();
        int actualParentEncodedSourceEnd = (((ScriptOrFnNode) actualParent)).getEncodedSourceEnd();
        assertEquals(nodeParentEncodedSourceEnd, actualParentEncodedSourceEnd);
        
        String actualParentSourceName = (((ScriptOrFnNode) actualParent)).getSourceName();
        assertNull(actualParentSourceName);
        
        int nodeParentBaseLineno = (((ScriptOrFnNode) nodeParent)).getBaseLineno();
        int actualParentBaseLineno = (((ScriptOrFnNode) actualParent)).getBaseLineno();
        assertEquals(nodeParentBaseLineno, actualParentBaseLineno);
        
        int nodeParentEndLineno = (((ScriptOrFnNode) nodeParent)).getEndLineno();
        int actualParentEndLineno = (((ScriptOrFnNode) actualParent)).getEndLineno();
        assertEquals(nodeParentEndLineno, actualParentEndLineno);
        
        ObjArray actualParentFunctions = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualParentFunctions);
        
        ObjArray actualParentRegexps = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualParentRegexps);
        
        ObjArray actualParentItsVariables = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualParentItsVariables);
        
        ObjArray actualParentItsConst = ((ObjArray) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualParentItsConst);
        
        ObjToIntMap actualParentItsVariableNames = ((ObjToIntMap) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualParentItsVariableNames);
        
        int nodeParentVarStart = ((Integer) getFieldValue(nodeParent, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualParentVarStart = ((Integer) getFieldValue(actualParent, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeParentVarStart, actualParentVarStart);
        
        Object actualParentCompilerData = (((ScriptOrFnNode) actualParent)).getCompilerData();
        assertNull(actualParentCompilerData);
        
        int nodeParentType = nodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(nodeParentType, actualParentType);
        
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        assertTrue(deepEquals(nodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testTryFoldAndOr_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:399) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", nodeType, nodeType, nodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = ((Object) null);
        tryFoldAndOrMethodArguments[1] = ((Object) null);
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal != TernaryValue.UNKNOWN): True}
 * @utbot.executesCondition {@code (lval): False}
 * @utbot.executesCondition {@code (!lval): True}
 * @utbot.executesCondition {@code (type == Token.AND): False}
 * @utbot.executesCondition {@code (result != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, result);
 *  */
    @Test
    public void testTryFoldAndOr_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-256);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        Node node = new Node(41);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:463) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = functionNode;
        tryFoldAndOrMethodArguments[1] = node;
        tryFoldAndOrMethodArguments[2] = first;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal != TernaryValue.UNKNOWN): True}
 * @utbot.executesCondition {@code (lval): False}
 * @utbot.executesCondition {@code (!lval): True}
 * @utbot.executesCondition {@code (type == Token.AND): False}
 * @utbot.executesCondition {@code (result != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, result);
 *  */
    @Test
    public void testTryFoldAndOr_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", next);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:463) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = functionNode;
        tryFoldAndOrMethodArguments[1] = functionNode1;
        tryFoldAndOrMethodArguments[2] = next1;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal != TernaryValue.UNKNOWN): True}
 * @utbot.executesCondition {@code (lval): False}
 * @utbot.executesCondition {@code (!lval): True}
 * @utbot.executesCondition {@code (type == Token.AND): True}
 * @utbot.executesCondition {@code (result != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, result);
 *  */
    @Test
    public void testTryFoldAndOr_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(101);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(41);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", next);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:463) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldAndOrMethodArguments[1] = next;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TernaryValue leftVal = NodeUtil.getBooleanValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAndOr_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Node node = new Node(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldAndOrMethodArguments[1] = node;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal != TernaryValue.UNKNOWN): True}
 * @utbot.executesCondition {@code (lval): False}
 * @utbot.executesCondition {@code (!lval): True}
 * @utbot.executesCondition {@code (type == Token.AND): True}
 * @utbot.executesCondition {@code (result != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.TernaryValue#toBoolean(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: n.removeChild(result);
 *  */
    @Test(expected = RuntimeException.class)
    public void testTryFoldAndOr_ThrowRuntimeException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(43);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = scriptOrFnNode;
        tryFoldAndOrMethodArguments[1] = scriptOrFnNode1;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldArithmetic(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmetic(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldArithmetic_RightGetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = functionNode;
        tryFoldArithmeticMethodArguments[2] = functionNode1;
        Node actual = ((Node) tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmetic(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldArithmetic_LeftGetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = functionNode;
        tryFoldArithmeticMethodArguments[2] = ((Object) null);
        Node actual = ((Node) tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldArithmetic(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmetic(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTryFoldArithmetic_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic(PeepholeFoldConstants.java:548) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = numberNode;
        tryFoldArithmeticMethodArguments[2] = numberNode;
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmetic(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldArithmetic_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic(PeepholeFoldConstants.java:543) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = functionNode;
        tryFoldArithmeticMethodArguments[2] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmetic(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.NUMBER && right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldArithmetic_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic(PeepholeFoldConstants.java:542) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = ((Object) null);
        tryFoldArithmeticMethodArguments[2] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldArithmetic(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmetic(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.Error} when: switch(n.getType()) case: default
 *  */
    @Test(expected = Error.class)
    public void testTryFoldArithmetic_ThrowError() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-231);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = scriptOrFnNode;
        tryFoldArithmeticMethodArguments[1] = numberNode;
        tryFoldArithmeticMethodArguments[2] = numberNode1;
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmetic(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double lval = left.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldArithmetic_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = functionNode;
        tryFoldArithmeticMethodArguments[2] = functionNode;
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmetic(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double rval = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldArithmetic_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = numberNode;
        tryFoldArithmeticMethodArguments[2] = functionNode;
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldArithmetic(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldArithmetic1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic(PeepholeFoldConstants.java:577) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", numberNodeType, numberNodeType, numberNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = numberNode;
        tryFoldArithmeticMethodArguments[1] = numberNode1;
        tryFoldArithmeticMethodArguments[2] = numberNode1;
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArithmetic2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(24);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:52)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic(PeepholeFoldConstants.java:560) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", functionNodeType, functionNodeType, functionNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = functionNode;
        tryFoldArithmeticMethodArguments[1] = numberNode;
        tryFoldArithmeticMethodArguments[2] = numberNode;
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArithmetic3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(23);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic(PeepholeFoldConstants.java:577) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", numberNodeType, numberNodeType, numberNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = numberNode;
        tryFoldArithmeticMethodArguments[1] = numberNode1;
        tryFoldArithmeticMethodArguments[2] = numberNode1;
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArithmetic4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(22);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic(PeepholeFoldConstants.java:577) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", numberNodeType, numberNodeType, numberNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = numberNode;
        tryFoldArithmeticMethodArguments[1] = numberNode1;
        tryFoldArithmeticMethodArguments[2] = numberNode1;
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArithmetic5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(24);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 2.22507392481957E-308);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmetic(PeepholeFoldConstants.java:577) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", numberNodeType, numberNodeType, numberNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticMethodArguments[0] = numberNode;
        tryFoldArithmeticMethodArguments[1] = numberNode1;
        tryFoldArithmeticMethodArguments[2] = numberNode1;
        try {
            tryFoldArithmeticMethod.invoke(peepholeFoldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldLeftChildAdd(node, left, right);}
 *  */
    @Test
    public void testTryFoldAdd_ReturnTryFoldLeftChildAdd() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(21);
        Node node = new Node(-255);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAdd", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[3];
        tryFoldAddMethodArguments[0] = scriptOrFnNode;
        tryFoldAddMethodArguments[1] = node;
        tryFoldAddMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldAddMethod.invoke(peepholeFoldConstants, tryFoldAddMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldLeftChildAdd(node, left, right);}
 *  */
    @Test
    public void testTryFoldAdd_ReturnTryFoldLeftChildAdd_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(21);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(21);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAdd", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[3];
        tryFoldAddMethodArguments[0] = scriptOrFnNode;
        tryFoldAddMethodArguments[1] = node;
        tryFoldAddMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldAddMethod.invoke(peepholeFoldConstants, tryFoldAddMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(node.getType() == Token.ADD);
 *  */
    @Test
    public void testTryFoldAdd_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd(PeepholeFoldConstants.java:586) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeType, nodeType, nodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[3];
        tryFoldAddMethodArguments[0] = ((Object) null);
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(peepholeFoldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(node.getType() == Token.ADD);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldAdd_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAdd", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[3];
        tryFoldAddMethodArguments[0] = scriptOrFnNode;
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(peepholeFoldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: NodeUtil.isLiteralValue(left) && NodeUtil.isLiteralValue(right)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldAdd_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(21);
        Node node = new Node(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAdd", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[3];
        tryFoldAddMethodArguments[0] = scriptOrFnNode;
        tryFoldAddMethodArguments[1] = node;
        tryFoldAddMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(peepholeFoldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldAdd_ThrowUnsupportedOperationException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(21);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAdd", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[3];
        tryFoldAddMethodArguments[0] = scriptOrFnNode;
        tryFoldAddMethodArguments[1] = node;
        tryFoldAddMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(peepholeFoldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldComparison(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(left)): False}
 * @utbot.executesCondition {@code (n.getType() != Token.GT): True}
 * @utbot.executesCondition {@code (n.getType() != Token.LT): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldComparison_NGetTypeNotEqualsTokenLT() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(29);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", functionNodeType, functionNodeType, functionNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = functionNode;
        tryFoldComparisonMethodArguments[1] = functionNode1;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        FunctionNode actual = ((FunctionNode) tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments));
        
        String actualFunctionName = actual.getFunctionName();
        assertNull(actualFunctionName);
        
        boolean actualItsNeedsActivation = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualItsNeedsActivation);
        
        int functionNodeItsFunctionType = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualItsFunctionType = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(functionNodeItsFunctionType, actualItsFunctionType);
        
        boolean actualItsIgnoreDynamicScope = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualItsIgnoreDynamicScope);
        
        int functionNodeEncodedSourceStart = functionNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(functionNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int functionNodeEncodedSourceEnd = functionNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(functionNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int functionNodeBaseLineno = functionNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(functionNodeBaseLineno, actualBaseLineno);
        
        int functionNodeEndLineno = functionNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(functionNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int functionNodeVarStart = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(functionNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int functionNodeType1 = functionNode.getType();
        int actualType = actual.getType();
        assertEquals(functionNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int functionNodeSourcePosition = ((Integer) getFieldValue(functionNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldComparison(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(left)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:722) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(left)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:722) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(right)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int op = n.getType();
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(39);
        Node node1 = new Node(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:727) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = node1;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(right)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(44);
        Node node1 = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:722) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = node1;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(left)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(63);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:722) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = functionNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldComparison(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isLiteralValue(left) || !NodeUtil.isLiteralValue(right)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldComparison_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = functionNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldStringJoin(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): True}
 *  */
    @Test
    public void testTryFoldStringJoin_LeftEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(0);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): True}
 *  */
    @Test
    public void testTryFoldStringJoin_RightEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int nodeFirstSourcePosition = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): True}
 *  */
    @Test
    public void testTryFoldStringJoin_ArrayNodeGetTypeNotEqualsTokenARRAYLIT() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(41);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): False}
 * @utbot.executesCondition {@code (!functionName.getString().equals("join")): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testTryFoldStringJoin_NotFunctionNameGetStringEquals() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(41);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(63);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        Node nodeFirstFirstNext = nodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        String nodeFirstFirstNextStr = ((String) getFieldValue(nodeFirstFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstFirstNextStr = ((String) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(nodeFirstFirstNextStr, actualFirstFirstNextStr);
        
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldStringJoin(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (left == null): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getNext()} once
    /// execute conditions:
    ///     {@code (right == null): False}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#isGetProp(com.google.javascript.rhino.Node)} once
    /// return from: {@code return n;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 *  */
    @Test
    public void testTryFoldStringJoin_NotNodeUtilIsImmutableValue_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstNextStr);
        
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): False}
 *  */
    @Test
    public void testTryFoldStringJoin_NodeUtilIsGetProp() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 *  */
    @Test
    public void testTryFoldStringJoin_NotNodeUtilIsImmutableValue() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nodeFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nodeFirstBaseLineno = (((ScriptOrFnNode) nodeFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nodeFirstBaseLineno, actualFirstBaseLineno);
        
        int nodeFirstEndLineno = (((ScriptOrFnNode) nodeFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nodeFirstEndLineno, actualFirstEndLineno);
        
        ObjArray actualFirstFunctions = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFunctions);
        
        ObjArray actualFirstRegexps = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstRegexps);
        
        ObjArray actualFirstItsVariables = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstItsVariables);
        
        ObjArray actualFirstItsConst = ((ObjArray) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstItsConst);
        
        ObjToIntMap actualFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstItsVariableNames);
        
        int nodeFirstVarStart = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int nodeFirstNextSourcePosition = ((Integer) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextSourcePosition = ((Integer) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        assertTrue(deepEquals(nodeFirst, actualFirst));
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringJoin(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTryFoldStringJoin_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin(PeepholeFoldConstants.java:1003) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = ((Object) null);
        try {
            tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !functionName.getString().equals("join")
 *  */
    @Test
    public void testTryFoldStringJoin_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(41);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin(PeepholeFoldConstants.java:1023) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", scriptOrFnNodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node functionName = arrayNode.getNext();
 *  */
    @Test
    public void testTryFoldStringJoin_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(29);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(43);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin(PeepholeFoldConstants.java:1020) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", scriptOrFnNodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !functionName.getString().equals("join")
 *  */
    @Test
    public void testTryFoldStringJoin_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(41);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(63);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldStringJoin(PeepholeFoldConstants.java:1023) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = node;
        try {
            tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringJoin(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isGetProp(left) || !NodeUtil.isImmutableValue(right)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringJoin_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = node;
        try {
            tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldStringJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: !functionName.getString().equals("join")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringJoin_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(43);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(63);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next1.setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", functionNodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[1];
        tryFoldStringJoinMethodArguments[0] = functionNode;
        try {
            tryFoldStringJoinMethod.invoke(peepholeFoldConstants, tryFoldStringJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldGetElem_RightGetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(35);
        Node node = new Node(63);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = scriptOrFnNode;
        tryFoldGetElemMethodArguments[1] = node;
        tryFoldGetElemMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): False}
 *  */
    @Test
    public void testTryFoldGetElem_LeftGetTypeNotEqualsTokenARRAYLIT() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(35);
        Node node = new Node(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = scriptOrFnNode;
        tryFoldGetElemMethodArguments[1] = node;
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETELEM);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.ARRAYLIT
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1120) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = scriptOrFnNode;
        tryFoldGetElemMethodArguments[1] = ((Object) null);
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETELEM);): True}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: right.getType() != Token.NUMBER
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(35);
        Node node = new Node(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1122) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = scriptOrFnNode;
        tryFoldGetElemMethodArguments[1] = node;
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.GETELEM);
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1118) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", nodeType, nodeType, nodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = ((Object) null);
        tryFoldGetElemMethodArguments[1] = ((Object) null);
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETELEM);): True}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): False}
 * @utbot.executesCondition {@code (intIndex != index): False}
 * @utbot.executesCondition {@code (intIndex < 0): False}
 * @utbot.executesCondition {@code (elem == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.getParent().replaceChild(n, elem);
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(35);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(63);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        setField(node1, "com.google.javascript.rhino.Node", "last", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1152) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", nodeType, nodeType, nodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = node;
        tryFoldGetElemMethodArguments[1] = node1;
        tryFoldGetElemMethodArguments[2] = numberNode;
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETELEM);): True}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double index = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldGetElem_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(35);
        Node node = new Node(63);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = scriptOrFnNode;
        tryFoldGetElemMethodArguments[1] = node;
        tryFoldGetElemMethodArguments[2] = functionNode;
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETELEM);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.GETELEM);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldGetElem_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = scriptOrFnNode;
        tryFoldGetElemMethodArguments[1] = ((Object) null);
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldGetProp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): False}
 *  */
    @Test
    public void testTryFoldGetProp_RightGetTypeNotEqualsTokenSTRING() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.executesCondition {@code (right.getString().equals("length")): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldGetProp_RightGetStringEquals() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = stringNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments));
        
        int scriptOrFnNodeEncodedSourceStart = scriptOrFnNode.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(scriptOrFnNodeEncodedSourceStart, actualEncodedSourceStart);
        
        int scriptOrFnNodeEncodedSourceEnd = scriptOrFnNode.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(scriptOrFnNodeEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int scriptOrFnNodeBaseLineno = scriptOrFnNode.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(scriptOrFnNodeBaseLineno, actualBaseLineno);
        
        int scriptOrFnNodeEndLineno = scriptOrFnNode.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(scriptOrFnNodeEndLineno, actualEndLineno);
        
        ObjArray actualFunctions = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFunctions);
        
        ObjArray actualRegexps = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualRegexps);
        
        ObjArray actualItsVariables = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualItsVariables);
        
        ObjArray actualItsConst = ((ObjArray) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualItsConst);
        
        ObjToIntMap actualItsVariableNames = ((ObjToIntMap) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualItsVariableNames);
        
        int scriptOrFnNodeVarStart = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(scriptOrFnNodeVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int scriptOrFnNodeType1 = scriptOrFnNode.getType();
        int actualType = actual.getType();
        assertEquals(scriptOrFnNodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int scriptOrFnNodeSourcePosition = ((Integer) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldGetProp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETPROP);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: right.getType() == Token.STRING && right.getString().equals("length")
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1165) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.GETPROP);
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1163) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", nodeType, nodeType, nodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = ((Object) null);
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETPROP);): True}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getString().equals("length")
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1166) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = stringNode;
        try {
            tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldGetProp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETPROP);): True}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: right.getString().equals("length")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldGetProp_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = functionNode;
        try {
            tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETPROP);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.GETPROP);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldGetProp_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields901936809968400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields901936809968400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass901936809973600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields901936809968400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass901936809973600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields901936810304800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields901936810304800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass901936810306200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields901936810304800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass901936810306200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

