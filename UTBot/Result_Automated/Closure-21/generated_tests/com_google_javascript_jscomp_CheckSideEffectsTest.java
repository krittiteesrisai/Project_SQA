package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.rhino.JSDocInfo;
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
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_Return() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(124);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_Return_1() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(85);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_Return_2() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        Node node = new Node(0);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (isResultUsed): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_IsResultUsed_1() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(16);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(100);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(85);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = numberNode;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (isResultUsed): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_IsResultUsed() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(92);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(85);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = node;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_NodeGetJSDocInfo() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: n.isQualifiedName() && n.getJSDocInfo() != null
 *  */
    @Test
    public void testVisit_ThrowClassCastException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1873)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:107) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
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
 * @utbot.executesCondition {@code (isSimpleOp): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isExpressionResultUsed(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isSimpleOperatorType(int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getCompiler()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (isSimpleOp || !NodeUtil.mayHaveSideEffects(n, t.getCompiler()))
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(56);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(130);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:131) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: n.isQualifiedName() && n.getJSDocInfo() != null
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: n.isQualifiedName() && n.getJSDocInfo() != null
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException_3() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node node = new Node(0);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: n.isQualifiedName() && n.getJSDocInfo() != null
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException_1() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: n.isQualifiedName() && n.getJSDocInfo() != null
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException_2() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node node = new Node(0);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(54);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        setField(node, "com.google.javascript.rhino.Node", "last", parent);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = node;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    @Test
    public void testVisit2() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(85);
        setField(parent, "com.google.javascript.rhino.Node", "first", stringNode);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = stringNode1;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    @Test
    public void testVisit3() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(0);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    @Test
    public void testVisit4() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(85);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(37);
        setField(parent1, "com.google.javascript.rhino.Node", "first", parent);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = numberNode;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    @Test
    public void testVisit5() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(115);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(0);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    
    @Test
    public void testVisit6() throws Exception  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(0);
        
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        visitMethod.invoke(checkSideEffects, visitMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit7() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(27);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(85);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:140) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit8() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(12);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(85);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:140) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = node;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(85);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.functionCallHasSideEffects(NodeUtil.java:1008)
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:867)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:131) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
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
        (((Node) numberNode)).setType(94);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        setField(node, "com.google.javascript.rhino.Node", "last", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.checkForStateChangeHelper(NodeUtil.java:881)
            com.google.javascript.jscomp.NodeUtil.mayHaveSideEffects(NodeUtil.java:781)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:131) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit11() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(26);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        setField(node, "com.google.javascript.rhino.Node", "last", stringNode);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:140) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit12() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(32);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        setField(node, "com.google.javascript.rhino.Node", "last", stringNode);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:140) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit13() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(25);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        setField(node, "com.google.javascript.rhino.Node", "last", stringNode);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:140) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit14() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(19);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        setField(node, "com.google.javascript.rhino.Node", "last", stringNode);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:140) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit15() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(122);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(85);
        setField(node, "com.google.javascript.rhino.Node", "last", stringNode);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:140) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit16() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(85);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3124)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:111) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(checkSideEffects, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit17() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(101);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3113)
            com.google.javascript.jscomp.NodeUtil.isExpressionResultUsed(NodeUtil.java:3121)
            com.google.javascript.jscomp.CheckSideEffects.visit(CheckSideEffects.java:111) */
        Class checkSideEffectsClazz = Class.forName("com.google.javascript.jscomp.CheckSideEffects");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = checkSideEffectsClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
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
    public void testProcess_ThrowNullPointerException_2() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
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
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_4() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
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
    public void testProcess_ThrowNullPointerException_5() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
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
        short[] objectValue = {};
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
    public void testHotSwapScript_ThrowNullPointerException_4() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link CheckSideEffects}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckSideEffects#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException_5() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(132);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
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
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.addExtern] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.InputId ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.InputId is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getInputId(Node.java:1124)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:120)
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:179) */
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
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:179) */
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
        CheckLevel checkLevel = CheckLevel.OFF;
        CheckSideEffects checkSideEffects = new CheckSideEffects(null, checkLevel, false);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.addExtern] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:178) */
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
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.protectSideEffects] produces [java.lang.ClassCastException: class [S cannot be cast to class com.google.javascript.rhino.InputId ([S is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.InputId is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @60349b9b)]
            com.google.javascript.rhino.Node.getInputId(Node.java:1124)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:120)
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:179)
            com.google.javascript.jscomp.CheckSideEffects.protectSideEffects(CheckSideEffects.java:157) */
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
            com.google.javascript.jscomp.CheckSideEffects.protectSideEffects(CheckSideEffects.java:156) */
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
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:178)
            com.google.javascript.jscomp.CheckSideEffects.protectSideEffects(CheckSideEffects.java:157) */
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
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
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
    
    ///region OTHER: ERROR SUITE for method protectSideEffects()
    
    @Test
    public void testProtectSideEffects1() throws Throwable  {
        CheckSideEffects checkSideEffects = ((CheckSideEffects) createInstance("com.google.javascript.jscomp.CheckSideEffects"));
        ArrayList problemNodes = new ArrayList();
        problemNodes.add(null);
        problemNodes.add(null);
        problemNodes.add(null);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "problemNodes", problemNodes);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast1 = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast2 = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Object root = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) root)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(root, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(ast2, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(ast1, "com.google.javascript.jscomp.CompilerInput", "ast", ast2);
        setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "synthesizedExternsInput", synthesizedExternsInput);
        setField(checkSideEffects, "com.google.javascript.jscomp.CheckSideEffects", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckSideEffects.protectSideEffects] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.reportCodeChange(Compiler.java:1947)
            com.google.javascript.jscomp.CheckSideEffects.addExtern(CheckSideEffects.java:180)
            com.google.javascript.jscomp.CheckSideEffects.protectSideEffects(CheckSideEffects.java:157) */
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
        
                java.lang.reflect.Method methodForGetDeclaredFields884231458206600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields884231458206600.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass884231458213500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields884231458206600.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass884231458213500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields884231458596000 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields884231458596000.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass884231458599400 = (java.lang.reflect.Field[]) methodForGetDeclaredFields884231458596000.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass884231458599400).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

