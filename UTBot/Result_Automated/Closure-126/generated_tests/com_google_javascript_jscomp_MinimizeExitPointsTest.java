package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_MinimizeExitPointsTest {
    ///region Test suites for executable com.google.javascript.jscomp.MinimizeExitPoints.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_SwitchNGetTypeCasedefault() {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = new Node(-255);
        
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_MinimizeExitPointsTryMinimizeExits() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(4);
        setField(last, "com.google.javascript.rhino.Node", "first", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = minimizeExitPointsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(minimizeExitPoints, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(113);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_1() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(113);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_2() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(126);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(116);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = minimizeExitPointsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(minimizeExitPoints, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_4() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(126);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(116);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = minimizeExitPointsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(minimizeExitPoints, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_3() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(126);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(116);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = minimizeExitPointsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(minimizeExitPoints, visitMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.visit(MinimizeExitPoints.java:49) */
        minimizeExitPoints.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.getLastChild()
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = new Node(126);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.visit(MinimizeExitPoints.java:52) */
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryMinimizeExits(NodeUtil.getLoopCodeBlock(n), Token.CONTINUE, null);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_6() {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = new Node(113);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109)
            com.google.javascript.jscomp.MinimizeExitPoints.visit(MinimizeExitPoints.java:57) */
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryMinimizeExits(NodeUtil.getLoopCodeBlock(n), Token.CONTINUE, null);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_7() {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = new Node(115);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109)
            com.google.javascript.jscomp.MinimizeExitPoints.visit(MinimizeExitPoints.java:57) */
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getLoopCodeBlock(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryMinimizeExits(NodeUtil.getLoopCodeBlock(n), Token.CONTINUE, null);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_8() {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = new Node(114);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109)
            com.google.javascript.jscomp.MinimizeExitPoints.visit(MinimizeExitPoints.java:61) */
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(108);
        setField(last, "com.google.javascript.rhino.Node", "first", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:118)
            com.google.javascript.jscomp.MinimizeExitPoints.visit(MinimizeExitPoints.java:73) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = minimizeExitPointsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(minimizeExitPoints, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(77);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:129)
            com.google.javascript.jscomp.MinimizeExitPoints.visit(MinimizeExitPoints.java:73) */
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(126);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:150)
            com.google.javascript.jscomp.MinimizeExitPoints.visit(MinimizeExitPoints.java:73) */
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryMinimizeExits(n.getLastChild(), Token.BREAK, n.getFirstChild().getString());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_5() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(126);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109)
            com.google.javascript.jscomp.MinimizeExitPoints.visit(MinimizeExitPoints.java:51) */
        minimizeExitPoints.visit(null, node, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: n.getLastChild()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(126);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: tryMinimizeExits(n.getLastChild(), Token.BREAK, n.getFirstChild().getString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException_1() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(126);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(116);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} 
 *  */
    @Test(expected = RuntimeException.class)
    public void testVisit_ThrowRuntimeException() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(4);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(last, "com.google.javascript.rhino.Node", "parent", parent);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = minimizeExitPointsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(minimizeExitPoints, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testVisit_ThrowIllegalArgumentException() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(4);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "next", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", last);
        setField(last, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        minimizeExitPoints.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getLoopCodeBlock(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testVisit_ThrowIllegalArgumentException_1() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(113);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(117);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", last);
        setField(last, "com.google.javascript.rhino.Node", "parent", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = minimizeExitPointsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(minimizeExitPoints, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MinimizeExitPoints.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:267)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:291)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:489)
            com.google.javascript.jscomp.MinimizeExitPoints.process(MinimizeExitPoints.java:44) */
        minimizeExitPoints.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:267)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:291)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:489)
            com.google.javascript.jscomp.MinimizeExitPoints.process(MinimizeExitPoints.java:44) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(minimizeExitPoints, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:267)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:291)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:489)
            com.google.javascript.jscomp.MinimizeExitPoints.process(MinimizeExitPoints.java:44) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(minimizeExitPoints, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:267)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:291)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:489)
            com.google.javascript.jscomp.MinimizeExitPoints.process(MinimizeExitPoints.java:44) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(minimizeExitPoints, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:267)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:291)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:489)
            com.google.javascript.jscomp.MinimizeExitPoints.process(MinimizeExitPoints.java:44) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(minimizeExitPoints, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "compiler", compiler);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        compiler.setPhaseOptimizer(phaseOptimizer);
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        AbstractCompiler abstractCompiler = minimizeExitPoints.compiler;
        PhaseOptimizer abstractCompilerCompilerPhaseOptimizer = ((PhaseOptimizer) getFieldValue(abstractCompiler, "com.google.javascript.jscomp.Compiler", "phaseOptimizer"));
        Node initialMinimizeExitPointsCompilerPhaseOptimizerCurrentScope = ((Node) getFieldValue(abstractCompilerCompilerPhaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentScope"));
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        processMethod.invoke(minimizeExitPoints, processMethodArguments);
        
        AbstractCompiler abstractCompiler1 = minimizeExitPoints.compiler;
        PhaseOptimizer abstractCompiler1CompilerPhaseOptimizer = ((PhaseOptimizer) getFieldValue(abstractCompiler1, "com.google.javascript.jscomp.Compiler", "phaseOptimizer"));
        Node finalMinimizeExitPointsCompilerPhaseOptimizerCurrentScope = ((Node) getFieldValue(abstractCompiler1CompilerPhaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "currentScope"));
        
        assertFalse(initialMinimizeExitPointsCompilerPhaseOptimizerCurrentScope == finalMinimizeExitPointsCompilerPhaseOptimizerCurrentScope);
    }
    
    @Test
    public void testProcess2() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        processMethod.invoke(minimizeExitPoints, processMethodArguments);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        Object jsRoot = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(jsRoot, "com.google.javascript.rhino.Node", "first", first);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "jsRoot", jsRoot);
        PhaseOptimizer phaseOptimizer = ((PhaseOptimizer) createInstance("com.google.javascript.jscomp.PhaseOptimizer"));
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "compiler", compiler);
        setField(phaseOptimizer, "com.google.javascript.jscomp.PhaseOptimizer", "inLoop", true);
        compiler.setPhaseOptimizer(phaseOptimizer);
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(compiler);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = jsRoot;
        processMethod.invoke(minimizeExitPoints, processMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess4() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:267)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:291)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:489)
            com.google.javascript.jscomp.MinimizeExitPoints.process(MinimizeExitPoints.java:44) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(minimizeExitPoints, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testProcess5() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(minimizeExitPoints, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testProcess6() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = minimizeExitPointsClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(minimizeExitPoints, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryMinimizeIfBlockExits(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_Return_2() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_Return_3() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", nodeType, nodeType, nodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = node;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = 4;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_NodeGetLastChild() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-2);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_Return() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_Return_1() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = string;
        tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_NodeGetNext() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_Return_4() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = " ";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = string;
        tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryMinimizeIfBlockExits(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: srcBlock.isBlock()
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_ThrowNullPointerException() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(MinimizeExitPoints.java:222) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", nodeType, nodeType, nodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ifNode.getNext() != null
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_ThrowNullPointerException_1() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(MinimizeExitPoints.java:240) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: ifNode.getNext() != null
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_ThrowNullPointerException_2() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = " ";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(MinimizeExitPoints.java:240) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class strType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, strType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = str;
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !matchingExitNode(exitNode, exitType, labelName)
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_ThrowNullPointerException_7() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(MinimizeExitPoints.java:235) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (destBlock == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isEmpty()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isBlock()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: moveAllFollowing(ifNode, ifNode.getParent(), newDestBlock);
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_ThrowNullPointerException_4() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Node node = new Node(125);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(-255);
        setField(stringNode1, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(stringNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(MinimizeExitPoints.java:304)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(MinimizeExitPoints.java:260) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", stringNodeType, stringNodeType, stringNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = node;
        tryMinimizeIfBlockExitsMethodArguments[2] = stringNode1;
        tryMinimizeIfBlockExitsMethodArguments[3] = 4;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (destBlock == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_ThrowNullPointerException_6() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(4);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(105);
        setField(stringNode1, "com.google.javascript.rhino.Node", "next", stringNode1);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        setField(first, "com.google.javascript.rhino.Node", "first", stringNode1);
        setField(stringNode1, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode1, "com.google.javascript.rhino.Node", "parent", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(MinimizeExitPoints.java:261) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", stringNodeType, stringNodeType, stringNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = stringNode1;
        tryMinimizeIfBlockExitsMethodArguments[3] = 4;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (destBlock == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: moveAllFollowing(ifNode, ifNode.getParent(), newDestBlock);
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_ThrowNullPointerException_3() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = new Node(4);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(105);
        setField(next, "com.google.javascript.rhino.Node", "parent", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(MinimizeExitPoints.java:304)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(MinimizeExitPoints.java:260) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", nodeType, nodeType, nodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = node;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[3] = 4;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (destBlock == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testTryMinimizeIfBlockExits_ThrowNullPointerException_5() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(next, "com.google.javascript.rhino.Node", "last", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", next);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeIfBlockExits(MinimizeExitPoints.java:261) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[3] = 4;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryMinimizeIfBlockExits(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !matchingExitNode(exitNode, exitType, labelName)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeIfBlockExits_ThrowIllegalStateException() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", nodeType, nodeType, nodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = node;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = string;
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !matchingExitNode(exitNode, exitType, labelName)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeIfBlockExits_ThrowIllegalStateException_1() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", nodeType, nodeType, nodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = node;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = string;
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (destBlock == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isEmpty()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#replaceChild(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryMinimizeIfBlockExits_ThrowUnsupportedOperationException_3() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(124);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode1, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode1, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[2] = numberNode1;
        tryMinimizeIfBlockExitsMethodArguments[3] = 4;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryMinimizeIfBlockExits_ThrowUnsupportedOperationException_1() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(next1, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryMinimizeIfBlockExits_ThrowUnsupportedOperationException_2() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = node;
        tryMinimizeIfBlockExitsMethodArguments[3] = 4;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTryMinimizeIfBlockExits_ThrowUnsupportedOperationException() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next1, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", numberNodeType, numberNodeType, numberNodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = numberNode;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[3] = -255;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (destBlock == null): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeIfBlockExits_ThrowIllegalStateException_2() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = new Node(4);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(105);
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", nodeType, nodeType, nodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = node;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[3] = 4;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeIfBlockExits(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (destBlock == null): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: moveAllFollowing(ifNode, ifNode.getParent(), newDestBlock);
 *  */
    @Test(expected = RuntimeException.class)
    public void testTryMinimizeIfBlockExits_ThrowRuntimeException() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = new Node(4);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "sourcePosition", -255);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", parent);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeIfBlockExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeIfBlockExits", nodeType, nodeType, nodeType, intType, stringType);
        tryMinimizeIfBlockExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeIfBlockExitsMethodArguments = new java.lang.Object[5];
        tryMinimizeIfBlockExitsMethodArguments[0] = node;
        tryMinimizeIfBlockExitsMethodArguments[1] = ((Object) null);
        tryMinimizeIfBlockExitsMethodArguments[2] = stringNode;
        tryMinimizeIfBlockExitsMethodArguments[3] = 4;
        tryMinimizeIfBlockExitsMethodArguments[4] = ((Object) null);
        try {
            tryMinimizeIfBlockExitsMethod.invoke(minimizeExitPoints, tryMinimizeIfBlockExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryMinimizeExits(com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): False}
 * @utbot.executesCondition {@code (n.isIf()): False}
 * @utbot.executesCondition {@code (n.isTry()): False}
 * @utbot.executesCondition {@code (n.isLabel()): False}
 * @utbot.executesCondition {@code (!n.isBlock()): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeExits_NIsBlock() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 4;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): False}
 * @utbot.executesCondition {@code (n.isIf()): False}
 * @utbot.executesCondition {@code (n.isTry()): False}
 * @utbot.executesCondition {@code (n.isLabel()): False}
 * @utbot.executesCondition {@code (!n.isBlock()): True}
 * @utbot.executesCondition {@code (n.getLastChild() == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeExits_NGetLastChildEqualsNull() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 125;
        tryMinimizeExitsMethodArguments[2] = string;
        tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#removeChild(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#reportCodeChange()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTryMinimizeExits_MatchingExitNode() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(77);
        setField(parent, "com.google.javascript.rhino.Node", "first", last);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 125;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        
        Node finalNumberNodeLast = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "last"));
        
        assertNull(finalNumberNodeLast);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryMinimizeExits(com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: matchingExitNode(n, exitType, labelName)
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException() {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109) */
        minimizeExitPoints.tryMinimizeExits(null, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): False}
 * @utbot.executesCondition {@code (n.isIf()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node ifBlock = n.getFirstChild().getNext();
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_1() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:117) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = -255;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): False}
 * @utbot.executesCondition {@code (n.isIf()): False}
 * @utbot.executesCondition {@code (n.isTry()): False}
 * @utbot.executesCondition {@code (n.isLabel()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.triggersRecursion tryMinimizeExits, where the test invoke:
 *     {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryMinimizeExits(labelBlock, exitType, labelName);
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_2() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(126);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:150) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = -255;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): False}
 * @utbot.executesCondition {@code (n.isIf()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node ifBlock = n.getFirstChild().getNext();
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_5() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:117) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 108;
        tryMinimizeExitsMethodArguments[2] = string;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): False}
 * @utbot.executesCondition {@code (n.isIf()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.triggersRecursion tryMinimizeExits, where the test invoke:
 *     {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: tryMinimizeExits(ifBlock, exitType, labelName);
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_6() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:109)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:118) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 108;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): False}
 * @utbot.executesCondition {@code (n.isIf()): False}
 * @utbot.executesCondition {@code (n.isTry()): False}
 * @utbot.executesCondition {@code (n.isLabel()): False}
 * @utbot.executesCondition {@code (!n.isBlock()): True}
 * @utbot.executesCondition {@code (n.getLastChild() == null): False}
 * @utbot.iterates iterate the loop {@code for(Node c: n.children())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: trueBlock = ifTree.getFirstChild().getNext();
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_3() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(125);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(108);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:172) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", stringNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = stringNode;
        tryMinimizeExitsMethodArguments[1] = -256;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_7() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-256);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        setField(parent, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:111) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = -256;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): False}
 * @utbot.executesCondition {@code (n.isIf()): False}
 * @utbot.executesCondition {@code (n.isTry()): False}
 * @utbot.executesCondition {@code (n.isLabel()): False}
 * @utbot.executesCondition {@code (!n.isBlock()): True}
 * @utbot.executesCondition {@code (n.getLastChild() == null): False}
 * @utbot.iterates iterate the loop {@code for(Node c: n.children())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: falseBlock = trueBlock.getNext();
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_4() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(108);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:173) */
        minimizeExitPoints.tryMinimizeExits(node, -255, null);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_8() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(132);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", numberNode);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:111) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = -255;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_9() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", numberNode);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:111) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = -255;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_11() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(125);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(120);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", next1);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        setField(parent, "com.google.javascript.rhino.Node", "first", numberNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:111) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 4;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testTryMinimizeExits_ThrowNullPointerException_10() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(125);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next1)).setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:111) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 4;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryMinimizeExits(com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: matchingExitNode(n, exitType, labelName)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits_ThrowIllegalStateException() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = -255;
        tryMinimizeExitsMethodArguments[2] = string;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: matchingExitNode(n, exitType, labelName)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits_ThrowIllegalStateException_1() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = -255;
        tryMinimizeExitsMethodArguments[2] = string;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: NodeUtil.removeChild(n.getParent(), n);
 *  */
    @Test(expected = RuntimeException.class)
    public void testTryMinimizeExits_ThrowRuntimeException() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(132);
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = -255;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: NodeUtil.removeChild(n.getParent(), n);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryMinimizeExits_ThrowIllegalArgumentException() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = " ";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(parent, "com.google.javascript.rhino.Node", "parent", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        minimizeExitPoints.tryMinimizeExits(node, 120, str);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: NodeUtil.removeChild(n.getParent(), n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits_ThrowIllegalStateException_2() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(77);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 120;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: NodeUtil.removeChild(n.getParent(), n);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryMinimizeExits_ThrowIllegalArgumentException_1() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-256);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = -256;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: NodeUtil.removeChild(n.getParent(), n);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryMinimizeExits_ThrowIllegalArgumentException_3() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(-255);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 4;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#tryMinimizeExits(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (matchingExitNode(n, exitType, labelName)): True}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: NodeUtil.removeChild(n.getParent(), n);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTryMinimizeExits_ThrowIllegalArgumentException_2() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(120);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", next1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", stringNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = stringNode;
        tryMinimizeExitsMethodArguments[1] = 120;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tryMinimizeExits(com.google.javascript.rhino.Node, int, java.lang.String)
    
    @Test
    public void testTryMinimizeExits1() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 108;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
    }
    
    @Test
    public void testTryMinimizeExits2() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        minimizeExitPoints.tryMinimizeExits(node, 0, null);
    }
    
    @Test
    public void testTryMinimizeExits3() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        String string = "";
        
        minimizeExitPoints.tryMinimizeExits(node, 125, string);
    }
    
    @Test
    public void testTryMinimizeExits4() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 0;
        tryMinimizeExitsMethodArguments[2] = string;
        tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
    }
    
    @Test
    public void testTryMinimizeExits5() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = "\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 0;
        tryMinimizeExitsMethodArguments[2] = string;
        tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
    }
    
    @Test
    public void testTryMinimizeExits6() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        String string = "";
        
        minimizeExitPoints.tryMinimizeExits(node, 0, string);
    }
    
    @Test
    public void testTryMinimizeExits7() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = "\u0000";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 108;
        tryMinimizeExitsMethodArguments[2] = string;
        tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tryMinimizeExits(com.google.javascript.rhino.Node, int, java.lang.String)
    
    @Test
    public void testTryMinimizeExits8() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(NodeUtil.java:1786)
            com.google.javascript.jscomp.NodeUtil.removeChild(NodeUtil.java:1799)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:110)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:195) */
        minimizeExitPoints.tryMinimizeExits(node, 0, null);
    }
    
    @Test
    public void testTryMinimizeExits9() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(NodeUtil.java:1786)
            com.google.javascript.jscomp.NodeUtil.removeChild(NodeUtil.java:1799)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:110)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:118) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 0;
        tryMinimizeExitsMethodArguments[2] = string;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeExits10() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = "\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.hasCatchHandler(NodeUtil.java:2807)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:131) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 77;
        tryMinimizeExitsMethodArguments[2] = string;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeExits11() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(125);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(NodeUtil.java:1786)
            com.google.javascript.jscomp.NodeUtil.removeChild(NodeUtil.java:1799)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:110)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:195) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 0;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeExits12() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(77);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", first);
        String string = "\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isTryCatchNodeContainer(NodeUtil.java:1794)
            com.google.javascript.jscomp.NodeUtil.removeChild(NodeUtil.java:1812)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:110) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", stringNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = stringNode;
        tryMinimizeExitsMethodArguments[1] = 0;
        tryMinimizeExitsMethodArguments[2] = string;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeExits13() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = "\u0000\u0000";
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isTryFinallyNode(NodeUtil.java:1786)
            com.google.javascript.jscomp.NodeUtil.removeChild(NodeUtil.java:1799)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:110) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 0;
        tryMinimizeExitsMethodArguments[2] = string;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeExits14() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next4 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next3, "com.google.javascript.rhino.Node", "next", next4);
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.hasFinally(NodeUtil.java:2789)
            com.google.javascript.jscomp.NodeUtil.removeChild(NodeUtil.java:1810)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:110) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 120;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTryMinimizeExits15() throws Exception  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:2057)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:111) */
        minimizeExitPoints.tryMinimizeExits(node, 125, null);
    }
    
    @Test
    public void testTryMinimizeExits16() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        ArrayList codeChangeHandlers = new ArrayList();
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        codeChangeHandlers.add(null);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(125);
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:2057)
            com.google.javascript.jscomp.MinimizeExitPoints.tryMinimizeExits(MinimizeExitPoints.java:111) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 4;
        tryMinimizeExitsMethodArguments[2] = string;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method tryMinimizeExits(com.google.javascript.rhino.Node, int, java.lang.String)
    
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits17() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 4;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits18() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        minimizeExitPoints.tryMinimizeExits(node, 0, str);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits19() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "parent", parent);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 0;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits20() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(77);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        setField(parent, "com.google.javascript.rhino.Node", "next", first);
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class strType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, strType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 120;
        tryMinimizeExitsMethodArguments[2] = str;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testTryMinimizeExits21() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(77);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 120;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits22() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", parent);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 4;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testTryMinimizeExits23() throws Exception  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(108);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(4);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", parent);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parent, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "last", next);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        minimizeExitPoints.tryMinimizeExits(node, 4, null);
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits24() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", parent);
        setField(first1, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class strType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, strType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 0;
        tryMinimizeExitsMethodArguments[2] = str;
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testTryMinimizeExits25() throws Throwable  {
        MinimizeExitPoints minimizeExitPoints = new MinimizeExitPoints(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(77);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next2, "com.google.javascript.rhino.Node", "next", next3);
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method tryMinimizeExitsMethod = minimizeExitPointsClazz.getDeclaredMethod("tryMinimizeExits", numberNodeType, intType, stringType);
        tryMinimizeExitsMethod.setAccessible(true);
        java.lang.Object[] tryMinimizeExitsMethodArguments = new java.lang.Object[3];
        tryMinimizeExitsMethodArguments[0] = numberNode;
        tryMinimizeExitsMethodArguments[1] = 0;
        tryMinimizeExitsMethodArguments[2] = ((Object) null);
        try {
            tryMinimizeExitsMethod.invoke(minimizeExitPoints, tryMinimizeExitsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method moveAllFollowing(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testMoveAllFollowing() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", numberNodeType, numberNodeType, numberNodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = numberNode;
        moveAllFollowingMethodArguments[1] = ((Object) null);
        moveAllFollowingMethodArguments[2] = ((Object) null);
        moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testMoveAllFollowing_3() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(125);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", node);
        setField(node1, "com.google.javascript.rhino.Node", "first", first);
        setField(node1, "com.google.javascript.rhino.Node", "last", node);
        Node node2 = new Node(0);
        
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node node1First = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "first"));
        Node node1FirstFirstNext = ((Node) getFieldValue(node1First, "com.google.javascript.rhino.Node", "next"));
        Node initialNode1FirstNextParent = ((Node) getFieldValue(node1FirstFirstNext, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNode2First = ((Node) getFieldValue(node2, "com.google.javascript.rhino.Node", "first"));
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", nodeType, nodeType, nodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = node;
        moveAllFollowingMethodArguments[1] = node1;
        moveAllFollowingMethodArguments[2] = node2;
        moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node node1First1 = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "first"));
        Node node1First1FirstNext = ((Node) getFieldValue(node1First1, "com.google.javascript.rhino.Node", "next"));
        Node finalNode1FirstNextParent = ((Node) getFieldValue(node1First1FirstNext, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNode2First = ((Node) getFieldValue(node2, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialNode1FirstNextParent == finalNode1FirstNextParent);
        
        assertFalse(initialNode2First == finalNode2First);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testMoveAllFollowing_1() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", node);
        Node node1 = new Node(0);
        
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node stringNodeFirst = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node initialStringNodeFirstParent = ((Node) getFieldValue(stringNodeFirst, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNode1First = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "first"));
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", nodeType, nodeType, nodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = node;
        moveAllFollowingMethodArguments[1] = stringNode;
        moveAllFollowingMethodArguments[2] = node1;
        moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node stringNodeFirst1 = ((Node) getFieldValue(stringNode, "com.google.javascript.rhino.Node", "first"));
        Node finalStringNodeFirstParent = ((Node) getFieldValue(stringNodeFirst1, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNode1First = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialStringNodeFirstParent == finalStringNodeFirstParent);
        
        assertFalse(initialNode1First == finalNode1First);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testMoveAllFollowing_4() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        setField(node, "com.google.javascript.rhino.Node", "first", node);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(126);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node1, "com.google.javascript.rhino.Node", "last", parent);
        
        Node initialNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNodeParent1 = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node initialNode1First = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "first"));
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", nodeType, nodeType, nodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = node;
        moveAllFollowingMethodArguments[1] = node;
        moveAllFollowingMethodArguments[2] = node1;
        moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        
        Node finalNodeParent = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNodeParent1 = ((Node) getFieldValue(node, "com.google.javascript.rhino.Node", "parent"));
        
        Node finalNode1First = ((Node) getFieldValue(node1, "com.google.javascript.rhino.Node", "first"));
        
        assertFalse(initialNodeParent == finalNodeParent);
        
        assertFalse(initialNodeParent1 == finalNodeParent1);
        
        assertFalse(initialNode1First == finalNode1First);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testMoveAllFollowing_2() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(16);
        setField(node, "com.google.javascript.rhino.Node", "next", node);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node1, "com.google.javascript.rhino.Node", "first", node);
        setField(node1, "com.google.javascript.rhino.Node", "last", node);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", nodeType, nodeType, nodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = node;
        moveAllFollowingMethodArguments[1] = node1;
        moveAllFollowingMethodArguments[2] = node;
        moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method moveAllFollowing(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node n = start.getNext(); n != null; n = start.getNext())
 *  */
    @Test
    public void testMoveAllFollowing_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(MinimizeExitPoints.java:302) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", nodeType, nodeType, nodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = ((Object) null);
        moveAllFollowingMethodArguments[1] = ((Object) null);
        moveAllFollowingMethodArguments[2] = ((Object) null);
        try {
            moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: srcParent.removeChild(n);
 *  */
    @Test
    public void testMoveAllFollowing_ThrowNullPointerException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(MinimizeExitPoints.java:304) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", numberNodeType, numberNodeType, numberNodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = numberNode;
        moveAllFollowingMethodArguments[1] = ((Object) null);
        moveAllFollowingMethodArguments[2] = ((Object) null);
        try {
            moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: srcParent.removeChild(n);
 *  */
    @Test
    public void testMoveAllFollowing_ThrowNullPointerException_4() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(MinimizeExitPoints.java:304) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", stringNodeType, stringNodeType, stringNodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = stringNode;
        moveAllFollowingMethodArguments[1] = ((Object) null);
        moveAllFollowingMethodArguments[2] = ((Object) null);
        try {
            moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: destParent.addChildToFront(n);
 *  */
    @Test
    public void testMoveAllFollowing_ThrowNullPointerException_5() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(125);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(MinimizeExitPoints.java:306) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", stringNodeType, stringNodeType, stringNodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = stringNode;
        moveAllFollowingMethodArguments[1] = node;
        moveAllFollowingMethodArguments[2] = ((Object) null);
        try {
            moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: destParent.addChildToBack(n);
 *  */
    @Test
    public void testMoveAllFollowing_ThrowNullPointerException_2() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", next);
        setField(node, "com.google.javascript.rhino.Node", "last", next);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(MinimizeExitPoints.java:308) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", numberNodeType, numberNodeType, numberNodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = numberNode;
        moveAllFollowingMethodArguments[1] = node;
        moveAllFollowingMethodArguments[2] = ((Object) null);
        try {
            moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: destParent.addChildToBack(n);
 *  */
    @Test
    public void testMoveAllFollowing_ThrowNullPointerException_3() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-254);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(next1, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", next1);
        
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.moveAllFollowing(MinimizeExitPoints.java:308) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", numberNodeType, numberNodeType, numberNodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = numberNode;
        moveAllFollowingMethodArguments[1] = stringNode;
        moveAllFollowingMethodArguments[2] = ((Object) null);
        try {
            moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method moveAllFollowing(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: srcParent.removeChild(n);
 *  */
    @Test(expected = RuntimeException.class)
    public void testMoveAllFollowing_ThrowRuntimeException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", numberNodeType, numberNodeType, numberNodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = numberNode;
        moveAllFollowingMethodArguments[1] = node;
        moveAllFollowingMethodArguments[2] = ((Object) null);
        try {
            moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#moveAllFollowing(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMoveAllFollowing_ThrowIllegalStateException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method moveAllFollowingMethod = minimizeExitPointsClazz.getDeclaredMethod("moveAllFollowing", numberNodeType, numberNodeType, numberNodeType);
        moveAllFollowingMethod.setAccessible(true);
        java.lang.Object[] moveAllFollowingMethodArguments = new java.lang.Object[3];
        moveAllFollowingMethodArguments[0] = numberNode;
        moveAllFollowingMethodArguments[1] = ((Object) null);
        moveAllFollowingMethodArguments[2] = ((Object) null);
        try {
            moveAllFollowingMethod.invoke(null, moveAllFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method matchingExitNode(com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (n.getType() == type): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testMatchingExitNode_NGetTypeNotEqualsType() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(1);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", numberNodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = numberNode;
        matchingExitNodeMethodArguments[1] = -255;
        matchingExitNodeMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (n.getType() == type): True}
 * @utbot.executesCondition {@code (type == Token.RETURN): True}
 * @utbot.returnsFrom {@code return !n.hasChildren();}
 *  */
    @Test
    public void testMatchingExitNode_NotNHasChildren_1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", numberNodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = numberNode;
        matchingExitNodeMethodArguments[1] = 4;
        matchingExitNodeMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (n.getType() == type): True}
 * @utbot.executesCondition {@code (type == Token.RETURN): False}
 * @utbot.executesCondition {@code (labelName == null): True}
 * @utbot.returnsFrom {@code return !n.hasChildren();}
 *  */
    @Test
    public void testMatchingExitNode_NotNHasChildren_2() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", numberNodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = numberNode;
        matchingExitNodeMethodArguments[1] = -255;
        matchingExitNodeMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (n.getType() == type): True}
 * @utbot.executesCondition {@code (type == Token.RETURN): True}
 * @utbot.returnsFrom {@code return !n.hasChildren();}
 *  */
    @Test
    public void testMatchingExitNode_NotNHasChildren() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", numberNodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = numberNode;
        matchingExitNodeMethodArguments[1] = 4;
        matchingExitNodeMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (n.getType() == type): True}
 * @utbot.executesCondition {@code (type == Token.RETURN): False}
 * @utbot.executesCondition {@code (labelName == null): False}
 * @utbot.returnsFrom {@code return n.hasChildren() && labelName.equals(n.getFirstChild().getString());}
 *  */
    @Test
    public void testMatchingExitNode_NHasChildrenAndLabelNameEquals() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", numberNodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = numberNode;
        matchingExitNodeMethodArguments[1] = -255;
        matchingExitNodeMethodArguments[2] = string;
        boolean actual = ((Boolean) matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (n.getType() == type): True}
 * @utbot.executesCondition {@code (type == Token.RETURN): False}
 * @utbot.executesCondition {@code (labelName == null): True}
 * @utbot.returnsFrom {@code return !n.hasChildren();}
 *  */
    @Test
    public void testMatchingExitNode_NotNHasChildren_3() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", numberNodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = numberNode;
        matchingExitNodeMethodArguments[1] = -255;
        matchingExitNodeMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (n.getType() == type): True}
 * @utbot.executesCondition {@code (type == Token.RETURN): False}
 * @utbot.executesCondition {@code (labelName == null): False}
 * @utbot.executesCondition {@code (labelName.equals(n.getFirstChild().getString())): False}
 * @utbot.returnsFrom {@code return n.hasChildren() && labelName.equals(n.getFirstChild().getString());}
 *  */
    @Test
    public void testMatchingExitNode_NotLabelNameEquals() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = " ";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", numberNodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = numberNode;
        matchingExitNodeMethodArguments[1] = -255;
        matchingExitNodeMethodArguments[2] = string;
        boolean actual = ((Boolean) matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.executesCondition {@code (n.getType() == type): True}
 * @utbot.executesCondition {@code (type == Token.RETURN): False}
 * @utbot.executesCondition {@code (labelName == null): False}
 * @utbot.executesCondition {@code (labelName.equals(n.getFirstChild().getString())): True}
 * @utbot.returnsFrom {@code return n.hasChildren() && labelName.equals(n.getFirstChild().getString());}
 *  */
    @Test
    public void testMatchingExitNode_LabelNameEquals() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class strType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", stringNodeType, intType, strType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = stringNode;
        matchingExitNodeMethodArguments[1] = -255;
        matchingExitNodeMethodArguments[2] = str;
        boolean actual = ((Boolean) matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method matchingExitNode(com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == type
 *  */
    @Test
    public void testMatchingExitNode_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.MinimizeExitPoints.matchingExitNode(MinimizeExitPoints.java:277) */
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", nodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = ((Object) null);
        matchingExitNodeMethodArguments[1] = -255;
        matchingExitNodeMethodArguments[2] = ((Object) null);
        try {
            matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method matchingExitNode(com.google.javascript.rhino.Node, int, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: labelName.equals(n.getFirstChild().getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMatchingExitNode_ThrowIllegalStateException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", numberNodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = numberNode;
        matchingExitNodeMethodArguments[1] = -255;
        matchingExitNodeMethodArguments[2] = string;
        try {
            matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link MinimizeExitPoints}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.MinimizeExitPoints#matchingExitNode(com.google.javascript.rhino.Node,int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: labelName.equals(n.getFirstChild().getString())
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMatchingExitNode_ThrowIllegalStateException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        String string = "";
        
        Class minimizeExitPointsClazz = Class.forName("com.google.javascript.jscomp.MinimizeExitPoints");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Class stringType = Class.forName("java.lang.String");
        Method matchingExitNodeMethod = minimizeExitPointsClazz.getDeclaredMethod("matchingExitNode", numberNodeType, intType, stringType);
        matchingExitNodeMethod.setAccessible(true);
        java.lang.Object[] matchingExitNodeMethodArguments = new java.lang.Object[3];
        matchingExitNodeMethodArguments[0] = numberNode;
        matchingExitNodeMethodArguments[1] = -255;
        matchingExitNodeMethodArguments[2] = string;
        try {
            matchingExitNodeMethod.invoke(null, matchingExitNodeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields907221199675200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields907221199675200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass907221199683500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields907221199675200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass907221199683500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields907221200004000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields907221200004000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass907221200008200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields907221200004000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass907221200008200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

