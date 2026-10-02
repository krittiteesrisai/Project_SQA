package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.ArrayDeque;
import java.util.LinkedList;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.jscomp.SourceFile.OnDisk;
import java.util.Set;
import com.google.javascript.rhino.jstype.JSType;
import java.util.LinkedHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_VarCheckTest {
    ///region Test suites for executable com.google.javascript.jscomp.VarCheck.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() != Token.NAME): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_NGetTypeNotEqualsTokenNAME() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Node node = new Node(-255);
        
        varCheck.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() != Token.NAME): False}
 * @utbot.executesCondition {@code (varName.isEmpty()): True}
 * @utbot.executesCondition {@code (!NodeUtil.isFunctionExpression(parent)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#isEmpty()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunction(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_NodeUtilIsFunctionExpression() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
        visitMethod.invoke(varCheck, visitMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() != Token.NAME
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:114) */
        varCheck.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() != Token.NAME): False}
 * @utbot.executesCondition {@code (varName.isEmpty()): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(parent)): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope scope = t.getScope();
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:143) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() != Token.NAME): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: varName.isEmpty()
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:121) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() != Token.NAME): False}
 * @utbot.executesCondition {@code (varName.isEmpty()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: (parent.getType() == Token.VAR || NodeUtil.isFunctionDeclaration(parent)) && varsToDeclareInExterns.contains(varName)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:134) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = ((Object) null);
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() != Token.NAME): False}
 * @utbot.executesCondition {@code (varName.isEmpty()): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(parent)): True}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varsToDeclareInExterns.contains(varName)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:136) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() != Token.NAME): False}
 * @utbot.executesCondition {@code (varName.isEmpty()): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): True}
 * @utbot.executesCondition {@code (varsToDeclareInExterns.contains(varName)): True}
 * @utbot.invokes {@link java.util.Set#contains(java.lang.Object)}
 * @utbot.invokes com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: createSynthesizedExternVar(varName);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_5() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        LinkedHashSet varsToDeclareInExterns = new LinkedHashSet();
        String string = "\u0000";
        varsToDeclareInExterns.add(string);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "varsToDeclareInExterns", varsToDeclareInExterns);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:214)
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:137) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String varName = n.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Node node = new Node(38);
        
        varCheck.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (varName.isEmpty()): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(NodeUtil.isFunction(parent));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (varName.isEmpty()): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: NodeUtil.isFunctionDeclaration(parent)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException_1() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (varName.isEmpty()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: !NodeUtil.isFunctionExpression(parent)
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException_2() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit1() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(132);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:610)
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:127) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = numberNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit2() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:144) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = numberNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit3() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        ScriptOrFnNode synthesizedExternsRoot = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsRoot", synthesizedExternsRoot);
        LinkedHashSet varsToDeclareInExterns = new LinkedHashSet();
        String string = "\u0000\u0000";
        varsToDeclareInExterns.add(string);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "varsToDeclareInExterns", varsToDeclareInExterns);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(118);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:556)
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:143) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = stringNode1;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit4() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        LinkedHashSet varsToDeclareInExterns = new LinkedHashSet();
        String string = "\u0000";
        varsToDeclareInExterns.add(string);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "varsToDeclareInExterns", varsToDeclareInExterns);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) stringNode)).setType(38);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:214)
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:137) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = scriptOrFnNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit5() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        LinkedHashSet varsToDeclareInExterns = new LinkedHashSet();
        String string = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        varsToDeclareInExterns.add(string);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "varsToDeclareInExterns", varsToDeclareInExterns);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", string);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newExternInput(Compiler.java:938)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsInput(VarCheck.java:264)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:272)
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:218)
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:137) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit6() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        LinkedHashSet varsToDeclareInExterns = new LinkedHashSet();
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "varsToDeclareInExterns", varsToDeclareInExterns);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "\u0000";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:557)
            com.google.javascript.jscomp.VarCheck.visit(VarCheck.java:143) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = varCheckClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = scriptOrFnNode;
        try {
            visitMethod.invoke(varCheck, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.VarCheck.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.VarCheck.process(VarCheck.java:102) */
        varCheck.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.VarCheck.process(VarCheck.java:102) */
        varCheck.process(functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.VarCheck.process(VarCheck.java:102) */
        varCheck.process(node, null);
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-256);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        short[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.VarCheck.process(VarCheck.java:102) */
        varCheck.process(node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createSynthesizedExternVar(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(int,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#isConstant(java.lang.String)}
 * @utbot.invokes com.google.javascript.jscomp.VarCheck#getSynthesizedExternsRoot()
 * @utbot.invokes {@link com.google.javascript.rhino.Node#addChildToBack(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Set#remove(java.lang.Object)}
 *  */
    @Test
    public void testCreateSynthesizedExternVar_SetRemove() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Node synthesizedExternsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(synthesizedExternsRoot, "com.google.javascript.rhino.Node", "last", synthesizedExternsRoot);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsRoot", synthesizedExternsRoot);
        LinkedHashSet varsToDeclareInExterns = new LinkedHashSet();
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "varsToDeclareInExterns", varsToDeclareInExterns);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        String string = "";
        
        Node varCheckSynthesizedExternsRoot = ((Node) getFieldValue(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsRoot"));
        Node initialVarCheckSynthesizedExternsRootNext = ((Node) getFieldValue(varCheckSynthesizedExternsRoot, "com.google.javascript.rhino.Node", "next"));
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        
        Node varCheckSynthesizedExternsRoot1 = ((Node) getFieldValue(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsRoot"));
        Node finalVarCheckSynthesizedExternsRootNext = ((Node) getFieldValue(varCheckSynthesizedExternsRoot1, "com.google.javascript.rhino.Node", "next"));
        
        assertFalse(initialVarCheckSynthesizedExternsRootNext == finalVarCheckSynthesizedExternsRootNext);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method createSynthesizedExternVar(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testCreateSynthesizedExternVar_ThrowIllegalArgumentException() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.OnDisk sourceFile = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        ast.setSourceFile(sourceFile);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar] produces [java.lang.IllegalArgumentException: Null charset name]
            java.base/java.nio.charset.Charset.lookup(Charset.java:454)
            java.base/java.nio.charset.Charset.forName(Charset.java:525)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCharset(SourceFile.java:413)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCode(SourceFile.java:370)
            com.google.javascript.jscomp.JsAst.createAst(JsAst.java:77)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:273)
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:218) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testCreateSynthesizedExternVar_ThrowIllegalArgumentException_1() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced1 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.OnDisk referenced2 = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(referenced1, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced2);
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        ast.setSourceFile(sourceFile);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar] produces [java.lang.IllegalArgumentException: Null charset name]
            java.base/java.nio.charset.Charset.lookup(Charset.java:454)
            java.base/java.nio.charset.Charset.forName(Charset.java:525)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCharset(SourceFile.java:413)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCode(SourceFile.java:370)
            com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
            com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
            com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
            com.google.javascript.jscomp.JsAst.createAst(JsAst.java:77)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:273)
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:218) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: compiler.getCodingConvention().isConstant(varName)
 *  */
    @Test
    public void testCreateSynthesizedExternVar_ThrowNullPointerException() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:214) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: compiler.getCodingConvention().isConstant(varName)
 *  */
    @Test
    public void testCreateSynthesizedExternVar_ThrowNullPointerException_1() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:214) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varsToDeclareInExterns.remove(varName);
 *  */
    @Test
    public void testCreateSynthesizedExternVar_ThrowNullPointerException_5() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Node synthesizedExternsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(synthesizedExternsRoot, "com.google.javascript.rhino.Node", "last", last);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsRoot", synthesizedExternsRoot);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:220) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varsToDeclareInExterns.remove(varName);
 *  */
    @Test
    public void testCreateSynthesizedExternVar_ThrowNullPointerException_4() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Node synthesizedExternsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsRoot", synthesizedExternsRoot);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:220) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateSynthesizedExternVar_ThrowNullPointerException_2() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.createAst(JsAst.java:77)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:273)
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:218) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: varsToDeclareInExterns.remove(varName);
 *  */
    @Test
    public void testCreateSynthesizedExternVar_ThrowNullPointerException_3() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode last = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(root, "com.google.javascript.rhino.Node", "last", last);
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        DefaultCodingConvention codingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:220) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testCreateSynthesizedExternVar_ThrowNullPointerException_6() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast1 = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        DefaultCodingConvention defaultCodingConvention = ((DefaultCodingConvention) createInstance("com.google.javascript.jscomp.DefaultCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.createAst(JsAst.java:77)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:273)
            com.google.javascript.jscomp.VarCheck.createSynthesizedExternVar(VarCheck.java:218) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = string;
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method createSynthesizedExternVar(java.lang.String)
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#createSynthesizedExternVar(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#newString(int,java.lang.String)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Node nameNode = Node.newString(Token.NAME, varName);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testCreateSynthesizedExternVar_ThrowIllegalArgumentException_2() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Class stringType = Class.forName("java.lang.String");
        Method createSynthesizedExternVarMethod = varCheckClazz.getDeclaredMethod("createSynthesizedExternVar", stringType);
        createSynthesizedExternVarMethod.setAccessible(true);
        java.lang.Object[] createSynthesizedExternVarMethodArguments = new java.lang.Object[1];
        createSynthesizedExternVarMethodArguments[0] = ((Object) null);
        try {
            createSynthesizedExternVarMethod.invoke(varCheck, createSynthesizedExternVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for createSynthesizedExternVar
    
    public void testCreateSynthesizedExternVar_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 15 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
        // 14 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.VarCheck.getSynthesizedExternsInput
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSynthesizedExternsInput()
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#getSynthesizedExternsInput()}
 * @utbot.executesCondition {@code (synthesizedExternsInput == null): False}
 * @utbot.returnsFrom {@code return synthesizedExternsInput;}
 *  */
    @Test
    public void testGetSynthesizedExternsInput_SynthesizedExternsInputNotEqualsNull() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsInputMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsInput");
        getSynthesizedExternsInputMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsInputMethodArguments = new java.lang.Object[0];
        CompilerInput actual = ((CompilerInput) getSynthesizedExternsInputMethod.invoke(varCheck, getSynthesizedExternsInputMethodArguments));
        
        JSModule actualModule = actual.getModule();
        assertNull(actualModule);
        
        boolean actualIsExtern = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "isExtern"));
        assertFalse(actualIsExtern);
        
        String actualName = actual.getName();
        assertNull(actualName);
        
        SourceAst actualAst = ((SourceAst) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "ast"));
        assertNull(actualAst);
        
        Set actualProvides = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "provides"));
        assertNull(actualProvides);
        
        Set actualRequires = ((Set) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "requires"));
        assertNull(actualRequires);
        
        boolean actualGeneratedDependencyInfoFromSource = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "generatedDependencyInfoFromSource"));
        assertFalse(actualGeneratedDependencyInfoFromSource);
        
        ErrorManager actualErrorManager = ((ErrorManager) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "errorManager"));
        assertNull(actualErrorManager);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.CompilerInput", "compiler"));
        assertNull(actualCompiler);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSynthesizedExternsInput()
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#getSynthesizedExternsInput()}
 * @utbot.executesCondition {@code (synthesizedExternsInput == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#newExternInput(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.newExternInput("{SyntheticVarsDeclar}")
 *  */
    @Test
    public void testGetSynthesizedExternsInput_ThrowNullPointerException() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.getSynthesizedExternsInput] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsInput(VarCheck.java:264) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsInputMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsInput");
        getSynthesizedExternsInputMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsInputMethodArguments = new java.lang.Object[0];
        try {
            getSynthesizedExternsInputMethod.invoke(varCheck, getSynthesizedExternsInputMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getSynthesizedExternsRoot()
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#getSynthesizedExternsRoot()}
 * @utbot.executesCondition {@code (synthesizedExternsRoot == null): False}
 * @utbot.returnsFrom {@code return synthesizedExternsRoot;}
 *  */
    @Test
    public void testGetSynthesizedExternsRoot_SynthesizedExternsRootNotEqualsNull() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Node synthesizedExternsRoot = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsRoot", synthesizedExternsRoot);
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        Node actual = ((Node) getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments));
        
        int synthesizedExternsRootType = synthesizedExternsRoot.getType();
        int actualType = actual.getType();
        assertEquals(synthesizedExternsRootType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int synthesizedExternsRootSourcePosition = ((Integer) getFieldValue(synthesizedExternsRoot, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(synthesizedExternsRootSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#getSynthesizedExternsRoot()}
 * @utbot.executesCondition {@code (synthesizedExternsRoot == null): True}
 * @utbot.returnsFrom {@code return synthesizedExternsRoot;}
 *  */
    @Test
    public void testGetSynthesizedExternsRoot_SynthesizedExternsRootEqualsNull() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(ast, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        Node actual = ((Node) getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments));
        
        int rootType = root.getType();
        int actualType = actual.getType();
        assertEquals(rootType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int rootSourcePosition = ((Integer) getFieldValue(root, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(rootSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#getSynthesizedExternsRoot()}
 * @utbot.executesCondition {@code (synthesizedExternsRoot == null): True}
 * @utbot.returnsFrom {@code return synthesizedExternsRoot;}
 *  */
    @Test
    public void testGetSynthesizedExternsRoot_SynthesizedExternsRootEqualsNull_1() throws Exception  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast1 = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast2 = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        Node root = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(ast2, "com.google.javascript.jscomp.JsAst", "root", root);
        setField(ast1, "com.google.javascript.jscomp.CompilerInput", "ast", ast2);
        setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        Node actual = ((Node) getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments));
        
        int rootType = root.getType();
        int actualType = actual.getType();
        assertEquals(rootType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int rootSourcePosition = ((Integer) getFieldValue(root, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(rootSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getSynthesizedExternsRoot()
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#getSynthesizedExternsRoot()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testGetSynthesizedExternsRoot_ThrowIllegalArgumentException_1() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        SourceFile.OnDisk sourceFile = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        ast.setSourceFile(sourceFile);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot] produces [java.lang.IllegalArgumentException: Null charset name]
            java.base/java.nio.charset.Charset.lookup(Charset.java:454)
            java.base/java.nio.charset.Charset.forName(Charset.java:525)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCharset(SourceFile.java:413)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCode(SourceFile.java:370)
            com.google.javascript.jscomp.JsAst.createAst(JsAst.java:77)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:273) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        try {
            getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#getSynthesizedExternsRoot()}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} 
 *  */
    @Test
    public void testGetSynthesizedExternsRoot_ThrowIllegalArgumentException() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.OnDisk referenced = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        ast.setSourceFile(sourceFile);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot] produces [java.lang.IllegalArgumentException: Null charset name]
            java.base/java.nio.charset.Charset.lookup(Charset.java:454)
            java.base/java.nio.charset.Charset.forName(Charset.java:525)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCharset(SourceFile.java:413)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCode(SourceFile.java:370)
            com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
            com.google.javascript.jscomp.JsAst.createAst(JsAst.java:77)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:273) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        try {
            getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#getSynthesizedExternsRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: CompilerInput synthesizedExterns = getSynthesizedExternsInput();
 *  */
    @Test
    public void testGetSynthesizedExternsRoot_ThrowNullPointerException() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsInput(VarCheck.java:264)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:272) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        try {
            getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link VarCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.VarCheck#getSynthesizedExternsRoot()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: synthesizedExternsRoot = synthesizedExterns.getAstRoot(compiler);
 *  */
    @Test
    public void testGetSynthesizedExternsRoot_ThrowNullPointerException_1() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.createAst(JsAst.java:77)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:273) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        try {
            getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getSynthesizedExternsRoot()
    
    @Test
    public void testGetSynthesizedExternsRoot1() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        CompilerInput ast1 = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast2 = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced1 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced2 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced3 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.OnDisk referenced4 = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        setField(referenced3, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced4);
        setField(referenced2, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced3);
        setField(referenced1, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced2);
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        ast2.setSourceFile(sourceFile);
        setField(ast1, "com.google.javascript.jscomp.CompilerInput", "ast", ast2);
        setField(ast, "com.google.javascript.jscomp.CompilerInput", "ast", ast1);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot] produces [java.lang.IllegalArgumentException: Null charset name]
            java.base/java.nio.charset.Charset.lookup(Charset.java:454)
            java.base/java.nio.charset.Charset.forName(Charset.java:525)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCharset(SourceFile.java:413)
            com.google.javascript.jscomp.SourceFile$OnDisk.getCode(SourceFile.java:370)
            com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
            com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
            com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
            com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
            com.google.javascript.jscomp.JSSourceFile.getCode(JSSourceFile.java:78)
            com.google.javascript.jscomp.JsAst.createAst(JsAst.java:77)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:273) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        try {
            getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetSynthesizedExternsRoot2() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        LinkedHashMap inputsByName = new LinkedHashMap();
        String string = "";
        CompilerInput compilerInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        inputsByName.put(string, compilerInput);
        setField(compiler, "com.google.javascript.jscomp.Compiler", "inputsByName", inputsByName);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.newExternInput(Compiler.java:944)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsInput(VarCheck.java:264)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:272) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        try {
            getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetSynthesizedExternsRoot3() throws Throwable  {
        VarCheck varCheck = ((VarCheck) createInstance("com.google.javascript.jscomp.VarCheck"));
        CompilerInput synthesizedExternsInput = ((CompilerInput) createInstance("com.google.javascript.jscomp.CompilerInput"));
        JsAst ast = ((JsAst) createInstance("com.google.javascript.jscomp.JsAst"));
        JSSourceFile sourceFile = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced1 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced2 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced3 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        JSSourceFile referenced4 = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        SourceFile.OnDisk referenced5 = ((SourceFile.OnDisk) createInstance("com.google.javascript.jscomp.SourceFile$OnDisk"));
        String code = "";
        setField(referenced5, "com.google.javascript.jscomp.SourceFile", "code", code);
        setField(referenced4, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced5);
        setField(referenced3, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced4);
        setField(referenced2, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced3);
        setField(referenced1, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced2);
        setField(referenced, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced1);
        setField(sourceFile, "com.google.javascript.jscomp.JSSourceFile", "referenced", referenced);
        ast.setSourceFile(sourceFile);
        setField(synthesizedExternsInput, "com.google.javascript.jscomp.CompilerInput", "ast", ast);
        setField(varCheck, "com.google.javascript.jscomp.VarCheck", "synthesizedExternsInput", synthesizedExternsInput);
        
        /* This test fails because method [com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JsAst.parse(JsAst.java:89)
            com.google.javascript.jscomp.JsAst.createAst(JsAst.java:77)
            com.google.javascript.jscomp.JsAst.getAstRoot(JsAst.java:50)
            com.google.javascript.jscomp.CompilerInput.getAstRoot(CompilerInput.java:102)
            com.google.javascript.jscomp.VarCheck.getSynthesizedExternsRoot(VarCheck.java:273) */
        Class varCheckClazz = Class.forName("com.google.javascript.jscomp.VarCheck");
        Method getSynthesizedExternsRootMethod = varCheckClazz.getDeclaredMethod("getSynthesizedExternsRoot");
        getSynthesizedExternsRootMethod.setAccessible(true);
        java.lang.Object[] getSynthesizedExternsRootMethodArguments = new java.lang.Object[0];
        try {
            getSynthesizedExternsRootMethod.invoke(varCheck, getSynthesizedExternsRootMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for getSynthesizedExternsRoot
    
    public void testGetSynthesizedExternsRoot_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 24 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
        // 10 occurrences of:
        /* Unable to make field private static volatile java.lang.Object[] java.nio.charset.Charset.cache1 accessible:
        module java.base does not "opens java.nio.charset" to unnamed module @4fcd19b3 */
        
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
        
                java.lang.reflect.Method methodForGetDeclaredFields898337299312300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields898337299312300.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass898337299321000 = (java.lang.reflect.Field[]) methodForGetDeclaredFields898337299312300.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass898337299321000).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields898337300074600 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields898337300074600.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass898337300078700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields898337300074600.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass898337300078700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

