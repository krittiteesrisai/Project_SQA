package com.google.javascript.jscomp;

import org.junit.Test;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.Node;
import java.util.LinkedList;
import com.google.javascript.rhino.InputId;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_FlowSensitiveInlineVariablesTest {
    ///region Test suites for executable com.google.javascript.jscomp.FlowSensitiveInlineVariables.exitScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method exitScope(com.google.javascript.jscomp.NodeTraversal)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#exitScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.returnsFrom {@code public }
 *  */
    @Test
    public void testExitScope_Return() {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        
        flowSensitiveInlineVariables.exitScope(null);
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", nodeType, nodeType, predicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = node;
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Object isEqualToPredicate = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Integer target = 0;
        setField(isEqualToPredicate, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class isEqualToPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", nodeType, nodeType, isEqualToPredicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = node;
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        Object instanceOfPredicate = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        
        Class initialInstanceOfPredicateClazz = ((Class) getFieldValue(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz"));
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class instanceOfPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", nodeType, nodeType, instanceOfPredicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = node;
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
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf(FlowSensitiveInlineVariables.java:463) */
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
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "next", next);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkRightOf(FlowSensitiveInlineVariables.java:464) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkRightOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkRightOf", nodeType, nodeType, predicateType);
        checkRightOfMethod.setAccessible(true);
        java.lang.Object[] checkRightOfMethodArguments = new java.lang.Object[3];
        checkRightOfMethodArguments[0] = node;
        checkRightOfMethodArguments[1] = ((Object) null);
        checkRightOfMethodArguments[2] = ((Object) null);
        try {
            checkRightOfMethod.invoke(null, checkRightOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", numberNodeType, numberNodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = numberNode;
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
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:482) */
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:483) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", numberNodeType, numberNodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = numberNode;
        checkLeftOfMethodArguments[1] = node;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:483) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", numberNodeType, numberNodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = numberNode;
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
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object instanceOfPredicate = createInstance("com.google.common.base.Predicates$InstanceOfPredicate");
        Class clazz = Object.class;
        setField(instanceOfPredicate, "com.google.common.base.Predicates$InstanceOfPredicate", "clazz", clazz);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:484) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class instanceOfPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", stringNodeType, stringNodeType, instanceOfPredicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = stringNode;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:485) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class predicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", numberNodeType, numberNodeType, predicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = numberNode;
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
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent1, "com.google.javascript.rhino.Node", "first", parent);
        Node parent2 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent2, "com.google.javascript.rhino.Node", "first", parent1);
        Node parent3 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent2, "com.google.javascript.rhino.Node", "parent", parent3);
        setField(parent1, "com.google.javascript.rhino.Node", "parent", parent2);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        Object isEqualToPredicate = createInstance("com.google.common.base.Predicates$IsEqualToPredicate");
        Long target = 0L;
        setField(isEqualToPredicate, "com.google.common.base.Predicates$IsEqualToPredicate", "target", target);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.checkLeftOf(FlowSensitiveInlineVariables.java:484) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class isEqualToPredicateType = Class.forName("com.google.common.base.Predicate");
        Method checkLeftOfMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("checkLeftOf", numberNodeType, numberNodeType, isEqualToPredicateType);
        checkLeftOfMethod.setAccessible(true);
        java.lang.Object[] checkLeftOfMethodArguments = new java.lang.Object[3];
        checkLeftOfMethodArguments[0] = numberNode;
        checkLeftOfMethodArguments[1] = ((Object) null);
        checkLeftOfMethodArguments[2] = isEqualToPredicate;
        try {
            checkLeftOfMethod.invoke(null, checkLeftOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
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
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
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
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: t.inGlobalScope()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException() {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope(FlowSensitiveInlineVariables.java:118) */
        flowSensitiveInlineVariables.enterScope(null);
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#enterScope(com.google.javascript.jscomp.NodeTraversal)}
 * @utbot.executesCondition {@code (t.inGlobalScope()): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#inGlobalScope()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.getScope().getVarCount()
 *  */
    @Test
    public void testEnterScope_ThrowNullPointerException_1() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.enterScope(FlowSensitiveInlineVariables.java:123) */
        flowSensitiveInlineVariables.enterScope(nodeTraversal);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FlowSensitiveInlineVariables.visit
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testVisit() {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        
        flowSensitiveInlineVariables.visit(null, null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.FlowSensitiveInlineVariables.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (new NodeTraversal(compiler, this)).traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(FlowSensitiveInlineVariables.java:157) */
        flowSensitiveInlineVariables.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (new NodeTraversal(compiler, this)).traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_1() throws Throwable  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(FlowSensitiveInlineVariables.java:157) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (new NodeTraversal(compiler, this)).traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_2() throws Throwable  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(FlowSensitiveInlineVariables.java:157) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link FlowSensitiveInlineVariables}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.FlowSensitiveInlineVariables#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: (new NodeTraversal(compiler, this)).traverse(root);
 *  */
    @Test
    public void testProcess_ThrowNullPointerException_3() throws Throwable  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-256);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(FlowSensitiveInlineVariables.java:157) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess1() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(numberNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = numberNode1;
        processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
    }
    
    @Test
    public void testProcess2() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
    }
    
    @Test
    public void testProcess3() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next1 = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next1);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = numberNode;
        processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
    }
    
    @Test
    public void testProcess4() throws Exception  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testProcess5() throws Throwable  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", first);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(FlowSensitiveInlineVariables.java:157) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess6() throws Throwable  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(parent, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.formatNodePosition(NodeTraversal.java:322)
            com.google.javascript.jscomp.NodeTraversal.formatNodeContext(NodeTraversal.java:265)
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(FlowSensitiveInlineVariables.java:157) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess7() throws Throwable  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        InputId objectValue = ((InputId) createInstance("com.google.javascript.rhino.InputId"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(next, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", next);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.formatNodePosition(NodeTraversal.java:322)
            com.google.javascript.jscomp.NodeTraversal.formatNodeContext(NodeTraversal.java:265)
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:252)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(FlowSensitiveInlineVariables.java:157) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", stringNodeType, stringNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = stringNode;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testProcess8() throws Throwable  {
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(null);
        Node node = new Node(0);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next1.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(next1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(next, "com.google.javascript.rhino.Node", "next", next1);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", next1);
        
        /* This test fails because method [com.google.javascript.jscomp.FlowSensitiveInlineVariables.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.throwUnexpectedException(NodeTraversal.java:257)
            com.google.javascript.jscomp.NodeTraversal.traverse(NodeTraversal.java:280)
            com.google.javascript.jscomp.FlowSensitiveInlineVariables.process(FlowSensitiveInlineVariables.java:157) */
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = node;
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = RuntimeException.class)
    public void testProcess9() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        next.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(next, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", next);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess10() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object objectValue = createInstance("java.lang.Object");
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = RuntimeException.class)
    public void testProcess11() throws Throwable  {
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        FlowSensitiveInlineVariables flowSensitiveInlineVariables = new FlowSensitiveInlineVariables(compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 53);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class flowSensitiveInlineVariablesClazz = Class.forName("com.google.javascript.jscomp.FlowSensitiveInlineVariables");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = flowSensitiveInlineVariablesClazz.getDeclaredMethod("process", nodeType, nodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = ((Object) null);
        processMethodArguments[1] = numberNode;
        try {
            processMethod.invoke(flowSensitiveInlineVariables, processMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields886455392493500 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields886455392493500.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass886455392500300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields886455392493500.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass886455392500300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields886455392883800 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields886455392883800.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass886455392886300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields886455392883800.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass886455392886300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

