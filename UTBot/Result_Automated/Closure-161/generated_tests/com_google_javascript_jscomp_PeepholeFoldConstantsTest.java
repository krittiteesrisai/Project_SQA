package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
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
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_PeepholeFoldConstantsTest {
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd
    
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
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAdd(PeepholeFoldConstants.java:786) */
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
 * @utbot.executesCondition {@code (Preconditions.checkArgument(node.getType() == Token.ADD);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = scriptOrFnNode;
        tryFoldShiftMethodArguments[2] = functionNode;
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = scriptOrFnNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldShift_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:812) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = scriptOrFnNode;
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
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldShift(PeepholeFoldConstants.java:811) */
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[3];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", nodeType, nodeType, nodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = node;
        tryFoldAndOrMethodArguments[1] = node;
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
        
        int nodeSourcePosition = node.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(nodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:516) */
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
 * @utbot.executesCondition {@code (type == Token.AND): True}
 * @utbot.executesCondition {@code (result != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getImpureBooleanValue(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.TernaryValue#toBoolean(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, result);
 *  */
    @Test
    public void testTryFoldAndOr_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAndOr(PeepholeFoldConstants.java:546) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAndOr", nodeType, nodeType, nodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[3];
        tryFoldAndOrMethodArguments[0] = node;
        tryFoldAndOrMethodArguments[1] = first;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(23);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = scriptOrFnNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments));
        
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
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldLeftChildOp_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(23);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = scriptOrFnNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments));
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldLeftChildOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: rightValObj != null && left.getType() == opType
 *  */
    @Test
    public void testTryFoldLeftChildOp_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(23);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:757) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = scriptOrFnNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: rightValObj != null && left.getType() == opType
 *  */
    @Test
    public void testTryFoldLeftChildOp_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(23);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:757) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = scriptOrFnNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int opType = n.getType();
 *  */
    @Test
    public void testTryFoldLeftChildOp_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:746) */
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldLeftChildOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Double rightValObj = NodeUtil.getNumberValue(right);
 *  */
    @Test
    public void testTryFoldLeftChildOp_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(23);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:279)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:756) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = scriptOrFnNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState((NodeUtil.isAssociative(opType) && NodeUtil.isCommutative(opType)) || n.getType() == Token.ADD);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldLeftChildOp_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState((NodeUtil.isAssociative(opType) && NodeUtil.isCommutative(opType)) || n.getType() == Token.ADD);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldLeftChildOp_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(101);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(23);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        Object actual = tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        
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
    public void testTryFoldLeftChildOp2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(23);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        Object actual = tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        
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
    public void testTryFoldLeftChildOp3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(23);
        Node node1 = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(43);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", nodeType, nodeType, nodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = node;
        tryFoldLeftChildOpMethodArguments[1] = node1;
        tryFoldLeftChildOpMethodArguments[2] = numberNode;
        Node actual = ((Node) tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(23);
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
    
    @Test
    public void testTryFoldLeftChildOp4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(9);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(29);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        Object actual = tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        
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
    public void testTryFoldLeftChildOp5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(23);
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(44);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", functionNodeType, functionNodeType, functionNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = functionNode;
        tryFoldLeftChildOpMethodArguments[1] = node;
        tryFoldLeftChildOpMethodArguments[2] = numberNode;
        FunctionNode actual = ((FunctionNode) tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments));
        
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
    
    @Test
    public void testTryFoldLeftChildOp6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(11);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(43);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", functionNodeType, functionNodeType, functionNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = functionNode;
        tryFoldLeftChildOpMethodArguments[1] = node;
        tryFoldLeftChildOpMethodArguments[2] = stringNode;
        FunctionNode actual = ((FunctionNode) tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments));
        
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
    
    @Test
    public void testTryFoldLeftChildOp7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(11);
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(44);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", functionNodeType, functionNodeType, functionNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = functionNode;
        tryFoldLeftChildOpMethodArguments[1] = node;
        tryFoldLeftChildOpMethodArguments[2] = stringNode;
        FunctionNode actual = ((FunctionNode) tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments));
        
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
    
    ///region OTHER: ERROR SUITE for method tryFoldLeftChildOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldLeftChildOp8() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(9);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:757) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(23);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:757) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = numberNode1;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(23);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:757) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(63);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:757) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(64);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:757) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(21);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.valueCheck(NodeUtil.java:1189)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1339)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1334)
            com.google.javascript.jscomp.NodeUtil.isNumericResultHelper(NodeUtil.java:1225)
            com.google.javascript.jscomp.NodeUtil$NumbericResultPredicate.apply(NodeUtil.java:1208)
            com.google.javascript.jscomp.NodeUtil$NumbericResultPredicate.apply(NodeUtil.java:1205)
            com.google.javascript.jscomp.NodeUtil.valueCheck(NodeUtil.java:1201)
            com.google.javascript.jscomp.NodeUtil.isNumericResult(NodeUtil.java:1219)
            com.google.javascript.jscomp.NodeUtil.mayBeStringHelper(NodeUtil.java:1346)
            com.google.javascript.jscomp.NodeUtil$MayBeStringResultPredicate.apply(NodeUtil.java:1323)
            com.google.javascript.jscomp.NodeUtil$MayBeStringResultPredicate.apply(NodeUtil.java:1320)
            com.google.javascript.jscomp.NodeUtil.valueCheck(NodeUtil.java:1201)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1339)
            com.google.javascript.jscomp.NodeUtil.mayBeString(NodeUtil.java:1334)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:752) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = ((Object) null);
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(23);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:757) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = stringNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(26);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:123)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:131)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:307)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:756) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldLeftChildOp16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(122);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:138)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:307)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldLeftChildOp(PeepholeFoldConstants.java:756) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(10);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldLeftChildOp18() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(10);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldLeftChildOp19() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(10);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldLeftChildOp20() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(39);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldLeftChildOp21() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldLeftChildOp22() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(11);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldLeftChildOp23() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(23);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(29);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldLeftChildOp", numberNodeType, numberNodeType, numberNodeType);
        tryFoldLeftChildOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildOpMethodArguments = new java.lang.Object[3];
        tryFoldLeftChildOpMethodArguments[0] = numberNode;
        tryFoldLeftChildOpMethodArguments[1] = ((Object) null);
        tryFoldLeftChildOpMethodArguments[2] = functionNode;
        try {
            tryFoldLeftChildOpMethod.invoke(peepholeFoldConstants, tryFoldLeftChildOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldAssign_ReturnN() throws Exception  {
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 *  */
    @Test
    public void testTryFoldAssign_NodeGetLastChild() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode1, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode1, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", functionNodeType, functionNodeType, functionNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = functionNode;
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = functionNode1;
        FunctionNode actual = ((FunctionNode) tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments));
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !right.hasChildren() || right.getFirstChild().getNext() != right.getLastChild()
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:444) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.ASSIGN);
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:441) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAssign(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldAssign1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = scriptOrFnNode;
        tryFoldAssignMethodArguments[2] = functionNode;
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
    
    @Test
    public void testTryFoldAssign2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(42);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first1);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = scriptOrFnNode;
        tryFoldAssignMethodArguments[2] = scriptOrFnNode1;
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
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldAssign3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node node = new Node(35);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.areNodesEqualForInlining(AbstractPeepholeOptimization.java:75)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:455) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = functionNode;
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAssign4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node node = new Node(94);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isName(NodeUtil.java:1475)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:822)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:450) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = functionNode;
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAssign5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node node = new Node(30);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:898)
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:883)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:798)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:450) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = functionNode;
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAssign6() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node node = new Node(37);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(NodeUtil.java:949)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:808)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:450) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = functionNode;
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAssign7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node node = new Node(125);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.areNodesEqualForInlining(AbstractPeepholeOptimization.java:75)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:455) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = functionNode;
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAssign8() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.areNodesEqualForInlining(AbstractPeepholeOptimization.java:75)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAssign(PeepholeFoldConstants.java:455) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = functionNode;
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAssign(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAssign9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Node node = new Node(105);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAssign", numberNodeType, numberNodeType, numberNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[3];
        tryFoldAssignMethodArguments[0] = numberNode;
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = functionNode;
        try {
            tryFoldAssignMethod.invoke(peepholeFoldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldTypeof_ReturnOriginalTypeofNode() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(32);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", scriptOrFnNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments));
        
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
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 *  */
    @Test
    public void testTryFoldTypeof_NodeUtilIsLiteralValue() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(105);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", scriptOrFnNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments));
        
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
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int scriptOrFnNodeFirstSourcePosition = scriptOrFnNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(scriptOrFnNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node scriptOrFnNodeFirstParent = scriptOrFnNodeFirst.getParent();
        Node actualFirstParent = actualFirst.getParent();
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        int scriptOrFnNodeFirstParentType = scriptOrFnNodeFirstParent.getType();
        int actualFirstParentType = actualFirstParent.getType();
        assertEquals(scriptOrFnNodeFirstParentType, actualFirstParentType);
        
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        assertTrue(deepEquals(scriptOrFnNodeFirstParent, actualFirstParent));
        Node actualFirstParentParent = actualFirstParent.getParent();
        assertNull(actualFirstParentParent);
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldTypeof(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldTypeof_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", scriptOrFnNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(originalTypeofNode.getType() == Token.TYPEOF);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:264) */
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
 * @utbot.executesCondition {@code (typeNameString != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#replaceChild(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(argumentNode.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: originalTypeofNode.getParent().replaceChild(originalTypeofNode, newNode);
 *  */
    @Test
    public void testTryFoldTypeof_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(32);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:306) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", scriptOrFnNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldTypeof1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
    
    @Test
    public void testTryFoldTypeof2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    @Test
    public void testTryFoldTypeof3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    @Test
    public void testTryFoldTypeof4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(43);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    @Test
    public void testTryFoldTypeof5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    @Test
    public void testTryFoldTypeof6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    @Test
    public void testTryFoldTypeof7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        String actualFirstFirstFunctionName = (((FunctionNode) actualFirstFirst)).getFunctionName();
        assertNull(actualFirstFirstFunctionName);
        
        boolean actualFirstFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstFirstItsNeedsActivation);
        
        int stringNodeFirstFirstItsFunctionType = ((Integer) getFieldValue(stringNodeFirstFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstFirstItsFunctionType = ((Integer) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(stringNodeFirstFirstItsFunctionType, actualFirstFirstItsFunctionType);
        
        boolean actualFirstFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstFirstItsIgnoreDynamicScope);
        
        int stringNodeFirstFirstEncodedSourceStart = (((ScriptOrFnNode) stringNodeFirstFirst)).getEncodedSourceStart();
        int actualFirstFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirstFirst)).getEncodedSourceStart();
        assertEquals(stringNodeFirstFirstEncodedSourceStart, actualFirstFirstEncodedSourceStart);
        
        int stringNodeFirstFirstEncodedSourceEnd = (((ScriptOrFnNode) stringNodeFirstFirst)).getEncodedSourceEnd();
        int actualFirstFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirstFirst)).getEncodedSourceEnd();
        assertEquals(stringNodeFirstFirstEncodedSourceEnd, actualFirstFirstEncodedSourceEnd);
        
        String actualFirstFirstSourceName = (((ScriptOrFnNode) actualFirstFirst)).getSourceName();
        assertNull(actualFirstFirstSourceName);
        
        int stringNodeFirstFirstBaseLineno = (((ScriptOrFnNode) stringNodeFirstFirst)).getBaseLineno();
        int actualFirstFirstBaseLineno = (((ScriptOrFnNode) actualFirstFirst)).getBaseLineno();
        assertEquals(stringNodeFirstFirstBaseLineno, actualFirstFirstBaseLineno);
        
        int stringNodeFirstFirstEndLineno = (((ScriptOrFnNode) stringNodeFirstFirst)).getEndLineno();
        int actualFirstFirstEndLineno = (((ScriptOrFnNode) actualFirstFirst)).getEndLineno();
        assertEquals(stringNodeFirstFirstEndLineno, actualFirstFirstEndLineno);
        
        ObjArray actualFirstFirstFunctions = ((ObjArray) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFirstFunctions);
        
        ObjArray actualFirstFirstRegexps = ((ObjArray) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstFirstRegexps);
        
        ObjArray actualFirstFirstItsVariables = ((ObjArray) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstFirstItsVariables);
        
        ObjArray actualFirstFirstItsConst = ((ObjArray) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstFirstItsConst);
        
        ObjToIntMap actualFirstFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstFirstItsVariableNames);
        
        int stringNodeFirstFirstVarStart = ((Integer) getFieldValue(stringNodeFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstFirstVarStart = ((Integer) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(stringNodeFirstFirstVarStart, actualFirstFirstVarStart);
        
        Object actualFirstFirstCompilerData = (((ScriptOrFnNode) actualFirstFirst)).getCompilerData();
        assertNull(actualFirstFirstCompilerData);
        
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    @Test
    public void testTryFoldTypeof8() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        String actualFirstFirstFunctionName = (((FunctionNode) actualFirstFirst)).getFunctionName();
        assertNull(actualFirstFirstFunctionName);
        
        boolean actualFirstFirstItsNeedsActivation = ((Boolean) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.FunctionNode", "itsNeedsActivation"));
        assertFalse(actualFirstFirstItsNeedsActivation);
        
        int stringNodeFirstFirstItsFunctionType = ((Integer) getFieldValue(stringNodeFirstFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        int actualFirstFirstItsFunctionType = ((Integer) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.FunctionNode", "itsFunctionType"));
        assertEquals(stringNodeFirstFirstItsFunctionType, actualFirstFirstItsFunctionType);
        
        boolean actualFirstFirstItsIgnoreDynamicScope = ((Boolean) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.FunctionNode", "itsIgnoreDynamicScope"));
        assertFalse(actualFirstFirstItsIgnoreDynamicScope);
        
        int stringNodeFirstFirstEncodedSourceStart = (((ScriptOrFnNode) stringNodeFirstFirst)).getEncodedSourceStart();
        int actualFirstFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirstFirst)).getEncodedSourceStart();
        assertEquals(stringNodeFirstFirstEncodedSourceStart, actualFirstFirstEncodedSourceStart);
        
        int stringNodeFirstFirstEncodedSourceEnd = (((ScriptOrFnNode) stringNodeFirstFirst)).getEncodedSourceEnd();
        int actualFirstFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirstFirst)).getEncodedSourceEnd();
        assertEquals(stringNodeFirstFirstEncodedSourceEnd, actualFirstFirstEncodedSourceEnd);
        
        String actualFirstFirstSourceName = (((ScriptOrFnNode) actualFirstFirst)).getSourceName();
        assertNull(actualFirstFirstSourceName);
        
        int stringNodeFirstFirstBaseLineno = (((ScriptOrFnNode) stringNodeFirstFirst)).getBaseLineno();
        int actualFirstFirstBaseLineno = (((ScriptOrFnNode) actualFirstFirst)).getBaseLineno();
        assertEquals(stringNodeFirstFirstBaseLineno, actualFirstFirstBaseLineno);
        
        int stringNodeFirstFirstEndLineno = (((ScriptOrFnNode) stringNodeFirstFirst)).getEndLineno();
        int actualFirstFirstEndLineno = (((ScriptOrFnNode) actualFirstFirst)).getEndLineno();
        assertEquals(stringNodeFirstFirstEndLineno, actualFirstFirstEndLineno);
        
        ObjArray actualFirstFirstFunctions = ((ObjArray) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFirstFunctions);
        
        ObjArray actualFirstFirstRegexps = ((ObjArray) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstFirstRegexps);
        
        ObjArray actualFirstFirstItsVariables = ((ObjArray) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstFirstItsVariables);
        
        ObjArray actualFirstFirstItsConst = ((ObjArray) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstFirstItsConst);
        
        ObjToIntMap actualFirstFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstFirstItsVariableNames);
        
        int stringNodeFirstFirstVarStart = ((Integer) getFieldValue(stringNodeFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstFirstVarStart = ((Integer) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(stringNodeFirstFirstVarStart, actualFirstFirstVarStart);
        
        Object actualFirstFirstCompilerData = (((ScriptOrFnNode) actualFirstFirst)).getCompilerData();
        assertNull(actualFirstFirstCompilerData);
        
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirst);
        
        Node actualFirstFirstLast = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstLast);
        
        Object actualFirstFirstPropListHead = getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstPropListHead);
        
        int stringNodeFirstFirstSourcePosition = stringNodeFirstFirst.getSourcePosition();
        int actualFirstFirstSourcePosition = actualFirstFirst.getSourcePosition();
        assertEquals(stringNodeFirstFirstSourcePosition, actualFirstFirstSourcePosition);
        
        JSType actualFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstJsType);
        
        Node actualFirstFirstParent = actualFirstFirst.getParent();
        assertNull(actualFirstFirstParent);
        
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
    
    @Test
    public void testTryFoldTypeof9() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(124);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        Node stringNodeFirstFirstNext = stringNodeFirstFirst.getNext();
        Node actualFirstFirstNext = actualFirstFirst.getNext();
        int stringNodeFirstFirstNextEncodedSourceStart = (((ScriptOrFnNode) stringNodeFirstFirstNext)).getEncodedSourceStart();
        int actualFirstFirstNextEncodedSourceStart = (((ScriptOrFnNode) actualFirstFirstNext)).getEncodedSourceStart();
        assertEquals(stringNodeFirstFirstNextEncodedSourceStart, actualFirstFirstNextEncodedSourceStart);
        
        int stringNodeFirstFirstNextEncodedSourceEnd = (((ScriptOrFnNode) stringNodeFirstFirstNext)).getEncodedSourceEnd();
        int actualFirstFirstNextEncodedSourceEnd = (((ScriptOrFnNode) actualFirstFirstNext)).getEncodedSourceEnd();
        assertEquals(stringNodeFirstFirstNextEncodedSourceEnd, actualFirstFirstNextEncodedSourceEnd);
        
        String actualFirstFirstNextSourceName = (((ScriptOrFnNode) actualFirstFirstNext)).getSourceName();
        assertNull(actualFirstFirstNextSourceName);
        
        int stringNodeFirstFirstNextBaseLineno = (((ScriptOrFnNode) stringNodeFirstFirstNext)).getBaseLineno();
        int actualFirstFirstNextBaseLineno = (((ScriptOrFnNode) actualFirstFirstNext)).getBaseLineno();
        assertEquals(stringNodeFirstFirstNextBaseLineno, actualFirstFirstNextBaseLineno);
        
        int stringNodeFirstFirstNextEndLineno = (((ScriptOrFnNode) stringNodeFirstFirstNext)).getEndLineno();
        int actualFirstFirstNextEndLineno = (((ScriptOrFnNode) actualFirstFirstNext)).getEndLineno();
        assertEquals(stringNodeFirstFirstNextEndLineno, actualFirstFirstNextEndLineno);
        
        ObjArray actualFirstFirstNextFunctions = ((ObjArray) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFirstNextFunctions);
        
        ObjArray actualFirstFirstNextRegexps = ((ObjArray) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstFirstNextRegexps);
        
        ObjArray actualFirstFirstNextItsVariables = ((ObjArray) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstFirstNextItsVariables);
        
        ObjArray actualFirstFirstNextItsConst = ((ObjArray) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstFirstNextItsConst);
        
        ObjToIntMap actualFirstFirstNextItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstFirstNextItsVariableNames);
        
        int stringNodeFirstFirstNextVarStart = ((Integer) getFieldValue(stringNodeFirstFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstFirstNextVarStart = ((Integer) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(stringNodeFirstFirstNextVarStart, actualFirstFirstNextVarStart);
        
        Object actualFirstFirstNextCompilerData = (((ScriptOrFnNode) actualFirstFirstNext)).getCompilerData();
        assertNull(actualFirstFirstNextCompilerData);
        
        int stringNodeFirstFirstNextType = stringNodeFirstFirstNext.getType();
        int actualFirstFirstNextType = actualFirstFirstNext.getType();
        assertEquals(stringNodeFirstFirstNextType, actualFirstFirstNextType);
        
        assertTrue(deepEquals(stringNodeFirstFirstNext, actualFirstFirstNext));
        Node actualFirstFirstNextFirst = ((Node) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstNextFirst);
        
        Node actualFirstFirstNextLast = ((Node) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstNextLast);
        
        Object actualFirstFirstNextPropListHead = getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstNextPropListHead);
        
        int stringNodeFirstFirstNextSourcePosition = stringNodeFirstFirstNext.getSourcePosition();
        int actualFirstFirstNextSourcePosition = actualFirstFirstNext.getSourcePosition();
        assertEquals(stringNodeFirstFirstNextSourcePosition, actualFirstFirstNextSourcePosition);
        
        JSType actualFirstFirstNextJsType = ((JSType) getFieldValue(actualFirstFirstNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstNextJsType);
        
        Node actualFirstFirstNextParent = actualFirstFirstNext.getParent();
        assertNull(actualFirstFirstNextParent);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        
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
    
    @Test
    public void testTryFoldTypeof10() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        ScriptOrFnNode first2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        Object actual = tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        
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
        
        assertTrue(deepEquals(stringNodeFirst, actualFirst));
        Node stringNodeFirstFirst = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstFirstType = stringNodeFirstFirst.getType();
        int actualFirstFirstType = actualFirstFirst.getType();
        assertEquals(stringNodeFirstFirstType, actualFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        Node stringNodeFirstFirstFirst = ((Node) getFieldValue(stringNodeFirstFirst, "com.google.javascript.rhino.Node", "first"));
        Node actualFirstFirstFirst = ((Node) getFieldValue(actualFirstFirst, "com.google.javascript.rhino.Node", "first"));
        int stringNodeFirstFirstFirstEncodedSourceStart = (((ScriptOrFnNode) stringNodeFirstFirstFirst)).getEncodedSourceStart();
        int actualFirstFirstFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirstFirstFirst)).getEncodedSourceStart();
        assertEquals(stringNodeFirstFirstFirstEncodedSourceStart, actualFirstFirstFirstEncodedSourceStart);
        
        int stringNodeFirstFirstFirstEncodedSourceEnd = (((ScriptOrFnNode) stringNodeFirstFirstFirst)).getEncodedSourceEnd();
        int actualFirstFirstFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirstFirstFirst)).getEncodedSourceEnd();
        assertEquals(stringNodeFirstFirstFirstEncodedSourceEnd, actualFirstFirstFirstEncodedSourceEnd);
        
        String actualFirstFirstFirstSourceName = (((ScriptOrFnNode) actualFirstFirstFirst)).getSourceName();
        assertNull(actualFirstFirstFirstSourceName);
        
        int stringNodeFirstFirstFirstBaseLineno = (((ScriptOrFnNode) stringNodeFirstFirstFirst)).getBaseLineno();
        int actualFirstFirstFirstBaseLineno = (((ScriptOrFnNode) actualFirstFirstFirst)).getBaseLineno();
        assertEquals(stringNodeFirstFirstFirstBaseLineno, actualFirstFirstFirstBaseLineno);
        
        int stringNodeFirstFirstFirstEndLineno = (((ScriptOrFnNode) stringNodeFirstFirstFirst)).getEndLineno();
        int actualFirstFirstFirstEndLineno = (((ScriptOrFnNode) actualFirstFirstFirst)).getEndLineno();
        assertEquals(stringNodeFirstFirstFirstEndLineno, actualFirstFirstFirstEndLineno);
        
        ObjArray actualFirstFirstFirstFunctions = ((ObjArray) getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "functions"));
        assertNull(actualFirstFirstFirstFunctions);
        
        ObjArray actualFirstFirstFirstRegexps = ((ObjArray) getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "regexps"));
        assertNull(actualFirstFirstFirstRegexps);
        
        ObjArray actualFirstFirstFirstItsVariables = ((ObjArray) getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariables"));
        assertNull(actualFirstFirstFirstItsVariables);
        
        ObjArray actualFirstFirstFirstItsConst = ((ObjArray) getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsConst"));
        assertNull(actualFirstFirstFirstItsConst);
        
        ObjToIntMap actualFirstFirstFirstItsVariableNames = ((ObjToIntMap) getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "itsVariableNames"));
        assertNull(actualFirstFirstFirstItsVariableNames);
        
        int stringNodeFirstFirstFirstVarStart = ((Integer) getFieldValue(stringNodeFirstFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstFirstFirstVarStart = ((Integer) getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(stringNodeFirstFirstFirstVarStart, actualFirstFirstFirstVarStart);
        
        Object actualFirstFirstFirstCompilerData = (((ScriptOrFnNode) actualFirstFirstFirst)).getCompilerData();
        assertNull(actualFirstFirstFirstCompilerData);
        
        int stringNodeFirstFirstFirstType = stringNodeFirstFirstFirst.getType();
        int actualFirstFirstFirstType = actualFirstFirstFirst.getType();
        assertEquals(stringNodeFirstFirstFirstType, actualFirstFirstFirstType);
        
        assertTrue(deepEquals(stringNodeFirstFirstFirst, actualFirstFirstFirst));
        Node actualFirstFirstFirstFirst = ((Node) getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirstFirstFirst);
        
        Node actualFirstFirstFirstLast = ((Node) getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstFirstFirstLast);
        
        Object actualFirstFirstFirstPropListHead = getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstFirstFirstPropListHead);
        
        int stringNodeFirstFirstFirstSourcePosition = stringNodeFirstFirstFirst.getSourcePosition();
        int actualFirstFirstFirstSourcePosition = actualFirstFirstFirst.getSourcePosition();
        assertEquals(stringNodeFirstFirstFirstSourcePosition, actualFirstFirstFirstSourcePosition);
        
        JSType actualFirstFirstFirstJsType = ((JSType) getFieldValue(actualFirstFirstFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstFirstFirstJsType);
        
        Node actualFirstFirstFirstParent = actualFirstFirstFirst.getParent();
        assertNull(actualFirstFirstFirstParent);
        
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        assertTrue(deepEquals(stringNodeFirstFirst, actualFirstFirst));
        
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
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldTypeof11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldTypeof12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(105);
        setField(first1, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldTypeof13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldTypeof14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldTypeof(com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldTypeof15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldTypeof16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldTypeof17() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(47);
        setField(first1, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldTypeof18() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first1, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldTypeof19() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:306) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldTypeof20() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(43);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:306) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldTypeof21() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:649)
            com.google.javascript.rhino.Node.replaceChild(Node.java:793)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:306) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldTypeof22() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(26);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:484)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:492)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:495)
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:566)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:267) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldTypeof23() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:306) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldTypeof24() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof(PeepholeFoldConstants.java:306) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
        try {
            tryFoldTypeofMethod.invoke(peepholeFoldConstants, tryFoldTypeofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldTypeof25() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(122);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldTypeof] produces [java.lang.NullPointerException] */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldTypeofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldTypeof", stringNodeType);
        tryFoldTypeofMethod.setAccessible(true);
        java.lang.Object[] tryFoldTypeofMethodArguments = new java.lang.Object[1];
        tryFoldTypeofMethodArguments[0] = stringNode;
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
 * @utbot.executesCondition {@code (result == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryConvertToNumber_ResultEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", scriptOrFnNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = scriptOrFnNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryConvertToNumber_Return() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", nodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = node;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(100);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(39);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", scriptOrFnNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", scriptOrFnNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:215) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryConvertToNumber(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isUndefined(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isUndefined(n)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryConvertToNumber_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", scriptOrFnNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = scriptOrFnNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tryConvertToNumber(com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertToNumber(com.google.javascript.rhino.Node)}
     */
    @Test
    public void testTryConvertToNumber() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(1, 98, 40);
        node.setType(85);
        Node node1 = new Node(Integer.MAX_VALUE, node);
        node1.setType(524289);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class node1Type = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", node1Type);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = node1;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryConvertToNumber(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryConvertToNumber1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", stringNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = stringNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    @Test
    public void testTryConvertToNumber2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(49);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", stringNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = stringNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    @Test
    public void testTryConvertToNumber3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(48);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", stringNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = stringNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    @Test
    public void testTryConvertToNumber4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(85);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", functionNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = functionNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    @Test
    public void testTryConvertToNumber5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", stringNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = stringNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    
    @Test
    public void testTryConvertToNumber6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", stringNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = stringNode;
        tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryConvertToNumber(com.google.javascript.rhino.Node)
    
    @Test
    public void testTryConvertToNumber7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber8() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getStringNumberValue(NodeUtil.java:326)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:314)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:235) */
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
    
    @Test
    public void testTryConvertToNumber12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:215)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:226) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", functionNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = functionNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryConvertToNumber13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:215)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:226) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", functionNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = functionNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryConvertToNumber14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:138)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:307)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:235) */
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
    
    @Test
    public void testTryConvertToNumber15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber17() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(43);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber18() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber19() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber20() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(93);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isName(NodeUtil.java:1475)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:822)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:279)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:235) */
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
    
    @Test
    public void testTryConvertToNumber21() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber22() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(30);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:898)
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:883)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:798)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:279)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:235) */
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
    
    @Test
    public void testTryConvertToNumber23() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(44);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:254) */
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
    
    @Test
    public void testTryConvertToNumber24() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(100);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(98);
        setField(last, "com.google.javascript.rhino.Node", "first", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:215)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:225)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:222) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", functionNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = functionNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryConvertToNumber25() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:215)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:222)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:225) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", functionNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = functionNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryConvertToNumber(com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryConvertToNumber26() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", scriptOrFnNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = scriptOrFnNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryConvertToNumber27() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(100);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", functionNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = functionNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryConvertToNumber28() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
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
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryConvertToNumber29() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
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
    
    @Test(expected = IllegalStateException.class)
    public void testTryConvertToNumber30() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
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
    
    @Test(expected = IllegalStateException.class)
    public void testTryConvertToNumber31() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
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
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryConvertToNumber32() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(98);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertToNumber", functionNodeType);
        tryConvertToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertToNumberMethodArguments = new java.lang.Object[1];
        tryConvertToNumberMethodArguments[0] = functionNode;
        try {
            tryConvertToNumberMethod.invoke(peepholeFoldConstants, tryConvertToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryConvertToNumber(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryConvertToNumber33() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInstanceof(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldInstanceof_NodeUtilIsLiteralValue() throws Exception  {
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.INSTANCEOF);
 *  */
    @Test
    public void testTryFoldInstanceof_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:413) */
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInstanceof(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.PeepholeFoldConstants#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !mayHaveSideEffects(right)
 *  */
    @Test
    public void testTryFoldInstanceof_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(52);
        Node node = new Node(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:418) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInstanceof(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
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
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldInstanceof1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(98);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        Object actual = tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        
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
    public void testTryFoldInstanceof2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        Object actual = tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        
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
    public void testTryFoldInstanceof3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        Object actual = tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        
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
    public void testTryFoldInstanceof4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(49);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        Object actual = tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        
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
    public void testTryFoldInstanceof5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        Object actual = tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        
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
    public void testTryFoldInstanceof6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(35);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        Object actual = tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        
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
    public void testTryFoldInstanceof7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(115);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        Object actual = tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        
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
    public void testTryFoldInstanceof8() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(52);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", stringNodeType, stringNodeType, stringNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = stringNode;
        tryFoldInstanceofMethodArguments[1] = scriptOrFnNode;
        tryFoldInstanceofMethodArguments[2] = scriptOrFnNode;
        Object actual = tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        
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
    public void testTryFoldInstanceof9() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(52);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", stringNodeType, stringNodeType, stringNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = stringNode;
        tryFoldInstanceofMethodArguments[1] = scriptOrFnNode;
        tryFoldInstanceofMethodArguments[2] = scriptOrFnNode;
        Object actual = tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        
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
    
    ///region OTHER: ERROR SUITE for method tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldInstanceof10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(92);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isName(NodeUtil.java:1475)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:822)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:418) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldInstanceof11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(124);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:418) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = ((Object) null);
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldInstanceof12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(52);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:418) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", stringNodeType, stringNodeType, stringNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = stringNode;
        tryFoldInstanceofMethodArguments[1] = scriptOrFnNode;
        tryFoldInstanceofMethodArguments[2] = ((Object) null);
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldInstanceof13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(52);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(47);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:418) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", stringNodeType, stringNodeType, stringNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = stringNode;
        tryFoldInstanceofMethodArguments[1] = scriptOrFnNode;
        tryFoldInstanceofMethodArguments[2] = ((Object) null);
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldInstanceof14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Node node = new Node(52);
        Node node1 = new Node(41);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInstanceof(PeepholeFoldConstants.java:418) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", nodeType, nodeType, nodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = node;
        tryFoldInstanceofMethodArguments[1] = node1;
        tryFoldInstanceofMethodArguments[2] = ((Object) null);
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldInstanceof(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldInstanceof15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldInstanceof16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = new Node(47);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = functionNode;
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldInstanceof17() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInstanceofMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInstanceof", numberNodeType, numberNodeType, numberNodeType);
        tryFoldInstanceofMethod.setAccessible(true);
        java.lang.Object[] tryFoldInstanceofMethodArguments = new java.lang.Object[3];
        tryFoldInstanceofMethodArguments[0] = numberNode;
        tryFoldInstanceofMethodArguments[1] = node;
        tryFoldInstanceofMethodArguments[2] = ((Object) null);
        try {
            tryFoldInstanceofMethod.invoke(peepholeFoldConstants, tryFoldInstanceofMethodArguments);
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = -255;
        compareAsNumbersMethodArguments[1] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(26);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, nodeType, nodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = -255;
        compareAsNumbersMethodArguments[1] = node;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = -255;
        compareAsNumbersMethodArguments[1] = scriptOrFnNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testCompareAsNumbers1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = scriptOrFnNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(41);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = scriptOrFnNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(44);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers6() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers7() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers8() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers9() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(76);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers10() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers11() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers12() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCompareAsNumbers13() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(29);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = ((Object) null);
        Boolean actual = ((Boolean) compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testCompareAsNumbers14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:267)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1087) */
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
    
    @Test
    public void testCompareAsNumbers15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:267)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1087) */
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
    
    @Test
    public void testCompareAsNumbers16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:267)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1087) */
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
    
    @Test
    public void testCompareAsNumbers17() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getStringNumberValue(NodeUtil.java:326)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:314)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1083) */
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
    
    @Test
    public void testCompareAsNumbers18() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:288)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1083) */
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
    
    @Test
    public void testCompareAsNumbers19() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(30);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:898)
            com.google.javascript.jscomp.NodeUtil.constructorCallHasSideEffects(NodeUtil.java:883)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:798)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:279)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1083) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers20() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(37);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(NodeUtil.java:949)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:808)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:279)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1083) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers21() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(88);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isName(NodeUtil.java:1475)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:822)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:279)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1083) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCompareAsNumbers22() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:279)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1083) */
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
    
    @Test
    public void testCompareAsNumbers23() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:267)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1087) */
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
    
    @Test
    public void testCompareAsNumbers24() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:138)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:307)
            com.google.javascript.jscomp.PeepholeFoldConstants.compareAsNumbers(PeepholeFoldConstants.java:1083) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareAsNumbers(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testCompareAsNumbers25() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareAsNumbers26() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testCompareAsNumbers27() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCompareAsNumbers28() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method compareAsNumbersMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareAsNumbers", intType, stringNodeType, stringNodeType);
        compareAsNumbersMethod.setAccessible(true);
        java.lang.Object[] compareAsNumbersMethodArguments = new java.lang.Object[3];
        compareAsNumbersMethodArguments[0] = 0;
        compareAsNumbersMethodArguments[1] = stringNode;
        compareAsNumbersMethodArguments[2] = stringNode;
        try {
            compareAsNumbersMethod.invoke(peepholeFoldConstants, compareAsNumbersMethodArguments);
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
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldComparison_NodeGetType() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(105);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode1;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments));
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldComparison(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:882) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:882) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int op = n.getType();
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(47);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:887) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = scriptOrFnNode1;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:882) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = scriptOrFnNode1;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:882) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_6() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(47);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:882) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = scriptOrFnNode1;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldComparison(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.GT && n.getType() != Token.LT
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:882) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int op = n.getType();
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:887) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = scriptOrFnNode1;
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
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isLiteralValue(left, false) || !NodeUtil.isLiteralValue(right, false)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldComparison_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldComparison(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldComparison1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node node = new Node(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", stringNodeType, stringNodeType, stringNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = stringNode;
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = node;
        Object actual = tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        
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
    public void testTryFoldComparison2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node node = new Node(47);
        Node node1 = new Node(64);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", stringNodeType, stringNodeType, stringNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = stringNode;
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = node1;
        Object actual = tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        
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
    public void testTryFoldComparison3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = node;
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        Node actual = ((Node) tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments));
        
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
        assertTrue(deepEquals(nodeFirst, actualFirst));
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
    
    @Test
    public void testTryFoldComparison4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node node = new Node(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments));
        
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
    
    @Test
    public void testTryFoldComparison5() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(29);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments));
        
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
    
    ///region OTHER: ERROR SUITE for method tryFoldComparison(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldComparison6() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
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
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldComparison7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
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
    
    @Test
    public void testTryFoldComparison8() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(14);
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException] */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", stringNodeType, stringNodeType, stringNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = stringNode;
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(64);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:882) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = scriptOrFnNode;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison10() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(47);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:882) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeType, nodeType, nodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = ((Object) null);
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = scriptOrFnNode;
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison11() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(63);
        Node node1 = new Node(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:887) */
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
    
    @Test
    public void testTryFoldComparison12() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(63);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison(PeepholeFoldConstants.java:882) */
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
    
    @Test
    public void testTryFoldComparison13() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException] */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", numberNodeType, numberNodeType, numberNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = numberNode;
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison14() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException] */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldComparison", numberNodeType, numberNodeType, numberNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[3];
        tryFoldComparisonMethodArguments[0] = numberNode;
        tryFoldComparisonMethodArguments[1] = node;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(peepholeFoldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison15() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException] */
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
    
    @Test
    public void testTryFoldComparison16() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldComparison] produces [java.lang.NullPointerException] */
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", scriptOrFnNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments));
        
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
        
        Node scriptOrFnNodeParent = scriptOrFnNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        int scriptOrFnNodeParentType = scriptOrFnNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(scriptOrFnNodeParentType, actualParentType);
        
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(35);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", scriptOrFnNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments));
        
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
        
        Node scriptOrFnNodeParent = scriptOrFnNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        int scriptOrFnNodeParentType = scriptOrFnNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(scriptOrFnNodeParentType, actualParentType);
        
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldInForcedStringContext(n);}
 *  */
    @Test
    public void testTryFoldCtorCall_ReturnTryFoldInForcedStringContext_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", scriptOrFnNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments));
        
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
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int scriptOrFnNodeFirstSourcePosition = scriptOrFnNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(scriptOrFnNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        Node scriptOrFnNodeParent = scriptOrFnNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        int scriptOrFnNodeParentType = scriptOrFnNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(scriptOrFnNodeParentType, actualParentType);
        
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        Node scriptOrFnNodeParentLast = ((Node) getFieldValue(scriptOrFnNodeParent, "com.google.javascript.rhino.Node", "last"));
        Node actualParentLast = ((Node) getFieldValue(actualParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return tryFoldInForcedStringContext(n);}
 *  */
    @Test
    public void testTryFoldCtorCall_ReturnTryFoldInForcedStringContext() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", scriptOrFnNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments));
        
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
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int scriptOrFnNodeFirstSourcePosition = scriptOrFnNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(scriptOrFnNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        Node scriptOrFnNodeParent = scriptOrFnNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        int scriptOrFnNodeParentType = scriptOrFnNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(scriptOrFnNodeParentType, actualParentType);
        
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        Node scriptOrFnNodeParentLast = ((Node) getFieldValue(scriptOrFnNodeParent, "com.google.javascript.rhino.Node", "last"));
        Node actualParentLast = ((Node) getFieldValue(actualParent, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        assertTrue(deepEquals(scriptOrFnNodeParentLast, actualParentLast));
        
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldCtorCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.NEW);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldCtorCall_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", scriptOrFnNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", scriptOrFnNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldCtorCallMethod.invoke(peepholeFoldConstants, tryFoldCtorCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldCtorCall(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldCtorCall(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.NEW);
 *  */
    @Test
    public void testTryFoldCtorCall_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall(PeepholeFoldConstants.java:1156) */
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext(PeepholeFoldConstants.java:1167)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall(PeepholeFoldConstants.java:1159) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", scriptOrFnNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1176)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall(PeepholeFoldConstants.java:1160) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", scriptOrFnNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1180)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldCtorCall(PeepholeFoldConstants.java:1160) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldCtorCallMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldCtorCall", scriptOrFnNodeType);
        tryFoldCtorCallMethod.setAccessible(true);
        java.lang.Object[] tryFoldCtorCallMethodArguments = new java.lang.Object[1];
        tryFoldCtorCallMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.executesCondition {@code (left.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): False}
 *  */
    @Test
    public void testTryFoldGetProp_RightGetTypeNotEqualsTokenSTRING() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node node = new Node(-255);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = node;
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.OBJECTLIT): True}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.returnsFrom {@code return tryFoldObjectPropAccess(n, left, right);}
 *  */
    @Test
    public void testTryFoldGetProp_LeftGetTypeEqualsTokenOBJECTLIT() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node node = new Node(64);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = node;
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetProp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.executesCondition {@code (right.getString().equals("length")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testTryFoldGetProp_NotRightGetStringEquals() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node node = new Node(-255);
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
        tryFoldGetPropMethodArguments[1] = node;
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.OBJECTLIT
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1231) */
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
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETPROP);): True}
 * @utbot.executesCondition {@code (left.getType() == Token.OBJECTLIT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: right.getType() == Token.STRING && right.getString().equals("length")
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1235) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = node;
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
 * @utbot.executesCondition {@code (left.getType() == Token.OBJECTLIT): True}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldObjectPropAccess(n, left, right);
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node node = new Node(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1327)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1232) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = node;
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
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1229) */
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
 * @utbot.executesCondition {@code (left.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getString().equals("length")
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node node = new Node(-255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetProp(PeepholeFoldConstants.java:1236) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = node;
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
 * @utbot.executesCondition {@code (left.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: right.getString().equals("length")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldGetProp_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Node node = new Node(-255);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldGetProp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[3];
        tryFoldGetPropMethodArguments[0] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[1] = node;
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
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.compareToUndefined
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method compareToUndefined(com.google.javascript.rhino.Node, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// execute conditions:
    ///     {@code ((Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false))): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_ReturnFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", nodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = node;
        compareToUndefinedMethodArguments[1] = 14;
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
    public void testCompareToUndefined_ReturnValueUndefined() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", nodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = node;
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
    public void testCompareToUndefined_ReturnEquivalent() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", nodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = node;
        compareToUndefinedMethodArguments[1] = 12;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method compareToUndefined(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code ((Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false))): False}
 * @utbot.returnsFrom {@code return !equivalent;}
 *  */
    @Test
    public void testCompareToUndefined_NotEquivalent() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", scriptOrFnNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = scriptOrFnNode;
        compareToUndefinedMethodArguments[1] = 13;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code ((Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false))): False}
 * @utbot.returnsFrom {@code return !valueUndefined;}
 *  */
    @Test
    public void testCompareToUndefined_NotValueUndefined() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(41);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", scriptOrFnNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = scriptOrFnNode;
        compareToUndefinedMethodArguments[1] = 46;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code ((Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false))): False}
 * @utbot.returnsFrom {@code return !equivalent;}
 *  */
    @Test
    public void testCompareToUndefined_NotEquivalent_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", scriptOrFnNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = scriptOrFnNode;
        compareToUndefinedMethodArguments[1] = 13;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code (value.getString().equals("undefined")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_NotValueGetStringEquals() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
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
        compareToUndefinedMethodArguments[1] = 16;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code ((Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false))): True}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(value.getFirstChild(), false)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 * @utbot.returnsFrom {@code return !valueUndefined;}
 *  */
    @Test
    public void testCompareToUndefined_NotValueUndefined_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(122);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(47);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", scriptOrFnNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = scriptOrFnNode;
        compareToUndefinedMethodArguments[1] = 46;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #2 for method compareToUndefined(com.google.javascript.rhino.Node, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// execute conditions:
    ///     {@code ((Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false))): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)} once
    /// execute conditions:
    ///     {@code (NodeUtil.isLiteralValue(value.getFirstChild(), false)): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_SwitchOpCasedefault() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", functionNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = functionNode;
        compareToUndefinedMethodArguments[1] = 14;
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
    public void testCompareToUndefined_ReturnValueUndefined_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", functionNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = functionNode;
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
    public void testCompareToUndefined_ReturnEquivalent_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(105);
        setField(first1, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", functionNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = functionNode;
        compareToUndefinedMethodArguments[1] = 12;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_SwitchOpCasedefault_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", functionNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = functionNode;
        compareToUndefinedMethodArguments[1] = 15;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #3 for method compareToUndefined(com.google.javascript.rhino.Node, int)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// execute conditions:
    ///     {@code ((Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false))): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)} once
    /// execute conditions:
    ///     {@code (NodeUtil.isLiteralValue(value.getFirstChild(), false)): True}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_SwitchOpCasedefault_3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(44);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", functionNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = functionNode;
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
    public void testCompareToUndefined_ReturnValueUndefined_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(29);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(43);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", functionNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = functionNode;
        compareToUndefinedMethodArguments[1] = 45;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_SwitchOpCasedefault_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(124);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", functionNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = functionNode;
        compareToUndefinedMethodArguments[1] = 16;
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
    public void testCompareToUndefined_ReturnEquivalent_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(47);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", functionNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = functionNode;
        compareToUndefinedMethodArguments[1] = 12;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.activatesSwitch {@code switch(op) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCompareToUndefined_SwitchOpCasedefault_4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first2.setType(47);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", functionNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = functionNode;
        compareToUndefinedMethodArguments[1] = 14;
        boolean actual = ((Boolean) compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method compareToUndefined(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code ((Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false))): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(op) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", scriptOrFnNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: value.getString().equals("undefined")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCompareToUndefined_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", scriptOrFnNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.executesCondition {@code ((Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false))): True}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(value.getFirstChild(), false)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(op) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCompareToUndefined_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(122);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", scriptOrFnNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = scriptOrFnNode;
        compareToUndefinedMethodArguments[1] = -255;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method compareToUndefined(com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#compareToUndefined(com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean valueUndefined = ((Token.NAME == value.getType() && value.getString().equals("undefined")) || (Token.VOID == value.getType() && NodeUtil.isLiteralValue(value.getFirstChild(), false)));
 *  */
    @Test
    public void testCompareToUndefined_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareToUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.compareToUndefined(PeepholeFoldConstants.java:1125) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", nodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = ((Object) null);
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value.getString().equals("undefined")
 *  */
    @Test
    public void testCompareToUndefined_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.compareToUndefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.compareToUndefined(PeepholeFoldConstants.java:1126) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method compareToUndefinedMethod = peepholeFoldConstantsClazz.getDeclaredMethod("compareToUndefined", stringNodeType, intType);
        compareToUndefinedMethod.setAccessible(true);
        java.lang.Object[] compareToUndefinedMethodArguments = new java.lang.Object[2];
        compareToUndefinedMethodArguments[0] = stringNode;
        compareToUndefinedMethodArguments[1] = -255;
        try {
            compareToUndefinedMethod.invoke(peepholeFoldConstants, compareToUndefinedMethodArguments);
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
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): False}
 * @utbot.returnsFrom {@code return n;}
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
        assertEquals(scriptOrFnNodeSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.returnsFrom {@code return tryFoldArrayAccess(n, left, right);}
 *  */
    @Test
    public void testTryFoldGetElem_LeftGetTypeEqualsTokenARRAYLIT() throws Exception  {
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
        
        int scriptOrFnNodeSourcePosition = scriptOrFnNode.getSourcePosition();
        int actualSourcePosition = actual.getSourcePosition();
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.OBJECTLIT
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1215) */
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
 * @utbot.executesCondition {@code (left.getType() == Token.OBJECTLIT): True}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldObjectPropAccess(n, left, right);
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(35);
        Node node = new Node(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1327)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1216) */
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
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1213) */
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
 * @utbot.executesCondition {@code (left.getType() == Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return tryFoldArrayAccess(n, left, right);
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(35);
        Node node = new Node(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1284)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldGetElem(PeepholeFoldConstants.java:1220) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldGetElem(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldGetElem(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.GETELEM);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(93);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", nodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = node;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(peepholeFoldConstants, isAssignmentTargetMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(parent)): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.INC): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignmentTarget_ParentGetTypeEqualsTokenINC() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(102);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", scriptOrFnNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(peepholeFoldConstants, isAssignmentTargetMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(parent)): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.INC): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.DEC): True}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsAssignmentTarget_ParentGetTypeEqualsTokenDEC() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(103);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", scriptOrFnNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isAssignmentTargetMethod.invoke(peepholeFoldConstants, isAssignmentTargetMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isAssignmentOp(parent)): True}
 * @utbot.executesCondition {@code (parent.getFirstChild() == n): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.INC): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.DEC): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsAssignmentTarget_ParentGetTypeNotEqualsTokenDEC() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(96);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", scriptOrFnNodeType);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.isAssignmentTarget] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.isAssignmentTarget(PeepholeFoldConstants.java:1266) */
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
    
    ///region FUZZER: ERROR SUITE for method isAssignmentTarget(com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#isAssignmentTarget(com.google.javascript.rhino.Node)}
     */
    @Test
    public void testIsAssignmentTargetThrowsNPE() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(103, -1, 103);
        node.setType(102);
        Node node1 = new Node(103, node);
        node1.setType(524390);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.isAssignmentTarget] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isAssignmentOp(NodeUtil.java:1390)
            com.google.javascript.jscomp.PeepholeFoldConstants.isAssignmentTarget(PeepholeFoldConstants.java:1267) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class node1Type = Class.forName("com.google.javascript.rhino.Node");
        Method isAssignmentTargetMethod = peepholeFoldConstantsClazz.getDeclaredMethod("isAssignmentTarget", node1Type);
        isAssignmentTargetMethod.setAccessible(true);
        java.lang.Object[] isAssignmentTargetMethodArguments = new java.lang.Object[1];
        isAssignmentTargetMethodArguments[0] = node1;
        try {
            isAssignmentTargetMethod.invoke(peepholeFoldConstants, isAssignmentTargetMethodArguments);
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
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldArrayAccess_RightGetTypeNotEqualsTokenNUMBER() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = functionNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments));
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldArrayAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testTryFoldArrayAccess_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1279) */
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
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): False}
 * @utbot.executesCondition {@code (intIndex != index): False}
 * @utbot.executesCondition {@code (intIndex < 0): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node elem = left.getFirstChild();
 *  */
    @Test
    public void testTryFoldArrayAccess_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1302) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = numberNode;
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: right.getType() != Token.NUMBER
 *  */
    @Test
    public void testTryFoldArrayAccess_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArrayAccess(PeepholeFoldConstants.java:1284) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = ((Object) null);
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldArrayAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArrayAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double index = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldArrayAccess_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArrayAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArrayAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArrayAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldArrayAccessMethodArguments = new java.lang.Object[3];
        tryFoldArrayAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldArrayAccessMethodArguments[1] = ((Object) null);
        tryFoldArrayAccessMethodArguments[2] = functionNode;
        try {
            tryFoldArrayAccessMethod.invoke(peepholeFoldConstants, tryFoldArrayAccessMethodArguments);
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
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReduceVoid_ReturnN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(49);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceVoidMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceVoid", scriptOrFnNodeType);
        tryReduceVoidMethod.setAccessible(true);
        java.lang.Object[] tryReduceVoidMethodArguments = new java.lang.Object[1];
        tryReduceVoidMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryReduceVoidMethod.invoke(peepholeFoldConstants, tryReduceVoidMethodArguments));
        
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
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int scriptOrFnNodeFirstSourcePosition = scriptOrFnNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceVoid(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryReduceVoid_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceVoidMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceVoid", scriptOrFnNodeType);
        tryReduceVoidMethod.setAccessible(true);
        java.lang.Object[] tryReduceVoidMethodArguments = new java.lang.Object[1];
        tryReduceVoidMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryReduceVoidMethod.invoke(peepholeFoldConstants, tryReduceVoidMethodArguments));
        
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
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int scriptOrFnNodeFirstSourcePosition = scriptOrFnNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryReduceVoid(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryReduceVoid(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (child.getType() != Token.NUMBER): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: child.getType() != Token.NUMBER || child.getDouble() != 0.0
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryReduceVoid_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(39);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceVoidMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceVoid", scriptOrFnNodeType);
        tryReduceVoidMethod.setAccessible(true);
        java.lang.Object[] tryReduceVoidMethodArguments = new java.lang.Object[1];
        tryReduceVoidMethodArguments[0] = scriptOrFnNode;
        try {
            tryReduceVoidMethod.invoke(peepholeFoldConstants, tryReduceVoidMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid(PeepholeFoldConstants.java:156) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: child.getType() != Token.NUMBER || child.getDouble() != 0.0
 *  */
    @Test
    public void testTryReduceVoid_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid(PeepholeFoldConstants.java:157) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceVoidMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceVoid", scriptOrFnNodeType);
        tryReduceVoidMethod.setAccessible(true);
        java.lang.Object[] tryReduceVoidMethodArguments = new java.lang.Object[1];
        tryReduceVoidMethodArguments[0] = scriptOrFnNode;
        try {
            tryReduceVoidMethod.invoke(peepholeFoldConstants, tryReduceVoidMethodArguments);
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        
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
            com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree(PeepholeFoldConstants.java:63) */
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
    public void testOptimizeSubtree_ThrowNullPointerException_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceVoid(PeepholeFoldConstants.java:157)
            com.google.javascript.jscomp.PeepholeFoldConstants.optimizeSubtree(PeepholeFoldConstants.java:78) */
        peepholeFoldConstants.optimizeSubtree(scriptOrFnNode);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method optimizeSubtree(com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#optimizeSubtree(com.google.javascript.rhino.Node)}
     */
    @Test
    public void testOptimizeSubtree() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(-1, 27, 123);
        node.setType(1);
        Node node1 = new Node(123, node);
        node1.setType(524316);
        
        Node actual = peepholeFoldConstants.optimizeSubtree(node1);
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(524316);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(1);
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", 110715);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.getType();
        int actualFirstType = actualFirst.getType();
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
    public void testTryConvertOperandsToNumber_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", scriptOrFnNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = scriptOrFnNode;
        tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryConvertOperandsToNumber() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", scriptOrFnNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = scriptOrFnNode;
        tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryConvertOperandsToNumber_3() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(39);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", scriptOrFnNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = scriptOrFnNode;
        tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryConvertOperandsToNumber_4() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(100);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(39);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", scriptOrFnNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = scriptOrFnNode;
        tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryConvertOperandsToNumber(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryConvertOperandsToNumber_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(29);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", scriptOrFnNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber(PeepholeFoldConstants.java:208) */
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
    public void testTryConvertOperandsToNumber_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(101);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:215)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:222)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber(PeepholeFoldConstants.java:210) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", scriptOrFnNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(98);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:215)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:225)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertOperandsToNumber(PeepholeFoldConstants.java:210) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryConvertOperandsToNumberMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryConvertOperandsToNumber", scriptOrFnNodeType);
        tryConvertOperandsToNumberMethod.setAccessible(true);
        java.lang.Object[] tryConvertOperandsToNumberMethodArguments = new java.lang.Object[1];
        tryConvertOperandsToNumberMethodArguments[0] = scriptOrFnNode;
        try {
            tryConvertOperandsToNumberMethod.invoke(peepholeFoldConstants, tryConvertOperandsToNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldObjectPropAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): True}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_RightGetTypeNotEqualsTokenSTRING() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(64);
        ScriptOrFnNode scriptOrFnNode2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode2.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode1;
        tryFoldObjectPropAccessMethodArguments[2] = scriptOrFnNode2;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments));
        
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
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): True}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_LeftGetTypeNotEqualsTokenOBJECTLIT() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode1;
        tryFoldObjectPropAccessMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments));
        
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
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): True}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_IsAssignmentTarget() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(88);
        setField(parent, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(64);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[1] = node;
        tryFoldObjectPropAccessMethodArguments[2] = scriptOrFnNode1;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments));
        
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
        
        Node scriptOrFnNodeParent = scriptOrFnNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        int scriptOrFnNodeParentType = scriptOrFnNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(scriptOrFnNodeParentType, actualParentType);
        
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        Node scriptOrFnNodeParentFirst = ((Node) getFieldValue(scriptOrFnNodeParent, "com.google.javascript.rhino.Node", "first"));
        Node actualParentFirst = ((Node) getFieldValue(actualParent, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        assertTrue(deepEquals(scriptOrFnNodeParentFirst, actualParentFirst));
        
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): True}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_IsAssignmentTarget_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(102);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", functionNodeType, functionNodeType, functionNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = functionNode;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[2] = scriptOrFnNode1;
        FunctionNode actual = ((FunctionNode) tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments));
        
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
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): True}
 *  */
    @Test
    public void testTryFoldObjectPropAccess_IsAssignmentTarget_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(103);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", functionNodeType, functionNodeType, functionNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = functionNode;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[2] = scriptOrFnNode1;
        FunctionNode actual = ((FunctionNode) tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments));
        
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
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.executesCondition {@code (value == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ValueEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(93);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(148);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode1;
        tryFoldObjectPropAccessMethodArguments[2] = stringNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments));
        
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
        
        Node scriptOrFnNodeParent = scriptOrFnNode.getParent();
        Node actualParent = actual.getParent();
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        int scriptOrFnNodeParentType = scriptOrFnNodeParent.getType();
        int actualParentType = actualParent.getType();
        assertEquals(scriptOrFnNodeParentType, actualParentType);
        
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        assertTrue(deepEquals(scriptOrFnNodeParent, actualParent));
        Node actualParentParent = actualParent.getParent();
        assertNull(actualParentParent);
        
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: c.getString().equals(right.getString())
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldObjectPropAccess_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(86);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", nodeType, nodeType, nodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = node;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[2] = functionNode;
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: c.getString().equals(right.getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldObjectPropAccess_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(96);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode2.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode1;
        tryFoldObjectPropAccessMethodArguments[2] = scriptOrFnNode2;
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: switch(c.getType()) case: default
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldObjectPropAccess_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(93);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", nodeType, nodeType, nodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = node;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[2] = stringNode;
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldObjectPropAccess(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldObjectPropAccess(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() != Token.OBJECTLIT || right.getType() != Token.STRING
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1327) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode1;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() != Token.OBJECTLIT || right.getType() != Token.STRING
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1327) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() != Token.OBJECTLIT || right.getType() != Token.STRING
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1327) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
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
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: c.getString().equals(right.getString())
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(96);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1342) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", nodeType, nodeType, nodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = node;
        tryFoldObjectPropAccessMethodArguments[1] = scriptOrFnNode;
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
 * @utbot.executesCondition {@code (left.getType() != Token.OBJECTLIT): False}
 * @utbot.executesCondition {@code (right.getType() != Token.STRING): False}
 * @utbot.executesCondition {@code (isAssignmentTarget(n)): False}
 * @utbot.iterates iterate the loop {@code for(Node c = left.getFirstChild(); c != null; c = c.getNext())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: mayHaveSideEffects(c.getFirstChild())
 *  */
    @Test
    public void testTryFoldObjectPropAccess_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = ((PeepholeFoldConstants) createInstance("com.google.javascript.jscomp.PeepholeFoldConstants"));
        NodeTraversal currentTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(currentTraversal, "com.google.javascript.jscomp.NodeTraversal", "compiler", compiler);
        setField(peepholeFoldConstants, "com.google.javascript.jscomp.AbstractPeepholeOptimization", "currentTraversal", currentTraversal);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(96);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first1);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.AbstractPeepholeOptimization.mayHaveSideEffects(AbstractPeepholeOptimization.java:118)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldObjectPropAccess(PeepholeFoldConstants.java:1358) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldObjectPropAccessMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldObjectPropAccess", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldObjectPropAccessMethod.setAccessible(true);
        java.lang.Object[] tryFoldObjectPropAccessMethodArguments = new java.lang.Object[3];
        tryFoldObjectPropAccessMethodArguments[0] = scriptOrFnNode;
        tryFoldObjectPropAccessMethodArguments[1] = node;
        tryFoldObjectPropAccessMethodArguments[2] = stringNode;
        try {
            tryFoldObjectPropAccessMethod.invoke(peepholeFoldConstants, tryFoldObjectPropAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAddConstantString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.STRING): False}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldAddConstantString_RightGetTypeNotEqualsTokenSTRING() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = scriptOrFnNode;
        tryFoldAddConstantStringMethodArguments[2] = functionNode;
        Node actual = ((Node) tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAddConstantString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.STRING): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.STRING
 *  */
    @Test
    public void testTryFoldAddConstantString_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString(PeepholeFoldConstants.java:620) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = scriptOrFnNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.STRING || right.getType() == Token.STRING
 *  */
    @Test
    public void testTryFoldAddConstantString_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldAddConstantString(PeepholeFoldConstants.java:619) */
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
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAddConstantString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.STRING): False}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldAddConstantString_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = scriptOrFnNode;
        tryFoldAddConstantStringMethodArguments[2] = functionNode;
        try {
            tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.STRING): False}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAddConstantString_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = scriptOrFnNode;
        tryFoldAddConstantStringMethodArguments[2] = functionNode;
        try {
            tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldAddConstantString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.STRING): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAddConstantString_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddConstantStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldAddConstantString", nodeType, nodeType, nodeType);
        tryFoldAddConstantStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddConstantStringMethodArguments = new java.lang.Object[3];
        tryFoldAddConstantStringMethodArguments[0] = ((Object) null);
        tryFoldAddConstantStringMethodArguments[1] = scriptOrFnNode;
        tryFoldAddConstantStringMethodArguments[2] = ((Object) null);
        try {
            tryFoldAddConstantStringMethod.invoke(peepholeFoldConstants, tryFoldAddConstantStringMethodArguments);
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
 * @utbot.executesCondition {@code (objectType.getType() != Token.NAME): False}
 * @utbot.executesCondition {@code (objectType.getString().equals("String")): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testTryFoldInForcedStringContext_NotObjectTypeGetStringEquals() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", nodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = node;
        Node actual = ((Node) tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments));
        
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
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (objectType.getType() != Token.NAME): True}
 *  */
    @Test
    public void testTryFoldInForcedStringContext_ObjectTypeGetTypeNotEqualsTokenNAME() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", scriptOrFnNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments));
        
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
        
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int scriptOrFnNodeFirstSourcePosition = scriptOrFnNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldInForcedStringContext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.NEW);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.NEW);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldInForcedStringContext_ThrowIllegalArgumentException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", scriptOrFnNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.NEW);): True}
 * @utbot.executesCondition {@code (objectType.getType() != Token.NAME): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: objectType.getString().equals("String")
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldInForcedStringContext_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", scriptOrFnNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldInForcedStringContext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.NEW);
 *  */
    @Test
    public void testTryFoldInForcedStringContext_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1173) */
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
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.NEW);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objectType.getType() != Token.NAME
 *  */
    @Test
    public void testTryFoldInForcedStringContext_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1176) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", scriptOrFnNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldInForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.NEW);): True}
 * @utbot.executesCondition {@code (objectType.getType() != Token.NAME): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objectType.getString().equals("String")
 *  */
    @Test
    public void testTryFoldInForcedStringContext_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldInForcedStringContext(PeepholeFoldConstants.java:1180) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldInForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldInForcedStringContext", scriptOrFnNodeType);
        tryFoldInForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] tryFoldInForcedStringContextMethodArguments = new java.lang.Object[1];
        tryFoldInForcedStringContextMethodArguments[0] = scriptOrFnNode;
        try {
            tryFoldInForcedStringContextMethod.invoke(peepholeFoldConstants, tryFoldInForcedStringContextMethodArguments);
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
 * @utbot.executesCondition {@code (left == null): True}
 *  */
    @Test
    public void testTryFoldBinaryOperator_LeftEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
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
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(subtree.getType()) case: default}
 *  */
    @Test
    public void testTryFoldBinaryOperator_RightNotEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(47);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
        int nodeFirstType = nodeFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nodeFirstType, actualFirstType);
        
        Node nodeFirstNext = nodeFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nodeFirstNext, actualFirstNext));
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
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldBinaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (right == null): True}
 *  */
    @Test
    public void testTryFoldBinaryOperator_RightEqualsNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
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
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        assertTrue(deepEquals(scriptOrFnNodeFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int scriptOrFnNodeFirstSourcePosition = scriptOrFnNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
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
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldBinaryOperator(PeepholeFoldConstants.java:87) */
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-155);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceOperandsForOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceOperandsForOp", scriptOrFnNodeType);
        tryReduceOperandsForOpMethod.setAccessible(true);
        java.lang.Object[] tryReduceOperandsForOpMethodArguments = new java.lang.Object[1];
        tryReduceOperandsForOpMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(97);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(39);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceOperandsForOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceOperandsForOp", scriptOrFnNodeType);
        tryReduceOperandsForOpMethod.setAccessible(true);
        java.lang.Object[] tryReduceOperandsForOpMethodArguments = new java.lang.Object[1];
        tryReduceOperandsForOpMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(25);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceOperandsForOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceOperandsForOp", scriptOrFnNodeType);
        tryReduceOperandsForOpMethod.setAccessible(true);
        java.lang.Object[] tryReduceOperandsForOpMethodArguments = new java.lang.Object[1];
        tryReduceOperandsForOpMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp(PeepholeFoldConstants.java:167) */
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(91);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryConvertToNumber(PeepholeFoldConstants.java:215)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryReduceOperandsForOp(PeepholeFoldConstants.java:186) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceOperandsForOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryReduceOperandsForOp", scriptOrFnNodeType);
        tryReduceOperandsForOpMethod.setAccessible(true);
        java.lang.Object[] tryReduceOperandsForOpMethodArguments = new java.lang.Object[1];
        tryReduceOperandsForOpMethodArguments[0] = scriptOrFnNode;
        try {
            tryReduceOperandsForOpMethod.invoke(peepholeFoldConstants, tryReduceOperandsForOpMethodArguments);
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", scriptOrFnNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType(PeepholeFoldConstants.java:1065) */
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(26);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(122);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:138)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:131)
            com.google.javascript.jscomp.PeepholeFoldConstants.getNormalizedNodeType(PeepholeFoldConstants.java:1067) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", scriptOrFnNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(26);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(39);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", scriptOrFnNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(26);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", scriptOrFnNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(26);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getNormalizedNodeTypeMethod = peepholeFoldConstantsClazz.getDeclaredMethod("getNormalizedNodeType", scriptOrFnNodeType);
        getNormalizedNodeTypeMethod.setAccessible(true);
        java.lang.Object[] getNormalizedNodeTypeMethodArguments = new java.lang.Object[1];
        getNormalizedNodeTypeMethodArguments[0] = scriptOrFnNode;
        try {
            getNormalizedNodeTypeMethod.invoke(peepholeFoldConstants, getNormalizedNodeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inForcedStringContext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n.getParent().getType() == Token.GETELEM && n.getParent().getLastChild() == n;}
 *  */
    @Test
    public void testInForcedStringContext_NGetParentGetTypeNotEqualsTokenGETELEMAndNGetParentGetLastChildNotEqualsN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", scriptOrFnNodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getParent().getLastChild() == n): True}
 * @utbot.returnsFrom {@code return n.getParent().getType() == Token.GETELEM && n.getParent().getLastChild() == n;}
 *  */
    @Test
    public void testInForcedStringContext_NGetParentGetLastChildEqualsN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(35);
        setField(parent, "com.google.javascript.rhino.Node", "last", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", nodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = node;
        boolean actual = ((Boolean) inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getParent().getLastChild() == n): False}
 * @utbot.returnsFrom {@code return n.getParent().getType() == Token.GETELEM && n.getParent().getLastChild() == n;}
 *  */
    @Test
    public void testInForcedStringContext_NGetParentGetLastChildNotEqualsN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(35);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", scriptOrFnNodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inForcedStringContext(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#inForcedStringContext(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.getParent().getType() == Token.GETELEM && n.getParent().getLastChild() == n;
 *  */
    @Test
    public void testInForcedStringContext_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext(PeepholeFoldConstants.java:1167) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return n.getParent().getType() == Token.GETELEM && n.getParent().getLastChild() == n;
 *  */
    @Test
    public void testInForcedStringContext_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.inForcedStringContext(PeepholeFoldConstants.java:1167) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inForcedStringContextMethod = peepholeFoldConstantsClazz.getDeclaredMethod("inForcedStringContext", scriptOrFnNodeType);
        inForcedStringContextMethod.setAccessible(true);
        java.lang.Object[] inForcedStringContextMethodArguments = new java.lang.Object[1];
        inForcedStringContextMethodArguments[0] = scriptOrFnNode;
        try {
            inForcedStringContextMethod.invoke(peepholeFoldConstants, inForcedStringContextMethodArguments);
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
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
        assertTrue(deepEquals(node, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal == TernaryValue.UNKNOWN): False}
 *  */
    @Test
    public void testTryFoldUnaryOperator_LeftValNotEqualsTernaryValueUNKNOWN() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-226);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(41);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", scriptOrFnNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments));
        
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
        
        int scriptOrFnNodeFirstSourcePosition = scriptOrFnNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(scriptOrFnNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node scriptOrFnNodeLast = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftVal == TernaryValue.UNKNOWN): False}
 *  */
    @Test
    public void testTryFoldUnaryOperator_LeftValNotEqualsTernaryValueUNKNOWN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(44);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", scriptOrFnNodeType);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = scriptOrFnNode;
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments));
        
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
        
        int scriptOrFnNodeFirstSourcePosition = scriptOrFnNodeFirst.getSourcePosition();
        int actualFirstSourcePosition = actualFirst.getSourcePosition();
        assertEquals(scriptOrFnNodeFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node scriptOrFnNodeLast = ((Node) getFieldValue(scriptOrFnNode, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        assertTrue(deepEquals(scriptOrFnNodeLast, actualLast));
        
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
        assertTrue(deepEquals(scriptOrFnNode, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldUnaryOperator(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.hasOneChild());
 *  */
    @Test
    public void testTryFoldUnaryOperator_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:316) */
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasOneChild()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getPureBooleanValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testTryFoldUnaryOperator_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(122);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getPureBooleanValue(NodeUtil.java:138)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldUnaryOperator(PeepholeFoldConstants.java:325) */
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
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
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
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
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: TernaryValue leftVal = NodeUtil.getPureBooleanValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldUnaryOperator_ThrowIllegalStateException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        
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
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: TernaryValue leftVal = NodeUtil.getPureBooleanValue(left);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldUnaryOperator_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        
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
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method tryFoldUnaryOperator(com.google.javascript.rhino.Node)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldUnaryOperator(com.google.javascript.rhino.Node)}
     */
    @Test
    public void testTryFoldUnaryOperator() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = new Node(29, -1, 0);
        node.setType(28);
        Node node1 = new Node(-1, node);
        node1.setType(524317);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class node1Type = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldUnaryOperatorMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldUnaryOperator", node1Type);
        tryFoldUnaryOperatorMethod.setAccessible(true);
        java.lang.Object[] tryFoldUnaryOperatorMethodArguments = new java.lang.Object[1];
        tryFoldUnaryOperatorMethodArguments[0] = node1;
        Node actual = ((Node) tryFoldUnaryOperatorMethod.invoke(peepholeFoldConstants, tryFoldUnaryOperatorMethodArguments));
        
        Node expected = ((Node) createInstance("com.google.javascript.rhino.Node"));
        expected.setType(524317);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(28);
        setField(first, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        setField(first, "com.google.javascript.rhino.Node", "parent", expected);
        setField(expected, "com.google.javascript.rhino.Node", "first", first);
        setField(expected, "com.google.javascript.rhino.Node", "last", first);
        setField(expected, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        
        int expectedType = expected.getType();
        int actualType = actual.getType();
        assertEquals(expectedType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node expectedFirst = ((Node) getFieldValue(expected, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int expectedFirstType = expectedFirst.getType();
        int actualFirstType = actualFirst.getType();
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
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.performArithmeticOp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method performArithmeticOp(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#performArithmeticOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testPerformArithmeticOp_ReturnNull() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method performArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("performArithmeticOp", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        performArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] performArithmeticOpMethodArguments = new java.lang.Object[3];
        performArithmeticOpMethodArguments[0] = -255;
        performArithmeticOpMethodArguments[1] = scriptOrFnNode;
        performArithmeticOpMethodArguments[2] = ((Object) null);
        Node actual = ((Node) performArithmeticOpMethod.invoke(peepholeFoldConstants, performArithmeticOpMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#performArithmeticOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testPerformArithmeticOp_ReturnNull_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(26);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method performArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("performArithmeticOp", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        performArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] performArithmeticOpMethodArguments = new java.lang.Object[3];
        performArithmeticOpMethodArguments[0] = -255;
        performArithmeticOpMethodArguments[1] = scriptOrFnNode;
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method performArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("performArithmeticOp", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        performArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] performArithmeticOpMethodArguments = new java.lang.Object[3];
        performArithmeticOpMethodArguments[0] = -255;
        performArithmeticOpMethodArguments[1] = scriptOrFnNode;
        performArithmeticOpMethodArguments[2] = ((Object) null);
        Node actual = ((Node) performArithmeticOpMethod.invoke(peepholeFoldConstants, performArithmeticOpMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method performArithmeticOp(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#performArithmeticOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Double lValObj = NodeUtil.getNumberValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPerformArithmeticOp_ThrowIllegalStateException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method performArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("performArithmeticOp", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        performArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] performArithmeticOpMethodArguments = new java.lang.Object[3];
        performArithmeticOpMethodArguments[0] = -255;
        performArithmeticOpMethodArguments[1] = scriptOrFnNode;
        performArithmeticOpMethodArguments[2] = ((Object) null);
        try {
            performArithmeticOpMethod.invoke(peepholeFoldConstants, performArithmeticOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#performArithmeticOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Double lValObj = NodeUtil.getNumberValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testPerformArithmeticOp_ThrowIllegalStateException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method performArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("performArithmeticOp", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        performArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] performArithmeticOpMethodArguments = new java.lang.Object[3];
        performArithmeticOpMethodArguments[0] = -255;
        performArithmeticOpMethodArguments[1] = scriptOrFnNode;
        performArithmeticOpMethodArguments[2] = ((Object) null);
        try {
            performArithmeticOpMethod.invoke(peepholeFoldConstants, performArithmeticOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#performArithmeticOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Double lValObj = NodeUtil.getNumberValue(left);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testPerformArithmeticOp_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method performArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("performArithmeticOp", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        performArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] performArithmeticOpMethodArguments = new java.lang.Object[3];
        performArithmeticOpMethodArguments[0] = -255;
        performArithmeticOpMethodArguments[1] = scriptOrFnNode;
        performArithmeticOpMethodArguments[2] = ((Object) null);
        try {
            performArithmeticOpMethod.invoke(peepholeFoldConstants, performArithmeticOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method performArithmeticOp(int, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#performArithmeticOp(int,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (opType == Token.ADD): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getNumberValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testPerformArithmeticOp_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.performArithmeticOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:736)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:723)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:719)
            com.google.javascript.jscomp.NodeUtil.getNumberValue(NodeUtil.java:279)
            com.google.javascript.jscomp.PeepholeFoldConstants.performArithmeticOp(PeepholeFoldConstants.java:668) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class intType = int.class;
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method performArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("performArithmeticOp", intType, scriptOrFnNodeType, scriptOrFnNodeType);
        performArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] performArithmeticOpMethodArguments = new java.lang.Object[3];
        performArithmeticOpMethodArguments[0] = -255;
        performArithmeticOpMethodArguments[1] = scriptOrFnNode;
        performArithmeticOpMethodArguments[2] = ((Object) null);
        try {
            performArithmeticOpMethod.invoke(peepholeFoldConstants, performArithmeticOpMethodArguments);
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Node node = new Node(-255);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmeticOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticOpMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticOpMethodArguments[0] = scriptOrFnNode;
        tryFoldArithmeticOpMethodArguments[1] = node;
        tryFoldArithmeticOpMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldArithmeticOpMethod.invoke(peepholeFoldConstants, tryFoldArithmeticOpMethodArguments));
        
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
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmeticOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldArithmeticOp_ReturnN_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Node node = new Node(29);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmeticOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticOpMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticOpMethodArguments[0] = scriptOrFnNode;
        tryFoldArithmeticOpMethodArguments[1] = node;
        tryFoldArithmeticOpMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldArithmeticOpMethod.invoke(peepholeFoldConstants, tryFoldArithmeticOpMethodArguments));
        
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
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmeticOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return n;}
 *  */
    @Test
    public void testTryFoldArithmeticOp_ReturnN_2() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(122);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(49);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmeticOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticOpMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticOpMethodArguments[0] = scriptOrFnNode;
        tryFoldArithmeticOpMethodArguments[1] = node;
        tryFoldArithmeticOpMethodArguments[2] = ((Object) null);
        ScriptOrFnNode actual = ((ScriptOrFnNode) tryFoldArithmeticOpMethod.invoke(peepholeFoldConstants, tryFoldArithmeticOpMethodArguments));
        
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
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldArithmeticOp(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldArithmeticOp(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node result = performArithmeticOp(n.getType(), left, right);
 *  */
    @Test
    public void testTryFoldArithmeticOp_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmeticOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldArithmeticOp(PeepholeFoldConstants.java:641) */
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
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Node node = new Node(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticOpMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldArithmeticOp", scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticOpMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticOpMethodArguments = new java.lang.Object[3];
        tryFoldArithmeticOpMethodArguments[0] = scriptOrFnNode;
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
    
    ///region Test suites for executable com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldChildAddString_NodeGetType() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(47);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = scriptOrFnNode;
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode1;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldChildAddString_NodeGetType_1() throws Exception  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(105);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = scriptOrFnNode;
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode1;
        Node actual = ((Node) tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_6() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:567) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_7() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:567) */
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_8() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(122);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(43);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:567) */
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_9() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:531)
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:589) */
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
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node lr = ll.getNext();
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(21);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:570) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = scriptOrFnNode;
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode1;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_2() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(124);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:567) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lr.getType() == Token.STRING
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_1() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(21);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:575) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = scriptOrFnNode;
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode1;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_3() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(47);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:567) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_4() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(47);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(63);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:567) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldChildAddString_ThrowNullPointerException_5() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(47);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PeepholeFoldConstants.tryFoldChildAddString(PeepholeFoldConstants.java:567) */
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldChildAddString(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link PeepholeFoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.PeepholeFoldConstants#tryFoldChildAddString(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: NodeUtil.isLiteralValue(right, false) && left.getType() == Token.ADD
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldChildAddString_ThrowUnsupportedOperationException() throws Throwable  {
        PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        Class peepholeFoldConstantsClazz = Class.forName("com.google.javascript.jscomp.PeepholeFoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldChildAddStringMethod = peepholeFoldConstantsClazz.getDeclaredMethod("tryFoldChildAddString", nodeType, nodeType, nodeType);
        tryFoldChildAddStringMethod.setAccessible(true);
        java.lang.Object[] tryFoldChildAddStringMethodArguments = new java.lang.Object[3];
        tryFoldChildAddStringMethodArguments[0] = ((Object) null);
        tryFoldChildAddStringMethodArguments[1] = ((Object) null);
        tryFoldChildAddStringMethodArguments[2] = scriptOrFnNode;
        try {
            tryFoldChildAddStringMethod.invoke(peepholeFoldConstants, tryFoldChildAddStringMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields915456964017800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields915456964017800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass915456964023200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields915456964017800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass915456964023200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields915456964361500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields915456964361500.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass915456964363300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields915456964361500.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass915456964363300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

