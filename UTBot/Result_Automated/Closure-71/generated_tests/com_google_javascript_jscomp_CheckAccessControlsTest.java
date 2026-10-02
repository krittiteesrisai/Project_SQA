package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.FunctionNode;
import java.util.LinkedList;
import java.util.ArrayDeque;
import com.google.javascript.rhino.ScriptOrFnNode;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.TemplateType;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.FunctionPrototypeType;
import java.util.List;
import java.util.Map;
import java.lang.reflect.InvocationTargetException;
import com.google.common.base.Predicate;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.HashSet;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.NumberType;
import java.util.LinkedHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Set;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_CheckAccessControlsTest {
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_SwitchNGetTypeCasedefault() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(-255);
        
        checkAccessControls.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.CheckAccessControls#checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_CheckAccessControlsCheckConstructorDeprecation() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(30);
        
        checkAccessControls.visit(null, node, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkPropertyDeprecation(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(33);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(CheckAccessControls.java:294)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:221) */
        checkAccessControls.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkPropertyVisibility(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(33);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility(CheckAccessControls.java:410)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:222) */
        checkAccessControls.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNameVisibility(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_7() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility(CheckAccessControls.java:324)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:218) */
        checkAccessControls.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNameDeprecation(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_8() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation(CheckAccessControls.java:266)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:217) */
        checkAccessControls.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNameVisibility(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_9() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility(CheckAccessControls.java:324)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:218) */
        checkAccessControls.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNameVisibility(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_10() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility(CheckAccessControls.java:324)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:218) */
        checkAccessControls.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:215) */
        checkAccessControls.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNameDeprecation(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(38);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation(CheckAccessControls.java:261)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:217) */
        checkAccessControls.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkPropertyDeprecation(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(33);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(CheckAccessControls.java:289)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:221) */
        checkAccessControls.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkPropertyDeprecation(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_5() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(CheckAccessControls.java:295)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:221) */
        checkAccessControls.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkPropertyVisibility(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_6() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility(CheckAccessControls.java:411)
            com.google.javascript.jscomp.CheckAccessControls.visit(CheckAccessControls.java:222) */
        checkAccessControls.visit(null, node, functionNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: checkPropertyDeprecation(t, n, parent);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        checkAccessControls.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.CheckAccessControls#checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: checkPropertyVisibility(t, n, parent);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        
        checkAccessControls.visit(null, node, functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeTraversal.traverse(compiler, root, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CheckAccessControls.process(CheckAccessControls.java:120) */
        checkAccessControls.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.exitScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 *  */
    @Test
    public void testExitScope() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.exitScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): False}
 *  */
    @Test
    public void testExitScope_MethodDepthNotEqualsZero() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth", -255);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(functionNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.exitScope(nodeTraversal);
        
        int finalCheckAccessControlsMethodDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth"));
        
        assertEquals(-256, finalCheckAccessControlsMethodDepth);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): False}
 *  */
    @Test
    public void testExitScope_MethodDepthNotEqualsZero_1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(functionNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.exitScope(nodeTraversal);
        
        int finalCheckAccessControlsMethodDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth"));
        
        assertEquals(-1, finalCheckAccessControlsMethodDepth);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): False}
 *  */
    @Test
    public void testExitScope_MethodDepthNotEqualsZero_2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        FunctionNode rootNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode.setType(105);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jsType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.exitScope(nodeTraversal);
        
        int finalCheckAccessControlsMethodDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth"));
        
        assertEquals(-1, finalCheckAccessControlsMethodDepth);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): False}
 *  */
    @Test
    public void testExitScope_MethodDepthNotEqualsZero_4() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        FunctionNode rootNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode.setType(105);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jsType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.exitScope(nodeTraversal);
        
        int finalCheckAccessControlsMethodDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth"));
        
        assertEquals(-1, finalCheckAccessControlsMethodDepth);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): True}
 *  */
    @Test
    public void testExitScope_MethodDepthEqualsZero() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth", 1);
        Object currentClass = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "currentClass", currentClass);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        FunctionNode rootNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode.setType(105);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 256);
        setField(jsType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.exitScope(nodeTraversal);
        
        int finalCheckAccessControlsDeprecatedDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "deprecatedDepth"));
        int finalCheckAccessControlsMethodDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth"));
        JSType finalCheckAccessControlsCurrentClass = ((JSType) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "currentClass"));
        
        assertEquals(-1, finalCheckAccessControlsDeprecatedDepth);
        
        assertEquals(0, finalCheckAccessControlsMethodDepth);
        
        assertNull(finalCheckAccessControlsCurrentClass);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): False}
 *  */
    @Test
    public void testExitScope_MethodDepthNotEqualsZero_3() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        FunctionNode rootNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        rootNode.setType(105);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String deprecated = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "deprecated", deprecated);
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 256);
        setField(jsType, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.exitScope(nodeTraversal);
        
        int finalCheckAccessControlsDeprecatedDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "deprecatedDepth"));
        int finalCheckAccessControlsMethodDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth"));
        
        assertEquals(-1, finalCheckAccessControlsDeprecatedDepth);
        
        assertEquals(-1, finalCheckAccessControlsMethodDepth);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !t.inGlobalScope()
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.exitScope(CheckAccessControls.java:144) */
        checkAccessControls.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException_1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.exitScope(CheckAccessControls.java:146) */
        checkAccessControls.exitScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException_2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.exitScope(CheckAccessControls.java:146) */
        checkAccessControls.exitScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.enterScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 *  */
    @Test
    public void testEnterScope() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): False}
 *  */
    @Test
    public void testEnterScope_MethodDepthNotEqualsZero() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth", -255);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(functionNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.enterScope(nodeTraversal);
        
        int finalCheckAccessControlsMethodDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth"));
        
        assertEquals(-254, finalCheckAccessControlsMethodDepth);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): False}
 *  */
    @Test
    public void testEnterScope_MethodDepthNotEqualsZero_1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        setField(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth", 1);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(functionNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.enterScope(nodeTraversal);
        
        int finalCheckAccessControlsMethodDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth"));
        
        assertEquals(2, finalCheckAccessControlsMethodDepth);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !t.inGlobalScope()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.enterScope(CheckAccessControls.java:129) */
        checkAccessControls.enterScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.enterScope(CheckAccessControls.java:131) */
        checkAccessControls.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.enterScope(CheckAccessControls.java:131) */
        checkAccessControls.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currentClass = getClassOfMethod(n, parent);
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_3() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        scopeRoots.add(functionNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:163)
            com.google.javascript.jscomp.CheckAccessControls.enterScope(CheckAccessControls.java:137) */
        checkAccessControls.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (methodDepth == 0): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currentClass = getClassOfMethod(n, parent);
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_4() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(86);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(functionNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:165)
            com.google.javascript.jscomp.CheckAccessControls.enterScope(CheckAccessControls.java:137) */
        checkAccessControls.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    @Test
    public void testEnterScope1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(86);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(stringNode);
        scopeRoots.add(nodeTraversal);
        scopeRoots.add(nodeTraversal);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.enterScope(nodeTraversal);
        
        int finalCheckAccessControlsMethodDepth = ((Integer) getFieldValue(checkAccessControls, "com.google.javascript.jscomp.CheckAccessControls", "methodDepth"));
        
        assertEquals(1, finalCheckAccessControlsMethodDepth);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    @Test(expected = StackOverflowError.class)
    public void testEnterScope2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        ScriptOrFnNode rootNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        rootNode.setType(105);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        scopes.add(scope);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        checkAccessControls.enterScope(nodeTraversal);
    }
    
    @Test
    public void testEnterScope3() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType2 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        scopeRoots.add(stringNode);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.getJSDocInfo(ProxyObjectType.java:289)
            com.google.javascript.rhino.jstype.TemplateType.getJSDocInfo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.getJSDocInfo(ProxyObjectType.java:289)
            com.google.javascript.rhino.jstype.TemplateType.getJSDocInfo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.getJSDocInfo(ProxyObjectType.java:289)
            com.google.javascript.rhino.jstype.ProxyObjectType.getJSDocInfo(ProxyObjectType.java:289)
            com.google.javascript.rhino.jstype.ProxyObjectType.getJSDocInfo(ProxyObjectType.java:289)
            com.google.javascript.rhino.jstype.TemplateType.getJSDocInfo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.getJSDocInfo(ProxyObjectType.java:289)
            com.google.javascript.rhino.jstype.TemplateType.getJSDocInfo(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.getJSDocInfo(ProxyObjectType.java:289)
            com.google.javascript.rhino.jstype.TemplateType.getJSDocInfo(TemplateType.java:48)
            com.google.javascript.jscomp.CheckAccessControls.getTypeDeprecationInfo(CheckAccessControls.java:597)
            com.google.javascript.jscomp.CheckAccessControls.isDeprecatedFunction(CheckAccessControls.java:580)
            com.google.javascript.jscomp.CheckAccessControls.enterScope(CheckAccessControls.java:132) */
        checkAccessControls.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getClassOfMethod(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetClassOfMethod_ReturnNull() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = node;
        JSType actual = ((JSType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetClassOfMethod_ReturnNull_2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = node;
        JSType actual = ((JSType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes com.google.javascript.jscomp.CheckAccessControls#normalizeClassType(com.google.javascript.rhino.jstype.JSType)
 * @utbot.returnsFrom {@code return normalizeClassType(n.getJSType());}
 *  */
    @Test
    public void testGetClassOfMethod_CheckAccessControlsNormalizeClassType_1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(-255);
        Node node1 = new Node(38);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = node1;
        JSType actual = ((JSType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetClassOfMethod_ReturnNull_3() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Node node1 = new Node(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = node1;
        JSType actual = ((JSType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetClassOfMethod_ReturnNull_1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = node;
        JSType actual = ((JSType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isConstructor()}
 * @utbot.returnsFrom {@code return normalizeClassType(lValue.getFirstChild().getJSType());}
 *  */
    @Test
    public void testGetClassOfMethod_JSTypeIsConstructor() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = scriptOrFnNode;
        JSType actual = ((JSType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes com.google.javascript.jscomp.CheckAccessControls#normalizeClassType(com.google.javascript.rhino.jstype.JSType)
 * @utbot.returnsFrom {@code return normalizeClassType(lValue.getJSType());}
 *  */
    @Test
    public void testGetClassOfMethod_CheckAccessControlsNormalizeClassType() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = scriptOrFnNode;
        UnknownType actual = ((UnknownType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        boolean actualIsChecked = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnknownType", "isChecked"));
        assertFalse(actualIsChecked);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return normalizeClassType(lValue.getFirstChild().getJSType());}
 *  */
    @Test
    public void testGetClassOfMethod_ReturnNormalizeClassType() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(42);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = node;
        Object actual = getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        
        JSType jsTypeReferencedType = ((JSType) getFieldValue(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(jsTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getClassOfMethod(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isConstructor()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: return ((FunctionType) lValueType).getInstanceType();
 *  */
    @Test
    public void testGetClassOfMethod_ThrowClassCastException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoObjectType referencedType1 = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(referencedType1, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.TemplateType cannot be cast to class com.google.javascript.rhino.jstype.FunctionType (com.google.javascript.rhino.jstype.TemplateType and com.google.javascript.rhino.jstype.FunctionType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @3067726d)]
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:172) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = scriptOrFnNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent.getType() == Token.ASSIGN
 *  */
    @Test
    public void testGetClassOfMethod_ThrowNullPointerException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:163) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = ((Object) null);
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lValue.isQualifiedName()
 *  */
    @Test
    public void testGetClassOfMethod_ThrowNullPointerException_1() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(86);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:165) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = node;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getClassOfMethod(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getClassOfMethod(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionDeclaration(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} when: parent.getType() == Token.ASSIGN
 *  */
    @Test(expected = IllegalStateException.class)
    public void testGetClassOfMethod_ThrowIllegalStateException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Node node1 = new Node(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = node1;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getClassOfMethod(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testGetClassOfMethod1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = functionNode;
        JSType actual = ((JSType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testGetClassOfMethod2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = stringNode;
        BooleanType actual = ((BooleanType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testGetClassOfMethod3() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first2)).setType(42);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = numberNode;
        JSType actual = ((JSType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testGetClassOfMethod4() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", stringNodeType, stringNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = stringNode;
        getClassOfMethodMethodArguments[1] = stringNode1;
        UnknownType actual = ((UnknownType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        boolean actualIsChecked = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnknownType", "isChecked"));
        assertFalse(actualIsChecked);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testGetClassOfMethod5() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(42);
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", functionNodeType, functionNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = functionNode;
        getClassOfMethodMethodArguments[1] = numberNode;
        BooleanType actual = ((BooleanType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testGetClassOfMethod6() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(0);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = functionNode;
        NoType actual = ((NoType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testGetClassOfMethod7() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(42);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "jsType", referencedType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", stringNodeType, stringNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = stringNode;
        getClassOfMethodMethodArguments[1] = node;
        TemplateType actual = ((TemplateType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType jsTypeReferencedType = ((JSType) getFieldValue(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(jsTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testGetClassOfMethod8() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType5 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(125);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", stringNodeType, stringNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = stringNode;
        getClassOfMethodMethodArguments[1] = stringNode1;
        TemplateType actual = ((TemplateType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType jsTypeReferencedType = ((JSType) getFieldValue(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(jsTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testGetClassOfMethod9() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType5 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", functionNodeType, functionNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = functionNode;
        getClassOfMethodMethodArguments[1] = scriptOrFnNode;
        TemplateType actual = ((TemplateType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType jsTypeReferencedType = ((JSType) getFieldValue(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(jsTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testGetClassOfMethod10() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType4 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        Object referencedType5 = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", functionNodeType, functionNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = functionNode;
        getClassOfMethodMethodArguments[1] = node;
        TemplateType actual = ((TemplateType) getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType jsTypeReferencedType = ((JSType) getFieldValue(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(jsTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getClassOfMethod(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod11() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", scriptOrFnNodeType, scriptOrFnNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = scriptOrFnNode;
        getClassOfMethodMethodArguments[1] = stringNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod12() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = stringNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod13() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", functionNodeType, functionNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = functionNode;
        getClassOfMethodMethodArguments[1] = stringNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod14() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", scriptOrFnNodeType, scriptOrFnNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = scriptOrFnNode;
        getClassOfMethodMethodArguments[1] = numberNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod15() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", scriptOrFnNodeType, scriptOrFnNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = scriptOrFnNode;
        getClassOfMethodMethodArguments[1] = numberNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod16() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = stringNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod17() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(42);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", scriptOrFnNodeType, scriptOrFnNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = scriptOrFnNode;
        getClassOfMethodMethodArguments[1] = numberNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod18() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first2)).setType(33);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first3)).setType(38);
        setField(first2, "com.google.javascript.rhino.Node", "first", first3);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = stringNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod19() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType4 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", functionNodeType, functionNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = functionNode;
        getClassOfMethodMethodArguments[1] = node;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod20() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(0);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(42);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = scriptOrFnNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testGetClassOfMethod21() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(42);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        FunctionType jsType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = scriptOrFnNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetClassOfMethod22() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        FunctionPrototypeType jsType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(126);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.normalizeClassType(CheckAccessControls.java:203)
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:186) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", stringNodeType, stringNodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = stringNode;
        getClassOfMethodMethodArguments[1] = stringNode1;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetClassOfMethod23() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(33);
        Object first2 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first2)).setType(33);
        Object first3 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first3)).setType(42);
        setField(first2, "com.google.javascript.rhino.Node", "first", first3);
        setField(first1, "com.google.javascript.rhino.Node", "first", first2);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isConstructor(ProxyObjectType.java:162)
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:169) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = stringNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetClassOfMethod24() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(0);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(42);
        FunctionPrototypeType jsType = ((FunctionPrototypeType) createInstance("com.google.javascript.rhino.jstype.FunctionPrototypeType"));
        setField(first1, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        TemplateType jsType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        FunctionType referencedType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(jsType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.normalizeClassType(CheckAccessControls.java:203)
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:176) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = node;
        getClassOfMethodMethodArguments[1] = scriptOrFnNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetClassOfMethod25() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType4 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isConstructor(ProxyObjectType.java:162)
            com.google.javascript.rhino.jstype.ProxyObjectType.isConstructor(ProxyObjectType.java:162)
            com.google.javascript.rhino.jstype.TemplateType.isConstructor(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isConstructor(ProxyObjectType.java:162)
            com.google.javascript.rhino.jstype.TemplateType.isConstructor(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isConstructor(ProxyObjectType.java:162)
            com.google.javascript.rhino.jstype.TemplateType.isConstructor(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isConstructor(ProxyObjectType.java:162)
            com.google.javascript.rhino.jstype.TemplateType.isConstructor(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isConstructor(ProxyObjectType.java:162)
            com.google.javascript.rhino.jstype.TemplateType.isConstructor(TemplateType.java:48)
            com.google.javascript.jscomp.CheckAccessControls.getClassOfMethod(CheckAccessControls.java:169) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getClassOfMethodMethod = checkAccessControlsClazz.getDeclaredMethod("getClassOfMethod", nodeType, nodeType);
        getClassOfMethodMethod.setAccessible(true);
        java.lang.Object[] getClassOfMethodMethodArguments = new java.lang.Object[2];
        getClassOfMethodMethodArguments[0] = ((Object) null);
        getClassOfMethodMethodArguments[1] = functionNode;
        try {
            getClassOfMethodMethod.invoke(checkAccessControls, getClassOfMethodMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.hotSwapScript
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hotSwapScript(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#hotSwapScript(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testHotSwapScript_ThrowNullPointerException() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CheckAccessControls.hotSwapScript(CheckAccessControls.java:125) */
        checkAccessControls.hotSwapScript(null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hotSwapScript(com.google.javascript.rhino.Node)
    
    @Test
    public void testHotSwapScript1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        
        checkAccessControls.hotSwapScript(functionNode);
    }
    
    @Test
    public void testHotSwapScript2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        checkAccessControls.hotSwapScript(functionNode);
    }
    
    @Test
    public void testHotSwapScript3() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        checkAccessControls.hotSwapScript(scriptOrFnNode);
    }
    
    @Test
    public void testHotSwapScript4() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        checkAccessControls.hotSwapScript(functionNode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hotSwapScript(com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testHotSwapScript5() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        checkAccessControls.hotSwapScript(functionNode);
    }
    
    @Test
    public void testHotSwapScript6() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CheckAccessControls.hotSwapScript(CheckAccessControls.java:125) */
        checkAccessControls.hotSwapScript(functionNode);
    }
    
    @Test
    public void testHotSwapScript7() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CheckAccessControls.hotSwapScript(CheckAccessControls.java:125) */
        checkAccessControls.hotSwapScript(functionNode);
    }
    
    @Test
    public void testHotSwapScript8() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CheckAccessControls.hotSwapScript(CheckAccessControls.java:125) */
        checkAccessControls.hotSwapScript(functionNode);
    }
    
    @Test
    public void testHotSwapScript9() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.hotSwapScript] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.CheckAccessControls.hotSwapScript(CheckAccessControls.java:125) */
        checkAccessControls.hotSwapScript(functionNode);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method hotSwapScript(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testHotSwapScript10() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        checkAccessControls.hotSwapScript(functionNode);
    }
    
    @Test(timeout = 1000L)
    public void testHotSwapScript11() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        checkAccessControls.hotSwapScript(functionNode);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.dereference
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dereference(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#dereference(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.returnsFrom {@code return type == null ? null : type.dereference();}
 *  */
    @Test
    public void testDereference_TypeEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method dereferenceMethod = checkAccessControlsClazz.getDeclaredMethod("dereference", jSTypeType);
        dereferenceMethod.setAccessible(true);
        java.lang.Object[] dereferenceMethodArguments = new java.lang.Object[1];
        dereferenceMethodArguments[0] = ((Object) null);
        JSType actual = ((JSType) dereferenceMethod.invoke(null, dereferenceMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dereference(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#dereference(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#dereference()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: type.dereference()
 *  */
    @Test
    public void testDereference_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        VoidType voidType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(voidType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.dereference] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:479)
            com.google.javascript.jscomp.CheckAccessControls.dereference(CheckAccessControls.java:640) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class voidTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method dereferenceMethod = checkAccessControlsClazz.getDeclaredMethod("dereference", voidTypeType);
        dereferenceMethod.setAccessible(true);
        java.lang.Object[] dereferenceMethodArguments = new java.lang.Object[1];
        dereferenceMethodArguments[0] = voidType;
        try {
            dereferenceMethod.invoke(null, dereferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method dereference(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testDereference1() throws Exception  {
        Object namedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class namedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method dereferenceMethod = checkAccessControlsClazz.getDeclaredMethod("dereference", namedTypeType);
        dereferenceMethod.setAccessible(true);
        java.lang.Object[] dereferenceMethodArguments = new java.lang.Object[1];
        dereferenceMethodArguments[0] = namedType;
        Object actual = dereferenceMethod.invoke(null, dereferenceMethodArguments);
        
        String actualReference = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "reference"));
        assertNull(actualReference);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "sourceName"));
        assertNull(actualSourceName);
        
        int namedTypeLineno = ((Integer) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "lineno"));
        int actualLineno = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "lineno"));
        assertEquals(namedTypeLineno, actualLineno);
        
        int namedTypeCharno = ((Integer) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "charno"));
        int actualCharno = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "charno"));
        assertEquals(namedTypeCharno, actualCharno);
        
        Predicate actualValidator = ((Predicate) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        assertNull(actualValidator);
        
        List actualPropertyContinuations = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "propertyContinuations"));
        assertNull(actualPropertyContinuations);
        
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        assertNull(actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testDereference2() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        alternates.add(functionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method dereferenceMethod = checkAccessControlsClazz.getDeclaredMethod("dereference", unionTypeType);
        dereferenceMethod.setAccessible(true);
        java.lang.Object[] dereferenceMethodArguments = new java.lang.Object[1];
        dereferenceMethodArguments[0] = unionType;
        FunctionType actual = ((FunctionType) dereferenceMethod.invoke(null, dereferenceMethodArguments));
        
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        assertNull(actualCall);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object functionTypeKind = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertEquals(functionTypeKind, actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String functionTypeClassName = ((String) getFieldValue(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertEquals(functionTypeClassName, actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testDereference3() throws Exception  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        VoidType returnType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        alternates.add(functionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method dereferenceMethod = checkAccessControlsClazz.getDeclaredMethod("dereference", unionTypeType);
        dereferenceMethod.setAccessible(true);
        java.lang.Object[] dereferenceMethodArguments = new java.lang.Object[1];
        dereferenceMethodArguments[0] = unionType;
        FunctionType actual = ((FunctionType) dereferenceMethod.invoke(null, dereferenceMethodArguments));
        
        Object functionTypeCall = getFieldValue(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call");
        Object actualCall = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "call");
        Node actualCallParameters = ((Node) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.ArrowType", "parameters"));
        assertNull(actualCallParameters);
        
        JSType functionTypeCallReturnType = ((JSType) getFieldValue(functionTypeCall, "com.google.javascript.rhino.jstype.ArrowType", "returnType"));
        JSType actualCallReturnType = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.ArrowType", "returnType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(functionTypeCallReturnType, actualCallReturnType);
        
        boolean actualCallReturnTypeInferred = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.ArrowType", "returnTypeInferred"));
        assertFalse(actualCallReturnTypeInferred);
        
        boolean actualCallResolved = ((Boolean) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualCallResolved);
        
        JSType actualCallResolveResult = ((JSType) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualCallResolveResult);
        
        JSTypeRegistry actualCallRegistry = ((JSTypeRegistry) getFieldValue(actualCall, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualCallRegistry);
        
        FunctionPrototypeType actualPrototype = actual.getPrototype();
        assertNull(actualPrototype);
        
        Object actualKind = getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "kind");
        assertNull(actualKind);
        
        ObjectType actualTypeOfThis = actual.getTypeOfThis();
        assertNull(actualTypeOfThis);
        
        Node actualSource = actual.getSource();
        assertNull(actualSource);
        
        List actualImplementedInterfaces = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.FunctionType", "implementedInterfaces"));
        assertNull(actualImplementedInterfaces);
        
        List actualSubTypes = actual.getSubTypes();
        assertNull(actualSubTypes);
        
        String actualTemplateTypeName = actual.getTemplateTypeName();
        assertNull(actualTemplateTypeName);
        
        String actualClassName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className"));
        assertNull(actualClassName);
        
        Map actualProperties = ((Map) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties"));
        assertNull(actualProperties);
        
        boolean actualNativeType = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType"));
        assertFalse(actualNativeType);
        
        ObjectType actualImplicitPrototypeFallback = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback"));
        assertNull(actualImplicitPrototypeFallback);
        
        boolean actualPrettyPrint = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.PrototypeObjectType", "prettyPrint"));
        assertFalse(actualPrettyPrint);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        assertTrue(deepEquals(functionType, actual));
        assertTrue(deepEquals(functionType, actual));
        assertTrue(deepEquals(functionType, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method dereference(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testDereference4() throws Throwable  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.dereference] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:181)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:193)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:215)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:479)
            com.google.javascript.jscomp.CheckAccessControls.dereference(CheckAccessControls.java:640) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method dereferenceMethod = checkAccessControlsClazz.getDeclaredMethod("dereference", unionTypeType);
        dereferenceMethod.setAccessible(true);
        java.lang.Object[] dereferenceMethodArguments = new java.lang.Object[1];
        dereferenceMethodArguments[0] = unionType;
        try {
            dereferenceMethod.invoke(null, dereferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDereference5() throws Throwable  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.dereference] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:181)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:193)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:215)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:479)
            com.google.javascript.jscomp.CheckAccessControls.dereference(CheckAccessControls.java:640) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method dereferenceMethod = checkAccessControlsClazz.getDeclaredMethod("dereference", unionTypeType);
        dereferenceMethod.setAccessible(true);
        java.lang.Object[] dereferenceMethodArguments = new java.lang.Object[1];
        dereferenceMethodArguments[0] = unionType;
        try {
            dereferenceMethod.invoke(null, dereferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDereference6() throws Throwable  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        alternates.add(null);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.dereference] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:213)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:479)
            com.google.javascript.jscomp.CheckAccessControls.dereference(CheckAccessControls.java:640) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method dereferenceMethod = checkAccessControlsClazz.getDeclaredMethod("dereference", unionTypeType);
        dereferenceMethod.setAccessible(true);
        java.lang.Object[] dereferenceMethodArguments = new java.lang.Object[1];
        dereferenceMethodArguments[0] = unionType;
        try {
            dereferenceMethod.invoke(null, dereferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDereference7() throws Throwable  {
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        HashSet alternates = new HashSet();
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        alternates.add(functionType);
        setField(unionType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(unionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.dereference] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:181)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:193)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:215)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:479)
            com.google.javascript.jscomp.CheckAccessControls.dereference(CheckAccessControls.java:640) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class unionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method dereferenceMethod = checkAccessControlsClazz.getDeclaredMethod("dereference", unionTypeType);
        dereferenceMethod.setAccessible(true);
        java.lang.Object[] dereferenceMethodArguments = new java.lang.Object[1];
        dereferenceMethodArguments[0] = unionType;
        try {
            dereferenceMethod.invoke(null, dereferenceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.shouldTraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        boolean actual = checkAccessControls.shouldTraverse(null, null, null);
        
        assertTrue(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.normalizeClassType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method normalizeClassType(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#normalizeClassType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): True}
 *  */
    @Test
    public void testNormalizeClassType_TypeEqualsNull() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method normalizeClassTypeMethod = checkAccessControlsClazz.getDeclaredMethod("normalizeClassType", jSTypeType);
        normalizeClassTypeMethod.setAccessible(true);
        java.lang.Object[] normalizeClassTypeMethodArguments = new java.lang.Object[1];
        normalizeClassTypeMethodArguments[0] = ((Object) null);
        JSType actual = ((JSType) normalizeClassTypeMethod.invoke(checkAccessControls, normalizeClassTypeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#normalizeClassType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 *  */
    @Test
    public void testNormalizeClassType_TypeNotEqualsNull() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        UnknownType unknownType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class unknownTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method normalizeClassTypeMethod = checkAccessControlsClazz.getDeclaredMethod("normalizeClassType", unknownTypeType);
        normalizeClassTypeMethod.setAccessible(true);
        java.lang.Object[] normalizeClassTypeMethodArguments = new java.lang.Object[1];
        normalizeClassTypeMethodArguments[0] = unknownType;
        UnknownType actual = ((UnknownType) normalizeClassTypeMethod.invoke(checkAccessControls, normalizeClassTypeMethodArguments));
        
        boolean actualIsChecked = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.UnknownType", "isChecked"));
        assertFalse(actualIsChecked);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#normalizeClassType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 *  */
    @Test
    public void testNormalizeClassType_TypeNotEqualsNull_3() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class proxyObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method normalizeClassTypeMethod = checkAccessControlsClazz.getDeclaredMethod("normalizeClassType", proxyObjectTypeType);
        normalizeClassTypeMethod.setAccessible(true);
        java.lang.Object[] normalizeClassTypeMethodArguments = new java.lang.Object[1];
        normalizeClassTypeMethodArguments[0] = proxyObjectType;
        Object actual = normalizeClassTypeMethod.invoke(checkAccessControls, normalizeClassTypeMethodArguments);
        
        JSType proxyObjectTypeReferencedType = ((JSType) getFieldValue(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(proxyObjectTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#normalizeClassType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 *  */
    @Test
    public void testNormalizeClassType_TypeNotEqualsNull_1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method normalizeClassTypeMethod = checkAccessControlsClazz.getDeclaredMethod("normalizeClassType", templateTypeType);
        normalizeClassTypeMethod.setAccessible(true);
        java.lang.Object[] normalizeClassTypeMethodArguments = new java.lang.Object[1];
        normalizeClassTypeMethodArguments[0] = templateType;
        TemplateType actual = ((TemplateType) normalizeClassTypeMethod.invoke(checkAccessControls, normalizeClassTypeMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType templateTypeReferencedType = ((JSType) getFieldValue(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(templateTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#normalizeClassType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 *  */
    @Test
    public void testNormalizeClassType_TypeNotEqualsNull_2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method normalizeClassTypeMethod = checkAccessControlsClazz.getDeclaredMethod("normalizeClassType", templateTypeType);
        normalizeClassTypeMethod.setAccessible(true);
        java.lang.Object[] normalizeClassTypeMethodArguments = new java.lang.Object[1];
        normalizeClassTypeMethodArguments[0] = templateType;
        TemplateType actual = ((TemplateType) normalizeClassTypeMethod.invoke(checkAccessControls, normalizeClassTypeMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType templateTypeReferencedType = ((JSType) getFieldValue(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(templateTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#normalizeClassType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 *  */
    @Test
    public void testNormalizeClassType_TypeNotEqualsNull_4() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Object proxyObjectType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType4 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        UnknownType referencedType5 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class proxyObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method normalizeClassTypeMethod = checkAccessControlsClazz.getDeclaredMethod("normalizeClassType", proxyObjectTypeType);
        normalizeClassTypeMethod.setAccessible(true);
        java.lang.Object[] normalizeClassTypeMethodArguments = new java.lang.Object[1];
        normalizeClassTypeMethodArguments[0] = proxyObjectType;
        Object actual = normalizeClassTypeMethod.invoke(checkAccessControls, normalizeClassTypeMethodArguments);
        
        JSType proxyObjectTypeReferencedType = ((JSType) getFieldValue(proxyObjectType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(proxyObjectTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method normalizeClassType(com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testNormalizeClassType1() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NumberType referencedType6 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method normalizeClassTypeMethod = checkAccessControlsClazz.getDeclaredMethod("normalizeClassType", templateTypeType);
        normalizeClassTypeMethod.setAccessible(true);
        java.lang.Object[] normalizeClassTypeMethodArguments = new java.lang.Object[1];
        normalizeClassTypeMethodArguments[0] = templateType;
        TemplateType actual = ((TemplateType) normalizeClassTypeMethod.invoke(checkAccessControls, normalizeClassTypeMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType templateTypeReferencedType = ((JSType) getFieldValue(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(templateTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testNormalizeClassType2() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Object namedType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType3 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NumberType referencedType6 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class namedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method normalizeClassTypeMethod = checkAccessControlsClazz.getDeclaredMethod("normalizeClassType", namedTypeType);
        normalizeClassTypeMethod.setAccessible(true);
        java.lang.Object[] normalizeClassTypeMethodArguments = new java.lang.Object[1];
        normalizeClassTypeMethodArguments[0] = namedType;
        Object actual = normalizeClassTypeMethod.invoke(checkAccessControls, normalizeClassTypeMethodArguments);
        
        String actualReference = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "reference"));
        assertNull(actualReference);
        
        String actualSourceName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "sourceName"));
        assertNull(actualSourceName);
        
        int namedTypeLineno = ((Integer) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "lineno"));
        int actualLineno = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "lineno"));
        assertEquals(namedTypeLineno, actualLineno);
        
        int namedTypeCharno = ((Integer) getFieldValue(namedType, "com.google.javascript.rhino.jstype.NamedType", "charno"));
        int actualCharno = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "charno"));
        assertEquals(namedTypeCharno, actualCharno);
        
        Predicate actualValidator = ((Predicate) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "validator"));
        assertNull(actualValidator);
        
        List actualPropertyContinuations = ((List) getFieldValue(actual, "com.google.javascript.rhino.jstype.NamedType", "propertyContinuations"));
        assertNull(actualPropertyContinuations);
        
        JSType namedTypeReferencedType = ((JSType) getFieldValue(namedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(namedTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    
    @Test
    public void testNormalizeClassType3() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType3 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType4 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType5 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType6 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType7 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType8 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType9 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType10 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType11 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType12 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType13 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType14 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType15 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType16 = createInstance("com.google.javascript.rhino.jstype.NamedType");
        TemplateType referencedType17 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType18 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NumberType referencedType19 = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(referencedType18, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType19);
        setField(referencedType17, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType18);
        setField(referencedType16, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType17);
        setField(referencedType15, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType16);
        setField(referencedType14, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType15);
        setField(referencedType13, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType14);
        setField(referencedType12, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType13);
        setField(referencedType11, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType12);
        setField(referencedType10, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType11);
        setField(referencedType9, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType10);
        setField(referencedType8, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType9);
        setField(referencedType7, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType8);
        setField(referencedType6, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType7);
        setField(referencedType5, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType6);
        setField(referencedType4, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType5);
        setField(referencedType3, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType4);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method normalizeClassTypeMethod = checkAccessControlsClazz.getDeclaredMethod("normalizeClassType", templateTypeType);
        normalizeClassTypeMethod.setAccessible(true);
        java.lang.Object[] normalizeClassTypeMethodArguments = new java.lang.Object[1];
        normalizeClassTypeMethodArguments[0] = templateType;
        TemplateType actual = ((TemplateType) normalizeClassTypeMethod.invoke(checkAccessControls, normalizeClassTypeMethodArguments));
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.TemplateType", "name"));
        assertNull(actualName);
        
        JSType templateTypeReferencedType = ((JSType) getFieldValue(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        JSType actualReferencedType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType"));
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(templateTypeReferencedType, actualReferencedType);
        
        ObjectType actualReferencedObjType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType"));
        assertNull(actualReferencedObjType);
        
        boolean actualVisited = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "visited"));
        assertFalse(actualVisited);
        
        JSDocInfo actualDocInfo = ((JSDocInfo) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "docInfo"));
        assertNull(actualDocInfo);
        
        boolean actualUnknown = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.ObjectType", "unknown"));
        assertFalse(actualUnknown);
        
        boolean actualResolved = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolved"));
        assertFalse(actualResolved);
        
        JSType actualResolveResult = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "resolveResult"));
        assertNull(actualResolveResult);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.checkConstructorDeprecation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 *  */
    @Test
    public void testCheckConstructorDeprecation_TypeEqualsNull() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(0);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstructorDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstructorDeprecation", nodeTraversalType, nodeType, nodeType);
        checkConstructorDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkConstructorDeprecationMethodArguments = new java.lang.Object[3];
        checkConstructorDeprecationMethodArguments[0] = ((Object) null);
        checkConstructorDeprecationMethodArguments[1] = node;
        checkConstructorDeprecationMethodArguments[2] = ((Object) null);
        checkConstructorDeprecationMethod.invoke(checkAccessControls, checkConstructorDeprecationMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = n.getJSType();
 *  */
    @Test
    public void testCheckConstructorDeprecation_ThrowNullPointerException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkConstructorDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkConstructorDeprecation(CheckAccessControls.java:236) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstructorDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstructorDeprecation", nodeTraversalType, nodeType, nodeType);
        checkConstructorDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkConstructorDeprecationMethodArguments = new java.lang.Object[3];
        checkConstructorDeprecationMethodArguments[0] = ((Object) null);
        checkConstructorDeprecationMethodArguments[1] = ((Object) null);
        checkConstructorDeprecationMethodArguments[2] = ((Object) null);
        try {
            checkConstructorDeprecationMethod.invoke(checkAccessControls, checkConstructorDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.executesCondition {@code (deprecationInfo != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: shouldEmitDeprecationWarning(t, n, parent)
 *  */
    @Test
    public void testCheckConstructorDeprecation_ThrowNullPointerException_1() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.IndexedType");
        FunctionType referencedType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 256);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkConstructorDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning(CheckAccessControls.java:533)
            com.google.javascript.jscomp.CheckAccessControls.checkConstructorDeprecation(CheckAccessControls.java:242) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstructorDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstructorDeprecation", nodeTraversalType, nodeType, nodeType);
        checkConstructorDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkConstructorDeprecationMethodArguments = new java.lang.Object[3];
        checkConstructorDeprecationMethodArguments[0] = ((Object) null);
        checkConstructorDeprecationMethodArguments[1] = node;
        checkConstructorDeprecationMethodArguments[2] = ((Object) null);
        try {
            checkConstructorDeprecationMethod.invoke(checkAccessControls, checkConstructorDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstructorDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.executesCondition {@code (deprecationInfo != null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: shouldEmitDeprecationWarning(t, n, parent)
 *  */
    @Test
    public void testCheckConstructorDeprecation_ThrowNullPointerException_2() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.IndexedType");
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String deprecated = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "deprecated", deprecated);
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 256);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkConstructorDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning(CheckAccessControls.java:533)
            com.google.javascript.jscomp.CheckAccessControls.checkConstructorDeprecation(CheckAccessControls.java:242) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstructorDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstructorDeprecation", nodeTraversalType, nodeType, nodeType);
        checkConstructorDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkConstructorDeprecationMethodArguments = new java.lang.Object[3];
        checkConstructorDeprecationMethodArguments[0] = ((Object) null);
        checkConstructorDeprecationMethodArguments[1] = node;
        checkConstructorDeprecationMethodArguments[2] = ((Object) null);
        try {
            checkConstructorDeprecationMethod.invoke(checkAccessControls, checkConstructorDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckPropertyDeprecation_ParentGetTypeEqualsTokenNEW() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyDeprecation", nodeTraversalType, nodeType, nodeType);
        checkPropertyDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkPropertyDeprecationMethodArguments = new java.lang.Object[3];
        checkPropertyDeprecationMethodArguments[0] = ((Object) null);
        checkPropertyDeprecationMethodArguments[1] = ((Object) null);
        checkPropertyDeprecationMethodArguments[2] = scriptOrFnNode;
        checkPropertyDeprecationMethod.invoke(checkAccessControls, checkPropertyDeprecationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): False}
 * @utbot.executesCondition {@code (objectType != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes com.google.javascript.jscomp.CheckAccessControls#dereference(com.google.javascript.rhino.jstype.JSType)
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 *  */
    @Test
    public void testCheckPropertyDeprecation_ObjectTypeEqualsNull() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyDeprecation", nodeTraversalType, nodeType, nodeType);
        checkPropertyDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkPropertyDeprecationMethodArguments = new java.lang.Object[3];
        checkPropertyDeprecationMethodArguments[0] = ((Object) null);
        checkPropertyDeprecationMethodArguments[1] = node;
        checkPropertyDeprecationMethodArguments[2] = functionNode;
        checkPropertyDeprecationMethod.invoke(checkAccessControls, checkPropertyDeprecationMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ObjectType.cast(dereference(n.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckPropertyDeprecation_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:479)
            com.google.javascript.jscomp.CheckAccessControls.dereference(CheckAccessControls.java:640)
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(CheckAccessControls.java:294) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyDeprecation", nodeTraversalType, nodeType, nodeType);
        checkPropertyDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkPropertyDeprecationMethodArguments = new java.lang.Object[3];
        checkPropertyDeprecationMethodArguments[0] = ((Object) null);
        checkPropertyDeprecationMethodArguments[1] = node;
        checkPropertyDeprecationMethodArguments[2] = functionNode;
        try {
            checkPropertyDeprecationMethod.invoke(checkAccessControls, checkPropertyDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType.cast(dereference(n.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckPropertyDeprecation_ThrowNullPointerException_1() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(CheckAccessControls.java:294) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyDeprecation", nodeTraversalType, nodeType, nodeType);
        checkPropertyDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkPropertyDeprecationMethodArguments = new java.lang.Object[3];
        checkPropertyDeprecationMethodArguments[0] = ((Object) null);
        checkPropertyDeprecationMethodArguments[1] = ((Object) null);
        checkPropertyDeprecationMethodArguments[2] = scriptOrFnNode;
        try {
            checkPropertyDeprecationMethod.invoke(checkAccessControls, checkPropertyDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent.getType() == Token.NEW
 *  */
    @Test
    public void testCheckPropertyDeprecation_ThrowNullPointerException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(CheckAccessControls.java:289) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyDeprecation", nodeTraversalType, nodeType, nodeType);
        checkPropertyDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkPropertyDeprecationMethodArguments = new java.lang.Object[3];
        checkPropertyDeprecationMethodArguments[0] = ((Object) null);
        checkPropertyDeprecationMethodArguments[1] = ((Object) null);
        checkPropertyDeprecationMethodArguments[2] = ((Object) null);
        try {
            checkPropertyDeprecationMethod.invoke(checkAccessControls, checkPropertyDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType.cast(dereference(n.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckPropertyDeprecation_ThrowNullPointerException_2() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(CheckAccessControls.java:294) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyDeprecation", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        checkPropertyDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkPropertyDeprecationMethodArguments = new java.lang.Object[3];
        checkPropertyDeprecationMethodArguments[0] = ((Object) null);
        checkPropertyDeprecationMethodArguments[1] = scriptOrFnNode;
        checkPropertyDeprecationMethodArguments[2] = scriptOrFnNode;
        try {
            checkPropertyDeprecationMethod.invoke(checkAccessControls, checkPropertyDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propertyName = n.getLastChild().getString();
 *  */
    @Test
    public void testCheckPropertyDeprecation_ThrowNullPointerException_3() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyDeprecation(CheckAccessControls.java:295) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyDeprecation", nodeTraversalType, nodeType, nodeType);
        checkPropertyDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkPropertyDeprecationMethodArguments = new java.lang.Object[3];
        checkPropertyDeprecationMethodArguments[0] = ((Object) null);
        checkPropertyDeprecationMethodArguments[1] = node;
        checkPropertyDeprecationMethodArguments[2] = functionNode;
        try {
            checkPropertyDeprecationMethod.invoke(checkAccessControls, checkPropertyDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propertyName = n.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckPropertyDeprecation_ThrowIllegalStateException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyDeprecation", nodeTraversalType, nodeType, nodeType);
        checkPropertyDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkPropertyDeprecationMethodArguments = new java.lang.Object[3];
        checkPropertyDeprecationMethodArguments[0] = ((Object) null);
        checkPropertyDeprecationMethodArguments[1] = node;
        checkPropertyDeprecationMethodArguments[2] = functionNode;
        try {
            checkPropertyDeprecationMethod.invoke(checkAccessControls, checkPropertyDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String propertyName = n.getLastChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckPropertyDeprecation_ThrowUnsupportedOperationException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyDeprecation", nodeTraversalType, nodeType, nodeType);
        checkPropertyDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkPropertyDeprecationMethodArguments = new java.lang.Object[3];
        checkPropertyDeprecationMethodArguments[0] = ((Object) null);
        checkPropertyDeprecationMethodArguments[1] = node;
        checkPropertyDeprecationMethodArguments[2] = functionNode;
        try {
            checkPropertyDeprecationMethod.invoke(checkAccessControls, checkPropertyDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkNameVisibility(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(name.getString());
 *  */
    @Test
    public void testCheckNameVisibility_ThrowNullPointerException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility(CheckAccessControls.java:324) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameVisibility", nodeTraversalType, nodeType, nodeType);
        checkNameVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkNameVisibilityMethodArguments = new java.lang.Object[3];
        checkNameVisibilityMethodArguments[0] = ((Object) null);
        checkNameVisibilityMethodArguments[1] = ((Object) null);
        checkNameVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkNameVisibilityMethod.invoke(checkAccessControls, checkNameVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(name.getString());
 *  */
    @Test
    public void testCheckNameVisibility_ThrowNullPointerException_1() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility(CheckAccessControls.java:324) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameVisibility", nodeTraversalType, nodeType, nodeType);
        checkNameVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkNameVisibilityMethodArguments = new java.lang.Object[3];
        checkNameVisibilityMethodArguments[0] = nodeTraversal;
        checkNameVisibilityMethodArguments[1] = ((Object) null);
        checkNameVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkNameVisibilityMethod.invoke(checkAccessControls, checkNameVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(name.getString());
 *  */
    @Test
    public void testCheckNameVisibility_ThrowNullPointerException_2() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility(CheckAccessControls.java:324) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameVisibility", nodeTraversalType, stringNodeType, stringNodeType);
        checkNameVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkNameVisibilityMethodArguments = new java.lang.Object[3];
        checkNameVisibilityMethodArguments[0] = nodeTraversal;
        checkNameVisibilityMethodArguments[1] = stringNode;
        checkNameVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkNameVisibilityMethod.invoke(checkAccessControls, checkNameVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(name.getString());
 *  */
    @Test
    public void testCheckNameVisibility_ThrowNullPointerException_3() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
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
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameVisibility(CheckAccessControls.java:324) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameVisibility", nodeTraversalType, nodeType, nodeType);
        checkNameVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkNameVisibilityMethodArguments = new java.lang.Object[3];
        checkNameVisibilityMethodArguments[0] = nodeTraversal;
        checkNameVisibilityMethodArguments[1] = ((Object) null);
        checkNameVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkNameVisibilityMethod.invoke(checkAccessControls, checkNameVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkNameVisibility(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Var var = t.getScope().getVar(name.getString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckNameVisibility_ThrowIllegalStateException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameVisibility", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        checkNameVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkNameVisibilityMethodArguments = new java.lang.Object[3];
        checkNameVisibilityMethodArguments[0] = nodeTraversal;
        checkNameVisibilityMethodArguments[1] = scriptOrFnNode;
        checkNameVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkNameVisibilityMethod.invoke(checkAccessControls, checkNameVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Var var = t.getScope().getVar(name.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckNameVisibility_ThrowUnsupportedOperationException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameVisibility", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        checkNameVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkNameVisibilityMethodArguments = new java.lang.Object[3];
        checkNameVisibilityMethodArguments[0] = nodeTraversal;
        checkNameVisibilityMethodArguments[1] = scriptOrFnNode;
        checkNameVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkNameVisibilityMethod.invoke(checkAccessControls, checkNameVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.isValidPrivateConstructorAccess
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isValidPrivateConstructorAccess(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#isValidPrivateConstructorAccess(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent.getType() != Token.NEW;}
 *  */
    @Test
    public void testIsValidPrivateConstructorAccess_ParentGetTypeEqualsTokenNEW() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isValidPrivateConstructorAccessMethod = checkAccessControlsClazz.getDeclaredMethod("isValidPrivateConstructorAccess", functionNodeType);
        isValidPrivateConstructorAccessMethod.setAccessible(true);
        java.lang.Object[] isValidPrivateConstructorAccessMethodArguments = new java.lang.Object[1];
        isValidPrivateConstructorAccessMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isValidPrivateConstructorAccessMethod.invoke(null, isValidPrivateConstructorAccessMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#isValidPrivateConstructorAccess(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent.getType() != Token.NEW;}
 *  */
    @Test
    public void testIsValidPrivateConstructorAccess_ParentGetTypeNotEqualsTokenNEW() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isValidPrivateConstructorAccessMethod = checkAccessControlsClazz.getDeclaredMethod("isValidPrivateConstructorAccess", functionNodeType);
        isValidPrivateConstructorAccessMethod.setAccessible(true);
        java.lang.Object[] isValidPrivateConstructorAccessMethodArguments = new java.lang.Object[1];
        isValidPrivateConstructorAccessMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isValidPrivateConstructorAccessMethod.invoke(null, isValidPrivateConstructorAccessMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isValidPrivateConstructorAccess(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#isValidPrivateConstructorAccess(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parent.getType() != Token.NEW;
 *  */
    @Test
    public void testIsValidPrivateConstructorAccess_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.isValidPrivateConstructorAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.isValidPrivateConstructorAccess(CheckAccessControls.java:517) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isValidPrivateConstructorAccessMethod = checkAccessControlsClazz.getDeclaredMethod("isValidPrivateConstructorAccess", nodeType);
        isValidPrivateConstructorAccessMethod.setAccessible(true);
        java.lang.Object[] isValidPrivateConstructorAccessMethodArguments = new java.lang.Object[1];
        isValidPrivateConstructorAccessMethodArguments[0] = ((Object) null);
        try {
            isValidPrivateConstructorAccessMethod.invoke(null, isValidPrivateConstructorAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (!((parent.getType() == Token.CALL && parent.getFirstChild() == n) || n.getType() == Token.NEW)): False}
 * @utbot.executesCondition {@code (n.getType() == Token.NEW): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testShouldEmitDeprecationWarning_NGetTypeNotEqualsTokenNEW() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldEmitDeprecationWarningMethod = checkAccessControlsClazz.getDeclaredMethod("shouldEmitDeprecationWarning", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        shouldEmitDeprecationWarningMethod.setAccessible(true);
        java.lang.Object[] shouldEmitDeprecationWarningMethodArguments = new java.lang.Object[3];
        shouldEmitDeprecationWarningMethodArguments[0] = nodeTraversal;
        shouldEmitDeprecationWarningMethodArguments[1] = scriptOrFnNode;
        shouldEmitDeprecationWarningMethodArguments[2] = scriptOrFnNode1;
        boolean actual = ((Boolean) shouldEmitDeprecationWarningMethod.invoke(checkAccessControls, shouldEmitDeprecationWarningMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.inGlobalScope()
 *  */
    @Test
    public void testShouldEmitDeprecationWarning_ThrowNullPointerException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning(CheckAccessControls.java:533) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldEmitDeprecationWarningMethod = checkAccessControlsClazz.getDeclaredMethod("shouldEmitDeprecationWarning", nodeTraversalType, nodeType, nodeType);
        shouldEmitDeprecationWarningMethod.setAccessible(true);
        java.lang.Object[] shouldEmitDeprecationWarningMethodArguments = new java.lang.Object[3];
        shouldEmitDeprecationWarningMethodArguments[0] = ((Object) null);
        shouldEmitDeprecationWarningMethodArguments[1] = ((Object) null);
        shouldEmitDeprecationWarningMethodArguments[2] = ((Object) null);
        try {
            shouldEmitDeprecationWarningMethod.invoke(checkAccessControls, shouldEmitDeprecationWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): False}
 * @utbot.executesCondition {@code (n.getType() == Token.GETPROP): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.GETPROP && n == parent.getFirstChild() && NodeUtil.isAssignmentOp(parent)
 *  */
    @Test
    public void testShouldEmitDeprecationWarning_ThrowNullPointerException_1() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning(CheckAccessControls.java:534) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldEmitDeprecationWarningMethod = checkAccessControlsClazz.getDeclaredMethod("shouldEmitDeprecationWarning", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        shouldEmitDeprecationWarningMethod.setAccessible(true);
        java.lang.Object[] shouldEmitDeprecationWarningMethodArguments = new java.lang.Object[3];
        shouldEmitDeprecationWarningMethodArguments[0] = nodeTraversal;
        shouldEmitDeprecationWarningMethodArguments[1] = scriptOrFnNode;
        shouldEmitDeprecationWarningMethodArguments[2] = ((Object) null);
        try {
            shouldEmitDeprecationWarningMethod.invoke(checkAccessControls, shouldEmitDeprecationWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (!((parent.getType() == Token.CALL && parent.getFirstChild() == n) || n.getType() == Token.NEW)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.getType() == Token.NEW
 *  */
    @Test
    public void testShouldEmitDeprecationWarning_ThrowNullPointerException_2() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning(CheckAccessControls.java:535) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldEmitDeprecationWarningMethod = checkAccessControlsClazz.getDeclaredMethod("shouldEmitDeprecationWarning", nodeTraversalType, nodeType, nodeType);
        shouldEmitDeprecationWarningMethod.setAccessible(true);
        java.lang.Object[] shouldEmitDeprecationWarningMethodArguments = new java.lang.Object[3];
        shouldEmitDeprecationWarningMethodArguments[0] = nodeTraversal;
        shouldEmitDeprecationWarningMethodArguments[1] = ((Object) null);
        shouldEmitDeprecationWarningMethodArguments[2] = scriptOrFnNode;
        try {
            shouldEmitDeprecationWarningMethod.invoke(checkAccessControls, shouldEmitDeprecationWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (!((parent.getType() == Token.CALL && parent.getFirstChild() == n) || n.getType() == Token.NEW)): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.getType() == Token.NEW
 *  */
    @Test
    public void testShouldEmitDeprecationWarning_ThrowNullPointerException_3() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning(CheckAccessControls.java:535) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldEmitDeprecationWarningMethod = checkAccessControlsClazz.getDeclaredMethod("shouldEmitDeprecationWarning", nodeTraversalType, nodeType, nodeType);
        shouldEmitDeprecationWarningMethod.setAccessible(true);
        java.lang.Object[] shouldEmitDeprecationWarningMethodArguments = new java.lang.Object[3];
        shouldEmitDeprecationWarningMethodArguments[0] = nodeTraversal;
        shouldEmitDeprecationWarningMethodArguments[1] = ((Object) null);
        shouldEmitDeprecationWarningMethodArguments[2] = node;
        try {
            shouldEmitDeprecationWarningMethod.invoke(checkAccessControls, shouldEmitDeprecationWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#shouldEmitDeprecationWarning(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (!((parent.getType() == Token.CALL && parent.getFirstChild() == n) || n.getType() == Token.NEW)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.GETPROP && n == parent.getFirstChild() && NodeUtil.isAssignmentOp(parent)
 *  */
    @Test
    public void testShouldEmitDeprecationWarning_ThrowNullPointerException_4() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.shouldEmitDeprecationWarning(CheckAccessControls.java:541) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldEmitDeprecationWarningMethod = checkAccessControlsClazz.getDeclaredMethod("shouldEmitDeprecationWarning", nodeTraversalType, nodeType, nodeType);
        shouldEmitDeprecationWarningMethod.setAccessible(true);
        java.lang.Object[] shouldEmitDeprecationWarningMethodArguments = new java.lang.Object[3];
        shouldEmitDeprecationWarningMethodArguments[0] = nodeTraversal;
        shouldEmitDeprecationWarningMethodArguments[1] = ((Object) null);
        shouldEmitDeprecationWarningMethodArguments[2] = scriptOrFnNode;
        try {
            shouldEmitDeprecationWarningMethod.invoke(checkAccessControls, shouldEmitDeprecationWarningMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.canAccessDeprecatedTypes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method canAccessDeprecatedTypes(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#canAccessDeprecatedTypes(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node scopeRoot = t.getScopeRoot();
 *  */
    @Test
    public void testCanAccessDeprecatedTypes_ThrowNullPointerException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.canAccessDeprecatedTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.canAccessDeprecatedTypes(CheckAccessControls.java:560) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method canAccessDeprecatedTypesMethod = checkAccessControlsClazz.getDeclaredMethod("canAccessDeprecatedTypes", nodeTraversalType);
        canAccessDeprecatedTypesMethod.setAccessible(true);
        java.lang.Object[] canAccessDeprecatedTypesMethodArguments = new java.lang.Object[1];
        canAccessDeprecatedTypesMethodArguments[0] = ((Object) null);
        try {
            canAccessDeprecatedTypesMethod.invoke(checkAccessControls, canAccessDeprecatedTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#canAccessDeprecatedTypes(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node scopeRootParent = scopeRoot.getParent();
 *  */
    @Test
    public void testCanAccessDeprecatedTypes_ThrowNullPointerException_1() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.canAccessDeprecatedTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:585)
            com.google.javascript.jscomp.CheckAccessControls.canAccessDeprecatedTypes(CheckAccessControls.java:560) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method canAccessDeprecatedTypesMethod = checkAccessControlsClazz.getDeclaredMethod("canAccessDeprecatedTypes", nodeTraversalType);
        canAccessDeprecatedTypesMethod.setAccessible(true);
        java.lang.Object[] canAccessDeprecatedTypesMethodArguments = new java.lang.Object[1];
        canAccessDeprecatedTypesMethodArguments[0] = nodeTraversal;
        try {
            canAccessDeprecatedTypesMethod.invoke(checkAccessControls, canAccessDeprecatedTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#canAccessDeprecatedTypes(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node scopeRootParent = scopeRoot.getParent();
 *  */
    @Test
    public void testCanAccessDeprecatedTypes_ThrowNullPointerException_2() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
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
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.canAccessDeprecatedTypes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.canAccessDeprecatedTypes(CheckAccessControls.java:561) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Method canAccessDeprecatedTypesMethod = checkAccessControlsClazz.getDeclaredMethod("canAccessDeprecatedTypes", nodeTraversalType);
        canAccessDeprecatedTypesMethod.setAccessible(true);
        java.lang.Object[] canAccessDeprecatedTypesMethodArguments = new java.lang.Object[1];
        canAccessDeprecatedTypesMethodArguments[0] = nodeTraversal;
        try {
            canAccessDeprecatedTypesMethod.invoke(checkAccessControls, canAccessDeprecatedTypesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkConstantProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() != Token.INC): True}
 * @utbot.executesCondition {@code ((parent.getType() != Token.INC)): True}
 * @utbot.executesCondition {@code ((parent.getType() != Token.INC)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckConstantProperty_ParentGetTypeNotEqualsTokenINC() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(86);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, nodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = node;
        checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() != Token.INC): False}
 * @utbot.executesCondition {@code (objectType != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes com.google.javascript.jscomp.CheckAccessControls#dereference(com.google.javascript.rhino.jstype.JSType)
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 *  */
    @Test
    public void testCheckConstantProperty_ObjectTypeEqualsNull() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(91);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, nodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = node;
        checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkConstantProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!(NodeUtil.isAssignmentOp(parent) && parent.getFirstChild() == getprop)): True}
 * @utbot.executesCondition {@code (parent.getType() != Token.INC): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ObjectType.cast(dereference(getprop.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckConstantProperty_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(92);
        setField(parent, "com.google.javascript.rhino.Node", "first", functionNode);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:479)
            com.google.javascript.jscomp.CheckAccessControls.dereference(CheckAccessControls.java:640)
            com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty(CheckAccessControls.java:360) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, functionNodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = functionNode;
        try {
            checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = getprop.getParent();
 *  */
    @Test
    public void testCheckConstantProperty_ThrowNullPointerException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty(CheckAccessControls.java:353) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, nodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = ((Object) null);
        try {
            checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!(NodeUtil.isAssignmentOp(parent) && parent.getFirstChild() == getprop)): True}
 * @utbot.executesCondition {@code (parent.getType() != Token.INC): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType.cast(dereference(getprop.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckConstantProperty_ThrowNullPointerException_1() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(91);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty(CheckAccessControls.java:360) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, nodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = node;
        try {
            checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!(NodeUtil.isAssignmentOp(parent) && parent.getFirstChild() == getprop)): False}
 * @utbot.executesCondition {@code ((parent.getType() != Token.INC)): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType.cast(dereference(getprop.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckConstantProperty_ThrowNullPointerException_3() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(102);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty(CheckAccessControls.java:360) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, nodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = node;
        try {
            checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!(NodeUtil.isAssignmentOp(parent) && parent.getFirstChild() == getprop)): False}
 * @utbot.executesCondition {@code ((parent.getType() != Token.INC)): True}
 * @utbot.executesCondition {@code ((parent.getType() != Token.INC)): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType.cast(dereference(getprop.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckConstantProperty_ThrowNullPointerException_4() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(103);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty(CheckAccessControls.java:360) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, nodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = node;
        try {
            checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!(NodeUtil.isAssignmentOp(parent) && parent.getFirstChild() == getprop)): True}
 * @utbot.executesCondition {@code (parent.getType() != Token.INC): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propertyName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testCheckConstantProperty_ThrowNullPointerException_2() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(91);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkConstantProperty(CheckAccessControls.java:361) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, nodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = node;
        try {
            checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkConstantProperty(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String propertyName = getprop.getLastChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckConstantProperty_ThrowUnsupportedOperationException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(91);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, nodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = node;
        try {
            checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkConstantProperty(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propertyName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckConstantProperty_ThrowIllegalStateException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(91);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkConstantPropertyMethod = checkAccessControlsClazz.getDeclaredMethod("checkConstantProperty", nodeTraversalType, nodeType);
        checkConstantPropertyMethod.setAccessible(true);
        java.lang.Object[] checkConstantPropertyMethodArguments = new java.lang.Object[2];
        checkConstantPropertyMethodArguments[0] = ((Object) null);
        checkConstantPropertyMethodArguments[1] = node;
        try {
            checkConstantPropertyMethod.invoke(checkAccessControls, checkConstantPropertyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.isDeprecatedFunction
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isDeprecatedFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#isDeprecatedFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDeprecatedFunction_NGetTypeNotEqualsTokenFUNCTION() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDeprecatedFunctionMethod = checkAccessControlsClazz.getDeclaredMethod("isDeprecatedFunction", scriptOrFnNodeType, scriptOrFnNodeType);
        isDeprecatedFunctionMethod.setAccessible(true);
        java.lang.Object[] isDeprecatedFunctionMethodArguments = new java.lang.Object[2];
        isDeprecatedFunctionMethodArguments[0] = scriptOrFnNode;
        isDeprecatedFunctionMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isDeprecatedFunctionMethod.invoke(null, isDeprecatedFunctionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#isDeprecatedFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (type != null): False}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsDeprecatedFunction_TypeEqualsNull() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDeprecatedFunctionMethod = checkAccessControlsClazz.getDeclaredMethod("isDeprecatedFunction", scriptOrFnNodeType, scriptOrFnNodeType);
        isDeprecatedFunctionMethod.setAccessible(true);
        java.lang.Object[] isDeprecatedFunctionMethodArguments = new java.lang.Object[2];
        isDeprecatedFunctionMethodArguments[0] = scriptOrFnNode;
        isDeprecatedFunctionMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isDeprecatedFunctionMethod.invoke(null, isDeprecatedFunctionMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#isDeprecatedFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return getTypeDeprecationInfo(type) != null;}
 *  */
    @Test
    public void testIsDeprecatedFunction_GetTypeDeprecationInfoNotEqualsNull() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 256);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDeprecatedFunctionMethod = checkAccessControlsClazz.getDeclaredMethod("isDeprecatedFunction", functionNodeType, functionNodeType);
        isDeprecatedFunctionMethod.setAccessible(true);
        java.lang.Object[] isDeprecatedFunctionMethodArguments = new java.lang.Object[2];
        isDeprecatedFunctionMethodArguments[0] = functionNode;
        isDeprecatedFunctionMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isDeprecatedFunctionMethod.invoke(null, isDeprecatedFunctionMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#isDeprecatedFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.executesCondition {@code (type != null): True}
 * @utbot.returnsFrom {@code return getTypeDeprecationInfo(type) != null;}
 *  */
    @Test
    public void testIsDeprecatedFunction_GetTypeDeprecationInfoNotEqualsNull_1() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ProxyObjectType");
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType1 = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String deprecated = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "deprecated", deprecated);
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 256);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(functionNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDeprecatedFunctionMethod = checkAccessControlsClazz.getDeclaredMethod("isDeprecatedFunction", functionNodeType, functionNodeType);
        isDeprecatedFunctionMethod.setAccessible(true);
        java.lang.Object[] isDeprecatedFunctionMethodArguments = new java.lang.Object[2];
        isDeprecatedFunctionMethodArguments[0] = functionNode;
        isDeprecatedFunctionMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) isDeprecatedFunctionMethod.invoke(null, isDeprecatedFunctionMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isDeprecatedFunction(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#isDeprecatedFunction(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.FUNCTION
 *  */
    @Test
    public void testIsDeprecatedFunction_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.isDeprecatedFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.isDeprecatedFunction(CheckAccessControls.java:577) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isDeprecatedFunctionMethod = checkAccessControlsClazz.getDeclaredMethod("isDeprecatedFunction", nodeType, nodeType);
        isDeprecatedFunctionMethod.setAccessible(true);
        java.lang.Object[] isDeprecatedFunctionMethodArguments = new java.lang.Object[2];
        isDeprecatedFunctionMethodArguments[0] = ((Object) null);
        isDeprecatedFunctionMethodArguments[1] = ((Object) null);
        try {
            isDeprecatedFunctionMethod.invoke(null, isDeprecatedFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.getTypeDeprecationInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypeDeprecationInfo(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getTypeDeprecationInfo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): True}
 *  */
    @Test
    public void testGetTypeDeprecationInfo_TypeEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getTypeDeprecationInfoMethod = checkAccessControlsClazz.getDeclaredMethod("getTypeDeprecationInfo", jSTypeType);
        getTypeDeprecationInfoMethod.setAccessible(true);
        java.lang.Object[] getTypeDeprecationInfoMethodArguments = new java.lang.Object[1];
        getTypeDeprecationInfoMethodArguments[0] = ((Object) null);
        String actual = ((String) getTypeDeprecationInfoMethod.invoke(null, getTypeDeprecationInfoMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getTypeDeprecationInfo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.isDeprecated()): True}
 * @utbot.executesCondition {@code (info.getDeprecationReason() != null): False}
 * @utbot.returnsFrom {@code return "";}
 *  */
    @Test
    public void testGetTypeDeprecationInfo_InfoGetDeprecationReasonEqualsNull() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.IndexedType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        FunctionType referencedType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 256);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getTypeDeprecationInfoMethod = checkAccessControlsClazz.getDeclaredMethod("getTypeDeprecationInfo", templateTypeType);
        getTypeDeprecationInfoMethod.setAccessible(true);
        java.lang.Object[] getTypeDeprecationInfoMethodArguments = new java.lang.Object[1];
        getTypeDeprecationInfoMethodArguments[0] = templateType;
        String actual = ((String) getTypeDeprecationInfoMethod.invoke(null, getTypeDeprecationInfoMethodArguments));
        
        String expected = "";
        
        assertEquals(expected, actual);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getTypeDeprecationInfo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.isDeprecated()): True}
 * @utbot.executesCondition {@code (info.getDeprecationReason() != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getDeprecationReason()}
 * @utbot.returnsFrom {@code return info.getDeprecationReason();}
 *  */
    @Test
    public void testGetTypeDeprecationInfo_InfoGetDeprecationReasonNotEqualsNull() throws Exception  {
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        Object referencedType = createInstance("com.google.javascript.rhino.jstype.IndexedType");
        Object referencedType1 = createInstance("com.google.javascript.rhino.jstype.ParameterizedType");
        FunctionType referencedType2 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        JSDocInfo docInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        Object info = createInstance("com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo");
        String deprecated = "";
        setField(info, "com.google.javascript.rhino.JSDocInfo$LazilyInitializedInfo", "deprecated", deprecated);
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "info", info);
        setField(docInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 256);
        setField(referencedType2, "com.google.javascript.rhino.jstype.ObjectType", "docInfo", docInfo);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method getTypeDeprecationInfoMethod = checkAccessControlsClazz.getDeclaredMethod("getTypeDeprecationInfo", templateTypeType);
        getTypeDeprecationInfoMethod.setAccessible(true);
        java.lang.Object[] getTypeDeprecationInfoMethodArguments = new java.lang.Object[1];
        getTypeDeprecationInfoMethodArguments[0] = templateType;
        String actual = ((String) getTypeDeprecationInfoMethod.invoke(null, getTypeDeprecationInfoMethodArguments));
        
        assertEquals(deprecated, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckNameDeprecation_ParentGetTypeEqualsTokenFUNCTION() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameDeprecation", nodeTraversalType, nodeType, nodeType);
        checkNameDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkNameDeprecationMethodArguments = new java.lang.Object[3];
        checkNameDeprecationMethodArguments[0] = ((Object) null);
        checkNameDeprecationMethodArguments[1] = ((Object) null);
        checkNameDeprecationMethodArguments[2] = scriptOrFnNode;
        checkNameDeprecationMethod.invoke(checkAccessControls, checkNameDeprecationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckNameDeprecation_ParentGetTypeEqualsTokenVAR() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameDeprecation", nodeTraversalType, nodeType, nodeType);
        checkNameDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkNameDeprecationMethodArguments = new java.lang.Object[3];
        checkNameDeprecationMethodArguments[0] = ((Object) null);
        checkNameDeprecationMethodArguments[1] = ((Object) null);
        checkNameDeprecationMethodArguments[2] = scriptOrFnNode;
        checkNameDeprecationMethod.invoke(checkAccessControls, checkNameDeprecationMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckNameDeprecation_ParentGetTypeEqualsTokenNEW() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameDeprecation", nodeTraversalType, nodeType, nodeType);
        checkNameDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkNameDeprecationMethodArguments = new java.lang.Object[3];
        checkNameDeprecationMethodArguments[0] = ((Object) null);
        checkNameDeprecationMethodArguments[1] = ((Object) null);
        checkNameDeprecationMethodArguments[2] = scriptOrFnNode;
        checkNameDeprecationMethod.invoke(checkAccessControls, checkNameDeprecationMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope.Var var = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testCheckNameDeprecation_ThrowNullPointerException_1() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation(CheckAccessControls.java:266) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameDeprecation", nodeTraversalType, nodeType, nodeType);
        checkNameDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkNameDeprecationMethodArguments = new java.lang.Object[3];
        checkNameDeprecationMethodArguments[0] = ((Object) null);
        checkNameDeprecationMethodArguments[1] = ((Object) null);
        checkNameDeprecationMethodArguments[2] = scriptOrFnNode;
        try {
            checkNameDeprecationMethod.invoke(checkAccessControls, checkNameDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent.getType() == Token.FUNCTION || parent.getType() == Token.VAR || parent.getType() == Token.NEW
 *  */
    @Test
    public void testCheckNameDeprecation_ThrowNullPointerException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation(CheckAccessControls.java:261) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameDeprecation", nodeTraversalType, nodeType, nodeType);
        checkNameDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkNameDeprecationMethodArguments = new java.lang.Object[3];
        checkNameDeprecationMethodArguments[0] = ((Object) null);
        checkNameDeprecationMethodArguments[1] = ((Object) null);
        checkNameDeprecationMethodArguments[2] = ((Object) null);
        try {
            checkNameDeprecationMethod.invoke(checkAccessControls, checkNameDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope.Var var = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testCheckNameDeprecation_ThrowNullPointerException_2() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation(CheckAccessControls.java:266) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameDeprecation", nodeTraversalType, stringNodeType, stringNodeType);
        checkNameDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkNameDeprecationMethodArguments = new java.lang.Object[3];
        checkNameDeprecationMethodArguments[0] = nodeTraversal;
        checkNameDeprecationMethodArguments[1] = stringNode;
        checkNameDeprecationMethodArguments[2] = node;
        try {
            checkNameDeprecationMethod.invoke(checkAccessControls, checkNameDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.NEW): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope.Var var = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testCheckNameDeprecation_ThrowNullPointerException_3() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
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
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkNameDeprecation(CheckAccessControls.java:266) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameDeprecation", nodeTraversalType, nodeType, nodeType);
        checkNameDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkNameDeprecationMethodArguments = new java.lang.Object[3];
        checkNameDeprecationMethodArguments[0] = nodeTraversal;
        checkNameDeprecationMethodArguments[1] = ((Object) null);
        checkNameDeprecationMethodArguments[2] = scriptOrFnNode;
        try {
            checkNameDeprecationMethod.invoke(checkAccessControls, checkNameDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Scope.Var var = t.getScope().getVar(n.getString());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckNameDeprecation_ThrowIllegalStateException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = new Node(40);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameDeprecation", nodeTraversalType, nodeType, nodeType);
        checkNameDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkNameDeprecationMethodArguments = new java.lang.Object[3];
        checkNameDeprecationMethodArguments[0] = nodeTraversal;
        checkNameDeprecationMethodArguments[1] = node;
        checkNameDeprecationMethodArguments[2] = scriptOrFnNode;
        try {
            checkNameDeprecationMethod.invoke(checkAccessControls, checkNameDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkNameDeprecation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: Scope.Var var = t.getScope().getVar(n.getString());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckNameDeprecation_ThrowUnsupportedOperationException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = new Node(0);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkNameDeprecationMethod = checkAccessControlsClazz.getDeclaredMethod("checkNameDeprecation", nodeTraversalType, nodeType, nodeType);
        checkNameDeprecationMethod.setAccessible(true);
        java.lang.Object[] checkNameDeprecationMethodArguments = new java.lang.Object[3];
        checkNameDeprecationMethodArguments[0] = nodeTraversal;
        checkNameDeprecationMethodArguments[1] = node;
        checkNameDeprecationMethodArguments[2] = scriptOrFnNode;
        try {
            checkNameDeprecationMethod.invoke(checkAccessControls, checkNameDeprecationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes com.google.javascript.jscomp.CheckAccessControls#dereference(com.google.javascript.rhino.jstype.JSType)
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 *  */
    @Test
    public void testCheckPropertyVisibility_NodeGetString() throws Exception  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyVisibility", nodeTraversalType, nodeType, nodeType);
        checkPropertyVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkPropertyVisibilityMethodArguments = new java.lang.Object[3];
        checkPropertyVisibilityMethodArguments[0] = ((Object) null);
        checkPropertyVisibilityMethodArguments[1] = node;
        checkPropertyVisibilityMethodArguments[2] = ((Object) null);
        checkPropertyVisibilityMethod.invoke(checkAccessControls, checkPropertyVisibilityMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ObjectType.cast(dereference(getprop.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckPropertyVisibility_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:818)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:479)
            com.google.javascript.jscomp.CheckAccessControls.dereference(CheckAccessControls.java:640)
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility(CheckAccessControls.java:410) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyVisibility", nodeTraversalType, functionNodeType, functionNodeType);
        checkPropertyVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkPropertyVisibilityMethodArguments = new java.lang.Object[3];
        checkPropertyVisibilityMethodArguments[0] = ((Object) null);
        checkPropertyVisibilityMethodArguments[1] = functionNode;
        checkPropertyVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkPropertyVisibilityMethod.invoke(checkAccessControls, checkPropertyVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType.cast(dereference(getprop.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckPropertyVisibility_ThrowNullPointerException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility(CheckAccessControls.java:410) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyVisibility", nodeTraversalType, nodeType, nodeType);
        checkPropertyVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkPropertyVisibilityMethodArguments = new java.lang.Object[3];
        checkPropertyVisibilityMethodArguments[0] = ((Object) null);
        checkPropertyVisibilityMethodArguments[1] = ((Object) null);
        checkPropertyVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkPropertyVisibilityMethod.invoke(checkAccessControls, checkPropertyVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType.cast(dereference(getprop.getFirstChild().getJSType()))
 *  */
    @Test
    public void testCheckPropertyVisibility_ThrowNullPointerException_1() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility(CheckAccessControls.java:410) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyVisibility", nodeTraversalType, nodeType, nodeType);
        checkPropertyVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkPropertyVisibilityMethodArguments = new java.lang.Object[3];
        checkPropertyVisibilityMethodArguments[0] = ((Object) null);
        checkPropertyVisibilityMethodArguments[1] = node;
        checkPropertyVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkPropertyVisibilityMethod.invoke(checkAccessControls, checkPropertyVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propertyName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testCheckPropertyVisibility_ThrowNullPointerException_2() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.checkPropertyVisibility(CheckAccessControls.java:411) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyVisibility", nodeTraversalType, nodeType, nodeType);
        checkPropertyVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkPropertyVisibilityMethodArguments = new java.lang.Object[3];
        checkPropertyVisibilityMethodArguments[0] = ((Object) null);
        checkPropertyVisibilityMethodArguments[1] = node;
        checkPropertyVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkPropertyVisibilityMethod.invoke(checkAccessControls, checkPropertyVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propertyName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckPropertyVisibility_ThrowIllegalStateException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyVisibility", nodeTraversalType, nodeType, nodeType);
        checkPropertyVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkPropertyVisibilityMethodArguments = new java.lang.Object[3];
        checkPropertyVisibilityMethodArguments[0] = ((Object) null);
        checkPropertyVisibilityMethodArguments[1] = node;
        checkPropertyVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkPropertyVisibilityMethod.invoke(checkAccessControls, checkPropertyVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#checkPropertyVisibility(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String propertyName = getprop.getLastChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckPropertyVisibility_ThrowUnsupportedOperationException() throws Throwable  {
        CheckAccessControls checkAccessControls = ((CheckAccessControls) createInstance("com.google.javascript.jscomp.CheckAccessControls"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyVisibilityMethod = checkAccessControlsClazz.getDeclaredMethod("checkPropertyVisibility", nodeTraversalType, nodeType, nodeType);
        checkPropertyVisibilityMethod.setAccessible(true);
        java.lang.Object[] checkPropertyVisibilityMethodArguments = new java.lang.Object[3];
        checkPropertyVisibilityMethodArguments[0] = ((Object) null);
        checkPropertyVisibilityMethodArguments[1] = node;
        checkPropertyVisibilityMethodArguments[2] = ((Object) null);
        try {
            checkPropertyVisibilityMethod.invoke(checkAccessControls, checkPropertyVisibilityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.CheckAccessControls.getPropertyDeprecationInfo
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getPropertyDeprecationInfo(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getPropertyDeprecationInfo(com.google.javascript.rhino.jstype.ObjectType,java.lang.String)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (implicitProto != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getImplicitPrototype()}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetPropertyDeprecationInfo_ImplicitProtoEqualsNull() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        LinkedHashMap properties = new LinkedHashMap();
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class stringType = Class.forName("java.lang.String");
        Method getPropertyDeprecationInfoMethod = checkAccessControlsClazz.getDeclaredMethod("getPropertyDeprecationInfo", anonymousFunctionTypeType, stringType);
        getPropertyDeprecationInfoMethod.setAccessible(true);
        java.lang.Object[] getPropertyDeprecationInfoMethodArguments = new java.lang.Object[2];
        getPropertyDeprecationInfoMethodArguments[0] = anonymousFunctionType;
        getPropertyDeprecationInfoMethodArguments[1] = ((Object) null);
        String actual = ((String) getPropertyDeprecationInfoMethod.invoke(null, getPropertyDeprecationInfoMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyDeprecationInfo(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link CheckAccessControls}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.CheckAccessControls#getPropertyDeprecationInfo(com.google.javascript.rhino.jstype.ObjectType,java.lang.String)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getOwnPropertyJSDocInfo(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo info = type.getOwnPropertyJSDocInfo(prop);
 *  */
    @Test
    public void testGetPropertyDeprecationInfo_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.CheckAccessControls.getPropertyDeprecationInfo] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CheckAccessControls.getPropertyDeprecationInfo(CheckAccessControls.java:621) */
        Class checkAccessControlsClazz = Class.forName("com.google.javascript.jscomp.CheckAccessControls");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class stringType = Class.forName("java.lang.String");
        Method getPropertyDeprecationInfoMethod = checkAccessControlsClazz.getDeclaredMethod("getPropertyDeprecationInfo", objectTypeType, stringType);
        getPropertyDeprecationInfoMethod.setAccessible(true);
        java.lang.Object[] getPropertyDeprecationInfoMethodArguments = new java.lang.Object[2];
        getPropertyDeprecationInfoMethodArguments[0] = ((Object) null);
        getPropertyDeprecationInfoMethodArguments[1] = ((Object) null);
        try {
            getPropertyDeprecationInfoMethod.invoke(null, getPropertyDeprecationInfoMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields896092412236900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields896092412236900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass896092412242900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields896092412236900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass896092412242900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields896092412610200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields896092412610200.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass896092412611800 = (java.lang.reflect.Field[]) methodForGetDeclaredFields896092412610200.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass896092412611800).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
        
        return field.get(obj);
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

