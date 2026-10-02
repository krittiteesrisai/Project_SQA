package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.lang.reflect.Method;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_PeepholeReplaceKnownMethodsTest {
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testOptimizeSubtree_ReturnSubtree() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(-255);
        
        Node actual = peepholeReplaceKnownMethods.optimizeSubtree(node);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(-255);
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)
 * @utbot.returnsFrom {@code return tryFoldKnownMethods(subtree);}
 *  */
    @Test
    public void testOptimizeSubtree_PeepholeReplaceKnownMethodsTryFoldKnownMethods() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        
        Node actual = peepholeReplaceKnownMethods.optimizeSubtree(node);
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldKnownMethods(subtree);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:382)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree(PeepholeReplaceKnownMethods.java:39) */
        peepholeReplaceKnownMethods.optimizeSubtree(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldKnownMethods(subtree);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:385)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree(PeepholeReplaceKnownMethods.java:39) */
        peepholeReplaceKnownMethods.optimizeSubtree(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldKnownMethods(subtree);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_2() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(26);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(43);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:382)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree(PeepholeReplaceKnownMethods.java:39) */
        peepholeReplaceKnownMethods.optimizeSubtree(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldKnownMethods(subtree);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_4() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(29);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(44);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:382)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree(PeepholeReplaceKnownMethods.java:39) */
        peepholeReplaceKnownMethods.optimizeSubtree(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldKnownMethods(subtree);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_3() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:385)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree(PeepholeReplaceKnownMethods.java:39) */
        peepholeReplaceKnownMethods.optimizeSubtree(functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldKnownMethods(subtree);
 *  */
    @Test
    public void testOptimizeSubtree_ThrowNullPointerException_5() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(PeepholeReplaceKnownMethods.java:86)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:58)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.optimizeSubtree(PeepholeReplaceKnownMethods.java:39) */
        peepholeReplaceKnownMethods.optimizeSubtree(node);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return tryFoldKnownMethods(subtree);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testOptimizeSubtree_ThrowUnsupportedOperationException_1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        peepholeReplaceKnownMethods.optimizeSubtree(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: return tryFoldKnownMethods(subtree);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testOptimizeSubtree_ThrowIllegalStateException() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        peepholeReplaceKnownMethods.optimizeSubtree(node);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#optimizeSubtree(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return tryFoldKnownMethods(subtree);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testOptimizeSubtree_ThrowUnsupportedOperationException() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        peepholeReplaceKnownMethods.optimizeSubtree(scriptOrFnNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldParseNumber(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): True}
 * @utbot.executesCondition {@code (!isParseInt): True}
 *  */
    @Test
    public void testTryFoldParseNumber_NotIsParseInt() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        Node actual = ((Node) tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 *  */
    @Test
    public void testTryFoldParseNumber_SecondArgEqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        Node actual = ((Node) tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 *  */
    @Test
    public void testTryFoldParseNumber_SecondArgEqualsNull_1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = "p       ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = stringNode;
        Node actual = ((Node) tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 *  */
    @Test
    public void testTryFoldParseNumber_SecondArgEqualsNull_3() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = "";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(118);
        setField(first1, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        Node actual = ((Node) tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 *  */
    @Test
    public void testTryFoldParseNumber_SecondArgEqualsNull_2() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        String string = "";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first1.setType(49);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", scriptOrFnNodeType, stringType, scriptOrFnNodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = scriptOrFnNode;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments));
        
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 *  */
    @Test
    public void testTryFoldParseNumber_SecondArgEqualsNull_4() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        String string = "  ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", scriptOrFnNodeType, stringType, scriptOrFnNodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = scriptOrFnNode;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments));
        
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldParseNumber(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test
    public void testTryFoldParseNumber_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber(PeepholeReplaceKnownMethods.java:207) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = ((Object) null);
        tryFoldParseNumberMethodArguments[1] = ((Object) null);
        tryFoldParseNumberMethodArguments[2] = ((Object) null);
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean isParseInt = functionName.equals("parseInt");
 *  */
    @Test
    public void testTryFoldParseNumber_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber(PeepholeReplaceKnownMethods.java:209) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = ((Object) null);
        tryFoldParseNumberMethodArguments[2] = ((Object) null);
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node secondArg = firstArg.getNext();
 *  */
    @Test
    public void testTryFoldParseNumber_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber(PeepholeReplaceKnownMethods.java:210) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = ((Object) null);
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 * @utbot.executesCondition {@code (isParseInt): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getNumberValue(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.lang.Double#doubleValue()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newNumber(double)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#replaceChild(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.getParent().replaceChild(n, numericNode);
 *  */
    @Test
    public void testTryFoldParseNumber_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        String string = "";
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber(PeepholeReplaceKnownMethods.java:253) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", functionNodeType, stringType, functionNodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = functionNode;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = numberNode;
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getStringValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTryFoldParseNumber_ThrowNullPointerException_4() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:787)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:774)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:770)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:140)
            com.google.javascript.jscomp.NodeUtil.getStringValue(NodeUtil.java:204)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldParseNumber(PeepholeReplaceKnownMethods.java:258) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldParseNumber(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldParseNumber_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = ((Object) null);
        tryFoldParseNumberMethodArguments[2] = ((Object) null);
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: stringVal = NodeUtil.getStringValue(firstArg);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldParseNumber_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getNumberValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: checkVal = NodeUtil.getNumberValue(firstArg);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldParseNumber_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: stringVal = NodeUtil.getStringValue(firstArg);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldParseNumber_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: stringVal = NodeUtil.getStringValue(firstArg);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldParseNumber_ThrowIllegalStateException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: stringVal = NodeUtil.getStringValue(firstArg);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldParseNumber_ThrowIllegalStateException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: stringVal = NodeUtil.getStringValue(firstArg);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldParseNumber_ThrowUnsupportedOperationException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (secondArg != null): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldParseNumber_ThrowUnsupportedOperationException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldParseNumberMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldParseNumber", nodeType, stringType, nodeType);
        tryFoldParseNumberMethod.setAccessible(true);
        java.lang.Object[] tryFoldParseNumberMethodArguments = new java.lang.Object[3];
        tryFoldParseNumberMethodArguments[0] = node;
        tryFoldParseNumberMethodArguments[1] = string;
        tryFoldParseNumberMethodArguments[2] = functionNode;
        try {
            tryFoldParseNumberMethod.invoke(peepholeReplaceKnownMethods, tryFoldParseNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldArrayJoin(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget == null): True}
 *  */
    @Test
    public void testTryFoldArrayJoin_CallTargetEqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(0);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(callTarget)): True}
 *  */
    @Test
    public void testTryFoldArrayJoin_NotNodeUtilIsGetProp() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments));
        
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
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(callTarget)): False}
 * @utbot.executesCondition {@code (right != null): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): True}
 *  */
    @Test
    public void testTryFoldArrayJoin_ArrayNodeGetTypeNotEqualsTokenARRAYLIT() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments));
        
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
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
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
        
        int nodeFirstFirstSourcePosition = nodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(callTarget)): False}
 * @utbot.executesCondition {@code (right != null): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): False}
 * @utbot.executesCondition {@code (!functionName.getString().equals("join")): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isImmutableValue(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testTryFoldArrayJoin_NotFunctionNameGetStringEquals() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", scriptOrFnNodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments));
        
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
        
        int scriptOrFnNodeFirstNextSourcePosition = scriptOrFnNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(scriptOrFnNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node scriptOrFnNodeFirstFirst = ((Node) getFieldValue(scriptOrFnNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
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
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldArrayJoin(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (callTarget == null): False}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#isGetProp(com.google.javascript.rhino.Node)} once
    /// execute conditions:
    ///     {@code (!NodeUtil.isGetProp(callTarget)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getNext()} once
    /// execute conditions:
    ///     {@code (right != null): True}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#isImmutableValue(com.google.javascript.rhino.Node)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 *  */
    @Test
    public void testTryFoldArrayJoin_NodeUtilIsImmutableValue() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments));
        
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
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String nodeFirstNextStr = ((String) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(nodeFirstNextStr, actualFirstNextStr);
        
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
        
        int nodeFirstNextSourcePosition = nodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 *  */
    @Test
    public void testTryFoldArrayJoin_NotNodeUtilIsImmutableValue() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstFunctionName = (((FunctionNode) actualFirst)).getFunctionName();
        assertNull(actualFirstFunctionName);
        
        boolean actualFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstItsNeedsActivation);
        
        int nodeFirstItsFunctionType = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstItsFunctionType = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(nodeFirstItsFunctionType, actualFirstItsFunctionType);
        
        boolean actualFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstItsIgnoreDynamicScope);
        
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
        
        int nodeFirstNextSourcePosition = nodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 *  */
    @Test
    public void testTryFoldArrayJoin_NotNodeUtilIsImmutableValue_1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(29);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstFunctionName = (((FunctionNode) actualFirst)).getFunctionName();
        assertNull(actualFirstFunctionName);
        
        boolean actualFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstItsNeedsActivation);
        
        int nodeFirstItsFunctionType = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstItsFunctionType = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(nodeFirstItsFunctionType, actualFirstItsFunctionType);
        
        boolean actualFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstItsIgnoreDynamicScope);
        
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
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node nodeFirstNextFirst = ((Node) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstNextFirstType = nodeFirstNextFirst.getType();
        int actualFirstNextFirstType = actualFirstNextFirst.getType();
        assertEquals(nodeFirstNextFirstType, actualFirstNextFirstType);
        
        assertTrue(deepEquals(nodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstFirst = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirstFirst);
        
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int nodeFirstNextFirstSourcePosition = nodeFirstNextFirst.getSourcePosition();
        int actualFirstNextFirstSourcePosition = actualFirstNextFirst.getSourcePosition();
        assertEquals(nodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 *  */
    @Test
    public void testTryFoldArrayJoin_NotNodeUtilIsImmutableValue_2() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(26);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        Node actual = ((Node) tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstFunctionName = (((FunctionNode) actualFirst)).getFunctionName();
        assertNull(actualFirstFunctionName);
        
        boolean actualFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstItsNeedsActivation);
        
        int nodeFirstItsFunctionType = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstItsFunctionType = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(nodeFirstItsFunctionType, actualFirstItsFunctionType);
        
        boolean actualFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstItsIgnoreDynamicScope);
        
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
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node nodeFirstNextFirst = ((Node) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(nodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstFirst = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirstFirst);
        
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int nodeFirstNextFirstSourcePosition = nodeFirstNextFirst.getSourcePosition();
        int actualFirstNextFirstSourcePosition = actualFirstNextFirst.getSourcePosition();
        assertEquals(nodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldArrayJoin(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node callTarget = n.getFirstChild();
 *  */
    @Test
    public void testTryFoldArrayJoin_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:368) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = ((Object) null);
        try {
            tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(callTarget)): False}
 * @utbot.executesCondition {@code (right != null): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isImmutableValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node functionName = arrayNode.getNext();
 *  */
    @Test
    public void testTryFoldArrayJoin_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(44);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:382) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        try {
            tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(callTarget)): False}
 * @utbot.executesCondition {@code (right != null): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !functionName.getString().equals("join")
 *  */
    @Test
    public void testTryFoldArrayJoin_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:385) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", functionNodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = functionNode;
        try {
            tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (callTarget == null): False}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(callTarget)): False}
 * @utbot.executesCondition {@code (right != null): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !functionName.getString().equals("join")
 *  */
    @Test
    public void testTryFoldArrayJoin_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:385) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        try {
            tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldArrayJoin(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isImmutableValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isImmutableValue(right)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldArrayJoin_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        try {
            tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right != null): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: !functionName.getString().equals("join")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldArrayJoin_ThrowUnsupportedOperationException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", scriptOrFnNodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldArrayJoin(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right != null): False}
 * @utbot.executesCondition {@code (arrayNode.getType() != Token.ARRAYLIT): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: !functionName.getString().equals("join")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldArrayJoin_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayJoinMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldArrayJoin", nodeType);
        tryFoldArrayJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayJoinMethodArguments = new java.lang.Object[1];
        tryFoldArrayJoinMethodArguments[0] = node;
        try {
            tryFoldArrayJoinMethod.invoke(peepholeReplaceKnownMethods, tryFoldArrayJoinMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToLowerCase
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringToLowerCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringToLowerCase(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String lowered = stringNode.getString().toLowerCase(ROOT_LOCALE);
 *  */
    @Test
    public void testTryFoldStringToLowerCase_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToLowerCase] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToLowerCase(PeepholeReplaceKnownMethods.java:157) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringToLowerCaseMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringToLowerCase", nodeType, nodeType);
        tryFoldStringToLowerCaseMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringToLowerCaseMethodArguments = new java.lang.Object[2];
        tryFoldStringToLowerCaseMethodArguments[0] = ((Object) null);
        tryFoldStringToLowerCaseMethodArguments[1] = ((Object) null);
        try {
            tryFoldStringToLowerCaseMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringToLowerCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringToLowerCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringToLowerCase(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String lowered = stringNode.getString().toLowerCase(ROOT_LOCALE);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringToLowerCase_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(0);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringToLowerCaseMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringToLowerCase", nodeType, nodeType);
        tryFoldStringToLowerCaseMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringToLowerCaseMethodArguments = new java.lang.Object[2];
        tryFoldStringToLowerCaseMethodArguments[0] = ((Object) null);
        tryFoldStringToLowerCaseMethodArguments[1] = node;
        try {
            tryFoldStringToLowerCaseMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringToLowerCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringToLowerCase(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String lowered = stringNode.getString().toLowerCase(ROOT_LOCALE);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringToLowerCase_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringToLowerCaseMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringToLowerCase", nodeType, nodeType);
        tryFoldStringToLowerCaseMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringToLowerCaseMethodArguments = new java.lang.Object[2];
        tryFoldStringToLowerCaseMethodArguments[0] = ((Object) null);
        tryFoldStringToLowerCaseMethodArguments[1] = node;
        try {
            tryFoldStringToLowerCaseMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringToLowerCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldStringToLowerCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldStringToLowerCase1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToLowerCase] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToLowerCase(PeepholeReplaceKnownMethods.java:157) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringToLowerCaseMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringToLowerCase", nodeType, nodeType);
        tryFoldStringToLowerCaseMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringToLowerCaseMethodArguments = new java.lang.Object[2];
        tryFoldStringToLowerCaseMethodArguments[0] = ((Object) null);
        tryFoldStringToLowerCaseMethodArguments[1] = stringNode;
        try {
            tryFoldStringToLowerCaseMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringToLowerCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToUpperCase
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringToUpperCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringToUpperCase(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String uppered = stringNode.getString().toUpperCase(ROOT_LOCALE);
 *  */
    @Test
    public void testTryFoldStringToUpperCase_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToUpperCase] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToUpperCase(PeepholeReplaceKnownMethods.java:169) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringToUpperCaseMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringToUpperCase", nodeType, nodeType);
        tryFoldStringToUpperCaseMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringToUpperCaseMethodArguments = new java.lang.Object[2];
        tryFoldStringToUpperCaseMethodArguments[0] = ((Object) null);
        tryFoldStringToUpperCaseMethodArguments[1] = ((Object) null);
        try {
            tryFoldStringToUpperCaseMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringToUpperCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringToUpperCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringToUpperCase(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String uppered = stringNode.getString().toUpperCase(ROOT_LOCALE);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringToUpperCase_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(0);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringToUpperCaseMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringToUpperCase", nodeType, nodeType);
        tryFoldStringToUpperCaseMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringToUpperCaseMethodArguments = new java.lang.Object[2];
        tryFoldStringToUpperCaseMethodArguments[0] = ((Object) null);
        tryFoldStringToUpperCaseMethodArguments[1] = node;
        try {
            tryFoldStringToUpperCaseMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringToUpperCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringToUpperCase(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String uppered = stringNode.getString().toUpperCase(ROOT_LOCALE);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringToUpperCase_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringToUpperCaseMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringToUpperCase", nodeType, nodeType);
        tryFoldStringToUpperCaseMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringToUpperCaseMethodArguments = new java.lang.Object[2];
        tryFoldStringToUpperCaseMethodArguments[0] = ((Object) null);
        tryFoldStringToUpperCaseMethodArguments[1] = node;
        try {
            tryFoldStringToUpperCaseMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringToUpperCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldStringToUpperCase(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldStringToUpperCase1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToUpperCase] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringToUpperCase(PeepholeReplaceKnownMethods.java:169) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringToUpperCaseMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringToUpperCase", nodeType, nodeType);
        tryFoldStringToUpperCaseMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringToUpperCaseMethodArguments = new java.lang.Object[2];
        tryFoldStringToUpperCaseMethodArguments[0] = ((Object) null);
        tryFoldStringToUpperCaseMethodArguments[1] = stringNode;
        try {
            tryFoldStringToUpperCaseMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringToUpperCaseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldStringSubstr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldStringSubstr_Arg1GetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = functionNode1;
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): False}
 * @utbot.executesCondition {@code ((start + length) > stringAsString.length()): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code (start < 0): True}
 *  */
    @Test
    public void testTryFoldStringSubstr_StartLessThanZero() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -1.017891231969287);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = scriptOrFnNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments));
        
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): False}
 *  */
    @Test
    public void testTryFoldStringSubstr_Arg1EqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = ((Object) null);
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldStringSubstr_Arg2GetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): False}
 * @utbot.executesCondition {@code ((start + length) > stringAsString.length()): False}
 * @utbot.executesCondition {@code (length < 0): True}
 *  */
    @Test
    public void testTryFoldStringSubstr_LengthLessThanZero() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 2.0000000004776055);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2.getNext() != null): True}
 *  */
    @Test
    public void testTryFoldStringSubstr_Arg2GetNextNotEqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) next)).setType(39);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2.getNext() != null): False}
 * @utbot.executesCondition {@code ((start + length) > stringAsString.length()): True}
 *  */
    @Test
    public void testTryFoldStringSubstr_StartPlusLengthGreaterThanStringAsStringLength() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node$NumberNode", "number", 1.0);
        (((Node) next)).setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringSubstr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(stringNode.getType() == Token.STRING);
 *  */
    @Test
    public void testTryFoldStringSubstr_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr(PeepholeReplaceKnownMethods.java:483) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = ((Object) null);
        tryFoldStringSubstrMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test
    public void testTryFoldStringSubstr_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr(PeepholeReplaceKnownMethods.java:482) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", nodeType, nodeType, nodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = ((Object) null);
        tryFoldStringSubstrMethodArguments[1] = ((Object) null);
        tryFoldStringSubstrMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: length = stringAsString.length() - start;
 *  */
    @Test
    public void testTryFoldStringSubstr_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr(PeepholeReplaceKnownMethods.java:510) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2.getNext() != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (start + length) > stringAsString.length() || (length < 0) || (start < 0)
 *  */
    @Test
    public void testTryFoldStringSubstr_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) next)).setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr(PeepholeReplaceKnownMethods.java:517) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): False}
 * @utbot.executesCondition {@code ((start + length) > stringAsString.length()): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code (start < 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, resultNode);
 *  */
    @Test
    public void testTryFoldStringSubstr_ThrowNullPointerException_4() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstr(PeepholeReplaceKnownMethods.java:527) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringSubstr(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringSubstr_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = ((Object) null);
        tryFoldStringSubstrMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(stringNode.getType() == Token.STRING);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringSubstr_ThrowIllegalArgumentException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Node node = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = node;
        tryFoldStringSubstrMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String stringAsString = stringNode.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringSubstr_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Node node = new Node(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = node;
        tryFoldStringSubstrMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: start = (int) arg1.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringSubstr_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = functionNode1;
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: length = (int) arg2.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringSubstr_ThrowIllegalStateException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = functionNode;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstr(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): False}
 * @utbot.executesCondition {@code ((start + length) > stringAsString.length()): False}
 * @utbot.executesCondition {@code (length < 0): False}
 * @utbot.executesCondition {@code (start < 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#replaceChild(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: parent.replaceChild(n, resultNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringSubstr_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 4.984512329101651);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstrMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstr", nodeType, nodeType, nodeType);
        tryFoldStringSubstrMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstrMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstrMethodArguments[0] = node;
        tryFoldStringSubstrMethodArguments[1] = stringNode;
        tryFoldStringSubstrMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstrMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldStringSubstring(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): False}
 * @utbot.executesCondition {@code (end > stringAsString.length()): False}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): False}
 *  */
    @Test
    public void testTryFoldStringSubstring_StartGreaterThanStringAsStringLength() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 1.0000060200691223);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", nodeType, nodeType, nodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = node;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        Node actual = ((Node) tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2.getNext() != null): False}
 * @utbot.executesCondition {@code (end > stringAsString.length()): False}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): True}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): False}
 *  */
    @Test
    public void testTryFoldStringSubstring_StartLessOrEqualStringAsStringLength() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 2.328306436540814E-10);
        (((Node) numberNode)).setType(39);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node$NumberNode", "number", -1.0002594012877406);
        (((Node) next)).setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", nodeType, nodeType, nodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = node;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        Node actual = ((Node) tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldStringSubstring_Arg1GetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = functionNode1;
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): False}
 *  */
    @Test
    public void testTryFoldStringSubstring_Arg1EqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = ((Object) null);
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldStringSubstring_Arg2GetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2.getNext() != null): False}
 * @utbot.executesCondition {@code (end > stringAsString.length()): True}
 *  */
    @Test
    public void testTryFoldStringSubstring_EndGreaterThanStringAsStringLength() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node$NumberNode", "number", 2.0029530823232093);
        (((Node) next)).setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = scriptOrFnNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments));
        
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2.getNext() != null): True}
 *  */
    @Test
    public void testTryFoldStringSubstring_Arg2GetNextNotEqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) next)).setType(39);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): False}
 * @utbot.executesCondition {@code (end > stringAsString.length()): False}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): True}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): True}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): True}
 *  */
    @Test
    public void testTryFoldStringSubstring_StartGreaterThanStringAsStringLength_1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -1.107296255125E9);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringSubstring(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2.getNext() != null): False}
 * @utbot.executesCondition {@code (end > stringAsString.length()): False}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): True}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): True}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): False}
 * @utbot.throwsException {@link java.lang.StringIndexOutOfBoundsException} in: String result = stringAsString.substring(start, end);
 *  */
    @Test
    public void testTryFoldStringSubstring_ThrowStringIndexOutOfBoundsException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 1.6439712649444118);
        (((Node) numberNode)).setType(39);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) next)).setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring] produces [java.lang.StringIndexOutOfBoundsException: begin 1, end 0, length 32]
            java.base/java.lang.String.checkBoundsBeginEnd(String.java:4608)
            java.base/java.lang.String.substring(String.java:2711)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring(PeepholeReplaceKnownMethods.java:576) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(stringNode.getType() == Token.STRING);
 *  */
    @Test
    public void testTryFoldStringSubstring_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring(PeepholeReplaceKnownMethods.java:537) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = ((Object) null);
        tryFoldStringSubstringMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test
    public void testTryFoldStringSubstring_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring(PeepholeReplaceKnownMethods.java:536) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", nodeType, nodeType, nodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = ((Object) null);
        tryFoldStringSubstringMethodArguments[1] = ((Object) null);
        tryFoldStringSubstringMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: end = stringAsString.length();
 *  */
    @Test
    public void testTryFoldStringSubstring_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring(PeepholeReplaceKnownMethods.java:562) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2.getNext() != null): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (end > stringAsString.length()) || (start > stringAsString.length()) || (end < 0) || (start < 0)
 *  */
    @Test
    public void testTryFoldStringSubstring_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) next)).setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring(PeepholeReplaceKnownMethods.java:569) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2.getNext() != null): False}
 * @utbot.executesCondition {@code (end > stringAsString.length()): False}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): True}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): True}
 * @utbot.executesCondition {@code ((start > stringAsString.length())): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, resultNode);
 *  */
    @Test
    public void testTryFoldStringSubstring_ThrowNullPointerException_4() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 1.0000000000241038);
        (((Node) numberNode)).setType(39);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node$NumberNode", "number", 1.0);
        (((Node) next)).setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringSubstring(PeepholeReplaceKnownMethods.java:580) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = scriptOrFnNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringSubstring(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringSubstring_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = ((Object) null);
        tryFoldStringSubstringMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(stringNode.getType() == Token.STRING);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringSubstring_ThrowIllegalArgumentException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Node node = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = node;
        tryFoldStringSubstringMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String stringAsString = stringNode.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringSubstring_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Node node = new Node(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = node;
        tryFoldStringSubstringMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: start = (int) arg1.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringSubstring_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = functionNode1;
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringSubstring(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg2 != null): True}
 * @utbot.executesCondition {@code (arg2.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: end = (int) arg2.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringSubstring_ThrowIllegalStateException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringSubstringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringSubstring", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringSubstringMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringSubstringMethodArguments = new java.lang.Object[3];
        tryFoldStringSubstringMethodArguments[0] = functionNode;
        tryFoldStringSubstringMethodArguments[1] = stringNode;
        tryFoldStringSubstringMethodArguments[2] = numberNode;
        try {
            tryFoldStringSubstringMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringSubstringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldKnownMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(-255);
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_NodeGetFirstChild() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments));
        
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
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_2() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments));
        
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
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
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
        
        int nodeFirstFirstSourcePosition = nodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldKnownMethods() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments));
        
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
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String nodeFirstNextStr = ((String) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(nodeFirstNextStr, actualFirstNextStr);
        
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
        
        int nodeFirstNextSourcePosition = nodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_3() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstFunctionName = (((FunctionNode) actualFirst)).getFunctionName();
        assertNull(actualFirstFunctionName);
        
        boolean actualFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstItsNeedsActivation);
        
        int nodeFirstItsFunctionType = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstItsFunctionType = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(nodeFirstItsFunctionType, actualFirstItsFunctionType);
        
        boolean actualFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstItsIgnoreDynamicScope);
        
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
        
        int nodeFirstNextSourcePosition = nodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return subtree;}
 *  */
    @Test
    public void testTryFoldKnownMethods_ReturnSubtree_4() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(26);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstFunctionName = (((FunctionNode) actualFirst)).getFunctionName();
        assertNull(actualFirstFunctionName);
        
        boolean actualFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstItsNeedsActivation);
        
        int nodeFirstItsFunctionType = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstItsFunctionType = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(nodeFirstItsFunctionType, actualFirstItsFunctionType);
        
        boolean actualFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstItsIgnoreDynamicScope);
        
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
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node nodeFirstNextFirst = ((Node) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstNextFirst, actualFirstNextFirst));
        assertTrue(deepEquals(nodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstFirst = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirstFirst);
        
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int nodeFirstNextFirstSourcePosition = nodeFirstNextFirst.getSourcePosition();
        int actualFirstNextFirstSourcePosition = actualFirstNextFirst.getSourcePosition();
        assertEquals(nodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldKnownMethods_2() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(29);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstFunctionName = (((FunctionNode) actualFirst)).getFunctionName();
        assertNull(actualFirstFunctionName);
        
        boolean actualFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstItsNeedsActivation);
        
        int nodeFirstItsFunctionType = ((Integer) getFieldValue(nodeFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstItsFunctionType = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(nodeFirstItsFunctionType, actualFirstItsFunctionType);
        
        boolean actualFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstItsIgnoreDynamicScope);
        
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
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node nodeFirstNextFirst = ((Node) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        String nodeFirstNextFirstStr = ((String) getFieldValue(nodeFirstNextFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstNextFirstStr = ((String) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(nodeFirstNextFirstStr, actualFirstNextFirstStr);
        
        int nodeFirstNextFirstType = nodeFirstNextFirst.getType();
        int actualFirstNextFirstType = actualFirstNextFirst.getType();
        assertEquals(nodeFirstNextFirstType, actualFirstNextFirstType);
        
        assertTrue(deepEquals(nodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstFirst = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirstFirst);
        
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int nodeFirstNextFirstSourcePosition = nodeFirstNextFirst.getSourcePosition();
        int actualFirstNextFirstSourcePosition = actualFirstNextFirst.getSourcePosition();
        assertEquals(nodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldKnownMethods_1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments));
        
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
        
        int nodeFirstNextSourcePosition = nodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldKnownMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subtree = tryFoldArrayJoin(subtree);
 *  */
    @Test
    public void testTryFoldKnownMethods_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:368)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = ((Object) null);
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subtree = tryFoldArrayJoin(subtree);
 *  */
    @Test
    public void testTryFoldKnownMethods_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:382)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subtree = tryFoldArrayJoin(subtree);
 *  */
    @Test
    public void testTryFoldKnownMethods_ThrowNullPointerException_4() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(29);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:382)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subtree = tryFoldArrayJoin(subtree);
 *  */
    @Test
    public void testTryFoldKnownMethods_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:385)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", functionNodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = functionNode;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: subtree = tryFoldArrayJoin(subtree);
 *  */
    @Test
    public void testTryFoldKnownMethods_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldArrayJoin(PeepholeReplaceKnownMethods.java:385)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownMethods(PeepholeReplaceKnownMethods.java:49) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldKnownMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: subtree = tryFoldArrayJoin(subtree);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldKnownMethods_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: subtree = tryFoldArrayJoin(subtree);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldKnownMethods_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownMethods", nodeType);
        tryFoldKnownMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldKnownStringMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ReturnSubtree() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ReturnSubtree_1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
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
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ReturnSubtree_2() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
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
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
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
        
        int nodeFirstFirstSourcePosition = nodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ReturnSubtree_3() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
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
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        Node nodeFirstFirstNext = nodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        int nodeFirstFirstNextType = nodeFirstFirstNext.getType();
        int actualFirstFirstNextType = actualFirstFirstNext.getType();
        assertEquals(nodeFirstFirstNextType, actualFirstFirstNextType);
        
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        Node actualFirstFirstNextFirst = ((Node) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstNextFirst);
        
        Node actualFirstFirstNextLast = ((Node) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstNextLast);
        
        Object actualFirstFirstNextPropListHead = getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstNextPropListHead);
        
        int nodeFirstFirstNextSourcePosition = nodeFirstFirstNext.getSourcePosition();
        int actualFirstFirstNextSourcePosition = actualFirstFirstNext.getSourcePosition();
        assertEquals(nodeFirstFirstNextSourcePosition, actualFirstFirstNextSourcePosition);
        
        JSType actualFirstFirstNextJsType = ((JSType) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstNextJsType);
        
        Node actualFirstFirstNextParent = actualFirstFirstNext.getParent();
        assertNull(actualFirstFirstNextParent);
        
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isImmutableValue(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldKnownStringMethods_NodeUtilIsImmutableValue() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
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
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
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
        
        int nodeFirstNextSourcePosition = nodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(nodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        Node nodeFirstFirstNext = nodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        String actualFirstFirstNextStr = ((String) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstFirstNextStr);
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldKnownStringMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(subtree.getType() == Token.CALL);
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(PeepholeReplaceKnownMethods.java:72) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = ((Object) null);
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node functionName = stringNode.getNext();
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(35);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(PeepholeReplaceKnownMethods.java:86) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (functionName.getType() != Token.STRING)
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(PeepholeReplaceKnownMethods.java:89) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionNameString.equals("indexOf") || functionNameString.equals("lastIndexOf")
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ThrowNullPointerException_4() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(40);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(PeepholeReplaceKnownMethods.java:103) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionNameString.equals("toLowerCase")
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(PeepholeReplaceKnownMethods.java:96) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionNameString.equals("indexOf") || functionNameString.equals("lastIndexOf")
 *  */
    @Test
    public void testTryFoldKnownStringMethods_ThrowNullPointerException_5() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(122);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(39);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first2.setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(40);
        setField(first2, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(PeepholeReplaceKnownMethods.java:103) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldKnownStringMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(subtree.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldKnownStringMethods_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownStringMethods(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isGet(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String functionNameString = functionName.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldKnownStringMethods_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldKnownStringMethods(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldKnownStringMethods1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String nodeFirstNextStr = ((String) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(nodeFirstNextStr, actualFirstNextStr);
        
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
        
        int nodeFirstNextSourcePosition = nodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    
    @Test
    public void testTryFoldKnownStringMethods2() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "t\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        assertTrue(deepEquals(nodeFirst, actualFirst));
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        String nodeFirstFirstStr = ((String) getFieldValue(nodeFirstFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstFirstStr = ((String) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(nodeFirstFirstStr, actualFirstFirstStr);
        
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        Node nodeFirstFirstNext = nodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
        Node actualFirstFirstNextFirst = ((Node) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstNextFirst);
        
        Node actualFirstFirstNextLast = ((Node) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstNextLast);
        
        Object actualFirstFirstNextPropListHead = getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstNextPropListHead);
        
        int nodeFirstFirstNextSourcePosition = nodeFirstFirstNext.getSourcePosition();
        int actualFirstFirstNextSourcePosition = actualFirstFirstNext.getSourcePosition();
        assertEquals(nodeFirstFirstNextSourcePosition, actualFirstFirstNextSourcePosition);
        
        JSType actualFirstFirstNextJsType = ((JSType) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstNextJsType);
        
        Node actualFirstFirstNextParent = actualFirstFirstNext.getParent();
        assertNull(actualFirstFirstNextParent);
        
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
    
    @Test
    public void testTryFoldKnownStringMethods3() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(40);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first2.setType(40);
        setField(first2, "com.google.javascript.rhino.Node", "next", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node nodeFirstNextFirst = ((Node) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        String nodeFirstNextFirstStr = ((String) getFieldValue(nodeFirstNextFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstNextFirstStr = ((String) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(nodeFirstNextFirstStr, actualFirstNextFirstStr);
        
        int nodeFirstNextFirstType = nodeFirstNextFirst.getType();
        int actualFirstNextFirstType = actualFirstNextFirst.getType();
        assertEquals(nodeFirstNextFirstType, actualFirstNextFirstType);
        
        assertTrue(deepEquals(nodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstFirst = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirstFirst);
        
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int nodeFirstNextFirstSourcePosition = nodeFirstNextFirst.getSourcePosition();
        int actualFirstNextFirstSourcePosition = actualFirstNextFirst.getSourcePosition();
        assertEquals(nodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        Node nodeFirstFirstNext = nodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
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
    
    @Test
    public void testTryFoldKnownStringMethods4() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "u\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", functionNodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = functionNode;
        FunctionNode actual = ((FunctionNode) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
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
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int functionNodeFirstType = functionNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(functionNodeFirstType, actualFirstType);
        
        Node functionNodeFirstNext = functionNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        String functionNodeFirstNextStr = ((String) getFieldValue(functionNodeFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstNextStr = ((String) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(functionNodeFirstNextStr, actualFirstNextStr);
        
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
        
        int functionNodeFirstNextSourcePosition = functionNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
        assertEquals(functionNodeFirstNextSourcePosition, actualFirstNextSourcePosition);
        
        JSType actualFirstNextJsType = ((JSType) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextJsType);
        
        Node actualFirstNextParent = actualFirstNext.getParent();
        assertNull(actualFirstNextParent);
        
        Node functionNodeFirstFirst = ((Node) getFieldValue(functionNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(functionNodeFirstFirst, actualFirstFirst));
        int functionNodeFirstFirstType = functionNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(functionNodeFirstFirstType, actualFirstFirstType);
        
        Node functionNodeFirstFirstNext = functionNodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        assertTrue(deepEquals(functionNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(functionNodeFirstFirstNext, actualFirstFirstNext));
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
    
    @Test
    public void testTryFoldKnownStringMethods5() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(29);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first2)).setType(40);
        setField(first2, "com.google.javascript.rhino.Node", "next", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node nodeFirstNextFirst = ((Node) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        String actualFirstNextFirstFunctionName = (((FunctionNode) actualFirstNextFirst)).getFunctionName();
        assertNull(actualFirstNextFirstFunctionName);
        
        boolean actualFirstNextFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstNextFirstItsNeedsActivation);
        
        int nodeFirstNextFirstItsFunctionType = ((Integer) getFieldValue(nodeFirstNextFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstNextFirstItsFunctionType = ((Integer) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(nodeFirstNextFirstItsFunctionType, actualFirstNextFirstItsFunctionType);
        
        boolean actualFirstNextFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstNextFirstItsIgnoreDynamicScope);
        
        int nodeFirstNextFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirstNextFirst)).getEncodedSourceStart();
        int actualFirstNextFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirstNextFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstNextFirstEncodedSourceStart, actualFirstNextFirstEncodedSourceStart);
        
        int nodeFirstNextFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirstNextFirst)).getEncodedSourceEnd();
        int actualFirstNextFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirstNextFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstNextFirstEncodedSourceEnd, actualFirstNextFirstEncodedSourceEnd);
        
        String actualFirstNextFirstSourceName = (((ScriptOrFnNode) actualFirstNextFirst)).getSourceName();
        assertNull(actualFirstNextFirstSourceName);
        
        int nodeFirstNextFirstBaseLineno = (((ScriptOrFnNode) nodeFirstNextFirst)).getBaseLineno();
        int actualFirstNextFirstBaseLineno = (((ScriptOrFnNode) actualFirstNextFirst)).getBaseLineno();
        assertEquals(nodeFirstNextFirstBaseLineno, actualFirstNextFirstBaseLineno);
        
        int nodeFirstNextFirstEndLineno = (((ScriptOrFnNode) nodeFirstNextFirst)).getEndLineno();
        int actualFirstNextFirstEndLineno = (((ScriptOrFnNode) actualFirstNextFirst)).getEndLineno();
        assertEquals(nodeFirstNextFirstEndLineno, actualFirstNextFirstEndLineno);
        
        ObjArray actualFirstNextFirstFunctions = ((ObjArray) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstNextFirstFunctions);
        
        ObjArray actualFirstNextFirstRegexps = ((ObjArray) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstNextFirstRegexps);
        
        ObjArray actualFirstNextFirstItsVariables = ((ObjArray) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstNextFirstItsVariables);
        
        ObjArray actualFirstNextFirstItsConst = ((ObjArray) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstNextFirstItsConst);
        
        ObjToIntMap actualFirstNextFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstNextFirstItsVariableNames);
        
        int nodeFirstNextFirstVarStart = ((Integer) getFieldValue(nodeFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstNextFirstVarStart = ((Integer) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstNextFirstVarStart, actualFirstNextFirstVarStart);
        
        Object actualFirstNextFirstCompilerData = (((ScriptOrFnNode) actualFirstNextFirst)).getCompilerData();
        assertNull(actualFirstNextFirstCompilerData);
        
        int nodeFirstNextFirstType = nodeFirstNextFirst.getType();
        int actualFirstNextFirstType = actualFirstNextFirst.getType();
        assertEquals(nodeFirstNextFirstType, actualFirstNextFirstType);
        
        assertTrue(deepEquals(nodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstFirst = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirstFirst);
        
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int nodeFirstNextFirstSourcePosition = nodeFirstNextFirst.getSourcePosition();
        int actualFirstNextFirstSourcePosition = actualFirstNextFirst.getSourcePosition();
        assertEquals(nodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        Node nodeFirstFirstNext = nodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
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
    
    @Test
    public void testTryFoldKnownStringMethods6() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(26);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first2)).setType(40);
        setField(first2, "com.google.javascript.rhino.Node", "next", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", nodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        int nodeFirstNextType = nodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(nodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        Node nodeFirstNextFirst = ((Node) getFieldValue(nodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        String actualFirstNextFirstFunctionName = (((FunctionNode) actualFirstNextFirst)).getFunctionName();
        assertNull(actualFirstNextFirstFunctionName);
        
        boolean actualFirstNextFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstNextFirstItsNeedsActivation);
        
        int nodeFirstNextFirstItsFunctionType = ((Integer) getFieldValue(nodeFirstNextFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstNextFirstItsFunctionType = ((Integer) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(nodeFirstNextFirstItsFunctionType, actualFirstNextFirstItsFunctionType);
        
        boolean actualFirstNextFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstNextFirstItsIgnoreDynamicScope);
        
        int nodeFirstNextFirstEncodedSourceStart = (((ScriptOrFnNode) nodeFirstNextFirst)).getEncodedSourceStart();
        int actualFirstNextFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirstNextFirst)).getEncodedSourceStart();
        assertEquals(nodeFirstNextFirstEncodedSourceStart, actualFirstNextFirstEncodedSourceStart);
        
        int nodeFirstNextFirstEncodedSourceEnd = (((ScriptOrFnNode) nodeFirstNextFirst)).getEncodedSourceEnd();
        int actualFirstNextFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirstNextFirst)).getEncodedSourceEnd();
        assertEquals(nodeFirstNextFirstEncodedSourceEnd, actualFirstNextFirstEncodedSourceEnd);
        
        String actualFirstNextFirstSourceName = (((ScriptOrFnNode) actualFirstNextFirst)).getSourceName();
        assertNull(actualFirstNextFirstSourceName);
        
        int nodeFirstNextFirstBaseLineno = (((ScriptOrFnNode) nodeFirstNextFirst)).getBaseLineno();
        int actualFirstNextFirstBaseLineno = (((ScriptOrFnNode) actualFirstNextFirst)).getBaseLineno();
        assertEquals(nodeFirstNextFirstBaseLineno, actualFirstNextFirstBaseLineno);
        
        int nodeFirstNextFirstEndLineno = (((ScriptOrFnNode) nodeFirstNextFirst)).getEndLineno();
        int actualFirstNextFirstEndLineno = (((ScriptOrFnNode) actualFirstNextFirst)).getEndLineno();
        assertEquals(nodeFirstNextFirstEndLineno, actualFirstNextFirstEndLineno);
        
        ObjArray actualFirstNextFirstFunctions = ((ObjArray) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstNextFirstFunctions);
        
        ObjArray actualFirstNextFirstRegexps = ((ObjArray) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstNextFirstRegexps);
        
        ObjArray actualFirstNextFirstItsVariables = ((ObjArray) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstNextFirstItsVariables);
        
        ObjArray actualFirstNextFirstItsConst = ((ObjArray) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstNextFirstItsConst);
        
        ObjToIntMap actualFirstNextFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstNextFirstItsVariableNames);
        
        int nodeFirstNextFirstVarStart = ((Integer) getFieldValue(nodeFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstNextFirstVarStart = ((Integer) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nodeFirstNextFirstVarStart, actualFirstNextFirstVarStart);
        
        Object actualFirstNextFirstCompilerData = (((ScriptOrFnNode) actualFirstNextFirst)).getCompilerData();
        assertNull(actualFirstNextFirstCompilerData);
        
        int nodeFirstNextFirstType = nodeFirstNextFirst.getType();
        int actualFirstNextFirstType = actualFirstNextFirst.getType();
        assertEquals(nodeFirstNextFirstType, actualFirstNextFirstType);
        
        assertTrue(deepEquals(nodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstFirst = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirstFirst);
        
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int nodeFirstNextFirstSourcePosition = nodeFirstNextFirst.getSourcePosition();
        int actualFirstNextFirstSourcePosition = actualFirstNextFirst.getSourcePosition();
        assertEquals(nodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
        
        Node nodeFirstFirst = ((Node) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(nodeFirstFirst, actualFirstFirst));
        int nodeFirstFirstType = nodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(nodeFirstFirstType, actualFirstFirstType);
        
        Node nodeFirstFirstNext = nodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        assertTrue(deepEquals(nodeFirstFirstNext, actualFirstFirstNext));
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
    
    @Test
    public void testTryFoldKnownStringMethods7() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(29);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first2)).setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(40);
        setField(first2, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", numberNodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = numberNode;
        Object actual = tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        
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
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        int numberNodeFirstNextType = numberNodeFirstNext.getType();
        int actualFirstNextType = actualFirstNext.getType();
        assertEquals(numberNodeFirstNextType, actualFirstNextType);
        
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        Node numberNodeFirstNextFirst = ((Node) getFieldValue(numberNodeFirstNext, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstNextFirst = ((Node) getFieldValue(actualFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(numberNodeFirstNextFirst, actualFirstNextFirst));
        int numberNodeFirstNextFirstType = numberNodeFirstNextFirst.getType();
        int actualFirstNextFirstType = actualFirstNextFirst.getType();
        assertEquals(numberNodeFirstNextFirstType, actualFirstNextFirstType);
        
        assertTrue(deepEquals(numberNodeFirstNextFirst, actualFirstNextFirst));
        Node actualFirstNextFirstFirst = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextFirstFirst);
        
        Node actualFirstNextFirstLast = ((Node) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextFirstLast);
        
        Object actualFirstNextFirstPropListHead = getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextFirstPropListHead);
        
        int numberNodeFirstNextFirstSourcePosition = numberNodeFirstNextFirst.getSourcePosition();
        int actualFirstNextFirstSourcePosition = actualFirstNextFirst.getSourcePosition();
        assertEquals(numberNodeFirstNextFirstSourcePosition, actualFirstNextFirstSourcePosition);
        
        JSType actualFirstNextFirstJsType = ((JSType) getFieldValue(actualFirstNextFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextFirstJsType);
        
        Node actualFirstNextFirstParent = actualFirstNextFirst.getParent();
        assertNull(actualFirstNextFirstParent);
        
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        assertTrue(deepEquals(numberNodeFirstNext, actualFirstNext));
        
        Node numberNodeFirstFirst = ((Node) getFieldValue(numberNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(numberNodeFirstFirst, actualFirstFirst));
        int numberNodeFirstFirstType = numberNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(numberNodeFirstFirstType, actualFirstFirstType);
        
        Node numberNodeFirstFirstNext = numberNodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        assertTrue(deepEquals(numberNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(numberNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(numberNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(numberNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(numberNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(numberNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(numberNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(numberNodeFirstFirstNext, actualFirstFirstNext));
        assertTrue(deepEquals(numberNodeFirstFirstNext, actualFirstFirstNext));
        
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
    
    ///region OTHER: ERROR SUITE for method tryFoldKnownStringMethods(com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldKnownStringMethods8() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(122);
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(40);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", functionNodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = functionNode;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldKnownStringMethods9() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(29);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(26);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first2)).setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(40);
        setField(first2, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:486)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:494)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:497)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods(PeepholeReplaceKnownMethods.java:102) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", numberNodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = numberNode;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldKnownStringMethods10() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(29);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(122);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first2)).setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(40);
        setField(first2, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownStringMethods] produces [java.lang.NullPointerException] */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", numberNodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = numberNode;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldKnownStringMethods(com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldKnownStringMethods11() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(38);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first2)).setType(40);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(40);
        setField(first2, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first2);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownStringMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownStringMethods", numberNodeType);
        tryFoldKnownStringMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownStringMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownStringMethodsMethodArguments[0] = numberNode;
        try {
            tryFoldKnownStringMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownStringMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldStringCharAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return n;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldStringCharAt_Arg1GetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = functionNode1;
        FunctionNode actual = ((FunctionNode) tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): False}
 *  */
    @Test
    public void testTryFoldStringCharAt_Arg1EqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = ((Object) null);
        FunctionNode actual = ((FunctionNode) tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 *  */
    @Test
    public void testTryFoldStringCharAt_Arg1GetNextNotEqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(39);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode1, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = functionNode1;
        FunctionNode actual = ((FunctionNode) tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldStringCharAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (arg1 != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// execute conditions:
    ///     {@code (arg1.getType() == Token.NUMBER): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getNext()} once
    /// execute conditions:
    ///     {@code (arg1.getNext() == null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getDouble()} once
    /// return from: {@code return n;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (stringAsString.length() <= index): True}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testTryFoldStringCharAt_StringAsStringLengthLessOrEqualIndex() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 5.125332723678134E-144);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = scriptOrFnNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments));
        
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (index < 0): True}
 *  */
    @Test
    public void testTryFoldStringCharAt_IndexLessThanZero() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -1.000000007741761);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringCharAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(stringNode.getType() == Token.STRING);
 *  */
    @Test
    public void testTryFoldStringCharAt_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt(PeepholeReplaceKnownMethods.java:590) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = ((Object) null);
        tryFoldStringCharAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test
    public void testTryFoldStringCharAt_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt(PeepholeReplaceKnownMethods.java:589) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", nodeType, nodeType, nodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = ((Object) null);
        tryFoldStringCharAtMethodArguments[1] = ((Object) null);
        tryFoldStringCharAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < 0 || stringAsString.length() <= index
 *  */
    @Test
    public void testTryFoldStringCharAt_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -2.3283064365429315E-10);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt(PeepholeReplaceKnownMethods.java:602) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (stringAsString.length() <= index): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, resultNode);
 *  */
    @Test
    public void testTryFoldStringCharAt_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 1.0044791549444207);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt(PeepholeReplaceKnownMethods.java:611) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", nodeType, nodeType, nodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = node;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringCharAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringCharAt_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = ((Object) null);
        tryFoldStringCharAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(stringNode.getType() == Token.STRING);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringCharAt_ThrowIllegalArgumentException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Node node = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = node;
        tryFoldStringCharAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String stringAsString = stringNode.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringCharAt_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Node node = new Node(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = node;
        tryFoldStringCharAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: index = (int) arg1.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringCharAt_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = functionNode1;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldStringCharAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldStringCharAt1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:652)
            com.google.javascript.rhino.Node.replaceChild(Node.java:810)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt(PeepholeReplaceKnownMethods.java:611) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldStringCharAt2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 16.28530896108723);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:652)
            com.google.javascript.rhino.Node.replaceChild(Node.java:810)
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharAt(PeepholeReplaceKnownMethods.java:611) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", nodeType, nodeType, nodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = node;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringCharAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringCharAt3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringCharAt4() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 1.1641532182693481E-10);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryFoldStringCharAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryFoldStringCharAt5() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(stringNode1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode1)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 1.0000686645523356);
        (((Node) numberNode)).setType(39);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", stringNodeType, stringNodeType, stringNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = stringNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode1;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testTryFoldStringCharAt6() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 2.0000000009313332);
        (((Node) numberNode)).setType(39);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", nodeType, nodeType, nodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = node;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testTryFoldStringCharAt7() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 4.760397388626478E-60);
        (((Node) numberNode)).setType(39);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharAtMethodArguments[0] = functionNode;
        tryFoldStringCharAtMethodArguments[1] = stringNode;
        tryFoldStringCharAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.normalizeNumericString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeNumericString(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#normalizeNumericString(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (input.length() == 0): False}
 * @utbot.executesCondition {@code (startIndex >= endIndex): False}
 * @utbot.invokes {@link java.lang.String#substring(int,int)}
 * @utbot.iterates iterate the loop {@code while(startIndex < input.length() && input.charAt(startIndex) == '0')} twice
 * @utbot.returnsFrom {@code return input.substring(startIndex, endIndex + 1);}
 *  */
    @Test
    public void testNormalizeNumericString_StartIndexLessThanEndIndex() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        String string = " @";
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeNumericStringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("normalizeNumericString", stringType);
        normalizeNumericStringMethod.setAccessible(true);
        java.lang.Object[] normalizeNumericStringMethodArguments = new java.lang.Object[1];
        normalizeNumericStringMethodArguments[0] = string;
        String actual = ((String) normalizeNumericStringMethod.invoke(peepholeReplaceKnownMethods, normalizeNumericStringMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#normalizeNumericString(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (input.length() == 0): False}
 * @utbot.executesCondition {@code (startIndex >= endIndex): True}
 * @utbot.iterates iterate the loop {@code while(startIndex < input.length() && input.charAt(startIndex) == '0')} 3 times
 *  */
    @Test
    public void testNormalizeNumericString_StartIndexGreaterOrEqualEndIndex() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        String string = " 0";
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeNumericStringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("normalizeNumericString", stringType);
        normalizeNumericStringMethod.setAccessible(true);
        java.lang.Object[] normalizeNumericStringMethodArguments = new java.lang.Object[1];
        normalizeNumericStringMethodArguments[0] = string;
        String actual = ((String) normalizeNumericStringMethod.invoke(peepholeReplaceKnownMethods, normalizeNumericStringMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#normalizeNumericString(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): True}
 *  */
    @Test
    public void testNormalizeNumericString_InputEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeNumericStringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("normalizeNumericString", stringType);
        normalizeNumericStringMethod.setAccessible(true);
        java.lang.Object[] normalizeNumericStringMethodArguments = new java.lang.Object[1];
        normalizeNumericStringMethodArguments[0] = ((Object) null);
        String actual = ((String) normalizeNumericStringMethod.invoke(peepholeReplaceKnownMethods, normalizeNumericStringMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#normalizeNumericString(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (input.length() == 0): True}
 *  */
    @Test
    public void testNormalizeNumericString_InputLengthEqualsZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        String string = "";
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeNumericStringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("normalizeNumericString", stringType);
        normalizeNumericStringMethod.setAccessible(true);
        java.lang.Object[] normalizeNumericStringMethodArguments = new java.lang.Object[1];
        normalizeNumericStringMethodArguments[0] = string;
        String actual = ((String) normalizeNumericStringMethod.invoke(peepholeReplaceKnownMethods, normalizeNumericStringMethodArguments));
        
        assertEquals(string, actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#normalizeNumericString(java.lang.String)}
 * @utbot.executesCondition {@code (input == null): False}
 * @utbot.executesCondition {@code (input.length() == 0): False}
 * @utbot.executesCondition {@code (startIndex >= endIndex): True}
 * @utbot.iterates iterate the loop {@code while(startIndex < input.length() && input.charAt(startIndex) == '0')} once
 * @utbot.iterates iterate the loop {@code while(endIndex >= 0 && input.charAt(endIndex) == '0')} once
 *  */
    @Test
    public void testNormalizeNumericString_StartIndexGreaterOrEqualInputLengthAndInputCharAtNotEquals0() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        String string = "0";
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class stringType = Class.forName("java.lang.String");
        Method normalizeNumericStringMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("normalizeNumericString", stringType);
        normalizeNumericStringMethod.setAccessible(true);
        java.lang.Object[] normalizeNumericStringMethodArguments = new java.lang.Object[1];
        normalizeNumericStringMethodArguments[0] = string;
        String actual = ((String) normalizeNumericStringMethod.invoke(peepholeReplaceKnownMethods, normalizeNumericStringMethodArguments));
        
        assertEquals(string, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldStringIndexOf(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldStringIndexOf_ReturnN() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node1 = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node1;
        Node actual = ((Node) tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isIndexOf): False}
 * @utbot.executesCondition {@code (secondArg != null): True}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 *  */
    @Test
    public void testTryFoldStringIndexOf_SecondArgNotEqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(44);
        FunctionNode next = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(node1, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node1;
        Node actual = ((Node) tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldStringIndexOf_ReturnN_1() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        String string = "";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", functionNodeType, stringType, functionNodeType, functionNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = functionNode;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node;
        FunctionNode actual = ((FunctionNode) tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringIndexOf(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:333) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[1] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[2] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[3] = ((Object) null);
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(lstringNode.getType() == Token.STRING);
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:334) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[2] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[3] = ((Object) null);
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isIndexOf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lstring.length()
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_6() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node = new Node(44);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:344) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", scriptOrFnNodeType, stringType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = scriptOrFnNode;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isIndexOf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lstring.length()
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_7() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node = new Node(43);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:344) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", scriptOrFnNodeType, stringType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = scriptOrFnNode;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isIndexOf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lstring.length()
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_10() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node = new Node(41);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:344) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", scriptOrFnNodeType, stringType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = scriptOrFnNode;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean isIndexOf = functionName.equals("indexOf");
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:337) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = ((Object) null);
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node secondArg = firstArg.getNext();
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:338) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = ((Object) null);
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isIndexOf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lstring.length()
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_4() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node1 = new Node(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:344) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node1;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isIndexOf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lstring.length()
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_5() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node1 = new Node(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:344) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node1;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isIndexOf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lstring.length()
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_8() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node1 = new Node(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:344) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node1;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isIndexOf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lstring.length()
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_11() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        String string = "@";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -9.223372036854776E18);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:344) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", functionNodeType, stringType, functionNodeType, functionNodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = functionNode;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = numberNode;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isIndexOf): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: lstring.length()
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_9() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(41);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringIndexOf(PeepholeReplaceKnownMethods.java:344) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node1;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringIndexOf(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringIndexOf_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[2] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[3] = ((Object) null);
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(lstringNode.getType() == Token.STRING);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringIndexOf_ThrowIllegalArgumentException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        Node node1 = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[2] = node1;
        tryFoldStringIndexOfMethodArguments[3] = ((Object) null);
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String lstring = NodeUtil.getStringValue(lstringNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringIndexOf_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        Node node1 = new Node(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[2] = node1;
        tryFoldStringIndexOfMethodArguments[3] = ((Object) null);
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String searchValue = NodeUtil.getStringValue(firstArg);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringIndexOf_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node1 = new Node(38);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node1;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String searchValue = NodeUtil.getStringValue(firstArg);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringIndexOf_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node1 = new Node(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node1;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringIndexOf(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String searchValue = NodeUtil.getStringValue(firstArg);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringIndexOf_ThrowIllegalStateException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        String string = " ";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method tryFoldStringIndexOfMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeType, stringType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[4];
        tryFoldStringIndexOfMethodArguments[0] = node;
        tryFoldStringIndexOfMethodArguments[1] = string;
        tryFoldStringIndexOfMethodArguments[2] = stringNode;
        tryFoldStringIndexOfMethodArguments[3] = node1;
        try {
            tryFoldStringIndexOfMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringIndexOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownNumericMethods
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): False}
 *  */
    @Test
    public void testTryFoldKnownNumericMethods_NotIsASTNormalized() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.RAW;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Node node = new Node(37);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments));
        
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
        
        int expectedSourcePosition = expected.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(callTarget)): True}
 *  */
    @Test
    public void testTryFoldKnownNumericMethods_NotNodeUtilIsName() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED_OBFUSCATED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments));
        
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
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(callTarget)): False}
 * @utbot.executesCondition {@code (firstArgument != null): False}
 *  */
    @Test
    public void testTryFoldKnownNumericMethods_FirstArgumentEqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
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
        
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(callTarget)): False}
 * @utbot.executesCondition {@code (firstArgument != null): True}
 * @utbot.executesCondition {@code ((firstArgument.getType() == Token.STRING || firstArgument.getType() == Token.NUMBER)): True}
 * @utbot.executesCondition {@code (firstArgument.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (functionNameString.equals("parseInt") || functionNameString.equals("parseFloat")): True}
 * @utbot.executesCondition {@code (functionNameString.equals("parseFloat")): True}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldParseNumber(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node)
 *  */
    @Test
    public void testTryFoldKnownNumericMethods_FunctionNameStringEquals() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        Node actual = ((Node) tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments));
        
        int nodeType1 = node.getType();
        int actualType = actual.getType();
        assertEquals(nodeType1, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nodeFirst = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        String nodeFirstStr = ((String) getFieldValue(nodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(nodeFirstStr, actualFirstStr);
        
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
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
        
        int nodeFirstNextSourcePosition = nodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(callTarget)): False}
 * @utbot.executesCondition {@code (firstArgument != null): True}
 * @utbot.executesCondition {@code ((firstArgument.getType() == Token.STRING || firstArgument.getType() == Token.NUMBER)): True}
 * @utbot.executesCondition {@code (firstArgument.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldKnownNumericMethods_FirstArgumentGetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", scriptOrFnNodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments));
        
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
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualFirstStr);
        
        int scriptOrFnNodeFirstType = scriptOrFnNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(scriptOrFnNodeFirstType, actualFirstType);
        
        Node scriptOrFnNodeFirstNext = scriptOrFnNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
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
        
        int scriptOrFnNodeFirstNextSourcePosition = scriptOrFnNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(callTarget)): False}
 * @utbot.executesCondition {@code (firstArgument != null): True}
 * @utbot.executesCondition {@code ((firstArgument.getType() == Token.STRING || firstArgument.getType() == Token.NUMBER)): False}
 * @utbot.executesCondition {@code (functionNameString.equals("parseInt") || functionNameString.equals("parseFloat")): True}
 * @utbot.executesCondition {@code (functionNameString.equals("parseFloat")): False}
 *  */
    @Test
    public void testTryFoldKnownNumericMethods_NotFunctionNameStringEquals() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", scriptOrFnNodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments));
        
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
        String scriptOrFnNodeFirstStr = ((String) getFieldValue(scriptOrFnNodeFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        String actualFirstStr = ((String) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertEquals(scriptOrFnNodeFirstStr, actualFirstStr);
        
        int scriptOrFnNodeFirstType = scriptOrFnNodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(scriptOrFnNodeFirstType, actualFirstType);
        
        Node scriptOrFnNodeFirstNext = scriptOrFnNodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
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
        
        int scriptOrFnNodeFirstNextSourcePosition = scriptOrFnNodeFirstNext.getSourcePosition();
        int actualFirstNextSourcePosition = actualFirstNext.getSourcePosition();
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(subtree.getType() == Token.CALL);
 *  */
    @Test
    public void testTryFoldKnownNumericMethods_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownNumericMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownNumericMethods(PeepholeReplaceKnownMethods.java:126) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = ((Object) null);
        try {
            tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(subtree.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(callTarget)): False}
 * @utbot.executesCondition {@code (firstArgument != null): True}
 * @utbot.executesCondition {@code ((firstArgument.getType() == Token.STRING || firstArgument.getType() == Token.NUMBER)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionNameString.equals("parseInt") || functionNameString.equals("parseFloat")
 *  */
    @Test
    public void testTryFoldKnownNumericMethods_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownNumericMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownNumericMethods(PeepholeReplaceKnownMethods.java:142) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(subtree.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(callTarget)): False}
 * @utbot.executesCondition {@code (firstArgument != null): True}
 * @utbot.executesCondition {@code ((firstArgument.getType() == Token.STRING || firstArgument.getType() == Token.NUMBER)): True}
 * @utbot.executesCondition {@code (firstArgument.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionNameString.equals("parseInt") || functionNameString.equals("parseFloat")
 *  */
    @Test
    public void testTryFoldKnownNumericMethods_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownNumericMethods] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldKnownNumericMethods(PeepholeReplaceKnownMethods.java:142) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(subtree.getType() == Token.CALL);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(subtree.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldKnownNumericMethods_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(subtree.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (isASTNormalized()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(callTarget)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String functionNameString = callTarget.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldKnownNumericMethods_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        AbstractCompiler.LifeCycleStage stage = AbstractCompiler.LifeCycleStage.NORMALIZED;
        setField(compiler, "com.google.javascript.jscomp.AbstractCompiler", "stage", stage);
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(subtree.getType() == Token.CALL);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isASTNormalized()
 *  */
    @Test(expected = NullPointerException.class)
    public void testTryFoldKnownNumericMethods_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = new Node(37);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldKnownNumericMethods(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(subtree.getType() == Token.CALL);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isASTNormalized()
 *  */
    @Test(expected = NullPointerException.class)
    public void testTryFoldKnownNumericMethods_ThrowNullPointerException_4() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = ((PeepholeReplaceKnownMethods) createInstance("com.google.javascript.jscomp.PeepholeReplaceKnownMethods"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeReplaceKnownMethods, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Node node = new Node(37);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldKnownNumericMethodsMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldKnownNumericMethods", nodeType);
        tryFoldKnownNumericMethodsMethod.setAccessible(true);
        java.lang.Object[] tryFoldKnownNumericMethodsMethodArguments = new java.lang.Object[1];
        tryFoldKnownNumericMethodsMethodArguments[0] = node;
        try {
            tryFoldKnownNumericMethodsMethod.invoke(peepholeReplaceKnownMethods, tryFoldKnownNumericMethodsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldStringCharCodeAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return n;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldStringCharCodeAt_Arg1GetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = functionNode1;
        FunctionNode actual = ((FunctionNode) tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): False}
 *  */
    @Test
    public void testTryFoldStringCharCodeAt_Arg1EqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = ((Object) null);
        FunctionNode actual = ((FunctionNode) tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 *  */
    @Test
    public void testTryFoldStringCharCodeAt_Arg1GetNextNotEqualsNull() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(39);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode1, "com.google.javascript.rhino.Node", "next", next);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = functionNode1;
        FunctionNode actual = ((FunctionNode) tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldStringCharCodeAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (arg1 != null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// execute conditions:
    ///     {@code (arg1.getType() == Token.NUMBER): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getNext()} once
    /// execute conditions:
    ///     {@code (arg1.getNext() == null): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getDouble()} once
    /// return from: {@code return n;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (stringAsString.length() <= index): True}
 * @utbot.invokes {@link java.lang.String#length()}
 *  */
    @Test
    public void testTryFoldStringCharCodeAt_StringAsStringLengthLessOrEqualIndex() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 5.125332723678134E-144);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = scriptOrFnNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = numberNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments));
        
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (index < 0): True}
 *  */
    @Test
    public void testTryFoldStringCharCodeAt_IndexLessThanZero() throws Exception  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -1.000000007741761);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments));
        
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
        
        int functionNodeSourcePosition = functionNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(functionNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringCharCodeAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(stringNode.getType() == Token.STRING);
 *  */
    @Test
    public void testTryFoldStringCharCodeAt_ThrowNullPointerException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt(PeepholeReplaceKnownMethods.java:621) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = ((Object) null);
        tryFoldStringCharCodeAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test
    public void testTryFoldStringCharCodeAt_ThrowNullPointerException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt(PeepholeReplaceKnownMethods.java:620) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", nodeType, nodeType, nodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = ((Object) null);
        tryFoldStringCharCodeAtMethodArguments[1] = ((Object) null);
        tryFoldStringCharCodeAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: index < 0 || stringAsString.length() <= index
 *  */
    @Test
    public void testTryFoldStringCharCodeAt_ThrowNullPointerException_2() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -2.3283064365429315E-10);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt(PeepholeReplaceKnownMethods.java:633) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (stringAsString.length() <= index): False}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link java.lang.String#charAt(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newNumber(double)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, resultNode);
 *  */
    @Test
    public void testTryFoldStringCharCodeAt_ThrowNullPointerException_3() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.5225220024922252);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeReplaceKnownMethods.tryFoldStringCharCodeAt(PeepholeReplaceKnownMethods.java:641) */
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", nodeType, nodeType, nodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = node;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringCharCodeAt(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.CALL);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringCharCodeAt_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = ((Object) null);
        tryFoldStringCharCodeAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(stringNode.getType() == Token.STRING);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldStringCharCodeAt_ThrowIllegalArgumentException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Node node = new Node(-255);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = node;
        tryFoldStringCharCodeAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String stringAsString = stringNode.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringCharCodeAt_ThrowIllegalStateException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Node node = new Node(40);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = node;
        tryFoldStringCharCodeAtMethodArguments[2] = ((Object) null);
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: index = (int) arg1.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringCharCodeAt_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = functionNode1;
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (stringAsString.length() <= index): False}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: parent.replaceChild(n, resultNode);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringCharCodeAt_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", nodeType, nodeType, nodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = node;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (stringAsString.length() <= index): False}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: parent.replaceChild(n, resultNode);
 *  */
    @Test(expected = RuntimeException.class)
    public void testTryFoldStringCharCodeAt_ThrowRuntimeException() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 2.2250738673309455E-308);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = scriptOrFnNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (stringAsString.length() <= index): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reportCodeChange();
 *  */
    @Test(expected = NullPointerException.class)
    public void testTryFoldStringCharCodeAt_ThrowNullPointerException_5() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", functionNode);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 1.5536508585565225E-298);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeReplaceKnownMethods}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeReplaceKnownMethods#tryFoldStringCharCodeAt(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.CALL);): True}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(stringNode.getType() == Token.STRING);): True}
 * @utbot.executesCondition {@code (arg1 != null): True}
 * @utbot.executesCondition {@code (arg1.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (arg1.getNext() == null): True}
 * @utbot.executesCondition {@code (index < 0): False}
 * @utbot.executesCondition {@code (stringAsString.length() <= index): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: reportCodeChange();
 *  */
    @Test(expected = NullPointerException.class)
    public void testTryFoldStringCharCodeAt_ThrowNullPointerException_4() throws Throwable  {
        PeepholeReplaceKnownMethods peepholeReplaceKnownMethods = new PeepholeReplaceKnownMethods();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        
        Class peepholeReplaceKnownMethodsClazz = Class.forName("com.google.javascript.jscomp.PeepholeReplaceKnownMethods");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringCharCodeAtMethod = peepholeReplaceKnownMethodsClazz.getDeclaredMethod("tryFoldStringCharCodeAt", functionNodeType, functionNodeType, functionNodeType);
        tryFoldStringCharCodeAtMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringCharCodeAtMethodArguments = new java.lang.Object[3];
        tryFoldStringCharCodeAtMethodArguments[0] = functionNode;
        tryFoldStringCharCodeAtMethodArguments[1] = stringNode;
        tryFoldStringCharCodeAtMethodArguments[2] = numberNode;
        try {
            tryFoldStringCharCodeAtMethod.invoke(peepholeReplaceKnownMethods, tryFoldStringCharCodeAtMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields891507353028400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields891507353028400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass891507353033800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields891507353028400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass891507353033800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields891507353372400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields891507353372400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass891507353373700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields891507353372400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass891507353373700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

