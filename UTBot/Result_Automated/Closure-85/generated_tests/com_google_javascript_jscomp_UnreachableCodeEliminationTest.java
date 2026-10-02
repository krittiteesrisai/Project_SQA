package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.ScriptOrFnNode;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.Node;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.FunctionNode;
import com.google.javascript.rhino.ObjArray;
import com.google.javascript.rhino.ObjToIntMap;
import java.lang.reflect.InvocationTargetException;
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
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_UnreachableCodeEliminationTest {
    ///region Test suites for executable com.google.javascript.jscomp.UnreachableCodeElimination.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_NGetTypeEqualsTokenFUNCTION() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(105);
        
        unreachableCodeElimination.visit(null, scriptOrFnNode, scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (n.getType() == Token.SCRIPT): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_NGetTypeEqualsTokenSCRIPT() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        scriptOrFnNode.setType(132);
        
        unreachableCodeElimination.visit(null, scriptOrFnNode, scriptOrFnNode);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_ParentEqualsNull() {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        
        unreachableCodeElimination.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parent == null): False}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (n.getType() == Token.SCRIPT): False}
 * @utbot.executesCondition {@code (gNode == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.ControlFlowGraph#getDirectedGraphNode(java.lang.Object)}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testVisit_GNodeEqualsNull() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        ControlFlowGraph curCfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        setField(curCfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        unreachableCodeElimination.curCfg = curCfg;
        Node node = new Node(-255);
        ScriptOrFnNode scriptOrFnNode = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        
        unreachableCodeElimination.visit(null, node, scriptOrFnNode);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.getType() == Token.FUNCTION || n.getType() == Token.SCRIPT
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.visit(UnreachableCodeElimination.java:95) */
        unreachableCodeElimination.visit(null, null, node);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (n.getType() == Token.SCRIPT): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.ControlFlowGraph#getDirectedGraphNode(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DiGraphNode<Node, Branch> gNode = curCfg.getDirectedGraphNode(n);
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        unreachableCodeElimination.curCfg = null;
        Node node = new Node(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.visit(UnreachableCodeElimination.java:99) */
        unreachableCodeElimination.visit(null, node, node);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.UnreachableCodeElimination.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverse(com.google.javascript.jscomp.AbstractCompiler,com.google.javascript.rhino.Node,com.google.javascript.jscomp.NodeTraversal.Callback)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: NodeTraversal.traverse(compiler, root, this);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:230)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:422)
            com.google.javascript.jscomp.UnreachableCodeElimination.process(UnreachableCodeElimination.java:87) */
        unreachableCodeElimination.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.UnreachableCodeElimination.enterScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Scope scope = t.getScope();
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException() {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.enterScope(UnreachableCodeElimination.java:68) */
        unreachableCodeElimination.enterScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: cfa.process(null, scope.getRootNode());
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_1() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        ArrayDeque scopeRoots = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.enterScope(UnreachableCodeElimination.java:72) */
        unreachableCodeElimination.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Scope scope = t.getScope();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnterScope_ThrowIllegalStateException() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        scopeRoots.add(node);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", parent);
        scopes1.put(node, scope);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        unreachableCodeElimination.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.UnreachableCodeElimination.exitScope
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} in: curCfg = cfgStack.pop();
 *  */
    @Test
    public void testExitScope_ThrowNoSuchElementException_1() {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        LinkedList cfgStack = new LinkedList();
        unreachableCodeElimination.cfgStack = cfgStack;
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.exitScope] produces [java.util.NoSuchElementException]
            java.base/java.util.LinkedList.removeFirst(LinkedList.java:274)
            java.base/java.util.LinkedList.pop(LinkedList.java:805)
            com.google.javascript.jscomp.UnreachableCodeElimination.exitScope(UnreachableCodeElimination.java:82) */
        unreachableCodeElimination.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.throwsException {@link java.util.NoSuchElementException} 
 *  */
    @Test
    public void testExitScope_ThrowNoSuchElementException() {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        ArrayDeque cfgStack = new ArrayDeque();
        unreachableCodeElimination.cfgStack = cfgStack;
        unreachableCodeElimination.curCfg = null;
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.exitScope] produces [java.util.NoSuchElementException]
            java.base/java.util.ArrayDeque.removeFirst(ArrayDeque.java:362)
            java.base/java.util.ArrayDeque.pop(ArrayDeque.java:593)
            com.google.javascript.jscomp.UnreachableCodeElimination.exitScope(UnreachableCodeElimination.java:82) */
        unreachableCodeElimination.exitScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link java.util.Deque#pop()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: curCfg = cfgStack.pop();
 *  */
    @Test
    public void testExitScope_ThrowNullPointerException() {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        unreachableCodeElimination.cfgStack = null;
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.exitScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.exitScope(UnreachableCodeElimination.java:82) */
        unreachableCodeElimination.exitScope(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.UnreachableCodeElimination.computeFollowing
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method computeFollowing(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_1() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_3() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(108);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_11() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(112);
        setField(parent, "com.google.javascript.rhino.Node", "next", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_6() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(115);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_8() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(112);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(111);
        setField(next, "com.google.javascript.rhino.Node", "first", next);
        setField(parent, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_4() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(111);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_5() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(77);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_9() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(105);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_15() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_18() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode parent = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        parent.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "last", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_19() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", node);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_2() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(113);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        int parentType = parent.getType();
        int actualType = actual.getType();
        assertEquals(parentType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int parentSourcePosition = ((Integer) getFieldValue(parent, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(parentSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_7() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", next);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        int nextType = next.getType();
        int actualType = actual.getType();
        assertEquals(nextType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int nextSourcePosition = ((Integer) getFieldValue(next, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nextSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_13() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(126);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", last);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        int lastType = last.getType();
        int actualType = actual.getType();
        assertEquals(lastType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int lastSourcePosition = ((Integer) getFieldValue(last, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(lastSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_16() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(114);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(next, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", first);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
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
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_17() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(115);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
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
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_20() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(77);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", node);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        int nextType = next.getType();
        int actualType = actual.getType();
        assertEquals(nextType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int nextSourcePosition = ((Integer) getFieldValue(next, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nextSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_12() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(77);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "last", last);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        int lastType = last.getType();
        int actualType = actual.getType();
        assertEquals(lastType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirst);
        
        Node actualLast = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualLast);
        
        Object actualPropListHead = getFieldValue(actual, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualPropListHead);
        
        int lastSourcePosition = ((Integer) getFieldValue(last, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(lastSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_10() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(115);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        int parentType = parent.getType();
        int actualType = actual.getType();
        assertEquals(parentType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node parentFirst = ((Node) getFieldValue(parent, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int parentFirstEncodedSourceStart = (((ScriptOrFnNode) parentFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(parentFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int parentFirstEncodedSourceEnd = (((ScriptOrFnNode) parentFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(parentFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int parentFirstBaseLineno = (((ScriptOrFnNode) parentFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(parentFirstBaseLineno, actualFirstBaseLineno);
        
        int parentFirstEndLineno = (((ScriptOrFnNode) parentFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(parentFirstEndLineno, actualFirstEndLineno);
        
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
        
        int parentFirstVarStart = ((Integer) getFieldValue(parentFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(parentFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int parentFirstType = parentFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(parentFirstType, actualFirstType);
        
        Node parentFirstNext = parentFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        Node parentFirstNextNext = parentFirstNext.getNext();
        Node actualFirstNextNext = actualFirstNext.getNext();
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(parentFirstNextNext, actualFirstNextNext));
        Node actualFirstNextNextFirst = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextNextFirst);
        
        Node actualFirstNextNextLast = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextNextLast);
        
        Object actualFirstNextNextPropListHead = getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextNextPropListHead);
        
        int parentFirstNextNextSourcePosition = ((Integer) getFieldValue(parentFirstNextNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextNextSourcePosition = ((Integer) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(parentFirstNextNextSourcePosition, actualFirstNextNextSourcePosition);
        
        JSType actualFirstNextNextJsType = ((JSType) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextNextJsType);
        
        Node actualFirstNextNextParent = actualFirstNextNext.getParent();
        assertNull(actualFirstNextNextParent);
        
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        assertTrue(deepEquals(parentFirstNext, actualFirstNext));
        
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        assertTrue(deepEquals(parentFirst, actualFirst));
        
        assertTrue(deepEquals(parent, actual));
        assertTrue(deepEquals(parent, actual));
        assertTrue(deepEquals(parent, actual));
        assertTrue(deepEquals(parent, actual));
        assertTrue(deepEquals(parent, actual));
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return next;}
 *  */
    @Test
    public void testComputeFollowing_ReturnNext_14() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(115);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next1 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        ScriptOrFnNode next2 = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(next1, "com.google.javascript.rhino.Node", "next", next2);
        setField(first, "com.google.javascript.rhino.Node", "next", next1);
        setField(next, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        Node actual = ((Node) computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments));
        
        int nextType = next.getType();
        int actualType = actual.getType();
        assertEquals(nextType, actualType);
        
        Node actualNext = actual.getNext();
        assertNull(actualNext);
        
        Node nextFirst = ((Node) getFieldValue(next, "com.google.javascript.rhino.Node", "first"));
        Node actualFirst = ((Node) getFieldValue(actual, "com.google.javascript.rhino.Node", "first"));
        int nextFirstEncodedSourceStart = (((ScriptOrFnNode) nextFirst)).getEncodedSourceStart();
        int actualFirstEncodedSourceStart = (((ScriptOrFnNode) actualFirst)).getEncodedSourceStart();
        assertEquals(nextFirstEncodedSourceStart, actualFirstEncodedSourceStart);
        
        int nextFirstEncodedSourceEnd = (((ScriptOrFnNode) nextFirst)).getEncodedSourceEnd();
        int actualFirstEncodedSourceEnd = (((ScriptOrFnNode) actualFirst)).getEncodedSourceEnd();
        assertEquals(nextFirstEncodedSourceEnd, actualFirstEncodedSourceEnd);
        
        String actualFirstSourceName = (((ScriptOrFnNode) actualFirst)).getSourceName();
        assertNull(actualFirstSourceName);
        
        int nextFirstBaseLineno = (((ScriptOrFnNode) nextFirst)).getBaseLineno();
        int actualFirstBaseLineno = (((ScriptOrFnNode) actualFirst)).getBaseLineno();
        assertEquals(nextFirstBaseLineno, actualFirstBaseLineno);
        
        int nextFirstEndLineno = (((ScriptOrFnNode) nextFirst)).getEndLineno();
        int actualFirstEndLineno = (((ScriptOrFnNode) actualFirst)).getEndLineno();
        assertEquals(nextFirstEndLineno, actualFirstEndLineno);
        
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
        
        int nextFirstVarStart = ((Integer) getFieldValue(nextFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        int actualFirstVarStart = ((Integer) getFieldValue(actualFirst, "com.google.javascript.rhino.ScriptOrFnNode", "varStart"));
        assertEquals(nextFirstVarStart, actualFirstVarStart);
        
        Object actualFirstCompilerData = (((ScriptOrFnNode) actualFirst)).getCompilerData();
        assertNull(actualFirstCompilerData);
        
        int nextFirstType = nextFirst.getType();
        int actualFirstType = actualFirst.getType();
        assertEquals(nextFirstType, actualFirstType);
        
        Node nextFirstNext = nextFirst.getNext();
        Node actualFirstNext = actualFirst.getNext();
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        Node nextFirstNextNext = nextFirstNext.getNext();
        Node actualFirstNextNext = actualFirstNext.getNext();
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        assertTrue(deepEquals(nextFirstNextNext, actualFirstNextNext));
        Node actualFirstNextNextFirst = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "first"));
        assertNull(actualFirstNextNextFirst);
        
        Node actualFirstNextNextLast = ((Node) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "last"));
        assertNull(actualFirstNextNextLast);
        
        Object actualFirstNextNextPropListHead = getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "propListHead");
        assertNull(actualFirstNextNextPropListHead);
        
        int nextFirstNextNextSourcePosition = ((Integer) getFieldValue(nextFirstNextNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualFirstNextNextSourcePosition = ((Integer) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(nextFirstNextNextSourcePosition, actualFirstNextNextSourcePosition);
        
        JSType actualFirstNextNextJsType = ((JSType) getFieldValue(actualFirstNextNext, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualFirstNextNextJsType);
        
        Node actualFirstNextNextParent = actualFirstNextNext.getParent();
        assertNull(actualFirstNextNextParent);
        
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        assertTrue(deepEquals(nextFirstNext, actualFirstNext));
        
        assertTrue(deepEquals(nextFirst, actualFirst));
        assertTrue(deepEquals(nextFirst, actualFirst));
        assertTrue(deepEquals(nextFirst, actualFirst));
        assertTrue(deepEquals(nextFirst, actualFirst));
        assertTrue(deepEquals(nextFirst, actualFirst));
        assertTrue(deepEquals(nextFirst, actualFirst));
        
        assertTrue(deepEquals(next, actual));
        assertTrue(deepEquals(next, actual));
        assertTrue(deepEquals(next, actual));
        assertTrue(deepEquals(next, actual));
        assertTrue(deepEquals(next, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method computeFollowing(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node next = ControlFlowAnalysis.computeFollowNode(n);
 *  */
    @Test
    public void testComputeFollowing_ThrowNullPointerException() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.computeFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(ControlFlowAnalysis.java:695)
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(ControlFlowAnalysis.java:662)
            com.google.javascript.jscomp.UnreachableCodeElimination.computeFollowing(UnreachableCodeElimination.java:195) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = ((Object) null);
        try {
            computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node next = ControlFlowAnalysis.computeFollowNode(n);
 *  */
    @Test
    public void testComputeFollowing_ThrowNullPointerException_1() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(115);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.computeFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(ControlFlowAnalysis.java:726)
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(ControlFlowAnalysis.java:662)
            com.google.javascript.jscomp.UnreachableCodeElimination.computeFollowing(UnreachableCodeElimination.java:195) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        try {
            computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node next = ControlFlowAnalysis.computeFollowNode(n);
 *  */
    @Test
    public void testComputeFollowing_ThrowNullPointerException_3() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(111);
        setField(parent, "com.google.javascript.rhino.Node", "next", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.computeFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(ControlFlowAnalysis.java:712)
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(ControlFlowAnalysis.java:662)
            com.google.javascript.jscomp.UnreachableCodeElimination.computeFollowing(UnreachableCodeElimination.java:195) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        try {
            computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node next = ControlFlowAnalysis.computeFollowNode(n);
 *  */
    @Test
    public void testComputeFollowing_ThrowNullPointerException_2() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(115);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.computeFollowing] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(ControlFlowAnalysis.java:726)
            com.google.javascript.jscomp.ControlFlowAnalysis.computeFollowNode(ControlFlowAnalysis.java:662)
            com.google.javascript.jscomp.UnreachableCodeElimination.computeFollowing(UnreachableCodeElimination.java:195) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        try {
            computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method computeFollowing(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#computeFollowing(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.ControlFlowAnalysis#computeFollowNode(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Node next = ControlFlowAnalysis.computeFollowNode(n);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testComputeFollowing_ThrowIllegalStateException() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(111);
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method computeFollowingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("computeFollowing", nodeType);
        computeFollowingMethod.setAccessible(true);
        java.lang.Object[] computeFollowingMethodArguments = new java.lang.Object[1];
        computeFollowingMethodArguments[0] = node;
        try {
            computeFollowingMethod.invoke(unreachableCodeElimination, computeFollowingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method removeDeadExprStatementSafely(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.EMPTY): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_NGetTypeEqualsTokenEMPTY() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(124);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", nodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = node;
        removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.EMPTY): False}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): False}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_NGetTypeNotEqualsTokenBLOCKAndNotNHasChildren() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(114);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", nodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = node;
        removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.EMPTY): False}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): True}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): False}
 * @utbot.executesCondition {@code (parent.getType() == Token.TRY): True}
 * @utbot.executesCondition {@code (NodeUtil.isTryCatchNodeContainer(n)): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isTryCatchNodeContainer(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_NodeUtilIsTryCatchNodeContainer() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionNode parent = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        parent.setType(77);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first1, "com.google.javascript.rhino.Node", "next", node);
        setField(parent, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", nodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = node;
        removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.EMPTY): False}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): True}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_NGetTypeEqualsTokenBLOCKAndNotNHasChildren() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", nodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = node;
        removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method removeDeadExprStatementSafely(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = n.getParent();
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_ThrowNullPointerException() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely(UnreachableCodeElimination.java:200) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", nodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = ((Object) null);
        try {
            removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.EMPTY): False}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node tryNode = parent.getParent();
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_ThrowNullPointerException_2() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely(UnreachableCodeElimination.java:224) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", nodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = node;
        try {
            removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.EMPTY): False}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_ThrowNullPointerException_4() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely(UnreachableCodeElimination.java:230) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", functionNodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = functionNode;
        try {
            removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.EMPTY): False}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): True}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasChildren()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: parent.getType() == Token.TRY
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_ThrowNullPointerException_1() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(125);
        ScriptOrFnNode first = ((ScriptOrFnNode) createInstance("com.google.javascript.rhino.ScriptOrFnNode"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely(UnreachableCodeElimination.java:216) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", nodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = node;
        try {
            removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.EMPTY): False}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_ThrowNullPointerException_5() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(functionNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely(UnreachableCodeElimination.java:230) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", functionNodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = functionNode;
        try {
            removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n.getType() == Token.EMPTY): False}
 * @utbot.executesCondition {@code ((n.getType() == Token.BLOCK && !n.hasChildren())): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.reportCodeChange();
 *  */
    @Test
    public void testRemoveDeadExprStatementSafely_ThrowNullPointerException_3() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        FunctionNode functionNode = ((FunctionNode) createInstance("com.google.javascript.rhino.FunctionNode"));
        functionNode.setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.removeDeadExprStatementSafely(UnreachableCodeElimination.java:230) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class functionNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", functionNodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = functionNode;
        try {
            removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method removeDeadExprStatementSafely(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#maybeAddFinally(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: NodeUtil.maybeAddFinally(tryNode);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRemoveDeadExprStatementSafely_ThrowIllegalStateException() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(120);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", nodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = node;
        try {
            removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#removeDeadExprStatementSafely(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#redeclareVarsInsideBranch(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: NodeUtil.redeclareVarsInsideBranch(n);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRemoveDeadExprStatementSafely_ThrowUnsupportedOperationException() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(118);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method removeDeadExprStatementSafelyMethod = unreachableCodeEliminationClazz.getDeclaredMethod("removeDeadExprStatementSafely", nodeType);
        removeDeadExprStatementSafelyMethod.setAccessible(true);
        java.lang.Object[] removeDeadExprStatementSafelyMethodArguments = new java.lang.Object[1];
        removeDeadExprStatementSafelyMethodArguments[0] = node;
        try {
            removeDeadExprStatementSafelyMethod.invoke(unreachableCodeElimination, removeDeadExprStatementSafelyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region Errors report for removeDeadExprStatementSafely
    
    public void testRemoveDeadExprStatementSafely_errors()
     {
        // Couldn't generate some tests. List of errors:
        // 
        // 6 occurrences of:
        /* Unable to make field private static final java.util.logging.LogManager java.util.logging.LogManager.manager accessible:
        module java.logging does not "opens java.util.logging" to unnamed module @4fcd19b3 */
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.UnreachableCodeElimination.tryRemoveUnconditionalBranching
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method tryRemoveUnconditionalBranching(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#tryRemoveUnconditionalBranching(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): True}
 *  */
    @Test
    public void testTryRemoveUnconditionalBranching_NEqualsNull() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveUnconditionalBranchingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("tryRemoveUnconditionalBranching", nodeType);
        tryRemoveUnconditionalBranchingMethod.setAccessible(true);
        java.lang.Object[] tryRemoveUnconditionalBranchingMethodArguments = new java.lang.Object[1];
        tryRemoveUnconditionalBranchingMethodArguments[0] = ((Object) null);
        Node actual = ((Node) tryRemoveUnconditionalBranchingMethod.invoke(unreachableCodeElimination, tryRemoveUnconditionalBranchingMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#tryRemoveUnconditionalBranching(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): False}
 * @utbot.executesCondition {@code (gNode == null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.ControlFlowGraph#getDirectedGraphNode(java.lang.Object)}
 *  */
    @Test
    public void testTryRemoveUnconditionalBranching_GNodeEqualsNull() throws Exception  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        ControlFlowGraph curCfg = ((ControlFlowGraph) createInstance("com.google.javascript.jscomp.ControlFlowGraph"));
        LinkedHashMap nodes = new LinkedHashMap();
        setField(curCfg, "com.google.javascript.jscomp.graph.LinkedDirectedGraph", "nodes", nodes);
        unreachableCodeElimination.curCfg = curCfg;
        Node node = new Node(0);
        
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveUnconditionalBranchingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("tryRemoveUnconditionalBranching", nodeType);
        tryRemoveUnconditionalBranchingMethod.setAccessible(true);
        java.lang.Object[] tryRemoveUnconditionalBranchingMethodArguments = new java.lang.Object[1];
        tryRemoveUnconditionalBranchingMethodArguments[0] = node;
        Node actual = ((Node) tryRemoveUnconditionalBranchingMethod.invoke(unreachableCodeElimination, tryRemoveUnconditionalBranchingMethodArguments));
        
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
        
        int expectedSourcePosition = ((Integer) getFieldValue(expected, "com.google.javascript.rhino.Node", "sourcePosition"));
        int actualSourcePosition = ((Integer) getFieldValue(actual, "com.google.javascript.rhino.Node", "sourcePosition"));
        assertEquals(expectedSourcePosition, actualSourcePosition);
        
        JSType actualJsType = ((JSType) getFieldValue(actual, "com.google.javascript.rhino.Node", "jsType"));
        assertNull(actualJsType);
        
        Node actualParent = actual.getParent();
        assertNull(actualParent);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tryRemoveUnconditionalBranching(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link UnreachableCodeElimination}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.UnreachableCodeElimination#tryRemoveUnconditionalBranching(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (n == null): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.ControlFlowGraph#getDirectedGraphNode(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: DiGraphNode<Node, Branch> gNode = curCfg.getDirectedGraphNode(n);
 *  */
    @Test
    public void testTryRemoveUnconditionalBranching_ThrowNullPointerException() throws Throwable  {
        UnreachableCodeElimination unreachableCodeElimination = new UnreachableCodeElimination(null, false);
        unreachableCodeElimination.curCfg = null;
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.UnreachableCodeElimination.tryRemoveUnconditionalBranching] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.UnreachableCodeElimination.tryRemoveUnconditionalBranching(UnreachableCodeElimination.java:147) */
        Class unreachableCodeEliminationClazz = Class.forName("com.google.javascript.jscomp.UnreachableCodeElimination");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tryRemoveUnconditionalBranchingMethod = unreachableCodeEliminationClazz.getDeclaredMethod("tryRemoveUnconditionalBranching", nodeType);
        tryRemoveUnconditionalBranchingMethod.setAccessible(true);
        java.lang.Object[] tryRemoveUnconditionalBranchingMethodArguments = new java.lang.Object[1];
        tryRemoveUnconditionalBranchingMethodArguments[0] = node;
        try {
            tryRemoveUnconditionalBranchingMethod.invoke(unreachableCodeElimination, tryRemoveUnconditionalBranchingMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields899556484341400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields899556484341400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass899556484348500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields899556484341400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass899556484348500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields899556484684900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields899556484684900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass899556484689200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields899556484684900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass899556484689200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

