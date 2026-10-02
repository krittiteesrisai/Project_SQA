package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import java.util.ArrayDeque;
import java.util.LinkedList;
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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public final class com_google_javascript_jscomp_FoldConstantsTest {
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.error
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method error(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.jscomp.DiagnosticType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#error(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.getCompiler().report(JSError.make(t, n, diagnostic, n.toString()));
 *  */
    @Test
    public void testError_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.error] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.error(FoldConstants.java:385) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method errorMethod = foldConstantsClazz.getDeclaredMethod("error", nodeTraversalType, diagnosticTypeType, nodeType);
        errorMethod.setAccessible(true);
        java.lang.Object[] errorMethodArguments = new java.lang.Object[3];
        errorMethodArguments[0] = ((Object) null);
        errorMethodArguments[1] = ((Object) null);
        errorMethodArguments[2] = ((Object) null);
        try {
            errorMethod.invoke(foldConstants, errorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#error(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#toString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.getCompiler().report(JSError.make(t, n, diagnostic, n.toString()));
 *  */
    @Test
    public void testError_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.error] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.error(FoldConstants.java:385) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method errorMethod = foldConstantsClazz.getDeclaredMethod("error", nodeTraversalType, diagnosticTypeType, nodeType);
        errorMethod.setAccessible(true);
        java.lang.Object[] errorMethodArguments = new java.lang.Object[3];
        errorMethodArguments[0] = nodeTraversal;
        errorMethodArguments[1] = ((Object) null);
        errorMethodArguments[2] = ((Object) null);
        try {
            errorMethod.invoke(foldConstants, errorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_LeftEqualsNull() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left == null): False}
 * @utbot.executesCondition {@code (type == Token.TYPEOF): False}
 * @utbot.executesCondition {@code (type == Token.NOT): False}
 * @utbot.executesCondition {@code (type == Token.NEG): False}
 * @utbot.executesCondition {@code (type == Token.BITNOT): False}
 * @utbot.executesCondition {@code (type == Token.NEW): False}
 * @utbot.executesCondition {@code (type == Token.EXPR_RESULT): False}
 * @utbot.executesCondition {@code (type == Token.RETURN): False}
 * @utbot.executesCondition {@code (right == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_RightEqualsNull() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.visit(null, node, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = n.getType();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.visit(FoldConstants.java:91) */
        foldConstants.visit(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type == Token.NOT): False}
 * @utbot.executesCondition {@code (type == Token.NEG): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(29);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type == Token.NOT): False}
 * @utbot.executesCondition {@code (type == Token.NEG): False}
 * @utbot.executesCondition {@code (type == Token.BITNOT): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(27);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.visit(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type == Token.NOT): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.hasOneChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(26);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.visit(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeTraversal.traverse(compiler, jsRoot, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:426)
            com.google.javascript.jscomp.FoldConstants.process(FoldConstants.java:87) */
        foldConstants.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.isLowerPrecedenceInExpression
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isLowerPrecedenceInExpression(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isLowerPrecedenceInExpression(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new NodeTraversal(t.getCompiler(), new AbstractShallowCallback() {
 * 
 *     public void visit(NodeTraversal t, Node n, Node parent) {
 *         lower[0] |= NodeUtil.precedence(n.getType()) < precedence;
 *     }
 * }).traverse(n);
 *  */
    @Test
    public void testIsLowerPrecedenceInExpression_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.isLowerPrecedenceInExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.isLowerPrecedenceInExpression(FoldConstants.java:932) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method isLowerPrecedenceInExpressionMethod = foldConstantsClazz.getDeclaredMethod("isLowerPrecedenceInExpression", nodeTraversalType, nodeType, intType);
        isLowerPrecedenceInExpressionMethod.setAccessible(true);
        java.lang.Object[] isLowerPrecedenceInExpressionMethodArguments = new java.lang.Object[3];
        isLowerPrecedenceInExpressionMethodArguments[0] = ((Object) null);
        isLowerPrecedenceInExpressionMethodArguments[1] = ((Object) null);
        isLowerPrecedenceInExpressionMethodArguments[2] = -255;
        try {
            isLowerPrecedenceInExpressionMethod.invoke(foldConstants, isLowerPrecedenceInExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isLowerPrecedenceInExpression(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse
 *  */
    @Test
    public void testIsLowerPrecedenceInExpression_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.isLowerPrecedenceInExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.FoldConstants.isLowerPrecedenceInExpression(FoldConstants.java:936) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method isLowerPrecedenceInExpressionMethod = foldConstantsClazz.getDeclaredMethod("isLowerPrecedenceInExpression", nodeTraversalType, nodeType, intType);
        isLowerPrecedenceInExpressionMethod.setAccessible(true);
        java.lang.Object[] isLowerPrecedenceInExpressionMethodArguments = new java.lang.Object[3];
        isLowerPrecedenceInExpressionMethodArguments[0] = nodeTraversal;
        isLowerPrecedenceInExpressionMethodArguments[1] = ((Object) null);
        isLowerPrecedenceInExpressionMethodArguments[2] = -256;
        try {
            isLowerPrecedenceInExpressionMethod.invoke(foldConstants, isLowerPrecedenceInExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldLeftChildAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldLeftChildAdd(null, null, null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(64);
        
        foldConstants.tryFoldLeftChildAdd(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldLeftChildAdd(null, null, null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldLeftChildAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldLeftChildAdd", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldLeftChildAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldLeftChildAddMethodArguments = new java.lang.Object[5];
        tryFoldLeftChildAddMethodArguments[0] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[1] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[2] = ((Object) null);
        tryFoldLeftChildAddMethodArguments[3] = stringNode;
        tryFoldLeftChildAddMethodArguments[4] = ((Object) null);
        tryFoldLeftChildAddMethod.invoke(foldConstants, tryFoldLeftChildAddMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(21);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(64);
        
        foldConstants.tryFoldLeftChildAdd(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldLeftChildAdd_NodeGetType() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(21);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(47);
        
        foldConstants.tryFoldLeftChildAdd(null, null, scriptOrFnNode, functionNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldLeftChildAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldLeftChildAdd(FoldConstants.java:1021) */
        foldConstants.tryFoldLeftChildAdd(null, null, null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ThrowNullPointerException_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(29);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldLeftChildAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldLeftChildAdd(FoldConstants.java:1021) */
        foldConstants.tryFoldLeftChildAdd(null, null, null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ThrowNullPointerException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(47);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldLeftChildAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldLeftChildAdd(FoldConstants.java:1021) */
        foldConstants.tryFoldLeftChildAdd(null, null, null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left.getType() == Token.ADD
 *  */
    @Test
    public void testTryFoldLeftChildAdd_ThrowNullPointerException_3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldLeftChildAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldLeftChildAdd(FoldConstants.java:1021) */
        foldConstants.tryFoldLeftChildAdd(null, null, null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: NodeUtil.isLiteralValue(right) && left.getType() == Token.ADD && left.getChildCount() == 2
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldLeftChildAdd_ThrowUnsupportedOperationException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        foldConstants.tryFoldLeftChildAdd(null, null, null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLeftChildAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldLeftChildAdd_ThrowUnsupportedOperationException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(29);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldLeftChildAdd(null, null, null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldStringIndexOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldStringIndexOf_NotNodeUtilIsImmutableValue() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-255);
        
        foldConstants.tryFoldStringIndexOf(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldStringIndexOf_NodeUtilIsGetProp() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldStringIndexOf(null, null, scriptOrFnNode, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldStringIndexOf_NotNodeUtilIsImmutableValue_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(29);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldStringIndexOf(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (lstringNode.getType() != Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldStringIndexOf_LstringNodeGetTypeNotEqualsTokenSTRING() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(43);
        
        foldConstants.tryFoldStringIndexOf(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isGetProp(left)): True}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 *  */
    @Test
    public void testTryFoldStringIndexOf_NodeUtilIsImmutableValue() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringIndexOfMethod = foldConstantsClazz.getDeclaredMethod("tryFoldStringIndexOf", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldStringIndexOfMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringIndexOfMethodArguments = new java.lang.Object[5];
        tryFoldStringIndexOfMethodArguments[0] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[1] = ((Object) null);
        tryFoldStringIndexOfMethodArguments[2] = scriptOrFnNode;
        tryFoldStringIndexOfMethodArguments[3] = stringNode;
        tryFoldStringIndexOfMethodArguments[4] = ((Object) null);
        tryFoldStringIndexOfMethod.invoke(foldConstants, tryFoldStringIndexOfMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node functionName = lstringNode.getNext();
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldStringIndexOf(FoldConstants.java:1422) */
        foldConstants.tryFoldStringIndexOf(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lstringNode.getType() != Token.STRING): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (!functionName.getString().equals("indexOf") && !functionName.getString().equals("lastIndexOf"))
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldStringIndexOf(FoldConstants.java:1425) */
        foldConstants.tryFoldStringIndexOf(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lstringNode.getType() != Token.STRING): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (!functionName.getString().equals("indexOf") && !functionName.getString().equals("lastIndexOf"))
 *  */
    @Test
    public void testTryFoldStringIndexOf_ThrowNullPointerException_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldStringIndexOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldStringIndexOf(FoldConstants.java:1425) */
        foldConstants.tryFoldStringIndexOf(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isGetProp(left) || !NodeUtil.isImmutableValue(right)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringIndexOf_ThrowUnsupportedOperationException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(38);
        
        foldConstants.tryFoldStringIndexOf(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringIndexOf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isImmutableValue(right)): False}
 * @utbot.executesCondition {@code (lstringNode.getType() != Token.STRING): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: (!functionName.getString().equals("indexOf") && !functionName.getString().equals("lastIndexOf"))
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldStringIndexOf_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(44);
        
        foldConstants.tryFoldStringIndexOf(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.areValidRegexpFlags
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method areValidRegexpFlags(java.lang.String)
    
    @Test
    public void testAreValidRegexpFlags1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areValidRegexpFlagsMethod = foldConstantsClazz.getDeclaredMethod("areValidRegexpFlags", stringType);
        areValidRegexpFlagsMethod.setAccessible(true);
        java.lang.Object[] areValidRegexpFlagsMethodArguments = new java.lang.Object[1];
        areValidRegexpFlagsMethodArguments[0] = string;
        boolean actual = ((Boolean) areValidRegexpFlagsMethod.invoke(null, areValidRegexpFlagsMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method areValidRegexpFlags(java.lang.String)
    
    @Test
    public void testAreValidRegexpFlags2() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.areValidRegexpFlags] produces [java.lang.NullPointerException]
            java.base/java.util.regex.Matcher.getTextLength(Matcher.java:1769)
            java.base/java.util.regex.Matcher.reset(Matcher.java:415)
            java.base/java.util.regex.Matcher.<init>(Matcher.java:252)
            java.base/java.util.regex.Pattern.matcher(Pattern.java:1134)
            com.google.javascript.jscomp.FoldConstants.areValidRegexpFlags(FoldConstants.java:1691) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areValidRegexpFlagsMethod = foldConstantsClazz.getDeclaredMethod("areValidRegexpFlags", stringType);
        areValidRegexpFlagsMethod.setAccessible(true);
        java.lang.Object[] areValidRegexpFlagsMethodArguments = new java.lang.Object[1];
        areValidRegexpFlagsMethodArguments[0] = ((Object) null);
        try {
            areValidRegexpFlagsMethod.invoke(null, areValidRegexpFlagsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_NotNodeUtilIsStatementBlock() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, nodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = node;
        tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): False}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_LastTrueEqualsNull() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, nodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = node;
        tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): False}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_LastFalseEqualsNull() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(next, "com.google.javascript.rhino.Node", "last", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, scriptOrFnNodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = scriptOrFnNode;
        tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): False}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_NotCompilerAreNodesEqualForInlining() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options_ = options_;
        FoldConstants foldConstants = new FoldConstants(compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(-255);
        setField(next1, "com.google.javascript.rhino.Node", "last", last);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Node last1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last1.setType(254);
        setField(next, "com.google.javascript.rhino.Node", "last", last1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, functionNodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = functionNode;
        tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): False}
 * @utbot.iterates iterate the loop {@code } once
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_NotCompilerAreNodesEqualForInlining_1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options_ = options_;
        FoldConstants foldConstants = new FoldConstants(compiler);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(-256);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(next, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node last1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last1.setType(-256);
        setField(first, "com.google.javascript.rhino.Node", "last", last1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, functionNodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = functionNode;
        tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(n.getType() == Token.IF);
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements(FoldConstants.java:857) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, nodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = ((Object) null);
        try {
            tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() == Token.IF);): True}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !compiler.areNodesEqualForInlining(lastTrue, lastFalse)
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_ThrowNullPointerException_3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements(FoldConstants.java:876) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, nodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = node;
        try {
            tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() == Token.IF);): True}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node trueBranch = cond.getNext();
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements(FoldConstants.java:867) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, nodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = node;
        try {
            tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() == Token.IF);): True}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node falseBranch = trueBranch.getNext();
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_ThrowNullPointerException_2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements(FoldConstants.java:868) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, nodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = node;
        try {
            tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() == Token.IF);): True}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node trueBranch = cond.getNext();
 *  */
    @Test
    public void testTryRemoveRepeatedStatements_ThrowNullPointerException_4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(125);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements(FoldConstants.java:867) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, nodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = node;
        try {
            tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() == Token.IF);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(n.getType() == Token.IF);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryRemoveRepeatedStatements_ThrowIllegalStateException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, nodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = node;
        try {
            tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(n.getType() == Token.IF);): True}
 * @utbot.executesCondition {@code (!NodeUtil.isStatementBlock(parent)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isStatementBlock(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(falseBranch);
 *  */
    @Test(expected = NullPointerException.class)
    public void testTryRemoveRepeatedStatements_ThrowNullPointerException_5() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", next);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveRepeatedStatementsMethod = foldConstantsClazz.getDeclaredMethod("tryRemoveRepeatedStatements", nodeTraversalType, nodeType);
        tryRemoveRepeatedStatementsMethod.setAccessible(true);
        java.lang.Object[] tryRemoveRepeatedStatementsMethodArguments = new java.lang.Object[2];
        tryRemoveRepeatedStatementsMethodArguments[0] = ((Object) null);
        tryRemoveRepeatedStatementsMethodArguments[1] = node;
        try {
            tryRemoveRepeatedStatementsMethod.invoke(foldConstants, tryRemoveRepeatedStatementsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.consumesDanglingElse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method consumesDanglingElse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#consumesDanglingElse(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testConsumesDanglingElse_ReturnFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method consumesDanglingElseMethod = foldConstantsClazz.getDeclaredMethod("consumesDanglingElse", nodeType);
        consumesDanglingElseMethod.setAccessible(true);
        java.lang.Object[] consumesDanglingElseMethodArguments = new java.lang.Object[1];
        consumesDanglingElseMethodArguments[0] = node;
        boolean actual = ((Boolean) consumesDanglingElseMethod.invoke(foldConstants, consumesDanglingElseMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#consumesDanglingElse(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 *  */
    @Test
    public void testConsumesDanglingElse_NGetChildCountLessThan3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(108);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method consumesDanglingElseMethod = foldConstantsClazz.getDeclaredMethod("consumesDanglingElse", nodeType);
        consumesDanglingElseMethod.setAccessible(true);
        java.lang.Object[] consumesDanglingElseMethodArguments = new java.lang.Object[1];
        consumesDanglingElseMethodArguments[0] = node;
        boolean actual = ((Boolean) consumesDanglingElseMethod.invoke(foldConstants, consumesDanglingElseMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#consumesDanglingElse(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.iterates iterate the loop {@code } once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testConsumesDanglingElse_NodeGetLastChild() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method consumesDanglingElseMethod = foldConstantsClazz.getDeclaredMethod("consumesDanglingElse", scriptOrFnNodeType);
        consumesDanglingElseMethod.setAccessible(true);
        java.lang.Object[] consumesDanglingElseMethodArguments = new java.lang.Object[1];
        consumesDanglingElseMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) consumesDanglingElseMethod.invoke(foldConstants, consumesDanglingElseMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#consumesDanglingElse(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 *  */
    @Test
    public void testConsumesDanglingElse_NGetChildCountLessThan3_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method consumesDanglingElseMethod = foldConstantsClazz.getDeclaredMethod("consumesDanglingElse", functionNodeType);
        consumesDanglingElseMethod.setAccessible(true);
        java.lang.Object[] consumesDanglingElseMethodArguments = new java.lang.Object[1];
        consumesDanglingElseMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) consumesDanglingElseMethod.invoke(foldConstants, consumesDanglingElseMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method consumesDanglingElse(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#consumesDanglingElse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testConsumesDanglingElse_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.consumesDanglingElse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.consumesDanglingElse(FoldConstants.java:395) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method consumesDanglingElseMethod = foldConstantsClazz.getDeclaredMethod("consumesDanglingElse", nodeType);
        consumesDanglingElseMethod.setAccessible(true);
        java.lang.Object[] consumesDanglingElseMethodArguments = new java.lang.Object[1];
        consumesDanglingElseMethodArguments[0] = ((Object) null);
        try {
            consumesDanglingElseMethod.invoke(foldConstants, consumesDanglingElseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#consumesDanglingElse(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testConsumesDanglingElse_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(119);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.consumesDanglingElse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.consumesDanglingElse(FoldConstants.java:395) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method consumesDanglingElseMethod = foldConstantsClazz.getDeclaredMethod("consumesDanglingElse", nodeType);
        consumesDanglingElseMethod.setAccessible(true);
        java.lang.Object[] consumesDanglingElseMethodArguments = new java.lang.Object[1];
        consumesDanglingElseMethodArguments[0] = node;
        try {
            consumesDanglingElseMethod.invoke(foldConstants, consumesDanglingElseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#consumesDanglingElse(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code while(true)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testConsumesDanglingElse_ThrowNullPointerException_2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.consumesDanglingElse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.consumesDanglingElse(FoldConstants.java:395) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method consumesDanglingElseMethod = foldConstantsClazz.getDeclaredMethod("consumesDanglingElse", nodeType);
        consumesDanglingElseMethod.setAccessible(true);
        java.lang.Object[] consumesDanglingElseMethodArguments = new java.lang.Object[1];
        consumesDanglingElseMethodArguments[0] = node;
        try {
            consumesDanglingElseMethod.invoke(foldConstants, consumesDanglingElseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.isPropertyAssignmentInExpression
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPropertyAssignmentInExpression(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isPropertyAssignmentInExpression(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new NodeTraversal(t.getCompiler(), new AbstractShallowCallback() {
 * 
 *     public void visit(NodeTraversal t, Node n, Node parent) {
 *         found[0] |= (n.getType() == Token.GETPROP && parent.getType() == Token.ASSIGN);
 *     }
 * }).traverse(n);
 *  */
    @Test
    public void testIsPropertyAssignmentInExpression_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.isPropertyAssignmentInExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.isPropertyAssignmentInExpression(FoldConstants.java:916) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyAssignmentInExpressionMethod = foldConstantsClazz.getDeclaredMethod("isPropertyAssignmentInExpression", nodeTraversalType, nodeType);
        isPropertyAssignmentInExpressionMethod.setAccessible(true);
        java.lang.Object[] isPropertyAssignmentInExpressionMethodArguments = new java.lang.Object[2];
        isPropertyAssignmentInExpressionMethodArguments[0] = ((Object) null);
        isPropertyAssignmentInExpressionMethodArguments[1] = ((Object) null);
        try {
            isPropertyAssignmentInExpressionMethod.invoke(foldConstants, isPropertyAssignmentInExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isPropertyAssignmentInExpression(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: traverse
 *  */
    @Test
    public void testIsPropertyAssignmentInExpression_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.isPropertyAssignmentInExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:234)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:256)
            com.google.javascript.jscomp.FoldConstants.isPropertyAssignmentInExpression(FoldConstants.java:921) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyAssignmentInExpressionMethod = foldConstantsClazz.getDeclaredMethod("isPropertyAssignmentInExpression", nodeTraversalType, nodeType);
        isPropertyAssignmentInExpressionMethod.setAccessible(true);
        java.lang.Object[] isPropertyAssignmentInExpressionMethodArguments = new java.lang.Object[2];
        isPropertyAssignmentInExpressionMethodArguments[0] = nodeTraversal;
        isPropertyAssignmentInExpressionMethodArguments[1] = ((Object) null);
        try {
            isPropertyAssignmentInExpressionMethod.invoke(foldConstants, isPropertyAssignmentInExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.isReturnExpressBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isReturnExpressBlock(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isReturnExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsReturnExpressBlock_NGetTypeNotEqualsTokenBLOCK() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReturnExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isReturnExpressBlock", nodeType);
        isReturnExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isReturnExpressBlockMethodArguments = new java.lang.Object[1];
        isReturnExpressBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isReturnExpressBlockMethod.invoke(foldConstants, isReturnExpressBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isReturnExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): True}
 * @utbot.executesCondition {@code (n.hasOneChild()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsReturnExpressBlock_NotNHasOneChild() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(125);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReturnExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isReturnExpressBlock", nodeType);
        isReturnExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isReturnExpressBlockMethodArguments = new java.lang.Object[1];
        isReturnExpressBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isReturnExpressBlockMethod.invoke(foldConstants, isReturnExpressBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isReturnExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): True}
 * @utbot.executesCondition {@code (n.hasOneChild()): True}
 * @utbot.executesCondition {@code (first.getType() == Token.RETURN): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsReturnExpressBlock_FirstGetTypeNotEqualsTokenRETURN() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReturnExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isReturnExpressBlock", nodeType);
        isReturnExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isReturnExpressBlockMethodArguments = new java.lang.Object[1];
        isReturnExpressBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isReturnExpressBlockMethod.invoke(foldConstants, isReturnExpressBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isReturnExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): True}
 * @utbot.executesCondition {@code (n.hasOneChild()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsReturnExpressBlock_NotNHasOneChild_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReturnExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isReturnExpressBlock", functionNodeType);
        isReturnExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isReturnExpressBlockMethodArguments = new java.lang.Object[1];
        isReturnExpressBlockMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isReturnExpressBlockMethod.invoke(foldConstants, isReturnExpressBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isReturnExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): True}
 * @utbot.executesCondition {@code (n.hasOneChild()): True}
 * @utbot.executesCondition {@code (first.getType() == Token.RETURN): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasOneChild()}
 * @utbot.returnsFrom {@code return first.hasOneChild();}
 *  */
    @Test
    public void testIsReturnExpressBlock_FirstGetTypeEqualsTokenRETURN() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(4);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReturnExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isReturnExpressBlock", nodeType);
        isReturnExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isReturnExpressBlockMethodArguments = new java.lang.Object[1];
        isReturnExpressBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isReturnExpressBlockMethod.invoke(foldConstants, isReturnExpressBlockMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isReturnExpressBlock(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isReturnExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.BLOCK
 *  */
    @Test
    public void testIsReturnExpressBlock_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.isReturnExpressBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.isReturnExpressBlock(FoldConstants.java:1979) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isReturnExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isReturnExpressBlock", nodeType);
        isReturnExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isReturnExpressBlockMethodArguments = new java.lang.Object[1];
        isReturnExpressBlockMethodArguments[0] = ((Object) null);
        try {
            isReturnExpressBlockMethod.invoke(foldConstants, isReturnExpressBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldForCondition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldForCondition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldForCondition() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldForCondition_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(41);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldForCondition_3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -0.0);
        (((Node) numberNode)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", numberNodeType, numberNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = numberNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldForCondition_4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(47);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldForCondition_5() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(29);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldForCondition_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", stringNodeType, stringNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = stringNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldForCondition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, new Node(Token.EMPTY));
 *  */
    @Test
    public void testTryFoldForCondition_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldForCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldForCondition(FoldConstants.java:1933) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        try {
            tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, new Node(Token.EMPTY));
 *  */
    @Test
    public void testTryFoldForCondition_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldForCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldForCondition(FoldConstants.java:1933) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        try {
            tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, new Node(Token.EMPTY));
 *  */
    @Test
    public void testTryFoldForCondition_ThrowNullPointerException_2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldForCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldForCondition(FoldConstants.java:1933) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", stringNodeType, stringNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = stringNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        try {
            tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, new Node(Token.EMPTY));
 *  */
    @Test
    public void testTryFoldForCondition_ThrowNullPointerException_3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(47);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldForCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldForCondition(FoldConstants.java:1933) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        try {
            tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldForCondition(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: NodeUtil.isLiteralValue(n)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldForCondition_ThrowUnsupportedOperationException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        try {
            tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: boolean result = NodeUtil.getBooleanValue(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldForCondition_ThrowIllegalStateException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        try {
            tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldForCondition(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: boolean result = NodeUtil.getBooleanValue(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldForCondition_ThrowIllegalStateException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldForConditionMethod = foldConstantsClazz.getDeclaredMethod("tryFoldForCondition", scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldForConditionMethod.setAccessible(true);
        java.lang.Object[] tryFoldForConditionMethodArguments = new java.lang.Object[2];
        tryFoldForConditionMethodArguments[0] = scriptOrFnNode;
        tryFoldForConditionMethodArguments[1] = ((Object) null);
        try {
            tryFoldForConditionMethod.invoke(foldConstants, tryFoldForConditionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.makeForwardSlashBracketSafe
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = foldConstantsClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} once
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_SwitchSCharAtICase() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\\";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = foldConstantsClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.iterates iterate the loop {@code for(int i = 0; i < s.length(); ++i)} once
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_SwitchSCharAtICasedefault() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = foldConstantsClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        Object actual = makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        
        Object expected = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(expected, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String s = n.getString();
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.makeForwardSlashBracketSafe] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.makeForwardSlashBracketSafe(FoldConstants.java:1710) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = foldConstantsClazz.getDeclaredMethod("makeForwardSlashBracketSafe", nodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = ((Object) null);
        try {
            makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(int i = 0; i < s.length(); ++i)
 *  */
    @Test
    public void testMakeForwardSlashBracketSafe_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.makeForwardSlashBracketSafe] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.makeForwardSlashBracketSafe(FoldConstants.java:1714) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = foldConstantsClazz.getDeclaredMethod("makeForwardSlashBracketSafe", stringNodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = stringNode;
        try {
            makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String s = n.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMakeForwardSlashBracketSafe_ThrowUnsupportedOperationException() throws Throwable  {
        Node node = new Node(0);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = foldConstantsClazz.getDeclaredMethod("makeForwardSlashBracketSafe", nodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = node;
        try {
            makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#makeForwardSlashBracketSafe(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String s = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMakeForwardSlashBracketSafe_ThrowIllegalStateException() throws Throwable  {
        Node node = new Node(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method makeForwardSlashBracketSafeMethod = foldConstantsClazz.getDeclaredMethod("makeForwardSlashBracketSafe", nodeType);
        makeForwardSlashBracketSafeMethod.setAccessible(true);
        java.lang.Object[] makeForwardSlashBracketSafeMethodArguments = new java.lang.Object[1];
        makeForwardSlashBracketSafeMethodArguments[0] = node;
        try {
            makeForwardSlashBracketSafeMethod.invoke(null, makeForwardSlashBracketSafeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.getBlockReturnExpression
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBlockReturnExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockReturnExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.FoldConstants#isReturnExpressBlock(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return n.getFirstChild().getFirstChild();}
 *  */
    @Test
    public void testGetBlockReturnExpression_NodeGetFirstChild() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(4);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockReturnExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockReturnExpression", nodeType);
        getBlockReturnExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockReturnExpressionMethodArguments = new java.lang.Object[1];
        getBlockReturnExpressionMethodArguments[0] = node;
        ScriptOrFnNode actual = ((ScriptOrFnNode) getBlockReturnExpressionMethod.invoke(foldConstants, getBlockReturnExpressionMethodArguments));
        
        int firstEncodedSourceStart = first.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(firstEncodedSourceStart, actualEncodedSourceStart);
        
        int firstEncodedSourceEnd = first.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(firstEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int firstBaseLineno = first.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(firstBaseLineno, actualBaseLineno);
        
        int firstEndLineno = first.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(firstEndLineno, actualEndLineno);
        
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
        
        int firstVarStart = ((Integer) getFieldValue(first, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(firstVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int firstType = first.getType();
        int actualType = actual.getType();
        assertEquals(firstType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node firstFirst = ((Node) getFieldValue(first, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        Node firstFirstLast = ((Node) getFieldValue(firstFirst, "com.google.javascript.rhino.Node", "last"));
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        assertTrue(deepEquals(firstFirstLast, actualFirstLast));
        Object actualFirstLastPropListHead = getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstLastPropListHead);
        
        int firstFirstLastSourcePosition = ((Integer) getFieldValue(firstFirstLast, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstLastSourcePosition = ((Integer) getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(firstFirstLastSourcePosition, actualFirstLastSourcePosition);
        
        JSType actualFirstLastJsType = ((JSType) getFieldValue(actualFirstLast, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstLastJsType);
        
        Node actualFirstLastParent = actualFirstLast.getParent();
        assertNull(actualFirstLastParent);
        
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        assertTrue(deepEquals(firstFirst, actualFirst));
        
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBlockReturnExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockReturnExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.FoldConstants#isReturnExpressBlock(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(isReturnExpressBlock(n));
 *  */
    @Test
    public void testGetBlockReturnExpression_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.getBlockReturnExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.isReturnExpressBlock(FoldConstants.java:1979)
            com.google.javascript.jscomp.FoldConstants.getBlockReturnExpression(FoldConstants.java:1995) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockReturnExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockReturnExpression", nodeType);
        getBlockReturnExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockReturnExpressionMethodArguments = new java.lang.Object[1];
        getBlockReturnExpressionMethodArguments[0] = ((Object) null);
        try {
            getBlockReturnExpressionMethod.invoke(foldConstants, getBlockReturnExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getBlockReturnExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockReturnExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isReturnExpressBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockReturnExpression_ThrowIllegalStateException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockReturnExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockReturnExpression", nodeType);
        getBlockReturnExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockReturnExpressionMethodArguments = new java.lang.Object[1];
        getBlockReturnExpressionMethodArguments[0] = node;
        try {
            getBlockReturnExpressionMethod.invoke(foldConstants, getBlockReturnExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockReturnExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isReturnExpressBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockReturnExpression_ThrowIllegalStateException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(125);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockReturnExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockReturnExpression", nodeType);
        getBlockReturnExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockReturnExpressionMethodArguments = new java.lang.Object[1];
        getBlockReturnExpressionMethodArguments[0] = node;
        try {
            getBlockReturnExpressionMethod.invoke(foldConstants, getBlockReturnExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockReturnExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isReturnExpressBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockReturnExpression_ThrowIllegalStateException_4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockReturnExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockReturnExpression", nodeType);
        getBlockReturnExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockReturnExpressionMethodArguments = new java.lang.Object[1];
        getBlockReturnExpressionMethodArguments[0] = node;
        try {
            getBlockReturnExpressionMethod.invoke(foldConstants, getBlockReturnExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockReturnExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isReturnExpressBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockReturnExpression_ThrowIllegalStateException_2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockReturnExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockReturnExpression", functionNodeType);
        getBlockReturnExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockReturnExpressionMethodArguments = new java.lang.Object[1];
        getBlockReturnExpressionMethodArguments[0] = functionNode;
        try {
            getBlockReturnExpressionMethod.invoke(foldConstants, getBlockReturnExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockReturnExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isReturnExpressBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockReturnExpression_ThrowIllegalStateException_3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(4);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockReturnExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockReturnExpression", nodeType);
        getBlockReturnExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockReturnExpressionMethodArguments = new java.lang.Object[1];
        getBlockReturnExpressionMethodArguments[0] = node;
        try {
            getBlockReturnExpressionMethod.invoke(foldConstants, getBlockReturnExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(n)): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeCondition_NotNodeUtilIsLiteralValue() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryMinimizeCondition(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(n)): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeCondition_NotNodeUtilIsLiteralValue_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(64);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryMinimizeCondition(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testTryMinimizeCondition_SwitchNGetTypeCasedefault() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(100);
        
        foldConstants.tryMinimizeCondition(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(n)): True}
 * @utbot.executesCondition {@code (result): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getBooleanValue(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.FoldConstants#maybeReplaceChildWithNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeCondition_Result() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 1.0);
        (((Node) numberNode)).setType(63);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeConditionMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeCondition", nodeTraversalType, numberNodeType, numberNodeType);
        tryMinimizeConditionMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeConditionMethodArguments = new java.lang.Object[3];
        tryMinimizeConditionMethodArguments[0] = ((Object) null);
        tryMinimizeConditionMethodArguments[1] = numberNode;
        tryMinimizeConditionMethodArguments[2] = ((Object) null);
        tryMinimizeConditionMethod.invoke(foldConstants, tryMinimizeConditionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(n)): True}
 * @utbot.executesCondition {@code (result): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maybeReplaceChildWithNumber(t, n, parent, equivalentResult);
 *  */
    @Test
    public void testTryMinimizeCondition_ThrowNullPointerException_8() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.maybeReplaceChildWithNumber(FoldConstants.java:1947)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition(FoldConstants.java:1913) */
        foldConstants.tryMinimizeCondition(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTryMinimizeCondition_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition(FoldConstants.java:1863) */
        foldConstants.tryMinimizeCondition(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(first.getType())
 *  */
    @Test
    public void testTryMinimizeCondition_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(26);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition(FoldConstants.java:1866) */
        foldConstants.tryMinimizeCondition(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (NodeUtil.isLiteralValue(n)): True}
 * @utbot.executesCondition {@code (result): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: maybeReplaceChildWithNumber(t, n, parent, equivalentResult);
 *  */
    @Test
    public void testTryMinimizeCondition_ThrowNullPointerException_7() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 4.9E-324);
        (((Node) numberNode)).setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.maybeReplaceChildWithNumber(FoldConstants.java:1947)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition(FoldConstants.java:1913) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeConditionMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeCondition", nodeTraversalType, numberNodeType, numberNodeType);
        tryMinimizeConditionMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeConditionMethodArguments = new java.lang.Object[3];
        tryMinimizeConditionMethodArguments[0] = ((Object) null);
        tryMinimizeConditionMethodArguments[1] = numberNode;
        tryMinimizeConditionMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeConditionMethod.invoke(foldConstants, tryMinimizeConditionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newRoot);
 *  */
    @Test
    public void testTryMinimizeCondition_ThrowNullPointerException_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(26);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(26);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition(FoldConstants.java:1869) */
        foldConstants.tryMinimizeCondition(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (leftParent.getType() != Token.NOT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: rightParent.getType() != Token.NOT
 *  */
    @Test
    public void testTryMinimizeCondition_ThrowNullPointerException_6() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(26);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(101);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(26);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition(FoldConstants.java:1882) */
        foldConstants.tryMinimizeCondition(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: leftParent.getType() != Token.NOT || rightParent.getType() != Token.NOT
 *  */
    @Test
    public void testTryMinimizeCondition_ThrowNullPointerException_3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(26);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(101);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition(FoldConstants.java:1881) */
        foldConstants.tryMinimizeCondition(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newRoot);
 *  */
    @Test
    public void testTryMinimizeCondition_ThrowNullPointerException_4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(26);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(26);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition(FoldConstants.java:1869) */
        foldConstants.tryMinimizeCondition(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newRoot);
 *  */
    @Test
    public void testTryMinimizeCondition_ThrowNullPointerException_5() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(26);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(26);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeCondition(FoldConstants.java:1869) */
        foldConstants.tryMinimizeCondition(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeCondition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: NodeUtil.isLiteralValue(n)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryMinimizeCondition_ThrowUnsupportedOperationException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        foldConstants.tryMinimizeCondition(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.containsUnicodeEscape
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method containsUnicodeEscape(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#containsUnicodeEscape(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodeGenerator#regexpEscape(java.lang.String)}
 * @utbot.iterates iterate the loop {@code for(int i = -1; (i = esc.indexOf("\\u", i + 1)) >= 0; )} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testContainsUnicodeEscape_CodeGeneratorRegexpEscape() {
        String string = "";
        
        boolean actual = FoldConstants.containsUnicodeEscape(string);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region FUZZER: SUCCESSFUL EXECUTIONS for method containsUnicodeEscape(java.lang.String)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.FoldConstants}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#containsUnicodeEscape(java.lang.String)}
     */
    @Test
    public void testContainsUnicodeEscapeReturnsFalseWithNonEmptyString() {
        boolean actual = FoldConstants.containsUnicodeEscape("XZb");
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.maybeReplaceChildWithNumber
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeReplaceChildWithNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#maybeReplaceChildWithNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newNumber(double)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isEquivalentTo(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testMaybeReplaceChildWithNumber_NodeIsEquivalentTo() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -256.0);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method maybeReplaceChildWithNumberMethod = foldConstantsClazz.getDeclaredMethod("maybeReplaceChildWithNumber", nodeTraversalType, numberNodeType, numberNodeType, intType);
        maybeReplaceChildWithNumberMethod.setAccessible(true);
        java.lang.Object[] maybeReplaceChildWithNumberMethodArguments = new java.lang.Object[4];
        maybeReplaceChildWithNumberMethodArguments[0] = ((Object) null);
        maybeReplaceChildWithNumberMethodArguments[1] = numberNode;
        maybeReplaceChildWithNumberMethodArguments[2] = ((Object) null);
        maybeReplaceChildWithNumberMethodArguments[3] = -256;
        maybeReplaceChildWithNumberMethod.invoke(foldConstants, maybeReplaceChildWithNumberMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeReplaceChildWithNumber(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#maybeReplaceChildWithNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newNode);
 *  */
    @Test
    public void testMaybeReplaceChildWithNumber_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -1.78179742575772E-308);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.maybeReplaceChildWithNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.maybeReplaceChildWithNumber(FoldConstants.java:1947) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method maybeReplaceChildWithNumberMethod = foldConstantsClazz.getDeclaredMethod("maybeReplaceChildWithNumber", nodeTraversalType, numberNodeType, numberNodeType, intType);
        maybeReplaceChildWithNumberMethod.setAccessible(true);
        java.lang.Object[] maybeReplaceChildWithNumberMethodArguments = new java.lang.Object[4];
        maybeReplaceChildWithNumberMethodArguments[0] = ((Object) null);
        maybeReplaceChildWithNumberMethodArguments[1] = numberNode;
        maybeReplaceChildWithNumberMethodArguments[2] = ((Object) null);
        maybeReplaceChildWithNumberMethodArguments[3] = -206;
        try {
            maybeReplaceChildWithNumberMethod.invoke(foldConstants, maybeReplaceChildWithNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#maybeReplaceChildWithNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newNode);
 *  */
    @Test
    public void testMaybeReplaceChildWithNumber_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.maybeReplaceChildWithNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.maybeReplaceChildWithNumber(FoldConstants.java:1947) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method maybeReplaceChildWithNumberMethod = foldConstantsClazz.getDeclaredMethod("maybeReplaceChildWithNumber", nodeTraversalType, nodeType, nodeType, intType);
        maybeReplaceChildWithNumberMethod.setAccessible(true);
        java.lang.Object[] maybeReplaceChildWithNumberMethodArguments = new java.lang.Object[4];
        maybeReplaceChildWithNumberMethodArguments[0] = ((Object) null);
        maybeReplaceChildWithNumberMethodArguments[1] = ((Object) null);
        maybeReplaceChildWithNumberMethodArguments[2] = ((Object) null);
        maybeReplaceChildWithNumberMethodArguments[3] = -255;
        try {
            maybeReplaceChildWithNumberMethod.invoke(foldConstants, maybeReplaceChildWithNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldLiteralConstructor
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldLiteralConstructor(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, int)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLiteralConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope.Var var = t.getScope().getVar(className);
 *  */
    @Test
    public void testTryFoldLiteralConstructor_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldLiteralConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldLiteralConstructor(FoldConstants.java:1746) */
        foldConstants.tryFoldLiteralConstructor(null, null, null, null, -255);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldLiteralConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope.Var var = t.getScope().getVar(className);
 *  */
    @Test
    public void testTryFoldLiteralConstructor_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldLiteralConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldLiteralConstructor(FoldConstants.java:1746) */
        foldConstants.tryFoldLiteralConstructor(nodeTraversal, null, null, null, -255);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldAssign
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!right.hasChildren()): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldAssign_RightHasChildren() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(86);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAssign", nodeTraversalType, nodeType, nodeType, nodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[4];
        tryFoldAssignMethodArguments[0] = ((Object) null);
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = ((Object) null);
        tryFoldAssignMethodArguments[3] = scriptOrFnNode;
        tryFoldAssignMethod.invoke(foldConstants, tryFoldAssignMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!right.hasChildren()): True}
 * @utbot.executesCondition {@code (right.getFirstChild().getNext() != right.getLastChild()): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldAssign_RightGetFirstChildGetNextNotEqualsRightGetLastChild() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAssign", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[4];
        tryFoldAssignMethodArguments[0] = ((Object) null);
        tryFoldAssignMethodArguments[1] = scriptOrFnNode;
        tryFoldAssignMethodArguments[2] = ((Object) null);
        tryFoldAssignMethodArguments[3] = scriptOrFnNode1;
        tryFoldAssignMethod.invoke(foldConstants, tryFoldAssignMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!right.hasChildren()): True}
 * @utbot.executesCondition {@code (right.getFirstChild().getNext() != right.getLastChild()): False}
 * @utbot.executesCondition {@code (NodeUtil.mayHaveSideEffects(left)): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldAssign_NodeUtilMayHaveSideEffects() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(86);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(49);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAssign", nodeTraversalType, nodeType, nodeType, nodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[4];
        tryFoldAssignMethodArguments[0] = ((Object) null);
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = scriptOrFnNode;
        tryFoldAssignMethodArguments[3] = scriptOrFnNode;
        tryFoldAssignMethod.invoke(foldConstants, tryFoldAssignMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.ASSIGN);
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAssign(FoldConstants.java:413) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAssign", nodeTraversalType, nodeType, nodeType, nodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[4];
        tryFoldAssignMethodArguments[0] = ((Object) null);
        tryFoldAssignMethodArguments[1] = ((Object) null);
        tryFoldAssignMethodArguments[2] = ((Object) null);
        tryFoldAssignMethodArguments[3] = ((Object) null);
        try {
            tryFoldAssignMethod.invoke(foldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.ASSIGN);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !right.hasChildren() || right.getFirstChild().getNext() != right.getLastChild()
 *  */
    @Test
    public void testTryFoldAssign_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(86);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAssign(FoldConstants.java:416) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAssign", nodeTraversalType, nodeType, nodeType, nodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[4];
        tryFoldAssignMethodArguments[0] = ((Object) null);
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = ((Object) null);
        tryFoldAssignMethodArguments[3] = ((Object) null);
        try {
            tryFoldAssignMethod.invoke(foldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
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
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(86);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:356)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:343)
            com.google.javascript.jscomp.FoldConstants.tryFoldAssign(FoldConstants.java:422) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAssign", nodeTraversalType, nodeType, nodeType, nodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[4];
        tryFoldAssignMethodArguments[0] = ((Object) null);
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = ((Object) null);
        tryFoldAssignMethodArguments[3] = scriptOrFnNode;
        try {
            tryFoldAssignMethod.invoke(foldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.ASSIGN);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.ASSIGN);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldAssign_ThrowIllegalArgumentException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAssignMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAssign", nodeTraversalType, nodeType, nodeType, nodeType);
        tryFoldAssignMethod.setAccessible(true);
        java.lang.Object[] tryFoldAssignMethodArguments = new java.lang.Object[4];
        tryFoldAssignMethodArguments[0] = ((Object) null);
        tryFoldAssignMethodArguments[1] = node;
        tryFoldAssignMethodArguments[2] = ((Object) null);
        tryFoldAssignMethodArguments[3] = ((Object) null);
        try {
            tryFoldAssignMethod.invoke(foldConstants, tryFoldAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldBlock(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBlock(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldBlock_Return() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        foldConstants.tryFoldBlock(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBlock(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldBlock_Return_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        foldConstants.tryFoldBlock(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldBlock(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBlock(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node c = n.getFirstChild(); c != null; )
 *  */
    @Test
    public void testTryFoldBlock_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldBlock(FoldConstants.java:480) */
        foldConstants.tryFoldBlock(null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldBlock(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldBlock1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(71);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(49);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 37);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 37);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock5() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 42);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock6() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(39);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldBlock(null, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock7() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldBlock(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldBlock8() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(125);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldBlock(FoldConstants.java:484) */
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock9() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(86);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:356)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:451)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:343)
            com.google.javascript.jscomp.FoldConstants.tryFoldBlock(FoldConstants.java:482) */
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock10() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(47);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldBlock(FoldConstants.java:484) */
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock11() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(32);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldBlock(FoldConstants.java:484) */
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock12() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldBlock(FoldConstants.java:484) */
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock13() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(30);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 42);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:418)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:343)
            com.google.javascript.jscomp.FoldConstants.tryFoldBlock(FoldConstants.java:482) */
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock14() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldBlock(FoldConstants.java:484) */
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldBlock15() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(30);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:418)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:343)
            com.google.javascript.jscomp.FoldConstants.tryFoldBlock(FoldConstants.java:482) */
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldBlock(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBlock16() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBlockMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBlock", nodeTraversalType, functionNodeType, functionNodeType);
        tryFoldBlockMethod.setAccessible(true);
        java.lang.Object[] tryFoldBlockMethodArguments = new java.lang.Object[3];
        tryFoldBlockMethodArguments[0] = ((Object) null);
        tryFoldBlockMethodArguments[1] = functionNode;
        tryFoldBlockMethodArguments[2] = stringNode;
        try {
            tryFoldBlockMethod.invoke(foldConstants, tryFoldBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBlock17() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(105);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBlock18() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBlockMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBlock", nodeTraversalType, functionNodeType, functionNodeType);
        tryFoldBlockMethod.setAccessible(true);
        java.lang.Object[] tryFoldBlockMethodArguments = new java.lang.Object[3];
        tryFoldBlockMethodArguments[0] = ((Object) null);
        tryFoldBlockMethodArguments[1] = functionNode;
        tryFoldBlockMethodArguments[2] = stringNode;
        try {
            tryFoldBlockMethod.invoke(foldConstants, tryFoldBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryFoldBlock(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryFoldBlock19() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        foldConstants.tryFoldBlock(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldHookIf
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldHookIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldHookIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = n.getType();
 *  */
    @Test
    public void testTryFoldHookIf_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldHookIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldHookIf(FoldConstants.java:504) */
        foldConstants.tryFoldHookIf(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldHookIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thenBody = cond.getNext();
 *  */
    @Test
    public void testTryFoldHookIf_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldHookIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldHookIf(FoldConstants.java:506) */
        foldConstants.tryFoldHookIf(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldHookIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node elseBody = thenBody.getNext();
 *  */
    @Test
    public void testTryFoldHookIf_ThrowNullPointerException_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldHookIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldHookIf(FoldConstants.java:507) */
        foldConstants.tryFoldHookIf(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldHookIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldHookIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type == Token.IF): False}
 * @utbot.executesCondition {@code (Preconditions.checkState(type == Token.HOOK);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(type == Token.HOOK);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldHookIf_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldHookIf(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldHookIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldHookIf1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 42);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = foldConstants.tryFoldHookIf(nodeTraversal, node, null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testTryFoldHookIf2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = foldConstants.tryFoldHookIf(nodeTraversal, node, null);
        
        assertFalse(actual);
    }
    
    @Test
    public void testTryFoldHookIf3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(98);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldHookIfMethod = foldConstantsClazz.getDeclaredMethod("tryFoldHookIf", nodeTraversalType, functionNodeType, functionNodeType);
        tryFoldHookIfMethod.setAccessible(true);
        java.lang.Object[] tryFoldHookIfMethodArguments = new java.lang.Object[3];
        tryFoldHookIfMethodArguments[0] = ((Object) null);
        tryFoldHookIfMethodArguments[1] = functionNode;
        tryFoldHookIfMethodArguments[2] = stringNode;
        boolean actual = ((Boolean) tryFoldHookIfMethod.invoke(foldConstants, tryFoldHookIfMethodArguments));
        
        assertFalse(actual);
    }
    
    @Test
    public void testTryFoldHookIf4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(49);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        boolean actual = foldConstants.tryFoldHookIf(null, functionNode, null);
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldHookIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldHookIf5() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldHookIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldHookIf(FoldConstants.java:516) */
        foldConstants.tryFoldHookIf(nodeTraversal, node, null);
    }
    
    @Test
    public void testTryFoldHookIf6() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(101);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldHookIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldHookIf(FoldConstants.java:516) */
        foldConstants.tryFoldHookIf(nodeTraversal, node, null);
    }
    
    @Test
    public void testTryFoldHookIf7() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 42);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldHookIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:418)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:343)
            com.google.javascript.jscomp.FoldConstants.tryFoldHookIf(FoldConstants.java:513) */
        foldConstants.tryFoldHookIf(nodeTraversal, node, null);
    }
    
    @Test
    public void testTryFoldHookIf8() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldHookIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:418)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:343)
            com.google.javascript.jscomp.FoldConstants.tryFoldHookIf(FoldConstants.java:513) */
        foldConstants.tryFoldHookIf(nodeTraversal, node, null);
    }
    
    @Test
    public void testTryFoldHookIf9() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next1)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next1, "com.google.javascript.rhino.Node", "parent", parent);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldHookIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldHookIf(FoldConstants.java:516) */
        foldConstants.tryFoldHookIf(null, node, null);
    }
    
    @Test
    public void testTryFoldHookIf10() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldHookIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldHookIf(FoldConstants.java:539) */
        foldConstants.tryFoldHookIf(null, functionNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryMinimizeNot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(notChild.getType()) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testTryMinimizeNot_NodeGetType() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = ((Object) null);
        tryMinimizeNotMethodArguments[1] = scriptOrFnNode;
        tryMinimizeNotMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node notChild = n.getFirstChild();
 *  */
    @Test
    public void testTryMinimizeNot_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:628) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, nodeType, nodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = ((Object) null);
        tryMinimizeNotMethodArguments[1] = ((Object) null);
        tryMinimizeNotMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(notChild.getType())
 *  */
    @Test
    public void testTryMinimizeNot_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:631) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = ((Object) null);
        tryMinimizeNotMethodArguments[1] = scriptOrFnNode;
        tryMinimizeNotMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newOperator);
 *  */
    @Test
    public void testTryMinimizeNot_ThrowNullPointerException_2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(46);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, functionNodeType, functionNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = ((Object) null);
        tryMinimizeNotMethodArguments[1] = functionNode;
        tryMinimizeNotMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(notChild.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newOperator);
 *  */
    @Test
    public void testTryMinimizeNot_ThrowNullPointerException_4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(12);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, functionNodeType, functionNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = ((Object) null);
        tryMinimizeNotMethodArguments[1] = functionNode;
        tryMinimizeNotMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(notChild.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newOperator);
 *  */
    @Test
    public void testTryMinimizeNot_ThrowNullPointerException_5() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(13);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, functionNodeType, functionNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = ((Object) null);
        tryMinimizeNotMethodArguments[1] = functionNode;
        tryMinimizeNotMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(notChild.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newOperator);
 *  */
    @Test
    public void testTryMinimizeNot_ThrowNullPointerException_6() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(45);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, functionNodeType, functionNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = ((Object) null);
        tryMinimizeNotMethodArguments[1] = functionNode;
        tryMinimizeNotMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.replaceChild(n, newOperator);
 *  */
    @Test
    public void testTryMinimizeNot_ThrowNullPointerException_3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(46);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = ((Object) null);
        tryMinimizeNotMethodArguments[1] = scriptOrFnNode;
        tryMinimizeNotMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryMinimizeNot1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(45);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 8488);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, functionNodeType, functionNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = nodeTraversal;
        tryMinimizeNotMethodArguments[1] = functionNode;
        tryMinimizeNotMethodArguments[2] = stringNode;
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeNot2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(13);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = nodeTraversal;
        tryMinimizeNotMethodArguments[1] = scriptOrFnNode;
        tryMinimizeNotMethodArguments[2] = stringNode;
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeNot3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(13);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, functionNodeType, functionNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = nodeTraversal;
        tryMinimizeNotMethodArguments[1] = functionNode;
        tryMinimizeNotMethodArguments[2] = stringNode;
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeNot4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(12);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, nodeType, nodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = nodeTraversal;
        tryMinimizeNotMethodArguments[1] = node;
        tryMinimizeNotMethodArguments[2] = stringNode;
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeNot5() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(12);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, functionNodeType, functionNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = nodeTraversal;
        tryMinimizeNotMethodArguments[1] = functionNode;
        tryMinimizeNotMethodArguments[2] = stringNode;
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeNot6() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(13);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, numberNodeType, numberNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = nodeTraversal;
        tryMinimizeNotMethodArguments[1] = numberNode;
        tryMinimizeNotMethodArguments[2] = stringNode;
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeNot7() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(13);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, nodeType, nodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = nodeTraversal;
        tryMinimizeNotMethodArguments[1] = node;
        tryMinimizeNotMethodArguments[2] = stringNode;
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeNot8() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(12);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeNot] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeNot(FoldConstants.java:650) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = nodeTraversal;
        tryMinimizeNotMethodArguments[1] = scriptOrFnNode;
        tryMinimizeNotMethodArguments[2] = first;
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryMinimizeNot(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryMinimizeNot9() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(46);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeNotMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeNot", nodeTraversalType, functionNodeType, functionNodeType);
        tryMinimizeNotMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeNotMethodArguments = new java.lang.Object[3];
        tryMinimizeNotMethodArguments[0] = nodeTraversal;
        tryMinimizeNotMethodArguments[1] = functionNode;
        tryMinimizeNotMethodArguments[2] = stringNode;
        try {
            tryMinimizeNotMethod.invoke(foldConstants, tryMinimizeNotMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryReduceReturn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryReduceReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryReduceReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryReduceReturn() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(0);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryReduceReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(result.getType()) case: default}
 *  */
    @Test
    public void testTryReduceReturn_SwitchResultGetTypeCasedefault() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryReduceReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(result.getType()) case: default}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryReduceReturn_NodeUtilMayHaveSideEffects() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(122);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(49);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryReduceReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryReduceReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node result = n.getFirstChild();
 *  */
    @Test
    public void testTryReduceReturn_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryReduceReturn(FoldConstants.java:890) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = ((Object) null);
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryReduceReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#mayHaveSideEffects(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(result.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !NodeUtil.mayHaveSideEffects(operand)
 *  */
    @Test
    public void testTryReduceReturn_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(122);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:356)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:343)
            com.google.javascript.jscomp.FoldConstants.tryReduceReturn(FoldConstants.java:895) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryReduceReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryReduceReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(result.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String name = result.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryReduceReturn_ThrowUnsupportedOperationException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryReduceReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryReduceReturn1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(73);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, functionNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = functionNode;
        tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
    }
    
    @Test
    public void testTryReduceReturn2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 42);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, functionNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = functionNode;
        tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
    }
    
    @Test
    public void testTryReduceReturn3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, functionNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = functionNode;
        tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryReduceReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testTryReduceReturn4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, functionNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = functionNode;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTryReduceReturn5() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(42);
        setField(first1, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn6() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(64);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryReduceReturn(FoldConstants.java:897) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, functionNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = functionNode;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn7() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(105);
        setField(first1, "com.google.javascript.rhino.Node", "parent", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryReduceReturn(FoldConstants.java:897) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn8() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(94);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException] */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, functionNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = functionNode;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn9() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(37);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 42);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryReduceReturn(FoldConstants.java:897) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn10() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(30);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 42);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryReduceReturn(FoldConstants.java:897) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn11() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryReduceReturn(FoldConstants.java:897) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, functionNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = functionNode;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn12() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(30);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 42);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException] */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryReduceReturn13() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(30);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryReduceReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:418)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:343)
            com.google.javascript.jscomp.FoldConstants.tryReduceReturn(FoldConstants.java:895) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, functionNodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = functionNode;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryReduceReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryReduceReturn14() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(105);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryReduceReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryReduceReturn15() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(122);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(30);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryReduceReturnMethod = foldConstantsClazz.getDeclaredMethod("tryReduceReturn", nodeTraversalType, nodeType);
        tryReduceReturnMethod.setAccessible(true);
        java.lang.Object[] tryReduceReturnMethodArguments = new java.lang.Object[2];
        tryReduceReturnMethodArguments[0] = ((Object) null);
        tryReduceReturnMethodArguments[1] = node;
        try {
            tryReduceReturnMethod.invoke(foldConstants, tryReduceReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryMinimizeIf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIf_Return() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryMinimizeIf(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIf_Return_3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(125);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(next, "com.google.javascript.rhino.Node", "last", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryMinimizeIf(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIf_Return_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(125);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryMinimizeIf(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIf_Return_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(125);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryMinimizeIf(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node cond = n.getFirstChild();
 *  */
    @Test
    public void testTryMinimizeIf_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeIf(FoldConstants.java:659) */
        foldConstants.tryMinimizeIf(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thenBranch = cond.getNext();
 *  */
    @Test
    public void testTryMinimizeIf_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeIf(FoldConstants.java:660) */
        foldConstants.tryMinimizeIf(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryRemoveRepeatedStatements(t, n);
 *  */
    @Test
    public void testTryMinimizeIf_ThrowNullPointerException_4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(132);
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(next, "com.google.javascript.rhino.Node", "last", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", next);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryRemoveRepeatedStatements(FoldConstants.java:876)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeIf(FoldConstants.java:708) */
        foldConstants.tryMinimizeIf(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node elseBranch = thenBranch.getNext();
 *  */
    @Test
    public void testTryMinimizeIf_ThrowNullPointerException_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeIf(FoldConstants.java:661) */
        foldConstants.tryMinimizeIf(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes com.google.javascript.jscomp.FoldConstants#consumesDanglingElse(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} when: cond.getType() == Token.NOT && !consumesDanglingElse(elseBranch)
 *  */
    @Test
    public void testTryMinimizeIf_ThrowNullPointerException_3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(-255);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next1.setType(115);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", next);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.consumesDanglingElse(FoldConstants.java:395)
            com.google.javascript.jscomp.FoldConstants.tryMinimizeIf(FoldConstants.java:712) */
        foldConstants.tryMinimizeIf(null, node, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes com.google.javascript.jscomp.FoldConstants#tryRemoveRepeatedStatements(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tryRemoveRepeatedStatements(t, n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeIf_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryMinimizeIf(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryMinimizeIf1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options_ = options_;
        FoldConstants foldConstants = new FoldConstants(compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "last", last);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Object last1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last1)).setType(1);
        setField(next, "com.google.javascript.rhino.Node", "last", last1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeIfMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeIf", nodeTraversalType, numberNodeType, numberNodeType);
        tryMinimizeIfMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfMethodArguments = new java.lang.Object[3];
        tryMinimizeIfMethodArguments[0] = ((Object) null);
        tryMinimizeIfMethodArguments[1] = numberNode;
        tryMinimizeIfMethodArguments[2] = functionNode;
        tryMinimizeIfMethod.invoke(foldConstants, tryMinimizeIfMethodArguments);
    }
    
    @Test
    public void testTryMinimizeIf2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        options_.ambiguateProperties = true;
        compiler.options_ = options_;
        FoldConstants foldConstants = new FoldConstants(compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "last", next1);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(last, "com.google.javascript.rhino.Node", "first", next1);
        setField(next, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        foldConstants.tryMinimizeIf(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryMinimizeIf3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options_ = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options_ = options_;
        FoldConstants foldConstants = new FoldConstants(compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "last", next1);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(last, "com.google.javascript.rhino.Node", "first", next1);
        setField(next, "com.google.javascript.rhino.Node", "last", last);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        foldConstants.tryMinimizeIf(null, scriptOrFnNode, functionNode);
    }
    
    @Test
    public void testTryMinimizeIf4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(26);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(125);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next1)).setType(108);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next1, "com.google.javascript.rhino.Node", "first", first1);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", next2);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(0);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeIfMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeIf", nodeTraversalType, stringNodeType, stringNodeType);
        tryMinimizeIfMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfMethodArguments = new java.lang.Object[3];
        tryMinimizeIfMethodArguments[0] = ((Object) null);
        tryMinimizeIfMethodArguments[1] = stringNode;
        tryMinimizeIfMethodArguments[2] = node;
        tryMinimizeIfMethod.invoke(foldConstants, tryMinimizeIfMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryMinimizeIf5() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "parent", parent);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", next1);
        setField(first, "com.google.javascript.rhino.Node", "last", next1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeIf(FoldConstants.java:716) */
        foldConstants.tryMinimizeIf(null, functionNode, null);
    }
    
    @Test
    public void testTryMinimizeIf6() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeIf(FoldConstants.java:716) */
        foldConstants.tryMinimizeIf(nodeTraversal, scriptOrFnNode, node);
    }
    
    @Test
    public void testTryMinimizeIf7() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(26);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 40);
        setField(next1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", next1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryMinimizeIf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryMinimizeIf(FoldConstants.java:716) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeIfMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeIf", nodeTraversalType, stringNodeType, stringNodeType);
        tryMinimizeIfMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfMethodArguments = new java.lang.Object[3];
        tryMinimizeIfMethodArguments[0] = nodeTraversal;
        tryMinimizeIfMethodArguments[1] = stringNode;
        tryMinimizeIfMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeIfMethod.invoke(foldConstants, tryMinimizeIfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryMinimizeIf(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryMinimizeIf8() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(108);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(26);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryMinimizeIfMethod = foldConstantsClazz.getDeclaredMethod("tryMinimizeIf", nodeTraversalType, functionNodeType, functionNodeType);
        tryMinimizeIfMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfMethodArguments = new java.lang.Object[3];
        tryMinimizeIfMethodArguments[0] = nodeTraversal;
        tryMinimizeIfMethodArguments[1] = functionNode;
        tryMinimizeIfMethodArguments[2] = numberNode;
        try {
            tryMinimizeIfMethod.invoke(foldConstants, tryMinimizeIfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldAndOr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type == Token.OR): False}
 * @utbot.executesCondition {@code (!lval): False}
 * @utbot.executesCondition {@code (result != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getBooleanValue(com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldAndOr_ResultEqualsNull() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(64);
        
        foldConstants.tryFoldAndOr(null, functionNode, functionNode1, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int type = n.getType();
 *  */
    @Test
    public void testTryFoldAndOr_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAndOr(FoldConstants.java:947) */
        foldConstants.tryFoldAndOr(null, null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type == Token.OR): False}
 * @utbot.executesCondition {@code (!lval): False}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: n.removeChild(result);
 *  */
    @Test(expected = RuntimeException.class)
    public void testTryFoldAndOr_ThrowRuntimeException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(64);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        foldConstants.tryFoldAndOr(null, functionNode, functionNode1, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type == Token.OR): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: n.removeChild(result);
 *  */
    @Test(expected = RuntimeException.class)
    public void testTryFoldAndOr_ThrowRuntimeException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(64);
        
        foldConstants.tryFoldAndOr(null, functionNode, functionNode1, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldAndOr1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(41);
        
        foldConstants.tryFoldAndOr(null, functionNode, functionNode, null, null);
    }
    
    @Test
    public void testTryFoldAndOr2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(44);
        
        foldConstants.tryFoldAndOr(null, functionNode, functionNode, null, null);
    }
    
    @Test
    public void testTryFoldAndOr3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldAndOr(nodeTraversal, functionNode, functionNode, null, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldAndOr4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(47);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAndOr(FoldConstants.java:1000) */
        foldConstants.tryFoldAndOr(nodeTraversal, functionNode, functionNode1, first, null);
    }
    
    @Test
    public void testTryFoldAndOr5() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:207)
            com.google.javascript.jscomp.FoldConstants.tryFoldAndOr(FoldConstants.java:962) */
        foldConstants.tryFoldAndOr(nodeTraversal, functionNode, functionNode, null, null);
    }
    
    @Test
    public void testTryFoldAndOr6() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionNode next1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        next1.setType(64);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", next1);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryFoldAndOr(FoldConstants.java:1000) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAndOr", nodeTraversalType, stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[5];
        tryFoldAndOrMethodArguments[0] = nodeTraversal;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = next1;
        tryFoldAndOrMethodArguments[3] = ((Object) null);
        tryFoldAndOrMethodArguments[4] = numberNode;
        try {
            tryFoldAndOrMethod.invoke(foldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAndOr7() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(40);
        
        foldConstants.tryFoldAndOr(null, functionNode, functionNode, null, null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryFoldAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryFoldAndOr8() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next1, "com.google.javascript.rhino.Node", "next", first);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(47);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAndOr", nodeTraversalType, stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        tryFoldAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldAndOrMethodArguments = new java.lang.Object[5];
        tryFoldAndOrMethodArguments[0] = nodeTraversal;
        tryFoldAndOrMethodArguments[1] = stringNode;
        tryFoldAndOrMethodArguments[2] = functionNode;
        tryFoldAndOrMethodArguments[3] = ((Object) null);
        tryFoldAndOrMethodArguments[4] = ((Object) null);
        try {
            tryFoldAndOrMethod.invoke(foldConstants, tryFoldAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldArithmetic_RightGetTypeNotEqualsTokenNUMBER() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-255);
        
        foldConstants.tryFoldArithmetic(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldArithmetic_LeftGetTypeNotEqualsTokenNUMBER() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldArithmetic(null, null, scriptOrFnNode, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTryFoldArithmetic_ThrowNullPointerException_2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic(FoldConstants.java:1078) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = foldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[5];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = ((Object) null);
        tryFoldArithmeticMethodArguments[2] = numberNode;
        tryFoldArithmeticMethodArguments[3] = numberNode;
        tryFoldArithmeticMethodArguments[4] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(foldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldArithmetic_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic(FoldConstants.java:1073) */
        foldConstants.tryFoldArithmetic(null, null, scriptOrFnNode, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.NUMBER && right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldArithmetic_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic(FoldConstants.java:1072) */
        foldConstants.tryFoldArithmetic(null, null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double lval = left.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldArithmetic_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        foldConstants.tryFoldArithmetic(null, null, scriptOrFnNode, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double rval = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldArithmetic_ThrowIllegalStateException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = foldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[5];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = ((Object) null);
        tryFoldArithmeticMethodArguments[2] = numberNode;
        tryFoldArithmeticMethodArguments[3] = scriptOrFnNode;
        tryFoldArithmeticMethodArguments[4] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(foldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.Error} when: switch(n.getType()) case: default
 *  */
    @Test(expected = Error.class)
    public void testTryFoldArithmetic_ThrowError() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-230);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = foldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[5];
        tryFoldArithmeticMethodArguments[0] = ((Object) null);
        tryFoldArithmeticMethodArguments[1] = node;
        tryFoldArithmeticMethodArguments[2] = numberNode;
        tryFoldArithmeticMethodArguments[3] = numberNode1;
        tryFoldArithmeticMethodArguments[4] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(foldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldArithmetic(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldArithmetic1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(23);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic(FoldConstants.java:1102) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = foldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[5];
        tryFoldArithmeticMethodArguments[0] = nodeTraversal;
        tryFoldArithmeticMethodArguments[1] = scriptOrFnNode;
        tryFoldArithmeticMethodArguments[2] = numberNode;
        tryFoldArithmeticMethodArguments[3] = numberNode;
        tryFoldArithmeticMethodArguments[4] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(foldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArithmetic2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(24);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 2.0000000000000004);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic(FoldConstants.java:1102) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = foldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[5];
        tryFoldArithmeticMethodArguments[0] = nodeTraversal;
        tryFoldArithmeticMethodArguments[1] = scriptOrFnNode;
        tryFoldArithmeticMethodArguments[2] = numberNode;
        tryFoldArithmeticMethodArguments[3] = numberNode;
        tryFoldArithmeticMethodArguments[4] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(foldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArithmetic3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(22);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic(FoldConstants.java:1102) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = foldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[5];
        tryFoldArithmeticMethodArguments[0] = nodeTraversal;
        tryFoldArithmeticMethodArguments[1] = scriptOrFnNode;
        tryFoldArithmeticMethodArguments[2] = numberNode;
        tryFoldArithmeticMethodArguments[3] = numberNode;
        tryFoldArithmeticMethodArguments[4] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(foldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArithmetic4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(21);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic(FoldConstants.java:1102) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = foldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[5];
        tryFoldArithmeticMethodArguments[0] = nodeTraversal;
        tryFoldArithmeticMethodArguments[1] = scriptOrFnNode;
        tryFoldArithmeticMethodArguments[2] = numberNode;
        tryFoldArithmeticMethodArguments[3] = numberNode;
        tryFoldArithmeticMethodArguments[4] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(foldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldArithmetic5() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(24);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.error(FoldConstants.java:385)
            com.google.javascript.jscomp.FoldConstants.tryFoldArithmetic(FoldConstants.java:1090) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldArithmeticMethod = foldConstantsClazz.getDeclaredMethod("tryFoldArithmetic", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldArithmeticMethod.setAccessible(true);
        java.lang.Object[] tryFoldArithmeticMethodArguments = new java.lang.Object[5];
        tryFoldArithmeticMethodArguments[0] = nodeTraversal;
        tryFoldArithmeticMethodArguments[1] = scriptOrFnNode;
        tryFoldArithmeticMethodArguments[2] = numberNode;
        tryFoldArithmeticMethodArguments[3] = numberNode;
        tryFoldArithmeticMethodArguments[4] = ((Object) null);
        try {
            tryFoldArithmeticMethod.invoke(foldConstants, tryFoldArithmeticMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldShift
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldShift(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldShift(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldShift_RightGetTypeNotEqualsTokenNUMBER() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-255);
        
        foldConstants.tryFoldShift(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldShift(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldShift_LeftGetTypeNotEqualsTokenNUMBER() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldShift(null, null, scriptOrFnNode, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldShift(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldShift(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
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
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldShift(FoldConstants.java:1195) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = foldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[5];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = ((Object) null);
        tryFoldShiftMethodArguments[2] = numberNode;
        tryFoldShiftMethodArguments[3] = numberNode;
        tryFoldShiftMethodArguments[4] = ((Object) null);
        try {
            tryFoldShiftMethod.invoke(foldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldShift(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldShift_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldShift(FoldConstants.java:1162) */
        foldConstants.tryFoldShift(null, null, scriptOrFnNode, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldShift(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.NUMBER && right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldShift_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldShift(FoldConstants.java:1161) */
        foldConstants.tryFoldShift(null, null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldShift(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldShift(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double lval = left.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldShift_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        foldConstants.tryFoldShift(null, null, scriptOrFnNode, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldShift(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double rval = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldShift_ThrowIllegalStateException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = foldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[5];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = ((Object) null);
        tryFoldShiftMethodArguments[2] = numberNode;
        tryFoldShiftMethodArguments[3] = scriptOrFnNode;
        tryFoldShiftMethodArguments[4] = ((Object) null);
        try {
            tryFoldShiftMethod.invoke(foldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldShift(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldShift1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 2.9198649234497E-311);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", -0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.error(FoldConstants.java:385)
            com.google.javascript.jscomp.FoldConstants.tryFoldShift(FoldConstants.java:1185) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = foldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[5];
        tryFoldShiftMethodArguments[0] = ((Object) null);
        tryFoldShiftMethodArguments[1] = scriptOrFnNode;
        tryFoldShiftMethodArguments[2] = numberNode;
        tryFoldShiftMethodArguments[3] = numberNode1;
        tryFoldShiftMethodArguments[4] = numberNode;
        try {
            tryFoldShiftMethod.invoke(foldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldShift2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -4.9E-324);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 2.6815615859885194E154);
        (((Node) numberNode1)).setType(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.error(FoldConstants.java:385)
            com.google.javascript.jscomp.FoldConstants.tryFoldShift(FoldConstants.java:1178) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = foldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[5];
        tryFoldShiftMethodArguments[0] = nodeTraversal;
        tryFoldShiftMethodArguments[1] = ((Object) null);
        tryFoldShiftMethodArguments[2] = numberNode;
        tryFoldShiftMethodArguments[3] = numberNode1;
        tryFoldShiftMethodArguments[4] = functionNode;
        try {
            tryFoldShiftMethod.invoke(foldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldShift3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -4.9E-324);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode1)).setType(39);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.error(FoldConstants.java:385)
            com.google.javascript.jscomp.FoldConstants.tryFoldShift(FoldConstants.java:1178) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = foldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[5];
        tryFoldShiftMethodArguments[0] = nodeTraversal;
        tryFoldShiftMethodArguments[1] = node;
        tryFoldShiftMethodArguments[2] = numberNode;
        tryFoldShiftMethodArguments[3] = numberNode1;
        tryFoldShiftMethodArguments[4] = functionNode;
        try {
            tryFoldShiftMethod.invoke(foldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldShift4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldShift] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.error(FoldConstants.java:385)
            com.google.javascript.jscomp.FoldConstants.tryFoldShift(FoldConstants.java:1171) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldShiftMethod = foldConstantsClazz.getDeclaredMethod("tryFoldShift", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldShiftMethod.setAccessible(true);
        java.lang.Object[] tryFoldShiftMethodArguments = new java.lang.Object[5];
        tryFoldShiftMethodArguments[0] = nodeTraversal;
        tryFoldShiftMethodArguments[1] = scriptOrFnNode;
        tryFoldShiftMethodArguments[2] = numberNode;
        tryFoldShiftMethodArguments[3] = numberNode1;
        tryFoldShiftMethodArguments[4] = ((Object) null);
        try {
            tryFoldShiftMethod.invoke(foldConstants, tryFoldShiftMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldStringJoin_Return_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-255);
        
        foldConstants.tryFoldStringJoin(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldStringJoin_Return() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldStringJoin(null, null, scriptOrFnNode, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldStringJoin_Return_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(29);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldStringJoin(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldStringJoin_NodeGetType() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(43);
        
        foldConstants.tryFoldStringJoin(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node functionName = arrayNode.getNext();
 *  */
    @Test
    public void testTryFoldStringJoin_ThrowNullPointerException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin(FoldConstants.java:1468) */
        foldConstants.tryFoldStringJoin(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !functionName.getString().equals("join")
 *  */
    @Test
    public void testTryFoldStringJoin_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(63);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(43);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin(FoldConstants.java:1471) */
        foldConstants.tryFoldStringJoin(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldStringJoin1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldStringJoinMethod = foldConstantsClazz.getDeclaredMethod("tryFoldStringJoin", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldStringJoinMethod.setAccessible(true);
        java.lang.Object[] tryFoldStringJoinMethodArguments = new java.lang.Object[5];
        tryFoldStringJoinMethodArguments[0] = ((Object) null);
        tryFoldStringJoinMethodArguments[1] = ((Object) null);
        tryFoldStringJoinMethodArguments[2] = scriptOrFnNode;
        tryFoldStringJoinMethodArguments[3] = stringNode;
        tryFoldStringJoinMethodArguments[4] = ((Object) null);
        tryFoldStringJoinMethod.invoke(foldConstants, tryFoldStringJoinMethodArguments);
    }
    
    @Test
    public void testTryFoldStringJoin2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(43);
        
        foldConstants.tryFoldStringJoin(nodeTraversal, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldStringJoin3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(44);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin(FoldConstants.java:1468) */
        foldConstants.tryFoldStringJoin(nodeTraversal, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    @Test
    public void testTryFoldStringJoin4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(29);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:177)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:186)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:186)
            com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin(FoldConstants.java:1463) */
        foldConstants.tryFoldStringJoin(nodeTraversal, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    @Test
    public void testTryFoldStringJoin5() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(44);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldStringJoin(FoldConstants.java:1471) */
        foldConstants.tryFoldStringJoin(nodeTraversal, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldStringJoin(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringJoin6() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldStringJoin(nodeTraversal, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldStringJoin7() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(44);
        
        foldConstants.tryFoldStringJoin(nodeTraversal, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldBitAndOr
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldBitAndOr_RightGetTypeNotEqualsTokenNUMBER() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-255);
        
        foldConstants.tryFoldBitAndOr(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (lval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (rval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (rval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (lvalInt != lval): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldBitAndOr_LvalIntNotEqualsLval() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 3.479327083E-314);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 2.147483647E9);
        (((Node) numberNode1)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[5];
        tryFoldBitAndOrMethodArguments[0] = ((Object) null);
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        tryFoldBitAndOrMethodArguments[3] = numberNode1;
        tryFoldBitAndOrMethodArguments[4] = ((Object) null);
        tryFoldBitAndOrMethod.invoke(foldConstants, tryFoldBitAndOrMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (right.getType() == Token.NUMBER): True}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (lval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (rval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (rval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (lvalInt != lval): False}
 * @utbot.executesCondition {@code (rvalInt != rval): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldBitAndOr_RvalIntNotEqualsRval() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 524288.0);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 32.5041546901357);
        (((Node) numberNode1)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[5];
        tryFoldBitAndOrMethodArguments[0] = ((Object) null);
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        tryFoldBitAndOrMethodArguments[3] = numberNode1;
        tryFoldBitAndOrMethodArguments[4] = ((Object) null);
        tryFoldBitAndOrMethod.invoke(foldConstants, tryFoldBitAndOrMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): False}
 *  */
    @Test
    public void testTryFoldBitAndOr_LeftGetTypeNotEqualsTokenNUMBER() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldBitAndOr(null, null, scriptOrFnNode, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
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
    /// return from: {@code return;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldBitAndOr_LvalLessThanIntegerMIN_VALUE() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -4.294967296000001E9);
        (((Node) numberNode)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[5];
        tryFoldBitAndOrMethodArguments[0] = ((Object) null);
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        tryFoldBitAndOrMethodArguments[3] = numberNode;
        tryFoldBitAndOrMethodArguments[4] = ((Object) null);
        tryFoldBitAndOrMethod.invoke(foldConstants, tryFoldBitAndOrMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (lval > Integer.MAX_VALUE): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldBitAndOr_LvalGreaterThanIntegerMAX_VALUE() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 2.68156158598852E154);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[5];
        tryFoldBitAndOrMethodArguments[0] = ((Object) null);
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        tryFoldBitAndOrMethodArguments[3] = numberNode1;
        tryFoldBitAndOrMethodArguments[4] = ((Object) null);
        tryFoldBitAndOrMethod.invoke(foldConstants, tryFoldBitAndOrMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (lval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (rval < Integer.MIN_VALUE): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldBitAndOr_RvalLessThanIntegerMIN_VALUE() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", -4.294967296000001E9);
        (((Node) numberNode1)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[5];
        tryFoldBitAndOrMethodArguments[0] = ((Object) null);
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        tryFoldBitAndOrMethodArguments[3] = numberNode1;
        tryFoldBitAndOrMethodArguments[4] = ((Object) null);
        tryFoldBitAndOrMethod.invoke(foldConstants, tryFoldBitAndOrMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (lval > Integer.MAX_VALUE): False}
 * @utbot.executesCondition {@code (rval < Integer.MIN_VALUE): False}
 * @utbot.executesCondition {@code (rval > Integer.MAX_VALUE): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldBitAndOr_RvalGreaterThanIntegerMAX_VALUE() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 2.68156158598852E154);
        (((Node) numberNode1)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[5];
        tryFoldBitAndOrMethodArguments[0] = ((Object) null);
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        tryFoldBitAndOrMethodArguments[3] = numberNode1;
        tryFoldBitAndOrMethodArguments[4] = ((Object) null);
        tryFoldBitAndOrMethod.invoke(foldConstants, tryFoldBitAndOrMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldBitAndOr_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBitAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldBitAndOr(FoldConstants.java:1115) */
        foldConstants.tryFoldBitAndOr(null, null, scriptOrFnNode, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.NUMBER && right.getType() == Token.NUMBER
 *  */
    @Test
    public void testTryFoldBitAndOr_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBitAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldBitAndOr(FoldConstants.java:1114) */
        foldConstants.tryFoldBitAndOr(null, null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double lval = left.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBitAndOr_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        foldConstants.tryFoldBitAndOr(null, null, scriptOrFnNode, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double rval = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldBitAndOr_ThrowIllegalStateException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[5];
        tryFoldBitAndOrMethodArguments[0] = ((Object) null);
        tryFoldBitAndOrMethodArguments[1] = ((Object) null);
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        tryFoldBitAndOrMethodArguments[3] = scriptOrFnNode;
        tryFoldBitAndOrMethodArguments[4] = ((Object) null);
        try {
            tryFoldBitAndOrMethod.invoke(foldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldBitAndOr1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(9);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 6.7166354E7);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 416.0);
        (((Node) numberNode1)).setType(39);
        Object numberNode2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldBitAndOr] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildBefore(Node.java:542)
            com.google.javascript.rhino.Node.replaceChild(Node.java:686)
            com.google.javascript.jscomp.FoldConstants.tryFoldBitAndOr(FoldConstants.java:1150) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[5];
        tryFoldBitAndOrMethodArguments[0] = nodeTraversal;
        tryFoldBitAndOrMethodArguments[1] = functionNode;
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        tryFoldBitAndOrMethodArguments[3] = numberNode1;
        tryFoldBitAndOrMethodArguments[4] = numberNode2;
        try {
            tryFoldBitAndOrMethod.invoke(foldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldBitAndOr(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = Error.class)
    public void testTryFoldBitAndOr2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 2.147483647E9);
        (((Node) numberNode1)).setType(39);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldBitAndOrMethod = foldConstantsClazz.getDeclaredMethod("tryFoldBitAndOr", nodeTraversalType, stringNodeType, stringNodeType, stringNodeType, stringNodeType);
        tryFoldBitAndOrMethod.setAccessible(true);
        java.lang.Object[] tryFoldBitAndOrMethodArguments = new java.lang.Object[5];
        tryFoldBitAndOrMethodArguments[0] = ((Object) null);
        tryFoldBitAndOrMethodArguments[1] = stringNode;
        tryFoldBitAndOrMethodArguments[2] = numberNode;
        tryFoldBitAndOrMethodArguments[3] = numberNode1;
        tryFoldBitAndOrMethodArguments[4] = scriptOrFnNode;
        try {
            tryFoldBitAndOrMethod.invoke(foldConstants, tryFoldBitAndOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldComparison
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldComparison(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldComparison(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int op = n.getType();
 *  */
    @Test
    public void testTryFoldComparison_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldComparison(FoldConstants.java:1221) */
        foldConstants.tryFoldComparison(null, null, null, null, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldComparison(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldComparison1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(63);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = foldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[5];
        tryFoldComparisonMethodArguments[0] = nodeTraversal;
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = numberNode;
        tryFoldComparisonMethodArguments[3] = numberNode1;
        tryFoldComparisonMethodArguments[4] = ((Object) null);
        tryFoldComparisonMethod.invoke(foldConstants, tryFoldComparisonMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldComparison(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldComparison2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = foldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[5];
        tryFoldComparisonMethodArguments[0] = nodeTraversal;
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        tryFoldComparisonMethodArguments[3] = numberNode;
        tryFoldComparisonMethodArguments[4] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(foldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldComparison] produces [java.lang.NullPointerException] */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = foldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[5];
        tryFoldComparisonMethodArguments[0] = nodeTraversal;
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        tryFoldComparisonMethodArguments[3] = numberNode;
        tryFoldComparisonMethodArguments[4] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(foldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldComparison(FoldConstants.java:1232) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = foldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[5];
        tryFoldComparisonMethodArguments[0] = nodeTraversal;
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        tryFoldComparisonMethodArguments[3] = numberNode;
        tryFoldComparisonMethodArguments[4] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(foldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison5() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldComparison(FoldConstants.java:1232) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = foldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[5];
        tryFoldComparisonMethodArguments[0] = nodeTraversal;
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        tryFoldComparisonMethodArguments[3] = numberNode;
        tryFoldComparisonMethodArguments[4] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(foldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison6() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(29);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldComparison(FoldConstants.java:1232) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = foldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[5];
        tryFoldComparisonMethodArguments[0] = nodeTraversal;
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        tryFoldComparisonMethodArguments[3] = numberNode;
        tryFoldComparisonMethodArguments[4] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(foldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldComparison7() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldComparison] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldComparison(FoldConstants.java:1228) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = foldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[5];
        tryFoldComparisonMethodArguments[0] = nodeTraversal;
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        tryFoldComparisonMethodArguments[3] = stringNode;
        tryFoldComparisonMethodArguments[4] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(foldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldComparison(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldComparison8() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(47);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldComparisonMethod = foldConstantsClazz.getDeclaredMethod("tryFoldComparison", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType, scriptOrFnNodeType);
        tryFoldComparisonMethod.setAccessible(true);
        java.lang.Object[] tryFoldComparisonMethodArguments = new java.lang.Object[5];
        tryFoldComparisonMethodArguments[0] = nodeTraversal;
        tryFoldComparisonMethodArguments[1] = scriptOrFnNode;
        tryFoldComparisonMethodArguments[2] = ((Object) null);
        tryFoldComparisonMethodArguments[3] = numberNode;
        tryFoldComparisonMethodArguments[4] = ((Object) null);
        try {
            tryFoldComparisonMethod.invoke(foldConstants, tryFoldComparisonMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldAdd
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldAdd(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldAdd() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldAdd(null, null, scriptOrFnNode, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldAdd_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-255);
        
        foldConstants.tryFoldAdd(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldAdd_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(122);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = ((Object) null);
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = scriptOrFnNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (rightString != null): False}
 *  */
    @Test
    public void testTryFoldAdd_RightStringEqualsNull() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = ((Object) null);
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = scriptOrFnNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldAdd_3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(43);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = ((Object) null);
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = scriptOrFnNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testTryFoldAdd_4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(41);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = ((Object) null);
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = scriptOrFnNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldAdd(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getType() == Token.STRING
 *  */
    @Test
    public void testTryFoldAdd_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAdd(FoldConstants.java:1051) */
        foldConstants.tryFoldAdd(null, null, scriptOrFnNode, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.STRING || right.getType() == Token.STRING
 *  */
    @Test
    public void testTryFoldAdd_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAdd(FoldConstants.java:1050) */
        foldConstants.tryFoldAdd(null, null, null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAdd(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAdd_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(39);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(40);
        
        foldConstants.tryFoldAdd(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldAdd(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String leftString = NodeUtil.getStringValue(left);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldAdd_ThrowUnsupportedOperationException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(40);
        
        foldConstants.tryFoldAdd(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldAdd(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldAdd1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(44);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = numberNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
    }
    
    @Test
    public void testTryFoldAdd2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", java.lang.Double.NaN);
        (((Node) numberNode)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = numberNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldAdd(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldAdd3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAdd(FoldConstants.java:1057) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = numberNode;
        tryFoldAddMethodArguments[3] = stringNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAdd4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAdd(FoldConstants.java:1057) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = numberNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAdd5() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(41);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAdd(FoldConstants.java:1057) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = stringNode1;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldAdd6() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldAdd(FoldConstants.java:1057) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = ((Object) null);
        tryFoldAddMethodArguments[1] = ((Object) null);
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = stringNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldAdd(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAdd7() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = numberNode;
        tryFoldAddMethodArguments[3] = numberNode1;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAdd8() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(41);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = numberNode;
        tryFoldAddMethodArguments[3] = numberNode1;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAdd9() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(43);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = numberNode;
        tryFoldAddMethodArguments[3] = numberNode1;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAdd10() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(39);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = numberNode;
        tryFoldAddMethodArguments[3] = numberNode1;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAdd11() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(44);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = numberNode;
        tryFoldAddMethodArguments[3] = numberNode1;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAdd12() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(122);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = numberNode;
        tryFoldAddMethodArguments[3] = numberNode1;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAdd13() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(39);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = functionNode;
        tryFoldAddMethodArguments[3] = numberNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = Error.class)
    public void testTryFoldAdd14() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(39);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = numberNode;
        tryFoldAddMethodArguments[3] = numberNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryFoldAdd15() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldAddMethod = foldConstantsClazz.getDeclaredMethod("tryFoldAdd", nodeTraversalType, functionNodeType, functionNodeType, functionNodeType, functionNodeType);
        tryFoldAddMethod.setAccessible(true);
        java.lang.Object[] tryFoldAddMethodArguments = new java.lang.Object[5];
        tryFoldAddMethodArguments[0] = nodeTraversal;
        tryFoldAddMethodArguments[1] = functionNode;
        tryFoldAddMethodArguments[2] = stringNode;
        tryFoldAddMethodArguments[3] = numberNode;
        tryFoldAddMethodArguments[4] = ((Object) null);
        try {
            tryFoldAddMethod.invoke(foldConstants, tryFoldAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldWhile
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldWhile(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldWhile(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldWhile_Return() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldWhile(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldWhile(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldWhile_Return_3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node$NumberNode", "number", 4.9E-324);
        (((Node) first)).setType(39);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldWhile(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldWhile(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldWhile_Return_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(29);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldWhile(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldWhile(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldWhile_Return_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(40);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldWhile(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldWhile(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldWhile(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.WHILE);
 *  */
    @Test
    public void testTryFoldWhile_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldWhile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldWhile(FoldConstants.java:1778) */
        foldConstants.tryFoldWhile(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldWhile(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldWhile(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.WHILE);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldWhile_ThrowIllegalArgumentException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldWhile(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldWhile(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isLiteralValue(cond) || NodeUtil.getBooleanValue(cond)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldWhile_ThrowUnsupportedOperationException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(113);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldWhile(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryFoldWhile(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldWhile1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldWhile(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldWhile2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(47);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldWhileMethod = foldConstantsClazz.getDeclaredMethod("tryFoldWhile", nodeTraversalType, functionNodeType, functionNodeType);
        tryFoldWhileMethod.setAccessible(true);
        java.lang.Object[] tryFoldWhileMethodArguments = new java.lang.Object[3];
        tryFoldWhileMethodArguments[0] = ((Object) null);
        tryFoldWhileMethodArguments[1] = functionNode;
        tryFoldWhileMethodArguments[2] = numberNode;
        tryFoldWhileMethod.invoke(foldConstants, tryFoldWhileMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldWhile(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testTryFoldWhile3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(63);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldWhileMethod = foldConstantsClazz.getDeclaredMethod("tryFoldWhile", nodeTraversalType, functionNodeType, functionNodeType);
        tryFoldWhileMethod.setAccessible(true);
        java.lang.Object[] tryFoldWhileMethodArguments = new java.lang.Object[3];
        tryFoldWhileMethodArguments[0] = ((Object) null);
        tryFoldWhileMethodArguments[1] = functionNode;
        tryFoldWhileMethodArguments[2] = numberNode;
        try {
            tryFoldWhileMethod.invoke(foldConstants, tryFoldWhileMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldWhile4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) first)).setType(39);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldWhile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isStatementBlock(NodeUtil.java:1011)
            com.google.javascript.jscomp.NodeUtil.removeChild(NodeUtil.java:1064)
            com.google.javascript.jscomp.FoldConstants.tryFoldWhile(FoldConstants.java:1784) */
        foldConstants.tryFoldWhile(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldWhile5() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(43);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldWhile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isStatementBlock(NodeUtil.java:1011)
            com.google.javascript.jscomp.NodeUtil.removeChild(NodeUtil.java:1064)
            com.google.javascript.jscomp.FoldConstants.tryFoldWhile(FoldConstants.java:1784) */
        foldConstants.tryFoldWhile(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testTryFoldWhile6() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(40);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldWhile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isStatementBlock(NodeUtil.java:1011)
            com.google.javascript.jscomp.NodeUtil.removeChild(NodeUtil.java:1064)
            com.google.javascript.jscomp.FoldConstants.tryFoldWhile(FoldConstants.java:1784) */
        foldConstants.tryFoldWhile(null, functionNode, null);
    }
    
    @Test
    public void testTryFoldWhile7() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(29);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldWhile] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:177)
            com.google.javascript.jscomp.NodeUtil.isImmutableValue(NodeUtil.java:186)
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:221)
            com.google.javascript.jscomp.NodeUtil.isLiteralValue(NodeUtil.java:214)
            com.google.javascript.jscomp.FoldConstants.tryFoldWhile(FoldConstants.java:1780) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldWhileMethod = foldConstantsClazz.getDeclaredMethod("tryFoldWhile", nodeTraversalType, functionNodeType, functionNodeType);
        tryFoldWhileMethod.setAccessible(true);
        java.lang.Object[] tryFoldWhileMethodArguments = new java.lang.Object[3];
        tryFoldWhileMethodArguments[0] = ((Object) null);
        tryFoldWhileMethodArguments[1] = functionNode;
        tryFoldWhileMethodArguments[2] = numberNode;
        try {
            tryFoldWhileMethod.invoke(foldConstants, tryFoldWhileMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldWhile(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldWhile8() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(29);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(39);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldWhile(null, functionNode, null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method tryFoldWhile(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testTryFoldWhile9() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(113);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(64);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(63);
        setField(first1, "com.google.javascript.rhino.Node", "next", first1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldWhileMethod = foldConstantsClazz.getDeclaredMethod("tryFoldWhile", nodeTraversalType, functionNodeType, functionNodeType);
        tryFoldWhileMethod.setAccessible(true);
        java.lang.Object[] tryFoldWhileMethodArguments = new java.lang.Object[3];
        tryFoldWhileMethodArguments[0] = ((Object) null);
        tryFoldWhileMethodArguments[1] = functionNode;
        tryFoldWhileMethodArguments[2] = numberNode;
        try {
            tryFoldWhileMethod.invoke(foldConstants, tryFoldWhileMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.getBlockExpression
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBlockExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.FoldConstants#isExpressBlock(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return n.getFirstChild();}
 *  */
    @Test
    public void testGetBlockExpression_NodeGetFirstChild() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(130);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockExpression", nodeType);
        getBlockExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockExpressionMethodArguments = new java.lang.Object[1];
        getBlockExpressionMethodArguments[0] = node;
        ScriptOrFnNode actual = ((ScriptOrFnNode) getBlockExpressionMethod.invoke(foldConstants, getBlockExpressionMethodArguments));
        
        int firstEncodedSourceStart = first.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(firstEncodedSourceStart, actualEncodedSourceStart);
        
        int firstEncodedSourceEnd = first.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(firstEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int firstBaseLineno = first.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(firstBaseLineno, actualBaseLineno);
        
        int firstEndLineno = first.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(firstEndLineno, actualEndLineno);
        
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
        
        int firstVarStart = ((Integer) getFieldValue(first, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(firstVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int firstType = first.getType();
        int actualType = actual.getType();
        assertEquals(firstType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int firstSourcePosition = ((Integer) getFieldValue(first, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(firstSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBlockExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.FoldConstants#isExpressBlock(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(isExpressBlock(n));
 *  */
    @Test
    public void testGetBlockExpression_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.getBlockExpression] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.isExpressBlock(FoldConstants.java:1957)
            com.google.javascript.jscomp.FoldConstants.getBlockExpression(FoldConstants.java:1970) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockExpression", nodeType);
        getBlockExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockExpressionMethodArguments = new java.lang.Object[1];
        getBlockExpressionMethodArguments[0] = ((Object) null);
        try {
            getBlockExpressionMethod.invoke(foldConstants, getBlockExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getBlockExpression(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isExpressBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockExpression_ThrowIllegalStateException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockExpression", nodeType);
        getBlockExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockExpressionMethodArguments = new java.lang.Object[1];
        getBlockExpressionMethodArguments[0] = node;
        try {
            getBlockExpressionMethod.invoke(foldConstants, getBlockExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isExpressBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockExpression_ThrowIllegalStateException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(125);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockExpression", nodeType);
        getBlockExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockExpressionMethodArguments = new java.lang.Object[1];
        getBlockExpressionMethodArguments[0] = node;
        try {
            getBlockExpressionMethod.invoke(foldConstants, getBlockExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isExpressBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockExpression_ThrowIllegalStateException_3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockExpression", nodeType);
        getBlockExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockExpressionMethodArguments = new java.lang.Object[1];
        getBlockExpressionMethodArguments[0] = node;
        try {
            getBlockExpressionMethod.invoke(foldConstants, getBlockExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isExpressBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockExpression_ThrowIllegalStateException_2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockExpressionMethod = foldConstantsClazz.getDeclaredMethod("getBlockExpression", functionNodeType);
        getBlockExpressionMethod.setAccessible(true);
        java.lang.Object[] getBlockExpressionMethodArguments = new java.lang.Object[1];
        getBlockExpressionMethodArguments[0] = functionNode;
        try {
            getBlockExpressionMethod.invoke(foldConstants, getBlockExpressionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.isVarBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isVarBlock(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isVarBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsVarBlock_NGetTypeNotEqualsTokenBLOCK() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isVarBlockMethod = foldConstantsClazz.getDeclaredMethod("isVarBlock", nodeType);
        isVarBlockMethod.setAccessible(true);
        java.lang.Object[] isVarBlockMethodArguments = new java.lang.Object[1];
        isVarBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isVarBlockMethod.invoke(foldConstants, isVarBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isVarBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): True}
 * @utbot.executesCondition {@code (n.hasOneChild()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsVarBlock_NotNHasOneChild() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(125);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isVarBlockMethod = foldConstantsClazz.getDeclaredMethod("isVarBlock", nodeType);
        isVarBlockMethod.setAccessible(true);
        java.lang.Object[] isVarBlockMethodArguments = new java.lang.Object[1];
        isVarBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isVarBlockMethod.invoke(foldConstants, isVarBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isVarBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): True}
 * @utbot.executesCondition {@code (n.hasOneChild()): True}
 * @utbot.executesCondition {@code (first.getType() == Token.VAR): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsVarBlock_FirstGetTypeNotEqualsTokenVAR() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isVarBlockMethod = foldConstantsClazz.getDeclaredMethod("isVarBlock", nodeType);
        isVarBlockMethod.setAccessible(true);
        java.lang.Object[] isVarBlockMethodArguments = new java.lang.Object[1];
        isVarBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isVarBlockMethod.invoke(foldConstants, isVarBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isVarBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): True}
 * @utbot.executesCondition {@code (n.hasOneChild()): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsVarBlock_NotNHasOneChild_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isVarBlockMethod = foldConstantsClazz.getDeclaredMethod("isVarBlock", functionNodeType);
        isVarBlockMethod.setAccessible(true);
        java.lang.Object[] isVarBlockMethodArguments = new java.lang.Object[1];
        isVarBlockMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isVarBlockMethod.invoke(foldConstants, isVarBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isVarBlock(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.BLOCK): True}
 * @utbot.executesCondition {@code (n.hasOneChild()): True}
 * @utbot.executesCondition {@code (first.getType() == Token.VAR): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasOneChild()}
 * @utbot.returnsFrom {@code return first.hasOneChild();}
 *  */
    @Test
    public void testIsVarBlock_FirstGetTypeEqualsTokenVAR() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isVarBlockMethod = foldConstantsClazz.getDeclaredMethod("isVarBlock", nodeType);
        isVarBlockMethod.setAccessible(true);
        java.lang.Object[] isVarBlockMethodArguments = new java.lang.Object[1];
        isVarBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isVarBlockMethod.invoke(foldConstants, isVarBlockMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isVarBlock(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isVarBlock(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.BLOCK
 *  */
    @Test
    public void testIsVarBlock_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.isVarBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.isVarBlock(FoldConstants.java:2004) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isVarBlockMethod = foldConstantsClazz.getDeclaredMethod("isVarBlock", nodeType);
        isVarBlockMethod.setAccessible(true);
        java.lang.Object[] isVarBlockMethodArguments = new java.lang.Object[1];
        isVarBlockMethodArguments[0] = ((Object) null);
        try {
            isVarBlockMethod.invoke(foldConstants, isVarBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.areSafeFlagsToFold
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method areSafeFlagsToFold(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#areSafeFlagsToFold(java.lang.String)}
 * @utbot.returnsFrom {@code return flags.indexOf('g') < 0;}
 *  */
    @Test
    public void testAreSafeFlagsToFold_FlagsIndexOfLessThanZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "";
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areSafeFlagsToFoldMethod = foldConstantsClazz.getDeclaredMethod("areSafeFlagsToFold", stringType);
        areSafeFlagsToFoldMethod.setAccessible(true);
        java.lang.Object[] areSafeFlagsToFoldMethodArguments = new java.lang.Object[1];
        areSafeFlagsToFoldMethodArguments[0] = string;
        boolean actual = ((Boolean) areSafeFlagsToFoldMethod.invoke(null, areSafeFlagsToFoldMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#areSafeFlagsToFold(java.lang.String)}
 * @utbot.returnsFrom {@code return flags.indexOf('g') < 0;}
 *  */
    @Test
    public void testAreSafeFlagsToFold_FlagsIndexOfGreaterOrEqualZero() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        String string = "g";
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areSafeFlagsToFoldMethod = foldConstantsClazz.getDeclaredMethod("areSafeFlagsToFold", stringType);
        areSafeFlagsToFoldMethod.setAccessible(true);
        java.lang.Object[] areSafeFlagsToFoldMethodArguments = new java.lang.Object[1];
        areSafeFlagsToFoldMethodArguments[0] = string;
        boolean actual = ((Boolean) areSafeFlagsToFoldMethod.invoke(null, areSafeFlagsToFoldMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method areSafeFlagsToFold(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#areSafeFlagsToFold(java.lang.String)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return flags.indexOf('g') < 0;
 *  */
    @Test
    public void testAreSafeFlagsToFold_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.areSafeFlagsToFold] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.areSafeFlagsToFold(FoldConstants.java:1703) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class stringType = Class.forName("java.lang.String");
        Method areSafeFlagsToFoldMethod = foldConstantsClazz.getDeclaredMethod("areSafeFlagsToFold", stringType);
        areSafeFlagsToFoldMethod.setAccessible(true);
        java.lang.Object[] areSafeFlagsToFoldMethodArguments = new java.lang.Object[1];
        areSafeFlagsToFoldMethodArguments[0] = ((Object) null);
        try {
            areSafeFlagsToFoldMethod.invoke(null, areSafeFlagsToFoldMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldGetElem
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldGetElem_RightGetTypeNotEqualsTokenNUMBER() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-255);
        
        foldConstants.tryFoldGetElem(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): False}
 *  */
    @Test
    public void testTryFoldGetElem_LeftGetTypeNotEqualsTokenARRAYLIT() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldGetElem(null, null, scriptOrFnNode, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): False}
 * @utbot.executesCondition {@code (intIndex != index): False}
 * @utbot.executesCondition {@code (intIndex < 0): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.getCompiler().report(JSError.make(t, n, INDEX_OUT_OF_BOUNDS_ERROR, String.valueOf(intIndex)));
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", -1.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldGetElem(FoldConstants.java:1573) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = foldConstantsClazz.getDeclaredMethod("tryFoldGetElem", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[5];
        tryFoldGetElemMethodArguments[0] = ((Object) null);
        tryFoldGetElemMethodArguments[1] = ((Object) null);
        tryFoldGetElemMethodArguments[2] = scriptOrFnNode;
        tryFoldGetElemMethodArguments[3] = numberNode;
        tryFoldGetElemMethodArguments[4] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(foldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): False}
 * @utbot.executesCondition {@code (intIndex != index): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.getCompiler().report(JSError.make(t, right, INVALID_GETELEM_INDEX_ERROR, String.valueOf(index)));
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 9.438300998639906E168);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldGetElem(FoldConstants.java:1567) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = foldConstantsClazz.getDeclaredMethod("tryFoldGetElem", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[5];
        tryFoldGetElemMethodArguments[0] = ((Object) null);
        tryFoldGetElemMethodArguments[1] = ((Object) null);
        tryFoldGetElemMethodArguments[2] = scriptOrFnNode;
        tryFoldGetElemMethodArguments[3] = numberNode;
        tryFoldGetElemMethodArguments[4] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(foldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: right.getType() != Token.NUMBER
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldGetElem(FoldConstants.java:1558) */
        foldConstants.tryFoldGetElem(null, null, scriptOrFnNode, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.ARRAYLIT
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldGetElem(FoldConstants.java:1556) */
        foldConstants.tryFoldGetElem(null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): False}
 * @utbot.executesCondition {@code (intIndex != index): False}
 * @utbot.executesCondition {@code (intIndex < 0): False}
 * @utbot.executesCondition {@code (elem == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.getCompiler().report(JSError.make(t, n, INDEX_OUT_OF_BOUNDS_ERROR, String.valueOf(intIndex)));
 *  */
    @Test
    public void testTryFoldGetElem_ThrowNullPointerException_4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldGetElem(FoldConstants.java:1584) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = foldConstantsClazz.getDeclaredMethod("tryFoldGetElem", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[5];
        tryFoldGetElemMethodArguments[0] = ((Object) null);
        tryFoldGetElemMethodArguments[1] = ((Object) null);
        tryFoldGetElemMethodArguments[2] = scriptOrFnNode;
        tryFoldGetElemMethodArguments[3] = numberNode;
        tryFoldGetElemMethodArguments[4] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(foldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.getType() == Token.ARRAYLIT): True}
 * @utbot.executesCondition {@code (right.getType() != Token.NUMBER): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getDouble()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: double index = right.getDouble();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldGetElem_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(63);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(39);
        
        foldConstants.tryFoldGetElem(null, null, scriptOrFnNode, scriptOrFnNode1, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryFoldGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testTryFoldGetElem1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(63);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 33024.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldGetElem(FoldConstants.java:1584) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = foldConstantsClazz.getDeclaredMethod("tryFoldGetElem", nodeTraversalType, numberNodeType, numberNodeType, numberNodeType, numberNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[5];
        tryFoldGetElemMethodArguments[0] = nodeTraversal;
        tryFoldGetElemMethodArguments[1] = numberNode;
        tryFoldGetElemMethodArguments[2] = functionNode;
        tryFoldGetElemMethodArguments[3] = numberNode1;
        tryFoldGetElemMethodArguments[4] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(foldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryFoldGetElem2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(63);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode1, "com.google.javascript.rhino.Node$NumberNode", "number", 0.0);
        (((Node) numberNode1)).setType(39);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldGetElem(FoldConstants.java:1591) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetElemMethod = foldConstantsClazz.getDeclaredMethod("tryFoldGetElem", nodeTraversalType, numberNodeType, numberNodeType, numberNodeType, numberNodeType);
        tryFoldGetElemMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetElemMethodArguments = new java.lang.Object[5];
        tryFoldGetElemMethodArguments[0] = nodeTraversal;
        tryFoldGetElemMethodArguments[1] = numberNode;
        tryFoldGetElemMethodArguments[2] = functionNode;
        tryFoldGetElemMethodArguments[3] = numberNode1;
        tryFoldGetElemMethodArguments[4] = ((Object) null);
        try {
            tryFoldGetElemMethod.invoke(foldConstants, tryFoldGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldFor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method tryFoldFor(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldFor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getChildCount() != 4): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldFor_NGetChildCountNotEquals4() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(115);
        
        foldConstants.tryFoldFor(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldFor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getChildCount() != 4): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldFor_NGetChildCountNotEquals4_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(115);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldFor(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldFor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getChildCount() != 4): False}
 * @utbot.executesCondition {@code (n.getFirstChild().getType() != Token.EMPTY): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldFor_NGetFirstChildGetTypeNotEqualsTokenEMPTY() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(115);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldFor(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method tryFoldFor(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (n.getChildCount() != 4): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// execute conditions:
    ///     {@code (n.getFirstChild().getType() != Token.EMPTY): False}
    /// invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)} once,
    ///     {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)} once
    /// return from: {@code return;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldFor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(cond)): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldFor_NodeUtilIsLiteralValue() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(115);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(124);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldFor(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldFor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(cond)): True}
 * @utbot.executesCondition {@code (NodeUtil.getBooleanValue(cond)): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldFor_NodeUtilGetBooleanValue() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(115);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(124);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(44);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldFor(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldFor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!NodeUtil.isLiteralValue(cond)): True}
 * @utbot.executesCondition {@code (NodeUtil.getBooleanValue(cond)): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldFor_NodeUtilGetBooleanValue_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(115);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(124);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldFor(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldFor(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldFor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.FOR);
 *  */
    @Test
    public void testTryFoldFor_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldFor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldFor(FoldConstants.java:1792) */
        foldConstants.tryFoldFor(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldFor(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldFor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.FOR);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.FOR);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldFor_ThrowIllegalArgumentException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldFor(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldFor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.FOR);): True}
 * @utbot.executesCondition {@code (n.getChildCount() != 4): False}
 * @utbot.executesCondition {@code (n.getFirstChild().getType() != Token.EMPTY): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getChildCount()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isLiteralValue(cond) || NodeUtil.getBooleanValue(cond)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldFor_ThrowUnsupportedOperationException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(115);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(124);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(38);
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldFor(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldDo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldDo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldDo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldDo_Return_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(44);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        foldConstants.tryFoldDo(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldDo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldDo_Return_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        foldConstants.tryFoldDo(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldDo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldDo_Return_3() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(29);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        foldConstants.tryFoldDo(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldDo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldDo_Return() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(47);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        foldConstants.tryFoldDo(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldDo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldDo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.DO);
 *  */
    @Test
    public void testTryFoldDo_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldDo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldDo(FoldConstants.java:1813) */
        foldConstants.tryFoldDo(null, null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldDo(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldDo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.DO);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryFoldDo_ThrowIllegalArgumentException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldDo(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldDo(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isLiteralValue(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isLiteralValue(cond) || NodeUtil.getBooleanValue(cond)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryFoldDo_ThrowUnsupportedOperationException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(114);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "last", last);
        
        foldConstants.tryFoldDo(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.hasBreakOrContinue
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasBreakOrContinue(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#hasBreakOrContinue(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.common.base.Predicates#or(com.google.common.base.Predicate,com.google.common.base.Predicate)}
 * @utbot.invokes {@link com.google.common.base.Predicates#not(com.google.common.base.Predicate)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#has(com.google.javascript.rhino.Node,com.google.common.base.Predicate,com.google.common.base.Predicate)}
 * @utbot.returnsFrom {@code return NodeUtil.has(n, Predicates.<Node>or(new NodeUtil.MatchNodeType(Token.BREAK), new NodeUtil.MatchNodeType(Token.CONTINUE)), Predicates.<Node>not(new NodeUtil.MatchNodeType(Token.FUNCTION)));}
 *  */
    @Test
    public void testHasBreakOrContinue_PredicatesNot() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(116);
        
        boolean actual = foldConstants.hasBreakOrContinue(functionNode);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldGetProp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): False}
 *  */
    @Test
    public void testTryFoldGetProp_RightGetTypeNotEqualsTokenSTRING() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        foldConstants.tryFoldGetProp(null, null, null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.executesCondition {@code (right.getString().equals("length")): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldGetProp_RightGetStringEquals() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = foldConstantsClazz.getDeclaredMethod("tryFoldGetProp", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[5];
        tryFoldGetPropMethodArguments[0] = ((Object) null);
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = scriptOrFnNode;
        tryFoldGetPropMethodArguments[3] = stringNode;
        tryFoldGetPropMethodArguments[4] = ((Object) null);
        tryFoldGetPropMethod.invoke(foldConstants, tryFoldGetPropMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: right.getType() == Token.STRING && right.getString().equals("length")
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldGetProp(FoldConstants.java:1601) */
        foldConstants.tryFoldGetProp(null, null, null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: right.getString().equals("length")
 *  */
    @Test
    public void testTryFoldGetProp_ThrowNullPointerException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldGetProp(FoldConstants.java:1602) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryFoldGetPropMethod = foldConstantsClazz.getDeclaredMethod("tryFoldGetProp", nodeTraversalType, nodeType, nodeType, nodeType, nodeType);
        tryFoldGetPropMethod.setAccessible(true);
        java.lang.Object[] tryFoldGetPropMethodArguments = new java.lang.Object[5];
        tryFoldGetPropMethodArguments[0] = ((Object) null);
        tryFoldGetPropMethodArguments[1] = ((Object) null);
        tryFoldGetPropMethodArguments[2] = ((Object) null);
        tryFoldGetPropMethodArguments[3] = stringNode;
        tryFoldGetPropMethodArguments[4] = ((Object) null);
        try {
            tryFoldGetPropMethod.invoke(foldConstants, tryFoldGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (right.getType() == Token.STRING): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: right.getString().equals("length")
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldGetProp_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        foldConstants.tryFoldGetProp(null, null, null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.isExpressBlock
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isExpressBlock(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsExpressBlock_ReturnFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isExpressBlock", nodeType);
        isExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isExpressBlockMethodArguments = new java.lang.Object[1];
        isExpressBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isExpressBlockMethod.invoke(foldConstants, isExpressBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsExpressBlock_ReturnFalse_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(125);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isExpressBlock", nodeType);
        isExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isExpressBlockMethodArguments = new java.lang.Object[1];
        isExpressBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isExpressBlockMethod.invoke(foldConstants, isExpressBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.isExpressionNode(n.getFirstChild());}
 *  */
    @Test
    public void testIsExpressBlock_ReturnNodeUtilIsExpressionNode() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isExpressBlock", nodeType);
        isExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isExpressBlockMethodArguments = new java.lang.Object[1];
        isExpressBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isExpressBlockMethod.invoke(foldConstants, isExpressBlockMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.isExpressionNode(n.getFirstChild());}
 *  */
    @Test
    public void testIsExpressBlock_ReturnNodeUtilIsExpressionNode_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(130);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isExpressBlock", nodeType);
        isExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isExpressBlockMethodArguments = new java.lang.Object[1];
        isExpressBlockMethodArguments[0] = node;
        boolean actual = ((Boolean) isExpressBlockMethod.invoke(foldConstants, isExpressBlockMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsExpressBlock_ReturnFalse_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isExpressBlock", functionNodeType);
        isExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isExpressBlockMethodArguments = new java.lang.Object[1];
        isExpressBlockMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isExpressBlockMethod.invoke(foldConstants, isExpressBlockMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isExpressBlock(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#isExpressBlock(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.BLOCK
 *  */
    @Test
    public void testIsExpressBlock_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.isExpressBlock] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.isExpressBlock(FoldConstants.java:1957) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isExpressBlockMethod = foldConstantsClazz.getDeclaredMethod("isExpressBlock", nodeType);
        isExpressBlockMethod.setAccessible(true);
        java.lang.Object[] isExpressBlockMethodArguments = new java.lang.Object[1];
        isExpressBlockMethodArguments[0] = ((Object) null);
        try {
            isExpressBlockMethod.invoke(foldConstants, isExpressBlockMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.getBlockVar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBlockVar(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockVar(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.FoldConstants#isVarBlock(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return n.getFirstChild();}
 *  */
    @Test
    public void testGetBlockVar_NodeGetFirstChild() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(118);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first1);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockVarMethod = foldConstantsClazz.getDeclaredMethod("getBlockVar", functionNodeType);
        getBlockVarMethod.setAccessible(true);
        java.lang.Object[] getBlockVarMethodArguments = new java.lang.Object[1];
        getBlockVarMethodArguments[0] = functionNode;
        Node actual = ((Node) getBlockVarMethod.invoke(foldConstants, getBlockVarMethodArguments));
        
        int firstType = first.getType();
        int actualType = actual.getType();
        assertEquals(firstType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node firstFirst = ((Node) getFieldValue(first, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        double firstFirstNumber = ((Double) getFieldValue(firstFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        double actualFirstNumber = ((Double) getFieldValue(actualFirst, "com.google.javascript.rhino.Node$NumberNode", "number"));
        org.junit.Assert.assertEquals(firstFirstNumber, actualFirstNumber, 1.0E-6);
        
        int firstFirstType = firstFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(firstFirstType, actualFirstType);
        
        assertTrue(deepEquals(firstFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int firstFirstSourcePosition = ((Integer) getFieldValue(firstFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(firstFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node firstLast = ((Node) getFieldValue(first, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(firstLast, actualLast));
        assertTrue(deepEquals(firstLast, actualLast));
        assertTrue(deepEquals(firstLast, actualLast));
        assertTrue(deepEquals(firstLast, actualLast));
        assertTrue(deepEquals(firstLast, actualLast));
        assertTrue(deepEquals(firstLast, actualLast));
        assertTrue(deepEquals(firstLast, actualLast));
        assertTrue(deepEquals(firstLast, actualLast));
        assertTrue(deepEquals(firstLast, actualLast));
        
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBlockVar(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockVar(com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.FoldConstants#isVarBlock(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(isVarBlock(n));
 *  */
    @Test
    public void testGetBlockVar_ThrowNullPointerException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.getBlockVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.isVarBlock(FoldConstants.java:2004)
            com.google.javascript.jscomp.FoldConstants.getBlockVar(FoldConstants.java:2020) */
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockVarMethod = foldConstantsClazz.getDeclaredMethod("getBlockVar", nodeType);
        getBlockVarMethod.setAccessible(true);
        java.lang.Object[] getBlockVarMethodArguments = new java.lang.Object[1];
        getBlockVarMethodArguments[0] = ((Object) null);
        try {
            getBlockVarMethod.invoke(foldConstants, getBlockVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getBlockVar(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockVar(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isVarBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockVar_ThrowIllegalStateException() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(-255);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockVarMethod = foldConstantsClazz.getDeclaredMethod("getBlockVar", nodeType);
        getBlockVarMethod.setAccessible(true);
        java.lang.Object[] getBlockVarMethodArguments = new java.lang.Object[1];
        getBlockVarMethodArguments[0] = node;
        try {
            getBlockVarMethod.invoke(foldConstants, getBlockVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockVar(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isVarBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockVar_ThrowIllegalStateException_1() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = new Node(125);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockVarMethod = foldConstantsClazz.getDeclaredMethod("getBlockVar", nodeType);
        getBlockVarMethod.setAccessible(true);
        java.lang.Object[] getBlockVarMethodArguments = new java.lang.Object[1];
        getBlockVarMethodArguments[0] = node;
        try {
            getBlockVarMethod.invoke(foldConstants, getBlockVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockVar(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isVarBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockVar_ThrowIllegalStateException_4() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockVarMethod = foldConstantsClazz.getDeclaredMethod("getBlockVar", nodeType);
        getBlockVarMethod.setAccessible(true);
        java.lang.Object[] getBlockVarMethodArguments = new java.lang.Object[1];
        getBlockVarMethodArguments[0] = node;
        try {
            getBlockVarMethod.invoke(foldConstants, getBlockVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockVar(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isVarBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockVar_ThrowIllegalStateException_2() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockVarMethod = foldConstantsClazz.getDeclaredMethod("getBlockVar", functionNodeType);
        getBlockVarMethod.setAccessible(true);
        java.lang.Object[] getBlockVarMethodArguments = new java.lang.Object[1];
        getBlockVarMethodArguments[0] = functionNode;
        try {
            getBlockVarMethod.invoke(foldConstants, getBlockVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#getBlockVar(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(isVarBlock(n));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetBlockVar_ThrowIllegalStateException_3() throws Throwable  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class foldConstantsClazz = Class.forName("com.google.javascript.jscomp.FoldConstants");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getBlockVarMethod = foldConstantsClazz.getDeclaredMethod("getBlockVar", nodeType);
        getBlockVarMethod.setAccessible(true);
        java.lang.Object[] getBlockVarMethodArguments = new java.lang.Object[1];
        getBlockVarMethodArguments[0] = node;
        try {
            getBlockVarMethod.invoke(foldConstants, getBlockVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FoldConstants.tryFoldRegularExpressionConstructor
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): True}
 * @utbot.executesCondition {@code (null != flags.getNext()): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_NullNotEqualsFlagsGetNext() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldRegularExpressionConstructor(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): False}
 * @utbot.executesCondition {@code (null == pattern): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_NullEqualsPattern() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldRegularExpressionConstructor(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.getType() == Token.STRING && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.getType() == Token.STRING) && !containsUnicodeEscape(pattern.getString())): False}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_PatternGetTypeNotEqualsTokenSTRINGAndNotEqualsAndPatternGetStringLengthGreaterOrEqual100AndNullNotEqualsFlagsOrFlagsGetTypeNotEqualsTokenSTRINGAndNotContainsUnicodeEscape() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldRegularExpressionConstructor(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.getType() == Token.STRING && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.getType() == Token.STRING) && !containsUnicodeEscape(pattern.getString())): True}
 * @utbot.executesCondition {@code (!"".equals(pattern.getString())): False}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_Equals() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldRegularExpressionConstructor(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): True}
 * @utbot.executesCondition {@code (null != flags.getNext()): False}
 * @utbot.executesCondition {@code (pattern.getType() == Token.STRING && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.getType() == Token.STRING) && !containsUnicodeEscape(pattern.getString())): True}
 * @utbot.executesCondition {@code (!"".equals(pattern.getString())): True}
 * @utbot.executesCondition {@code (pattern.getString().length() < 100): True}
 * @utbot.executesCondition {@code (pattern.getString().length() < 100): True}
 * @utbot.executesCondition {@code ((null == flags || flags.getType() == Token.STRING)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#length()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_NullNotEqualsFlagsOrFlagsGetTypeNotEqualsTokenSTRING() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next1.setType(-256);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldRegularExpressionConstructor(null, node, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node constructor = n.getFirstChild();
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_ThrowNullPointerException() {
        FoldConstants foldConstants = new FoldConstants(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldRegularExpressionConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldRegularExpressionConstructor(FoldConstants.java:1632) */
        foldConstants.tryFoldRegularExpressionConstructor(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node pattern = constructor.getNext();
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_ThrowNullPointerException_1() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldRegularExpressionConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldRegularExpressionConstructor(FoldConstants.java:1633) */
        foldConstants.tryFoldRegularExpressionConstructor(null, scriptOrFnNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.getType() == Token.STRING && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.getType() == Token.STRING) && !containsUnicodeEscape(pattern.getString())): True}
 * @utbot.executesCondition {@code (!"".equals(pattern.getString())): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: pattern.getString().length() < 100
 *  */
    @Test
    public void testTryFoldRegularExpressionConstructor_ThrowNullPointerException_2() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FoldConstants.tryFoldRegularExpressionConstructor] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FoldConstants.tryFoldRegularExpressionConstructor(FoldConstants.java:1648) */
        foldConstants.tryFoldRegularExpressionConstructor(null, scriptOrFnNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FoldConstants}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FoldConstants#tryFoldRegularExpressionConstructor(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (null != pattern): True}
 * @utbot.executesCondition {@code (null == pattern): False}
 * @utbot.executesCondition {@code (null != flags): False}
 * @utbot.executesCondition {@code (pattern.getType() == Token.STRING && !"".equals(pattern.getString()) && pattern.getString().length() < 100 && (null == flags || flags.getType() == Token.STRING) && !containsUnicodeEscape(pattern.getString())): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: !"".equals(pattern.getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryFoldRegularExpressionConstructor_ThrowIllegalStateException() throws Exception  {
        FoldConstants foldConstants = new FoldConstants(null);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        foldConstants.tryFoldRegularExpressionConstructor(null, scriptOrFnNode, null);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields902740886322900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields902740886322900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass902740886327400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields902740886322900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass902740886327400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields902740886719200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields902740886719200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass902740886721800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields902740886719200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass902740886721800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

