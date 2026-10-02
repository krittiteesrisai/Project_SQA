package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.LinkedList;
import java.util.ArrayDeque;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import java.util.ArrayList;
import java.util.Set;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.Map;
import java.util.List;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public final class com_google_javascript_jscomp_ProcessClosurePrimitivesTest {
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_SwitchNGetTypeCasedefault() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        processClosurePrimitives.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        
        processClosurePrimitives.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_4() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        
        processClosurePrimitives.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        processClosurePrimitives.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_2() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node node1 = new Node(37);
        
        processClosurePrimitives.visit(null, node, node1);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_3() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node node1 = new Node(86);
        
        processClosurePrimitives.visit(null, node, node1);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_5() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        
        processClosurePrimitives.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_6() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "rewriteNewDateGoogNow", true);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        processClosurePrimitives.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testVisit_StringEquals() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        processClosurePrimitives.visit(null, functionNode, functionNode1);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testVisit_StringEquals_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        
        processClosurePrimitives.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_SwitchNGetTypeCasedefault_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, functionNode1);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_8() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, functionNode1);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_9() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        
        processClosurePrimitives.visit(nodeTraversal, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testVisit_NodeUtilIsFunctionExpression() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(-255);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit_7() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean isExpr = parent.getType() == Token.EXPR_RESULT;
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:148) */
        processClosurePrimitives.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.inGlobalScope() && !NodeUtil.isFunctionExpression(n)
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:206) */
        processClosurePrimitives.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:146) */
        processClosurePrimitives.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getType() != Token.CALL
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_4() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:222) */
        processClosurePrimitives.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleCandidateProvideDefinition(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_5() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:302)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:201) */
        processClosurePrimitives.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.getType() == Token.GETPROP
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_6() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(37);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:150) */
        processClosurePrimitives.visit(null, functionNode, functionNode1);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getFirstChild().getType() == Token.NAME && parent.getType() != Token.CALL && parent.getType() != Token.ASSIGN && "goog.base".equals(n.getQualifiedName())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_3() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:221) */
        processClosurePrimitives.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: name.getType() == Token.NAME && GOOG.equals(name.getString())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_7() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:152) */
        processClosurePrimitives.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleCandidateProvideDefinition(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_8() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:307)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:201) */
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleCandidateProvideDefinition(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_9() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:308)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:201) */
        processClosurePrimitives.visit(nodeTraversal, functionNode, functionNode1);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: handleCandidateProvideDefinition(t, n, parent);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_10() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:315)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:201) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = functionNode;
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
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ProvidedName pn = providedNames.get(name);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_11() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(126);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:209) */
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: "goog.base".equals(n.getQualifiedName())
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException_2() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        processClosurePrimitives.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: trySimplifyNewDate(t, n, parent);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "rewriteNewDateGoogNow", true);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        processClosurePrimitives.visit(null, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: GOOG.equals(name.getString())
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        
        processClosurePrimitives.visit(null, node, functionNode);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} 
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisit_ThrowIllegalStateException() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: handleCandidateProvideDefinition(t, n, parent);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException_4() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        FunctionNode functionNode1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode1.setType(118);
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, functionNode1);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isFunctionExpression(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String name = n.getFirstChild().getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit_ThrowUnsupportedOperationException_3() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "rewriteNewDateGoogNow", true);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "Dat\u0000";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testVisit2() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = numberNode1;
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    
    @Test
    public void testVisit3() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(stringNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = stringNode1;
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    
    @Test
    public void testVisit4() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(130);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, numberNodeType, numberNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = numberNode;
        visitMethodArguments[2] = numberNode1;
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    
    @Test
    public void testVisit5() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
    }
    
    @Test
    public void testVisit6() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(126);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        processClosurePrimitives.visit(nodeTraversal, scriptOrFnNode, null);
    }
    
    @Test
    public void testVisit7() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisit8() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1734)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:224) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, functionNodeType, functionNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = ((Object) null);
        visitMethodArguments[1] = functionNode;
        visitMethodArguments[2] = numberNode;
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit9() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:304)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:201) */
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    
    @Test
    public void testVisit10() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 1);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:470)
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:313)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:201) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, stringNodeType, stringNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = stringNode;
        visitMethodArguments[2] = node;
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit11() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(33);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1730)
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:308)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:201) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, functionNodeType, functionNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = functionNode;
        visitMethodArguments[2] = numberNode;
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit12() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        first.setType(42);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(130);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", 8388608);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:475)
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:313)
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:201) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, functionNodeType, functionNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = functionNode;
        visitMethodArguments[2] = stringNode;
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisit13() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(126);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.visit(ProcessClosurePrimitives.java:208) */
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit14() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(130);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, functionNodeType, functionNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = functionNode;
        visitMethodArguments[2] = numberNode;
        try {
            visitMethod.invoke(processClosurePrimitives, visitMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit15() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(126);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", first);
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testVisit16() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(132);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", first);
        
        processClosurePrimitives.visit(nodeTraversal, functionNode, null);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testVisit17() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(86);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(42);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(130);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitMethod = processClosurePrimitivesClazz.getDeclaredMethod("visit", nodeTraversalType, functionNodeType, functionNodeType);
        visitMethod.setAccessible(true);
        java.lang.Object[] visitMethodArguments = new java.lang.Object[3];
        visitMethodArguments[0] = nodeTraversal;
        visitMethodArguments[1] = functionNode;
        visitMethodArguments[2] = numberNode;
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
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:121) */
        processClosurePrimitives.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: new NodeTraversal(compiler, this).traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:121) */
        processClosurePrimitives.process(null, functionNode);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testProcess1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processClosurePrimitivesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = scriptOrFnNode;
        try {
            processMethod.invoke(processClosurePrimitives, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess2() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:121) */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:121) */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    
    @Test
    public void testProcess4() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:123) */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    
    @Test
    public void testProcess5() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(86);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:123) */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    
    @Test
    public void testProcess6() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:123) */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    
    @Test
    public void testProcess7() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "rewriteNewDateGoogNow", true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(30);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:121) */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    
    @Test
    public void testProcess8() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:121) */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    
    @Test
    public void testProcess9() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(37);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:121) */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    
    @Test
    public void testProcess10() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(105);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object first1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:121) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = processClosurePrimitivesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = numberNode1;
        try {
            processMethod.invoke(processClosurePrimitives, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess11() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(132);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        String objectValue = "";
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.process(ProcessClosurePrimitives.java:123) */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testProcess12() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        processClosurePrimitives.process(null, scriptOrFnNode);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testProcess13() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Node node = new Node(0);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        processClosurePrimitives.process(node, scriptOrFnNode);
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess14() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 16);
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "objectValue", objectValue);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        processClosurePrimitives.process(null, scriptOrFnNode);
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:277) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node arg = left.getNext();
 *  */
    @Test
    public void testProcessProvideCall_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:278) */
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyProvide(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} when: verifyProvide(t, left, arg)
 *  */
    @Test
    public void testProcessProvideCall_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:583)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:279) */
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
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
    
    ///region OTHER: ERROR SUITE for method processProvideCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcessProvideCall1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:579)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:279) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, functionNodeType, functionNodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = nodeTraversal;
        processProvideCallMethodArguments[1] = functionNode;
        processProvideCallMethodArguments[2] = scriptOrFnNode;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:579)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:279) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, functionNodeType, functionNodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = nodeTraversal;
        processProvideCallMethodArguments[1] = functionNode;
        processProvideCallMethodArguments[2] = ((Object) null);
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:579)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:279) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = nodeTraversal;
        processProvideCallMethodArguments[1] = scriptOrFnNode;
        processProvideCallMethodArguments[2] = ((Object) null);
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:585)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:279) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, functionNodeType, functionNodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = nodeTraversal;
        processProvideCallMethodArguments[1] = functionNode;
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
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(next, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) next)).setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:585)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideCall(ProcessClosurePrimitives.java:279) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideCall", nodeTraversalType, stringNodeType, stringNodeType);
        processProvideCallMethod.setAccessible(true);
        java.lang.Object[] processProvideCallMethodArguments = new java.lang.Object[3];
        processProvideCallMethodArguments[0] = nodeTraversal;
        processProvideCallMethodArguments[1] = stringNode;
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:235) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node arg = left.getNext();
 *  */
    @Test
    public void testProcessRequireCall_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:236) */
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
 * @utbot.executesCondition {@code (verifyArgument(t, left, arg)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyArgument(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String ns = arg.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessRequireCall_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(40);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
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
    
    ///region OTHER: ERROR SUITE for method processRequireCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcessRequireCall1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:237) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, functionNodeType, functionNodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = nodeTraversal;
        processRequireCallMethodArguments[1] = functionNode;
        processRequireCallMethodArguments[2] = scriptOrFnNode;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:237) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, functionNodeType, functionNodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = nodeTraversal;
        processRequireCallMethodArguments[1] = functionNode;
        processRequireCallMethodArguments[2] = ((Object) null);
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) next)).setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processRequireCall(ProcessClosurePrimitives.java:237) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processRequireCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processRequireCall", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        processRequireCallMethod.setAccessible(true);
        java.lang.Object[] processRequireCallMethodArguments = new java.lang.Object[3];
        processRequireCallMethodArguments[0] = nodeTraversal;
        processRequireCallMethodArguments[1] = scriptOrFnNode;
        processRequireCallMethodArguments[2] = ((Object) null);
        try {
            processRequireCallMethod.invoke(processClosurePrimitives, processRequireCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.trySimplifyNewDate
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!rewriteNewDateGoogNow): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTrySimplifyNewDate_NotRewriteNewDateGoogNow() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySimplifyNewDateMethod = processClosurePrimitivesClazz.getDeclaredMethod("trySimplifyNewDate", nodeTraversalType, nodeType, nodeType);
        trySimplifyNewDateMethod.setAccessible(true);
        java.lang.Object[] trySimplifyNewDateMethodArguments = new java.lang.Object[3];
        trySimplifyNewDateMethodArguments[0] = ((Object) null);
        trySimplifyNewDateMethodArguments[1] = ((Object) null);
        trySimplifyNewDateMethodArguments[2] = ((Object) null);
        trySimplifyNewDateMethod.invoke(processClosurePrimitives, trySimplifyNewDateMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!rewriteNewDateGoogNow): False}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.NEW);): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(date)): False}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTrySimplifyNewDate_NodeUtilIsName() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "rewriteNewDateGoogNow", true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySimplifyNewDateMethod = processClosurePrimitivesClazz.getDeclaredMethod("trySimplifyNewDate", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        trySimplifyNewDateMethod.setAccessible(true);
        java.lang.Object[] trySimplifyNewDateMethodArguments = new java.lang.Object[3];
        trySimplifyNewDateMethodArguments[0] = ((Object) null);
        trySimplifyNewDateMethodArguments[1] = scriptOrFnNode;
        trySimplifyNewDateMethodArguments[2] = ((Object) null);
        trySimplifyNewDateMethod.invoke(processClosurePrimitives, trySimplifyNewDateMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!rewriteNewDateGoogNow): False}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.NEW);): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(date)): True}
 * @utbot.executesCondition {@code (!"Date".equals(date.getString())): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testTrySimplifyNewDate_NotDateEquals() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "rewriteNewDateGoogNow", true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySimplifyNewDateMethod = processClosurePrimitivesClazz.getDeclaredMethod("trySimplifyNewDate", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        trySimplifyNewDateMethod.setAccessible(true);
        java.lang.Object[] trySimplifyNewDateMethodArguments = new java.lang.Object[3];
        trySimplifyNewDateMethodArguments[0] = ((Object) null);
        trySimplifyNewDateMethodArguments[1] = scriptOrFnNode;
        trySimplifyNewDateMethodArguments[2] = ((Object) null);
        trySimplifyNewDateMethod.invoke(processClosurePrimitives, trySimplifyNewDateMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!rewriteNewDateGoogNow): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(n.getType() == Token.NEW);
 *  */
    @Test
    public void testTrySimplifyNewDate_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "rewriteNewDateGoogNow", true);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.trySimplifyNewDate] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.trySimplifyNewDate(ProcessClosurePrimitives.java:551) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySimplifyNewDateMethod = processClosurePrimitivesClazz.getDeclaredMethod("trySimplifyNewDate", nodeTraversalType, nodeType, nodeType);
        trySimplifyNewDateMethod.setAccessible(true);
        java.lang.Object[] trySimplifyNewDateMethodArguments = new java.lang.Object[3];
        trySimplifyNewDateMethodArguments[0] = ((Object) null);
        trySimplifyNewDateMethodArguments[1] = ((Object) null);
        trySimplifyNewDateMethodArguments[2] = ((Object) null);
        try {
            trySimplifyNewDateMethod.invoke(processClosurePrimitives, trySimplifyNewDateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.NEW);): False}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(n.getType() == Token.NEW);
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testTrySimplifyNewDate_ThrowIllegalArgumentException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "rewriteNewDateGoogNow", true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySimplifyNewDateMethod = processClosurePrimitivesClazz.getDeclaredMethod("trySimplifyNewDate", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        trySimplifyNewDateMethod.setAccessible(true);
        java.lang.Object[] trySimplifyNewDateMethodArguments = new java.lang.Object[3];
        trySimplifyNewDateMethodArguments[0] = ((Object) null);
        trySimplifyNewDateMethodArguments[1] = scriptOrFnNode;
        trySimplifyNewDateMethodArguments[2] = ((Object) null);
        try {
            trySimplifyNewDateMethod.invoke(processClosurePrimitives, trySimplifyNewDateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#trySimplifyNewDate(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkArgument(n.getType() == Token.NEW);): True}
 * @utbot.executesCondition {@code (!NodeUtil.isName(date)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isName(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: !NodeUtil.isName(date) || !"Date".equals(date.getString())
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTrySimplifyNewDate_ThrowUnsupportedOperationException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "rewriteNewDateGoogNow", true);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(30);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method trySimplifyNewDateMethod = processClosurePrimitivesClazz.getDeclaredMethod("trySimplifyNewDate", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        trySimplifyNewDateMethod.setAccessible(true);
        java.lang.Object[] trySimplifyNewDateMethodArguments = new java.lang.Object[3];
        trySimplifyNewDateMethodArguments[0] = ((Object) null);
        trySimplifyNewDateMethodArguments[1] = scriptOrFnNode;
        trySimplifyNewDateMethodArguments[2] = ((Object) null);
        try {
            trySimplifyNewDateMethod.invoke(processClosurePrimitives, trySimplifyNewDateMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyArgument(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyArgument(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)}
 * @utbot.executesCondition {@code (arg == null): False}
 * @utbot.executesCondition {@code (diagnostic != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testVerifyArgument_DiagnosticEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, nodeType, nodeType, intType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[4];
        verifyArgumentMethodArguments[0] = ((Object) null);
        verifyArgumentMethodArguments[1] = ((Object) null);
        verifyArgumentMethodArguments[2] = node;
        verifyArgumentMethodArguments[3] = -255;
        boolean actual = ((Boolean) verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyArgument(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, int)
    
    @Test
    public void testVerifyArgument1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, functionNodeType, functionNodeType, intType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[4];
        verifyArgumentMethodArguments[0] = nodeTraversal;
        verifyArgumentMethodArguments[1] = functionNode;
        verifyArgumentMethodArguments[2] = ((Object) null);
        verifyArgumentMethodArguments[3] = 0;
        try {
            verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyArgument2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node node = new Node(1);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType, intType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[4];
        verifyArgumentMethodArguments[0] = nodeTraversal;
        verifyArgumentMethodArguments[1] = scriptOrFnNode;
        verifyArgumentMethodArguments[2] = node;
        verifyArgumentMethodArguments[3] = 0;
        try {
            verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyArgument3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:621) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, nodeType, nodeType, intType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[4];
        verifyArgumentMethodArguments[0] = nodeTraversal;
        verifyArgumentMethodArguments[1] = ((Object) null);
        verifyArgumentMethodArguments[2] = node;
        verifyArgumentMethodArguments[3] = 0;
        try {
            verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyArgument4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = new Node(1);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:620) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class intType = int.class;
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, numberNodeType, numberNodeType, intType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[4];
        verifyArgumentMethodArguments[0] = ((Object) null);
        verifyArgumentMethodArguments[1] = numberNode;
        verifyArgumentMethodArguments[2] = node;
        verifyArgumentMethodArguments[3] = 0;
        try {
            verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method verifyArgument(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyArgument(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyArgument(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)
 * @utbot.returnsFrom {@code return verifyArgument(t, methodName, arg, Token.STRING);}
 *  */
    @Test
    public void testVerifyArgument_ProcessClosurePrimitivesVerifyArgument() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, nodeType, nodeType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[3];
        verifyArgumentMethodArguments[0] = ((Object) null);
        verifyArgumentMethodArguments[1] = ((Object) null);
        verifyArgumentMethodArguments[2] = scriptOrFnNode;
        boolean actual = ((Boolean) verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method verifyArgument(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVerifyArgument5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, stringNodeType, stringNodeType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[3];
        verifyArgumentMethodArguments[0] = nodeTraversal;
        verifyArgumentMethodArguments[1] = stringNode;
        verifyArgumentMethodArguments[2] = scriptOrFnNode;
        try {
            verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyArgument6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:621)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, nodeType, nodeType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[3];
        verifyArgumentMethodArguments[0] = nodeTraversal;
        verifyArgumentMethodArguments[1] = ((Object) null);
        verifyArgumentMethodArguments[2] = scriptOrFnNode;
        try {
            verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyArgument7() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[3];
        verifyArgumentMethodArguments[0] = nodeTraversal;
        verifyArgumentMethodArguments[1] = scriptOrFnNode;
        verifyArgumentMethodArguments[2] = ((Object) null);
        try {
            verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyArgument8() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:621)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, nodeType, nodeType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[3];
        verifyArgumentMethodArguments[0] = nodeTraversal;
        verifyArgumentMethodArguments[1] = ((Object) null);
        verifyArgumentMethodArguments[2] = scriptOrFnNode;
        try {
            verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyArgument9() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:621)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyArgumentMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyArgument", nodeTraversalType, nodeType, nodeType);
        verifyArgumentMethod.setAccessible(true);
        java.lang.Object[] verifyArgumentMethodArguments = new java.lang.Object[3];
        verifyArgumentMethodArguments[0] = ((Object) null);
        verifyArgumentMethodArguments[1] = ((Object) null);
        verifyArgumentMethodArguments[2] = ((Object) null);
        try {
            verifyArgumentMethod.invoke(processClosurePrimitives, verifyArgumentMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method verifyProvide(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyProvide(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!verifyArgument(t, methodName, arg)): False}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyArgument(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(String part: arg.getString().split("\\."))
 *  */
    @Test
    public void testVerifyProvide_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:583) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method verifyProvide(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#verifyProvide(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!verifyArgument(t, methodName, arg)): False}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyArgument(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: for(String part: arg.getString().split("\\."))
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVerifyProvide_ThrowIllegalStateException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(40);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyProvideMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyProvide", nodeTraversalType, nodeType, nodeType);
        verifyProvideMethod.setAccessible(true);
        java.lang.Object[] verifyProvideMethodArguments = new java.lang.Object[3];
        verifyProvideMethodArguments[0] = ((Object) null);
        verifyProvideMethodArguments[1] = ((Object) null);
        verifyProvideMethodArguments[2] = scriptOrFnNode;
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:599)
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:579) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method verifyProvideMethod = processClosurePrimitivesClazz.getDeclaredMethod("verifyProvide", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        verifyProvideMethod.setAccessible(true);
        java.lang.Object[] verifyProvideMethodArguments = new java.lang.Object[3];
        verifyProvideMethodArguments[0] = nodeTraversal;
        verifyProvideMethodArguments[1] = scriptOrFnNode;
        verifyProvideMethodArguments[2] = scriptOrFnNode1;
        try {
            verifyProvideMethod.invoke(processClosurePrimitives, verifyProvideMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVerifyProvide2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(40);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyProvide(ProcessClosurePrimitives.java:585) */
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:355) */
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:435)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:362) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node thisArg = callee.getNext();
 *  */
    @Test
    public void testProcessBaseClassCall_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:356) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, scriptOrFnNodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = ((Object) null);
        processBaseClassCallMethodArguments[1] = scriptOrFnNode;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:585)
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:435)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:362) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, functionNodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = nodeTraversal;
        processBaseClassCallMethodArguments[1] = functionNode;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessBaseClassCall2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:460)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:358) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, numberNodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = ((Object) null);
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:460)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:358) */
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
    public void testProcessBaseClassCall4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:460)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:358) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, functionNodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = nodeTraversal;
        processBaseClassCallMethodArguments[1] = functionNode;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessBaseClassCall5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:585)
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:435)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:362) */
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
    public void testProcessBaseClassCall6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isFunctionDeclaration(NodeUtil.java:1377)
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:436)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processBaseClassCall(ProcessClosurePrimitives.java:362) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processBaseClassCallMethod = processClosurePrimitivesClazz.getDeclaredMethod("processBaseClassCall", nodeTraversalType, functionNodeType);
        processBaseClassCallMethod.setAccessible(true);
        java.lang.Object[] processBaseClassCallMethodArguments = new java.lang.Object[2];
        processBaseClassCallMethodArguments[0] = nodeTraversal;
        processBaseClassCallMethodArguments[1] = functionNode;
        try {
            processBaseClassCallMethod.invoke(processClosurePrimitives, processBaseClassCallMethodArguments);
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
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): False}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ParentEqualsNull() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        scopeRoots.add(functionNode);
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
        Node actual = ((Node) getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): False}
 * @utbot.executesCondition {@code (parent.getLastChild() == scopeRoot && parent.getFirstChild().isQualifiedName()): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.NAME): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ParentGetTypeNotEqualsTokenNAME() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(functionNode);
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
        Node actual = ((Node) getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): False}
 * @utbot.executesCondition {@code (parent != null): False}
 * @utbot.returnsFrom {@code return null;}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ParentEqualsNull_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Node rootNode = ((Node) createInstance("com.google.javascript.rhino.Node"));
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
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): False}
 * @utbot.executesCondition {@code (parent.getLastChild() == scopeRoot && parent.getFirstChild().isQualifiedName()): True}
 * @utbot.executesCondition {@code (parent.getFirstChild().isQualifiedName()): True}
 * @utbot.returnsFrom {@code return parent.getFirstChild();}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ParentGetFirstChildIsQualifiedName() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(node);
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
        Node actual = ((Node) getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments));
        
        int firstType = first.getType();
        int actualType = actual.getType();
        assertEquals(firstType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node firstFirst = ((Node) getFieldValue(first, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
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
        
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
        assertTrue(deepEquals(first, actual));
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.returnsFrom {@code return parent.getFirstChild();}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ParentGetTypeEqualsTokenASSIGN() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(86);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(scriptOrFnNode);
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
        ScriptOrFnNode actual = ((ScriptOrFnNode) getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments));
        
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return scopeRoot.getFirstChild();}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_NodeUtilIsFunctionDeclaration() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(125);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(functionNode);
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
        ScriptOrFnNode actual = ((ScriptOrFnNode) getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments));
        
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): True}
 * @utbot.returnsFrom {@code return parent.getFirstChild();}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ParentGetTypeEqualsTokenASSIGN_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(86);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(functionNode);
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
        ScriptOrFnNode actual = ((ScriptOrFnNode) getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments));
        
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): False}
 * @utbot.executesCondition {@code (parent.getLastChild() == scopeRoot && parent.getFirstChild().isQualifiedName()): True}
 * @utbot.executesCondition {@code (parent.getFirstChild().isQualifiedName()): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.NAME): True}
 * @utbot.returnsFrom {@code return parent;}
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ParentGetTypeEqualsTokenNAME() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(38);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(scriptOrFnNode);
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
        ScriptOrFnNode actual = ((ScriptOrFnNode) getEnclosingDeclNameNodeMethod.invoke(processClosurePrimitives, getEnclosingDeclNameNodeMethodArguments));
        
        int parentEncodedSourceStart = parent.getEncodedSourceStart();
        int actualEncodedSourceStart = actual.getEncodedSourceStart();
        assertEquals(parentEncodedSourceStart, actualEncodedSourceStart);
        
        int parentEncodedSourceEnd = parent.getEncodedSourceEnd();
        int actualEncodedSourceEnd = actual.getEncodedSourceEnd();
        assertEquals(parentEncodedSourceEnd, actualEncodedSourceEnd);
        
        String actualSourceName = actual.getSourceName();
        assertNull(actualSourceName);
        
        int parentBaseLineno = parent.getBaseLineno();
        int actualBaseLineno = actual.getBaseLineno();
        assertEquals(parentBaseLineno, actualBaseLineno);
        
        int parentEndLineno = parent.getEndLineno();
        int actualEndLineno = actual.getEndLineno();
        assertEquals(parentEndLineno, actualEndLineno);
        
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
        
        int parentVarStart = ((Integer) getFieldValue(parent, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualVarStart = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(parentVarStart, actualVarStart);
        
        Object actualCompilerData = actual.getCompilerData();
        assertNull(actualCompilerData);
        
        int parentType = parent.getType();
        int actualType = actual.getType();
        assertEquals(parentType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node parentFirst = ((Node) getFieldValue(parent, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        int parentFirstType = parentFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(parentFirstType, actualFirstType);
        
        assertTrue(deepEquals(parentFirst, actualFirst));
        Node actualFirstFirst = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstFirst);
        
        Node actualFirstLast = ((Node) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstLast);
        
        Object actualFirstPropListHead = getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstPropListHead);
        
        int parentFirstSourcePosition = ((Integer) getFieldValue(parentFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstSourcePosition = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(parentFirstSourcePosition, actualFirstSourcePosition);
        
        JSType actualFirstJsType = ((JSType) getFieldValue(actualFirst, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstJsType);
        
        Node actualFirstParent = actualFirst.getParent();
        assertNull(actualFirstParent);
        
        Node parentLast = ((Node) getFieldValue(parent, "com.google.javascript.rhino.Node", "last"));
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        assertTrue(deepEquals(parentLast, actualLast));
        Node parentLastParent = parentLast.getParent();
        Node actualLastParent = actualLast.getParent();
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        assertTrue(deepEquals(parentLastParent, actualLastParent));
        
        assertTrue(deepEquals(parent, actual));
        assertTrue(deepEquals(parent, actual));
        assertTrue(deepEquals(parent, actual));
        assertTrue(deepEquals(parent, actual));
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:435) */
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
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return scopeRoot.getFirstChild();}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return scopeRoot.getFirstChild();
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScopeRoot(NodeTraversal.java:585)
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:435) */
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#getEnclosingDeclNameNode(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (NodeUtil.isFunctionDeclaration(scopeRoot)): False}
 * @utbot.executesCondition {@code (parent != null): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.ASSIGN): False}
 * @utbot.executesCondition {@code (parent.getLastChild() == scopeRoot && parent.getFirstChild().isQualifiedName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getFirstChild().isQualifiedName()
 *  */
    @Test
    public void testGetEnclosingDeclNameNode_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopeRoots = new LinkedList();
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "last", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        scopeRoots.add(node);
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
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.getEnclosingDeclNameNode(ProcessClosurePrimitives.java:444) */
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        scopeRoots.add(functionNode);
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:502) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node arg = left.getNext();
 *  */
    @Test
    public void testProcessSetCssNameMapping_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:503) */
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (error == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.setCssRenamingMap(cssRenamingMap);
 *  */
    @Test
    public void testProcessSetCssNameMapping_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:537) */
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (error == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getParent().removeChild(parent);
 *  */
    @Test
    public void testProcessSetCssNameMapping_ThrowNullPointerException_3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:538) */
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (error == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getParent().removeChild(parent);
 *  */
    @Test
    public void testProcessSetCssNameMapping_ThrowNullPointerException_4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:538) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = functionNode;
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (error == null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#verifyArgument(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,int)
 * @utbot.invokes {@link com.google.common.collect.Maps#newHashMap()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#setCssRenamingMap(com.google.javascript.jscomp.CssRenamingMap)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: parent.getParent().removeChild(parent);
 *  */
    @Test(expected = RuntimeException.class)
    public void testProcessSetCssNameMapping_ThrowRuntimeException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CssRenamingMap cssRenamingMap = ((CssRenamingMap) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives$1"));
        options.cssRenamingMap = cssRenamingMap;
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = scriptOrFnNode;
        processSetCssNameMappingMethodArguments[2] = scriptOrFnNode1;
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcessSetCssNameMapping1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", numberNode1);
        setField(parent, "com.google.javascript.rhino.Node", "last", numberNode1);
        setField(numberNode1, "com.google.javascript.rhino.Node", "parent", parent);
        
        AbstractCompiler processClosurePrimitivesCompiler = ((AbstractCompiler) getFieldValue(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler"));
        CompilerOptions processClosurePrimitivesCompilerCompilerOptions = ((CompilerOptions) getFieldValue(processClosurePrimitivesCompiler, "com.google.javascript.jscomp.Compiler", "options"));
        CssRenamingMap initialProcessClosurePrimitivesCompilerOptionsCssRenamingMap = ((CssRenamingMap) getFieldValue(processClosurePrimitivesCompilerCompilerOptions, "com.google.javascript.jscomp.CompilerOptions", "cssRenamingMap"));
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, numberNodeType, numberNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = numberNode;
        processSetCssNameMappingMethodArguments[2] = numberNode1;
        processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        
        AbstractCompiler processClosurePrimitivesCompiler1 = ((AbstractCompiler) getFieldValue(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler"));
        CompilerOptions processClosurePrimitivesCompiler1CompilerOptions = ((CompilerOptions) getFieldValue(processClosurePrimitivesCompiler1, "com.google.javascript.jscomp.Compiler", "options"));
        CssRenamingMap finalProcessClosurePrimitivesCompilerOptionsCssRenamingMap = ((CssRenamingMap) getFieldValue(processClosurePrimitivesCompiler1CompilerOptions, "com.google.javascript.jscomp.CompilerOptions", "cssRenamingMap"));
        
        Node finalNumberNode1Parent = ((Node) getFieldValue(numberNode1, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialProcessClosurePrimitivesCompilerOptionsCssRenamingMap == finalProcessClosurePrimitivesCompilerOptionsCssRenamingMap);
        
        assertNull(finalNumberNode1Parent);
    }
    
    @Test
    public void testProcessSetCssNameMapping2() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ArrayList codeChangeHandlers = new ArrayList();
        setField(compiler, "com.google.javascript.jscomp.Compiler", "codeChangeHandlers", codeChangeHandlers);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "next", numberNode);
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        AbstractCompiler processClosurePrimitivesCompiler = ((AbstractCompiler) getFieldValue(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler"));
        CompilerOptions processClosurePrimitivesCompilerCompilerOptions = ((CompilerOptions) getFieldValue(processClosurePrimitivesCompiler, "com.google.javascript.jscomp.Compiler", "options"));
        CssRenamingMap initialProcessClosurePrimitivesCompilerOptionsCssRenamingMap = ((CssRenamingMap) getFieldValue(processClosurePrimitivesCompilerCompilerOptions, "com.google.javascript.jscomp.CompilerOptions", "cssRenamingMap"));
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = numberNode;
        processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        
        AbstractCompiler processClosurePrimitivesCompiler1 = ((AbstractCompiler) getFieldValue(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler"));
        CompilerOptions processClosurePrimitivesCompiler1CompilerOptions = ((CompilerOptions) getFieldValue(processClosurePrimitivesCompiler1, "com.google.javascript.jscomp.Compiler", "options"));
        CssRenamingMap finalProcessClosurePrimitivesCompilerOptionsCssRenamingMap = ((CssRenamingMap) getFieldValue(processClosurePrimitivesCompiler1CompilerOptions, "com.google.javascript.jscomp.CompilerOptions", "cssRenamingMap"));
        
        Node finalNumberNodeParent = ((Node) getFieldValue(numberNode, "com.google.javascript.rhino.Node", "parent"));
        
        assertFalse(initialProcessClosurePrimitivesCompilerOptionsCssRenamingMap == finalProcessClosurePrimitivesCompilerOptionsCssRenamingMap);
        
        assertNull(finalNumberNodeParent);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcessSetCssNameMapping3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:504) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, functionNodeType, functionNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = functionNode;
        processSetCssNameMappingMethodArguments[2] = scriptOrFnNode;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:619)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:504) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, functionNodeType, functionNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = functionNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        next.setType(64);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.verifyArgument(ProcessClosurePrimitives.java:620)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:504) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, stringNodeType, stringNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = stringNode;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:515) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, functionNodeType, functionNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = functionNode;
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
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(40);
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:515) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, functionNodeType, functionNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = functionNode;
        processSetCssNameMappingMethodArguments[2] = ((Object) null);
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcessSetCssNameMapping8() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processSetCssNameMapping(ProcessClosurePrimitives.java:515) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, functionNodeType, functionNodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = ((Object) null);
        processSetCssNameMappingMethodArguments[1] = functionNode;
        processSetCssNameMappingMethodArguments[2] = functionNode;
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method processSetCssNameMapping(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testProcessSetCssNameMapping9() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionNode first = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node node1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "next", parent);
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(node1, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processSetCssNameMappingMethod = processClosurePrimitivesClazz.getDeclaredMethod("processSetCssNameMapping", nodeTraversalType, nodeType, nodeType);
        processSetCssNameMappingMethod.setAccessible(true);
        java.lang.Object[] processSetCssNameMappingMethodArguments = new java.lang.Object[3];
        processSetCssNameMappingMethodArguments[0] = nodeTraversal;
        processSetCssNameMappingMethodArguments[1] = node;
        processSetCssNameMappingMethodArguments[2] = node1;
        try {
            processSetCssNameMappingMethod.invoke(processClosurePrimitives, processSetCssNameMappingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
    ///     {@link com.google.javascript.rhino.Node#getType()} twice
    /// execute conditions:
    ///     {@code (name != null): False}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): False}
 * @utbot.executesCondition {@code (n.getType() == Token.ASSIGN): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ParentGetTypeNotEqualsTokenVAR() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode1;
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (n.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.EXPR_RESULT): False}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ParentGetTypeNotEqualsTokenEXPR_RESULT() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode1;
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (n.getType() == Token.ASSIGN): False}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_NGetTypeNotEqualsTokenASSIGN() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
        handleCandidateProvideDefinitionMethodArguments[2] = ((Object) null);
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (n.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.EXPR_RESULT): True}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ParentGetTypeEqualsTokenEXPR_RESULT() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(130);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode1;
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (n.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.EXPR_RESULT): True}
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ParentGetTypeEqualsTokenEXPR_RESULT_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(130);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode1;
        handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): True}
 * @utbot.executesCondition {@code (name != null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode;
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:302) */
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
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.NAME && parent.getType() == Token.VAR
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:304) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
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
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (n.getType() == Token.ASSIGN): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getType() == Token.EXPR_RESULT
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:307) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
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
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.NAME && parent.getType() == Token.VAR
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:304) */
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
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (n.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.EXPR_RESULT): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: name = n.getFirstChild().getQualifiedName();
 *  */
    @Test
    public void testHandleCandidateProvideDefinition_ThrowNullPointerException_6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:308) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode1;
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
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (n.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.EXPR_RESULT): True}
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
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(130);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(scriptOrFnNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:315) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode1;
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
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): True}
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
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:315) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode;
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
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): True}
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:470)
            com.google.javascript.jscomp.ProcessClosurePrimitives.handleCandidateProvideDefinition(ProcessClosurePrimitives.java:313) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, stringNodeType, stringNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = stringNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode;
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
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.VAR): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(38);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(118);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode1;
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#handleCandidateProvideDefinition(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.NAME): False}
 * @utbot.executesCondition {@code (n.getType() == Token.ASSIGN): True}
 * @utbot.executesCondition {@code (parent.getType() == Token.EXPR_RESULT): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: name = n.getFirstChild().getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testHandleCandidateProvideDefinition_ThrowUnsupportedOperationException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(86);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        ScriptOrFnNode scriptOrFnNode1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode1.setType(130);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method handleCandidateProvideDefinitionMethod = processClosurePrimitivesClazz.getDeclaredMethod("handleCandidateProvideDefinition", nodeTraversalType, scriptOrFnNodeType, scriptOrFnNodeType);
        handleCandidateProvideDefinitionMethod.setAccessible(true);
        java.lang.Object[] handleCandidateProvideDefinitionMethodArguments = new java.lang.Object[3];
        handleCandidateProvideDefinitionMethodArguments[0] = nodeTraversal;
        handleCandidateProvideDefinitionMethodArguments[1] = scriptOrFnNode;
        handleCandidateProvideDefinitionMethodArguments[2] = scriptOrFnNode1;
        try {
            handleCandidateProvideDefinitionMethod.invoke(processClosurePrimitives, handleCandidateProvideDefinitionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcessProvideFromPreviousPass() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_2() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_4() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_5() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_3() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !providedNames.containsKey(name)
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:470) */
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNamespacePlaceholder(parent)
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        String string = "";
        Object providedName = createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives$ProvidedName");
        providedNames.put(string, providedName);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:882)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:487) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, nodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = string;
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
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNamespacePlaceholder(parent)
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException_7() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:892)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:487) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        try {
            processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isNamespacePlaceholder(parent)
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException_2() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:889)
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:487) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        try {
            processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: parent.getParent().removeChild(parent);
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException_3() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:488) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        try {
            processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException_5() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        Object next = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "next", next);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next1, "com.google.javascript.rhino.Node$PropListItem", "intValue", -256);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(parent, "com.google.javascript.rhino.Node", "first", scriptOrFnNode);
        setField(parent, "com.google.javascript.rhino.Node", "last", next);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:489) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, scriptOrFnNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = scriptOrFnNode;
        try {
            processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException_4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -256);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -256);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode first1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(first1, "com.google.javascript.rhino.Node", "next", scriptOrFnNode);
        setField(parent, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "last", scriptOrFnNode);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:489) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, scriptOrFnNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = scriptOrFnNode;
        try {
            processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testProcessProvideFromPreviousPass_ThrowNullPointerException_6() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -256);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", scriptOrFnNode);
        setField(first1, "com.google.javascript.rhino.Node", "next", next1);
        setField(parent, "com.google.javascript.rhino.Node", "first", first1);
        setField(parent, "com.google.javascript.rhino.Node", "last", first1);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.processProvideFromPreviousPass(ProcessClosurePrimitives.java:489) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, scriptOrFnNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = scriptOrFnNode;
        try {
            processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal, java.lang.String, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#processProvideFromPreviousPass(com.google.javascript.jscomp.NodeTraversal,java.lang.String,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link java.util.Map#containsKey(java.lang.Object)}
 * @utbot.invokes com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#removeChild(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.RuntimeException} in: parent.getParent().removeChild(parent);
 *  */
    @Test(expected = RuntimeException.class)
    public void testProcessProvideFromPreviousPass_ThrowRuntimeException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        providedNames.put(null, null);
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        FunctionNode first1 = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        ScriptOrFnNode last = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        last.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "last", last);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(next, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "next", next);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", first);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processProvideFromPreviousPassMethod = processClosurePrimitivesClazz.getDeclaredMethod("processProvideFromPreviousPass", nodeTraversalType, stringType, functionNodeType);
        processProvideFromPreviousPassMethod.setAccessible(true);
        java.lang.Object[] processProvideFromPreviousPassMethodArguments = new java.lang.Object[3];
        processProvideFromPreviousPassMethodArguments[0] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[1] = ((Object) null);
        processProvideFromPreviousPassMethodArguments[2] = functionNode;
        try {
            processProvideFromPreviousPassMethod.invoke(processClosurePrimitives, processProvideFromPreviousPassMethodArguments);
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
 *  */
    @Test
    public void testRegisterAnyProvidedPrefixes() throws Exception  {
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#registerAnyProvidedPrefixes(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.JSModule)}
 * @utbot.iterates iterate the loop {@code while(pos != -1)} once
 *  */
    @Test
    public void testRegisterAnyProvidedPrefixes_NotProvidedNamesContainsKey_1() throws Exception  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        String string = ".";
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringType = Class.forName("java.lang.String");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method registerAnyProvidedPrefixesMethod = processClosurePrimitivesClazz.getDeclaredMethod("registerAnyProvidedPrefixes", stringType, scriptOrFnNodeType, jSModuleType);
        registerAnyProvidedPrefixesMethod.setAccessible(true);
        java.lang.Object[] registerAnyProvidedPrefixesMethodArguments = new java.lang.Object[3];
        registerAnyProvidedPrefixesMethodArguments[0] = string;
        registerAnyProvidedPrefixesMethodArguments[1] = scriptOrFnNode;
        registerAnyProvidedPrefixesMethodArguments[2] = ((Object) null);
        registerAnyProvidedPrefixesMethod.invoke(processClosurePrimitives, registerAnyProvidedPrefixesMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#registerAnyProvidedPrefixes(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.JSModule)}
 * @utbot.iterates iterate the loop {@code while(pos != -1)} once
 *  */
    @Test
    public void testRegisterAnyProvidedPrefixes_NotProvidedNamesContainsKey() throws Exception  {
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes(ProcessClosurePrimitives.java:638) */
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
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#registerAnyProvidedPrefixes(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.JSModule)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.iterates iterate the loop {@code while(pos != -1)} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: providedNames.containsKey(prefixNs)
 *  */
    @Test
    public void testRegisterAnyProvidedPrefixes_ThrowNullPointerException_1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        String string = ".";
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.registerAnyProvidedPrefixes(ProcessClosurePrimitives.java:642) */
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
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method registerAnyProvidedPrefixes(java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.JSModule)
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#registerAnyProvidedPrefixes(java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.JSModule)}
 * @utbot.invokes {@link java.lang.String#indexOf(int)}
 * @utbot.iterates iterate the loop {@code while(pos != -1)} once
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: providedNames.put(prefixNs, new ProvidedName(prefixNs, node, module, false));
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testRegisterAnyProvidedPrefixes_ThrowIllegalArgumentException() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        LinkedHashMap providedNames = new LinkedHashMap();
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "providedNames", providedNames);
        String string = ".";
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(-255);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class stringType = Class.forName("java.lang.String");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSModuleType = Class.forName("com.google.javascript.jscomp.JSModule");
        Method registerAnyProvidedPrefixesMethod = processClosurePrimitivesClazz.getDeclaredMethod("registerAnyProvidedPrefixes", stringType, functionNodeType, jSModuleType);
        registerAnyProvidedPrefixesMethod.setAccessible(true);
        java.lang.Object[] registerAnyProvidedPrefixesMethodArguments = new java.lang.Object[3];
        registerAnyProvidedPrefixesMethodArguments[0] = string;
        registerAnyProvidedPrefixesMethodArguments[1] = functionNode;
        registerAnyProvidedPrefixesMethodArguments[2] = ((Object) null);
        try {
            registerAnyProvidedPrefixesMethod.invoke(processClosurePrimitives, registerAnyProvidedPrefixesMethodArguments);
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
    
    ///region Test suites for executable com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse
    
    ///region OTHER: ERROR SUITE for method reportBadBaseClassUse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)
    
    @Test
    public void testReportBadBaseClassUse1() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        setField(processClosurePrimitives, "com.google.javascript.jscomp.ProcessClosurePrimitives", "compiler", compiler);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1631)
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:460) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method reportBadBaseClassUseMethod = processClosurePrimitivesClazz.getDeclaredMethod("reportBadBaseClassUse", nodeTraversalType, nodeType, stringType);
        reportBadBaseClassUseMethod.setAccessible(true);
        java.lang.Object[] reportBadBaseClassUseMethodArguments = new java.lang.Object[3];
        reportBadBaseClassUseMethodArguments[0] = nodeTraversal;
        reportBadBaseClassUseMethodArguments[1] = ((Object) null);
        reportBadBaseClassUseMethodArguments[2] = ((Object) null);
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
            com.google.javascript.jscomp.Compiler.report(Compiler.java:1631)
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:460) */
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
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:460) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method reportBadBaseClassUseMethod = processClosurePrimitivesClazz.getDeclaredMethod("reportBadBaseClassUse", nodeTraversalType, scriptOrFnNodeType, stringType);
        reportBadBaseClassUseMethod.setAccessible(true);
        java.lang.Object[] reportBadBaseClassUseMethodArguments = new java.lang.Object[3];
        reportBadBaseClassUseMethodArguments[0] = nodeTraversal;
        reportBadBaseClassUseMethodArguments[1] = scriptOrFnNode;
        reportBadBaseClassUseMethodArguments[2] = ((Object) null);
        try {
            reportBadBaseClassUseMethod.invoke(processClosurePrimitives, reportBadBaseClassUseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testReportBadBaseClassUse4() throws Throwable  {
        ProcessClosurePrimitives processClosurePrimitives = ((ProcessClosurePrimitives) createInstance("com.google.javascript.jscomp.ProcessClosurePrimitives"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String string = "";
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.reportBadBaseClassUse(ProcessClosurePrimitives.java:460) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method reportBadBaseClassUseMethod = processClosurePrimitivesClazz.getDeclaredMethod("reportBadBaseClassUse", nodeTraversalType, nodeType, stringType);
        reportBadBaseClassUseMethod.setAccessible(true);
        java.lang.Object[] reportBadBaseClassUseMethodArguments = new java.lang.Object[3];
        reportBadBaseClassUseMethodArguments[0] = nodeTraversal;
        reportBadBaseClassUseMethodArguments[1] = ((Object) null);
        reportBadBaseClassUseMethodArguments[2] = string;
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
    public void testIsNamespacePlaceholder_NotNGetBooleanProp() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", nodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = node;
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
    public void testIsNamespacePlaceholder_NotNGetBooleanProp_1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Node node = new Node(0);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", nodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = node;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): False}
 * @utbot.executesCondition {@code (n.getType() == Token.EXPR_RESULT): False}
 * @utbot.executesCondition {@code (n.getType() == Token.VAR): False}
 * @utbot.returnsFrom {@code return value != null && value.getType() == Token.OBJECTLIT && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NGetTypeNotEqualsTokenVAR() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", nodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = node;
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
    public void testIsNamespacePlaceholder_NotNGetBooleanProp_2() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 1);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", nodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = node;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (!n.getBooleanProp(Node.IS_NAMESPACE)): False}
 * @utbot.executesCondition {@code (n.getType() == Token.EXPR_RESULT): False}
 * @utbot.executesCondition {@code (n.getType() == Token.VAR): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return value != null && value.getType() == Token.OBJECTLIT && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NGetTypeEqualsTokenVAR() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(118);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", scriptOrFnNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = scriptOrFnNode;
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
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// execute conditions:
    ///     {@code (n.getType() == Token.EXPR_RESULT): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} once,
    ///     {@link com.google.javascript.rhino.Node#getLastChild()} once,
    ///     {@link com.google.javascript.rhino.Node#getType()} once
    /// return from: {@code return value != null && value.getType() == Token.OBJECTLIT && !value.hasChildren();}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): False}
 * @utbot.returnsFrom {@code return value != null && value.getType() == Token.OBJECTLIT && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_ValueGetTypeNotEqualsTokenOBJECTLIT() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(-255);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", scriptOrFnNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = scriptOrFnNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): True}
 * @utbot.executesCondition {@code (!value.hasChildren()): False}
 * @utbot.returnsFrom {@code return value != null && value.getType() == Token.OBJECTLIT && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_ValueHasChildren() throws Exception  {
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(functionNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(functionNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", functionNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = functionNode;
        boolean actual = ((Boolean) isNamespacePlaceholderMethod.invoke(null, isNamespacePlaceholderMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link ProcessClosurePrimitives}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.ProcessClosurePrimitives#isNamespacePlaceholder(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (value.getType() == Token.OBJECTLIT): True}
 * @utbot.executesCondition {@code (!value.hasChildren()): True}
 * @utbot.returnsFrom {@code return value != null && value.getType() == Token.OBJECTLIT && !value.hasChildren();}
 *  */
    @Test
    public void testIsNamespacePlaceholder_NotValueHasChildren() throws Exception  {
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(130);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        first.setType(64);
        setField(first, "com.google.javascript.rhino.Node", "last", first);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(scriptOrFnNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class scriptOrFnNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", scriptOrFnNodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = scriptOrFnNode;
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
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:882) */
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
 * @utbot.executesCondition {@code (n.getType() == Token.EXPR_RESULT): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = assign.getLastChild();
 *  */
    @Test
    public void testIsNamespacePlaceholder_ThrowNullPointerException_1() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(130);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:889) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", nodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = node;
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
 * @utbot.executesCondition {@code (n.getType() == Token.EXPR_RESULT): False}
 * @utbot.executesCondition {@code (n.getType() == Token.VAR): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: value = name.getFirstChild();
 *  */
    @Test
    public void testIsNamespacePlaceholder_ThrowNullPointerException_2() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$PropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "type", 45);
        setField(propListHead, "com.google.javascript.rhino.Node$PropListItem", "intValue", -255);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ProcessClosurePrimitives.isNamespacePlaceholder(ProcessClosurePrimitives.java:892) */
        Class processClosurePrimitivesClazz = Class.forName("com.google.javascript.jscomp.ProcessClosurePrimitives");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isNamespacePlaceholderMethod = processClosurePrimitivesClazz.getDeclaredMethod("isNamespacePlaceholder", nodeType);
        isNamespacePlaceholderMethod.setAccessible(true);
        java.lang.Object[] isNamespacePlaceholderMethodArguments = new java.lang.Object[1];
        isNamespacePlaceholderMethodArguments[0] = node;
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
        
                java.lang.reflect.Method methodForGetDeclaredFields901154739198900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields901154739198900.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass901154739203600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields901154739198900.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass901154739203600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields901154739671100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields901154739671100.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass901154739672500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields901154739671100.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass901154739672500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

