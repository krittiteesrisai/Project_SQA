package com.google.javascript.rhino;

import org.junit.Test;
import com.google.javascript.rhino.jstype.JSType;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_rhino_IRTest {
    ///region Test suites for executable com.google.javascript.rhino.IR.assign
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method assign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#assign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(isAssignmentTarget(target));
 *  */
    @Test
    public void testAssign_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.assign] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.isAssignmentTarget(IR.java:462)
            com.google.javascript.rhino.IR.assign(IR.java:309) */
        IR.assign(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#assign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(expr));
 *  */
    @Test
    public void testAssign_ThrowNullPointerException_1() {
        Node node = new Node(38);
        
        /* This test fails because method [com.google.javascript.rhino.IR.assign] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.assign(IR.java:310) */
        IR.assign(node, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method assign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testAssign1() throws Exception  {
        Node node = new Node(38);
        Node node1 = new Node(97);
        
        Node actual = IR.assign(node, node1);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 86;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 38;
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.type = 97;
        setField(next, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(next, "com.google.javascript.rhino.Node", "parent", expected);
        first.next = next;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", next);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.next;
        Node actualFirstNext = actualFirst.next;
        int expectedFirstNextType = expectedFirstNext.type;
        int actualFirstNextType = actualFirstNext.type;
        assertEquals(expectedFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int expectedFirstNextSourcePosition = expectedFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(expectedFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node expectedFirstNextParent = expectedFirstNext.getParent();
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node expectedFirstNextParentLast = ((Node) getFieldValue(expectedFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextParentLast = ((Node) getFieldValue(actualFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node actualFirstNextParentParent = actualFirstNextParent.getParent();
        assertNull(actualFirstNextParentParent);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testAssign2() throws Exception  {
        Node node = new Node(38);
        Node node1 = new Node(105);
        
        Node actual = IR.assign(node, node1);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 86;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 38;
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.type = 105;
        setField(next, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(next, "com.google.javascript.rhino.Node", "parent", expected);
        first.next = next;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", next);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.next;
        Node actualFirstNext = actualFirst.next;
        int expectedFirstNextType = expectedFirstNext.type;
        int actualFirstNextType = actualFirstNext.type;
        assertEquals(expectedFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int expectedFirstNextSourcePosition = expectedFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(expectedFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node expectedFirstNextParent = expectedFirstNext.getParent();
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node expectedFirstNextParentLast = ((Node) getFieldValue(expectedFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextParentLast = ((Node) getFieldValue(actualFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node actualFirstNextParentParent = actualFirstNextParent.getParent();
        assertNull(actualFirstNextParentParent);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method assign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testAssign3() {
        Node node = new Node(38);
        Node node1 = new Node(78);
        
        IR.assign(node, node1);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.comma
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method comma(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testComma1() {
        Node node = new Node(72);
        
        IR.comma(node, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method comma(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testComma2() {
        Node node = new Node(17);
        
        /* This test fails because method [com.google.javascript.rhino.IR.comma] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.binaryOp(IR.java:448)
            com.google.javascript.rhino.IR.comma(IR.java:322) */
        IR.comma(node, null);
    }
    
    @Test
    public void testComma3() {
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.rhino.IR.comma] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.binaryOp(IR.java:448)
            com.google.javascript.rhino.IR.comma(IR.java:322) */
        IR.comma(node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.thisNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method thisNode()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#thisNode()}
 * @utbot.returnsFrom {@code return new Node(Token.THIS);}
 *  */
    @Test
    public void testThisNode_Return() throws Exception  {
        Node actual = IR.thisNode();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 42;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.tryCatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryCatch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(catchNode.isCatch());
 *  */
    @Test
    public void testTryCatch_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        
        /* This test fails because method [com.google.javascript.rhino.IR.tryCatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.tryCatch(IR.java:232) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryCatchMethod = iRClazz.getDeclaredMethod("tryCatch", stringNodeType, stringNodeType);
        tryCatchMethod.setAccessible(true);
        java.lang.Object[] tryCatchMethodArguments = new java.lang.Object[2];
        tryCatchMethodArguments[0] = stringNode;
        tryCatchMethodArguments[1] = ((Object) null);
        try {
            tryCatchMethod.invoke(null, tryCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(tryBody.isBlock());
 *  */
    @Test
    public void testTryCatch_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.tryCatch] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.tryCatch(IR.java:231) */
        IR.tryCatch(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryCatch(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(catchNode.isCatch());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryCatch_ThrowIllegalStateException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryCatchMethod = iRClazz.getDeclaredMethod("tryCatch", stringNodeType, stringNodeType);
        tryCatchMethod.setAccessible(true);
        java.lang.Object[] tryCatchMethodArguments = new java.lang.Object[2];
        tryCatchMethodArguments[0] = stringNode;
        tryCatchMethodArguments[1] = numberNode;
        try {
            tryCatchMethod.invoke(null, tryCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.IR#block(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node catchBody = block(catchNode).copyInformationFrom(catchNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryCatch_ThrowIllegalStateException_2() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryCatchMethod = iRClazz.getDeclaredMethod("tryCatch", stringNodeType, stringNodeType);
        tryCatchMethod.setAccessible(true);
        java.lang.Object[] tryCatchMethodArguments = new java.lang.Object[2];
        tryCatchMethodArguments[0] = stringNode;
        tryCatchMethodArguments[1] = numberNode;
        try {
            tryCatchMethod.invoke(null, tryCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatch(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(tryBody.isBlock());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryCatch_ThrowIllegalStateException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryCatchMethod = iRClazz.getDeclaredMethod("tryCatch", stringNodeType, stringNodeType);
        tryCatchMethod.setAccessible(true);
        java.lang.Object[] tryCatchMethodArguments = new java.lang.Object[2];
        tryCatchMethodArguments[0] = stringNode;
        tryCatchMethodArguments[1] = ((Object) null);
        try {
            tryCatchMethod.invoke(null, tryCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.catchNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method catchNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#catchNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.returnsFrom {@code return new Node(Token.CATCH, expr, body);}
 *  */
    @Test
    public void testCatchNode_PreconditionsCheckState() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        
        Node initialNodeNext = node.next;
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method catchNodeMethod = iRClazz.getDeclaredMethod("catchNode", nodeType, nodeType);
        catchNodeMethod.setAccessible(true);
        java.lang.Object[] catchNodeMethodArguments = new java.lang.Object[2];
        catchNodeMethodArguments[0] = node;
        catchNodeMethodArguments[1] = numberNode;
        Node actual = ((Node) catchNodeMethod.invoke(null, catchNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 120;
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.next;
        Node actualFirstNext = actualFirst.next;
        double expectedFirstNextNumber = ((Double) getFieldValue(expectedFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNextNumber = ((Double) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNextNumber, actualFirstNextNumber, 1.0E-6);
        
        int expectedFirstNextType = expectedFirstNext.type;
        int actualFirstNextType = actualFirstNext.type;
        assertEquals(expectedFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int expectedFirstNextSourcePosition = expectedFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(expectedFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node expectedFirstNextParent = expectedFirstNext.getParent();
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node expectedFirstNextParentLast = ((Node) getFieldValue(expectedFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextParentLast = ((Node) getFieldValue(actualFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        int expectedFirstNextParentSourcePosition = expectedFirstNextParent.getSourcePosition();
        int actualFirstNextParentSourcePosition = actualFirstNextParent.getSourcePosition();
        assertEquals(expectedFirstNextParentSourcePosition, actualFirstNextParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node actualFirstNextParentParent = actualFirstNextParent.getParent();
        assertNull(actualFirstNextParentParent);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNodeNext = node.next;
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeNext == finalNodeNext);
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method catchNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#catchNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(body.isBlock());
 *  */
    @Test
    public void testCatchNode_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.rhino.IR.catchNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.catchNode(IR.java:247) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method catchNodeMethod = iRClazz.getDeclaredMethod("catchNode", stringNodeType, stringNodeType);
        catchNodeMethod.setAccessible(true);
        java.lang.Object[] catchNodeMethodArguments = new java.lang.Object[2];
        catchNodeMethodArguments[0] = stringNode;
        catchNodeMethodArguments[1] = ((Object) null);
        try {
            catchNodeMethod.invoke(null, catchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#catchNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(expr.isName());
 *  */
    @Test
    public void testCatchNode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.catchNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.catchNode(IR.java:246) */
        IR.catchNode(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method catchNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#catchNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(body.isBlock());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCatchNode_ThrowIllegalStateException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method catchNodeMethod = iRClazz.getDeclaredMethod("catchNode", stringNodeType, stringNodeType);
        catchNodeMethod.setAccessible(true);
        java.lang.Object[] catchNodeMethodArguments = new java.lang.Object[2];
        catchNodeMethodArguments[0] = stringNode;
        catchNodeMethodArguments[1] = numberNode;
        try {
            catchNodeMethod.invoke(null, catchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#catchNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(expr.isName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCatchNode_ThrowIllegalStateException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method catchNodeMethod = iRClazz.getDeclaredMethod("catchNode", stringNodeType, stringNodeType);
        catchNodeMethod.setAccessible(true);
        java.lang.Object[] catchNodeMethodArguments = new java.lang.Object[2];
        catchNodeMethodArguments[0] = stringNode;
        catchNodeMethodArguments[1] = ((Object) null);
        try {
            catchNodeMethod.invoke(null, catchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#catchNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.CATCH, expr, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCatchNode_ThrowIllegalArgumentException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method catchNodeMethod = iRClazz.getDeclaredMethod("catchNode", stringNodeType, stringNodeType);
        catchNodeMethod.setAccessible(true);
        java.lang.Object[] catchNodeMethodArguments = new java.lang.Object[2];
        catchNodeMethodArguments[0] = stringNode;
        catchNodeMethodArguments[1] = numberNode;
        try {
            catchNodeMethod.invoke(null, catchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#catchNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.CATCH, expr, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCatchNode_ThrowIllegalArgumentException_2() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.next = next;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method catchNodeMethod = iRClazz.getDeclaredMethod("catchNode", nodeType, nodeType);
        catchNodeMethod.setAccessible(true);
        java.lang.Object[] catchNodeMethodArguments = new java.lang.Object[2];
        catchNodeMethodArguments[0] = node;
        catchNodeMethodArguments[1] = numberNode;
        try {
            catchNodeMethod.invoke(null, catchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#catchNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.CATCH, expr, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCatchNode_ThrowIllegalArgumentException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method catchNodeMethod = iRClazz.getDeclaredMethod("catchNode", stringNodeType, stringNodeType);
        catchNodeMethod.setAccessible(true);
        java.lang.Object[] catchNodeMethodArguments = new java.lang.Object[2];
        catchNodeMethodArguments[0] = stringNode;
        catchNodeMethodArguments[1] = numberNode;
        try {
            catchNodeMethod.invoke(null, catchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#catchNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.CATCH, expr, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCatchNode_ThrowIllegalArgumentException_3() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method catchNodeMethod = iRClazz.getDeclaredMethod("catchNode", stringNodeType, stringNodeType);
        catchNodeMethod.setAccessible(true);
        java.lang.Object[] catchNodeMethodArguments = new java.lang.Object[2];
        catchNodeMethodArguments[0] = stringNode;
        catchNodeMethodArguments[1] = numberNode;
        try {
            catchNodeMethod.invoke(null, catchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.tryCatchFinally
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryCatchFinally(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatchFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(finallyBody.isBlock());
 *  */
    @Test
    public void testTryCatchFinally_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.tryCatchFinally] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.tryCatchFinally(IR.java:239) */
        IR.tryCatchFinally(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryCatchFinally(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatchFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(finallyBody.isBlock());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryCatchFinally_ThrowIllegalStateException() {
        Node node = new Node(-255);
        
        IR.tryCatchFinally(null, null, node);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatchFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node tryNode = tryCatch(tryBody, catchNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryCatchFinally_ThrowIllegalStateException_1() {
        Node node = new Node(-255);
        Node node1 = new Node(125);
        
        IR.tryCatchFinally(node, null, node1);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatchFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node tryNode = tryCatch(tryBody, catchNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryCatchFinally_ThrowIllegalStateException_2() {
        Node node = new Node(125);
        Node node1 = new Node(-255);
        
        IR.tryCatchFinally(node, node1, node);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryCatchFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node tryNode = tryCatch(tryBody, catchNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryCatchFinally_ThrowIllegalStateException_3() {
        Node node = new Node(125);
        Node node1 = new Node(120);
        Node node2 = new Node(125);
        
        IR.tryCatchFinally(node, node1, node2);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.breakNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method breakNode()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#breakNode()}
 * @utbot.returnsFrom {@code return new Node(Token.BREAK);}
 *  */
    @Test
    public void testBreakNode_Return() throws Exception  {
        Node actual = IR.breakNode();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 116;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.breakNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method breakNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#breakNode(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabelName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.returnsFrom {@code return new Node(Token.BREAK, name);}
 *  */
    @Test
    public void testBreakNode_PreconditionsCheckState() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method breakNodeMethod = iRClazz.getDeclaredMethod("breakNode", numberNodeType);
        breakNodeMethod.setAccessible(true);
        java.lang.Object[] breakNodeMethodArguments = new java.lang.Object[1];
        breakNodeMethodArguments[0] = numberNode;
        Node actual = ((Node) breakNodeMethod.invoke(null, breakNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 116;
        setField(expected, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstNumber = ((Double) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNumber, actualFirstNumber, 1.0E-6);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method breakNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#breakNode(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabelName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(name.isLabelName());
 *  */
    @Test
    public void testBreakNode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.breakNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.breakNode(IR.java:257) */
        IR.breakNode(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method breakNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#breakNode(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name.isLabelName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testBreakNode_ThrowIllegalStateException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method breakNodeMethod = iRClazz.getDeclaredMethod("breakNode", numberNodeType);
        breakNodeMethod.setAccessible(true);
        java.lang.Object[] breakNodeMethodArguments = new java.lang.Object[1];
        breakNodeMethodArguments[0] = numberNode;
        try {
            breakNodeMethod.invoke(null, breakNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#breakNode(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.BREAK, name);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBreakNode_ThrowIllegalArgumentException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method breakNodeMethod = iRClazz.getDeclaredMethod("breakNode", numberNodeType);
        breakNodeMethod.setAccessible(true);
        java.lang.Object[] breakNodeMethodArguments = new java.lang.Object[1];
        breakNodeMethodArguments[0] = numberNode;
        try {
            breakNodeMethod.invoke(null, breakNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#breakNode(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.BREAK, name);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testBreakNode_ThrowIllegalArgumentException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method breakNodeMethod = iRClazz.getDeclaredMethod("breakNode", numberNodeType);
        breakNodeMethod.setAccessible(true);
        java.lang.Object[] breakNodeMethodArguments = new java.lang.Object[1];
        breakNodeMethodArguments[0] = numberNode;
        try {
            breakNodeMethod.invoke(null, breakNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.getprop
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getprop(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testGetprop1() {
        Node node = new Node(53);
        
        IR.getprop(node, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getprop(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testGetprop2() {
        Node node = new Node(37);
        
        /* This test fails because method [com.google.javascript.rhino.IR.getprop] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.getprop(IR.java:298) */
        IR.getprop(node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.getelem
    
    ///region OTHER: ERROR SUITE for method getelem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testGetelem1() {
        Node node = new Node(101);
        
        /* This test fails because method [com.google.javascript.rhino.IR.getelem] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.getelem(IR.java:304) */
        IR.getelem(node, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getelem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testGetelem2() {
        Node node = new Node(34);
        
        IR.getelem(node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.continueNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method continueNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#continueNode(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabelName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.returnsFrom {@code return new Node(Token.CONTINUE, name);}
 *  */
    @Test
    public void testContinueNode_PreconditionsCheckState() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method continueNodeMethod = iRClazz.getDeclaredMethod("continueNode", numberNodeType);
        continueNodeMethod.setAccessible(true);
        java.lang.Object[] continueNodeMethodArguments = new java.lang.Object[1];
        continueNodeMethodArguments[0] = numberNode;
        Node actual = ((Node) continueNodeMethod.invoke(null, continueNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 117;
        setField(expected, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstNumber = ((Double) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNumber, actualFirstNumber, 1.0E-6);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method continueNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#continueNode(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabelName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(name.isLabelName());
 *  */
    @Test
    public void testContinueNode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.continueNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.continueNode(IR.java:267) */
        IR.continueNode(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method continueNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#continueNode(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name.isLabelName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testContinueNode_ThrowIllegalStateException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method continueNodeMethod = iRClazz.getDeclaredMethod("continueNode", numberNodeType);
        continueNodeMethod.setAccessible(true);
        java.lang.Object[] continueNodeMethodArguments = new java.lang.Object[1];
        continueNodeMethodArguments[0] = numberNode;
        try {
            continueNodeMethod.invoke(null, continueNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#continueNode(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.CONTINUE, name);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testContinueNode_ThrowIllegalArgumentException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method continueNodeMethod = iRClazz.getDeclaredMethod("continueNode", numberNodeType);
        continueNodeMethod.setAccessible(true);
        java.lang.Object[] continueNodeMethodArguments = new java.lang.Object[1];
        continueNodeMethodArguments[0] = numberNode;
        try {
            continueNodeMethod.invoke(null, continueNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#continueNode(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.CONTINUE, name);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testContinueNode_ThrowIllegalArgumentException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method continueNodeMethod = iRClazz.getDeclaredMethod("continueNode", numberNodeType);
        continueNodeMethod.setAccessible(true);
        java.lang.Object[] continueNodeMethodArguments = new java.lang.Object[1];
        continueNodeMethodArguments[0] = numberNode;
        try {
            continueNodeMethod.invoke(null, continueNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.continueNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method continueNode()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#continueNode()}
 * @utbot.returnsFrom {@code return new Node(Token.CONTINUE);}
 *  */
    @Test
    public void testContinueNode_Return() throws Exception  {
        Node actual = IR.continueNode();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 117;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.switchNode
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method switchNode(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    @Test(expected = IllegalStateException.class)
    public void testSwitchNode1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(74);
        com.google.javascript.rhino.Node[] nodeArray = {null, null, null, null, null, null, null, null, null};
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeArrayType = Class.forName("[Lcom.google.javascript.rhino.Node;");
        Method switchNodeMethod = iRClazz.getDeclaredMethod("switchNode", stringNodeType, nodeArrayType);
        switchNodeMethod.setAccessible(true);
        java.lang.Object[] switchNodeMethodArguments = new java.lang.Object[2];
        switchNodeMethodArguments[0] = stringNode;
        switchNodeMethodArguments[1] = ((Object) nodeArray);
        try {
            switchNodeMethod.invoke(null, switchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method switchNode(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    @Test
    public void testSwitchNode2() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(14);
        com.google.javascript.rhino.Node[] nodeArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.rhino.IR.switchNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.switchNode(IR.java:191) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeArrayType = Class.forName("[Lcom.google.javascript.rhino.Node;");
        Method switchNodeMethod = iRClazz.getDeclaredMethod("switchNode", stringNodeType, nodeArrayType);
        switchNodeMethod.setAccessible(true);
        java.lang.Object[] switchNodeMethodArguments = new java.lang.Object[2];
        switchNodeMethodArguments[0] = stringNode;
        switchNodeMethodArguments[1] = ((Object) nodeArray);
        try {
            switchNodeMethod.invoke(null, switchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testSwitchNode3() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        com.google.javascript.rhino.Node[] nodeArray = {null, null, null, null, null, null, null, null, null};
        
        /* This test fails because method [com.google.javascript.rhino.IR.switchNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.switchNode(IR.java:191) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeArrayType = Class.forName("[Lcom.google.javascript.rhino.Node;");
        Method switchNodeMethod = iRClazz.getDeclaredMethod("switchNode", stringNodeType, nodeArrayType);
        switchNodeMethod.setAccessible(true);
        java.lang.Object[] switchNodeMethodArguments = new java.lang.Object[2];
        switchNodeMethodArguments[0] = stringNode;
        switchNodeMethodArguments[1] = ((Object) nodeArray);
        try {
            switchNodeMethod.invoke(null, switchNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.doNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#doNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(cond));
 *  */
    @Test
    public void testDoNode_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        
        /* This test fails because method [com.google.javascript.rhino.IR.doNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.doNode(IR.java:168) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doNodeMethod = iRClazz.getDeclaredMethod("doNode", stringNodeType, stringNodeType);
        doNodeMethod.setAccessible(true);
        java.lang.Object[] doNodeMethodArguments = new java.lang.Object[2];
        doNodeMethodArguments[0] = stringNode;
        doNodeMethodArguments[1] = ((Object) null);
        try {
            doNodeMethod.invoke(null, doNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#doNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(body.isBlock());
 *  */
    @Test
    public void testDoNode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.doNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.doNode(IR.java:167) */
        IR.doNode(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method doNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#doNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(body.isBlock());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDoNode_ThrowIllegalStateException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doNodeMethod = iRClazz.getDeclaredMethod("doNode", stringNodeType, stringNodeType);
        doNodeMethod.setAccessible(true);
        java.lang.Object[] doNodeMethodArguments = new java.lang.Object[2];
        doNodeMethodArguments[0] = stringNode;
        doNodeMethodArguments[1] = ((Object) null);
        try {
            doNodeMethod.invoke(null, doNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.forNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method forNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#forNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(init.isVar() || mayBeExpressionOrEmpty(init));): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpressionOrEmpty(cond));
 *  */
    @Test
    public void testForNode_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        
        /* This test fails because method [com.google.javascript.rhino.IR.forNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(IR.java:458)
            com.google.javascript.rhino.IR.forNode(IR.java:181) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forNodeMethod = iRClazz.getDeclaredMethod("forNode", stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        forNodeMethod.setAccessible(true);
        java.lang.Object[] forNodeMethodArguments = new java.lang.Object[4];
        forNodeMethodArguments[0] = stringNode;
        forNodeMethodArguments[1] = ((Object) null);
        forNodeMethodArguments[2] = ((Object) null);
        forNodeMethodArguments[3] = ((Object) null);
        try {
            forNodeMethod.invoke(null, forNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#forNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(init.isVar() || mayBeExpressionOrEmpty(init));): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(init.isVar() || mayBeExpressionOrEmpty(init));): True}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpressionOrEmpty(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpressionOrEmpty(cond));
 *  */
    @Test
    public void testForNode_ThrowNullPointerException_2() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(124);
        
        /* This test fails because method [com.google.javascript.rhino.IR.forNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(IR.java:458)
            com.google.javascript.rhino.IR.forNode(IR.java:181) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forNodeMethod = iRClazz.getDeclaredMethod("forNode", stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        forNodeMethod.setAccessible(true);
        java.lang.Object[] forNodeMethodArguments = new java.lang.Object[4];
        forNodeMethodArguments[0] = stringNode;
        forNodeMethodArguments[1] = ((Object) null);
        forNodeMethodArguments[2] = ((Object) null);
        forNodeMethodArguments[3] = ((Object) null);
        try {
            forNodeMethod.invoke(null, forNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#forNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isVar()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(init.isVar() || mayBeExpressionOrEmpty(init));
 *  */
    @Test
    public void testForNode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.forNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.forNode(IR.java:180) */
        IR.forNode(null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method forNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testForNode1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(52);
        
        /* This test fails because method [com.google.javascript.rhino.IR.forNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(IR.java:458)
            com.google.javascript.rhino.IR.forNode(IR.java:181) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forNodeMethod = iRClazz.getDeclaredMethod("forNode", stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        forNodeMethod.setAccessible(true);
        java.lang.Object[] forNodeMethodArguments = new java.lang.Object[4];
        forNodeMethodArguments[0] = stringNode;
        forNodeMethodArguments[1] = ((Object) null);
        forNodeMethodArguments[2] = ((Object) null);
        forNodeMethodArguments[3] = ((Object) null);
        try {
            forNodeMethod.invoke(null, forNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testForNode2() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(55);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forNodeMethod = iRClazz.getDeclaredMethod("forNode", stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        forNodeMethod.setAccessible(true);
        java.lang.Object[] forNodeMethodArguments = new java.lang.Object[4];
        forNodeMethodArguments[0] = stringNode;
        forNodeMethodArguments[1] = ((Object) null);
        forNodeMethodArguments[2] = ((Object) null);
        forNodeMethodArguments[3] = ((Object) null);
        try {
            forNodeMethod.invoke(null, forNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.caseNode
    
    ///region OTHER: ERROR SUITE for method caseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testCaseNode1() {
        Node node = new Node(101);
        
        /* This test fails because method [com.google.javascript.rhino.IR.caseNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.caseNode(IR.java:199) */
        IR.caseNode(node, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method caseNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testCaseNode2() {
        Node node = new Node(60);
        
        IR.caseNode(node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.forIn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method forIn(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#forIn(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isVar()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(cond));
 *  */
    @Test
    public void testForIn_ThrowNullPointerException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        
        /* This test fails because method [com.google.javascript.rhino.IR.forIn] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.forIn(IR.java:174) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forInMethod = iRClazz.getDeclaredMethod("forIn", numberNodeType, numberNodeType, numberNodeType);
        forInMethod.setAccessible(true);
        java.lang.Object[] forInMethodArguments = new java.lang.Object[3];
        forInMethodArguments[0] = numberNode;
        forInMethodArguments[1] = ((Object) null);
        forInMethodArguments[2] = ((Object) null);
        try {
            forInMethod.invoke(null, forInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#forIn(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(target.isVar() || mayBeExpression(target));
 *  */
    @Test
    public void testForIn_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.forIn] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.forIn(IR.java:173) */
        IR.forIn(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method forIn(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testForIn1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        Node node = new Node(11);
        
        /* This test fails because method [com.google.javascript.rhino.IR.forIn] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.forIn(IR.java:175) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forInMethod = iRClazz.getDeclaredMethod("forIn", numberNodeType, numberNodeType, numberNodeType);
        forInMethod.setAccessible(true);
        java.lang.Object[] forInMethodArguments = new java.lang.Object[3];
        forInMethodArguments[0] = numberNode;
        forInMethodArguments[1] = node;
        forInMethodArguments[2] = ((Object) null);
        try {
            forInMethod.invoke(null, forInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testForIn2() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.rhino.IR.forIn] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.forIn(IR.java:175) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forInMethod = iRClazz.getDeclaredMethod("forIn", numberNodeType, numberNodeType, numberNodeType);
        forInMethod.setAccessible(true);
        java.lang.Object[] forInMethodArguments = new java.lang.Object[3];
        forInMethodArguments[0] = numberNode;
        forInMethodArguments[1] = node;
        forInMethodArguments[2] = ((Object) null);
        try {
            forInMethod.invoke(null, forInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method forIn(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testForIn3() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forInMethod = iRClazz.getDeclaredMethod("forIn", numberNodeType, numberNodeType, numberNodeType);
        forInMethod.setAccessible(true);
        java.lang.Object[] forInMethodArguments = new java.lang.Object[3];
        forInMethodArguments[0] = numberNode;
        forInMethodArguments[1] = stringNode;
        forInMethodArguments[2] = ((Object) null);
        try {
            forInMethod.invoke(null, forInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testForIn4() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method forInMethod = iRClazz.getDeclaredMethod("forIn", numberNodeType, numberNodeType, numberNodeType);
        forInMethod.setAccessible(true);
        java.lang.Object[] forInMethodArguments = new java.lang.Object[3];
        forInMethodArguments[0] = numberNode;
        forInMethodArguments[1] = ((Object) null);
        forInMethodArguments[2] = ((Object) null);
        try {
            forInMethod.invoke(null, forInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.labelName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method labelName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#labelName(java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(!name.isEmpty());): True}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(int,java.lang.String)}
 * @utbot.returnsFrom {@code return Node.newString(Token.LABEL_NAME, name);}
 *  */
    @Test
    public void testLabelName_PreconditionsCheckState() throws Exception  {
        String string = " ";
        
        Object actual = IR.labelName(string);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) expected)).setType(153);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method labelName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#labelName(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(!name.isEmpty());
 *  */
    @Test
    public void testLabelName_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.labelName] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.labelName(IR.java:219) */
        IR.labelName(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method labelName(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#labelName(java.lang.String)}
 * @utbot.executesCondition {@code (Preconditions.checkState(!name.isEmpty());): False}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(!name.isEmpty());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testLabelName_ThrowIllegalStateException() {
        String string = "";
        
        IR.labelName(string);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.nullNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method nullNode()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#nullNode()}
 * @utbot.returnsFrom {@code return new Node(Token.NULL);}
 *  */
    @Test
    public void testNullNode_Return() throws Exception  {
        Node actual = IR.nullNode();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 41;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.mayBeExpression
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mayBeExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMayBeExpression_ReturnFalse() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(55);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeExpressionMethod = iRClazz.getDeclaredMethod("mayBeExpression", numberNodeType);
        mayBeExpressionMethod.setAccessible(true);
        java.lang.Object[] mayBeExpressionMethodArguments = new java.lang.Object[1];
        mayBeExpressionMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeExpressionMethod.invoke(null, mayBeExpressionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.VOID}
 *  */
    @Test
    public void testMayBeExpression_ReturnTrue() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeExpressionMethod = iRClazz.getDeclaredMethod("mayBeExpression", numberNodeType);
        mayBeExpressionMethod.setAccessible(true);
        java.lang.Object[] mayBeExpressionMethodArguments = new java.lang.Object[1];
        mayBeExpressionMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeExpressionMethod.invoke(null, mayBeExpressionMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.FUNCTION}
 *  */
    @Test
    public void testMayBeExpression_ReturnTrue_1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeExpressionMethod = iRClazz.getDeclaredMethod("mayBeExpression", numberNodeType);
        mayBeExpressionMethod.setAccessible(true);
        java.lang.Object[] mayBeExpressionMethodArguments = new java.lang.Object[1];
        mayBeExpressionMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeExpressionMethod.invoke(null, mayBeExpressionMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mayBeExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testMayBeExpression_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.rhino.IR.mayBeExpression] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeExpressionMethod = iRClazz.getDeclaredMethod("mayBeExpression", nodeType);
        mayBeExpressionMethod.setAccessible(true);
        java.lang.Object[] mayBeExpressionMethodArguments = new java.lang.Object[1];
        mayBeExpressionMethodArguments[0] = ((Object) null);
        try {
            mayBeExpressionMethod.invoke(null, mayBeExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.isAssignmentTarget
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isAssignmentTarget(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n.isName() || n.isGetProp() || n.isGetElem();}
 *  */
    @Test
    public void testIsAssignmentTarget_NIsNameOrNIsGetPropOrNIsGetElem() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = iRClazz.getDeclaredMethod("isAssignmentTarget", numberNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(null, isAssignmentTargetMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n.isName() || n.isGetProp() || n.isGetElem();}
 *  */
    @Test
    public void testIsAssignmentTarget_NIsNameOrNIsGetPropOrNIsGetElem_1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = iRClazz.getDeclaredMethod("isAssignmentTarget", numberNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(null, isAssignmentTargetMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n.isName() || n.isGetProp() || n.isGetElem();}
 *  */
    @Test
    public void testIsAssignmentTarget_NIsNameOrNIsGetPropOrNIsGetElem_2() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = iRClazz.getDeclaredMethod("isAssignmentTarget", numberNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(null, isAssignmentTargetMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n.isName() || n.isGetProp() || n.isGetElem();}
 *  */
    @Test
    public void testIsAssignmentTarget_NIsNameOrNIsGetPropOrNIsGetElem_3() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = iRClazz.getDeclaredMethod("isAssignmentTarget", numberNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(null, isAssignmentTargetMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAssignmentTarget(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.isName() || n.isGetProp() || n.isGetElem();
 *  */
    @Test
    public void testIsAssignmentTarget_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.rhino.IR.isAssignmentTarget] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.isAssignmentTarget(IR.java:462) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = iRClazz.getDeclaredMethod("isAssignmentTarget", nodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = ((Object) null);
        try {
            isAssignmentTargetMethod.invoke(null, isAssignmentTargetMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.mayBeStatement
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mayBeStatement(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeStatement(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testMayBeStatement_ReturnTrue() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(115);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeStatementMethod = iRClazz.getDeclaredMethod("mayBeStatement", numberNodeType);
        mayBeStatementMethod.setAccessible(true);
        java.lang.Object[] mayBeStatementMethodArguments = new java.lang.Object[1];
        mayBeStatementMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeStatementMethod.invoke(null, mayBeStatementMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeStatement(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testMayBeStatement_ReturnTrue_1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeStatementMethod = iRClazz.getDeclaredMethod("mayBeStatement", numberNodeType);
        mayBeStatementMethod.setAccessible(true);
        java.lang.Object[] mayBeStatementMethodArguments = new java.lang.Object[1];
        mayBeStatementMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeStatementMethod.invoke(null, mayBeStatementMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeStatement(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMayBeStatement_ReturnFalse() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeStatementMethod = iRClazz.getDeclaredMethod("mayBeStatement", numberNodeType);
        mayBeStatementMethod.setAccessible(true);
        java.lang.Object[] mayBeStatementMethodArguments = new java.lang.Object[1];
        mayBeStatementMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeStatementMethod.invoke(null, mayBeStatementMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mayBeStatement(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeStatement(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testMayBeStatement_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.rhino.IR.mayBeStatement] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeStatement(IR.java:474) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeStatementMethod = iRClazz.getDeclaredMethod("mayBeStatement", nodeType);
        mayBeStatementMethod.setAccessible(true);
        java.lang.Object[] mayBeStatementMethodArguments = new java.lang.Object[1];
        mayBeStatementMethodArguments[0] = ((Object) null);
        try {
            mayBeStatementMethod.invoke(null, mayBeStatementMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.propdef
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method propdef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#propdef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isStringKey()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(string.isStringKey());
 *  */
    @Test
    public void testPropdef_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.propdef] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.propdef(IR.java:389) */
        IR.propdef(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#propdef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(!string.hasChildren());): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isStringKey()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(value));
 *  */
    @Test
    public void testPropdef_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(154);
        
        /* This test fails because method [com.google.javascript.rhino.IR.propdef] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.propdef(IR.java:391) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method propdefMethod = iRClazz.getDeclaredMethod("propdef", stringNodeType, stringNodeType);
        propdefMethod.setAccessible(true);
        java.lang.Object[] propdefMethodArguments = new java.lang.Object[2];
        propdefMethodArguments[0] = stringNode;
        propdefMethodArguments[1] = ((Object) null);
        try {
            propdefMethod.invoke(null, propdefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method propdef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#propdef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(string.isStringKey());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPropdef_ThrowIllegalStateException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method propdefMethod = iRClazz.getDeclaredMethod("propdef", stringNodeType, stringNodeType);
        propdefMethod.setAccessible(true);
        java.lang.Object[] propdefMethodArguments = new java.lang.Object[2];
        propdefMethodArguments[0] = stringNode;
        propdefMethodArguments[1] = ((Object) null);
        try {
            propdefMethod.invoke(null, propdefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#propdef(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(!string.hasChildren());): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(!string.hasChildren());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPropdef_ThrowIllegalStateException_1() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 154;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        IR.propdef(node, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method propdef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testPropdef1() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(154);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        
        Node initialStringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method propdefMethod = iRClazz.getDeclaredMethod("propdef", stringNodeType, stringNodeType);
        propdefMethod.setAccessible(true);
        java.lang.Object[] propdefMethodArguments = new java.lang.Object[2];
        propdefMethodArguments[0] = stringNode;
        propdefMethodArguments[1] = numberNode;
        Object actual = propdefMethod.invoke(null, propdefMethodArguments);
        
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
        
        int stringNodeFirstType = stringNodeFirst.type;
        int actualFirstType = actualFirst.type;
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
        
        Node stringNodeFirstParent = stringNodeFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(stringNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(stringNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(stringNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(stringNodeFirstParent, actualFirstParent));
        Node stringNodeFirstParentLast = ((Node) getFieldValue(stringNodeFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(stringNodeFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(stringNodeFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(stringNodeFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(stringNodeFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(stringNodeFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(stringNodeFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(stringNodeFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(stringNodeFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(stringNodeFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(stringNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(stringNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(stringNodeFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        assertTrue(deepEquals(stringNode, actual));
        
        Node finalStringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialStringNodeFirst == finalStringNodeFirst);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method propdef(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testPropdef2() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(154);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(75);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method propdefMethod = iRClazz.getDeclaredMethod("propdef", stringNodeType, stringNodeType);
        propdefMethod.setAccessible(true);
        java.lang.Object[] propdefMethodArguments = new java.lang.Object[2];
        propdefMethodArguments[0] = stringNode;
        propdefMethodArguments[1] = numberNode;
        try {
            propdefMethod.invoke(null, propdefMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.voidNode
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method voidNode(com.google.javascript.rhino.Node)
    
    @Test
    public void testVoidNode1() throws Exception  {
        Node node = new Node(46);
        
        Node actual = IR.voidNode(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 122;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 46;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method voidNode(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testVoidNode2() {
        Node node = new Node(68);
        
        IR.voidNode(node);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method voidNode(com.google.javascript.rhino.Node)
    
    @Test
    public void testVoidNode3() {
        /* This test fails because method [com.google.javascript.rhino.IR.voidNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.unaryOp(IR.java:453)
            com.google.javascript.rhino.IR.voidNode(IR.java:352) */
        IR.voidNode(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.objectlit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method objectlit([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.returnsFrom {@code return objectlit;}
 *  */
    @Test
    public void testObjectlit_ReturnObjectlit() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = {};
        
        Node actual = IR.objectlit(nodeArray);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 64;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node propdef: propdefs)} once
 * @utbot.returnsFrom {@code return objectlit;}
 *  */
    @Test
    public void testObjectlit_PropdefIsStringKeyOrPropdefIsGetterDefOrPropdefIsSetterDef() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 154;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        nodeArray[0] = node;
        
        Node node1 = nodeArray[0];
        Node initialNodeArray0Parent = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "parent"));
        
        Node actual = IR.objectlit(nodeArray);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 64;
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", node);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node expectedFirstFirst = ((Node) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstFirstType = expectedFirstFirst.type;
        int actualFirstFirstType = actualFirstFirst.type;
        assertEquals(expectedFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(expectedFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int expectedFirstFirstSourcePosition = expectedFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(expectedFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
        Node expectedFirstLast = ((Node) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstLast, actualFirstLast));
        assertTrue(deepEquals(expectedFirstLast, actualFirstLast));
        assertTrue(deepEquals(expectedFirstLast, actualFirstLast));
        assertTrue(deepEquals(expectedFirstLast, actualFirstLast));
        assertTrue(deepEquals(expectedFirstLast, actualFirstLast));
        assertTrue(deepEquals(expectedFirstLast, actualFirstLast));
        assertTrue(deepEquals(expectedFirstLast, actualFirstLast));
        assertTrue(deepEquals(expectedFirstLast, actualFirstLast));
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node node2 = nodeArray[0];
        Node finalNodeArray0Parent = ((Node) getFieldValue(node2, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeArray0Parent == finalNodeArray0Parent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method objectlit([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node propdef: propdefs)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: propdef.isStringKey() || propdef.isGetterDef() || propdef.isSetterDef()
 *  */
    @Test
    public void testObjectlit_ThrowNullPointerException_1() {
        com.google.javascript.rhino.Node[] nodeArray = {null};
        
        /* This test fails because method [com.google.javascript.rhino.IR.objectlit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.objectlit(IR.java:378) */
        IR.objectlit(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node propdef: propdefs)
 *  */
    @Test
    public void testObjectlit_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.objectlit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.objectlit(IR.java:376) */
        IR.objectlit(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method objectlit([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node propdef: propdefs)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(propdef.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testObjectlit_ThrowIllegalStateException() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 154;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        nodeArray[0] = node;
        
        IR.objectlit(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node propdef: propdefs)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(propdef.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testObjectlit_ThrowIllegalStateException_1() {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = new Node(154);
        nodeArray[0] = node;
        
        IR.objectlit(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node propdef: propdefs)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: objectlit.addChildToBack(propdef);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testObjectlit_ThrowIllegalArgumentException() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 154;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        nodeArray[0] = node;
        
        IR.objectlit(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node propdef: propdefs)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: objectlit.addChildToBack(propdef);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testObjectlit_ThrowIllegalArgumentException_1() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 154;
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.next = next;
        setField(node, "com.google.javascript.rhino.Node", "first", next);
        setField(node, "com.google.javascript.rhino.Node", "last", next);
        nodeArray[0] = node;
        
        IR.objectlit(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node propdef: propdefs)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(propdef.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testObjectlit_ThrowIllegalStateException_2() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 147;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        nodeArray[0] = node;
        
        IR.objectlit(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node propdef: propdefs)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(propdef.isStringKey() || propdef.isGetterDef() || propdef.isSetterDef());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testObjectlit_ThrowIllegalStateException_3() {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = new Node(0);
        nodeArray[0] = node;
        
        IR.objectlit(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#objectlit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node propdef: propdefs)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(propdef.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testObjectlit_ThrowIllegalStateException_4() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 148;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        nodeArray[0] = node;
        
        IR.objectlit(nodeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.arraylit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method arraylit([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#arraylit(com.google.javascript.rhino.Node[])}
 * @utbot.returnsFrom {@code return arraylit;}
 *  */
    @Test
    public void testArraylit_ReturnArraylit() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = {};
        
        Node actual = IR.arraylit(nodeArray);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 63;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method arraylit([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#arraylit(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node expr: exprs)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpressionOrEmpty(expr));
 *  */
    @Test
    public void testArraylit_ThrowNullPointerException_1() {
        com.google.javascript.rhino.Node[] nodeArray = {null};
        
        /* This test fails because method [com.google.javascript.rhino.IR.arraylit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(IR.java:458)
            com.google.javascript.rhino.IR.arraylit(IR.java:399) */
        IR.arraylit(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#arraylit(com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node expr: exprs)
 *  */
    @Test
    public void testArraylit_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.arraylit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.arraylit(IR.java:398) */
        IR.arraylit(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method arraylit([Lcom.google.javascript.rhino.Node;)
    
    @Test
    public void testArraylit1() {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[9];
        Node node = new Node(96);
        nodeArray[0] = node;
        
        /* This test fails because method [com.google.javascript.rhino.IR.arraylit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(IR.java:458)
            com.google.javascript.rhino.IR.arraylit(IR.java:399) */
        IR.arraylit(nodeArray);
    }
    
    @Test
    public void testArraylit2() {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[9];
        Node node = new Node(124);
        nodeArray[0] = node;
        
        /* This test fails because method [com.google.javascript.rhino.IR.arraylit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(IR.java:458)
            com.google.javascript.rhino.IR.arraylit(IR.java:399) */
        IR.arraylit(nodeArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method arraylit([Lcom.google.javascript.rhino.Node;)
    
    @Test(expected = IllegalStateException.class)
    public void testArraylit3() {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[9];
        Node node = new Node(120);
        nodeArray[0] = node;
        
        IR.arraylit(nodeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.regexp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method regexp(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.returnsFrom {@code return new Node(Token.REGEXP, expr);}
 *  */
    @Test
    public void testRegexp_PreconditionsCheckState() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", numberNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[1];
        regexpMethodArguments[0] = numberNode;
        Node actual = ((Node) regexpMethod.invoke(null, regexpMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 47;
        setField(expected, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstNumber = ((Double) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNumber, actualFirstNumber, 1.0E-6);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method regexp(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(expr.isString());
 *  */
    @Test
    public void testRegexp_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.regexp] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.regexp(IR.java:406) */
        IR.regexp(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method regexp(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(expr.isString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRegexp_ThrowIllegalStateException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", numberNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[1];
        regexpMethodArguments[0] = numberNode;
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.REGEXP, expr);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRegexp_ThrowIllegalArgumentException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", numberNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[1];
        regexpMethodArguments[0] = numberNode;
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.REGEXP, expr);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRegexp_ThrowIllegalArgumentException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", numberNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[1];
        regexpMethodArguments[0] = numberNode;
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.regexp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method regexp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.returnsFrom {@code return new Node(Token.REGEXP, expr, flags);}
 *  */
    @Test
    public void testRegexp_PreconditionsCheckState1() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 40;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Node initialNodeNext = node.next;
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", nodeType, nodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[2];
        regexpMethodArguments[0] = node;
        regexpMethodArguments[1] = numberNode;
        Node actual = ((Node) regexpMethod.invoke(null, regexpMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 47;
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.next;
        Node actualFirstNext = actualFirst.next;
        double expectedFirstNextNumber = ((Double) getFieldValue(expectedFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNextNumber = ((Double) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNextNumber, actualFirstNextNumber, 1.0E-6);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int expectedFirstNextSourcePosition = expectedFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(expectedFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node expectedFirstNextParent = expectedFirstNext.getParent();
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node expectedFirstNextParentLast = ((Node) getFieldValue(expectedFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextParentLast = ((Node) getFieldValue(actualFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        int expectedFirstNextParentSourcePosition = expectedFirstNextParent.getSourcePosition();
        int actualFirstNextParentSourcePosition = actualFirstNextParent.getSourcePosition();
        assertEquals(expectedFirstNextParentSourcePosition, actualFirstNextParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node actualFirstNextParentParent = actualFirstNextParent.getParent();
        assertNull(actualFirstNextParentParent);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNodeNext = node.next;
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeNext == finalNodeNext);
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method regexp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(flags.isString());
 *  */
    @Test
    public void testRegexp_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.rhino.IR.regexp] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.regexp(IR.java:412) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", stringNodeType, stringNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[2];
        regexpMethodArguments[0] = stringNode;
        regexpMethodArguments[1] = ((Object) null);
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(expr.isString());
 *  */
    @Test
    public void testRegexp_ThrowNullPointerException1() {
        /* This test fails because method [com.google.javascript.rhino.IR.regexp] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.regexp(IR.java:411) */
        IR.regexp(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method regexp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(flags.isString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRegexp_ThrowIllegalStateException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", stringNodeType, stringNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[2];
        regexpMethodArguments[0] = stringNode;
        regexpMethodArguments[1] = numberNode;
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(expr.isString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRegexp_ThrowIllegalStateException1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", stringNodeType, stringNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[2];
        regexpMethodArguments[0] = stringNode;
        regexpMethodArguments[1] = ((Object) null);
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.REGEXP, expr, flags);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRegexp_ThrowIllegalArgumentException1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", stringNodeType, stringNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[2];
        regexpMethodArguments[0] = stringNode;
        regexpMethodArguments[1] = numberNode;
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.REGEXP, expr, flags);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRegexp_ThrowIllegalArgumentException_11() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 40;
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.next = next;
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", nodeType, nodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[2];
        regexpMethodArguments[0] = node;
        regexpMethodArguments[1] = numberNode;
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.REGEXP, expr, flags);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRegexp_ThrowIllegalArgumentException_2() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", stringNodeType, stringNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[2];
        regexpMethodArguments[0] = stringNode;
        regexpMethodArguments[1] = numberNode;
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#regexp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.REGEXP, expr, flags);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRegexp_ThrowIllegalArgumentException_3() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method regexpMethod = iRClazz.getDeclaredMethod("regexp", stringNodeType, stringNodeType);
        regexpMethod.setAccessible(true);
        java.lang.Object[] regexpMethodArguments = new java.lang.Object[2];
        regexpMethodArguments[0] = stringNode;
        regexpMethodArguments[1] = numberNode;
        try {
            regexpMethod.invoke(null, regexpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.stringKey
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method stringKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#stringKey(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(int,java.lang.String)}
 * @utbot.returnsFrom {@code return Node.newString(Token.STRING_KEY, s);}
 *  */
    @Test
    public void testStringKey_NodeNewString() throws Exception  {
        String string = "";
        
        Object actual = IR.stringKey(string);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) expected)).setType(154);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method stringKey(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#stringKey(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Node.newString(Token.STRING_KEY, s);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testStringKey_ThrowIllegalArgumentException() {
        IR.stringKey(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.trueNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trueNode()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#trueNode()}
 * @utbot.returnsFrom {@code return new Node(Token.TRUE);}
 *  */
    @Test
    public void testTrueNode_Return() throws Exception  {
        Node actual = IR.trueNode();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 44;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.falseNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method falseNode()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#falseNode()}
 * @utbot.returnsFrom {@code return new Node(Token.FALSE);}
 *  */
    @Test
    public void testFalseNode_Return() throws Exception  {
        Node actual = IR.falseNode();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 43;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.mayBeExpressionOrEmpty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method mayBeExpressionOrEmpty(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeExpressionOrEmpty(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n.isEmpty() || mayBeExpression(n);}
 *  */
    @Test
    public void testMayBeExpressionOrEmpty_NIsEmptyOrMayBeExpression() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(124);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeExpressionOrEmptyMethod = iRClazz.getDeclaredMethod("mayBeExpressionOrEmpty", numberNodeType);
        mayBeExpressionOrEmptyMethod.setAccessible(true);
        java.lang.Object[] mayBeExpressionOrEmptyMethodArguments = new java.lang.Object[1];
        mayBeExpressionOrEmptyMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeExpressionOrEmptyMethod.invoke(null, mayBeExpressionOrEmptyMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeExpressionOrEmpty(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n.isEmpty() || mayBeExpression(n);}
 *  */
    @Test
    public void testMayBeExpressionOrEmpty_NIsEmptyOrMayBeExpression_1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(62);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeExpressionOrEmptyMethod = iRClazz.getDeclaredMethod("mayBeExpressionOrEmpty", numberNodeType);
        mayBeExpressionOrEmptyMethod.setAccessible(true);
        java.lang.Object[] mayBeExpressionOrEmptyMethodArguments = new java.lang.Object[1];
        mayBeExpressionOrEmptyMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeExpressionOrEmptyMethod.invoke(null, mayBeExpressionOrEmptyMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeExpressionOrEmpty(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n.isEmpty() || mayBeExpression(n);}
 *  */
    @Test
    public void testMayBeExpressionOrEmpty_NIsEmptyOrMayBeExpression_2() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeExpressionOrEmptyMethod = iRClazz.getDeclaredMethod("mayBeExpressionOrEmpty", numberNodeType);
        mayBeExpressionOrEmptyMethod.setAccessible(true);
        java.lang.Object[] mayBeExpressionOrEmptyMethodArguments = new java.lang.Object[1];
        mayBeExpressionOrEmptyMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeExpressionOrEmptyMethod.invoke(null, mayBeExpressionOrEmptyMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method mayBeExpressionOrEmpty(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#mayBeExpressionOrEmpty(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.isEmpty() || mayBeExpression(n);
 *  */
    @Test
    public void testMayBeExpressionOrEmpty_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.rhino.IR.mayBeExpressionOrEmpty] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpressionOrEmpty(IR.java:458) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeExpressionOrEmptyMethod = iRClazz.getDeclaredMethod("mayBeExpressionOrEmpty", nodeType);
        mayBeExpressionOrEmptyMethod.setAccessible(true);
        java.lang.Object[] mayBeExpressionOrEmptyMethodArguments = new java.lang.Object[1];
        mayBeExpressionOrEmptyMethodArguments[0] = ((Object) null);
        try {
            mayBeExpressionOrEmptyMethod.invoke(null, mayBeExpressionOrEmptyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method mayBeExpressionOrEmpty(com.google.javascript.rhino.Node)
    
    @Test
    public void testMayBeExpressionOrEmpty1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method mayBeExpressionOrEmptyMethod = iRClazz.getDeclaredMethod("mayBeExpressionOrEmpty", numberNodeType);
        mayBeExpressionOrEmptyMethod.setAccessible(true);
        java.lang.Object[] mayBeExpressionOrEmptyMethodArguments = new java.lang.Object[1];
        mayBeExpressionOrEmptyMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) mayBeExpressionOrEmptyMethod.invoke(null, mayBeExpressionOrEmptyMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.returnNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method returnNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#returnNode(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(expr));
 *  */
    @Test
    public void testReturnNode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.returnNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.returnNode(IR.java:139) */
        IR.returnNode(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.returnNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method returnNode()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#returnNode()}
 * @utbot.returnsFrom {@code return new Node(Token.RETURN);}
 *  */
    @Test
    public void testReturnNode_Return() throws Exception  {
        Node actual = IR.returnNode();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 4;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.throwNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method throwNode(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#throwNode(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(expr));
 *  */
    @Test
    public void testThrowNode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.throwNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.throwNode(IR.java:144) */
        IR.throwNode(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method throwNode(com.google.javascript.rhino.Node)
    
    @Test
    public void testThrowNode1() throws Exception  {
        Node node = new Node(51);
        
        Node actual = IR.throwNode(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 49;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 51;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method throwNode(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testThrowNode2() {
        Node node = new Node(81);
        
        IR.throwNode(node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.paramList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method paramList(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.returnsFrom {@code return new Node(Token.PARAM_LIST, param);}
 *  */
    @Test
    public void testParamList_PreconditionsCheckState() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method paramListMethod = iRClazz.getDeclaredMethod("paramList", numberNodeType);
        paramListMethod.setAccessible(true);
        java.lang.Object[] paramListMethodArguments = new java.lang.Object[1];
        paramListMethodArguments[0] = numberNode;
        Node actual = ((Node) paramListMethod.invoke(null, paramListMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 83;
        setField(expected, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstNumber = ((Double) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNumber, actualFirstNumber, 1.0E-6);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method paramList(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(param.isName());
 *  */
    @Test
    public void testParamList_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.paramList] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.paramList(IR.java:69) */
        IR.paramList(((Node) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method paramList(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(param.isName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParamList_ThrowIllegalStateException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method paramListMethod = iRClazz.getDeclaredMethod("paramList", numberNodeType);
        paramListMethod.setAccessible(true);
        java.lang.Object[] paramListMethodArguments = new java.lang.Object[1];
        paramListMethodArguments[0] = numberNode;
        try {
            paramListMethod.invoke(null, paramListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.PARAM_LIST, param);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParamList_ThrowIllegalArgumentException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method paramListMethod = iRClazz.getDeclaredMethod("paramList", numberNodeType);
        paramListMethod.setAccessible(true);
        java.lang.Object[] paramListMethodArguments = new java.lang.Object[1];
        paramListMethodArguments[0] = numberNode;
        try {
            paramListMethod.invoke(null, paramListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.PARAM_LIST, param);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParamList_ThrowIllegalArgumentException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method paramListMethod = iRClazz.getDeclaredMethod("paramList", numberNodeType);
        paramListMethod.setAccessible(true);
        java.lang.Object[] paramListMethodArguments = new java.lang.Object[1];
        paramListMethodArguments[0] = numberNode;
        try {
            paramListMethod.invoke(null, paramListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.paramList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method paramList()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList()}
 * @utbot.returnsFrom {@code return new Node(Token.PARAM_LIST);}
 *  */
    @Test
    public void testParamList_Return() throws Exception  {
        Node actual = IR.paramList();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 83;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.paramList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method paramList(java.util.List)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(java.util.List)}
 * @utbot.invokes {@link com.google.javascript.rhino.IR#paramList()}
 * @utbot.invokes {@link java.util.List#iterator()}
 * @utbot.returnsFrom {@code return paramList;}
 *  */
    @Test
    public void testParamList_ListIterator() throws Exception  {
        ArrayList arrayList = new ArrayList();
        
        Node actual = IR.paramList(arrayList);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 83;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method paramList(java.util.List)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(java.util.List)}
 * @utbot.invokes {@link com.google.javascript.rhino.IR#paramList()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node param: params)
 *  */
    @Test
    public void testParamList_ThrowNullPointerException1() {
        /* This test fails because method [com.google.javascript.rhino.IR.paramList] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.paramList(IR.java:84) */
        IR.paramList(((List) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.paramList
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method paramList([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node[])}
 * @utbot.returnsFrom {@code return paramList;}
 *  */
    @Test
    public void testParamList_ReturnParamList() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = {};
        
        Node actual = IR.paramList(nodeArray);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 83;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node param: params)} once
 * @utbot.returnsFrom {@code return paramList;}
 *  */
    @Test
    public void testParamList_NodeAddChildToBack() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        nodeArray[0] = node;
        
        Node node1 = nodeArray[0];
        Node initialNodeArray0Parent = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "parent"));
        
        Node actual = IR.paramList(nodeArray);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 83;
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", node);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node node2 = nodeArray[0];
        Node finalNodeArray0Parent = ((Node) getFieldValue(node2, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeArray0Parent == finalNodeArray0Parent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method paramList([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node param: params)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(param.isName());
 *  */
    @Test
    public void testParamList_ThrowNullPointerException_1() {
        com.google.javascript.rhino.Node[] nodeArray = {null};
        
        /* This test fails because method [com.google.javascript.rhino.IR.paramList] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.paramList(IR.java:76) */
        IR.paramList(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node param: params)
 *  */
    @Test
    public void testParamList_ThrowNullPointerException2() {
        /* This test fails because method [com.google.javascript.rhino.IR.paramList] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.paramList(IR.java:75) */
        IR.paramList(((com.google.javascript.rhino.Node[]) null));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method paramList([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node param: params)} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(param.isName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testParamList_ThrowIllegalStateException1() {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = new Node(0);
        nodeArray[0] = node;
        
        IR.paramList(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node param: params)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: paramList.addChildToBack(param);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParamList_ThrowIllegalArgumentException1() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.next = next;
        nodeArray[0] = node;
        
        IR.paramList(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#paramList(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node param: params)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: paramList.addChildToBack(param);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testParamList_ThrowIllegalArgumentException_11() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[1];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        nodeArray[0] = node;
        
        IR.paramList(nodeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.exprResult
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exprResult(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#exprResult(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(expr));
 *  */
    @Test
    public void testExprResult_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.exprResult] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.exprResult(IR.java:149) */
        IR.exprResult(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method exprResult(com.google.javascript.rhino.Node)
    
    @Test
    public void testExprResult1() throws Exception  {
        Node node = new Node(19);
        
        Node actual = IR.exprResult(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 130;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 19;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method exprResult(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testExprResult2() {
        Node node = new Node(78);
        
        IR.exprResult(node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.ifNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ifNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#ifNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(cond));
 *  */
    @Test
    public void testIfNode_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.ifNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.ifNode(IR.java:160) */
        IR.ifNode(null, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ifNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testIfNode1() {
        Node node = new Node(15);
        
        /* This test fails because method [com.google.javascript.rhino.IR.ifNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.ifNode(IR.java:161) */
        IR.ifNode(node, null, null);
    }
    
    @Test
    public void testIfNode2() {
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.rhino.IR.ifNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.ifNode(IR.java:161) */
        IR.ifNode(node, null, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ifNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testIfNode3() {
        Node node = new Node(121);
        
        IR.ifNode(node, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.ifNode
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ifNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#ifNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(then.isBlock());
 *  */
    @Test
    public void testIfNode_ThrowNullPointerException1() {
        Node node = new Node(10);
        
        /* This test fails because method [com.google.javascript.rhino.IR.ifNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.ifNode(IR.java:155) */
        IR.ifNode(node, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ifNode(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testIfNode4() {
        Node node = new Node(73);
        
        IR.ifNode(node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.name
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method name(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#name(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(int,java.lang.String)}
 * @utbot.returnsFrom {@code return Node.newString(Token.NAME, name);}
 *  */
    @Test
    public void testName_NodeNewString() throws Exception  {
        String string = "";
        
        Object actual = IR.name(string);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) expected)).setType(38);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method name(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#name(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Node.newString(Token.NAME, name);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testName_ThrowIllegalArgumentException() {
        IR.name(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.add
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method add(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testAdd1() {
        Node node = new Node(49);
        
        IR.add(node, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method add(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testAdd2() {
        Node node = new Node(33);
        
        /* This test fails because method [com.google.javascript.rhino.IR.add] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.binaryOp(IR.java:448)
            com.google.javascript.rhino.IR.add(IR.java:364) */
        IR.add(node, null);
    }
    
    @Test
    public void testAdd3() {
        /* This test fails because method [com.google.javascript.rhino.IR.add] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.binaryOp(IR.java:447)
            com.google.javascript.rhino.IR.add(IR.java:364) */
        IR.add(null, null);
    }
    
    @Test
    public void testAdd4() {
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.rhino.IR.add] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.binaryOp(IR.java:448)
            com.google.javascript.rhino.IR.add(IR.java:364) */
        IR.add(node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.unaryOp
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method unaryOp(int, com.google.javascript.rhino.Node)
    
    @Test
    public void testUnaryOp1() throws Exception  {
        Node node = new Node(37);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method unaryOpMethod = iRClazz.getDeclaredMethod("unaryOp", intType, nodeType);
        unaryOpMethod.setAccessible(true);
        java.lang.Object[] unaryOpMethodArguments = new java.lang.Object[2];
        unaryOpMethodArguments[0] = 0;
        unaryOpMethodArguments[1] = node;
        Node actual = ((Node) unaryOpMethod.invoke(null, unaryOpMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 37;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method unaryOp(int, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testUnaryOp2() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class intType = int.class;
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method unaryOpMethod = iRClazz.getDeclaredMethod("unaryOp", intType, numberNodeType);
        unaryOpMethod.setAccessible(true);
        java.lang.Object[] unaryOpMethodArguments = new java.lang.Object[2];
        unaryOpMethodArguments[0] = 0;
        unaryOpMethodArguments[1] = numberNode;
        try {
            unaryOpMethod.invoke(null, unaryOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method unaryOp(int, com.google.javascript.rhino.Node)
    
    @Test
    public void testUnaryOp3() throws Throwable  {
        /* This test fails because method [com.google.javascript.rhino.IR.unaryOp] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.unaryOp(IR.java:453) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method unaryOpMethod = iRClazz.getDeclaredMethod("unaryOp", intType, nodeType);
        unaryOpMethod.setAccessible(true);
        java.lang.Object[] unaryOpMethodArguments = new java.lang.Object[2];
        unaryOpMethodArguments[0] = 0;
        unaryOpMethodArguments[1] = ((Object) null);
        try {
            unaryOpMethod.invoke(null, unaryOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.binaryOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method binaryOp(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#binaryOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(expr1));
 *  */
    @Test
    public void testBinaryOp_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.rhino.IR.binaryOp] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.binaryOp(IR.java:447) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method binaryOpMethod = iRClazz.getDeclaredMethod("binaryOp", intType, nodeType, nodeType);
        binaryOpMethod.setAccessible(true);
        java.lang.Object[] binaryOpMethodArguments = new java.lang.Object[3];
        binaryOpMethodArguments[0] = 1;
        binaryOpMethodArguments[1] = ((Object) null);
        binaryOpMethodArguments[2] = ((Object) null);
        try {
            binaryOpMethod.invoke(null, binaryOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method binaryOp(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testBinaryOp1() throws Throwable  {
        Node node = new Node(64);
        
        /* This test fails because method [com.google.javascript.rhino.IR.binaryOp] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.binaryOp(IR.java:448) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method binaryOpMethod = iRClazz.getDeclaredMethod("binaryOp", intType, nodeType, nodeType);
        binaryOpMethod.setAccessible(true);
        java.lang.Object[] binaryOpMethodArguments = new java.lang.Object[3];
        binaryOpMethodArguments[0] = 0;
        binaryOpMethodArguments[1] = node;
        binaryOpMethodArguments[2] = ((Object) null);
        try {
            binaryOpMethod.invoke(null, binaryOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBinaryOp2() throws Throwable  {
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.rhino.IR.binaryOp] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.binaryOp(IR.java:448) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method binaryOpMethod = iRClazz.getDeclaredMethod("binaryOp", intType, nodeType, nodeType);
        binaryOpMethod.setAccessible(true);
        java.lang.Object[] binaryOpMethodArguments = new java.lang.Object[3];
        binaryOpMethodArguments[0] = 0;
        binaryOpMethodArguments[1] = node;
        binaryOpMethodArguments[2] = ((Object) null);
        try {
            binaryOpMethod.invoke(null, binaryOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method binaryOp(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testBinaryOp3() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method binaryOpMethod = iRClazz.getDeclaredMethod("binaryOp", intType, stringNodeType, stringNodeType);
        binaryOpMethod.setAccessible(true);
        java.lang.Object[] binaryOpMethodArguments = new java.lang.Object[3];
        binaryOpMethodArguments[0] = 0;
        binaryOpMethodArguments[1] = stringNode;
        binaryOpMethodArguments[2] = ((Object) null);
        try {
            binaryOpMethod.invoke(null, binaryOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.empty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method empty()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#empty()}
 * @utbot.returnsFrom {@code return new Node(Token.EMPTY);}
 *  */
    @Test
    public void testEmpty_Return() throws Exception  {
        Node actual = IR.empty();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 124;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.function
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method function(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isParamList()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.returnsFrom {@code return new Node(Token.FUNCTION, name, params, body);}
 *  */
    @Test
    public void testFunction_PreconditionsCheckState() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.type = 83;
        Node node2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node2.type = 125;
        
        Node initialNodeNext = node.next;
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNode1Next = node1.next;
        Node initialNode1Parent = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNode2Parent = ((Node) getFieldValue(node2, "com.google.javascript.rhino.Node", "parent"));
        
        Node actual = IR.function(node, node1, node2);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 105;
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", node2);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.next;
        Node actualFirstNext = actualFirst.next;
        int expectedFirstNextType = expectedFirstNext.type;
        int actualFirstNextType = actualFirstNext.type;
        assertEquals(expectedFirstNextType, actualFirstNextType);
        
        Node expectedFirstNextNext = expectedFirstNext.next;
        Node actualFirstNextNext = actualFirstNext.next;
        int expectedFirstNextNextType = expectedFirstNextNext.type;
        int actualFirstNextNextType = actualFirstNextNext.type;
        assertEquals(expectedFirstNextNextType, actualFirstNextNextType);
        
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        Node actualFirstNextNextFirst = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextNextFirst);
        
        Node actualFirstNextNextLast = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextNextLast);
        
        Object actualFirstNextNextPropListHead = getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextNextPropListHead);
        
        int expectedFirstNextNextSourcePosition = expectedFirstNextNext.getSourcePosition();
        int actualFirstNextNextSourcePosition = actualFirstNextNext.getSourcePosition();
        assertEquals(expectedFirstNextNextSourcePosition, actualFirstNextNextSourcePosition);
        
        JSType actualFirstNextNextJsType = ((JSType) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextNextJsType);
        
        Node expectedFirstNextNextParent = expectedFirstNextNext.getParent();
        Node actualFirstNextNextParent = actualFirstNextNext.getParent();
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        Node expectedFirstNextNextParentLast = ((Node) getFieldValue(expectedFirstNextNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextNextParentLast = ((Node) getFieldValue(actualFirstNextNextParent, "com.google.javascript.rhino.Node", "last"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstNextNextParentLast, actualFirstNextNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        int expectedFirstNextNextParentSourcePosition = expectedFirstNextNextParent.getSourcePosition();
        int actualFirstNextNextParentSourcePosition = actualFirstNextNextParent.getSourcePosition();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstNextNextParentSourcePosition, actualFirstNextNextParentSourcePosition));
        
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        Node actualFirstNextNextParentParent = actualFirstNextNextParent.getParent();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualFirstNextNextParentParent, actualFirstNextNextParentParent));
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNodeNext = node.next;
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNode1Next = node1.next;
        Node finalNode1Parent = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNode2Parent = ((Node) getFieldValue(node2, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNodeNext == finalNodeNext);
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialNode1Next == finalNode1Next);
        
        assertFalse(initialNode1Parent == finalNode1Parent);
        
        assertFalse(initialNode2Parent == finalNode2Parent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method function(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(params.isParamList());
 *  */
    @Test
    public void testFunction_ThrowNullPointerException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.rhino.IR.function] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.function(IR.java:59) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method functionMethod = iRClazz.getDeclaredMethod("function", numberNodeType, numberNodeType, numberNodeType);
        functionMethod.setAccessible(true);
        java.lang.Object[] functionMethodArguments = new java.lang.Object[3];
        functionMethodArguments[0] = numberNode;
        functionMethodArguments[1] = ((Object) null);
        functionMethodArguments[2] = ((Object) null);
        try {
            functionMethod.invoke(null, functionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isParamList()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(body.isBlock());
 *  */
    @Test
    public void testFunction_ThrowNullPointerException_2() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        Node node = new Node(83);
        
        /* This test fails because method [com.google.javascript.rhino.IR.function] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.function(IR.java:60) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method functionMethod = iRClazz.getDeclaredMethod("function", numberNodeType, numberNodeType, numberNodeType);
        functionMethod.setAccessible(true);
        java.lang.Object[] functionMethodArguments = new java.lang.Object[3];
        functionMethodArguments[0] = numberNode;
        functionMethodArguments[1] = node;
        functionMethodArguments[2] = ((Object) null);
        try {
            functionMethod.invoke(null, functionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(name.isName());
 *  */
    @Test
    public void testFunction_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.function] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.function(IR.java:58) */
        IR.function(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method function(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name.isName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testFunction_ThrowIllegalStateException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method functionMethod = iRClazz.getDeclaredMethod("function", numberNodeType, numberNodeType, numberNodeType);
        functionMethod.setAccessible(true);
        java.lang.Object[] functionMethodArguments = new java.lang.Object[3];
        functionMethodArguments[0] = numberNode;
        functionMethodArguments[1] = ((Object) null);
        functionMethodArguments[2] = ((Object) null);
        try {
            functionMethod.invoke(null, functionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(params.isParamList());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testFunction_ThrowIllegalStateException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        Node node = new Node(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method functionMethod = iRClazz.getDeclaredMethod("function", numberNodeType, numberNodeType, numberNodeType);
        functionMethod.setAccessible(true);
        java.lang.Object[] functionMethodArguments = new java.lang.Object[3];
        functionMethodArguments[0] = numberNode;
        functionMethodArguments[1] = node;
        functionMethodArguments[2] = ((Object) null);
        try {
            functionMethod.invoke(null, functionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.FUNCTION, name, params, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFunction_ThrowIllegalArgumentException() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(83);
        Node node1 = new Node(125);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method functionMethod = iRClazz.getDeclaredMethod("function", nodeType, nodeType, nodeType);
        functionMethod.setAccessible(true);
        java.lang.Object[] functionMethodArguments = new java.lang.Object[3];
        functionMethodArguments[0] = node;
        functionMethodArguments[1] = numberNode;
        functionMethodArguments[2] = node1;
        try {
            functionMethod.invoke(null, functionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(body.isBlock());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testFunction_ThrowIllegalStateException_2() {
        Node node = new Node(38);
        Node node1 = new Node(83);
        Node node2 = new Node(-255);
        
        IR.function(node, node1, node2);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.FUNCTION, name, params, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFunction_ThrowIllegalArgumentException_1() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.next = next;
        Node node1 = new Node(83);
        Node node2 = new Node(125);
        
        IR.function(node, node1, node2);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.FUNCTION, name, params, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFunction_ThrowIllegalArgumentException_2() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.type = 83;
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node1, "com.google.javascript.rhino.Node", "parent", parent);
        Node node2 = new Node(125);
        
        IR.function(node, node1, node2);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.FUNCTION, name, params, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFunction_ThrowIllegalArgumentException_3() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.type = 83;
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.next = next;
        Node node2 = new Node(125);
        
        IR.function(node, node1, node2);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.FUNCTION, name, params, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFunction_ThrowIllegalArgumentException_4() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.type = 83;
        Node node2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node2.type = 125;
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node2, "com.google.javascript.rhino.Node", "parent", parent);
        
        IR.function(node, node1, node2);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#function(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.FUNCTION, name, params, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testFunction_ThrowIllegalArgumentException_5() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(83);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.type = 125;
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.next = next;
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method functionMethod = iRClazz.getDeclaredMethod("function", nodeType, nodeType, nodeType);
        functionMethod.setAccessible(true);
        java.lang.Object[] functionMethodArguments = new java.lang.Object[3];
        functionMethodArguments[0] = node;
        functionMethodArguments[1] = stringNode;
        functionMethodArguments[2] = node1;
        try {
            functionMethod.invoke(null, functionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.pos
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method pos(com.google.javascript.rhino.Node)
    
    @Test
    public void testPos1() throws Exception  {
        Node node = new Node(100);
        
        Node actual = IR.pos(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 28;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 100;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method pos(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testPos2() {
        Node node = new Node(76);
        
        IR.pos(node);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method pos(com.google.javascript.rhino.Node)
    
    @Test
    public void testPos3() {
        /* This test fails because method [com.google.javascript.rhino.IR.pos] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.unaryOp(IR.java:453)
            com.google.javascript.rhino.IR.pos(IR.java:360) */
        IR.pos(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.tryFinally
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFinally(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabelName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(finallyBody.isLabelName());
 *  */
    @Test
    public void testTryFinally_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(153);
        
        /* This test fails because method [com.google.javascript.rhino.IR.tryFinally] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.tryFinally(IR.java:225) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFinallyMethod = iRClazz.getDeclaredMethod("tryFinally", stringNodeType, stringNodeType);
        tryFinallyMethod.setAccessible(true);
        java.lang.Object[] tryFinallyMethodArguments = new java.lang.Object[2];
        tryFinallyMethodArguments[0] = stringNode;
        tryFinallyMethodArguments[1] = ((Object) null);
        try {
            tryFinallyMethod.invoke(null, tryFinallyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabelName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(tryBody.isLabelName());
 *  */
    @Test
    public void testTryFinally_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.tryFinally] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.tryFinally(IR.java:224) */
        IR.tryFinally(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFinally(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(finallyBody.isLabelName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFinally_ThrowIllegalStateException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(153);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFinallyMethod = iRClazz.getDeclaredMethod("tryFinally", stringNodeType, stringNodeType);
        tryFinallyMethod.setAccessible(true);
        java.lang.Object[] tryFinallyMethodArguments = new java.lang.Object[2];
        tryFinallyMethodArguments[0] = stringNode;
        tryFinallyMethodArguments[1] = numberNode;
        try {
            tryFinallyMethod.invoke(null, tryFinallyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(tryBody.isLabelName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFinally_ThrowIllegalStateException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFinallyMethod = iRClazz.getDeclaredMethod("tryFinally", stringNodeType, stringNodeType);
        tryFinallyMethod.setAccessible(true);
        java.lang.Object[] tryFinallyMethodArguments = new java.lang.Object[2];
        tryFinallyMethodArguments[0] = stringNode;
        tryFinallyMethodArguments[1] = ((Object) null);
        try {
            tryFinallyMethod.invoke(null, tryFinallyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Node catchBody = block().copyInformationFrom(tryBody);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFinally_ThrowUnsupportedOperationException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(153);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFinallyMethod = iRClazz.getDeclaredMethod("tryFinally", stringNodeType, stringNodeType);
        tryFinallyMethod.setAccessible(true);
        java.lang.Object[] tryFinallyMethodArguments = new java.lang.Object[2];
        tryFinallyMethodArguments[0] = stringNode;
        tryFinallyMethodArguments[1] = numberNode;
        try {
            tryFinallyMethod.invoke(null, tryFinallyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.TRY, tryBody, catchBody, finallyBody);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFinally_ThrowIllegalArgumentException() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 153;
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFinallyMethod = iRClazz.getDeclaredMethod("tryFinally", nodeType, nodeType);
        tryFinallyMethod.setAccessible(true);
        java.lang.Object[] tryFinallyMethodArguments = new java.lang.Object[2];
        tryFinallyMethodArguments[0] = node;
        tryFinallyMethodArguments[1] = numberNode;
        try {
            tryFinallyMethod.invoke(null, tryFinallyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#tryFinally(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.TRY, tryBody, catchBody, finallyBody);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFinally_ThrowIllegalArgumentException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(153);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFinallyMethod = iRClazz.getDeclaredMethod("tryFinally", stringNodeType, stringNodeType);
        tryFinallyMethod.setAccessible(true);
        java.lang.Object[] tryFinallyMethodArguments = new java.lang.Object[2];
        tryFinallyMethodArguments[0] = stringNode;
        tryFinallyMethodArguments[1] = numberNode;
        try {
            tryFinallyMethod.invoke(null, tryFinallyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFinally(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFinally1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(153);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFinallyMethod = iRClazz.getDeclaredMethod("tryFinally", numberNodeType, numberNodeType);
        tryFinallyMethod.setAccessible(true);
        java.lang.Object[] tryFinallyMethodArguments = new java.lang.Object[2];
        tryFinallyMethodArguments[0] = numberNode;
        tryFinallyMethodArguments[1] = numberNode1;
        Node actual = ((Node) tryFinallyMethod.invoke(null, tryFinallyMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 77;
        setField(expected, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode1);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstNumber = ((Double) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNumber, actualFirstNumber, 1.0E-6);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.next;
        Node actualFirstNext = actualFirst.next;
        int expectedFirstNextType = expectedFirstNext.type;
        int actualFirstNextType = actualFirstNext.type;
        assertEquals(expectedFirstNextType, actualFirstNextType);
        
        Node expectedFirstNextNext = expectedFirstNext.next;
        Node actualFirstNextNext = actualFirstNext.next;
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        Node actualFirstNextNextFirst = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextNextFirst);
        
        Node actualFirstNextNextLast = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextNextLast);
        
        Object actualFirstNextNextPropListHead = getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextNextPropListHead);
        
        int expectedFirstNextNextSourcePosition = expectedFirstNextNext.getSourcePosition();
        int actualFirstNextNextSourcePosition = actualFirstNextNext.getSourcePosition();
        assertEquals(expectedFirstNextNextSourcePosition, actualFirstNextNextSourcePosition);
        
        JSType actualFirstNextNextJsType = ((JSType) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextNextJsType);
        
        Node expectedFirstNextNextParent = expectedFirstNextNext.getParent();
        Node actualFirstNextNextParent = actualFirstNextNext.getParent();
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        Node expectedFirstNextNextParentLast = ((Node) getFieldValue(expectedFirstNextNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextNextParentLast = ((Node) getFieldValue(actualFirstNextNextParent, "com.google.javascript.rhino.Node", "last"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstNextNextParentLast, actualFirstNextNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        int expectedFirstNextNextParentSourcePosition = expectedFirstNextNextParent.getSourcePosition();
        int actualFirstNextNextParentSourcePosition = actualFirstNextNextParent.getSourcePosition();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstNextNextParentSourcePosition, actualFirstNextNextParentSourcePosition));
        
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        Node actualFirstNextNextParentParent = actualFirstNextNextParent.getParent();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualFirstNextNextParentParent, actualFirstNextNextParentParent));
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Object expectedFirstNextPropListHead = getFieldValue(expectedFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        Object expectedFirstNextPropListHeadObjectValue = getFieldValue(expectedFirstNextPropListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        Object actualFirstNextPropListHeadObjectValue = getFieldValue(actualFirstNextPropListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        Object actualFirstNextPropListHeadObjectValueObjectValue = getFieldValue(actualFirstNextPropListHeadObjectValue, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualFirstNextPropListHeadObjectValueObjectValue, actualFirstNextPropListHeadObjectValueObjectValue));
        
        Object actualFirstNextPropListHeadObjectValueNext = getFieldValue(actualFirstNextPropListHeadObjectValue, "com.google.javascript.rhino.Node$AbstractPropListItem", "next");
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualFirstNextPropListHeadObjectValueNext, actualFirstNextPropListHeadObjectValueNext));
        
        int expectedFirstNextPropListHeadObjectValuePropType = ((Integer) getFieldValue(expectedFirstNextPropListHeadObjectValue, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        int actualFirstNextPropListHeadObjectValuePropType = ((Integer) getFieldValue(actualFirstNextPropListHeadObjectValue, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstNextPropListHeadObjectValuePropType, actualFirstNextPropListHeadObjectValuePropType));
        
        assertTrue(deepEquals(expectedFirstNextPropListHead, actualFirstNextPropListHead));
        int expectedFirstNextPropListHeadPropType = ((Integer) getFieldValue(expectedFirstNextPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        int actualFirstNextPropListHeadPropType = ((Integer) getFieldValue(actualFirstNextPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        assertEquals(expectedFirstNextPropListHeadPropType, actualFirstNextPropListHeadPropType);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Object expectedFirstPropListHead = getFieldValue(expectedFirst, "com.google.javascript.rhino.Node", "propListHead");
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertTrue(deepEquals(expectedFirstPropListHead, actualFirstPropListHead));
        Object expectedFirstPropListHeadNext = getFieldValue(expectedFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next");
        Object actualFirstPropListHeadNext = getFieldValue(actualFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next");
        assertTrue(deepEquals(expectedFirstPropListHeadNext, actualFirstPropListHeadNext));
        assertTrue(deepEquals(expectedFirstPropListHeadNext, actualFirstPropListHeadNext));
        assertTrue(deepEquals(expectedFirstPropListHeadNext, actualFirstPropListHeadNext));
        
        assertTrue(deepEquals(expectedFirstPropListHead, actualFirstPropListHead));
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testTryFinally2() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 153;
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFinallyMethod = iRClazz.getDeclaredMethod("tryFinally", nodeType, nodeType);
        tryFinallyMethod.setAccessible(true);
        java.lang.Object[] tryFinallyMethodArguments = new java.lang.Object[2];
        tryFinallyMethodArguments[0] = node;
        tryFinallyMethodArguments[1] = numberNode;
        Node actual = ((Node) tryFinallyMethod.invoke(null, tryFinallyMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 77;
        setField(expected, "com.google.javascript.rhino.Node", "first", node);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.next;
        Node actualFirstNext = actualFirst.next;
        int expectedFirstNextType = expectedFirstNext.type;
        int actualFirstNextType = actualFirstNext.type;
        assertEquals(expectedFirstNextType, actualFirstNextType);
        
        Node expectedFirstNextNext = expectedFirstNext.next;
        Node actualFirstNextNext = actualFirstNext.next;
        double expectedFirstNextNextNumber = ((Double) getFieldValue(expectedFirstNextNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNextNextNumber = ((Double) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNextNextNumber, actualFirstNextNextNumber, 1.0E-6);
        
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(expectedFirstNextNext, actualFirstNextNext));
        Node actualFirstNextNextFirst = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextNextFirst);
        
        Node actualFirstNextNextLast = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextNextLast);
        
        Object actualFirstNextNextPropListHead = getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextNextPropListHead);
        
        int expectedFirstNextNextSourcePosition = expectedFirstNextNext.getSourcePosition();
        int actualFirstNextNextSourcePosition = actualFirstNextNext.getSourcePosition();
        assertEquals(expectedFirstNextNextSourcePosition, actualFirstNextNextSourcePosition);
        
        JSType actualFirstNextNextJsType = ((JSType) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextNextJsType);
        
        Node expectedFirstNextNextParent = expectedFirstNextNext.getParent();
        Node actualFirstNextNextParent = actualFirstNextNext.getParent();
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        Node expectedFirstNextNextParentLast = ((Node) getFieldValue(expectedFirstNextNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextNextParentLast = ((Node) getFieldValue(actualFirstNextNextParent, "com.google.javascript.rhino.Node", "last"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstNextNextParentLast, actualFirstNextNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        int expectedFirstNextNextParentSourcePosition = expectedFirstNextNextParent.getSourcePosition();
        int actualFirstNextNextParentSourcePosition = actualFirstNextNextParent.getSourcePosition();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstNextNextParentSourcePosition, actualFirstNextNextParentSourcePosition));
        
        assertTrue(deepEquals(expectedFirstNextNextParent, actualFirstNextNextParent));
        Node actualFirstNextNextParentParent = actualFirstNextNextParent.getParent();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualFirstNextNextParentParent, actualFirstNextNextParentParent));
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Object expectedFirstPropListHead = getFieldValue(expectedFirst, "com.google.javascript.rhino.Node", "propListHead");
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        Object actualFirstPropListHeadObjectValue = getFieldValue(actualFirstPropListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue");
        assertNull(actualFirstPropListHeadObjectValue);
        
        Object expectedFirstPropListHeadNext = getFieldValue(expectedFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next");
        Object actualFirstPropListHeadNext = getFieldValue(actualFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next");
        assertTrue(deepEquals(expectedFirstPropListHeadNext, actualFirstPropListHeadNext));
        Object actualFirstPropListHeadNextNext = getFieldValue(actualFirstPropListHeadNext, "com.google.javascript.rhino.Node$AbstractPropListItem", "next");
        assertNull(actualFirstPropListHeadNextNext);
        
        int expectedFirstPropListHeadNextPropType = ((Integer) getFieldValue(expectedFirstPropListHeadNext, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        int actualFirstPropListHeadNextPropType = ((Integer) getFieldValue(actualFirstPropListHeadNext, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        assertEquals(expectedFirstPropListHeadNextPropType, actualFirstPropListHeadNextPropType);
        
        int expectedFirstPropListHeadPropType = ((Integer) getFieldValue(expectedFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        int actualFirstPropListHeadPropType = ((Integer) getFieldValue(actualFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        assertEquals(expectedFirstPropListHeadPropType, actualFirstPropListHeadPropType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryFinally(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryFinally3() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(153);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(153);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFinallyMethod = iRClazz.getDeclaredMethod("tryFinally", stringNodeType, stringNodeType);
        tryFinallyMethod.setAccessible(true);
        java.lang.Object[] tryFinallyMethodArguments = new java.lang.Object[2];
        tryFinallyMethodArguments[0] = stringNode;
        tryFinallyMethodArguments[1] = numberNode;
        try {
            tryFinallyMethod.invoke(null, tryFinallyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.eq
    
    ///region OTHER: ERROR SUITE for method eq(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testEq1() {
        Node node = new Node(39);
        
        /* This test fails because method [com.google.javascript.rhino.IR.eq] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.binaryOp(IR.java:448)
            com.google.javascript.rhino.IR.eq(IR.java:341) */
        IR.eq(node, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method eq(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testEq2() {
        Node node = new Node(55);
        
        IR.eq(node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.block
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method block(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#block(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeStatement(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeStatement(stmt));
 *  */
    @Test
    public void testBlock_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.block] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeStatement(IR.java:474)
            com.google.javascript.rhino.IR.block(IR.java:97) */
        IR.block(((Node) null));
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method block(com.google.javascript.rhino.Node)
    
    @Test
    public void testBlock1() throws Exception  {
        Node node = new Node(4);
        
        Node actual = IR.block(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 125;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 4;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method block(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalArgumentException.class)
    public void testBlock2() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 77;
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        IR.block(node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.block
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method block([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#block(com.google.javascript.rhino.Node[])}
 * @utbot.returnsFrom {@code return block;}
 *  */
    @Test
    public void testBlock_ReturnBlock() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = {};
        
        Node actual = IR.block(nodeArray);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 125;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method block([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#block(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node stmt: stmts)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeStatement(stmt));
 *  */
    @Test
    public void testBlock_ThrowNullPointerException_1() {
        com.google.javascript.rhino.Node[] nodeArray = {null};
        
        /* This test fails because method [com.google.javascript.rhino.IR.block] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeStatement(IR.java:474)
            com.google.javascript.rhino.IR.block(IR.java:105) */
        IR.block(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#block(com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node stmt: stmts)
 *  */
    @Test
    public void testBlock_ThrowNullPointerException1() {
        /* This test fails because method [com.google.javascript.rhino.IR.block] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.block(IR.java:104) */
        IR.block(((com.google.javascript.rhino.Node[]) null));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.block
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method block()
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#block()}
 * @utbot.returnsFrom {@code return block;}
 *  */
    @Test
    public void testBlock_ReturnBlock1() throws Exception  {
        Node actual = IR.block();
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 125;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.defaultCase
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method defaultCase(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#defaultCase(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#putBooleanProp(int,boolean)}
 * @utbot.returnsFrom {@code return new Node(Token.DEFAULT_CASE, body);}
 *  */
    @Test
    public void testDefaultCase_NodePutBooleanProp() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        
        Object initialNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method defaultCaseMethod = iRClazz.getDeclaredMethod("defaultCase", numberNodeType);
        defaultCaseMethod.setAccessible(true);
        java.lang.Object[] defaultCaseMethodArguments = new java.lang.Object[1];
        defaultCaseMethodArguments[0] = numberNode;
        Node actual = ((Node) defaultCaseMethod.invoke(null, defaultCaseMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 112;
        setField(expected, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstNumber = ((Double) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNumber, actualFirstNumber, 1.0E-6);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object expectedFirstPropListHead = getFieldValue(expectedFirst, "com.google.javascript.rhino.Node", "propListHead");
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        int expectedFirstPropListHeadIntValue = ((Integer) getFieldValue(expectedFirstPropListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue"));
        int actualFirstPropListHeadIntValue = ((Integer) getFieldValue(actualFirstPropListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue"));
        assertEquals(expectedFirstPropListHeadIntValue, actualFirstPropListHeadIntValue);
        
        Object actualFirstPropListHeadNext = getFieldValue(actualFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next");
        assertNull(actualFirstPropListHeadNext);
        
        int expectedFirstPropListHeadPropType = ((Integer) getFieldValue(expectedFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        int actualFirstPropListHeadPropType = ((Integer) getFieldValue(actualFirstPropListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType"));
        assertEquals(expectedFirstPropListHeadPropType, actualFirstPropListHeadPropType);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        Object actualFirstParentPropListHead = getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstParentPropListHead);
        
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Object finalNumberNodePropListHead = getFieldValue(numberNode, "com.google.javascript.rhino.Node", "propListHead");
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNumberNodePropListHead == finalNumberNodePropListHead);
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method defaultCase(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#defaultCase(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(body.isBlock());
 *  */
    @Test
    public void testDefaultCase_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.defaultCase] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.defaultCase(IR.java:205) */
        IR.defaultCase(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method defaultCase(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#defaultCase(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(body.isBlock());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testDefaultCase_ThrowIllegalStateException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method defaultCaseMethod = iRClazz.getDeclaredMethod("defaultCase", numberNodeType);
        defaultCaseMethod.setAccessible(true);
        java.lang.Object[] defaultCaseMethodArguments = new java.lang.Object[1];
        defaultCaseMethodArguments[0] = numberNode;
        try {
            defaultCaseMethod.invoke(null, defaultCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#defaultCase(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.DEFAULT_CASE, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDefaultCase_ThrowIllegalArgumentException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method defaultCaseMethod = iRClazz.getDeclaredMethod("defaultCase", numberNodeType);
        defaultCaseMethod.setAccessible(true);
        java.lang.Object[] defaultCaseMethodArguments = new java.lang.Object[1];
        defaultCaseMethodArguments[0] = numberNode;
        try {
            defaultCaseMethod.invoke(null, defaultCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#defaultCase(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.DEFAULT_CASE, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDefaultCase_ThrowIllegalArgumentException_2() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 125;
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 38);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        IR.defaultCase(node);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#defaultCase(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.DEFAULT_CASE, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDefaultCase_ThrowIllegalArgumentException_3() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method defaultCaseMethod = iRClazz.getDeclaredMethod("defaultCase", numberNodeType);
        defaultCaseMethod.setAccessible(true);
        java.lang.Object[] defaultCaseMethodArguments = new java.lang.Object[1];
        defaultCaseMethodArguments[0] = numberNode;
        try {
            defaultCaseMethod.invoke(null, defaultCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#defaultCase(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.DEFAULT_CASE, body);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testDefaultCase_ThrowIllegalArgumentException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method defaultCaseMethod = iRClazz.getDeclaredMethod("defaultCase", stringNodeType);
        defaultCaseMethod.setAccessible(true);
        java.lang.Object[] defaultCaseMethodArguments = new java.lang.Object[1];
        defaultCaseMethodArguments[0] = stringNode;
        try {
            defaultCaseMethod.invoke(null, defaultCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.newNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newNode(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#newNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node[])}
 * @utbot.returnsFrom {@code return newcall;}
 *  */
    @Test
    public void testNewNode_ReturnNewcall() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        com.google.javascript.rhino.Node[] nodeArray = {};
        
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeArrayType = Class.forName("[Lcom.google.javascript.rhino.Node;");
        Method newNodeMethod = iRClazz.getDeclaredMethod("newNode", numberNodeType, nodeArrayType);
        newNodeMethod.setAccessible(true);
        java.lang.Object[] newNodeMethodArguments = new java.lang.Object[2];
        newNodeMethodArguments[0] = numberNode;
        newNodeMethodArguments[1] = ((Object) nodeArray);
        Node actual = ((Node) newNodeMethod.invoke(null, newNodeMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 30;
        setField(expected, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstNumber = ((Double) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNumber, actualFirstNumber, 1.0E-6);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method newNode(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#newNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node newcall = new Node(Token.NEW, target);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        IR.newNode(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#newNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node newcall = new Node(Token.NEW, target);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testNewNode_ThrowIllegalArgumentException_1() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.next = next;
        
        IR.newNode(node, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newNode(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#newNode(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node arg: args)
 *  */
    @Test
    public void testNewNode_ThrowNullPointerException() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        /* This test fails because method [com.google.javascript.rhino.IR.newNode] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.newNode(IR.java:285) */
        IR.newNode(node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.hook
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hook(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#hook(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(cond));
 *  */
    @Test
    public void testHook_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.hook] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.hook(IR.java:315) */
        IR.hook(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.number
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method number(double)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#number(double)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newNumber(double)}
 * @utbot.returnsFrom {@code return Node.newNumber(d);}
 *  */
    @Test
    public void testNumber_NodeNewNumber() throws Exception  {
        Object actual = IR.number(java.lang.Double.NaN);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(expected, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) expected)).setType(39);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        double expectedNumber = ((Double) getFieldValue(expected, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualNumber = ((Double) getFieldValue(actual, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedNumber, actualNumber, 1.0E-6);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.string
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method string(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#string(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(java.lang.String)}
 * @utbot.returnsFrom {@code return Node.newString(s);}
 *  */
    @Test
    public void testString_NodeNewString() throws Exception  {
        String string = "";
        
        Object actual = IR.string(string);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) expected)).setType(40);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        String expectedStr = ((String) getFieldValue(expected, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(expectedStr, actualStr);
        
        int expectedType = (((Node) expected)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = (((Node) expected)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method string(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#string(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return Node.newString(s);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testString_ThrowIllegalArgumentException() {
        IR.string(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.var
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method var(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#var(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.returnsFrom {@code return new Node(Token.VAR, name);}
 *  */
    @Test
    public void testVar_PreconditionsCheckState() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method varMethod = iRClazz.getDeclaredMethod("var", numberNodeType);
        varMethod.setAccessible(true);
        java.lang.Object[] varMethodArguments = new java.lang.Object[1];
        varMethodArguments[0] = numberNode;
        Node actual = ((Node) varMethod.invoke(null, varMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 118;
        setField(expected, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstNumber = ((Double) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNumber, actualFirstNumber, 1.0E-6);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method var(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#var(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(name.isName());
 *  */
    @Test
    public void testVar_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.var] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.var(IR.java:130) */
        IR.var(null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method var(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#var(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name.isName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVar_ThrowIllegalStateException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method varMethod = iRClazz.getDeclaredMethod("var", numberNodeType);
        varMethod.setAccessible(true);
        java.lang.Object[] varMethodArguments = new java.lang.Object[1];
        varMethodArguments[0] = numberNode;
        try {
            varMethod.invoke(null, varMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#var(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.VAR, name);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testVar_ThrowIllegalArgumentException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method varMethod = iRClazz.getDeclaredMethod("var", numberNodeType);
        varMethod.setAccessible(true);
        java.lang.Object[] varMethodArguments = new java.lang.Object[1];
        varMethodArguments[0] = numberNode;
        try {
            varMethod.invoke(null, varMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#var(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return new Node(Token.VAR, name);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testVar_ThrowIllegalArgumentException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method varMethod = iRClazz.getDeclaredMethod("var", numberNodeType);
        varMethod.setAccessible(true);
        java.lang.Object[] varMethodArguments = new java.lang.Object[1];
        varMethodArguments[0] = numberNode;
        try {
            varMethod.invoke(null, varMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.var
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method var(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#var(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(name.isName() && !name.hasChildren());
 *  */
    @Test
    public void testVar_ThrowNullPointerException1() {
        /* This test fails because method [com.google.javascript.rhino.IR.var] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.var(IR.java:123) */
        IR.var(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#var(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.isName() && !name.hasChildren());): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.isName() && !name.hasChildren());): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeExpression(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeExpression(value));
 *  */
    @Test
    public void testVar_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.rhino.IR.var] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.var(IR.java:124) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method varMethod = iRClazz.getDeclaredMethod("var", stringNodeType, stringNodeType);
        varMethod.setAccessible(true);
        java.lang.Object[] varMethodArguments = new java.lang.Object[2];
        varMethodArguments[0] = stringNode;
        varMethodArguments[1] = ((Object) null);
        try {
            varMethod.invoke(null, varMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method var(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#var(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.isName() && !name.hasChildren());): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name.isName() && !name.hasChildren());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVar_ThrowIllegalStateException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method varMethod = iRClazz.getDeclaredMethod("var", stringNodeType, stringNodeType);
        varMethod.setAccessible(true);
        java.lang.Object[] varMethodArguments = new java.lang.Object[2];
        varMethodArguments[0] = stringNode;
        varMethodArguments[1] = ((Object) null);
        try {
            varMethod.invoke(null, varMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#var(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.isName() && !name.hasChildren());): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(name.isName() && !name.hasChildren());): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name.isName() && !name.hasChildren());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVar_ThrowIllegalStateException1() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 38;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        IR.var(node, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method var(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVar1() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(102);
        
        Node initialStringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method varMethod = iRClazz.getDeclaredMethod("var", stringNodeType, stringNodeType);
        varMethod.setAccessible(true);
        java.lang.Object[] varMethodArguments = new java.lang.Object[2];
        varMethodArguments[0] = stringNode;
        varMethodArguments[1] = numberNode;
        Node actual = ((Node) varMethod.invoke(null, varMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 118;
        setField(expected, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", stringNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node expectedFirstFirst = ((Node) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstFirstNumber = ((Double) getFieldValue(expectedFirstFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstFirstNumber = ((Double) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstFirstNumber, actualFirstFirstNumber, 1.0E-6);
        
        int expectedFirstFirstType = expectedFirstFirst.type;
        int actualFirstFirstType = actualFirstFirst.type;
        assertEquals(expectedFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(expectedFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int expectedFirstFirstSourcePosition = expectedFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(expectedFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node expectedFirstFirstParent = expectedFirstFirst.getParent();
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertTrue(deepEquals(expectedFirstFirstParent, actualFirstFirstParent));
        assertTrue(deepEquals(expectedFirstFirstParent, actualFirstFirstParent));
        assertTrue(deepEquals(expectedFirstFirstParent, actualFirstFirstParent));
        assertTrue(deepEquals(expectedFirstFirstParent, actualFirstFirstParent));
        Node expectedFirstFirstParentLast = ((Node) getFieldValue(expectedFirstFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstFirstParentLast = ((Node) getFieldValue(actualFirstFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstFirstParentLast, actualFirstFirstParentLast));
        assertTrue(deepEquals(expectedFirstFirstParentLast, actualFirstFirstParentLast));
        assertTrue(deepEquals(expectedFirstFirstParentLast, actualFirstFirstParentLast));
        assertTrue(deepEquals(expectedFirstFirstParentLast, actualFirstFirstParentLast));
        assertTrue(deepEquals(expectedFirstFirstParentLast, actualFirstFirstParentLast));
        assertTrue(deepEquals(expectedFirstFirstParentLast, actualFirstFirstParentLast));
        assertTrue(deepEquals(expectedFirstFirstParentLast, actualFirstFirstParentLast));
        assertTrue(deepEquals(expectedFirstFirstParentLast, actualFirstFirstParentLast));
        assertTrue(deepEquals(expectedFirstFirstParentLast, actualFirstFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstFirstParent, actualFirstFirstParent));
        assertTrue(deepEquals(expectedFirstFirstParent, actualFirstFirstParent));
        assertTrue(deepEquals(expectedFirstFirstParent, actualFirstFirstParent));
        Node expectedFirstFirstParentParent = expectedFirstFirstParent.getParent();
        Node actualFirstFirstParentParent = actualFirstFirstParent.getParent();
        assertTrue(deepEquals(expectedFirstFirstParentParent, actualFirstFirstParentParent));
        assertTrue(deepEquals(expectedFirstFirstParentParent, actualFirstFirstParentParent));
        assertTrue(deepEquals(expectedFirstFirstParentParent, actualFirstFirstParentParent));
        Node expectedFirstFirstParentParentLast = ((Node) getFieldValue(expectedFirstFirstParentParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstFirstParentParentLast = ((Node) getFieldValue(actualFirstFirstParentParent, "com.google.javascript.rhino.Node", "last"));
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstFirstParentParentLast, actualFirstFirstParentParentLast));
        
        assertTrue(deepEquals(expectedFirstFirstParentParent, actualFirstFirstParentParent));
        int expectedFirstFirstParentParentSourcePosition = expectedFirstFirstParentParent.getSourcePosition();
        int actualFirstFirstParentParentSourcePosition = actualFirstFirstParentParent.getSourcePosition();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(expectedFirstFirstParentParentSourcePosition, actualFirstFirstParentParentSourcePosition));
        
        assertTrue(deepEquals(expectedFirstFirstParentParent, actualFirstFirstParentParent));
        Node actualFirstFirstParentParentParent = actualFirstFirstParentParent.getParent();
        // Current deep equals depth exceeds max depth 5
        assertTrue(deepEquals(actualFirstFirstParentParentParent, actualFirstFirstParentParentParent));
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalStringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialStringNodeFirst == finalStringNodeFirst);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method var(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testVar2() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(36);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method varMethod = iRClazz.getDeclaredMethod("var", stringNodeType, stringNodeType);
        varMethod.setAccessible(true);
        java.lang.Object[] varMethodArguments = new java.lang.Object[2];
        varMethodArguments[0] = stringNode;
        varMethodArguments[1] = numberNode;
        try {
            varMethod.invoke(null, varMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.label
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method label(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#label(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabelName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes com.google.javascript.rhino.IR#mayBeStatement(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeStatement(stmt));
 *  */
    @Test
    public void testLabel_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(153);
        
        /* This test fails because method [com.google.javascript.rhino.IR.label] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeStatement(IR.java:474)
            com.google.javascript.rhino.IR.label(IR.java:213) */
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method labelMethod = iRClazz.getDeclaredMethod("label", stringNodeType, stringNodeType);
        labelMethod.setAccessible(true);
        java.lang.Object[] labelMethodArguments = new java.lang.Object[2];
        labelMethodArguments[0] = stringNode;
        labelMethodArguments[1] = ((Object) null);
        try {
            labelMethod.invoke(null, labelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#label(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabelName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(name.isLabelName());
 *  */
    @Test
    public void testLabel_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.label] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.label(IR.java:212) */
        IR.label(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method label(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#label(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isLabelName()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(name.isLabelName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testLabel_ThrowIllegalStateException() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method labelMethod = iRClazz.getDeclaredMethod("label", stringNodeType, stringNodeType);
        labelMethod.setAccessible(true);
        java.lang.Object[] labelMethodArguments = new java.lang.Object[2];
        labelMethodArguments[0] = stringNode;
        labelMethodArguments[1] = ((Object) null);
        try {
            labelMethod.invoke(null, labelMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method label(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testLabel1() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(153);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method labelMethod = iRClazz.getDeclaredMethod("label", stringNodeType, stringNodeType);
        labelMethod.setAccessible(true);
        java.lang.Object[] labelMethodArguments = new java.lang.Object[2];
        labelMethodArguments[0] = stringNode;
        labelMethodArguments[1] = numberNode;
        Node actual = ((Node) labelMethod.invoke(null, labelMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 126;
        setField(expected, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.next;
        Node actualFirstNext = actualFirst.next;
        double expectedFirstNextNumber = ((Double) getFieldValue(expectedFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNextNumber = ((Double) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNextNumber, actualFirstNextNumber, 1.0E-6);
        
        int expectedFirstNextType = expectedFirstNext.type;
        int actualFirstNextType = actualFirstNext.type;
        assertEquals(expectedFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int expectedFirstNextSourcePosition = expectedFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(expectedFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node expectedFirstNextParent = expectedFirstNext.getParent();
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node expectedFirstNextParentLast = ((Node) getFieldValue(expectedFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextParentLast = ((Node) getFieldValue(actualFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        int expectedFirstNextParentSourcePosition = expectedFirstNextParent.getSourcePosition();
        int actualFirstNextParentSourcePosition = actualFirstNextParent.getSourcePosition();
        assertEquals(expectedFirstNextParentSourcePosition, actualFirstNextParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node actualFirstNextParentParent = actualFirstNextParent.getParent();
        assertNull(actualFirstNextParentParent);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testLabel2() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(153);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method labelMethod = iRClazz.getDeclaredMethod("label", stringNodeType, stringNodeType);
        labelMethod.setAccessible(true);
        java.lang.Object[] labelMethodArguments = new java.lang.Object[2];
        labelMethodArguments[0] = stringNode;
        labelMethodArguments[1] = numberNode;
        Node actual = ((Node) labelMethod.invoke(null, labelMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 126;
        setField(expected, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        Node expectedFirstNext = expectedFirst.next;
        Node actualFirstNext = actualFirst.next;
        double expectedFirstNextNumber = ((Double) getFieldValue(expectedFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNextNumber = ((Double) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNextNumber, actualFirstNextNumber, 1.0E-6);
        
        int expectedFirstNextType = expectedFirstNext.type;
        int actualFirstNextType = actualFirstNext.type;
        assertEquals(expectedFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(expectedFirstNext, actualFirstNext));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirst);
        
        Node actualFirstNextLast = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextLast);
        
        Object actualFirstNextPropListHead = getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextPropListHead);
        
        int expectedFirstNextSourcePosition = expectedFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(expectedFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node expectedFirstNextParent = expectedFirstNext.getParent();
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node expectedFirstNextParentLast = ((Node) getFieldValue(expectedFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstNextParentLast = ((Node) getFieldValue(actualFirstNextParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        assertTrue(deepEquals(expectedFirstNextParentLast, actualFirstNextParentLast));
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        int expectedFirstNextParentSourcePosition = expectedFirstNextParent.getSourcePosition();
        int actualFirstNextParentSourcePosition = actualFirstNextParent.getSourcePosition();
        assertEquals(expectedFirstNextParentSourcePosition, actualFirstNextParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstNextParent, actualFirstNextParent));
        Node actualFirstNextParentParent = actualFirstNextParent.getParent();
        assertNull(actualFirstNextParentParent);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        assertTrue(deepEquals(expectedFirst, actualFirst));
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.call
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method call(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#call(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node[])}
 * @utbot.returnsFrom {@code return call;}
 *  */
    @Test
    public void testCall_ReturnCall() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        com.google.javascript.rhino.Node[] nodeArray = {};
        
        Node initialNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        Class iRClazz = Class.forName("com.google.javascript.rhino.IR");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nodeArrayType = Class.forName("[Lcom.google.javascript.rhino.Node;");
        Method callMethod = iRClazz.getDeclaredMethod("call", numberNodeType, nodeArrayType);
        callMethod.setAccessible(true);
        java.lang.Object[] callMethodArguments = new java.lang.Object[2];
        callMethodArguments[0] = numberNode;
        callMethodArguments[1] = ((Object) nodeArray);
        Node actual = ((Node) callMethod.invoke(null, callMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 37;
        setField(expected, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double expectedFirstNumber = ((Double) getFieldValue(expectedFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(expectedFirstNumber, actualFirstNumber, 1.0E-6);
        
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        int expectedFirstParentSourcePosition = expectedFirstParent.getSourcePosition();
        int actualFirstParentSourcePosition = actualFirstParent.getSourcePosition();
        assertEquals(expectedFirstParentSourcePosition, actualFirstParentSourcePosition);
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialNumberNodeParent == finalNumberNodeParent);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method call(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#call(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node call = new Node(Token.CALL, target);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCall_ThrowIllegalArgumentException() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        IR.call(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#call(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node call = new Node(Token.CALL, target);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCall_ThrowIllegalArgumentException_1() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.next = next;
        
        IR.call(node, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method call(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#call(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node arg: args)
 *  */
    @Test
    public void testCall_ThrowNullPointerException() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        /* This test fails because method [com.google.javascript.rhino.IR.call] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.call(IR.java:276) */
        IR.call(node, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method call(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    @Test(expected = IllegalStateException.class)
    public void testCall1() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[9];
        Node node1 = new Node(77);
        nodeArray[0] = node1;
        
        IR.call(node, nodeArray);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method call(com.google.javascript.rhino.Node, [Lcom.google.javascript.rhino.Node;)
    
    @Test
    public void testCall2() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[9];
        Node node1 = new Node(9);
        nodeArray[0] = node1;
        
        /* This test fails because method [com.google.javascript.rhino.IR.call] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.call(IR.java:277) */
        IR.call(node, nodeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.script
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method script([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#script(com.google.javascript.rhino.Node[])}
 * @utbot.returnsFrom {@code return block;}
 *  */
    @Test
    public void testScript_ReturnBlock() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = {};
        
        Node actual = IR.script(nodeArray);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 132;
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method script([Lcom.google.javascript.rhino.Node;)
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#script(com.google.javascript.rhino.Node[])}
 * @utbot.iterates iterate the loop {@code for(Node stmt: stmts)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(mayBeStatement(stmt));
 *  */
    @Test
    public void testScript_ThrowNullPointerException_1() {
        com.google.javascript.rhino.Node[] nodeArray = {null};
        
        /* This test fails because method [com.google.javascript.rhino.IR.script] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeStatement(IR.java:474)
            com.google.javascript.rhino.IR.script(IR.java:116) */
        IR.script(nodeArray);
    }
    
    /**
    @utbot.classUnderTest {@link IR}
 * @utbot.methodUnderTest {@link com.google.javascript.rhino.IR#script(com.google.javascript.rhino.Node[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node stmt: stmts)
 *  */
    @Test
    public void testScript_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.rhino.IR.script] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.script(IR.java:115) */
        IR.script(null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method script([Lcom.google.javascript.rhino.Node;)
    
    @Test
    public void testScript1() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[9];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 118;
        nodeArray[0] = node;
        
        /* This test fails because method [com.google.javascript.rhino.IR.script] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeStatement(IR.java:474)
            com.google.javascript.rhino.IR.script(IR.java:116) */
        IR.script(nodeArray);
    }
    
    @Test
    public void testScript2() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[9];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 124;
        nodeArray[0] = node;
        
        /* This test fails because method [com.google.javascript.rhino.IR.script] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeStatement(IR.java:474)
            com.google.javascript.rhino.IR.script(IR.java:116) */
        IR.script(nodeArray);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method script([Lcom.google.javascript.rhino.Node;)
    
    @Test(expected = IllegalArgumentException.class)
    public void testScript3() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[12];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 4;
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        nodeArray[0] = node;
        Node node1 = new Node(0);
        nodeArray[1] = node1;
        nodeArray[2] = node1;
        nodeArray[3] = node1;
        nodeArray[4] = node1;
        nodeArray[5] = node1;
        nodeArray[6] = node1;
        nodeArray[7] = node1;
        nodeArray[8] = node1;
        nodeArray[9] = node1;
        nodeArray[10] = node1;
        nodeArray[11] = node1;
        
        IR.script(nodeArray);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testScript4() throws Exception  {
        com.google.javascript.rhino.Node[] nodeArray = new com.google.javascript.rhino.Node[12];
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.type = 124;
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        nodeArray[0] = node;
        Node node1 = new Node(0);
        nodeArray[1] = node1;
        nodeArray[2] = node1;
        nodeArray[3] = node1;
        nodeArray[4] = node1;
        nodeArray[5] = node1;
        nodeArray[6] = node1;
        nodeArray[7] = node1;
        nodeArray[8] = node1;
        nodeArray[9] = node1;
        nodeArray[10] = node1;
        nodeArray[11] = node1;
        
        IR.script(nodeArray);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.rhino.IR.neg
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method neg(com.google.javascript.rhino.Node)
    
    @Test
    public void testNeg1() throws Exception  {
        Node node = new Node(41);
        
        Node actual = IR.neg(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 29;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 41;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    
    @Test
    public void testNeg2() throws Exception  {
        Node node = new Node(105);
        
        Node actual = IR.neg(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.type = 29;
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.type = 105;
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.type;
        int actualType = actual.type;
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.next;
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.type;
        int actualFirstType = actualFirst.type;
        assertEquals(expectedFirstType, actualFirstType);
        
        assertTrue(deepEquals(expectedFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int expectedFirstSourcePosition = expectedFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(expectedFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node expectedFirstParent = expectedFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node expectedFirstParentLast = ((Node) getFieldValue(expectedFirstParent, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstParentLast = ((Node) getFieldValue(actualFirstParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        assertTrue(deepEquals(expectedFirstParentLast, actualFirstParentLast));
        
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        assertTrue(deepEquals(expectedFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method neg(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testNeg3() {
        Node node = new Node(110);
        
        IR.neg(node);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method neg(com.google.javascript.rhino.Node)
    
    @Test
    public void testNeg4() {
        /* This test fails because method [com.google.javascript.rhino.IR.neg] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.IR.mayBeExpression(IR.java:510)
            com.google.javascript.rhino.IR.unaryOp(IR.java:453)
            com.google.javascript.rhino.IR.neg(IR.java:356) */
        IR.neg(null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields885693145200900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields885693145200900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass885693145206400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields885693145200900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass885693145206400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields885693146384400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields885693146384400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass885693146386300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields885693146384400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass885693146386300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

