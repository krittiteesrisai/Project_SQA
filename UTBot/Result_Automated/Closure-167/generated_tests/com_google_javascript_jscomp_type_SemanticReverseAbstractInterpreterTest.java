package com.google.javascript.jscomp.type;

import org.junit.Test;
import java.lang.reflect.Method;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.EnumElementType;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import com.google.common.base.Function;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.ModificationVisitor;
import com.google.javascript.rhino.jstype.ParameterizedType;
import com.google.javascript.rhino.jstype.UnknownType;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.Visitor;
import com.google.javascript.jscomp.Scope;
import java.util.Map;
import java.util.Set;
import com.google.javascript.rhino.jstype.SimpleSlot;
import com.google.javascript.rhino.jstype.TemplateType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class com_google_javascript_jscomp_type_SemanticReverseAbstractInterpreterTest {
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method caseEquality(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseEquality(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,com.google.common.base.Function)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return caseEquality(condition.getFirstChild(), condition.getLastChild(), blindScope, merging);
 *  */
    @Test
    public void testCaseEquality_ThrowNullPointerException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = ((Object) null);
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseEquality(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,com.google.common.base.Function)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseEquality(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,com.google.common.base.Function)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return caseEquality(condition.getFirstChild(), condition.getLastChild(), blindScope, merging);
 *  */
    @Test
    public void testCaseEquality_ThrowNullPointerException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(-255);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:295)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = node;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method caseEquality(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseEquality(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,com.google.common.base.Function)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return caseEquality(condition.getFirstChild(), condition.getLastChild(), blindScope, merging);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseEquality_ThrowUnsupportedOperationException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = node;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseEquality(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,com.google.common.base.Function)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return caseEquality(condition.getFirstChild(), condition.getLastChild(), blindScope, merging);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseEquality_ThrowUnsupportedOperationException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = node;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method caseEquality(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function)
    
    @Test
    public void testCaseEquality1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(33);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object flowScopeJoinOp = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlowScopeJoinOp");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.JSType$TypePair cannot be cast to class java.util.List (com.google.javascript.rhino.jstype.JSType$TypePair is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4a90d668; java.util.List is in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.JoinOp$BinaryJoinOp.apply(JoinOp.java:34)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:295)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class flowScopeJoinOpType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, linkedFlowScopeType, flowScopeJoinOpType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = linkedFlowScope;
        caseEqualityMethodArguments[2] = flowScopeJoinOp;
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality2() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        Object liveVariableJoinOp = createInstance("com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableJoinOp");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.JSType$TypePair cannot be cast to class java.util.List (com.google.javascript.rhino.jstype.JSType$TypePair is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @4a90d668; java.util.List is in module java.base of loader 'bootstrap')]
            com.google.javascript.jscomp.LiveVariablesAnalysis$LiveVariableJoinOp.apply(LiveVariablesAnalysis.java:58)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:295)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class liveVariableJoinOpType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, flowScopeType, liveVariableJoinOpType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = liveVariableJoinOp;
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCaseEquality3() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCaseEquality4() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(33);
        setField(last, "com.google.javascript.rhino.Node", "first", last);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = node;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality5() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object flowScopeJoinOp = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlowScopeJoinOp");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1576)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:132)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:275)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class flowScopeJoinOpType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, flowScopeType, flowScopeJoinOpType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = node;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = flowScopeJoinOp;
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality6() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object flowScopeJoinOp = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlowScopeJoinOp");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:144)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:121)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:285)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class flowScopeJoinOpType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, linkedFlowScopeType, flowScopeJoinOpType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = linkedFlowScope;
        caseEqualityMethodArguments[2] = flowScopeJoinOp;
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality7() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first1)).setType(38);
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1570)
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1572)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:132)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:285)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = node;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality8() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first1, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first1)).setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:119)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:285)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality9() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashMap symbols = new LinkedHashMap();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols", symbols);
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$2"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:491)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:121)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:275)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, linkedFlowScopeType, anonymousFunctionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = linkedFlowScope;
        caseEqualityMethodArguments[2] = anonymousFunction;
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality10() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        dirtySymbols.add(null);
        String string = "";
        dirtySymbols.add(string);
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter$6"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:488)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:121)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:275)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, linkedFlowScopeType, anonymousFunctionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = linkedFlowScope;
        caseEqualityMethodArguments[2] = anonymousFunction;
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method caseEquality(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseEquality11() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Object first1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", numberNodeType, linkedFlowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = numberNode;
        caseEqualityMethodArguments[1] = linkedFlowScope;
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseEquality12() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = node;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseEquality13() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(38);
        setField(last, "com.google.javascript.rhino.Node", "first", first1);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[3];
        caseEqualityMethodArguments[0] = node;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method caseEquality(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseEquality(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,com.google.common.base.Function)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSType leftType = getTypeIfRefinable(left, blindScope);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseEquality_ThrowUnsupportedOperationException1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = new Node(38);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", nodeType, nodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = node;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseEquality(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,com.google.common.base.Function)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSType leftType = getTypeIfRefinable(left, blindScope);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseEquality_ThrowUnsupportedOperationException_11() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", numberNodeType, numberNodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = numberNode;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method caseEquality(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseEquality14() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(38);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", numberNodeType, numberNodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = numberNode;
        caseEqualityMethodArguments[1] = numberNode1;
        caseEqualityMethodArguments[2] = ((Object) null);
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method caseEquality(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, com.google.common.base.Function)
    
    @Test(expected = StackOverflowError.class)
    public void testCaseEquality15() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, stringNodeType, linkedFlowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = stringNode;
        caseEqualityMethodArguments[2] = linkedFlowScope;
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality16() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode1)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode1, "com.google.javascript.rhino.Node", "first", first);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:295) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", numberNodeType, numberNodeType, linkedFlowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = numberNode;
        caseEqualityMethodArguments[1] = numberNode1;
        caseEqualityMethodArguments[2] = linkedFlowScope;
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality17() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1576)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:132)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:275) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", numberNodeType, numberNodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = numberNode;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality18() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException] */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", numberNodeType, numberNodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = numberNode;
        caseEqualityMethodArguments[1] = ((Object) null);
        caseEqualityMethodArguments[2] = ((Object) null);
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality19() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:121)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:285) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", numberNodeType, numberNodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = numberNode;
        caseEqualityMethodArguments[1] = stringNode;
        caseEqualityMethodArguments[2] = ((Object) null);
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality20() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:295) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", numberNodeType, numberNodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = numberNode;
        caseEqualityMethodArguments[1] = stringNode;
        caseEqualityMethodArguments[2] = ((Object) null);
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality21() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:295) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", numberNodeType, numberNodeType, flowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = numberNode;
        caseEqualityMethodArguments[1] = stringNode;
        caseEqualityMethodArguments[2] = ((Object) null);
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality22() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashMap symbols = new LinkedHashMap();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols", symbols);
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        Function anonymousFunction = ((Function) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:491)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:121)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:275) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class anonymousFunctionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, stringNodeType, linkedFlowScopeType, anonymousFunctionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = stringNode1;
        caseEqualityMethodArguments[2] = linkedFlowScope;
        caseEqualityMethodArguments[3] = anonymousFunction;
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality23() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        dirtySymbols.add(null);
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        Object internerFunction = createInstance("com.google.common.collect.Interners$InternerFunction");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:488)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:121)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:275) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class internerFunctionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, stringNodeType, linkedFlowScopeType, internerFunctionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = stringNode1;
        caseEqualityMethodArguments[2] = linkedFlowScope;
        caseEqualityMethodArguments[3] = internerFunction;
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCaseEquality24() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        Node node = new Node(0);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        String string = "";
        dirtySymbols.add(string);
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:488)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:121)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:275) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class functionType = Class.forName("com.google.common.base.Function");
        Method caseEqualityMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseEquality", stringNodeType, stringNodeType, linkedFlowScopeType, functionType);
        caseEqualityMethod.setAccessible(true);
        java.lang.Object[] caseEqualityMethodArguments = new java.lang.Object[4];
        caseEqualityMethodArguments[0] = stringNode;
        caseEqualityMethodArguments[1] = node;
        caseEqualityMethodArguments[2] = linkedFlowScope;
        caseEqualityMethodArguments[3] = ((Object) null);
        try {
            caseEqualityMethod.invoke(semanticReverseAbstractInterpreter, caseEqualityMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseTypeOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method caseTypeOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return maybeRestrictName(blindScope, node, type, getRestrictedByTypeOfResult(type, value, resultEqualsValue));}
 *  */
    @Test
    public void testCaseTypeOf_ReturnMaybeRestrictName_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, functionTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = functionType;
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = true;
        caseTypeOfMethodArguments[4] = ((Object) null);
        FlowScope actual = ((FlowScope) caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return maybeRestrictName(blindScope, node, type, getRestrictedByTypeOfResult(type, value, resultEqualsValue));}
 *  */
    @Test
    public void testCaseTypeOf_ReturnMaybeRestrictName() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, jSTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = ((Object) null);
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        FlowScope actual = ((FlowScope) caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return maybeRestrictName(blindScope, node, type, getRestrictedByTypeOfResult(type, value, resultEqualsValue));}
 *  */
    @Test
    public void testCaseTypeOf_ReturnMaybeRestrictName_2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, anonymousFunctionTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = anonymousFunctionType;
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        FlowScope actual = ((FlowScope) caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return maybeRestrictName(blindScope, node, type, getRestrictedByTypeOfResult(type, value, resultEqualsValue));}
 *  */
    @Test
    public void testCaseTypeOf_ReturnMaybeRestrictName_6() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", jsType);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", jsType);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, errorFunctionTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = errorFunctionType;
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        FlowScope actual = ((FlowScope) caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return maybeRestrictName(blindScope, node, type, getRestrictedByTypeOfResult(type, value, resultEqualsValue));}
 *  */
    @Test
    public void testCaseTypeOf_ReturnMaybeRestrictName_7() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        EnumElementType typeOfThis = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, anonymousFunctionTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = anonymousFunctionType;
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        FlowScope actual = ((FlowScope) caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return maybeRestrictName(blindScope, node, type, getRestrictedByTypeOfResult(type, value, resultEqualsValue));}
 *  */
    @Test
    public void testCaseTypeOf_ReturnMaybeRestrictName_5() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        NoObjectType returnType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object typeOfThis = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object kind1 = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(typeOfThis, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, anonymousFunctionTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = anonymousFunctionType;
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        FlowScope actual = ((FlowScope) caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return maybeRestrictName(blindScope, node, type, getRestrictedByTypeOfResult(type, value, resultEqualsValue));}
 *  */
    @Test
    public void testCaseTypeOf_ReturnMaybeRestrictName_3() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "first", first);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        Object returnType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        String string = "";
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, anonymousFunctionTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = anonymousFunctionType;
        caseTypeOfMethodArguments[2] = string;
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        FlowScope actual = ((FlowScope) caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return maybeRestrictName(blindScope, node, type, getRestrictedByTypeOfResult(type, value, resultEqualsValue));}
 *  */
    @Test
    public void testCaseTypeOf_ReturnMaybeRestrictName_4() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        FunctionType returnType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(returnType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, anonymousFunctionTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = anonymousFunctionType;
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        FlowScope actual = ((FlowScope) caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method caseTypeOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCaseTypeOf_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseTypeOf] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:682)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor.caseNoType(ChainableReverseAbstractInterpreter.java:402)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByTypeOfResultVisitor.caseNoType(ChainableReverseAbstractInterpreter.java:361)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult(ChainableReverseAbstractInterpreter.java:677)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseTypeOf(SemanticReverseAbstractInterpreter.java:443) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, noResolvedTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = noResolvedType;
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        try {
            caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseTypeOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String,boolean,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getRestrictedByTypeOfResult(type, value, resultEqualsValue)
 *  */
    @Test
    public void testCaseTypeOf_ThrowNullPointerException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseTypeOf] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeTypeForTypeOf(ChainableReverseAbstractInterpreter.java:695)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedByTypeOfResult(ChainableReverseAbstractInterpreter.java:671)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseTypeOf(SemanticReverseAbstractInterpreter.java:443) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, jSTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = ((Object) null);
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = true;
        caseTypeOfMethodArguments[4] = ((Object) null);
        try {
            caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method caseTypeOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testCaseTypeOf1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", numberNodeType, anonymousFunctionTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = numberNode;
        caseTypeOfMethodArguments[1] = anonymousFunctionType;
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        FlowScope actual = ((FlowScope) caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testCaseTypeOf2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType ownerFunction1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        String className = "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000";
        setField(ownerFunction1, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(ownerFunction, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction1);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class classNameType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, anonymousFunctionTypeType, classNameType, booleanType, linkedFlowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = ((Object) null);
        caseTypeOfMethodArguments[1] = anonymousFunctionType;
        caseTypeOfMethodArguments[2] = className;
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = linkedFlowScope;
        Object actual = caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments);
        
        Object actualCache = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        assertNull(actualCache);
        
        Object actualParent = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertNull(actualParent);
        
        int linkedFlowScopeDepth = ((Integer) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(linkedFlowScopeDepth, actualDepth);
        
        Object actualFlattened = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        assertNull(actualFlattened);
        
        boolean actualFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertFalse(actualFrozen);
        
        Object actualLastSlot = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        assertNull(actualLastSlot);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method caseTypeOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testCaseTypeOf3() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseTypeOf] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:849)
            com.google.javascript.rhino.jstype.FunctionType.isEquivalentTo(FunctionType.java:849)
            com.google.javascript.rhino.jstype.JSType.equals(JSType.java:479)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:394)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseTypeOf(SemanticReverseAbstractInterpreter.java:441) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", numberNodeType, anonymousFunctionTypeType, stringType, booleanType, flowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = numberNode;
        caseTypeOfMethodArguments[1] = anonymousFunctionType;
        caseTypeOfMethodArguments[2] = ((Object) null);
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = ((Object) null);
        try {
            caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method caseTypeOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, java.lang.String, boolean, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(timeout = 1000L)
    public void testCaseTypeOf4() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = new Node(0);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(parameters, "com.google.javascript.rhino.Node", "next", parameters);
        setField(parameters, "com.google.javascript.rhino.Node", "first", parameters);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(parameters, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        Object returnType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "returnType", returnType);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", returnType);
        String string = "\u0000";
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class booleanType = boolean.class;
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseTypeOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseTypeOf", nodeType, anonymousFunctionTypeType, stringType, booleanType, linkedFlowScopeType);
        caseTypeOfMethod.setAccessible(true);
        java.lang.Object[] caseTypeOfMethodArguments = new java.lang.Object[5];
        caseTypeOfMethodArguments[0] = node;
        caseTypeOfMethodArguments[1] = anonymousFunctionType;
        caseTypeOfMethodArguments[2] = string;
        caseTypeOfMethodArguments[3] = false;
        caseTypeOfMethodArguments[4] = linkedFlowScope;
        try {
            caseTypeOfMethod.invoke(semanticReverseAbstractInterpreter, caseTypeOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseNameOrGetProp
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method caseNameOrGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseNameOrGetProp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testCaseNameOrGetProp_ReturnBlindScope() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseNameOrGetPropMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseNameOrGetProp", numberNodeType, flowScopeType, booleanType);
        caseNameOrGetPropMethod.setAccessible(true);
        java.lang.Object[] caseNameOrGetPropMethodArguments = new java.lang.Object[3];
        caseNameOrGetPropMethodArguments[0] = numberNode;
        caseNameOrGetPropMethodArguments[1] = ((Object) null);
        caseNameOrGetPropMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) caseNameOrGetPropMethod.invoke(semanticReverseAbstractInterpreter, caseNameOrGetPropMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseNameOrGetProp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testCaseNameOrGetProp_ReturnBlindScope_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseNameOrGetPropMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseNameOrGetProp", numberNodeType, flowScopeType, booleanType);
        caseNameOrGetPropMethod.setAccessible(true);
        java.lang.Object[] caseNameOrGetPropMethodArguments = new java.lang.Object[3];
        caseNameOrGetPropMethodArguments[0] = numberNode;
        caseNameOrGetPropMethodArguments[1] = ((Object) null);
        caseNameOrGetPropMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) caseNameOrGetPropMethod.invoke(semanticReverseAbstractInterpreter, caseNameOrGetPropMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method caseNameOrGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseNameOrGetProp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSType type = getTypeIfRefinable(name, blindScope);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseNameOrGetProp_ThrowUnsupportedOperationException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = new Node(38);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseNameOrGetPropMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseNameOrGetProp", nodeType, flowScopeType, booleanType);
        caseNameOrGetPropMethod.setAccessible(true);
        java.lang.Object[] caseNameOrGetPropMethodArguments = new java.lang.Object[3];
        caseNameOrGetPropMethodArguments[0] = node;
        caseNameOrGetPropMethodArguments[1] = ((Object) null);
        caseNameOrGetPropMethodArguments[2] = false;
        try {
            caseNameOrGetPropMethod.invoke(semanticReverseAbstractInterpreter, caseNameOrGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseNameOrGetProp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseNameOrGetProp_ThrowUnsupportedOperationException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseNameOrGetPropMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseNameOrGetProp", numberNodeType, flowScopeType, booleanType);
        caseNameOrGetPropMethod.setAccessible(true);
        java.lang.Object[] caseNameOrGetPropMethodArguments = new java.lang.Object[3];
        caseNameOrGetPropMethodArguments[0] = numberNode;
        caseNameOrGetPropMethodArguments[1] = ((Object) null);
        caseNameOrGetPropMethodArguments[2] = false;
        try {
            caseNameOrGetPropMethod.invoke(semanticReverseAbstractInterpreter, caseNameOrGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method caseIn(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (!hasProperty): True}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testCaseIn_NotHasProperty() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", numberNodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = numberNode;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        FlowScope actual = ((FlowScope) caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (!hasProperty): True}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testCaseIn_NotHasProperty_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", nodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = node;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        FlowScope actual = ((FlowScope) caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (!hasProperty): True}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testCaseIn_NotHasProperty_3() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object restrictNullVisitor = createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor");
        setField(restrictNullVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "resultEqualsValue", true);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", stringNodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = stringNode;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        FlowScope actual = ((FlowScope) caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (!hasProperty): True}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testCaseIn_NotHasProperty_2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", stringNodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = stringNode;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        FlowScope actual = ((FlowScope) caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#hasProperty(java.lang.String)}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testCaseIn_ObjectTypeHasProperty() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object restrictUndefinedVisitor = createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor");
        String value = "";
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "value", value);
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "resultEqualsValue", true);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        ParameterizedType implicitPrototypeFallback = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(jsType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", stringNodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = stringNode;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        FlowScope actual = ((FlowScope) caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method caseIn(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCaseIn_ThrowArrayIndexOutOfBoundsException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(restrictNullVisitor, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry", registry);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:63)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:637)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(SemanticReverseAbstractInterpreter.java:477) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", numberNodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = numberNode;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        try {
            caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCaseIn_ThrowArrayIndexOutOfBoundsException_2() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Visitor restrictNullVisitor = ((Visitor) createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2"));
        ClosureReverseAbstractInterpreter this$0 = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(this$0, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "typeRegistry", typeRegistry);
        setField(restrictNullVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2", "this$0", this$0);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        NoType jsType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getNativeType(ChainableReverseAbstractInterpreter.java:682)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2.caseNoType(ChainableReverseAbstractInterpreter.java:298)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$2.caseNoType(ChainableReverseAbstractInterpreter.java:274)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:637)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(SemanticReverseAbstractInterpreter.java:477) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", numberNodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = numberNode;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        try {
            caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCaseIn_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(restrictNullVisitor, "com.google.javascript.rhino.jstype.ModificationVisitor", "registry", registry);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:886)
            com.google.javascript.rhino.jstype.ModificationVisitor.getNativeType(ModificationVisitor.java:217)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:63)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseNoType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.NoType.visit(NoType.java:110)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:100)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:995)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:637)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(SemanticReverseAbstractInterpreter.java:477) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", numberNodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = numberNode;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        try {
            caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = object.getJSType();
 *  */
    @Test
    public void testCaseIn_ThrowNullPointerException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(SemanticReverseAbstractInterpreter.java:476) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", nodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = ((Object) null);
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        try {
            caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (!hasProperty): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getRestrictedWithoutUndefined(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.returnsFrom {@code return blindScope;}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return blindScope;
 *  */
    @Test
    public void testCaseIn_ThrowNullPointerException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object restrictUndefinedVisitor = createInstance("com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor");
        String value = "";
        setField(restrictUndefinedVisitor, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter$RestrictByOneTypeOfResultVisitor", "value", value);
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictUndefinedVisitor", restrictUndefinedVisitor);
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.PrototypeObjectType.getSlot(PrototypeObjectType.java:129)
            com.google.javascript.rhino.jstype.FunctionType.getSlot(FunctionType.java:289)
            com.google.javascript.rhino.jstype.PrototypeObjectType.hasProperty(PrototypeObjectType.java:169)
            com.google.javascript.rhino.jstype.FunctionType.hasProperty(FunctionType.java:66)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(SemanticReverseAbstractInterpreter.java:483) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", nodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = node;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        try {
            caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method caseIn(com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = object.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseIn_ThrowUnsupportedOperationException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = new Node(38);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", nodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = node;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        try {
            caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = object.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseIn_ThrowUnsupportedOperationException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method caseInMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseIn", nodeType, stringType, flowScopeType);
        caseInMethod.setAccessible(true);
        java.lang.Object[] caseInMethodArguments = new java.lang.Object[3];
        caseInMethodArguments[0] = node;
        caseInMethodArguments[1] = ((Object) null);
        caseInMethodArguments[2] = ((Object) null);
        try {
            caseInMethod.invoke(semanticReverseAbstractInterpreter, caseInMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseInstanceOf
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method caseInstanceOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseInstanceOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testCaseInstanceOf_ReturnBlindScope() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseInstanceOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseInstanceOf", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseInstanceOfMethod.setAccessible(true);
        java.lang.Object[] caseInstanceOfMethodArguments = new java.lang.Object[4];
        caseInstanceOfMethodArguments[0] = numberNode;
        caseInstanceOfMethodArguments[1] = ((Object) null);
        caseInstanceOfMethodArguments[2] = ((Object) null);
        caseInstanceOfMethodArguments[3] = false;
        FlowScope actual = ((FlowScope) caseInstanceOfMethod.invoke(semanticReverseAbstractInterpreter, caseInstanceOfMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseInstanceOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testCaseInstanceOf_ReturnBlindScope_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseInstanceOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseInstanceOf", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseInstanceOfMethod.setAccessible(true);
        java.lang.Object[] caseInstanceOfMethodArguments = new java.lang.Object[4];
        caseInstanceOfMethodArguments[0] = numberNode;
        caseInstanceOfMethodArguments[1] = ((Object) null);
        caseInstanceOfMethodArguments[2] = ((Object) null);
        caseInstanceOfMethodArguments[3] = false;
        FlowScope actual = ((FlowScope) caseInstanceOfMethod.invoke(semanticReverseAbstractInterpreter, caseInstanceOfMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method caseInstanceOf(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseInstanceOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSType leftType = getTypeIfRefinable(left, blindScope);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseInstanceOf_ThrowUnsupportedOperationException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = new Node(38);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseInstanceOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseInstanceOf", nodeType, nodeType, flowScopeType, booleanType);
        caseInstanceOfMethod.setAccessible(true);
        java.lang.Object[] caseInstanceOfMethodArguments = new java.lang.Object[4];
        caseInstanceOfMethodArguments[0] = node;
        caseInstanceOfMethodArguments[1] = ((Object) null);
        caseInstanceOfMethodArguments[2] = ((Object) null);
        caseInstanceOfMethodArguments[3] = false;
        try {
            caseInstanceOfMethod.invoke(semanticReverseAbstractInterpreter, caseInstanceOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseInstanceOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseInstanceOf_ThrowUnsupportedOperationException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseInstanceOfMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseInstanceOf", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseInstanceOfMethod.setAccessible(true);
        java.lang.Object[] caseInstanceOfMethodArguments = new java.lang.Object[4];
        caseInstanceOfMethodArguments[0] = numberNode;
        caseInstanceOfMethodArguments[1] = ((Object) null);
        caseInstanceOfMethodArguments[2] = ((Object) null);
        caseInstanceOfMethodArguments[3] = false;
        try {
            caseInstanceOfMethod.invoke(semanticReverseAbstractInterpreter, caseInstanceOfMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeRestrictName(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (restrictedType != null): True}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testMaybeRestrictName_RestrictedTypeNotEqualsNull_4() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, noResolvedTypeType, noResolvedTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = noResolvedType;
        maybeRestrictNameMethodArguments[3] = noResolvedType;
        FlowScope actual = ((FlowScope) maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (restrictedType != null): False}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testMaybeRestrictName_RestrictedTypeEqualsNull() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = ((Object) null);
        FlowScope actual = ((FlowScope) maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (restrictedType != null): True}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testMaybeRestrictName_RestrictedTypeNotEqualsNull_3() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, anonymousFunctionTypeType, anonymousFunctionTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = anonymousFunctionType;
        maybeRestrictNameMethodArguments[3] = anonymousFunctionType;
        FlowScope actual = ((FlowScope) maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (restrictedType != null): True}
 * @utbot.returnsFrom {@code return informed;}
 *  */
    @Test
    public void testMaybeRestrictName_RestrictedTypeNotEqualsNull() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", linkedFlowScopeType, numberNodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = linkedFlowScope;
        maybeRestrictNameMethodArguments[1] = numberNode;
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = enumElementType;
        Object actual = maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache", flattened);
        
        Object expectedCache = getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        Object actualCache = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        Scope actualCacheFunctionScope = ((Scope) getFieldValue(actualCache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "functionScope"));
        assertNull(actualCacheFunctionScope);
        
        Object actualCacheLinkedEquivalent = getFieldValue(actualCache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "linkedEquivalent");
        assertNull(actualCacheLinkedEquivalent);
        
        Map actualCacheSymbols = ((Map) getFieldValue(actualCache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols"));
        assertNull(actualCacheSymbols);
        
        Set actualCacheDirtySymbols = ((Set) getFieldValue(actualCache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols"));
        assertNull(actualCacheDirtySymbols);
        
        Object actualParent = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertNull(actualParent);
        
        int expectedDepth = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        Object actualFlattened = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        assertNull(actualFlattened);
        
        boolean actualFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertFalse(actualFrozen);
        
        Object actualLastSlot = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        assertNull(actualLastSlot);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (restrictedType != null): True}
 * @utbot.returnsFrom {@code return informed;}
 *  */
    @Test
    public void testMaybeRestrictName_RestrictedTypeNotEqualsNull_2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = new Node(42);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", linkedFlowScopeType, nodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = linkedFlowScope;
        maybeRestrictNameMethodArguments[1] = node;
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = enumElementType;
        Object actual = maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        Object actualCache = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        assertNull(actualCache);
        
        Object expectedParent = getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        Object actualParent = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertTrue(deepEquals(expectedParent, actualParent));
        Object actualParentParent = getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertNull(actualParentParent);
        
        int expectedParentDepth = ((Integer) getFieldValue(expectedParent, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualParentDepth = ((Integer) getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(expectedParentDepth, actualParentDepth);
        
        Object actualParentFlattened = getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        assertNull(actualParentFlattened);
        
        boolean actualParentFrozen = ((Boolean) getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertTrue(actualParentFrozen);
        
        Object actualParentLastSlot = getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        assertNull(actualParentLastSlot);
        
        int expectedDepth = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        assertTrue(deepEquals(expected, actual));
        boolean actualFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertFalse(actualFrozen);
        
        assertTrue(deepEquals(expected, actual));
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (restrictedType != null): True}
 * @utbot.returnsFrom {@code return informed;}
 *  */
    @Test
    public void testMaybeRestrictName_RestrictedTypeNotEqualsNull_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        setField(flattened, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", linkedFlowScopeType, stringNodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = linkedFlowScope;
        maybeRestrictNameMethodArguments[1] = stringNode;
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = enumElementType;
        Object actual = maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache", flattened);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 1);
        Object lastSlot = createInstance("com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot");
        setField(lastSlot, "com.google.javascript.rhino.jstype.SimpleSlot", "type", enumElementType);
        setField(lastSlot, "com.google.javascript.rhino.jstype.SimpleSlot", "inferred", true);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot", lastSlot);
        
        Object expectedCache = getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        Object actualCache = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        Scope actualCacheFunctionScope = ((Scope) getFieldValue(actualCache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "functionScope"));
        assertNull(actualCacheFunctionScope);
        
        Object actualCacheLinkedEquivalent = getFieldValue(actualCache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "linkedEquivalent");
        assertNull(actualCacheLinkedEquivalent);
        
        Map actualCacheSymbols = ((Map) getFieldValue(actualCache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "symbols"));
        assertNull(actualCacheSymbols);
        
        Set expectedCacheDirtySymbols = ((Set) getFieldValue(expectedCache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols"));
        Set actualCacheDirtySymbols = ((Set) getFieldValue(actualCache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols"));
        assertTrue(deepEquals(expectedCacheDirtySymbols, actualCacheDirtySymbols));
        
        Object actualParent = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertNull(actualParent);
        
        int expectedDepth = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        Object actualFlattened = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        assertNull(actualFlattened);
        
        boolean actualFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertFalse(actualFrozen);
        
        Object expectedLastSlot = getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        Object actualLastSlot = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        Object actualLastSlotParent = getFieldValue(actualLastSlot, "com.google.javascript.jscomp.LinkedFlowScope$LinkedFlowSlot", "parent");
        assertNull(actualLastSlotParent);
        
        String actualLastSlotName = (((SimpleSlot) actualLastSlot)).getName();
        assertNull(actualLastSlotName);
        
        JSType expectedLastSlotType = (((SimpleSlot) expectedLastSlot)).getType();
        JSType actualLastSlotType = (((SimpleSlot) actualLastSlot)).getType();
        // com.google.javascript.rhino.jstype.JSType has overridden equals method
        assertEquals(expectedLastSlotType, actualLastSlotType);
        
        boolean actualLastSlotInferred = ((Boolean) getFieldValue(actualLastSlot, "com.google.javascript.rhino.jstype.SimpleSlot", "inferred"));
        assertTrue(actualLastSlotInferred);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeRestrictName(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException_9() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, noObjectTypeType, noObjectTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = noObjectType;
        maybeRestrictNameMethodArguments[3] = anonymousFunctionType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = templateType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException_2() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, errorFunctionTypeType, errorFunctionTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = errorFunctionType;
        maybeRestrictNameMethodArguments[3] = anonymousFunctionType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, functionTypeType, functionTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = functionType;
        maybeRestrictNameMethodArguments[3] = anonymousFunctionType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException_3() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, functionTypeType, functionTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = functionType;
        maybeRestrictNameMethodArguments[3] = anonymousFunctionType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException_4() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, errorFunctionTypeType, errorFunctionTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = errorFunctionType;
        maybeRestrictNameMethodArguments[3] = anonymousFunctionType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException_5() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType functionType1 = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoObjectType typeOfThis = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(functionType1, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, functionTypeType, functionTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = functionType;
        maybeRestrictNameMethodArguments[3] = functionType1;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException_8() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        FunctionType typeOfThis = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, functionTypeType, functionTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = functionType;
        maybeRestrictNameMethodArguments[3] = anonymousFunctionType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException_6() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoType typeOfThis = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "typeOfThis", typeOfThis);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, anonymousFunctionTypeType, anonymousFunctionTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = anonymousFunctionType;
        maybeRestrictNameMethodArguments[3] = functionType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictName_ThrowNullPointerException_7() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictName(SemanticReverseAbstractInterpreter.java:395) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", flowScopeType, nodeType, errorFunctionTypeType, errorFunctionTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = ((Object) null);
        maybeRestrictNameMethodArguments[1] = ((Object) null);
        maybeRestrictNameMethodArguments[2] = errorFunctionType;
        maybeRestrictNameMethodArguments[3] = anonymousFunctionType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maybeRestrictName(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNameInScope(informed, node, restrictedType);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMaybeRestrictName_ThrowIllegalStateException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", linkedFlowScopeType, numberNodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = linkedFlowScope;
        maybeRestrictNameMethodArguments[1] = numberNode;
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = enumElementType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: declareNameInScope(informed, node, restrictedType);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeRestrictName_ThrowUnsupportedOperationException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Node node = new Node(38);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", linkedFlowScopeType, nodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = linkedFlowScope;
        maybeRestrictNameMethodArguments[1] = node;
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = enumElementType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: declareNameInScope(informed, node, restrictedType);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeRestrictName_ThrowUnsupportedOperationException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", linkedFlowScopeType, nodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = linkedFlowScope;
        maybeRestrictNameMethodArguments[1] = node;
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = enumElementType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNameInScope(informed, node, restrictedType);
 *  */
    @Test(expected = NullPointerException.class)
    public void testMaybeRestrictName_ThrowNullPointerException_10() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", linkedFlowScopeType, nodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = linkedFlowScope;
        maybeRestrictNameMethodArguments[1] = node;
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = enumElementType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictName(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNameInScope(informed, node, restrictedType);
 *  */
    @Test(expected = NullPointerException.class)
    public void testMaybeRestrictName_ThrowNullPointerException_11() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictNameMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictName", linkedFlowScopeType, nodeType, jSTypeType, jSTypeType);
        maybeRestrictNameMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictNameMethodArguments = new java.lang.Object[4];
        maybeRestrictNameMethodArguments[0] = linkedFlowScope;
        maybeRestrictNameMethodArguments[1] = node;
        maybeRestrictNameMethodArguments[2] = ((Object) null);
        maybeRestrictNameMethodArguments[3] = enumElementType;
        try {
            maybeRestrictNameMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#findUniqueRefinedSlot(com.google.javascript.jscomp.type.FlowScope)}
 *  */
    @Test
    public void testCaseAndOrMaybeShortCircuiting_FlowScopeLeftScopeInitializedByFirstPreciserScopeKnowingConditionOutcome() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrMaybeShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrMaybeShortCircuiting", numberNodeType, numberNodeType, linkedFlowScopeType, booleanType);
        caseAndOrMaybeShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrMaybeShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrMaybeShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrMaybeShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[2] = linkedFlowScope;
        caseAndOrMaybeShortCircuitingMethodArguments[3] = true;
        Object actual = caseAndOrMaybeShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrMaybeShortCircuitingMethodArguments);
        
        Object actualCache = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        assertNull(actualCache);
        
        Object actualParent = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertNull(actualParent);
        
        int linkedFlowScopeDepth = ((Integer) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(linkedFlowScopeDepth, actualDepth);
        
        Object actualFlattened = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        assertNull(actualFlattened);
        
        boolean actualFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertFalse(actualFrozen);
        
        Object actualLastSlot = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        assertNull(actualLastSlot);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> leftVar = leftScope.findUniqueRefinedSlot(blindScope);
 *  */
    @Test
    public void testCaseAndOrMaybeShortCircuiting_ThrowNullPointerException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrMaybeShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrMaybeShortCircuiting", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseAndOrMaybeShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrMaybeShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrMaybeShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrMaybeShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[3] = true;
        try {
            caseAndOrMaybeShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrMaybeShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> leftVar = leftScope.findUniqueRefinedSlot(blindScope);
 *  */
    @Test
    public void testCaseAndOrMaybeShortCircuiting_ThrowNullPointerException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(17);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrMaybeShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrMaybeShortCircuiting", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseAndOrMaybeShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrMaybeShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrMaybeShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrMaybeShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[3] = true;
        try {
            caseAndOrMaybeShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrMaybeShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> leftVar = leftScope.findUniqueRefinedSlot(blindScope);
 *  */
    @Test
    public void testCaseAndOrMaybeShortCircuiting_ThrowNullPointerException_2() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrMaybeShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrMaybeShortCircuiting", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseAndOrMaybeShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrMaybeShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrMaybeShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrMaybeShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[3] = false;
        try {
            caseAndOrMaybeShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrMaybeShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> leftVar = leftScope.findUniqueRefinedSlot(blindScope);
 *  */
    @Test
    public void testCaseAndOrMaybeShortCircuiting_ThrowNullPointerException_3() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrMaybeShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrMaybeShortCircuiting", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseAndOrMaybeShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrMaybeShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrMaybeShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrMaybeShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[3] = true;
        try {
            caseAndOrMaybeShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrMaybeShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> leftVar = leftScope.findUniqueRefinedSlot(blindScope);
 *  */
    @Test
    public void testCaseAndOrMaybeShortCircuiting_ThrowNullPointerException_4() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrMaybeShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrMaybeShortCircuiting", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseAndOrMaybeShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrMaybeShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrMaybeShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrMaybeShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[3] = false;
        try {
            caseAndOrMaybeShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrMaybeShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> leftVar = leftScope.findUniqueRefinedSlot(blindScope);
 *  */
    @Test
    public void testCaseAndOrMaybeShortCircuiting_ThrowNullPointerException_5() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrMaybeShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrMaybeShortCircuiting", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseAndOrMaybeShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrMaybeShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrMaybeShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrMaybeShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[3] = false;
        try {
            caseAndOrMaybeShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrMaybeShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> leftVar = leftScope.findUniqueRefinedSlot(blindScope);
 *  */
    @Test
    public void testCaseAndOrMaybeShortCircuiting_ThrowNullPointerException_6() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrMaybeShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrMaybeShortCircuiting", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseAndOrMaybeShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrMaybeShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrMaybeShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrMaybeShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[3] = false;
        try {
            caseAndOrMaybeShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrMaybeShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> leftVar = leftScope.findUniqueRefinedSlot(blindScope);
 *  */
    @Test
    public void testCaseAndOrMaybeShortCircuiting_ThrowNullPointerException_7() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrMaybeShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrMaybeShortCircuiting", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseAndOrMaybeShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrMaybeShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrMaybeShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrMaybeShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrMaybeShortCircuitingMethodArguments[3] = false;
        try {
            caseAndOrMaybeShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrMaybeShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method caseAndOrNotShortCircuiting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrNotShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSType leftType = getTypeIfRefinable(left, blindScope);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseAndOrNotShortCircuiting_ThrowUnsupportedOperationException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = new Node(38);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrNotShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrNotShortCircuiting", nodeType, nodeType, flowScopeType, booleanType);
        caseAndOrNotShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrNotShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrNotShortCircuitingMethodArguments[0] = node;
        caseAndOrNotShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrNotShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrNotShortCircuitingMethodArguments[3] = false;
        try {
            caseAndOrNotShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrNotShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrNotShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCaseAndOrNotShortCircuiting_ThrowUnsupportedOperationException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method caseAndOrNotShortCircuitingMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("caseAndOrNotShortCircuiting", numberNodeType, numberNodeType, flowScopeType, booleanType);
        caseAndOrNotShortCircuitingMethod.setAccessible(true);
        java.lang.Object[] caseAndOrNotShortCircuitingMethodArguments = new java.lang.Object[4];
        caseAndOrNotShortCircuitingMethodArguments[0] = numberNode;
        caseAndOrNotShortCircuitingMethodArguments[1] = ((Object) null);
        caseAndOrNotShortCircuitingMethodArguments[2] = ((Object) null);
        caseAndOrNotShortCircuitingMethodArguments[3] = false;
        try {
            caseAndOrNotShortCircuitingMethod.invoke(semanticReverseAbstractInterpreter, caseAndOrNotShortCircuitingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictTwoNames
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, boolean, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, boolean, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): True}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testMaybeRestrictTwoNames_BooleanShouldRefineRightInitializedByRightIsRefineableAndRestrictedRightTypeEqualsNull() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", flowScopeType, nodeType, booleanType, jSTypeType, nodeType, booleanType, jSTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[1] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[4] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[5] = false;
        maybeRestrictTwoNamesMethodArguments[6] = ((Object) null);
        FlowScope actual = ((FlowScope) maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): True}
 * @utbot.returnsFrom {@code return blindScope;}
 *  */
    @Test
    public void testMaybeRestrictTwoNames_ShouldRefineLeftOrShouldRefineRight() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", flowScopeType, nodeType, booleanType, jSTypeType, nodeType, booleanType, jSTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[1] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[4] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = ((Object) null);
        FlowScope actual = ((FlowScope) maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): False}
 * @utbot.executesCondition {@code (shouldRefineLeft): True}
 * @utbot.executesCondition {@code (shouldRefineRight): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return informed;}
 *  */
    @Test
    public void testMaybeRestrictTwoNames_NotShouldRefineRight() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", linkedFlowScopeType, numberNodeType, booleanType, enumElementTypeType, numberNodeType, booleanType, enumElementTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = linkedFlowScope;
        maybeRestrictTwoNamesMethodArguments[1] = numberNode;
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = enumElementType;
        maybeRestrictTwoNamesMethodArguments[4] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = ((Object) null);
        Object actual = maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        Object actualCache = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        assertNull(actualCache);
        
        Object expectedParent = getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        Object actualParent = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertTrue(deepEquals(expectedParent, actualParent));
        Object actualParentParent = getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertNull(actualParentParent);
        
        int expectedParentDepth = ((Integer) getFieldValue(expectedParent, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualParentDepth = ((Integer) getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(expectedParentDepth, actualParentDepth);
        
        Object actualParentFlattened = getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        assertNull(actualParentFlattened);
        
        boolean actualParentFrozen = ((Boolean) getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertTrue(actualParentFrozen);
        
        Object actualParentLastSlot = getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        assertNull(actualParentLastSlot);
        
        int expectedDepth = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        assertTrue(deepEquals(expected, actual));
        boolean actualFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertFalse(actualFrozen);
        
        assertTrue(deepEquals(expected, actual));
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): True}
 * @utbot.executesCondition {@code (shouldRefineLeft): False}
 * @utbot.executesCondition {@code (shouldRefineRight): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#declareNameInScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return informed;}
 *  */
    @Test
    public void testMaybeRestrictTwoNames_ShouldRefineRight() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = new Node(42);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", linkedFlowScopeType, nodeType, booleanType, jSTypeType, nodeType, booleanType, jSTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = linkedFlowScope;
        maybeRestrictTwoNamesMethodArguments[1] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[4] = node;
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = enumElementType;
        Object actual = maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        Object actualCache = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "cache");
        assertNull(actualCache);
        
        Object expectedParent = getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        Object actualParent = getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertTrue(deepEquals(expectedParent, actualParent));
        Object actualParentParent = getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "parent");
        assertNull(actualParentParent);
        
        int expectedParentDepth = ((Integer) getFieldValue(expectedParent, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualParentDepth = ((Integer) getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(expectedParentDepth, actualParentDepth);
        
        Object actualParentFlattened = getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "flattened");
        assertNull(actualParentFlattened);
        
        boolean actualParentFrozen = ((Boolean) getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertTrue(actualParentFrozen);
        
        Object actualParentLastSlot = getFieldValue(actualParent, "com.google.javascript.jscomp.LinkedFlowScope", "lastSlot");
        assertNull(actualParentLastSlot);
        
        int expectedDepth = ((Integer) getFieldValue(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        int actualDepth = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "depth"));
        assertEquals(expectedDepth, actualDepth);
        
        assertTrue(deepEquals(expected, actual));
        boolean actualFrozen = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        assertFalse(actualFrozen);
        
        assertTrue(deepEquals(expected, actual));
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, boolean, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, boolean, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictTwoNames_ThrowNullPointerException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictTwoNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictTwoNames(SemanticReverseAbstractInterpreter.java:414) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", flowScopeType, nodeType, booleanType, enumElementTypeType, nodeType, booleanType, enumElementTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[1] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = enumElementType;
        maybeRestrictTwoNamesMethodArguments[4] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = enumElementType;
        try {
            maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictTwoNames_ThrowNullPointerException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictTwoNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictTwoNames(SemanticReverseAbstractInterpreter.java:414) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", flowScopeType, nodeType, booleanType, jSTypeType, nodeType, booleanType, jSTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[1] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[4] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = enumElementType;
        try {
            maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope informed = blindScope.createChildFlowScope();
 *  */
    @Test
    public void testMaybeRestrictTwoNames_ThrowNullPointerException_2() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictTwoNames] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.maybeRestrictTwoNames(SemanticReverseAbstractInterpreter.java:414) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", flowScopeType, nodeType, booleanType, jSTypeType, nodeType, booleanType, jSTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[1] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[2] = false;
        maybeRestrictTwoNamesMethodArguments[3] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[4] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = enumElementType;
        try {
            maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, boolean, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.Node, boolean, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): False}
 * @utbot.executesCondition {@code (shouldRefineLeft): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: declareNameInScope(informed, left, restrictedLeftType);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testMaybeRestrictTwoNames_ThrowIllegalStateException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", linkedFlowScopeType, numberNodeType, booleanType, enumElementTypeType, numberNodeType, booleanType, enumElementTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = linkedFlowScope;
        maybeRestrictTwoNamesMethodArguments[1] = numberNode;
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = enumElementType;
        maybeRestrictTwoNamesMethodArguments[4] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = enumElementType;
        try {
            maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): False}
 * @utbot.executesCondition {@code (shouldRefineLeft): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: declareNameInScope(informed, left, restrictedLeftType);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeRestrictTwoNames_ThrowUnsupportedOperationException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = new Node(38);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", linkedFlowScopeType, nodeType, booleanType, enumElementTypeType, nodeType, booleanType, enumElementTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = linkedFlowScope;
        maybeRestrictTwoNamesMethodArguments[1] = node;
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = enumElementType;
        maybeRestrictTwoNamesMethodArguments[4] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = enumElementType;
        try {
            maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): True}
 * @utbot.executesCondition {@code (shouldRefineLeft): False}
 * @utbot.executesCondition {@code (shouldRefineRight): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: declareNameInScope(informed, right, restrictedRightType);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeRestrictTwoNames_ThrowUnsupportedOperationException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Node node = new Node(38);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", linkedFlowScopeType, nodeType, booleanType, jSTypeType, nodeType, booleanType, jSTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = linkedFlowScope;
        maybeRestrictTwoNamesMethodArguments[1] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[2] = false;
        maybeRestrictTwoNamesMethodArguments[3] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[4] = node;
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = enumElementType;
        try {
            maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): True}
 * @utbot.executesCondition {@code (shouldRefineLeft): False}
 * @utbot.executesCondition {@code (shouldRefineRight): True}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: declareNameInScope(informed, right, restrictedRightType);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testMaybeRestrictTwoNames_ThrowUnsupportedOperationException_2() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", linkedFlowScopeType, nodeType, booleanType, jSTypeType, nodeType, booleanType, jSTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = linkedFlowScope;
        maybeRestrictTwoNamesMethodArguments[1] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[4] = node;
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = enumElementType;
        try {
            maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#maybeRestrictTwoNames(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.Node,boolean,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (shouldRefineLeft || shouldRefineRight): False}
 * @utbot.executesCondition {@code (shouldRefineLeft): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declareNameInScope(informed, left, restrictedLeftType);
 *  */
    @Test(expected = NullPointerException.class)
    public void testMaybeRestrictTwoNames_ThrowNullPointerException_3() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method maybeRestrictTwoNamesMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("maybeRestrictTwoNames", linkedFlowScopeType, nodeType, booleanType, enumElementTypeType, nodeType, booleanType, enumElementTypeType);
        maybeRestrictTwoNamesMethod.setAccessible(true);
        java.lang.Object[] maybeRestrictTwoNamesMethodArguments = new java.lang.Object[7];
        maybeRestrictTwoNamesMethodArguments[0] = linkedFlowScope;
        maybeRestrictTwoNamesMethodArguments[1] = node;
        maybeRestrictTwoNamesMethodArguments[2] = true;
        maybeRestrictTwoNamesMethodArguments[3] = enumElementType;
        maybeRestrictTwoNamesMethodArguments[4] = ((Object) null);
        maybeRestrictTwoNamesMethodArguments[5] = true;
        maybeRestrictTwoNamesMethodArguments[6] = ((Object) null);
        try {
            maybeRestrictTwoNamesMethod.invoke(semanticReverseAbstractInterpreter, maybeRestrictTwoNamesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#nextPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)} once
    /// return from: {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (outcome): False}
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_SwitchOperatorTokenCasedefault() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(14);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_SwitchOperatorTokenCasedefault_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (outcome && condition.getFirstChild().isString()): False}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_OutcomeAndConditionGetFirstChildIsString() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (outcome && condition.getFirstChild().isString()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_OutcomeAndConditionGetFirstChildIsString_1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (outcome): False}
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_SwitchOperatorTokenCasedefault_2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter nextLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(17);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseNameOrGetProp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.returnsFrom {@code return caseNameOrGetProp(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_SemanticReverseAbstractInterpreterCaseNameOrGetProp() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseInstanceOf(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.returnsFrom {@code return caseInstanceOf(condition.getFirstChild(), condition.getLastChild(), blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_NodeGetLastChild() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (outcome): False}
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.returnsFrom {@code return nextPreciserScopeKnowingConditionOutcome(condition, blindScope, outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_NotOutcome() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter nextLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "nextLink", nextLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(15);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (condition.getFirstChild()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#firstPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.returnsFrom {@code return firstPreciserScopeKnowingConditionOutcome(condition.getFirstChild(), blindScope, !outcome);}
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_NotConditionGetFirstChild() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int operatorToken = condition.getType();
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:128) */
        semanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (operatorToken == Token.CASE): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: left = condition.getParent().getFirstChild();
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(111);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:138) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (outcome && condition.getFirstChild().isString()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: outcome && condition.getFirstChild().isString()
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_3() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:246) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: condition.getFirstChild().getNext()
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_8() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:224) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (operatorToken == Token.CASE): False}
 * @utbot.executesCondition {@code (left.isTypeOf() && right.isString()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isTypeOf()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: right.isTypeOf() && left.isString()
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_6() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(12);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:150) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (operatorToken == Token.CASE): False}
 * @utbot.executesCondition {@code (left.isTypeOf() && right.isString()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.isTypeOf() && right.isString()
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_7() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(12);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:147) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (operatorToken == Token.CASE): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.isTypeOf() && right.isString()
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_5() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(12);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:147) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (operatorToken == Token.CASE): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: left.isTypeOf() && right.isString()
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_2() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(111);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:147) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (outcome && condition.getFirstChild().isString()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseIn(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.jscomp.type.FlowScope)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return caseIn(condition.getLastChild(), condition.getFirstChild().getString(), blindScope);
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_4() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(SemanticReverseAbstractInterpreter.java:476)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:247) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (!outcome): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return caseAndOrMaybeShortCircuiting(condition.getFirstChild(), condition.getLastChild(), blindScope, false);
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_9() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:184) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (outcome): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseAndOrMaybeShortCircuiting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return caseAndOrMaybeShortCircuiting(condition.getFirstChild(), condition.getLastChild(), blindScope, true);
 *  */
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowNullPointerException_10() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        SemanticReverseAbstractInterpreter firstLink = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrMaybeShortCircuiting(SemanticReverseAbstractInterpreter.java:358)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:175) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseNameOrGetProp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return caseNameOrGetProp(condition, blindScope, outcome);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException_1() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link SemanticReverseAbstractInterpreter}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.executesCondition {@code (outcome): True}
 * @utbot.invokes com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter#caseEquality(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,com.google.common.base.Function)
 * @utbot.activatesSwitch {@code switch(operatorToken) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: return caseEquality(condition, blindScope, INEQ);
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome_ThrowUnsupportedOperationException() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(16);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome1() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome2() throws Exception  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        FlowScope actual = ((FlowScope) getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome3() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first1.setType(42);
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1576)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:132)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(SemanticReverseAbstractInterpreter.java:310)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:181) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", stringNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome4() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first1);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:99)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(SemanticReverseAbstractInterpreter.java:317)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:181) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, linkedFlowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = false;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome5() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ClosureReverseAbstractInterpreter firstLink = ((ClosureReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "firstLink", firstLink);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(ClosureReverseAbstractInterpreter.java:208)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.firstPreciserScopeKnowingConditionOutcome(ChainableReverseAbstractInterpreter.java:99)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(SemanticReverseAbstractInterpreter.java:325)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:172) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, linkedFlowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome6() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(51);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getTypeOfThis(FunctionType.java:1028)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:99)
            com.google.javascript.rhino.jstype.ModificationVisitor.caseFunctionType(ModificationVisitor.java:53)
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:995)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutNull(ChainableReverseAbstractInterpreter.java:637)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(SemanticReverseAbstractInterpreter.java:477)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:247) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", stringNodeType, linkedFlowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome7() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        ModificationVisitor restrictNullVisitor = ((ModificationVisitor) createInstance("com.google.javascript.rhino.jstype.ModificationVisitor"));
        setField(semanticReverseAbstractInterpreter, "com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter", "restrictNullVisitor", restrictNullVisitor);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(51);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(40);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.visit(FunctionType.java:995)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getRestrictedWithoutUndefined(ChainableReverseAbstractInterpreter.java:630)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseIn(SemanticReverseAbstractInterpreter.java:478)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:247) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", stringNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome8() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(17);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:488)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:121)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:275)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseEquality(SemanticReverseAbstractInterpreter.java:268)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:236) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", nodeType, linkedFlowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = node;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetPreciserScopeKnowingConditionOutcome9() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(101);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) first)).setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "last", last);
        Object linkedFlowScope = createInstance("com.google.javascript.jscomp.LinkedFlowScope");
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        LinkedHashSet dirtySymbols = new LinkedHashSet();
        dirtySymbols.add(null);
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "dirtySymbols", dirtySymbols);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        
        /* This test fails because method [com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.getSlot(LinkedFlowScope.java:488)
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:152)
            com.google.javascript.jscomp.type.ChainableReverseAbstractInterpreter.getTypeIfRefinable(ChainableReverseAbstractInterpreter.java:121)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.caseAndOrNotShortCircuiting(SemanticReverseAbstractInterpreter.java:310)
            com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter.getPreciserScopeKnowingConditionOutcome(SemanticReverseAbstractInterpreter.java:172) */
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", stringNodeType, linkedFlowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = stringNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = linkedFlowScope;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPreciserScopeKnowingConditionOutcome10() throws Throwable  {
        SemanticReverseAbstractInterpreter semanticReverseAbstractInterpreter = ((SemanticReverseAbstractInterpreter) createInstance("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(51);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class semanticReverseAbstractInterpreterClazz = Class.forName("com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method getPreciserScopeKnowingConditionOutcomeMethod = semanticReverseAbstractInterpreterClazz.getDeclaredMethod("getPreciserScopeKnowingConditionOutcome", numberNodeType, flowScopeType, booleanType);
        getPreciserScopeKnowingConditionOutcomeMethod.setAccessible(true);
        java.lang.Object[] getPreciserScopeKnowingConditionOutcomeMethodArguments = new java.lang.Object[3];
        getPreciserScopeKnowingConditionOutcomeMethodArguments[0] = numberNode;
        getPreciserScopeKnowingConditionOutcomeMethodArguments[1] = ((Object) null);
        getPreciserScopeKnowingConditionOutcomeMethodArguments[2] = true;
        try {
            getPreciserScopeKnowingConditionOutcomeMethod.invoke(semanticReverseAbstractInterpreter, getPreciserScopeKnowingConditionOutcomeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields917579498739700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields917579498739700.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass917579498748900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields917579498739700.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass917579498748900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields917579502457300 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields917579502457300.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass917579502461300 = (java.lang.reflect.Field[]) methodForGetDeclaredFields917579502457300.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass917579502461300).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

