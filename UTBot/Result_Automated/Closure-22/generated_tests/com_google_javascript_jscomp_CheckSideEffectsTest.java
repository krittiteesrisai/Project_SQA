package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.util.ArrayList;
import com.google.javascript.rhino.InputId;
import com.google.javascript.jscomp.CodeChangeHandler.RecentChange;
import com.google.javascript.jscomp.CodeChangeHandler.ForbiddenChange;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_CheckSideEffectsTest {
    ///region Test suites for executable com.google.javascript.jscomp.CheckSideEffects.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 *  */
    @Test
    public void testVisit_ParentNotEqualsNull() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(22);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(100);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 *  */
    @Test
    public void testVisit_ParentNotEqualsNull_1() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(110);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_Return() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = new Node(124);
        
        checkSideEffects.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_Return_1() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = new Node(85);
        
        checkSideEffects.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_ParentEqualsNull() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = new Node(-255);
        
        checkSideEffects.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 *  */
    @Test
    public void testVisit_NodeGetLastChild() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(70);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(98);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(-256);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (isSimpleOp): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isExpressionResultUsed(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isSimpleOperatorType(int)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (isSimpleOp || !NodeUtil.mayHaveSideEffects(n, t.getCompiler()))
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(77);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:133) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = numberNode1;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isEmpty() || n.isComma()
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:89) */
        checkSideEffects.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: gramps.isCall() && parent == gramps.getFirstChild()
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = new Node(-255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:103) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit1() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(48);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    @Test
    public void testVisit2() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(100);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node1.setType(85);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(37);
        setField(node1, "com.google.javascript.rhino.Node", "parent", parent1);
        
        checkSideEffects.visit(nodeTraversal, node, node1);
    }
    
    @Test
    public void testVisit3() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", node);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", node);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    @Test
    public void testVisit4() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", node);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", node);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit5() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(9);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:147) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit6() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:147) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit7() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(63);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:147) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit8() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3113)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:130) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit9() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(115);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getChildAtIndex(Node.java:569)
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3144)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:130) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit10() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(37);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3113)
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3121)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:130) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit11() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", node);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3113)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:130) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit12() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", node);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3113)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:130) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit13() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(37);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next2 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(85);
        setField(first, "com.google.javascript.rhino.Node", "first", node);
        setField(first, "com.google.javascript.rhino.Node", "parent", next);
        setField(next, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3113)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:130) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = first;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckSideEffects.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.process(CheckSideEffects.java:66) */
        checkSideEffects.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.process(CheckSideEffects.java:66) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = checkSideEffectsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(checkSideEffects, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.process(CheckSideEffects.java:66) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = checkSideEffectsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(checkSideEffects, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.process(CheckSideEffects.java:66) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = checkSideEffectsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(checkSideEffects, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.process(CheckSideEffects.java:66) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = checkSideEffectsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(checkSideEffects, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckSideEffects.protectSideEffects
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method protectSideEffects()
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#protectSideEffects()}
 * @utbot.invokes {@link java.util.List#isEmpty()}
 *  */
    @Test
    public void testProtectSideEffects_ListIsEmpty() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        ArrayList problemNodes = new ArrayList();
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "problemNodes", problemNodes);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method protectSideEffectsMethod = checkSideEffectsClazz.getDeclaredMethod("protectSideEffects");
        protectSideEffectsMethod.setAccessible(true);
        java.lang.Object[] protectSideEffectsMethodArguments = new java.lang.Object[0];
        protectSideEffectsMethod.invoke(checkSideEffects, protectSideEffectsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method protectSideEffects()
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#protectSideEffects()}
 * @utbot.throwsException {@link java.lang.ClassCastException} 
 *  */
    @Test
    public void testProtectSideEffects_ThrowClassCastException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        ArrayList problemNodes = new ArrayList();
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "problemNodes", problemNodes);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.protectSideEffects] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.rhino.InputId ([S is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.InputId is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @fe1af62)]
            com.google.javascript.rhino.Node.getInputId(Node.java:1124)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:120)
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:186)
            com.google.javascript.jscomp.CheckSideEffects.protectSideEffects(CheckSideEffects.java:164) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method protectSideEffectsMethod = checkSideEffectsClazz.getDeclaredMethod("protectSideEffects");
        protectSideEffectsMethod.setAccessible(true);
        java.lang.Object[] protectSideEffectsMethodArguments = new java.lang.Object[0];
        try {
            protectSideEffectsMethod.invoke(checkSideEffects, protectSideEffectsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#protectSideEffects()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !problemNodes.isEmpty()
 *  */
    @Test
    public void testProtectSideEffects_ThrowNullPointerException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.protectSideEffects] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.protectSideEffects(CheckSideEffects.java:163) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method protectSideEffectsMethod = checkSideEffectsClazz.getDeclaredMethod("protectSideEffects");
        protectSideEffectsMethod.setAccessible(true);
        java.lang.Object[] protectSideEffectsMethodArguments = new java.lang.Object[0];
        try {
            protectSideEffectsMethod.invoke(checkSideEffects, protectSideEffectsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#protectSideEffects()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addExtern();
 *  */
    @Test
    public void testProtectSideEffects_ThrowNullPointerException_1() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        ArrayList problemNodes = new ArrayList();
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "problemNodes", problemNodes);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.protectSideEffects] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:185)
            com.google.javascript.jscomp.CheckSideEffects.protectSideEffects(CheckSideEffects.java:164) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method protectSideEffectsMethod = checkSideEffectsClazz.getDeclaredMethod("protectSideEffects");
        protectSideEffectsMethod.setAccessible(true);
        java.lang.Object[] protectSideEffectsMethodArguments = new java.lang.Object[0];
        try {
            protectSideEffectsMethod.invoke(checkSideEffects, protectSideEffectsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method protectSideEffects()
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#protectSideEffects()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: addExtern();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProtectSideEffects_ThrowIllegalStateException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        ArrayList problemNodes = new ArrayList();
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "problemNodes", problemNodes);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method protectSideEffectsMethod = checkSideEffectsClazz.getDeclaredMethod("protectSideEffects");
        protectSideEffectsMethod.setAccessible(true);
        java.lang.Object[] protectSideEffectsMethodArguments = new java.lang.Object[0];
        try {
            protectSideEffectsMethod.invoke(checkSideEffects, protectSideEffectsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#protectSideEffects()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testProtectSideEffects_ThrowUnsupportedOperationException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        ArrayList problemNodes = new ArrayList();
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "problemNodes", problemNodes);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast1 = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast1, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method protectSideEffectsMethod = checkSideEffectsClazz.getDeclaredMethod("protectSideEffects");
        protectSideEffectsMethod.setAccessible(true);
        java.lang.Object[] protectSideEffectsMethodArguments = new java.lang.Object[0];
        try {
            protectSideEffectsMethod.invoke(checkSideEffects, protectSideEffectsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#protectSideEffects()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testProtectSideEffects_ThrowIllegalArgumentException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        ArrayList problemNodes = new ArrayList();
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "problemNodes", problemNodes);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(132);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method protectSideEffectsMethod = checkSideEffectsClazz.getDeclaredMethod("protectSideEffects");
        protectSideEffectsMethod.setAccessible(true);
        java.lang.Object[] protectSideEffectsMethodArguments = new java.lang.Object[0];
        try {
            protectSideEffectsMethod.invoke(checkSideEffects, protectSideEffectsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#protectSideEffects()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: addExtern();
 *  */
    @Test(expected = NullPointerException.class)
    public void testProtectSideEffects_ThrowNullPointerException_2() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        ArrayList problemNodes = new ArrayList();
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "problemNodes", problemNodes);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 17);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method protectSideEffectsMethod = checkSideEffectsClazz.getDeclaredMethod("protectSideEffects");
        protectSideEffectsMethod.setAccessible(true);
        java.lang.Object[] protectSideEffectsMethodArguments = new java.lang.Object[0];
        try {
            protectSideEffectsMethod.invoke(checkSideEffects, protectSideEffectsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for protectSideEffects
    
    public void testProtectSideEffects_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 8 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckSideEffects.addExtern
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method addExtern()
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 *  */
    @Test
    public void testAddExtern_1() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(132);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(root, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        AbstractCompiler checkSideEffectsCompiler = ((AbstractCompiler) getFieldValue(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler"));
        CompilerInput checkSideEffectsCompilerCompilerSynthesizedExternsInput = ((CompilerInput) getFieldValue(checkSideEffectsCompiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput"));
        SourceAst checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst = ((SourceAst) getFieldValue(checkSideEffectsCompilerCompilerSynthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast"));
        Node checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot = ((Node) getFieldValue(checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst, "com.google.javascript.jscomp.JsAst", "root"));
        Node initialCheckSideEffectsCompilerSynthesizedExternsInputAstRootFirst = ((Node) getFieldValue(checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot, "com.google.javascript.rhino.Node", "first"));
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        
        AbstractCompiler checkSideEffectsCompiler1 = ((AbstractCompiler) getFieldValue(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler"));
        CompilerInput checkSideEffectsCompiler1CompilerSynthesizedExternsInput = ((CompilerInput) getFieldValue(checkSideEffectsCompiler1, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput"));
        SourceAst checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst = ((SourceAst) getFieldValue(checkSideEffectsCompiler1CompilerSynthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast"));
        Node checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot = ((Node) getFieldValue(checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst, "com.google.javascript.jscomp.JsAst", "root"));
        Node finalCheckSideEffectsCompilerSynthesizedExternsInputAstRootFirst = ((Node) getFieldValue(checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialCheckSideEffectsCompilerSynthesizedExternsInputAstRootFirst == finalCheckSideEffectsCompilerSynthesizedExternsInputAstRootFirst);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 *  */
    @Test
    public void testAddExtern() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        AbstractCompiler checkSideEffectsCompiler = ((AbstractCompiler) getFieldValue(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler"));
        CompilerInput checkSideEffectsCompilerCompilerSynthesizedExternsInput = ((CompilerInput) getFieldValue(checkSideEffectsCompiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput"));
        SourceAst checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst = ((SourceAst) getFieldValue(checkSideEffectsCompilerCompilerSynthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast"));
        Node checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot = ((Node) getFieldValue(checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst, "com.google.javascript.jscomp.JsAst", "root"));
        Node initialCheckSideEffectsCompilerSynthesizedExternsInputAstRootFirst = ((Node) getFieldValue(checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot, "com.google.javascript.rhino.Node", "first"));
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        
        AbstractCompiler checkSideEffectsCompiler1 = ((AbstractCompiler) getFieldValue(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler"));
        CompilerInput checkSideEffectsCompiler1CompilerSynthesizedExternsInput = ((CompilerInput) getFieldValue(checkSideEffectsCompiler1, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput"));
        SourceAst checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst = ((SourceAst) getFieldValue(checkSideEffectsCompiler1CompilerSynthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast"));
        Node checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot = ((Node) getFieldValue(checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst, "com.google.javascript.jscomp.JsAst", "root"));
        Node finalCheckSideEffectsCompilerSynthesizedExternsInputAstRootFirst = ((Node) getFieldValue(checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialCheckSideEffectsCompilerSynthesizedExternsInputAstRootFirst == finalCheckSideEffectsCompilerSynthesizedExternsInputAstRootFirst);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 *  */
    @Test
    public void testAddExtern_2() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        CodeChangeHandler.RecentChange recentChange = ((CodeChangeHandler.RecentChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$RecentChange"));
        codeChangeHandlers.add(recentChange);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(132);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "next", next);
        setField(last, "com.google.javascript.rhino.Node", "parent", root);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        AbstractCompiler checkSideEffectsCompiler = ((AbstractCompiler) getFieldValue(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler"));
        CompilerInput checkSideEffectsCompilerCompilerSynthesizedExternsInput = ((CompilerInput) getFieldValue(checkSideEffectsCompiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput"));
        SourceAst checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst = ((SourceAst) getFieldValue(checkSideEffectsCompilerCompilerSynthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast"));
        Node checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot = ((Node) getFieldValue(checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst, "com.google.javascript.jscomp.JsAst", "root"));
        Node initialCheckSideEffectsCompilerSynthesizedExternsInputAstRootLast = ((Node) getFieldValue(checkSideEffectsCompilerCompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot, "com.google.javascript.rhino.Node", "last"));
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        
        AbstractCompiler checkSideEffectsCompiler1 = ((AbstractCompiler) getFieldValue(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler"));
        CompilerInput checkSideEffectsCompiler1CompilerSynthesizedExternsInput = ((CompilerInput) getFieldValue(checkSideEffectsCompiler1, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput"));
        SourceAst checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst = ((SourceAst) getFieldValue(checkSideEffectsCompiler1CompilerSynthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast"));
        Node checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot = ((Node) getFieldValue(checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAst, "com.google.javascript.jscomp.JsAst", "root"));
        Node finalCheckSideEffectsCompilerSynthesizedExternsInputAstRootLast = ((Node) getFieldValue(checkSideEffectsCompiler1CompilerSynthesizedExternsInputCompilerSynthesizedExternsInputAstCompilerSynthesizedExternsInputAstRoot, "com.google.javascript.rhino.Node", "last"));
        
        assertFalse(initialCheckSideEffectsCompilerSynthesizedExternsInputAstRootLast == finalCheckSideEffectsCompilerSynthesizedExternsInputAstRootLast);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method addExtern()
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: input.getAstRoot(compiler).addChildrenToBack(var);
 *  */
    @Test
    public void testAddExtern_ThrowClassCastException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.addExtern] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.InputId ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.InputId is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @fe1af62)]
            com.google.javascript.rhino.Node.getInputId(Node.java:1124)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:120)
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:186) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        try {
            addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#addChildrenToBack(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: input.getAstRoot(compiler).addChildrenToBack(var);
 *  */
    @Test
    public void testAddExtern_ThrowNullPointerException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast1 = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast2 = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        SyntheticAst ast3 = ((SyntheticAst) createInstance("com.google.javascript.jscomp.SyntheticAst"));
        setField(ast2, "com.google.javascript.jscomp.CompilerInput", "ast", ast3);
        setField(ast1, "com.google.javascript.jscomp.CompilerInput", "ast", ast2);
        setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.addExtern] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:186) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        try {
            addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method addExtern()
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testAddExtern_ThrowUnsupportedOperationException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        try {
            addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: input.getAstRoot(compiler).addChildrenToBack(var);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAddExtern_ThrowIllegalStateException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast1 = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(ast1, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        try {
            addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: input.getAstRoot(compiler).addChildrenToBack(var);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testAddExtern_ThrowIllegalArgumentException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(132);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        try {
            addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#reportCodeChange()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: compiler.reportCodeChange();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testAddExtern_ThrowIllegalStateException_1() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        CodeChangeHandler.ForbiddenChange forbiddenChange = ((CodeChangeHandler.ForbiddenChange) createInstance("com.google.javascript.jscomp.CodeChangeHandler$ForbiddenChange"));
        codeChangeHandlers.add(forbiddenChange);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(132);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "next", next);
        setField(last, "com.google.javascript.rhino.Node", "parent", root);
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        try {
            addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: input.getAstRoot(compiler).addChildrenToBack(var);
 *  */
    @Test(expected = NullPointerException.class)
    public void testAddExtern_ThrowNullPointerException_1() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        root.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        try {
            addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method addExtern()
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.CheckSideEffects}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#addExtern()}
     */
    @Test
    public void testAddExternThrowsNPE() throws Throwable  {
        CheckLevel checkLevel = CheckLevel.WARNING;
        CheckSideEffects checkSideEffects = new CheckSideEffects(null, checkLevel, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.addExtern] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:185) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Method addExternMethod = checkSideEffectsClazz.getDeclaredMethod("addExtern");
        addExternMethod.setAccessible(true);
        java.lang.Object[] addExternMethodArguments = new java.lang.Object[0];
        try {
            addExternMethod.invoke(checkSideEffects, addExternMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for addExtern
    
    public void testAddExtern_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 14 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckSideEffects.hotSwapScript
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.hotSwapScript(CheckSideEffects.java:80) */
        checkSideEffects.hotSwapScript(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_1() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.hotSwapScript(CheckSideEffects.java:80) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = checkSideEffectsClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(checkSideEffects, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_2() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.hotSwapScript(CheckSideEffects.java:80) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = checkSideEffectsClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(checkSideEffects, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_4() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.hotSwapScript(CheckSideEffects.java:80) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = checkSideEffectsClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(checkSideEffects, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_3() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.hotSwapScript(CheckSideEffects.java:80) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = checkSideEffectsClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        try {
            hotSwapScriptMethod.invoke(checkSideEffects, hotSwapScriptMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_5() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:455)
            com.google.javascript.jscomp.CheckSideEffects.hotSwapScript(CheckSideEffects.java:80) */
        checkSideEffects.hotSwapScript(node, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testHotSwapScript1() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method hotSwapScriptMethod = checkSideEffectsClazz.getDeclaredMethod("hotSwapScript", stringNodeType, stringNodeType);
        hotSwapScriptMethod.setAccessible(true);
        java.lang.Object[] hotSwapScriptMethodArguments = new java.lang.Object[2];
        hotSwapScriptMethodArguments[0] = stringNode;
        hotSwapScriptMethodArguments[1] = ((Object) null);
        hotSwapScriptMethod.invoke(checkSideEffects, hotSwapScriptMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields884444776020900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields884444776020900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass884444776027100 = (java.lang.reflect.Field[]) methodForGetDeclaredFields884444776020900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass884444776027100).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields884444776318000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields884444776318000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass884444776321400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields884444776318000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass884444776321400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

