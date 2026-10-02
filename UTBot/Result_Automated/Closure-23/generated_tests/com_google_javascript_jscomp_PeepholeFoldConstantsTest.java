package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.JSType;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.jstype.TernaryValue;
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
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_PeepholeFoldConstantsTest {
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!late): True}
 *  */
    @Test
    public void testTryFoldAssign_NotLate() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = stringNode;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!late): False}
 * @utbot.executesCondition {@code (!right.hasChildren()): False}
 *  */
    @Test
    public void testTryFoldAssign_RightHasChildren() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = stringNode;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = stringNode;
        Object actual = tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!late): False}
 * @utbot.executesCondition {@code (!right.hasChildren()): True}
 * @utbot.executesCondition {@code (right.getFirstChild().getNext() != right.getLastChild()): False}
 * @utbot.executesCondition {@code (mayHaveSideEffects(left)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.PeepholeFoldConstants#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldAssign_MayHaveSideEffects() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.PeepholeFoldConstants", "late", true);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(49);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = stringNode;
        tryFoldAssignMethodArguments[2] = stringNode;
        Object actual = tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!late): False}
 * @utbot.executesCondition {@code (!right.hasChildren()): True}
 * @utbot.executesCondition {@code (right.getFirstChild().getNext() != right.getLastChild()): True}
 *  */
    @Test
    public void testTryFoldAssign_RightGetFirstChildGetNextNotEqualsRightGetLastChild() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = stringNode;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = stringNode;
        Object actual = tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        
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
        
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int stringNodeFirstNextSourcePosition = stringNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(stringNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!late): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !right.hasChildren() || right.getFirstChild().getNext() != right.getLastChild()
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(true);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:466) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = stringNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAssign()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.isAssign());
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:459) */
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
 * @utbot.executesCondition {@code (!late): False}
 * @utbot.executesCondition {@code (!right.hasChildren()): True}
 * @utbot.executesCondition {@code (right.getFirstChild().getNext() != right.getLastChild()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.PeepholeFoldConstants#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: mayHaveSideEffects(left)
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.PeepholeFoldConstants", "late", true);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:794)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:117)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:472) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = stringNode;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = stringNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAssign()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.isAssign());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldAssign_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = stringNode;
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
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryUnfoldAssignOp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryUnfoldAssignOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryUnfoldAssignOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (late): True}
 *  */
    @Test
    public void testTryUnfoldAssignOp_Late() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(true);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryUnfoldAssignOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryUnfoldAssignOp", nodeType, nodeType, nodeType);
        tryUnfoldAssignOpMethod.setAccessible(true);
        java.lang.Object[] tryUnfoldAssignOpMethodArguments = new java.lang.Object[3];
        tryUnfoldAssignOpMethodArguments[0] = ((Object) null);
        tryUnfoldAssignOpMethodArguments[1] = ((Object) null);
        tryUnfoldAssignOpMethodArguments[2] = ((Object) null);
        Node actual = ((Node) tryUnfoldAssignOpMethod.invoke(peepholeFoldConstants, tryUnfoldAssignOpMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryUnfoldAssignOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (late): False}
 * @utbot.executesCondition {@code (!n.hasChildren()): False}
 *  */
    @Test
    public void testTryUnfoldAssignOp_NHasChildren() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryUnfoldAssignOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryUnfoldAssignOp", numberNodeType, numberNodeType, numberNodeType);
        tryUnfoldAssignOpMethod.setAccessible(true);
        java.lang.Object[] tryUnfoldAssignOpMethodArguments = new java.lang.Object[3];
        tryUnfoldAssignOpMethodArguments[0] = numberNode;
        tryUnfoldAssignOpMethodArguments[1] = ((Object) null);
        tryUnfoldAssignOpMethodArguments[2] = ((Object) null);
        Object actual = tryUnfoldAssignOpMethod.invoke(peepholeFoldConstants, tryUnfoldAssignOpMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryUnfoldAssignOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (late): False}
 * @utbot.executesCondition {@code (!n.hasChildren()): True}
 * @utbot.executesCondition {@code (n.getFirstChild().getNext() != n.getLastChild()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 *  */
    @Test
    public void testTryUnfoldAssignOp_NGetFirstChildGetNextNotEqualsNGetLastChild() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryUnfoldAssignOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryUnfoldAssignOp", stringNodeType, stringNodeType, stringNodeType);
        tryUnfoldAssignOpMethod.setAccessible(true);
        java.lang.Object[] tryUnfoldAssignOpMethodArguments = new java.lang.Object[3];
        tryUnfoldAssignOpMethodArguments[0] = stringNode;
        tryUnfoldAssignOpMethodArguments[1] = ((Object) null);
        tryUnfoldAssignOpMethodArguments[2] = ((Object) null);
        Object actual = tryUnfoldAssignOpMethod.invoke(peepholeFoldConstants, tryUnfoldAssignOpMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int stringNodeFirstNextSourcePosition = stringNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(stringNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryUnfoldAssignOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryUnfoldAssignOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (late): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !n.hasChildren() || n.getFirstChild().getNext() != n.getLastChild()
 *  */
    @Test
    public void testTryUnfoldAssignOp_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryUnfoldAssignOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryUnfoldAssignOp(PeepholeFoldConstants.java:539) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryUnfoldAssignOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryUnfoldAssignOp", nodeType, nodeType, nodeType);
        tryUnfoldAssignOpMethod.setAccessible(true);
        java.lang.Object[] tryUnfoldAssignOpMethodArguments = new java.lang.Object[3];
        tryUnfoldAssignOpMethodArguments[0] = ((Object) null);
        tryUnfoldAssignOpMethodArguments[1] = ((Object) null);
        tryUnfoldAssignOpMethodArguments[2] = ((Object) null);
        try {
            tryUnfoldAssignOpMethod.invoke(peepholeFoldConstants, tryUnfoldAssignOpMethodArguments);
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
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#isTypeOf()} once,
    ///     {@link com.google.common.base.Preconditions#checkArgument(boolean)} once,
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once
    /// return from: {@code return originalTypeofNode;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): True}
 *  */
    @Test
    public void testTryFoldTypeof_ArgumentNodeEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): True}
 *  */
    @Test
    public void testTryFoldTypeof_NotNodeUtilIsLiteralValue() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): True}
 *  */
    @Test
    public void testTryFoldTypeof_NotNodeUtilIsLiteralValue_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(125);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node numberNodeFirstParent = numberNodeFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        int numberNodeFirstParentType = numberNodeFirstParent.getType();
        int actualFirstParentType = actualFirstParent.getType();
        assertEquals(numberNodeFirstParentType, actualFirstParentType);
        
        assertTrue(deepEquals(numberNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(numberNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(numberNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(numberNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(numberNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(numberNodeFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): True}
 *  */
    @Test
    public void testTryFoldTypeof_NotNodeUtilIsLiteralValue_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node numberNodeFirstFirst = ((Node) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstFirstType = numberNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(numberNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int numberNodeFirstFirstSourcePosition = numberNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(numberNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): True}
 *  */
    @Test
    public void testTryFoldTypeof_NotNodeUtilIsLiteralValue_3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node numberNodeFirstFirst = ((Node) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstFirstType = numberNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(numberNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int numberNodeFirstFirstSourcePosition = numberNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(numberNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): False}
 * @utbot.executesCondition {@code (typeNameString != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isTypeOf()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 *  */
    @Test
    public void testTryFoldTypeof_TypeNameStringEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node numberNodeFirstFirst = ((Node) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int numberNodeFirstFirstType = numberNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(numberNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int numberNodeFirstFirstSourcePosition = numberNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(numberNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isTypeOf()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(originalTypeofNode.isTypeOf());
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:283) */
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
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:325) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(44);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:325) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:325) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:325) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(argumentNode, true)): False}
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:325) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(originalTypeofNode.isTypeOf());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldTypeof_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: argumentNode == null || !NodeUtil.isLiteralValue(argumentNode, true)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldTypeof_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (argumentNode == null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: argumentNode == null || !NodeUtil.isLiteralValue(argumentNode, true)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldTypeof_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", numberNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = numberNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryConvertToNumber(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryConvertToNumber_Return() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", numberNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = numberNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryConvertToNumber_ResultEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", numberNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = numberNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryConvertToNumber_ResultEqualsNull_3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-256);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", numberNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = numberNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.triggersRecursion tryConvertToNumber, where the test return from: {@code return;}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryConvertToNumber_PeepholeFoldConstantsTryConvertToNumber() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(39);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", stringNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = stringNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryConvertToNumber_ResultEqualsNull_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", numberNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = numberNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryConvertToNumber_ResultEqualsNull_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", numberNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = numberNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryConvertToNumber(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTryConvertToNumber_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:241) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", nodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = ((Object) null);
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.triggersRecursion tryConvertToNumber, where the test invoke:
 *     com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node) once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryConvertToNumber(n.getLastChild());
 *  */
    @Test
    public void testTryConvertToNumber_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:241)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:248) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", numberNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = numberNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getNumberValue(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Double result = NodeUtil.getNumberValue(n);
 *  */
    @Test
    public void testTryConvertToNumber_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:794)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:777)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:286)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:261) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", numberNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = numberNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildAtIndex(int)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.triggersRecursion tryConvertToNumber, where the test invoke:
 *     com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node) once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryConvertToNumber(n.getChildAtIndex(1));
 *  */
    @Test
    public void testTryConvertToNumber_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:241)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:251) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", stringNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = stringNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryConvertToNumber(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getNumberValue(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Double result = NodeUtil.getNumberValue(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryConvertToNumber_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", nodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = node;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isUndefined(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isUndefined(n)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryConvertToNumber_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", nodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = node;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceOperandsForOp(com.google.javascript.rhino.Node)
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: default}
 * @utbot.returnsFrom {@code return tryFoldBinaryOperator(subtree);}
 *  */
    @Test
    public void testOptimizeSubtree_PeepholeFoldConstantsTryFoldBinaryOperator() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(71);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("optimizeSubtree", numberNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = numberNode;
        Object actual = optimizeSubtreeMethod.invoke(peepholeFoldConstants, optimizeSubtreeMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree(PeepholeFoldConstants.java:76) */
        peepholeFoldConstants.optimizeSubtree(null);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceVoid(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryReduceVoid(subtree);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid(PeepholeFoldConstants.java:183)
            com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree(PeepholeFoldConstants.java:91) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("optimizeSubtree", numberNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = numberNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeFoldConstants, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return tryFoldUnaryOperator(subtree);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOptimizeSubtree_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("optimizeSubtree", numberNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = numberNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeFoldConstants, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return tryFoldUnaryOperator(subtree);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOptimizeSubtree_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method optimizeSubtreeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("optimizeSubtree", stringNodeType);
        optimizeSubtreeMethod.setAccessible(true);
        java.lang.Object[] optimizeSubtreeMethodArguments = new java.lang.Object[1];
        optimizeSubtreeMethodArguments[0] = stringNode;
        try {
            optimizeSubtreeMethod.invoke(peepholeFoldConstants, optimizeSubtreeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInstanceof(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isInstanceOf()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.isInstanceOf());
 *  */
    @Test
    public void testTryFoldInstanceof_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:431) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isInstanceOf()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.isInstanceOf());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldInstanceof_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", stringNodeType, stringNodeType, stringNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = stringNode;
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
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryReduceVoid(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceVoid(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!child.isNumber()): False}
 * @utbot.executesCondition {@code (!mayHaveSideEffects(n)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isNumber()}
 * @utbot.invokes {@link com.google.javascript.jscomp.PeepholeFoldConstants#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReduceVoid_MayHaveSideEffects() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(49);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceVoidMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceVoid", numberNodeType);
        tryReduceVoidMethod.setAccessible(true);
        java.lang.Object[] tryReduceVoidMethodArguments = new java.lang.Object[1];
        tryReduceVoidMethodArguments[0] = numberNode;
        Object actual = tryReduceVoidMethod.invoke(peepholeFoldConstants, tryReduceVoidMethodArguments);
        
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryReduceVoid(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceVoid(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node child = n.getFirstChild();
 *  */
    @Test
    public void testTryReduceVoid_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid(PeepholeFoldConstants.java:182) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceVoidMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceVoid", nodeType);
        tryReduceVoidMethod.setAccessible(true);
        java.lang.Object[] tryReduceVoidMethodArguments = new java.lang.Object[1];
        tryReduceVoidMethodArguments[0] = ((Object) null);
        try {
            tryReduceVoidMethod.invoke(peepholeFoldConstants, tryReduceVoidMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceVoid(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !child.isNumber() || child.getDouble() != 0.0
 *  */
    @Test
    public void testTryReduceVoid_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid(PeepholeFoldConstants.java:183) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceVoidMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceVoid", numberNodeType);
        tryReduceVoidMethod.setAccessible(true);
        java.lang.Object[] tryReduceVoidMethodArguments = new java.lang.Object[1];
        tryReduceVoidMethodArguments[0] = numberNode;
        try {
            tryReduceVoidMethod.invoke(peepholeFoldConstants, tryReduceVoidMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.areStringsEqual
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method areStringsEqual(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#areStringsEqual(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (a.indexOf('\u000B') != -1): True}
 * @utbot.returnsFrom {@code return TernaryValue.UNKNOWN;}
 *  */
    @Test
    public void testAreStringsEqual_AIndexOfNotEqualsNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        String string = "\u000B";
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areStringsEqualMethod = peepholeFoldConstantsClazz.getDeclaredMethod("areStringsEqual", stringType, stringType);
        areStringsEqualMethod.setAccessible(true);
        java.lang.Object[] areStringsEqualMethodArguments = new java.lang.Object[2];
        areStringsEqualMethodArguments[0] = string;
        areStringsEqualMethodArguments[1] = ((Object) null);
        TernaryValue actual = ((TernaryValue) areStringsEqualMethod.invoke(peepholeFoldConstants, areStringsEqualMethodArguments));
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#areStringsEqual(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (a.indexOf('\u000B') != -1): False}
 * @utbot.executesCondition {@code (b.indexOf('\u000B') != -1): False}
 * @utbot.executesCondition {@code (a.equals(b)): True}
 * @utbot.returnsFrom {@code return a.equals(b) ? TernaryValue.TRUE : TernaryValue.FALSE;}
 *  */
    @Test
    public void testAreStringsEqual_AEquals() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        String string = "";
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areStringsEqualMethod = peepholeFoldConstantsClazz.getDeclaredMethod("areStringsEqual", stringType, stringType);
        areStringsEqualMethod.setAccessible(true);
        java.lang.Object[] areStringsEqualMethodArguments = new java.lang.Object[2];
        areStringsEqualMethodArguments[0] = string;
        areStringsEqualMethodArguments[1] = string;
        TernaryValue actual = ((TernaryValue) areStringsEqualMethod.invoke(peepholeFoldConstants, areStringsEqualMethodArguments));
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "TRUE");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#areStringsEqual(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (a.indexOf('\u000B') != -1): False}
 * @utbot.executesCondition {@code (b.indexOf('\u000B') != -1): True}
 * @utbot.returnsFrom {@code return TernaryValue.UNKNOWN;}
 *  */
    @Test
    public void testAreStringsEqual_BIndexOfNotEqualsNegative1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        String string = "";
        String string1 = "\u000B ";
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areStringsEqualMethod = peepholeFoldConstantsClazz.getDeclaredMethod("areStringsEqual", stringType, stringType);
        areStringsEqualMethod.setAccessible(true);
        java.lang.Object[] areStringsEqualMethodArguments = new java.lang.Object[2];
        areStringsEqualMethodArguments[0] = string;
        areStringsEqualMethodArguments[1] = string1;
        TernaryValue actual = ((TernaryValue) areStringsEqualMethod.invoke(peepholeFoldConstants, areStringsEqualMethodArguments));
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "UNKNOWN");
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#areStringsEqual(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (a.indexOf('\u000B') != -1): False}
 * @utbot.executesCondition {@code (b.indexOf('\u000B') != -1): False}
 * @utbot.executesCondition {@code (a.equals(b)): False}
 * @utbot.returnsFrom {@code return a.equals(b) ? TernaryValue.TRUE : TernaryValue.FALSE;}
 *  */
    @Test
    public void testAreStringsEqual_NotAEquals() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        String string = " ";
        String string1 = "";
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areStringsEqualMethod = peepholeFoldConstantsClazz.getDeclaredMethod("areStringsEqual", stringType, stringType);
        areStringsEqualMethod.setAccessible(true);
        java.lang.Object[] areStringsEqualMethodArguments = new java.lang.Object[2];
        areStringsEqualMethodArguments[0] = string;
        areStringsEqualMethodArguments[1] = string1;
        TernaryValue actual = ((TernaryValue) areStringsEqualMethod.invoke(peepholeFoldConstants, areStringsEqualMethodArguments));
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "FALSE");
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method areStringsEqual(java.lang.String, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#areStringsEqual(java.lang.String,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: a.indexOf('\u000B') != -1 || b.indexOf('\u000B') != -1
 *  */
    @Test
    public void testAreStringsEqual_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.areStringsEqual] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.areStringsEqual(PeepholeFoldConstants.java:1156) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areStringsEqualMethod = peepholeFoldConstantsClazz.getDeclaredMethod("areStringsEqual", stringType, stringType);
        areStringsEqualMethod.setAccessible(true);
        java.lang.Object[] areStringsEqualMethodArguments = new java.lang.Object[2];
        areStringsEqualMethodArguments[0] = ((Object) null);
        areStringsEqualMethodArguments[1] = ((Object) null);
        try {
            areStringsEqualMethod.invoke(peepholeFoldConstants, areStringsEqualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#areStringsEqual(java.lang.String,java.lang.String)}
 * @utbot.executesCondition {@code (a.indexOf('\u000B') != -1): False}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: b.indexOf('\u000B') != -1
 *  */
    @Test
    public void testAreStringsEqual_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.areStringsEqual] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.areStringsEqual(PeepholeFoldConstants.java:1157) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areStringsEqualMethod = peepholeFoldConstantsClazz.getDeclaredMethod("areStringsEqual", stringType, stringType);
        areStringsEqualMethod.setAccessible(true);
        java.lang.Object[] areStringsEqualMethodArguments = new java.lang.Object[2];
        areStringsEqualMethodArguments[0] = string;
        areStringsEqualMethodArguments[1] = ((Object) null);
        try {
            areStringsEqualMethod.invoke(peepholeFoldConstants, areStringsEqualMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method areStringsEqual(java.lang.String, java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#areStringsEqual(java.lang.String,java.lang.String)}
     */
    @Test
    public void testAreStringsEqualWithNonEmptyStrings() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(true);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areStringsEqualMethod = peepholeFoldConstantsClazz.getDeclaredMethod("areStringsEqual", stringType, stringType);
        areStringsEqualMethod.setAccessible(true);
        java.lang.Object[] areStringsEqualMethodArguments = new java.lang.Object[2];
        areStringsEqualMethodArguments[0] = "-3_";
        areStringsEqualMethodArguments[1] = "10";
        TernaryValue actual = ((TernaryValue) areStringsEqualMethod.invoke(peepholeFoldConstants, areStringsEqualMethodArguments));
        
        Class ternaryValueClazz = Class.forName("com.google.javascript.rhino.jstype.TernaryValue");
        Object expected = getEnumConstantByName(ternaryValueClazz, "FALSE");
        
        assertEquals(expected, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldComparison(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!rightLiteral): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int op = n.getType();
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:931) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = numberNode;
        tryFoldComparisonMethodArguments[2] = numberNode1;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!rightLiteral): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:926) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = numberNode;
        tryFoldComparisonMethodArguments[2] = numberNode1;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!rightLiteral): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int op = n.getType();
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:931) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = numberNode;
        tryFoldComparisonMethodArguments[2] = numberNode1;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!rightLiteral): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int op = n.getType();
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:931) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = numberNode;
        tryFoldComparisonMethodArguments[2] = numberNode1;
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
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldComparison_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = numberNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAdd(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAdd()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(node.isAdd());
 *  */
    @Test
    public void testTryFoldAdd_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd(PeepholeFoldConstants.java:828) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAdd()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(node.isAdd());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldAdd_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAdd", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[3];
        tryFoldAddMethodArguments[0] = stringNode;
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(peepholeFoldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldAdd(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldAdd1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(21);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.valueCheck(NodeUtil.java:1248)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1394)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1389)
            com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(NodeUtil.java:1284)
            com.google.javascript.jscomp.NodeUtil$NumbericResultPredicate.apply(NodeUtil.java:1267)
            com.google.javascript.jscomp.NodeUtil$NumbericResultPredicate.apply(NodeUtil.java:1264)
            com.google.javascript.jscomp.NodeUtil.valueCheck(NodeUtil.java:1260)
            com.google.javascript.jscomp.NodeUtil.isNumericResult(NodeUtil.java:1278)
            com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(NodeUtil.java:1401)
            com.google.javascript.jscomp.NodeUtil$MayBeStringResultPredicate.apply(NodeUtil.java:1378)
            com.google.javascript.jscomp.NodeUtil$MayBeStringResultPredicate.apply(NodeUtil.java:1375)
            com.google.javascript.jscomp.NodeUtil.valueCheck(NodeUtil.java:1260)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1394)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd(PeepholeFoldConstants.java:830) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAdd", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[3];
        tryFoldAddMethodArguments[0] = stringNode;
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(peepholeFoldConstants, tryFoldAddMethodArguments);
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
 * @utbot.executesCondition {@code (leftVal != TernaryValue.UNKNOWN): False}
 * @utbot.executesCondition {@code (result != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getImpureBooleanValue(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAndOr_ResultEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode1;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:563) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAndOr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: n.removeChild(result);
 *  */
    @Test(expected = RuntimeException.class)
    public void testTryFoldAndOr_ThrowRuntimeException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode1;
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
 * @utbot.throwsException {@link java.lang.RuntimeException} in: n.removeChild(result);
 *  */
    @Test(expected = RuntimeException.class)
    public void testTryFoldAndOr_ThrowRuntimeException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode1;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldAndOr1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = numberNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldAndOr2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 3.337610787760802E-308);
        (((Node) numberNode)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = numberNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldAndOr3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode1;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldAndOr4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode1;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldAndOr5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldAndOr6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldAndOr7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node stringNodeLast = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        int stringNodeLastType = stringNodeLast.getType();
        int actualLastType = actualLast.getType();
        assertEquals(stringNodeLastType, actualLastType);
        
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        Node actualLastLast = ((Node) getFieldValue(actualLast, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLastLast);
        
        Object actualLastPropListHead = getFieldValue(actualLast, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualLastPropListHead);
        
        int stringNodeLastSourcePosition = stringNodeLast.getSourcePosition();
        int actualLastSourcePosition = actualLast.getSourcePosition();
        assertEquals(stringNodeLastSourcePosition, actualLastSourcePosition);
        
        JSType actualLastJsType = ((JSType) getFieldValue(actualLast, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualLastJsType);
        
        Node actualLastParent = actualLast.getParent();
        assertNull(actualLastParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    
    @Test
    public void testTryFoldAndOr8() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        Object actual = tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node stringNodeLast = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        int stringNodeLastType = stringNodeLast.getType();
        int actualLastType = actualLast.getType();
        assertEquals(stringNodeLastType, actualLastType);
        
        assertTrue(deepEquals(stringNodeLast, actualLast));
        assertTrue(deepEquals(stringNodeLast, actualLast));
        Node actualLastLast = ((Node) getFieldValue(actualLast, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLastLast);
        
        Object actualLastPropListHead = getFieldValue(actualLast, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualLastPropListHead);
        
        int stringNodeLastSourcePosition = stringNodeLast.getSourcePosition();
        int actualLastSourcePosition = actualLast.getSourcePosition();
        assertEquals(stringNodeLastSourcePosition, actualLastSourcePosition);
        
        JSType actualLastJsType = ((JSType) getFieldValue(actualLast, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualLastJsType);
        
        Node actualLastParent = actualLast.getParent();
        assertNull(actualLastParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldAndOr9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(41);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:593) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = first;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(98);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:97)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:86)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:569) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = numberNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = node;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:77)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:87)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:569) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = numberNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = node;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:77)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:98)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:569) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = numberNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = node;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:557)
            com.google.javascript.rhino.Node.removeChild(Node.java:700)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:592) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = numberNode;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:557)
            com.google.javascript.rhino.Node.removeChild(Node.java:700)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:592) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = numberNode;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:127)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:114)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:569) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:77)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:87)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:569) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = numberNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr17() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:77)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:98)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:569) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode1;
        tryFoldAndOrMethodArguments[2] = node;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr18() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(86);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:77)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:81)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:96)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:569) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = numberNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = node;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr19() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:77)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:83)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:86)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:569) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = numberNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = node;
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr20() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:77)
            com.google.javascript.jscomp.NodeUtil.getImpureBooleanValue(NodeUtil.java:92)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:569) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAndOr21() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(122);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", next1);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:557)
            com.google.javascript.rhino.Node.replaceChild(Node.java:727)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:593) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = next1;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAndOr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldAndOr22() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = numberNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAndOr23() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = numberNode;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testTryFoldAndOr24() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(43);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = stringNode;
        tryFoldAndOrMethodArguments[1] = stringNode1;
        tryFoldAndOrMethodArguments[2] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(peepholeFoldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldLeftChildOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldLeftChildOp_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        Object actual = tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldLeftChildOp_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        Object actual = tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldLeftChildOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int opType = n.getType();
 *  */
    @Test
    public void testTryFoldLeftChildOp_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:788) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", nodeType, nodeType, nodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = ((Object) null);
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldLeftChildOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState((NodeUtil.isAssociative(opType) && NodeUtil.isCommutative(opType)) || n.isAdd());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldLeftChildOp_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = ((Object) null);
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isCommutative(int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState((NodeUtil.isAssociative(opType) && NodeUtil.isCommutative(opType)) || n.isAdd());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldLeftChildOp_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = ((Object) null);
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldLeftChildOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldLeftChildOp1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(111);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        Object actual = tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldLeftChildOp2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        Object actual = tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldLeftChildOp3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(10);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        Object actual = tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldLeftChildOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldLeftChildOp4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:799) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:799) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp6() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:799) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:799) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp8() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:295)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:798) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getStringNumberValue(NodeUtil.java:333)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:321)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:798) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(130);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:799) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:799) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:799) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(89);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:881)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:777)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:286)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:798) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:799) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(21);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.valueCheck(NodeUtil.java:1248)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1394)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1389)
            com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(NodeUtil.java:1284)
            com.google.javascript.jscomp.NodeUtil$NumbericResultPredicate.apply(NodeUtil.java:1267)
            com.google.javascript.jscomp.NodeUtil$NumbericResultPredicate.apply(NodeUtil.java:1264)
            com.google.javascript.jscomp.NodeUtil.valueCheck(NodeUtil.java:1260)
            com.google.javascript.jscomp.NodeUtil.isNumericResult(NodeUtil.java:1278)
            com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(NodeUtil.java:1401)
            com.google.javascript.jscomp.NodeUtil$MayBeStringResultPredicate.apply(NodeUtil.java:1378)
            com.google.javascript.jscomp.NodeUtil$MayBeStringResultPredicate.apply(NodeUtil.java:1375)
            com.google.javascript.jscomp.NodeUtil.valueCheck(NodeUtil.java:1260)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1394)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1389)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:794) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = ((Object) null);
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:794)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:777)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:286)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:798) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldLeftChildOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldLeftChildOp17() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldLeftChildOp18() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(11);
        Node node = new Node(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = node;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldLeftChildOp19() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(10);
        Node node = new Node(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = stringNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = node;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
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
 * @utbot.executesCondition {@code (left.isNumber() && right.isNumber()): True}
 * @utbot.executesCondition {@code (right.isNumber()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isNumber()}
 *  */
    @Test
    public void testTryFoldShift_NotRightIsNumber() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(39);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = node;
        tryFoldShiftMethodArguments[2] = stringNode;
        Node actual = ((Node) tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isNumber() && right.isNumber()): False}
 *  */
    @Test
    public void testTryFoldShift_LeftIsNumberAndRightIsNumber() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = node;
        tryFoldShiftMethodArguments[2] = ((Object) null);
        Node actual = ((Node) tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldShift(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isNumber() && right.isNumber()): True}
 * @utbot.executesCondition {@code (right.isNumber()): True}
 * @utbot.executesCondition {@code (!(lval >= Integer.MIN_VALUE && lval <= Integer.MAX_VALUE)): True}
 * @utbot.executesCondition {@code (!(rval >= 0 && rval < 32)): True}
 * @utbot.executesCondition {@code (lvalInt != lval): False}
 * @utbot.executesCondition {@code (rvalInt != rval): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isNumber()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTryFoldShift_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 3.0);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", -0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:887) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isNumber()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.isNumber() && right.isNumber()
 *  */
    @Test
    public void testTryFoldShift_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:853) */
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isNumber() && right.isNumber()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isNumber()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.isNumber()
 *  */
    @Test
    public void testTryFoldShift_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:854) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = node;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double rval = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldShift_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = numberNode;
        tryFoldShiftMethodArguments[2] = stringNode;
        try {
            tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double lval = left.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldShift_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(39);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = node;
        tryFoldShiftMethodArguments[2] = stringNode;
        try {
            tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldShift(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldShift1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 131079.0002441407);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", -0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:54)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:877) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = node;
        tryFoldShiftMethodArguments[1] = numberNode;
        tryFoldShiftMethodArguments[2] = numberNode1;
        try {
            tryFoldShiftMethod.invoke(peepholeFoldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldShift2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:54)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:863) */
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
    
    @Test
    public void testTryFoldShift3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -4.9E-324);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:54)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:870) */
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
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldCtorCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldCtorCall_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", numberNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = numberNode;
        Object actual = tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node numberNodeParent = (((Node) numberNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int numberNodeParentType = numberNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(numberNodeParentType, actualParentType);
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldCtorCall_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", numberNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = numberNode;
        Object actual = tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node numberNodeParent = (((Node) numberNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int numberNodeParentType = numberNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(numberNodeParentType, actualParentType);
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldInForcedStringContext(n);}
 *  */
    @Test
    public void testTryFoldCtorCall_ReturnTryFoldInForcedStringContext() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", numberNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = numberNode;
        Object actual = tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        Node numberNodeParent = (((Node) numberNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int numberNodeParentType = numberNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(numberNodeParentType, actualParentType);
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        Node numberNodeParentLast = ((Node) getFieldValue(numberNodeParent, "com.google.javascript.rhino.Node", "last"));
        Node actualParentLast = ((Node) getFieldValue(actualParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldInForcedStringContext(n);}
 *  */
    @Test
    public void testTryFoldCtorCall_ReturnTryFoldInForcedStringContext_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", numberNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = numberNode;
        Object actual = tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        
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
        String numberNodeFirstStr = ((String) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(numberNodeFirstStr, actualFirstStr);
        
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        Node numberNodeParent = (((Node) numberNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int numberNodeParentType = numberNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(numberNodeParentType, actualParentType);
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        Node numberNodeParentLast = ((Node) getFieldValue(numberNodeParent, "com.google.javascript.rhino.Node", "last"));
        Node actualParentLast = ((Node) getFieldValue(actualParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        assertTrue(deepEquals(numberNodeParentLast, actualParentLast));
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldCtorCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.isNew());
 *  */
    @Test
    public void testTryFoldCtorCall_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall(PeepholeFoldConstants.java:1292) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", nodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = ((Object) null);
        try {
            tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: inForcedStringContext(n)
 *  */
    @Test
    public void testTryFoldCtorCall_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext(PeepholeFoldConstants.java:1303)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall(PeepholeFoldConstants.java:1295) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", numberNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = numberNode;
        try {
            tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldInForcedStringContext(n);
 *  */
    @Test
    public void testTryFoldCtorCall_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(21);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1320)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall(PeepholeFoldConstants.java:1296) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", numberNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = numberNode;
        try {
            tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldInForcedStringContext(n);
 *  */
    @Test
    public void testTryFoldCtorCall_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1324)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall(PeepholeFoldConstants.java:1296) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", numberNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = numberNode;
        try {
            tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldCtorCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.isNew());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldCtorCall_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", numberNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = numberNode;
        try {
            tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return tryFoldInForcedStringContext(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldCtorCall_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", numberNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = numberNode;
        try {
            tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
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
 * @utbot.executesCondition {@code (left.isObjectLit()): False}
 * @utbot.executesCondition {@code (right.isString() && right.getString().equals("length")): False}
 *  */
    @Test
    public void testTryFoldGetProp_RightIsStringAndRightGetStringEquals() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
        tryFoldGetPropMethodArguments[1] = stringNode1;
        tryFoldGetPropMethodArguments[2] = stringNode1;
        Object actual = tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isObjectLit()): True}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.returnsFrom {@code return tryFoldObjectPropAccess(n, left, right);}
 *  */
    @Test
    public void testTryFoldGetProp_LeftIsObjectLit() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
        tryFoldGetPropMethodArguments[1] = stringNode1;
        tryFoldGetPropMethodArguments[2] = stringNode;
        Object actual = tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isObjectLit()): False}
 * @utbot.executesCondition {@code (right.isString() && right.getString().equals("length")): True}
 * @utbot.executesCondition {@code (right.getString().equals("length")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testTryFoldGetProp_NotRightGetStringEquals() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        Object stringNode2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode2, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode2)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
        tryFoldGetPropMethodArguments[1] = stringNode1;
        tryFoldGetPropMethodArguments[2] = stringNode2;
        Object actual = tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldGetProp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isObjectLit()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: right.isString() && right.getString().equals("length")
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1379) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
        tryFoldGetPropMethodArguments[1] = stringNode1;
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
 * @utbot.executesCondition {@code (left.isObjectLit()): True}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldObjectPropAccess(n, left, right);
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1477)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1376) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
        tryFoldGetPropMethodArguments[1] = stringNode1;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.isObjectLit()
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1375) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
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
 * @utbot.executesCondition {@code (left.isObjectLit()): False}
 * @utbot.executesCondition {@code (right.isString() && right.getString().equals("length")): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getString().equals("length")
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        Object stringNode2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode2)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1380) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
        tryFoldGetPropMethodArguments[1] = stringNode1;
        tryFoldGetPropMethodArguments[2] = stringNode2;
        try {
            tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.isGetProp());
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1373) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldGetProp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isObjectLit()): False}
 * @utbot.executesCondition {@code (right.isString() && right.getString().equals("length")): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isObjectLit()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: right.getString().equals("length")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldGetProp_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
        tryFoldGetPropMethodArguments[1] = stringNode1;
        tryFoldGetPropMethodArguments[2] = numberNode;
        try {
            tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.isGetProp());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldGetProp_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldGetProp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldGetProp1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(87);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = numberNode;
        tryFoldGetPropMethodArguments[1] = stringNode;
        tryFoldGetPropMethodArguments[2] = stringNode1;
        Object actual = tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node numberNodeParent = (((Node) numberNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int numberNodeParentType = numberNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(numberNodeParentType, actualParentType);
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    @Test
    public void testTryFoldGetProp2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(64);
        Object stringNode2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode2)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = stringNode;
        tryFoldGetPropMethodArguments[1] = stringNode1;
        tryFoldGetPropMethodArguments[2] = stringNode2;
        Object actual = tryFoldGetPropMethod.invoke(peepholeFoldConstants, tryFoldGetPropMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        assertTrue(deepEquals(stringNodeParent, actualParent));
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.compareToUndefined
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method compareToUndefined(com.google.javascript.rhino.Node, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_ReturnFalse() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 17;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return valueUndefined;}
 *  */
    @Test
    public void testCompareToUndefined_ReturnValueUndefined() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 45;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return equivalent;}
 *  */
    @Test
    public void testCompareToUndefined_ReturnEquivalent() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 12;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method compareToUndefined(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return !valueUndefined;}
 *  */
    @Test
    public void testCompareToUndefined_NotValueUndefined() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 46;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return !equivalent;}
 *  */
    @Test
    public void testCompareToUndefined_NotEquivalent() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 13;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_ReturnFalse_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 16;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_ReturnFalse_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 16;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareToUndefined(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(NodeUtil.isLiteralValue(value, true));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = -255;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Preconditions.checkState(NodeUtil.isLiteralValue(value, true));
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCompareToUndefined_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", nodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = node;
        compareToUndefinedMethodArguments[1] = -255;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isUndefined(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(op) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = -255;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(NodeUtil.isLiteralValue(value, true));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined_ThrowIllegalStateException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = -255;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareToUndefined(com.google.javascript.rhino.Node, int)
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined6() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined8() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCompareToUndefined13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(41);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCompareToUndefined16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined17() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined18() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined19() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", stringNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = stringNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined20() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined21() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined22() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(124);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined23() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compareToUndefined(com.google.javascript.rhino.Node, int)
    
    @Test(expected = StackOverflowError.class)
    public void testCompareToUndefined24() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCompareToUndefined25() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCompareToUndefined26() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareToUndefined27() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareToUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:496)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:504)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:507)
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:626)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareToUndefined(PeepholeFoldConstants.java:1228) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method compareToUndefined(com.google.javascript.rhino.Node, int)
    
    @Test(timeout = 1000L)
    public void testCompareToUndefined28() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", numberNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = numberNode;
        compareToUndefinedMethodArguments[1] = 0;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.compareToNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method compareToNull(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return equivalent;}
 *  */
    @Test
    public void testCompareToNull_ReturnEquivalent() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", numberNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = numberNode;
        compareToNullMethodArguments[1] = 12;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return valueNull;}
 *  */
    @Test
    public void testCompareToNull_ReturnValueNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", numberNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = numberNode;
        compareToNullMethodArguments[1] = 45;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return equivalent;}
 *  */
    @Test
    public void testCompareToNull_ReturnEquivalent_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", stringNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = stringNode;
        compareToNullMethodArguments[1] = 12;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method compareToNull(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return !equivalent;}
 *  */
    @Test
    public void testCompareToNull_NotEquivalent() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", numberNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = numberNode;
        compareToNullMethodArguments[1] = 13;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return !valueNull;}
 *  */
    @Test
    public void testCompareToNull_NotValueNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", numberNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = numberNode;
        compareToNullMethodArguments[1] = 46;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return valueNull;}
 *  */
    @Test
    public void testCompareToNull_BooleanEquivalentInitializedByValueUndefinedOrValueNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", numberNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = numberNode;
        compareToNullMethodArguments[1] = 45;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return !valueNull;}
 *  */
    @Test
    public void testCompareToNull_NotValueNull_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", numberNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = numberNode;
        compareToNullMethodArguments[1] = 46;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return valueNull;}
 *  */
    @Test
    public void testCompareToNull_BooleanEquivalentInitializedByValueUndefinedOrValueNull_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", numberNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = numberNode;
        compareToNullMethodArguments[1] = 45;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return !equivalent;}
 *  */
    @Test
    public void testCompareToNull_NotEquivalent_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", numberNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = numberNode;
        compareToNullMethodArguments[1] = 13;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.returnsFrom {@code return valueNull;}
 *  */
    @Test
    public void testCompareToNull_BooleanEquivalentInitializedByValueUndefinedOrValueNull_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", stringNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = stringNode;
        compareToNullMethodArguments[1] = 45;
        boolean actual = ((Boolean) compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareToNull(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(op) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompareToNull_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", numberNodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = numberNode;
        compareToNullMethodArguments[1] = -255;
        try {
            compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToNull(com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: boolean valueUndefined = NodeUtil.isUndefined(value);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCompareToNull_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToNullMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToNull", nodeType, intType);
        compareToNullMethod.setAccessible(true);
        java.lang.Object[] compareToNullMethodArguments = new java.lang.Object[2];
        compareToNullMethodArguments[0] = node;
        compareToNullMethodArguments[1] = -255;
        try {
            compareToNullMethod.invoke(peepholeFoldConstants, compareToNullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.isEqualityOp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isEqualityOp(int)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isEqualityOp(int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsEqualityOp_ReturnFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Method isEqualityOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isEqualityOp", intType);
        isEqualityOpMethod.setAccessible(true);
        java.lang.Object[] isEqualityOpMethodArguments = new java.lang.Object[1];
        isEqualityOpMethodArguments[0] = -255;
        boolean actual = ((Boolean) isEqualityOpMethod.invoke(peepholeFoldConstants, isEqualityOpMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isEqualityOp(int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsEqualityOp_ReturnTrue() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Method isEqualityOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isEqualityOp", intType);
        isEqualityOpMethod.setAccessible(true);
        java.lang.Object[] isEqualityOpMethodArguments = new java.lang.Object[1];
        isEqualityOpMethodArguments[0] = 12;
        boolean actual = ((Boolean) isEqualityOpMethod.invoke(peepholeFoldConstants, isEqualityOpMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.isAssignmentTarget
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAssignmentTarget(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(parent)): True}
 * @utbot.executesCondition {@code (parent.getFirstChild() == n): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignmentTarget_ParentGetFirstChildEqualsN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(93);
        setField(parent, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", numberNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(peepholeFoldConstants, isAssignmentTargetMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(parent)): False}
 * @utbot.executesCondition {@code (parent.isInc()): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignmentTarget_NotParentIsInc() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(102);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", numberNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(peepholeFoldConstants, isAssignmentTargetMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(parent)): False}
 * @utbot.executesCondition {@code (parent.isInc()): True}
 * @utbot.executesCondition {@code (parent.isDec()): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignmentTarget_ParentIsDec() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(103);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", numberNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(peepholeFoldConstants, isAssignmentTargetMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(parent)): True}
 * @utbot.executesCondition {@code (parent.getFirstChild() == n): False}
 * @utbot.executesCondition {@code (parent.isInc()): True}
 * @utbot.executesCondition {@code (parent.isDec()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsAssignmentTarget_NotParentIsDec() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(91);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", numberNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(peepholeFoldConstants, isAssignmentTargetMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAssignmentTarget(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testIsAssignmentTarget_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.isAssignmentTarget] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.isAssignmentTarget(PeepholeFoldConstants.java:1410) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", nodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = ((Object) null);
        try {
            isAssignmentTargetMethod.invoke(peepholeFoldConstants, isAssignmentTargetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareAsNumbers(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testCompareAsNumbers_ReturnNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = -255;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareAsNumbers(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testCompareAsNumbers_ReturnNull_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = -255;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareAsNumbers(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testCompareAsNumbers_ReturnNull_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = -255;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareAsNumbers(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getNumberValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Double leftValue = NodeUtil.getNumberValue(left);
 *  */
    @Test
    public void testCompareAsNumbers_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:794)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:777)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:286)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1186) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = -255;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareAsNumbers(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getNumberValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Double leftValue = NodeUtil.getNumberValue(left);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCompareAsNumbers_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, nodeType, nodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = -255;
        compareAsNumbersMethodArguments[1] = node;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testCompareAsNumbers1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(124);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(49);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(58);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(85);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers8() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers9() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testCompareAsNumbers10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(95);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:881)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:777)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:286)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1186) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:957)
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:942)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:857)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:777)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:286)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1186) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:274)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1190) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:794)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:777)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:140)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:314)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1186) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:274)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1190) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:274)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1190) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:125)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:133)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:314)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1186) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers17() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:274)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1190) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers18() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:274)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1190) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testCompareAsNumbers19() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCompareAsNumbers20() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareAsNumbers21() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareAsNumbers22() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCompareAsNumbers23() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testCompareAsNumbers24() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, numberNodeType, numberNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = numberNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
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
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldGetElem_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = stringNode1;
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        Object actual = tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldArrayAccess(n, left, right);}
 *  */
    @Test
    public void testTryFoldGetElem_ReturnTryFoldArrayAccess() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(92);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = stringNode1;
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        Object actual = tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node stringNodeParentFirst = ((Node) getFieldValue(stringNodeParent, "com.google.javascript.rhino.Node", "first"));
        Node actualParentFirst = ((Node) getFieldValue(actualParent, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldArrayAccess(n, left, right);}
 *  */
    @Test
    public void testTryFoldGetElem_ReturnTryFoldArrayAccess_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(102);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = stringNode1;
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        Object actual = tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldArrayAccess(n, left, right);}
 *  */
    @Test
    public void testTryFoldGetElem_ReturnTryFoldArrayAccess_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(89);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(63);
        Object stringNode2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode2)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = stringNode1;
        tryFoldGetElemMethodArguments[2] = stringNode2;
        Object actual = tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isObjectLit()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldObjectPropAccess(n, left, right);
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1477)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1360) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = stringNode1;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.isObjectLit()
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1359) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.isGetElem());
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1357) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetElem()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.isGetElem());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldGetElem_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = ((Object) null);
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldGetElem1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = stringNode1;
        tryFoldGetElemMethodArguments[2] = stringNode1;
        Object actual = tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldGetElem2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1431)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1364) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = stringNode1;
        tryFoldGetElemMethodArguments[2] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldGetElem3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(96);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(63);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:54)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1440)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1364) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = stringNode1;
        tryFoldGetElemMethodArguments[2] = numberNode;
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldGetElem4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(89);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode2, "com.google.javascript.rhino.Node$NumberNode", "number", 2.0);
        (((Node) numberNode2)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:557)
            com.google.javascript.rhino.Node.replaceChild(Node.java:727)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1469)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1364) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", numberNodeType, numberNodeType, numberNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = numberNode;
        tryFoldGetElemMethodArguments[1] = numberNode1;
        tryFoldGetElemMethodArguments[2] = numberNode2;
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldGetElem5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(35);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(89);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Node node1 = new Node(63);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -1.074014765E9);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:54)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1445)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1364) */
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
    
    @Test
    public void testTryFoldGetElem6() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(35);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(89);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:54)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1458)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1364) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", nodeType, nodeType, nodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = node;
        tryFoldGetElemMethodArguments[1] = numberNode;
        tryFoldGetElemMethodArguments[2] = numberNode1;
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldGetElem7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(96);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(63);
        Object stringNode2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode2)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetElem", stringNodeType, stringNodeType, stringNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[3];
        tryFoldGetElemMethodArguments[0] = stringNode;
        tryFoldGetElemMethodArguments[1] = stringNode1;
        tryFoldGetElemMethodArguments[2] = stringNode2;
        try {
            tryFoldGetElemMethod.invoke(peepholeFoldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldArrayAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldArrayAccess_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(89);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = stringNode;
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = ((Object) null);
        Object actual = tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node stringNodeParentFirst = ((Node) getFieldValue(stringNodeParent, "com.google.javascript.rhino.Node", "first"));
        Node actualParentFirst = ((Node) getFieldValue(actualParent, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(stringNodeParentFirst, actualParentFirst));
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldArrayAccess_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(102);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = stringNode;
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = ((Object) null);
        Object actual = tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldArrayAccess_ReturnN_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(103);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = stringNode;
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = ((Object) null);
        Object actual = tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldArrayAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testTryFoldArrayAccess_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1423) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", nodeType, nodeType, nodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = ((Object) null);
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = ((Object) null);
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (intIndex != index): False}
 * @utbot.executesCondition {@code (intIndex < 0): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isNumber()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node current = left.getFirstChild();
 *  */
    @Test
    public void testTryFoldArrayAccess_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(89);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1449) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", nodeType, nodeType, nodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = node;
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = numberNode;
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldArrayAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldArrayAccess1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(88);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = stringNode;
        tryFoldArrayAccessMethodArguments[1] = numberNode;
        tryFoldArrayAccessMethodArguments[2] = stringNode1;
        Object actual = tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node stringNodeParent = (((Node) stringNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int stringNodeParentType = stringNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(stringNodeParentType, actualParentType);
        
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        assertTrue(deepEquals(stringNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldArrayAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldArrayAccess2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(90);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1431) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = stringNode;
        tryFoldArrayAccessMethodArguments[1] = numberNode;
        tryFoldArrayAccessMethodArguments[2] = ((Object) null);
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArrayAccess3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(89);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 8454144.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:557)
            com.google.javascript.rhino.Node.replaceChild(Node.java:727)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1469) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = stringNode;
        tryFoldArrayAccessMethodArguments[1] = node;
        tryFoldArrayAccessMethodArguments[2] = numberNode;
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArrayAccess4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(89);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:54)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1458) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = stringNode;
        tryFoldArrayAccessMethodArguments[1] = node;
        tryFoldArrayAccessMethodArguments[2] = numberNode;
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArrayAccess5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(89);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 8.589934594000124E9);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.error(AbstractPeepholeOptimization.java:54)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1440) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = numberNode;
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = numberNode1;
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldArrayAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldArrayAccess6() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(98);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = stringNode;
        tryFoldArrayAccessMethodArguments[1] = numberNode;
        tryFoldArrayAccessMethodArguments[2] = stringNode1;
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldArrayAccess7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(92);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = stringNode;
        tryFoldArrayAccessMethodArguments[1] = numberNode;
        tryFoldArrayAccessMethodArguments[2] = stringNode1;
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldChildAddString_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAdd()}
 *  */
    @Test
    public void testTryFoldChildAddString_NodeIsAdd() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.isAdd()
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(43);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.isAdd()
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.isAdd()
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAdd()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lr.isString()
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:622) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.isAdd()
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldChildAddString1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = node;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldChildAddString2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = stringNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldChildAddString3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = stringNode;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldChildAddString4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = stringNode;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldChildAddString5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = stringNode;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldChildAddString6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldChildAddString7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(122);
        Node first2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTryFoldChildAddString8() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode1;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString9() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(44);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString10() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString11() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode1;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString12() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(41);
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString13() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString14() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode1;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString15() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode1;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString16() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode1;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString17() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString18() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString19() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(105);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", stringNodeType, stringNodeType, stringNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = stringNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString20() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode1;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString21() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString22() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode1;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString23() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", stringNodeType, stringNodeType, stringNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = stringNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    @Test
    public void testTryFoldChildAddString24() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(47);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", stringNodeType, stringNodeType, stringNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = stringNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        Object actual = tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldChildAddString25() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldChildAddString26() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldChildAddString27() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldChildAddString28() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldChildAddString29() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString30() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(21);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:617) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode1;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString31() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:636) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString32() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException] */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString33() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(21);
        Object numberNode2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode2)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(124);
        setField(numberNode2, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:617) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", numberNodeType, numberNodeType, numberNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = numberNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode1;
        tryFoldChildAddStringMethodArguments[2] = numberNode2;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString34() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString35() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:636) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString36() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:636) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString37() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:636) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString38() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:636) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString39() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:496)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:504)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:507)
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:626)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:613) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString40() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException] */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString41() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:616)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:636) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", stringNodeType, stringNodeType, stringNodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = stringNode;
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString42() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:636) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = stringNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString43() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:636) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString44() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString45() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString46() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString47() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(41);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString48() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:636) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString49() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(47);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:592)
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:616)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:613) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString50() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString51() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:614) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldChildAddString52() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(29);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException] */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldChildAddString53() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldChildAddString54() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = node;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldChildAddString55() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldChildAddString56() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldChildAddString57() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldChildAddString58() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = numberNode;
        tryFoldChildAddStringMethodArguments[2] = numberNode1;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryFoldChildAddString59() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = numberNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
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
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldBinaryOperator_ReturnSubtree_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: default}
 *  */
    @Test
    public void testTryFoldBinaryOperator_ReturnSubtree_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryUnfoldAssignOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: Token.ASSIGN_MOD}
 * @utbot.returnsFrom {@code return tryUnfoldAssignOp(subtree, left, right);}
 *  */
    @Test
    public void testTryFoldBinaryOperator_PeepholeFoldConstantsTryUnfoldAssignOp() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(true);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(94);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldShift(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: Token.URSH}
 * @utbot.returnsFrom {@code return tryFoldShift(subtree, left, right);}
 *  */
    @Test
    public void testTryFoldBinaryOperator_PeepholeFoldConstantsTryFoldShift() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(20);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", stringNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = stringNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(stringNodeFirstType, actualFirstType);
        
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int stringNodeFirstNextSourcePosition = stringNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(stringNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator(PeepholeFoldConstants.java:100) */
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(14);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", next);
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
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
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(22);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(93);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(19);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
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
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(16);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
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
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(46);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
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
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    public void testTryFoldBinaryOperator12() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    public void testTryFoldBinaryOperator13() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(14);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
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
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    public void testTryFoldBinaryOperator14() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        Node numberNodeFirstNext = numberNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int numberNodeFirstNextSourcePosition = numberNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    public void testTryFoldBinaryOperator15() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(16);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBinaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldBinaryOperator", stringNodeType);
        tryFoldBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldBinaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldBinaryOperatorMethodArguments[0] = stringNode;
        Object actual = tryFoldBinaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldBinaryOperatorMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstType = stringNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(stringNodeFirstType, actualFirstType);
        
        Node stringNodeFirstNext = stringNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(stringNodeFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int stringNodeFirstNextSourcePosition = stringNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(stringNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldBinaryOperator(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBinaryOperator16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(13);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryConvertOperandsToNumber(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryConvertOperandsToNumber() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", numberNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = numberNode;
        tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryConvertOperandsToNumber_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", numberNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = numberNode;
        tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryConvertOperandsToNumber_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", numberNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = numberNode;
        tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryConvertOperandsToNumber_4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(100);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", numberNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = numberNode;
        tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryConvertOperandsToNumber_3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", numberNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = numberNode;
        tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryConvertOperandsToNumber(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node c = n.getFirstChild(); c != null; c = next)
 *  */
    @Test
    public void testTryConvertOperandsToNumber_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber(PeepholeFoldConstants.java:234) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", nodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = ((Object) null);
        try {
            tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryConvertToNumber(c);
 *  */
    @Test
    public void testTryConvertOperandsToNumber_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(98);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:241)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:251)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber(PeepholeFoldConstants.java:236) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", numberNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = numberNode;
        try {
            tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryConvertToNumber(c);
 *  */
    @Test
    public void testTryConvertOperandsToNumber_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:241)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:248)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber(PeepholeFoldConstants.java:236) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", numberNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = numberNode;
        try {
            tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryReduceOperandsForOp(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceOperandsForOp(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType())}
 *  */
    @Test
    public void testTryReduceOperandsForOp_SwitchNGetType() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceOperandsForOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceOperandsForOp", numberNodeType);
        tryReduceOperandsForOpMethod.setAccessible(true);
        java.lang.Object[] tryReduceOperandsForOpMethodArguments = new java.lang.Object[1];
        tryReduceOperandsForOpMethodArguments[0] = numberNode;
        tryReduceOperandsForOpMethod.invoke(peepholeFoldConstants, tryReduceOperandsForOpMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceOperandsForOp(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.ASSIGN_DIV}
 *  */
    @Test
    public void testTryReduceOperandsForOp_PeepholeFoldConstantsTryConvertToNumber() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(97);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(39);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceOperandsForOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceOperandsForOp", stringNodeType);
        tryReduceOperandsForOpMethod.setAccessible(true);
        java.lang.Object[] tryReduceOperandsForOpMethodArguments = new java.lang.Object[1];
        tryReduceOperandsForOpMethodArguments[0] = stringNode;
        tryReduceOperandsForOpMethod.invoke(peepholeFoldConstants, tryReduceOperandsForOpMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceOperandsForOp(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.NEG}
 *  */
    @Test
    public void testTryReduceOperandsForOp_PeepholeFoldConstantsTryConvertOperandsToNumber() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(25);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceOperandsForOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceOperandsForOp", numberNodeType);
        tryReduceOperandsForOpMethod.setAccessible(true);
        java.lang.Object[] tryReduceOperandsForOpMethodArguments = new java.lang.Object[1];
        tryReduceOperandsForOpMethodArguments[0] = numberNode;
        tryReduceOperandsForOpMethod.invoke(peepholeFoldConstants, tryReduceOperandsForOpMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryReduceOperandsForOp(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceOperandsForOp(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTryReduceOperandsForOp_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp(PeepholeFoldConstants.java:193) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceOperandsForOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceOperandsForOp", nodeType);
        tryReduceOperandsForOpMethod.setAccessible(true);
        java.lang.Object[] tryReduceOperandsForOpMethodArguments = new java.lang.Object[1];
        tryReduceOperandsForOpMethodArguments[0] = ((Object) null);
        try {
            tryReduceOperandsForOpMethod.invoke(peepholeFoldConstants, tryReduceOperandsForOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceOperandsForOp(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.ASSIGN_DIV}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryConvertToNumber(n.getLastChild());
 *  */
    @Test
    public void testTryReduceOperandsForOp_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(91);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:241)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp(PeepholeFoldConstants.java:212) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceOperandsForOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceOperandsForOp", numberNodeType);
        tryReduceOperandsForOpMethod.setAccessible(true);
        java.lang.Object[] tryReduceOperandsForOpMethodArguments = new java.lang.Object[1];
        tryReduceOperandsForOpMethodArguments[0] = numberNode;
        try {
            tryReduceOperandsForOpMethod.invoke(peepholeFoldConstants, tryReduceOperandsForOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldAddConstantString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAddConstantString_NodeIsString() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(-255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = node;
        tryFoldAddConstantStringMethodArguments[2] = stringNode;
        Node actual = ((Node) tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (rightString != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getStringValue(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getStringValue(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAddConstantString_RightStringEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = stringNode;
        tryFoldAddConstantStringMethodArguments[2] = stringNode1;
        Node actual = ((Node) tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldAddConstantString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True},
    ///     {@code (left.isString() || right.isString()): False}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#getStringValue(com.google.javascript.rhino.Node)} 4 times,
    ///     {@link com.google.javascript.rhino.Node#getType()} twice,
    ///     {@link com.google.javascript.rhino.Node#getString()} twice
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAddConstantString_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = stringNode;
        tryFoldAddConstantStringMethodArguments[2] = stringNode1;
        Node actual = ((Node) tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAddConstantString_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(43);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = stringNode;
        tryFoldAddConstantStringMethodArguments[2] = stringNode1;
        Node actual = ((Node) tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAddConstantString_ReturnN_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(44);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = stringNode;
        tryFoldAddConstantStringMethodArguments[2] = stringNode1;
        Node actual = ((Node) tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAddConstantString_ReturnN_3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = stringNode;
        tryFoldAddConstantStringMethodArguments[2] = stringNode1;
        Node actual = ((Node) tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAddConstantString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.isString() || right.isString()
 *  */
    @Test
    public void testTryFoldAddConstantString_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString(PeepholeFoldConstants.java:666) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.isString()
 *  */
    @Test
    public void testTryFoldAddConstantString_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString(PeepholeFoldConstants.java:667) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = node;
        tryFoldAddConstantStringMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAddConstantString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAddConstantString_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(39);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = node;
        tryFoldAddConstantStringMethodArguments[2] = stringNode;
        try {
            tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldAddConstantString_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(38);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = node;
        tryFoldAddConstantStringMethodArguments[2] = stringNode;
        try {
            tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAddConstantString_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = new Node(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = node;
        tryFoldAddConstantStringMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.performArithmeticOp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method performArithmeticOp(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#performArithmeticOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testPerformArithmeticOp_ReturnNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method performArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("performArithmeticOp", intType, numberNodeType, numberNodeType);
        performArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] performArithmeticOpMethodArguments = new java.lang.Object[3];
        performArithmeticOpMethodArguments[0] = -255;
        performArithmeticOpMethodArguments[1] = numberNode;
        performArithmeticOpMethodArguments[2] = ((Object) null);
        Node actual = ((Node) performArithmeticOpMethod.invoke(peepholeFoldConstants, performArithmeticOpMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#performArithmeticOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testPerformArithmeticOp_ReturnNull_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method performArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("performArithmeticOp", intType, numberNodeType, numberNodeType);
        performArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] performArithmeticOpMethodArguments = new java.lang.Object[3];
        performArithmeticOpMethodArguments[0] = -255;
        performArithmeticOpMethodArguments[1] = numberNode;
        performArithmeticOpMethodArguments[2] = ((Object) null);
        Node actual = ((Node) performArithmeticOpMethod.invoke(peepholeFoldConstants, performArithmeticOpMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldObjectPropAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): True}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_NotRightIsString() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        Object numberNode2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode2)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode1;
        tryFoldObjectPropAccessMethodArguments[2] = numberNode2;
        Object actual = tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): False}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_LeftIsObjectLit() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode1;
        tryFoldObjectPropAccessMethodArguments[2] = ((Object) null);
        Object actual = tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): True}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_IsAssignmentTarget() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(95);
        setField(parent, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode1;
        tryFoldObjectPropAccessMethodArguments[2] = stringNode;
        Object actual = tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node numberNodeParent = (((Node) numberNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int numberNodeParentType = numberNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(numberNodeParentType, actualParentType);
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        Node numberNodeParentFirst = ((Node) getFieldValue(numberNodeParent, "com.google.javascript.rhino.Node", "first"));
        Node actualParentFirst = ((Node) getFieldValue(actualParent, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(numberNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(numberNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(numberNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(numberNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(numberNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(numberNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(numberNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(numberNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(numberNodeParentFirst, actualParentFirst));
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): True}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_IsAssignmentTarget_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(102);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", nodeType, nodeType, nodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = node;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode;
        tryFoldObjectPropAccessMethodArguments[2] = numberNode1;
        Node actual = ((Node) tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments));
        
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
        
        int nodeSourcePosition = node.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(nodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node nodeParent = node.getParent();
        Node actualParent = actual.getParent();
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): True}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_IsAssignmentTarget_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(103);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", nodeType, nodeType, nodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = node;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode;
        tryFoldObjectPropAccessMethodArguments[2] = numberNode1;
        Node actual = ((Node) tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments));
        
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
        
        int nodeSourcePosition = node.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(nodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node nodeParent = node.getParent();
        Node actualParent = actual.getParent();
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ValueEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(95);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        Object numberNode2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode2)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode1;
        tryFoldObjectPropAccessMethodArguments[2] = numberNode2;
        Object actual = tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        
        double numberNodeNumber = ((Double) getFieldValue(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(numberNodeNumber, actualNumber, 1.0E-6);
        
        int numberNodeType1 = (((Node) numberNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(numberNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int numberNodeSourcePosition = (((Node) numberNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(numberNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node numberNodeParent = (((Node) numberNode)).getParent();
        Node actualParent = (((Node) actual)).getParent();
        int numberNodeParentType = numberNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(numberNodeParentType, actualParentType);
        
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        assertTrue(deepEquals(numberNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldObjectPropAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !left.isObjectLit() || !right.isString()
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1477) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode1;
        tryFoldObjectPropAccessMethodArguments[2] = ((Object) null);
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !left.isObjectLit() || !right.isString()
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1477) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = ((Object) null);
        tryFoldObjectPropAccessMethodArguments[2] = ((Object) null);
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !left.isObjectLit() || !right.isString()
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1477) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = ((Object) null);
        tryFoldObjectPropAccessMethodArguments[2] = ((Object) null);
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: c.getString().equals(right.getString())
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(95);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1492) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", nodeType, nodeType, nodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = node;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode;
        tryFoldObjectPropAccessMethodArguments[2] = stringNode;
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: mayHaveSideEffects(c.getFirstChild())
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(95);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:794)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:117)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1508) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode1;
        tryFoldObjectPropAccessMethodArguments[2] = stringNode;
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldObjectPropAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(NodeUtil.isGet(n));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldObjectPropAccess_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = ((Object) null);
        tryFoldObjectPropAccessMethodArguments[2] = ((Object) null);
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: c.getString().equals(right.getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldObjectPropAccess_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(95);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode1;
        tryFoldObjectPropAccessMethodArguments[2] = node;
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: c.getString().equals(right.getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldObjectPropAccess_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(95);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode1;
        tryFoldObjectPropAccessMethodArguments[2] = node;
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!left.isObjectLit()): True}
 * @utbot.executesCondition {@code (!right.isString()): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(c.getType()) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldObjectPropAccess_ThrowIllegalStateException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(95);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(64);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(-255);
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first1);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", numberNodeType, numberNodeType, numberNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = numberNode;
        tryFoldObjectPropAccessMethodArguments[1] = numberNode1;
        tryFoldObjectPropAccessMethodArguments[2] = stringNode;
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
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
 * @utbot.executesCondition {@code (leftVal == TernaryValue.UNKNOWN): True}
 *  */
    @Test
    public void testTryFoldUnaryOperator_LeftValEqualsTernaryValueUNKNOWN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-256);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
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
        
        int nodeFirstSourcePosition = nodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
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
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal == TernaryValue.UNKNOWN): False}
 *  */
    @Test
    public void testTryFoldUnaryOperator_LeftValNotEqualsTernaryValueUNKNOWN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-226);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(41);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", numberNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        
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
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node numberNodeLast = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal == TernaryValue.UNKNOWN): False}
 *  */
    @Test
    public void testTryFoldUnaryOperator_LeftValNotEqualsTernaryValueUNKNOWN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(47);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", numberNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = numberNode;
        Object actual = tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        
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
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node numberNodeLast = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        assertTrue(deepEquals(numberNodeLast, actualLast));
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:335) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldUnaryOperator(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldUnaryOperator_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldUnaryOperator_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", stringNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = stringNode;
        try {
            tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldInForcedStringContext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!objectType.isName()): True}
 *  */
    @Test
    public void testTryFoldInForcedStringContext_NotObjectTypeIsName() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", numberNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = numberNode;
        Object actual = tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        
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
        int numberNodeFirstType = numberNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(numberNodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(numberNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int numberNodeFirstSourcePosition = numberNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(numberNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
        assertTrue(deepEquals(numberNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!objectType.isName()): False}
 * @utbot.executesCondition {@code (objectType.getString().equals("String")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testTryFoldInForcedStringContext_NotObjectTypeGetStringEquals() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", stringNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = stringNode;
        Object actual = tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String stringNodeFirstStr = ((String) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(stringNodeFirstStr, actualFirstStr);
        
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
        
        int stringNodeFirstSourcePosition = stringNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(stringNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldInForcedStringContext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isNew()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.isNew());
 *  */
    @Test
    public void testTryFoldInForcedStringContext_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1317) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", nodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = ((Object) null);
        try {
            tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !objectType.isName()
 *  */
    @Test
    public void testTryFoldInForcedStringContext_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1320) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", numberNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = numberNode;
        try {
            tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!objectType.isName()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objectType.getString().equals("String")
 *  */
    @Test
    public void testTryFoldInForcedStringContext_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1324) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", numberNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = numberNode;
        try {
            tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldInForcedStringContext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.isNew());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldInForcedStringContext_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", numberNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = numberNode;
        try {
            tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!objectType.isName()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: objectType.getString().equals("String")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldInForcedStringContext_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", numberNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = numberNode;
        try {
            tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmeticOp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldArithmeticOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmeticOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldArithmeticOp_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmeticOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticOpMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticOpMethodArguments[0] = stringNode;
        tryFoldArithmeticOpMethodArguments[1] = stringNode;
        tryFoldArithmeticOpMethodArguments[2] = ((Object) null);
        Object actual = tryFoldArithmeticOpMethod.invoke(peepholeFoldConstants, tryFoldArithmeticOpMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmeticOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldArithmeticOp_ReturnN_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(49);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmeticOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticOpMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticOpMethodArguments[0] = stringNode;
        tryFoldArithmeticOpMethodArguments[1] = stringNode1;
        tryFoldArithmeticOpMethodArguments[2] = ((Object) null);
        Object actual = tryFoldArithmeticOpMethod.invoke(peepholeFoldConstants, tryFoldArithmeticOpMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmeticOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldArithmeticOp_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmeticOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticOpMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticOpMethodArguments[0] = stringNode;
        tryFoldArithmeticOpMethodArguments[1] = stringNode1;
        tryFoldArithmeticOpMethodArguments[2] = ((Object) null);
        Object actual = tryFoldArithmeticOpMethod.invoke(peepholeFoldConstants, tryFoldArithmeticOpMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int stringNodeType1 = (((Node) stringNode)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(stringNodeType1, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int stringNodeSourcePosition = (((Node) stringNode)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(stringNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldArithmeticOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmeticOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node result = performArithmeticOp(n.getType(), left, right);
 *  */
    @Test
    public void testTryFoldArithmeticOp_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmeticOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmeticOp(PeepholeFoldConstants.java:688) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmeticOp", nodeType, nodeType, nodeType);
        tryFoldArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticOpMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticOpMethodArguments[0] = ((Object) null);
        tryFoldArithmeticOpMethodArguments[1] = ((Object) null);
        tryFoldArithmeticOpMethodArguments[2] = ((Object) null);
        try {
            tryFoldArithmeticOpMethod.invoke(peepholeFoldConstants, tryFoldArithmeticOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldArithmeticOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmeticOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#performArithmeticOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Node result = performArithmeticOp(n.getType(), left, right);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldArithmeticOp_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Node node = new Node(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmeticOp", stringNodeType, stringNodeType, stringNodeType);
        tryFoldArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticOpMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticOpMethodArguments[0] = stringNode;
        tryFoldArithmeticOpMethodArguments[1] = node;
        tryFoldArithmeticOpMethodArguments[2] = ((Object) null);
        try {
            tryFoldArithmeticOpMethod.invoke(peepholeFoldConstants, tryFoldArithmeticOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNormalizedNodeType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#getNormalizedNodeType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return type;}
 *  */
    @Test
    public void testGetNormalizedNodeType_NodeGetType() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", numberNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = numberNode;
        int actual = ((Integer) getNormalizedNodeTypeMethod.invoke(peepholeFoldConstants, getNormalizedNodeTypeMethodArguments));
        
        assertEquals(-255, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNormalizedNodeType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#getNormalizedNodeType(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = n.getType();
 *  */
    @Test
    public void testGetNormalizedNodeType_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType(PeepholeFoldConstants.java:1168) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", nodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = ((Object) null);
        try {
            getNormalizedNodeTypeMethod.invoke(peepholeFoldConstants, getNormalizedNodeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#getNormalizedNodeType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getPureBooleanValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testGetNormalizedNodeType_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(122);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:794)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:777)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:140)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:133)
            com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType(PeepholeFoldConstants.java:1170) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", numberNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = numberNode;
        try {
            getNormalizedNodeTypeMethod.invoke(peepholeFoldConstants, getNormalizedNodeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getNormalizedNodeType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#getNormalizedNodeType(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TernaryValue value = NodeUtil.getPureBooleanValue(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetNormalizedNodeType_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", numberNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = numberNode;
        try {
            getNormalizedNodeTypeMethod.invoke(peepholeFoldConstants, getNormalizedNodeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#getNormalizedNodeType(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: TernaryValue value = NodeUtil.getPureBooleanValue(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetNormalizedNodeType_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", numberNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = numberNode;
        try {
            getNormalizedNodeTypeMethod.invoke(peepholeFoldConstants, getNormalizedNodeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#getNormalizedNodeType(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TernaryValue value = NodeUtil.getPureBooleanValue(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetNormalizedNodeType_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", numberNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = numberNode;
        try {
            getNormalizedNodeTypeMethod.invoke(peepholeFoldConstants, getNormalizedNodeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method inForcedStringContext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getParent().isGetElem()): True}
 * @utbot.executesCondition {@code (n.getParent().getLastChild() == n): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetElem()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 *  */
    @Test
    public void testInForcedStringContext_NGetParentGetLastChildEqualsN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", numberNodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method inForcedStringContext(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getParent()} twice,
    ///     {@link com.google.javascript.rhino.Node#isGetElem()} once,
    ///     {@link com.google.javascript.rhino.Node#isAdd()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getParent().isGetElem()): False}
 * @utbot.executesCondition {@code (n.getParent().isAdd()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInForcedStringContext_NotNGetParentIsAdd() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", numberNodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getParent().isGetElem()): False}
 * @utbot.executesCondition {@code (n.getParent().isAdd()): True}
 *  */
    @Test
    public void testInForcedStringContext_NGetParentIsAdd() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(21);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", numberNodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getParent().isGetElem()): True}
 * @utbot.executesCondition {@code (n.getParent().getLastChild() == n): False}
 * @utbot.executesCondition {@code (n.getParent().isAdd()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInForcedStringContext_NGetParentGetLastChildNotEqualsN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", numberNodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inForcedStringContext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getParent().isGetElem() && n.getParent().getLastChild() == n
 *  */
    @Test
    public void testInForcedStringContext_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext(PeepholeFoldConstants.java:1303) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", nodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = ((Object) null);
        try {
            inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getParent().isGetElem() && n.getParent().getLastChild() == n
 *  */
    @Test
    public void testInForcedStringContext_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants(false);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext(PeepholeFoldConstants.java:1303) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", numberNodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = numberNode;
        try {
            inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments);
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields884694646933800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields884694646933800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass884694646941500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields884694646933800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass884694646941500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
    }
    
        private static void setField(Object object, String fieldClassName, String fieldName, Object fieldValue) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, java.lang.reflect.InvocationTargetException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
    
        java.lang.reflect.Field modifiersField;
        
                java.lang.reflect.Method methodForGetDeclaredFields884694647348000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields884694647348000.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass884694647350400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields884694647348000.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass884694647350400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

