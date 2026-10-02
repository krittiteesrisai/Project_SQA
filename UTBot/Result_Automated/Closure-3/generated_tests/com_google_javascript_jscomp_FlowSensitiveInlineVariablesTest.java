package com.google.javascript.jscomp;

import org.junit.Test;
import java.util.LinkedList;
import java.util.ArrayDeque;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import java.util.LinkedHashMap;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_FlowSensitiveInlineVariablesTest {
    ///region Test suites for executable com.google.javascript.jscomp.FlowSensitiveInlineVariables.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = ((FlowSensitiveInlineVariables) createInstance("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        
        flowSensitiveInlineVariables.visit(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testEnterScope_TInGlobalScope() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = ((FlowSensitiveInlineVariables) createInstance("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        flowSensitiveInlineVariables.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: t.getScope().getVarCount()
 *  */
    @Test
    public void testEnterScope_ThrowArrayIndexOutOfBoundsException() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = ((FlowSensitiveInlineVariables) createInstance("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        TypedScopeCreator scopeCreator = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(scopeCreator, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:206)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:604)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope(FlowSensitiveInlineVariables.java:132) */
        flowSensitiveInlineVariables.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: t.getScope().getVarCount()
 *  */
    @Test
    public void testEnterScope_ThrowArrayIndexOutOfBoundsException_1() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = ((FlowSensitiveInlineVariables) createInstance("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        scopeRoots.add(numberNode);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        LinkedHashMap scopes1 = new LinkedHashMap();
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "scopes", scopes1);
        TypedScopeCreator delegate = ((TypedScopeCreator) createInstance("com.google.javascript.jscomp.TypedScopeCreator"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(delegate, "com.google.javascript.jscomp.TypedScopeCreator", "typeRegistry", typeRegistry);
        setField(scopeCreator, "com.google.javascript.jscomp.MemoizedScopeCreator", "delegate", delegate);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope] produces [java.lang.ArrayIndexOutOfBoundsException: Index 46 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.jscomp.TypedScopeCreator.createScope(TypedScopeCreator.java:206)
            com.google.javascript.jscomp.MemoizedScopeCreator.createScope(MemoizedScopeCreator.java:82)
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:604)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope(FlowSensitiveInlineVariables.java:132) */
        flowSensitiveInlineVariables.enterScope(nodeTraversal);
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.inGlobalScope()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = ((FlowSensitiveInlineVariables) createInstance("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope(FlowSensitiveInlineVariables.java:127) */
        flowSensitiveInlineVariables.enterScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.getScope().getVarCount()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_1() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = ((FlowSensitiveInlineVariables) createInstance("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope(FlowSensitiveInlineVariables.java:132) */
        flowSensitiveInlineVariables.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method enterScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: t.getScope().getVarCount()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnterScope_ThrowIllegalStateException() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = ((FlowSensitiveInlineVariables) createInstance("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
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
        
        flowSensitiveInlineVariables.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method checkRightOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests return from: {@code return false;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkRightOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCheckRightOf_ReturnFalse() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException  {
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", nodeType, nodeType, predicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = ((Object) null);
        checkRightOfMethodArguments[1] = ((Object) null);
        checkRightOfMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) checkRightOfMethod.invoke(null, checkRightOfMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkRightOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n; p != expressionRoot; p = p.getParent())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCheckRightOf_IterateForLoop() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", numberNodeType, numberNodeType, predicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = numberNode;
        checkRightOfMethodArguments[1] = ((Object) null);
        checkRightOfMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) checkRightOfMethod.invoke(null, checkRightOfMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkRightOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n; p != expressionRoot; p = p.getParent())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCheckRightOf_NotPredicateApply() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        Object isEqualToPredicate = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Integer target = 0;
        setField(isEqualToPredicate, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class isEqualToPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", numberNodeType, numberNodeType, isEqualToPredicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = numberNode;
        checkRightOfMethodArguments[1] = ((Object) null);
        checkRightOfMethodArguments[2] = isEqualToPredicate;
        boolean actual = ((Boolean) checkRightOfMethod.invoke(null, checkRightOfMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method checkRightOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkRightOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n; p != expressionRoot; p = p.getParent())} once
 *  */
    @Test
    public void testCheckRightOf_PredicateApply() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        Object instanceOfPredicate = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        
        Class initialInstanceOfPredicateClazz = ((Class) getFieldValue(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class instanceOfPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", numberNodeType, numberNodeType, instanceOfPredicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = numberNode;
        checkRightOfMethodArguments[1] = ((Object) null);
        checkRightOfMethodArguments[2] = instanceOfPredicate;
        boolean actual = ((Boolean) checkRightOfMethod.invoke(null, checkRightOfMethodArguments));
        
        assertTrue(actual);
        
        Class finalInstanceOfPredicateClazz = ((Class) getFieldValue(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        
        assertFalse(initialInstanceOfPredicateClazz == finalInstanceOfPredicateClazz);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkRightOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkRightOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n; p != expressionRoot; p = p.getParent())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node cur = p.getNext(); cur != null; cur = cur.getNext())
 *  */
    @Test
    public void testCheckRightOf_ThrowNullPointerException() throws Throwable  {
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf(FlowSensitiveInlineVariables.java:504) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", nodeType, nodeType, predicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = ((Object) null);
        checkRightOfMethodArguments[1] = node;
        checkRightOfMethodArguments[2] = ((Object) null);
        try {
            checkRightOfMethod.invoke(null, checkRightOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkRightOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n; p != expressionRoot; p = p.getParent())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: predicate.apply(cur)
 *  */
    @Test
    public void testCheckRightOf_ThrowNullPointerException_1() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf(FlowSensitiveInlineVariables.java:505) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", numberNodeType, numberNodeType, predicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = numberNode;
        checkRightOfMethodArguments[1] = ((Object) null);
        checkRightOfMethodArguments[2] = ((Object) null);
        try {
            checkRightOfMethod.invoke(null, checkRightOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkRightOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate)
    
    @Test
    public void testCheckRightOf1() throws Exception  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent3, "com.google.javascript.rhino.Node", "next", next);
        setField(parent2, "com.google.javascript.rhino.Node", "parent", parent3);
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object isEqualToPredicate = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Double target = 0.0;
        setField(isEqualToPredicate, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class isEqualToPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", numberNodeType, numberNodeType, isEqualToPredicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = numberNode;
        checkRightOfMethodArguments[1] = ((Object) null);
        checkRightOfMethodArguments[2] = isEqualToPredicate;
        boolean actual = ((Boolean) checkRightOfMethod.invoke(null, checkRightOfMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkRightOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate)
    
    @Test
    public void testCheckRightOf2() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent3, "com.google.javascript.rhino.Node", "next", next);
        setField(parent2, "com.google.javascript.rhino.Node", "parent", parent3);
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object andPredicate = createInstance("com.google.common.base.Predicates$AndPredicate");
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf] produces [java.lang.NullPointerException]
            com.google.common.base.Predicates$AndPredicate.apply(Predicates.java:342)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf(FlowSensitiveInlineVariables.java:505) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class andPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", numberNodeType, numberNodeType, andPredicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = numberNode;
        checkRightOfMethodArguments[1] = ((Object) null);
        checkRightOfMethodArguments[2] = andPredicate;
        try {
            checkRightOfMethod.invoke(null, checkRightOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method checkRightOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate)
    
    @Test(timeout = 1000L)
    public void testCheckRightOf3() throws Throwable  {
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent3, "com.google.javascript.rhino.Node", "next", parent3);
        setField(parent2, "com.google.javascript.rhino.Node", "parent", parent3);
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object isEqualToPredicate = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        ArrayList target = new ArrayList();
        setField(isEqualToPredicate, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class isEqualToPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", numberNodeType, numberNodeType, isEqualToPredicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = numberNode;
        checkRightOfMethodArguments[1] = ((Object) null);
        checkRightOfMethodArguments[2] = isEqualToPredicate;
        try {
            checkRightOfMethod.invoke(null, checkRightOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FlowSensitiveInlineVariables.exitScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testExitScope_Return() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = ((FlowSensitiveInlineVariables) createInstance("com.google.javascript.jscomp.FlowSensitiveInlineVariables"));
        
        flowSensitiveInlineVariables.exitScope(null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkLeftOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkLeftOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCheckLeftOf_ReturnFalse() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", nodeType, nodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = node;
        checkLeftOfMethodArguments[1] = ((Object) null);
        checkLeftOfMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkLeftOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n.getParent(); p != expressionRoot; p = p.getParent())} once
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testCheckLeftOf_ReturnFalse_1() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent1, "com.google.javascript.rhino.Node", "first", parent);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", stringNodeType, stringNodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = stringNode;
        checkLeftOfMethodArguments[1] = parent1;
        checkLeftOfMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkLeftOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n.getParent(); p != expressionRoot; p = p.getParent())} once
 *  */
    @Test
    public void testCheckLeftOf_PredicateApply() throws Exception  {
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent1, "com.google.javascript.rhino.Node", "next", next);
        setField(parent1, "com.google.javascript.rhino.Node", "first", parent1);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object instanceOfPredicate = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        
        Class initialInstanceOfPredicateClazz = ((Class) getFieldValue(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class instanceOfPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", stringNodeType, stringNodeType, instanceOfPredicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = stringNode;
        checkLeftOfMethodArguments[1] = ((Object) null);
        checkLeftOfMethodArguments[2] = instanceOfPredicate;
        boolean actual = ((Boolean) checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments));
        
        assertTrue(actual);
        
        Class finalInstanceOfPredicateClazz = ((Class) getFieldValue(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        
        assertFalse(initialInstanceOfPredicateClazz == finalInstanceOfPredicateClazz);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkLeftOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkLeftOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node p = n.getParent(); p != expressionRoot; p = p.getParent())
 *  */
    @Test
    public void testCheckLeftOf_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:523) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", nodeType, nodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = ((Object) null);
        checkLeftOfMethodArguments[1] = ((Object) null);
        checkLeftOfMethodArguments[2] = ((Object) null);
        try {
            checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkLeftOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n.getParent(); p != expressionRoot; p = p.getParent())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node cur = p.getParent().getFirstChild(); cur != p; cur = cur.getNext())
 *  */
    @Test
    public void testCheckLeftOf_ThrowNullPointerException_1() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node node1 = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:524) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", nodeType, nodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = node;
        checkLeftOfMethodArguments[1] = node1;
        checkLeftOfMethodArguments[2] = ((Object) null);
        try {
            checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkLeftOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n.getParent(); p != expressionRoot; p = p.getParent())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node cur = p.getParent().getFirstChild(); cur != p; cur = cur.getNext())
 *  */
    @Test
    public void testCheckLeftOf_ThrowNullPointerException_2() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:524) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", nodeType, nodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = node;
        checkLeftOfMethodArguments[1] = ((Object) null);
        checkLeftOfMethodArguments[2] = ((Object) null);
        try {
            checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkLeftOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n.getParent(); p != expressionRoot; p = p.getParent())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return true;
 *  */
    @Test
    public void testCheckLeftOf_ThrowNullPointerException_4() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object instanceOfPredicate = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:525) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class instanceOfPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", nodeType, nodeType, instanceOfPredicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = node;
        checkLeftOfMethodArguments[1] = ((Object) null);
        checkLeftOfMethodArguments[2] = instanceOfPredicate;
        try {
            checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkLeftOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n.getParent(); p != expressionRoot; p = p.getParent())} once
 * @utbot.throwsException {@link java.lang.NullPointerException} when: predicate.apply(cur)
 *  */
    @Test
    public void testCheckLeftOf_ThrowNullPointerException_3() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:526) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", nodeType, nodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = node;
        checkLeftOfMethodArguments[1] = ((Object) null);
        checkLeftOfMethodArguments[2] = ((Object) null);
        try {
            checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#checkLeftOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.common.base.Predicate)}
 * @utbot.iterates iterate the loop {@code for(Node p = n.getParent(); p != expressionRoot; p = p.getParent())} 3 times
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node cur = p.getParent().getFirstChild(); cur != p; cur = cur.getNext())
 *  */
    @Test
    public void testCheckLeftOf_ThrowNullPointerException_5() throws Throwable  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent1, "com.google.javascript.rhino.Node", "first", parent);
        Node parent2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent2, "com.google.javascript.rhino.Node", "first", parent1);
        Node parent3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent2, "com.google.javascript.rhino.Node", "parent", parent3);
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object isEqualToPredicate = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Long target = 0L;
        setField(isEqualToPredicate, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:525) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class isEqualToPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", nodeType, nodeType, isEqualToPredicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = node;
        checkLeftOfMethodArguments[1] = ((Object) null);
        checkLeftOfMethodArguments[2] = isEqualToPredicate;
        try {
            checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkLeftOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.common.base.Predicate)
    
    @Test
    public void testCheckLeftOf1() throws Exception  {
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "first", parent);
        setField(next, "com.google.javascript.rhino.Node", "parent", parent);
        setField(parent, "com.google.javascript.rhino.Node", "next", next);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", parent);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(parent, "com.google.javascript.rhino.Node", "parent", next);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        Object instanceOfPredicate = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        
        Class initialInstanceOfPredicateClazz = ((Class) getFieldValue(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class instanceOfPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", nodeType, nodeType, instanceOfPredicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = node;
        checkLeftOfMethodArguments[1] = ((Object) null);
        checkLeftOfMethodArguments[2] = instanceOfPredicate;
        boolean actual = ((Boolean) checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments));
        
        assertTrue(actual);
        
        Class finalInstanceOfPredicateClazz = ((Class) getFieldValue(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        
        assertFalse(initialInstanceOfPredicateClazz == finalInstanceOfPredicateClazz);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields879995738790100 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields879995738790100.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass879995738799600 = (java.lang.reflect.Field[]) methodForGetDeclaredFields879995738790100.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass879995738799600).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields879995739738900 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields879995739738900.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass879995739744900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields879995739738900.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass879995739744900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

