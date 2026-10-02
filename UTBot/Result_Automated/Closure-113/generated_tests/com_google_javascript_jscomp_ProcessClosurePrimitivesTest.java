package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.ArrayDeque;
import java.util.LinkedList;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.jscomp.CodingConventions.Proxy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_ProcessClosurePrimitivesTest {
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_SwitchNGetTypeCasedefault() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getFirstChild().isName()): True}
 * @utbot.executesCondition {@code (!parent.isCall()): False}
 *  */
    @Test
    public void testVisit_ParentIsCall() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = numberNode;
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getFirstChild().isName()): True}
 * @utbot.executesCondition {@code (!parent.isCall()): True}
 * @utbot.executesCondition {@code (!parent.isAssign()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAssign()}
 *  */
    @Test
    public void testVisit_ParentIsAssign() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, nodeType, nodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = node;
        visitMethodArguments[2] = numberNode;
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getFirstChild().isName()): False}
 *  */
    @Test
    public void testVisit_NotNGetFirstChildIsName() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = ((Object) null);
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests activate {@code switch(n.getType()) case: default}, invoke:
    ///     {@link com.google.javascript.rhino.Node#isExprResult()} once,
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.rhino.Node#isGetProp()} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isGetProp()): False}
 *  */
    @Test
    public void testVisit_NotLeftIsGetProp() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = numberNode1;
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isGetProp()): True}
 * @utbot.executesCondition {@code (name.isName() && GOOG.equals(name.getString())): False}
 *  */
    @Test
    public void testVisit_NameIsNameAndGOOGEquals() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first1)).setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = numberNode1;
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isGetProp()): True}
 * @utbot.executesCondition {@code (name.isName() && GOOG.equals(name.getString())): True}
 * @utbot.executesCondition {@code (GOOG.equals(name.getString())): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testVisit_NotGOOGEquals() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = numberNode1;
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: handleTypedefDefinition(t, n);
 *  */
    @Test
    public void testVisit_ThrowClassCastException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1880)
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(ProcessClosurePrimitives.java:388)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:265) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isExprResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean isExpr = parent.isExprResult();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:205) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.inGlobalScope() && !NodeUtil.isFunctionExpression(n)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:271) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleCandidateProvideDefinition(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:405)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:261) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:203) */
        processClosurePrimitives.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getFirstChild().isName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isCall()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: !parent.isCall()
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:283) */
        processClosurePrimitives.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.isGetProp()
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_8() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(37);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:207) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = numberNode;
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getFirstChild().isName() && !parent.isCall() && !parent.isAssign() && "goog.base".equals(n.getQualifiedName())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:282) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleTypedefDefinition(t, n);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(ProcessClosurePrimitives.java:388)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:265) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isGetProp()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: name.isName() && GOOG.equals(name.getString())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_9() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:209) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = numberNode1;
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleTypedefDefinition(t, n);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_7() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(ProcessClosurePrimitives.java:389)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:265) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (left.isGetProp()): True}
 * @utbot.executesCondition {@code (name.isName() && GOOG.equals(name.getString())): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isExprResult()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: GOOG.equals(name.getString())
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(130);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = numberNode1;
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: handleTypedefDefinition(t, n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new NodeTraversal(compiler, this).traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:151) */
        processClosurePrimitives.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new NodeTraversal(compiler, this).traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:266)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:290)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:151) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processClosurePrimitivesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(processClosurePrimitives, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.hotSwapScript
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hotSwapScript(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#hotSwapScript(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#process(com.google.javascript.jscomp.CompilerPass)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: this.compiler.process(this);
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.hotSwapScript(ProcessClosurePrimitives.java:198) */
        processClosurePrimitives.hotSwapScript(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method replaceGoogDefines(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testReplaceGoogDefines_ThrowClassCastException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next2, "com.google.javascript.rhino.Node", "next", next1);
        setField(first1, "com.google.javascript.rhino.Node", "next", next2);
        setField(parent, "com.google.javascript.rhino.Node", "first", first1);
        setField(next1, "com.google.javascript.rhino.Node", "parent", parent);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent1.setType(130);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1880)
            com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines(ProcessClosurePrimitives.java:188) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", stringNodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = stringNode;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testReplaceGoogDefines_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines(ProcessClosurePrimitives.java:182) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = ((Object) null);
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(parent.isExprResult());
 *  */
    @Test
    public void testReplaceGoogDefines_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines(ProcessClosurePrimitives.java:183) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = n.getChildAtIndex(1).getString();
 *  */
    @Test
    public void testReplaceGoogDefines_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines(ProcessClosurePrimitives.java:184) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node value = n.getChildAtIndex(2).detachFromParent();
 *  */
    @Test
    public void testReplaceGoogDefines_ThrowNullPointerException_3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines(ProcessClosurePrimitives.java:185) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testReplaceGoogDefines_ThrowNullPointerException_4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next1, "com.google.javascript.rhino.Node", "first", first1);
        setField(next1, "com.google.javascript.rhino.Node", "last", next1);
        setField(next1, "com.google.javascript.rhino.Node", "parent", next1);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines(ProcessClosurePrimitives.java:188) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testReplaceGoogDefines_ThrowNullPointerException_5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(130);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next1, "com.google.javascript.rhino.Node", "parent", first);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", next1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.replaceGoogDefines(ProcessClosurePrimitives.java:188) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method replaceGoogDefines(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(parent.isExprResult());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testReplaceGoogDefines_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = n.getChildAtIndex(1).getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testReplaceGoogDefines_ThrowIllegalStateException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = n.getChildAtIndex(1).getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testReplaceGoogDefines_ThrowIllegalStateException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node value = n.getChildAtIndex(2).detachFromParent();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testReplaceGoogDefines_ThrowIllegalStateException_3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(130);
        setField(next, "com.google.javascript.rhino.Node", "next", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", next);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: Node value = n.getChildAtIndex(2).detachFromParent();
 *  */
    @Test(expected = RuntimeException.class)
    public void testReplaceGoogDefines_ThrowRuntimeException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(next1, "com.google.javascript.rhino.Node", "parent", parent);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent1)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: compiler.getCodingConvention()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testReplaceGoogDefines_ThrowUnsupportedOperationException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next1, "com.google.javascript.rhino.Node", "parent", first);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", next1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#replaceGoogDefines(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: compiler.getCodingConvention()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testReplaceGoogDefines_ThrowUnsupportedOperationException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next1, "com.google.javascript.rhino.Node", "parent", first);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", next1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(130);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method replaceGoogDefinesMethod = processClosurePrimitivesClazz.getDeclaredMethod("replaceGoogDefines", nodeType);
        replaceGoogDefinesMethod.setAccessible(true);
        java.lang.Object[] replaceGoogDefinesMethodArguments = new java.lang.Object[1];
        replaceGoogDefinesMethodArguments[0] = node;
        try {
            replaceGoogDefinesMethod.invoke(processClosurePrimitives, replaceGoogDefinesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verifyProvide(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyProvide(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyLastArgumentIsString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: for(String part: arg.getString().split("\\."))
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVerifyProvide_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(40);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyProvideMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyProvide", nodeTraversalType, nodeType, nodeType);
        verifyProvideMethod.setAccessible(true);
        java.lang.Object[] verifyProvideMethodArguments = new java.lang.Object[3];
        verifyProvideMethodArguments[0] = ((Object) null);
        verifyProvideMethodArguments[1] = ((Object) null);
        verifyProvideMethodArguments[2] = node;
        try {
            verifyProvideMethod.invoke(processClosurePrimitives, verifyProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyProvide(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyProvide(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyLastArgumentIsString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#split(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String part: arg.getString().split("\\."))
 *  */
    @Test
    public void testVerifyProvide_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:712) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyProvideMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyProvide", nodeTraversalType, nodeType, nodeType);
        verifyProvideMethod.setAccessible(true);
        java.lang.Object[] verifyProvideMethodArguments = new java.lang.Object[3];
        verifyProvideMethodArguments[0] = ((Object) null);
        verifyProvideMethodArguments[1] = ((Object) null);
        verifyProvideMethodArguments[2] = stringNode;
        try {
            verifyProvideMethod.invoke(processClosurePrimitives, verifyProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyProvide(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVerifyProvide1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast(ProcessClosurePrimitives.java:809)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:772)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:708) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyProvideMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyProvide", nodeTraversalType, nodeType, nodeType);
        verifyProvideMethod.setAccessible(true);
        java.lang.Object[] verifyProvideMethodArguments = new java.lang.Object[3];
        verifyProvideMethodArguments[0] = nodeTraversal;
        verifyProvideMethodArguments[1] = ((Object) null);
        verifyProvideMethodArguments[2] = node;
        try {
            verifyProvideMethod.invoke(processClosurePrimitives, verifyProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyProvide2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:714) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyProvideMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyProvide", nodeTraversalType, nodeType, nodeType);
        verifyProvideMethod.setAccessible(true);
        java.lang.Object[] verifyProvideMethodArguments = new java.lang.Object[3];
        verifyProvideMethodArguments[0] = nodeTraversal;
        verifyProvideMethodArguments[1] = ((Object) null);
        verifyProvideMethodArguments[2] = stringNode;
        try {
            verifyProvideMethod.invoke(processClosurePrimitives, verifyProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyProvide3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:782)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:770)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:708) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyProvideMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyProvide", nodeTraversalType, nodeType, nodeType);
        verifyProvideMethod.setAccessible(true);
        java.lang.Object[] verifyProvideMethodArguments = new java.lang.Object[3];
        verifyProvideMethodArguments[0] = ((Object) null);
        verifyProvideMethodArguments[1] = ((Object) null);
        verifyProvideMethodArguments[2] = ((Object) null);
        try {
            verifyProvideMethod.invoke(processClosurePrimitives, verifyProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyProvide4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        Node node1 = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:795)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:771)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:708) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyProvideMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyProvide", nodeTraversalType, nodeType, nodeType);
        verifyProvideMethod.setAccessible(true);
        java.lang.Object[] verifyProvideMethodArguments = new java.lang.Object[3];
        verifyProvideMethodArguments[0] = ((Object) null);
        verifyProvideMethodArguments[1] = node;
        verifyProvideMethodArguments[2] = node1;
        try {
            verifyProvideMethod.invoke(processClosurePrimitives, verifyProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyProvide5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:714) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyProvideMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyProvide", nodeTraversalType, nodeType, nodeType);
        verifyProvideMethod.setAccessible(true);
        java.lang.Object[] verifyProvideMethodArguments = new java.lang.Object[3];
        verifyProvideMethodArguments[0] = ((Object) null);
        verifyProvideMethodArguments[1] = ((Object) null);
        verifyProvideMethodArguments[2] = stringNode;
        try {
            verifyProvideMethod.invoke(processClosurePrimitives, verifyProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processProvideCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testProcessProvideCall_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:340) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, nodeType, nodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = ((Object) null);
        processProvideCallMethodArguments[1] = ((Object) null);
        processProvideCallMethodArguments[2] = ((Object) null);
        try {
            processProvideCallMethod.invoke(processClosurePrimitives, processProvideCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node arg = left.getNext();
 *  */
    @Test
    public void testProcessProvideCall_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:341) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, nodeType, nodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = ((Object) null);
        processProvideCallMethodArguments[1] = node;
        processProvideCallMethodArguments[2] = ((Object) null);
        try {
            processProvideCallMethod.invoke(processClosurePrimitives, processProvideCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processProvideCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyProvide(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: verifyProvide(t, left, arg)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessProvideCall_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, stringNodeType, stringNodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = ((Object) null);
        processProvideCallMethodArguments[1] = stringNode;
        processProvideCallMethodArguments[2] = ((Object) null);
        try {
            processProvideCallMethod.invoke(processClosurePrimitives, processProvideCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processProvideCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcessProvideCall1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:795)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:771)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:708)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:342) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, stringNodeType, stringNodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = ((Object) null);
        processProvideCallMethodArguments[1] = stringNode;
        processProvideCallMethodArguments[2] = numberNode;
        try {
            processProvideCallMethod.invoke(processClosurePrimitives, processProvideCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessProvideCall2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast(ProcessClosurePrimitives.java:807)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:772)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:708)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:342) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, numberNodeType, numberNodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = nodeTraversal;
        processProvideCallMethodArguments[1] = numberNode;
        processProvideCallMethodArguments[2] = stringNode;
        try {
            processProvideCallMethod.invoke(processClosurePrimitives, processProvideCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessProvideCall3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:780)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:770)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:708)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:342) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, nodeType, nodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = nodeTraversal;
        processProvideCallMethodArguments[1] = node;
        processProvideCallMethodArguments[2] = numberNode;
        try {
            processProvideCallMethod.invoke(processClosurePrimitives, processProvideCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessProvideCall4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:714)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:342) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, nodeType, nodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = nodeTraversal;
        processProvideCallMethodArguments[1] = node;
        processProvideCallMethodArguments[2] = ((Object) null);
        try {
            processProvideCallMethod.invoke(processClosurePrimitives, processProvideCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessProvideCall5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:712)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:342) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, nodeType, nodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = ((Object) null);
        processProvideCallMethodArguments[1] = node;
        processProvideCallMethodArguments[2] = ((Object) null);
        try {
            processProvideCallMethod.invoke(processClosurePrimitives, processProvideCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processRequireCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processRequireCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testProcessRequireCall_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:296) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, nodeType, nodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = ((Object) null);
        processRequireCallMethodArguments[1] = ((Object) null);
        processRequireCallMethodArguments[2] = ((Object) null);
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processRequireCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node arg = left.getNext();
 *  */
    @Test
    public void testProcessRequireCall_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:297) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, nodeType, nodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = ((Object) null);
        processRequireCallMethodArguments[1] = node;
        processRequireCallMethodArguments[2] = ((Object) null);
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processRequireCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (verifyLastArgumentIsString(t, left, arg)): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ProvidedName provided = providedNames.get(ns);
 *  */
    @Test
    public void testProcessRequireCall_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:300) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, nodeType, nodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = ((Object) null);
        processRequireCallMethodArguments[1] = node;
        processRequireCallMethodArguments[2] = ((Object) null);
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processRequireCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (verifyLastArgumentIsString(t, left, arg)): True}
 * @utbot.executesCondition {@code (provided == null): True}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getSourceName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new UnrecognizedRequire(n, ns, t.getSourceName())
 *  */
    @Test
    public void testProcessRequireCall_ThrowNullPointerException_3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:303) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, nodeType, nodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = ((Object) null);
        processRequireCallMethodArguments[1] = node;
        processRequireCallMethodArguments[2] = ((Object) null);
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processRequireCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processRequireCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (verifyLastArgumentIsString(t, left, arg)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyLastArgumentIsString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String ns = arg.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessRequireCall_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, stringNodeType, stringNodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = ((Object) null);
        processRequireCallMethodArguments[1] = stringNode;
        processRequireCallMethodArguments[2] = ((Object) null);
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processRequireCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcessRequireCall1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:795)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:771)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:298) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, nodeType, nodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = ((Object) null);
        processRequireCallMethodArguments[1] = node;
        processRequireCallMethodArguments[2] = numberNode;
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessRequireCall2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast(ProcessClosurePrimitives.java:807)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:772)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:298) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, numberNodeType, numberNodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = nodeTraversal;
        processRequireCallMethodArguments[1] = numberNode;
        processRequireCallMethodArguments[2] = stringNode;
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessRequireCall3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:780)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:770)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:298) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, nodeType, nodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = nodeTraversal;
        processRequireCallMethodArguments[1] = node;
        processRequireCallMethodArguments[2] = numberNode;
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessRequireCall4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast(ProcessClosurePrimitives.java:808)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:772)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:298) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, numberNodeType, numberNodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = ((Object) null);
        processRequireCallMethodArguments[1] = numberNode;
        processRequireCallMethodArguments[2] = numberNode1;
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessRequireCall5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        Object providedName = createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives$ProvidedName");
        providedNames.put(null, providedName);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:302) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, stringNodeType, stringNodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = nodeTraversal;
        processRequireCallMethodArguments[1] = stringNode;
        processRequireCallMethodArguments[2] = stringNode1;
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processDefineCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processDefineCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testProcessDefineCall_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(ProcessClosurePrimitives.java:368) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, nodeType, nodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = ((Object) null);
        processDefineCallMethodArguments[1] = ((Object) null);
        processDefineCallMethodArguments[2] = ((Object) null);
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processDefineCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node args = left.getNext();
 *  */
    @Test
    public void testProcessDefineCall_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(ProcessClosurePrimitives.java:369) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, nodeType, nodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = ((Object) null);
        processDefineCallMethodArguments[1] = node;
        processDefineCallMethodArguments[2] = ((Object) null);
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processDefineCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processDefineCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyDefine(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: verifyDefine(t, parent, left, args)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessDefineCall_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, nodeType, nodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = ((Object) null);
        processDefineCallMethodArguments[1] = node;
        processDefineCallMethodArguments[2] = ((Object) null);
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processDefineCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcessDefineCall1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:795)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:735)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(ProcessClosurePrimitives.java:370) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, stringNodeType, stringNodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = ((Object) null);
        processDefineCallMethodArguments[1] = stringNode;
        processDefineCallMethodArguments[2] = numberNode;
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessDefineCall2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:780)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:734)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(ProcessClosurePrimitives.java:370) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, nodeType, nodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = nodeTraversal;
        processDefineCallMethodArguments[1] = node;
        processDefineCallMethodArguments[2] = numberNode;
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessDefineCall3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:781)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:741)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(ProcessClosurePrimitives.java:370) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, stringNodeType, stringNodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = ((Object) null);
        processDefineCallMethodArguments[1] = stringNode;
        processDefineCallMethodArguments[2] = numberNode;
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessDefineCall4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:780)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:741)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(ProcessClosurePrimitives.java:370) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, nodeType, nodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = nodeTraversal;
        processDefineCallMethodArguments[1] = node;
        processDefineCallMethodArguments[2] = numberNode;
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessDefineCall5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:2144)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:780)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:741)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(ProcessClosurePrimitives.java:370) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, nodeType, nodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = nodeTraversal;
        processDefineCallMethodArguments[1] = node;
        processDefineCallMethodArguments[2] = ((Object) null);
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessDefineCall6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:747)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(ProcessClosurePrimitives.java:370) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, nodeType, nodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = nodeTraversal;
        processDefineCallMethodArguments[1] = node;
        processDefineCallMethodArguments[2] = ((Object) null);
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessDefineCall7() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:749)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processDefineCall(ProcessClosurePrimitives.java:370) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processDefineCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processDefineCall", nodeTraversalType, nodeType, nodeType);
        processDefineCallMethod.setAccessible(true);
        java.lang.Object[] processDefineCallMethodArguments = new java.lang.Object[3];
        processDefineCallMethodArguments[0] = ((Object) null);
        processDefineCallMethodArguments[1] = node;
        processDefineCallMethodArguments[2] = ((Object) null);
        try {
            processDefineCallMethod.invoke(processClosurePrimitives, processDefineCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyIsLast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyIsLast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg.getNext() != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testVerifyIsLast_ArgGetNextEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyIsLastMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyIsLast", nodeTraversalType, nodeType, nodeType);
        verifyIsLastMethod.setAccessible(true);
        java.lang.Object[] verifyIsLastMethodArguments = new java.lang.Object[3];
        verifyIsLastMethodArguments[0] = ((Object) null);
        verifyIsLastMethodArguments[1] = ((Object) null);
        verifyIsLastMethodArguments[2] = stringNode;
        boolean actual = ((Boolean) verifyIsLastMethod.invoke(processClosurePrimitives, verifyIsLastMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyIsLast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyIsLast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: arg.getNext() != null
 *  */
    @Test
    public void testVerifyIsLast_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast(ProcessClosurePrimitives.java:806) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyIsLastMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyIsLast", nodeTraversalType, nodeType, nodeType);
        verifyIsLastMethod.setAccessible(true);
        java.lang.Object[] verifyIsLastMethodArguments = new java.lang.Object[3];
        verifyIsLastMethodArguments[0] = ((Object) null);
        verifyIsLastMethodArguments[1] = ((Object) null);
        verifyIsLastMethodArguments[2] = ((Object) null);
        try {
            verifyIsLastMethod.invoke(processClosurePrimitives, verifyIsLastMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyIsLast(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVerifyIsLast1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast(ProcessClosurePrimitives.java:809) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyIsLastMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyIsLast", nodeTraversalType, nodeType, nodeType);
        verifyIsLastMethod.setAccessible(true);
        java.lang.Object[] verifyIsLastMethodArguments = new java.lang.Object[3];
        verifyIsLastMethodArguments[0] = nodeTraversal;
        verifyIsLastMethodArguments[1] = ((Object) null);
        verifyIsLastMethodArguments[2] = stringNode;
        try {
            verifyIsLastMethod.invoke(processClosurePrimitives, verifyIsLastMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verifyDefine(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyDefine(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyNotNull(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyOfType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyNotNull(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyIsLast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = args.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVerifyDefine_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyDefineMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyDefine", nodeTraversalType, nodeType, nodeType, nodeType);
        verifyDefineMethod.setAccessible(true);
        java.lang.Object[] verifyDefineMethodArguments = new java.lang.Object[4];
        verifyDefineMethodArguments[0] = ((Object) null);
        verifyDefineMethodArguments[1] = ((Object) null);
        verifyDefineMethodArguments[2] = ((Object) null);
        verifyDefineMethodArguments[3] = node;
        try {
            verifyDefineMethod.invoke(processClosurePrimitives, verifyDefineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyDefine(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyDefine(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyNotNull(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyOfType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyNotNull(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyIsLast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#split(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String part: name.split("\\."))
 *  */
    @Test
    public void testVerifyDefine_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:747) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyDefineMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyDefine", nodeTraversalType, nodeType, nodeType, nodeType);
        verifyDefineMethod.setAccessible(true);
        java.lang.Object[] verifyDefineMethodArguments = new java.lang.Object[4];
        verifyDefineMethodArguments[0] = ((Object) null);
        verifyDefineMethodArguments[1] = ((Object) null);
        verifyDefineMethodArguments[2] = ((Object) null);
        verifyDefineMethodArguments[3] = stringNode;
        try {
            verifyDefineMethod.invoke(processClosurePrimitives, verifyDefineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyDefine(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVerifyDefine1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast(ProcessClosurePrimitives.java:809)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:742) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyDefineMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyDefine", nodeTraversalType, numberNodeType, numberNodeType, numberNodeType);
        verifyDefineMethod.setAccessible(true);
        java.lang.Object[] verifyDefineMethodArguments = new java.lang.Object[4];
        verifyDefineMethodArguments[0] = nodeTraversal;
        verifyDefineMethodArguments[1] = numberNode;
        verifyDefineMethodArguments[2] = ((Object) null);
        verifyDefineMethodArguments[3] = node;
        try {
            verifyDefineMethod.invoke(processClosurePrimitives, verifyDefineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyDefine2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = new Node(40);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:780)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:741) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyDefineMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyDefine", nodeTraversalType, nodeType, nodeType, nodeType);
        verifyDefineMethod.setAccessible(true);
        java.lang.Object[] verifyDefineMethodArguments = new java.lang.Object[4];
        verifyDefineMethodArguments[0] = nodeTraversal;
        verifyDefineMethodArguments[1] = ((Object) null);
        verifyDefineMethodArguments[2] = numberNode;
        verifyDefineMethodArguments[3] = node;
        try {
            verifyDefineMethod.invoke(processClosurePrimitives, verifyDefineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyDefine3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = new Node(40);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:782)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:741) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyDefineMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyDefine", nodeTraversalType, numberNodeType, numberNodeType, numberNodeType);
        verifyDefineMethod.setAccessible(true);
        java.lang.Object[] verifyDefineMethodArguments = new java.lang.Object[4];
        verifyDefineMethodArguments[0] = nodeTraversal;
        verifyDefineMethodArguments[1] = numberNode;
        verifyDefineMethodArguments[2] = ((Object) null);
        verifyDefineMethodArguments[3] = node;
        try {
            verifyDefineMethod.invoke(processClosurePrimitives, verifyDefineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyDefine4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:782)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:734) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyDefineMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyDefine", nodeTraversalType, numberNodeType, numberNodeType, numberNodeType);
        verifyDefineMethod.setAccessible(true);
        java.lang.Object[] verifyDefineMethodArguments = new java.lang.Object[4];
        verifyDefineMethodArguments[0] = nodeTraversal;
        verifyDefineMethodArguments[1] = numberNode;
        verifyDefineMethodArguments[2] = ((Object) null);
        verifyDefineMethodArguments[3] = ((Object) null);
        try {
            verifyDefineMethod.invoke(processClosurePrimitives, verifyDefineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyDefine5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:794)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:735) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyDefineMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyDefine", nodeTraversalType, nodeType, nodeType, nodeType);
        verifyDefineMethod.setAccessible(true);
        java.lang.Object[] verifyDefineMethodArguments = new java.lang.Object[4];
        verifyDefineMethodArguments[0] = nodeTraversal;
        verifyDefineMethodArguments[1] = ((Object) null);
        verifyDefineMethodArguments[2] = numberNode;
        verifyDefineMethodArguments[3] = node;
        try {
            verifyDefineMethod.invoke(processClosurePrimitives, verifyDefineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyDefine6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:796)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:735) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyDefineMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyDefine", nodeTraversalType, nodeType, nodeType, nodeType);
        verifyDefineMethod.setAccessible(true);
        java.lang.Object[] verifyDefineMethodArguments = new java.lang.Object[4];
        verifyDefineMethodArguments[0] = ((Object) null);
        verifyDefineMethodArguments[1] = ((Object) null);
        verifyDefineMethodArguments[2] = ((Object) null);
        verifyDefineMethodArguments[3] = node;
        try {
            verifyDefineMethod.invoke(processClosurePrimitives, verifyDefineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyDefine7() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyDefine(ProcessClosurePrimitives.java:749) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyDefineMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyDefine", nodeTraversalType, nodeType, nodeType, nodeType);
        verifyDefineMethod.setAccessible(true);
        java.lang.Object[] verifyDefineMethodArguments = new java.lang.Object[4];
        verifyDefineMethodArguments[0] = ((Object) null);
        verifyDefineMethodArguments[1] = ((Object) null);
        verifyDefineMethodArguments[2] = numberNode;
        verifyDefineMethodArguments[3] = stringNode;
        try {
            verifyDefineMethod.invoke(processClosurePrimitives, verifyDefineMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyNotNull(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyNotNull(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (arg == null): False}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testVerifyNotNull_ArgNotEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyNotNullMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyNotNull", nodeTraversalType, nodeType, nodeType);
        verifyNotNullMethod.setAccessible(true);
        java.lang.Object[] verifyNotNullMethodArguments = new java.lang.Object[3];
        verifyNotNullMethodArguments[0] = ((Object) null);
        verifyNotNullMethodArguments[1] = ((Object) null);
        verifyNotNullMethodArguments[2] = node;
        boolean actual = ((Boolean) verifyNotNullMethod.invoke(processClosurePrimitives, verifyNotNullMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyNotNull(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVerifyNotNull1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:780) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyNotNullMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyNotNull", nodeTraversalType, numberNodeType, numberNodeType);
        verifyNotNullMethod.setAccessible(true);
        java.lang.Object[] verifyNotNullMethodArguments = new java.lang.Object[3];
        verifyNotNullMethodArguments[0] = nodeTraversal;
        verifyNotNullMethodArguments[1] = numberNode;
        verifyNotNullMethodArguments[2] = ((Object) null);
        try {
            verifyNotNullMethod.invoke(processClosurePrimitives, verifyNotNullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyNotNull2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:781) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyNotNullMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyNotNull", nodeTraversalType, numberNodeType, numberNodeType);
        verifyNotNullMethod.setAccessible(true);
        java.lang.Object[] verifyNotNullMethodArguments = new java.lang.Object[3];
        verifyNotNullMethodArguments[0] = ((Object) null);
        verifyNotNullMethodArguments[1] = numberNode;
        verifyNotNullMethodArguments[2] = ((Object) null);
        try {
            verifyNotNullMethod.invoke(processClosurePrimitives, verifyNotNullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyNotNull3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:782) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyNotNullMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyNotNull", nodeTraversalType, nodeType, nodeType);
        verifyNotNullMethod.setAccessible(true);
        java.lang.Object[] verifyNotNullMethodArguments = new java.lang.Object[3];
        verifyNotNullMethodArguments[0] = ((Object) null);
        verifyNotNullMethodArguments[1] = ((Object) null);
        verifyNotNullMethodArguments[2] = ((Object) null);
        try {
            verifyNotNullMethod.invoke(processClosurePrimitives, verifyNotNullMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyOfType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyOfType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code (arg.getType() != desiredType): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testVerifyOfType_ArgGetTypeEqualsDesiredType() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method verifyOfTypeMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyOfType", nodeTraversalType, nodeType, nodeType, intType);
        verifyOfTypeMethod.setAccessible(true);
        java.lang.Object[] verifyOfTypeMethodArguments = new java.lang.Object[4];
        verifyOfTypeMethodArguments[0] = ((Object) null);
        verifyOfTypeMethodArguments[1] = ((Object) null);
        verifyOfTypeMethodArguments[2] = node;
        verifyOfTypeMethodArguments[3] = -255;
        boolean actual = ((Boolean) verifyOfTypeMethod.invoke(processClosurePrimitives, verifyOfTypeMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyOfType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyOfType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: arg.getType() != desiredType
 *  */
    @Test
    public void testVerifyOfType_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:793) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method verifyOfTypeMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyOfType", nodeTraversalType, nodeType, nodeType, intType);
        verifyOfTypeMethod.setAccessible(true);
        java.lang.Object[] verifyOfTypeMethodArguments = new java.lang.Object[4];
        verifyOfTypeMethodArguments[0] = ((Object) null);
        verifyOfTypeMethodArguments[1] = ((Object) null);
        verifyOfTypeMethodArguments[2] = ((Object) null);
        verifyOfTypeMethodArguments[3] = -255;
        try {
            verifyOfTypeMethod.invoke(processClosurePrimitives, verifyOfTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyOfType(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)
    
    @Test
    public void testVerifyOfType1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(8);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:796) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method verifyOfTypeMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyOfType", nodeTraversalType, nodeType, nodeType, intType);
        verifyOfTypeMethod.setAccessible(true);
        java.lang.Object[] verifyOfTypeMethodArguments = new java.lang.Object[4];
        verifyOfTypeMethodArguments[0] = nodeTraversal;
        verifyOfTypeMethodArguments[1] = ((Object) null);
        verifyOfTypeMethodArguments[2] = numberNode;
        verifyOfTypeMethodArguments[3] = 0;
        try {
            verifyOfTypeMethod.invoke(processClosurePrimitives, verifyOfTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyOfType2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = new Node(8);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:794) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method verifyOfTypeMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyOfType", nodeTraversalType, numberNodeType, numberNodeType, intType);
        verifyOfTypeMethod.setAccessible(true);
        java.lang.Object[] verifyOfTypeMethodArguments = new java.lang.Object[4];
        verifyOfTypeMethodArguments[0] = nodeTraversal;
        verifyOfTypeMethodArguments[1] = numberNode;
        verifyOfTypeMethodArguments[2] = node;
        verifyOfTypeMethodArguments[3] = 0;
        try {
            verifyOfTypeMethod.invoke(processClosurePrimitives, verifyOfTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.getExportedVariableNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getExportedVariableNames()
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getExportedVariableNames()}
 * @utbot.returnsFrom {@code return exportedVariables;}
 *  */
    @Test
    public void testGetExportedVariableNames_ReturnExportedVariables() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        Set actual = processClosurePrimitives.getExportedVariableNames();
        
        assertNull(actual);
        
        Set finalProcessClosurePrimitivesExportedVariables = ((Set) getFieldValue(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "exportedVariables"));
        
        assertNull(finalProcessClosurePrimitivesExportedVariables);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()} once
    /// execute conditions:
    ///     {@code (t.inGlobalScope()): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#isName()} once,
    ///     {@link com.google.javascript.rhino.Node#isAssign()} once
    /// execute conditions:
    ///     {@code (name != null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): False}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): True}
 * @utbot.executesCondition {@code (parent.isExprResult()): False}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_NotParentIsExprResult() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, numberNodeType, numberNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = numberNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode;
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): True}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): False}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isVar()}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_NIsAssignAndParentIsExprResult_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, numberNodeType, numberNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = numberNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode;
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): False}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): False}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_NIsAssignAndParentIsExprResult() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = ((Object) null);
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): False}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): True}
 * @utbot.executesCondition {@code (parent.isExprResult()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ParentIsExprResult() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(130);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode1;
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): True}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): True}
 * @utbot.executesCondition {@code (name != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isVar()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_NameEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(118);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode1;
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.inGlobalScope()
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:405) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, nodeType, nodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = ((Object) null);
        handleCandidateProvideDefinitionMethodArguments[1] = ((Object) null);
        handleCandidateProvideDefinitionMethodArguments[2] = ((Object) null);
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isVar()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isName() && parent.isVar()
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:407) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = ((Object) null);
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): False}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isExprResult()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.isExprResult()
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:410) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = ((Object) null);
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isName() && parent.isVar()
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:407) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, nodeType, nodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = ((Object) null);
        handleCandidateProvideDefinitionMethodArguments[2] = ((Object) null);
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): False}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): True}
 * @utbot.executesCondition {@code (parent.isExprResult()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name = n.getFirstChild().getQualifiedName();
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:411) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode1;
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): True}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): True}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (parent.getBooleanProp(Node.IS_NAMESPACE)): True}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: processProvideFromPreviousPass(t, name, parent);
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:575)
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:416) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode1;
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): False}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): True}
 * @utbot.executesCondition {@code (parent.isExprResult()): True}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (parent.getBooleanProp(Node.IS_NAMESPACE)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ProvidedName pn = providedNames.get(name);
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_7() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:418) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode1;
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (n.isName() && parent.isVar()): True}
 * @utbot.executesCondition {@code (n.isAssign() && parent.isExprResult()): True}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.executesCondition {@code (parent.getBooleanProp(Node.IS_NAMESPACE)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ProvidedName pn = providedNames.get(name);
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
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
        (((Node) stringNode1)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(stringNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:418) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode1;
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: name = n.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testHandleCandidateProvideDefinition_ThrowUnsupportedOperationException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, numberNodeType, numberNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = numberNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode;
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getBooleanProp(int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: parent.getBooleanProp(Node.IS_NAMESPACE)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testHandleCandidateProvideDefinition_ThrowUnsupportedOperationException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = stringNode1;
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processBaseClassCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processBaseClassCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node callee = n.getFirstChild();
 *  */
    @Test
    public void testProcessBaseClassCall_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:458) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, nodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = ((Object) null);
        processBaseClassCallMethodArguments[1] = ((Object) null);
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processBaseClassCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisArg = callee.getNext();
 *  */
    @Test
    public void testProcessBaseClassCall_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:459) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, nodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = ((Object) null);
        processBaseClassCallMethodArguments[1] = node;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processBaseClassCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isThis()}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node enclosingFnNameNode = getEnclosingDeclNameNode(t);
 *  */
    @Test
    public void testProcessBaseClassCall_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:540)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:465) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, nodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = ((Object) null);
        processBaseClassCallMethodArguments[1] = node;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processBaseClassCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcessBaseClassCall1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:662)
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:540)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:465) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, stringNodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = nodeTraversal;
        processBaseClassCallMethodArguments[1] = stringNode;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessBaseClassCall2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:565)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:461) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, numberNodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = nodeTraversal;
        processBaseClassCallMethodArguments[1] = numberNode;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessBaseClassCall3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:565)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:461) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, nodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = nodeTraversal;
        processBaseClassCallMethodArguments[1] = node;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessBaseClassCall4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:662)
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:540)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:465) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, nodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = nodeTraversal;
        processBaseClassCallMethodArguments[1] = node;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessBaseClassCall5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:565)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:461) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, nodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = ((Object) null);
        processBaseClassCallMethodArguments[1] = node;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessBaseClassCall6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(NodeUtil.java:1937)
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:541)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:465) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, stringNodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = nodeTraversal;
        processBaseClassCallMethodArguments[1] = stringNode;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testProcessSetCssNameMapping_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:607) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = ((Object) null);
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node arg = left.getNext();
 *  */
    @Test
    public void testProcessSetCssNameMapping_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:608) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcessSetCssNameMapping1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:836)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:609) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = stringNode;
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessSetCssNameMapping2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:836)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:609) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, stringNodeType, stringNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = stringNode;
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessSetCssNameMapping3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next1.setType(40);
        setField(next1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:837)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:609) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = stringNode;
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessSetCssNameMapping4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:836)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:609) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, numberNodeType, numberNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = numberNode;
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessSetCssNameMapping5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:621) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessSetCssNameMapping6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(154);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(next, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:620) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, numberNodeType, numberNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = numberNode;
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessSetCssNameMapping7() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(64);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:694) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = stringNode;
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessSetCssNameMapping8() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(64);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:694) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessSetCssNameMapping9() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(154);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(next, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:621) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testProcessSetCssNameMapping10() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next1.setType(40);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyLastArgumentIsString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyLastArgumentIsString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyNotNull(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyOfType(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyIsLast(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.returnsFrom {@code return verifyNotNull(t, methodName, arg) && verifyOfType(t, methodName, arg, Token.STRING) && verifyIsLast(t, methodName, arg);}
 *  */
    @Test
    public void testVerifyLastArgumentIsString_ProcessClosurePrimitivesVerifyIsLast() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(40);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyLastArgumentIsStringMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyLastArgumentIsString", nodeTraversalType, nodeType, nodeType);
        verifyLastArgumentIsStringMethod.setAccessible(true);
        java.lang.Object[] verifyLastArgumentIsStringMethodArguments = new java.lang.Object[3];
        verifyLastArgumentIsStringMethodArguments[0] = ((Object) null);
        verifyLastArgumentIsStringMethodArguments[1] = ((Object) null);
        verifyLastArgumentIsStringMethodArguments[2] = node;
        boolean actual = ((Boolean) verifyLastArgumentIsStringMethod.invoke(processClosurePrimitives, verifyLastArgumentIsStringMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyLastArgumentIsString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVerifyLastArgumentIsString1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:780)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:770) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyLastArgumentIsStringMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyLastArgumentIsString", nodeTraversalType, numberNodeType, numberNodeType);
        verifyLastArgumentIsStringMethod.setAccessible(true);
        java.lang.Object[] verifyLastArgumentIsStringMethodArguments = new java.lang.Object[3];
        verifyLastArgumentIsStringMethodArguments[0] = nodeTraversal;
        verifyLastArgumentIsStringMethodArguments[1] = numberNode;
        verifyLastArgumentIsStringMethodArguments[2] = ((Object) null);
        try {
            verifyLastArgumentIsStringMethod.invoke(processClosurePrimitives, verifyLastArgumentIsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyLastArgumentIsString2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:794)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:771) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyLastArgumentIsStringMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyLastArgumentIsString", nodeTraversalType, nodeType, nodeType);
        verifyLastArgumentIsStringMethod.setAccessible(true);
        java.lang.Object[] verifyLastArgumentIsStringMethodArguments = new java.lang.Object[3];
        verifyLastArgumentIsStringMethodArguments[0] = nodeTraversal;
        verifyLastArgumentIsStringMethodArguments[1] = node;
        verifyLastArgumentIsStringMethodArguments[2] = node;
        try {
            verifyLastArgumentIsStringMethod.invoke(processClosurePrimitives, verifyLastArgumentIsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyLastArgumentIsString3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyNotNull(ProcessClosurePrimitives.java:781)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:770) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyLastArgumentIsStringMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyLastArgumentIsString", nodeTraversalType, numberNodeType, numberNodeType);
        verifyLastArgumentIsStringMethod.setAccessible(true);
        java.lang.Object[] verifyLastArgumentIsStringMethodArguments = new java.lang.Object[3];
        verifyLastArgumentIsStringMethodArguments[0] = ((Object) null);
        verifyLastArgumentIsStringMethodArguments[1] = numberNode;
        verifyLastArgumentIsStringMethodArguments[2] = ((Object) null);
        try {
            verifyLastArgumentIsStringMethod.invoke(processClosurePrimitives, verifyLastArgumentIsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyLastArgumentIsString4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyIsLast(ProcessClosurePrimitives.java:809)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:772) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyLastArgumentIsStringMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyLastArgumentIsString", nodeTraversalType, nodeType, nodeType);
        verifyLastArgumentIsStringMethod.setAccessible(true);
        java.lang.Object[] verifyLastArgumentIsStringMethodArguments = new java.lang.Object[3];
        verifyLastArgumentIsStringMethodArguments[0] = nodeTraversal;
        verifyLastArgumentIsStringMethodArguments[1] = ((Object) null);
        verifyLastArgumentIsStringMethodArguments[2] = node;
        try {
            verifyLastArgumentIsStringMethod.invoke(processClosurePrimitives, verifyLastArgumentIsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyLastArgumentIsString5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:796)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:771) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyLastArgumentIsStringMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyLastArgumentIsString", nodeTraversalType, nodeType, nodeType);
        verifyLastArgumentIsStringMethod.setAccessible(true);
        java.lang.Object[] verifyLastArgumentIsStringMethodArguments = new java.lang.Object[3];
        verifyLastArgumentIsStringMethodArguments[0] = nodeTraversal;
        verifyLastArgumentIsStringMethodArguments[1] = ((Object) null);
        verifyLastArgumentIsStringMethodArguments[2] = node;
        try {
            verifyLastArgumentIsStringMethod.invoke(processClosurePrimitives, verifyLastArgumentIsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyLastArgumentIsString6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        Node node1 = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyOfType(ProcessClosurePrimitives.java:795)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyLastArgumentIsString(ProcessClosurePrimitives.java:771) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyLastArgumentIsStringMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyLastArgumentIsString", nodeTraversalType, nodeType, nodeType);
        verifyLastArgumentIsStringMethod.setAccessible(true);
        java.lang.Object[] verifyLastArgumentIsStringMethodArguments = new java.lang.Object[3];
        verifyLastArgumentIsStringMethodArguments[0] = ((Object) null);
        verifyLastArgumentIsStringMethodArguments[1] = node;
        verifyLastArgumentIsStringMethodArguments[2] = node1;
        try {
            verifyLastArgumentIsStringMethod.invoke(processClosurePrimitives, verifyLastArgumentIsStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ParentEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$StringNode");
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
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method getEnclosingDeclNameNodeMethod = processClosurePrimitivesClazz.getDeclaredMethod("getEnclosingDeclNameNode", nodeTraversalType);
        getEnclosingDeclNameNodeMethod.setAccessible(true);
        java.lang.Object[] getEnclosingDeclNameNodeMethodArguments = new java.lang.Object[1];
        getEnclosingDeclNameNodeMethodArguments[0] = nodeTraversal;
        Node actual = ((Node) getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.isAssign()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isAssign()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return parent.getFirstChild();}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_NotParentIsAssign() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(stringNode);
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
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method getEnclosingDeclNameNodeMethod = processClosurePrimitivesClazz.getDeclaredMethod("getEnclosingDeclNameNode", nodeTraversalType);
        getEnclosingDeclNameNodeMethod.setAccessible(true);
        java.lang.Object[] getEnclosingDeclNameNodeMethodArguments = new java.lang.Object[1];
        getEnclosingDeclNameNodeMethodArguments[0] = nodeTraversal;
        Object actual = getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments);
        
        String actualStr = ((String) getFieldValue(actual, "com.google.javascript.rhino.Node$StringNode", "str"));
        assertNull(actualStr);
        
        int firstType = (((Node) first)).getType();
        int actualType = (((Node) actual)).getType();
        assertEquals(firstType, actualType);
        
        Node actualNext = (((Node) actual)).getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int firstSourcePosition = (((Node) first)).getSourcePosition();
        int actualSourcePosition = (((Node) actual)).getSourcePosition();
        assertEquals(firstSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = (((Node) actual)).getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node scopeRoot = t.getScopeRoot();
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:540) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method getEnclosingDeclNameNodeMethod = processClosurePrimitivesClazz.getDeclaredMethod("getEnclosingDeclNameNode", nodeTraversalType);
        getEnclosingDeclNameNodeMethod.setAccessible(true);
        java.lang.Object[] getEnclosingDeclNameNodeMethodArguments = new java.lang.Object[1];
        getEnclosingDeclNameNodeMethodArguments[0] = ((Object) null);
        try {
            getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): False}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.returnsFrom {@code return null;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return null;
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:662)
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:540) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method getEnclosingDeclNameNodeMethod = processClosurePrimitivesClazz.getDeclaredMethod("getEnclosingDeclNameNode", nodeTraversalType);
        getEnclosingDeclNameNodeMethod.setAccessible(true);
        java.lang.Object[] getEnclosingDeclNameNodeMethodArguments = new java.lang.Object[1];
        getEnclosingDeclNameNodeMethodArguments[0] = nodeTraversal;
        try {
            getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScopeRoot()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: NodeUtil.isFunctionDeclaration(scopeRoot)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetEnclosingDeclNameNode_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        scopeRoots.add(stringNode);
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
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method getEnclosingDeclNameNodeMethod = processClosurePrimitivesClazz.getDeclaredMethod("getEnclosingDeclNameNode", nodeTraversalType);
        getEnclosingDeclNameNodeMethod.setAccessible(true);
        java.lang.Object[] getEnclosingDeclNameNodeMethodArguments = new java.lang.Object[1];
        getEnclosingDeclNameNodeMethodArguments[0] = nodeTraversal;
        try {
            getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifySetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifySetCssNameMapping(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testVerifySetCssNameMapping_ReturnTrue() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(64);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifySetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifySetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        verifySetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] verifySetCssNameMappingMethodArguments = new java.lang.Object[3];
        verifySetCssNameMappingMethodArguments[0] = ((Object) null);
        verifySetCssNameMappingMethodArguments[1] = ((Object) null);
        verifySetCssNameMappingMethodArguments[2] = node;
        boolean actual = ((Boolean) verifySetCssNameMappingMethod.invoke(processClosurePrimitives, verifySetCssNameMappingMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifySetCssNameMapping(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testVerifySetCssNameMapping_NodeGetNext() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifySetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifySetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        verifySetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] verifySetCssNameMappingMethodArguments = new java.lang.Object[3];
        verifySetCssNameMappingMethodArguments[0] = ((Object) null);
        verifySetCssNameMappingMethodArguments[1] = ((Object) null);
        verifySetCssNameMappingMethodArguments[2] = node;
        boolean actual = ((Boolean) verifySetCssNameMappingMethod.invoke(processClosurePrimitives, verifySetCssNameMappingMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifySetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVerifySetCssNameMapping1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:836) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifySetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifySetCssNameMapping", nodeTraversalType, numberNodeType, numberNodeType);
        verifySetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] verifySetCssNameMappingMethodArguments = new java.lang.Object[3];
        verifySetCssNameMappingMethodArguments[0] = nodeTraversal;
        verifySetCssNameMappingMethodArguments[1] = numberNode;
        verifySetCssNameMappingMethodArguments[2] = node;
        try {
            verifySetCssNameMappingMethod.invoke(processClosurePrimitives, verifySetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifySetCssNameMapping2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        Node node1 = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:836) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifySetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifySetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        verifySetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] verifySetCssNameMappingMethodArguments = new java.lang.Object[3];
        verifySetCssNameMappingMethodArguments[0] = nodeTraversal;
        verifySetCssNameMappingMethodArguments[1] = node;
        verifySetCssNameMappingMethodArguments[2] = node1;
        try {
            verifySetCssNameMappingMethod.invoke(processClosurePrimitives, verifySetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifySetCssNameMapping3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:838) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifySetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifySetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        verifySetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] verifySetCssNameMappingMethodArguments = new java.lang.Object[3];
        verifySetCssNameMappingMethodArguments[0] = nodeTraversal;
        verifySetCssNameMappingMethodArguments[1] = ((Object) null);
        verifySetCssNameMappingMethodArguments[2] = node;
        try {
            verifySetCssNameMappingMethod.invoke(processClosurePrimitives, verifySetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifySetCssNameMapping4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(64);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:838) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifySetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifySetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        verifySetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] verifySetCssNameMappingMethodArguments = new java.lang.Object[3];
        verifySetCssNameMappingMethodArguments[0] = nodeTraversal;
        verifySetCssNameMappingMethodArguments[1] = ((Object) null);
        verifySetCssNameMappingMethodArguments[2] = node;
        try {
            verifySetCssNameMappingMethod.invoke(processClosurePrimitives, verifySetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifySetCssNameMapping5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:838) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifySetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifySetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        verifySetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] verifySetCssNameMappingMethodArguments = new java.lang.Object[3];
        verifySetCssNameMappingMethodArguments[0] = ((Object) null);
        verifySetCssNameMappingMethodArguments[1] = ((Object) null);
        verifySetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            verifySetCssNameMappingMethod.invoke(processClosurePrimitives, verifySetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifySetCssNameMapping6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(64);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) next)).setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifySetCssNameMapping(ProcessClosurePrimitives.java:838) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifySetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifySetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        verifySetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] verifySetCssNameMappingMethodArguments = new java.lang.Object[3];
        verifySetCssNameMappingMethodArguments[0] = ((Object) null);
        verifySetCssNameMappingMethodArguments[1] = ((Object) null);
        verifySetCssNameMappingMethodArguments[2] = numberNode;
        try {
            verifySetCssNameMappingMethod.invoke(processClosurePrimitives, verifySetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (info != null): False}
 *  */
    @Test
    public void testHandleTypedefDefinition_InfoEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = nodeTraversal;
        handleTypedefDefinitionMethodArguments[1] = node;
        handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.hasTypedefType()): False}
 *  */
    @Test
    public void testHandleTypedefDefinition_NotInfoHasTypedefType() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = nodeTraversal;
        handleTypedefDefinitionMethodArguments[1] = node;
        handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.hasTypedefType()): True}
 * @utbot.executesCondition {@code (name != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 *  */
    @Test
    public void testHandleTypedefDefinition_NameEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", Integer.MIN_VALUE);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = nodeTraversal;
        handleTypedefDefinitionMethodArguments[1] = node;
        handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): False}
 *  */
    @Test
    public void testHandleTypedefDefinition_NotTInGlobalScope() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = nodeTraversal;
        handleTypedefDefinitionMethodArguments[1] = node;
        handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = n.getFirstChild().getJSDocInfo();
 *  */
    @Test
    public void testHandleTypedefDefinition_ThrowClassCastException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1880)
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(ProcessClosurePrimitives.java:388) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = ((Object) null);
        handleTypedefDefinitionMethodArguments[1] = node;
        try {
            handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo info = n.getFirstChild().getJSDocInfo();
 *  */
    @Test
    public void testHandleTypedefDefinition_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(ProcessClosurePrimitives.java:388) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = ((Object) null);
        handleTypedefDefinitionMethodArguments[1] = ((Object) null);
        try {
            handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo info = n.getFirstChild().getJSDocInfo();
 *  */
    @Test
    public void testHandleTypedefDefinition_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(ProcessClosurePrimitives.java:388) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = ((Object) null);
        handleTypedefDefinitionMethodArguments[1] = node;
        try {
            handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.inGlobalScope() && info != null && info.hasTypedefType()
 *  */
    @Test
    public void testHandleTypedefDefinition_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(ProcessClosurePrimitives.java:389) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = ((Object) null);
        handleTypedefDefinitionMethodArguments[1] = node;
        try {
            handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.inGlobalScope() && info != null && info.hasTypedefType()
 *  */
    @Test
    public void testHandleTypedefDefinition_ThrowNullPointerException_3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(ProcessClosurePrimitives.java:389) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, numberNodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = ((Object) null);
        handleTypedefDefinitionMethodArguments[1] = numberNode;
        try {
            handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.hasTypedefType()): True}
 * @utbot.executesCondition {@code (name != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasTypedefType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ProvidedName pn = providedNames.get(name);
 *  */
    @Test
    public void testHandleTypedefDefinition_ThrowNullPointerException_4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", Integer.MIN_VALUE);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleTypedefDefinition(ProcessClosurePrimitives.java:392) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = nodeTraversal;
        handleTypedefDefinitionMethodArguments[1] = node;
        try {
            handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleTypedefDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSDocInfo info = n.getFirstChild().getJSDocInfo();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testHandleTypedefDefinition_ThrowUnsupportedOperationException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleTypedefDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleTypedefDefinition", nodeTraversalType, nodeType);
        handleTypedefDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleTypedefDefinitionMethodArguments = new java.lang.Object[2];
        handleTypedefDefinitionMethodArguments[0] = ((Object) null);
        handleTypedefDefinitionMethodArguments[1] = node;
        try {
            handleTypedefDefinitionMethod.invoke(processClosurePrimitives, handleTypedefDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method registerAnyProvidedPrefixes(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#registerAnyProvidedPrefixes(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.JSModule)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 *  */
    @Test
    public void testRegisterAnyProvidedPrefixes_StringIndexOf() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        String string = " ";
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method registerAnyProvidedPrefixesMethod = processClosurePrimitivesClazz.getDeclaredMethod("registerAnyProvidedPrefixes", stringType, nodeType, jSModuleType);
        registerAnyProvidedPrefixesMethod.setAccessible(true);
        java.lang.Object[] registerAnyProvidedPrefixesMethodArguments = new java.lang.Object[3];
        registerAnyProvidedPrefixesMethodArguments[0] = string;
        registerAnyProvidedPrefixesMethodArguments[1] = ((Object) null);
        registerAnyProvidedPrefixesMethodArguments[2] = ((Object) null);
        registerAnyProvidedPrefixesMethod.invoke(processClosurePrimitives, registerAnyProvidedPrefixesMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method registerAnyProvidedPrefixes(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#registerAnyProvidedPrefixes(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.JSModule)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int pos = ns.indexOf('.');
 *  */
    @Test
    public void testRegisterAnyProvidedPrefixes_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes(ProcessClosurePrimitives.java:855) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method registerAnyProvidedPrefixesMethod = processClosurePrimitivesClazz.getDeclaredMethod("registerAnyProvidedPrefixes", stringType, nodeType, jSModuleType);
        registerAnyProvidedPrefixesMethod.setAccessible(true);
        java.lang.Object[] registerAnyProvidedPrefixesMethodArguments = new java.lang.Object[3];
        registerAnyProvidedPrefixesMethodArguments[0] = ((Object) null);
        registerAnyProvidedPrefixesMethodArguments[1] = ((Object) null);
        registerAnyProvidedPrefixesMethodArguments[2] = ((Object) null);
        try {
            registerAnyProvidedPrefixesMethod.invoke(processClosurePrimitives, registerAnyProvidedPrefixesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method registerAnyProvidedPrefixes(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)
    
    @Test
    public void testRegisterAnyProvidedPrefixes1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        String string = ".";
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method registerAnyProvidedPrefixesMethod = processClosurePrimitivesClazz.getDeclaredMethod("registerAnyProvidedPrefixes", stringType, nodeType, jSModuleType);
        registerAnyProvidedPrefixesMethod.setAccessible(true);
        java.lang.Object[] registerAnyProvidedPrefixesMethodArguments = new java.lang.Object[3];
        registerAnyProvidedPrefixesMethodArguments[0] = string;
        registerAnyProvidedPrefixesMethodArguments[1] = ((Object) null);
        registerAnyProvidedPrefixesMethodArguments[2] = ((Object) null);
        registerAnyProvidedPrefixesMethod.invoke(processClosurePrimitives, registerAnyProvidedPrefixesMethodArguments);
    }
    
    @Test
    public void testRegisterAnyProvidedPrefixes2() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        String string = "..\u0000\u0000";
        JSModule jSModule = new JSModule(null);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method registerAnyProvidedPrefixesMethod = processClosurePrimitivesClazz.getDeclaredMethod("registerAnyProvidedPrefixes", stringType, nodeType, jSModuleType);
        registerAnyProvidedPrefixesMethod.setAccessible(true);
        java.lang.Object[] registerAnyProvidedPrefixesMethodArguments = new java.lang.Object[3];
        registerAnyProvidedPrefixesMethodArguments[0] = string;
        registerAnyProvidedPrefixesMethodArguments[1] = ((Object) null);
        registerAnyProvidedPrefixesMethodArguments[2] = jSModule;
        registerAnyProvidedPrefixesMethod.invoke(processClosurePrimitives, registerAnyProvidedPrefixesMethodArguments);
    }
    
    @Test
    public void testRegisterAnyProvidedPrefixes3() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        String string = ".";
        Node node = new Node(130);
        JSModule jSModule = new JSModule(null);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method registerAnyProvidedPrefixesMethod = processClosurePrimitivesClazz.getDeclaredMethod("registerAnyProvidedPrefixes", stringType, nodeType, jSModuleType);
        registerAnyProvidedPrefixesMethod.setAccessible(true);
        java.lang.Object[] registerAnyProvidedPrefixesMethodArguments = new java.lang.Object[3];
        registerAnyProvidedPrefixesMethodArguments[0] = string;
        registerAnyProvidedPrefixesMethodArguments[1] = node;
        registerAnyProvidedPrefixesMethodArguments[2] = jSModule;
        registerAnyProvidedPrefixesMethod.invoke(processClosurePrimitives, registerAnyProvidedPrefixesMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method registerAnyProvidedPrefixes(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)
    
    @Test
    public void testRegisterAnyProvidedPrefixes4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        String string = "\u0000\u0000.";
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes(ProcessClosurePrimitives.java:859) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method registerAnyProvidedPrefixesMethod = processClosurePrimitivesClazz.getDeclaredMethod("registerAnyProvidedPrefixes", stringType, nodeType, jSModuleType);
        registerAnyProvidedPrefixesMethod.setAccessible(true);
        java.lang.Object[] registerAnyProvidedPrefixesMethodArguments = new java.lang.Object[3];
        registerAnyProvidedPrefixesMethodArguments[0] = string;
        registerAnyProvidedPrefixesMethodArguments[1] = ((Object) null);
        registerAnyProvidedPrefixesMethodArguments[2] = ((Object) null);
        try {
            registerAnyProvidedPrefixesMethod.invoke(processClosurePrimitives, registerAnyProvidedPrefixesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method registerAnyProvidedPrefixes(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)
    
    @Test(expected = IllegalArgumentException.class)
    public void testRegisterAnyProvidedPrefixes5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        String string = ".";
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method registerAnyProvidedPrefixesMethod = processClosurePrimitivesClazz.getDeclaredMethod("registerAnyProvidedPrefixes", stringType, stringNodeType, jSModuleType);
        registerAnyProvidedPrefixesMethod.setAccessible(true);
        java.lang.Object[] registerAnyProvidedPrefixesMethodArguments = new java.lang.Object[3];
        registerAnyProvidedPrefixesMethodArguments[0] = string;
        registerAnyProvidedPrefixesMethodArguments[1] = stringNode;
        registerAnyProvidedPrefixesMethodArguments[2] = ((Object) null);
        try {
            registerAnyProvidedPrefixesMethod.invoke(processClosurePrimitives, registerAnyProvidedPrefixesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (preprocessorSymbolTable == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testMaybeAddStringNodeToSymbolTable_PreprocessorSymbolTableEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", nodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = ((Object) null);
        maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String name = n.getString();
 *  */
    @Test
    public void testMaybeAddStringNodeToSymbolTable_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1176) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", nodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = ((Object) null);
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention()
 *  */
    @Test
    public void testMaybeAddStringNodeToSymbolTable_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1178) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#newQualifiedNameNode(com.google.javascript.jscomp.CodingConvention,java.lang.String,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node syntheticRef = NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), name, n, name);
 *  */
    @Test
    public void testMaybeAddStringNodeToSymbolTable_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000.";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.newName(NodeUtil.java:2428)
            com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(NodeUtil.java:2335)
            com.google.javascript.jscomp.NodeUtil.newQualifiedNameNode(NodeUtil.java:2393)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1177) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMaybeAddStringNodeToSymbolTable_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Node node = new Node(0);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", nodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = node;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String name = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMaybeAddStringNodeToSymbolTable_ThrowIllegalStateException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Node node = new Node(40);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", nodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = node;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeAddStringNodeToSymbolTable_ThrowUnsupportedOperationException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeAddStringNodeToSymbolTable_ThrowUnsupportedOperationException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)
    
    @Test
    public void testMaybeAddStringNodeToSymbolTable1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000$\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(PreprocessorSymbolTable.java:96)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(ProcessClosurePrimitives.java:1213)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1205) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeAddStringNodeToSymbolTable2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000$";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(PreprocessorSymbolTable.java:96)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(ProcessClosurePrimitives.java:1213)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1205) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeAddStringNodeToSymbolTable3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000\u0000\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(PreprocessorSymbolTable.java:96)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(ProcessClosurePrimitives.java:1213)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1205) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeAddStringNodeToSymbolTable4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CodingConventions.Proxy codingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000$";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(PreprocessorSymbolTable.java:96)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(ProcessClosurePrimitives.java:1213)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1205) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeAddStringNodeToSymbolTable5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(PreprocessorSymbolTable.java:96)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(ProcessClosurePrimitives.java:1213)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1205) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeAddStringNodeToSymbolTable6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CodingConventions.Proxy codingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(PreprocessorSymbolTable.java:96)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(ProcessClosurePrimitives.java:1213)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1205) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeAddStringNodeToSymbolTable7() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        GoogleCodingConvention defaultCodingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(PreprocessorSymbolTable.java:96)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(ProcessClosurePrimitives.java:1213)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1205) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeAddStringNodeToSymbolTable8() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CodingConventions.Proxy defaultCodingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        CodingConventions.Proxy nextConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention1 = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention1);
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(PreprocessorSymbolTable.java:96)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(ProcessClosurePrimitives.java:1213)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddStringNodeToSymbolTable(ProcessClosurePrimitives.java:1205) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeAddStringNodeToSymbolTable9() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CodingConventions.Proxy defaultCodingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        CodingConventions.Proxy nextConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention1 = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention1);
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testMaybeAddStringNodeToSymbolTable10() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        GoogleCodingConvention codingConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testMaybeAddStringNodeToSymbolTable11() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CodingConventions.Proxy defaultCodingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        Object nextConvention = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testMaybeAddStringNodeToSymbolTable12() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CodingConventions.Proxy codingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        CodingConventions.Proxy nextConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention1 = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention1);
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testMaybeAddStringNodeToSymbolTable13() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CodingConventions.Proxy defaultCodingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        Object nextConvention = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = NullPointerException.class)
    public void testMaybeAddStringNodeToSymbolTable14() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CodingConventions.Proxy codingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(codingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 40);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method maybeAddStringNodeToSymbolTable(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testMaybeAddStringNodeToSymbolTable15() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CodingConventions.Proxy defaultCodingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        Object nextConvention = createInstance("com.google.javascript.jscomp.CodingConventions$DefaultCodingConvention");
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(timeout = 1000L)
    public void testMaybeAddStringNodeToSymbolTable16() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        CodingConventions.Proxy defaultCodingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        CodingConventions.Proxy nextConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        GoogleCodingConvention nextConvention1 = ((GoogleCodingConvention) createInstance("com.google.javascript.jscomp.GoogleCodingConvention"));
        setField(nextConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention1);
        setField(defaultCodingConvention, "com.google.javascript.jscomp.CodingConventions$Proxy", "nextConvention", nextConvention);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddStringNodeToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddStringNodeToSymbolTable", stringNodeType);
        maybeAddStringNodeToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddStringNodeToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddStringNodeToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddStringNodeToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddStringNodeToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeAddToSymbolTable(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (preprocessorSymbolTable != null): False}
 *  */
    @Test
    public void testMaybeAddToSymbolTable_PreprocessorSymbolTableEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddToSymbolTable", nodeType);
        maybeAddToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddToSymbolTableMethodArguments[0] = ((Object) null);
        maybeAddToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddToSymbolTableMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maybeAddToSymbolTable(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: preprocessorSymbolTable.addReference(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeAddToSymbolTable_ThrowUnsupportedOperationException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Node node = new Node(38);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddToSymbolTable", nodeType);
        maybeAddToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddToSymbolTableMethodArguments[0] = node;
        try {
            maybeAddToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: preprocessorSymbolTable.addReference(n);
 *  */
    @Test(expected = NullPointerException.class)
    public void testMaybeAddToSymbolTable_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Node node = new Node(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddToSymbolTable", nodeType);
        maybeAddToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddToSymbolTableMethodArguments[0] = node;
        try {
            maybeAddToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: preprocessorSymbolTable.addReference(n);
 *  */
    @Test(expected = NullPointerException.class)
    public void testMaybeAddToSymbolTable_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddToSymbolTable", nodeType);
        maybeAddToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddToSymbolTableMethodArguments[0] = node;
        try {
            maybeAddToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#maybeAddToSymbolTable(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: preprocessorSymbolTable.addReference(n);
 *  */
    @Test(expected = NullPointerException.class)
    public void testMaybeAddToSymbolTable_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddToSymbolTable", nodeType);
        maybeAddToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddToSymbolTableMethodArguments[0] = node;
        try {
            maybeAddToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method maybeAddToSymbolTable(com.google.javascript.rhino.Node)
    
    @Test
    public void testMaybeAddToSymbolTable1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        PreprocessorSymbolTable preprocessorSymbolTable = ((PreprocessorSymbolTable) createInstance("com.google.javascript.jscomp.PreprocessorSymbolTable"));
        LinkedHashMap symbols = new LinkedHashMap();
        setField(preprocessorSymbolTable, "com.google.javascript.jscomp.PreprocessorSymbolTable", "symbols", symbols);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "preprocessorSymbolTable", preprocessorSymbolTable);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.PreprocessorSymbolTable.addReference(PreprocessorSymbolTable.java:100)
            com.google.javascript.jscomp.ProcessClosurePrimitives.maybeAddToSymbolTable(ProcessClosurePrimitives.java:1213) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method maybeAddToSymbolTableMethod = processClosurePrimitivesClazz.getDeclaredMethod("maybeAddToSymbolTable", stringNodeType);
        maybeAddToSymbolTableMethod.setAccessible(true);
        java.lang.Object[] maybeAddToSymbolTableMethodArguments = new java.lang.Object[1];
        maybeAddToSymbolTableMethodArguments[0] = stringNode;
        try {
            maybeAddToSymbolTableMethod.invoke(processClosurePrimitives, maybeAddToSymbolTableMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !providedNames.containsKey(name)
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:575) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, nodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = ((Object) null);
        try {
            processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!providedNames.containsKey(name)): False}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNamespacePlaceholder(parent)
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:1148)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:592) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, nodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = ((Object) null);
        try {
            processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse
    
    ///region OTHER: ERROR SUITE for method reportBadBaseClassUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)
    
    @Test
    public void testReportBadBaseClassUse1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:2144)
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:565) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method reportBadBaseClassUseMethod = processClosurePrimitivesClazz.getDeclaredMethod("reportBadBaseClassUse", nodeTraversalType, stringNodeType, stringType);
        reportBadBaseClassUseMethod.setAccessible(true);
        java.lang.Object[] reportBadBaseClassUseMethodArguments = new java.lang.Object[3];
        reportBadBaseClassUseMethodArguments[0] = nodeTraversal;
        reportBadBaseClassUseMethodArguments[1] = stringNode;
        reportBadBaseClassUseMethodArguments[2] = string;
        try {
            reportBadBaseClassUseMethod.invoke(processClosurePrimitives, reportBadBaseClassUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReportBadBaseClassUse2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:2144)
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:565) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method reportBadBaseClassUseMethod = processClosurePrimitivesClazz.getDeclaredMethod("reportBadBaseClassUse", nodeTraversalType, nodeType, stringType);
        reportBadBaseClassUseMethod.setAccessible(true);
        java.lang.Object[] reportBadBaseClassUseMethodArguments = new java.lang.Object[3];
        reportBadBaseClassUseMethodArguments[0] = nodeTraversal;
        reportBadBaseClassUseMethodArguments[1] = node;
        reportBadBaseClassUseMethodArguments[2] = string;
        try {
            reportBadBaseClassUseMethod.invoke(processClosurePrimitives, reportBadBaseClassUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReportBadBaseClassUse3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:565) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method reportBadBaseClassUseMethod = processClosurePrimitivesClazz.getDeclaredMethod("reportBadBaseClassUse", nodeTraversalType, numberNodeType, stringType);
        reportBadBaseClassUseMethod.setAccessible(true);
        java.lang.Object[] reportBadBaseClassUseMethodArguments = new java.lang.Object[3];
        reportBadBaseClassUseMethodArguments[0] = nodeTraversal;
        reportBadBaseClassUseMethodArguments[1] = numberNode;
        reportBadBaseClassUseMethodArguments[2] = ((Object) null);
        try {
            reportBadBaseClassUseMethod.invoke(processClosurePrimitives, reportBadBaseClassUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isNamespacePlaceholder(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NotNGetBooleanProp_2() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", stringNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): False}
 * @utbot.executesCondition {@code (n.isExprResult()): False}
 * @utbot.executesCondition {@code (n.isVar()): False}
 * @utbot.returnsFrom {@code return value != null && value.isObjectLit() && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NotNIsVar() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", stringNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NotNGetBooleanProp() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", stringNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NotNGetBooleanProp_1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", numberNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = numberNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): False}
 * @utbot.executesCondition {@code (n.isExprResult()): False}
 * @utbot.executesCondition {@code (n.isVar()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return value != null && value.isObjectLit() && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NIsVar() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", stringNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isNamespacePlaceholder(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): False}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#isExprResult()} once
    /// execute conditions:
    ///     {@code (n.isExprResult()): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.rhino.Node#getLastChild()} once,
    ///     {@link com.google.javascript.rhino.Node#isObjectLit()} once
    /// return from: {@code return value != null && value.isObjectLit() && !value.hasChildren();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (value.isObjectLit()): False}
 * @utbot.returnsFrom {@code return value != null && value.isObjectLit() && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NotValueIsObjectLit() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", stringNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (value.isObjectLit()): True}
 * @utbot.executesCondition {@code (!value.hasChildren()): False}
 * @utbot.returnsFrom {@code return value != null && value.isObjectLit() && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_ValueHasChildren() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(64);
        setField(last, "com.google.javascript.rhino.Node", "first", last);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 65536);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", stringNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (value.isObjectLit()): True}
 * @utbot.executesCondition {@code (!value.hasChildren()): True}
 * @utbot.returnsFrom {@code return value != null && value.isObjectLit() && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NotValueHasChildren() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", stringNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = stringNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isNamespacePlaceholder(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getBooleanProp(int)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !n.getBooleanProp(Node.IS_NAMESPACE)
 *  */
    @Test
    public void testIsNamespacePlaceholder_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:1148) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", nodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = ((Object) null);
        try {
            isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): False}
 * @utbot.executesCondition {@code (n.isExprResult()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = assign.getLastChild();
 *  */
    @Test
    public void testIsNamespacePlaceholder_ThrowNullPointerException_1() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:1155) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", stringNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = stringNode;
        try {
            isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): False}
 * @utbot.executesCondition {@code (n.isExprResult()): False}
 * @utbot.executesCondition {@code (n.isVar()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isVar()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = name.getFirstChild();
 *  */
    @Test
    public void testIsNamespacePlaceholder_ThrowNullPointerException_2() throws Throwable  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$IntPropListItem", "intValue", 1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:1158) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", stringNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = stringNode;
        try {
            isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isNamespacePlaceholder(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getBooleanProp(int)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !n.getBooleanProp(Node.IS_NAMESPACE)
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testIsNamespacePlaceholder_ThrowUnsupportedOperationException() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 46);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", numberNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = numberNode;
        try {
            isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields904097952359800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields904097952359800.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass904097952364000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields904097952359800.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass904097952364000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields904097952889700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields904097952889700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass904097952891300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields904097952889700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass904097952891300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

