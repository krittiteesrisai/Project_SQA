package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.Node;
import java.lang.reflect.Method;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.TemplatizedType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.jstype.VoidType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.TemplateTypeMap;
import java.util.Map;
import java.util.LinkedHashMap;
import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.jstype.NoType;
import com.google.javascript.rhino.jstype.BooleanLiteralSet;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.jscomp.Scope.Var;
import java.lang.reflect.Constructor;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.JSDocInfo;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.stream.BaseStream;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;

public final class com_google_javascript_jscomp_TypeInferenceTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverse(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(n.getType())}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testTraverse_NodeGetType() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(59);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseMethod = typeInferenceClazz.getDeclaredMethod("traverse", numberNodeType, flowScopeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[2];
        traverseMethodArguments[0] = numberNode;
        traverseMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseMethod.invoke(typeInference, traverseMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverse(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#getTypeOfThis()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.THIS}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.setJSType(scope.getTypeOfThis());
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:361) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseMethod = typeInferenceClazz.getDeclaredMethod("traverse", numberNodeType, flowScopeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[2];
        traverseMethodArguments[0] = numberNode;
        traverseMethodArguments[1] = ((Object) null);
        try {
            traverseMethod.invoke(typeInference, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTraverse_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseMethod = typeInferenceClazz.getDeclaredMethod("traverse", nodeType, flowScopeType);
        traverseMethod.setAccessible(true);
        java.lang.Object[] traverseMethodArguments = new java.lang.Object[2];
        traverseMethodArguments[0] = ((Object) null);
        traverseMethodArguments[1] = ((Object) null);
        try {
            traverseMethod.invoke(typeInference, traverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseOr
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseOr(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1367)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", nodeType, flowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = ((Object) null);
        traverseOrMethodArguments[1] = ((Object) null);
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", numberNodeType, flowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = numberNode;
        traverseOrMethodArguments[1] = ((Object) null);
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", numberNodeType, linkedFlowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = numberNode;
        traverseOrMethodArguments[1] = linkedFlowScope;
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseOr(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, false);
 *  */
    @Test
    public void testTraverseOr_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseOr] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseOrMethod = typeInferenceClazz.getDeclaredMethod("traverseOr", numberNodeType, linkedFlowScopeType);
        traverseOrMethod.setAccessible(true);
        java.lang.Object[] traverseOrMethodArguments = new java.lang.Object[2];
        traverseOrMethodArguments[0] = numberNode;
        traverseOrMethodArguments[1] = linkedFlowScope;
        try {
            traverseOrMethod.invoke(typeInference, traverseOrMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.dereferencePointer
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testDereferencePointer_ReturnScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", numberNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = numberNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testDereferencePointer_ReturnScope_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", numberNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = numberNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testDereferencePointer_ReturnScope_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", stringNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = stringNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: n.isQualifiedName()
 *  */
    @Test
    public void testDereferencePointer_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:1288) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", nodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = ((Object) null);
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (n.isQualifiedName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType narrowed = type.restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testDereferencePointer_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.dereferencePointer] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.dereferencePointer(TypeInference.java:1290) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", numberNodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = numberNode;
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method dereferencePointer(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#dereferencePointer(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: n.isQualifiedName()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testDereferencePointer_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method dereferencePointerMethod = typeInferenceClazz.getDeclaredMethod("dereferencePointer", nodeType, flowScopeType);
        dereferencePointerMethod.setAccessible(true);
        java.lang.Object[] dereferencePointerMethodArguments = new java.lang.Object[2];
        dereferencePointerMethodArguments[0] = node;
        dereferencePointerMethodArguments[1] = ((Object) null);
        try {
            dereferencePointerMethod.invoke(typeInference, dereferencePointerMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getPropertyType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getPropertyType(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(qualifiedName);
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:1311) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, stringNodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = stringNode;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(qualifiedName);
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:1311) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, stringNodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = stringNode;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String qualifiedName = n.getQualifiedName();
 *  */
    @Test
    public void testGetPropertyType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getPropertyType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getPropertyType(TypeInference.java:1310) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = ((Object) null);
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method getPropertyType(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getPropertyType(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = n.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testGetPropertyType_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method getPropertyTypeMethod = typeInferenceClazz.getDeclaredMethod("getPropertyType", jSTypeType, stringType, nodeType, flowScopeType);
        getPropertyTypeMethod.setAccessible(true);
        java.lang.Object[] getPropertyTypeMethodArguments = new java.lang.Object[4];
        getPropertyTypeMethodArguments[0] = ((Object) null);
        getPropertyTypeMethodArguments[1] = ((Object) null);
        getPropertyTypeMethodArguments[2] = node;
        getPropertyTypeMethodArguments[3] = ((Object) null);
        try {
            getPropertyTypeMethod.invoke(typeInference, getPropertyTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.inferPropertyTypesToMatchConstraint
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (constraint == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_ConstraintEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", enumElementTypeType, enumElementTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = enumElementType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = ((Object) null);
        inferPropertyTypesToMatchConstraintMethod.invoke(typeInference, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_TypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", jSTypeType, jSTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = ((Object) null);
        inferPropertyTypesToMatchConstraintMethodArguments[1] = ((Object) null);
        inferPropertyTypesToMatchConstraintMethod.invoke(typeInference, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (constraint == null): False}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_ConstraintNotEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        String className = "";
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", noResolvedTypeType, noResolvedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = noResolvedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = enumElementType;
        inferPropertyTypesToMatchConstraintMethod.invoke(typeInference, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (constraint == null): False}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_ConstraintNotEqualsNull_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        FunctionType ownerFunction = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(noResolvedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", noResolvedTypeType, noResolvedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = noResolvedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = enumElementType;
        inferPropertyTypesToMatchConstraintMethod.invoke(typeInference, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferPropertyTypesToMatchConstraint(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (type == null): False}
 * @utbot.executesCondition {@code (constraint == null): False}
 *  */
    @Test
    public void testInferPropertyTypesToMatchConstraint_ConstraintNotEqualsNull_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        NoObjectType referencedType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        String className = "";
        setField(referencedType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method inferPropertyTypesToMatchConstraintMethod = typeInferenceClazz.getDeclaredMethod("inferPropertyTypesToMatchConstraint", templatizedTypeType, templatizedTypeType);
        inferPropertyTypesToMatchConstraintMethod.setAccessible(true);
        java.lang.Object[] inferPropertyTypesToMatchConstraintMethodArguments = new java.lang.Object[2];
        inferPropertyTypesToMatchConstraintMethodArguments[0] = templatizedType;
        inferPropertyTypesToMatchConstraintMethodArguments[1] = enumElementType;
        inferPropertyTypesToMatchConstraintMethod.invoke(typeInference, inferPropertyTypesToMatchConstraintMethodArguments);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.createInitialEstimateLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createInitialEstimateLattice()
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#createInitialEstimateLattice()}
 * @utbot.returnsFrom {@code return bottomScope;}
 *  */
    @Test
    public void testCreateInitialEstimateLattice_ReturnBottomScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope bottomScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "bottomScope", bottomScope);
        
        LinkedFlowScope actual = ((LinkedFlowScope) typeInference.createInitialEstimateLattice());
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(bottomScope, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.branchedFlowThrough
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method branchedFlowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#branchedFlowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeInference#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeInference#getCfg()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: List<DiGraphEdge<Node, Branch>> branchEdges = getCfg().getOutEdges(source);
 *  */
    @Test
    public void testBranchedFlowThrough_ThrowNullPointerException() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.branchedFlowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.branchedFlowThrough(TypeInference.java:203) */
        typeInference.branchedFlowThrough(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 *  */
    @Test
    public void testUpdateScopeForTypeChange_NodeGetType() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, numberNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = numberNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(left.getType())
 *  */
    @Test
    public void testUpdateScopeForTypeChange_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:522) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = syntacticScope.getVar(varName);
 *  */
    @Test
    public void testUpdateScopeForTypeChange_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:525) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, stringNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = stringNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (qualifiedName != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensurePropertyDefined(left, resultType);
 *  */
    @Test
    public void testUpdateScopeForTypeChange_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:568)
            com.google.javascript.jscomp.TypeInference.updateScopeForTypeChange(TypeInference.java:559) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, stringNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = stringNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String varName = left.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateScopeForTypeChange_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = node;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.activatesSwitch {@code switch(left.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qualifiedName = left.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testUpdateScopeForTypeChange_ThrowUnsupportedOperationException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, stringNodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = stringNode;
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = templateType;
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateScopeForTypeChange(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(resultType);
 *  */
    @Test(expected = NullPointerException.class)
    public void testUpdateScopeForTypeChange_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method updateScopeForTypeChangeMethod = typeInferenceClazz.getDeclaredMethod("updateScopeForTypeChange", flowScopeType, nodeType, jSTypeType, jSTypeType);
        updateScopeForTypeChangeMethod.setAccessible(true);
        java.lang.Object[] updateScopeForTypeChangeMethodArguments = new java.lang.Object[4];
        updateScopeForTypeChangeMethodArguments[0] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[1] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[2] = ((Object) null);
        updateScopeForTypeChangeMethodArguments[3] = ((Object) null);
        try {
            updateScopeForTypeChangeMethod.invoke(typeInference, updateScopeForTypeChangeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDefined
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDefined(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: nodeType.restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 1]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:939)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:572) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:568) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = ((Object) null);
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:568) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", numberNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = numberNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType nodeType = getJSType(obj);
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:570) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", numberNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = numberNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: nodeType.restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDefined_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDefined] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDefined(TypeInference.java:572) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", nodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = node;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensurePropertyDefined(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsurePropertyDefined_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", numberNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = numberNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDefined(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsurePropertyDefined_ThrowIllegalStateException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensurePropertyDefinedMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDefined", numberNodeType, jSTypeType);
        ensurePropertyDefinedMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDefinedMethodArguments = new java.lang.Object[2];
        ensurePropertyDefinedMethodArguments[0] = numberNode;
        ensurePropertyDefinedMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDefinedMethod.invoke(typeInference, ensurePropertyDefinedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDeclared(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        VoidType jsType = ((VoidType) createInstance("com.google.javascript.rhino.jstype.VoidType"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.ArrayIndexOutOfBoundsException: Index 43 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:939)
            com.google.javascript.rhino.jstype.VoidType.restrictByNotNullOrUndefined(VoidType.java:59)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", stringNodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = stringNode;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", nodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = ((Object) null);
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", numberNodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = numberNode;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclared(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getJSType(getprop.getFirstChild()).restrictByNotNullOrUndefined()
 *  */
    @Test
    public void testEnsurePropertyDeclared_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclared(TypeInference.java:626) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensurePropertyDeclaredMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclared", numberNodeType);
        ensurePropertyDeclaredMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredMethodArguments = new java.lang.Object[1];
        ensurePropertyDeclaredMethodArguments[0] = numberNode;
        try {
            ensurePropertyDeclaredMethod.invoke(typeInference, ensurePropertyDeclaredMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Collections.emptyMap();}
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ReturnCollectionsEmptyMap() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", noObjectTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = noObjectType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        Map actual = ((Map) inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments));
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Collections.emptyMap();}
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ReturnCollectionsEmptyMap_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.ImmutableList$SubList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = functionType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        Map actual = ((Map) inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments));
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return Collections.emptyMap();}
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ReturnCollectionsEmptyMap_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.Lists$StringAsImmutableList");
        String string = "";
        setField(templateKeys, "com.google.common.collect.Lists$StringAsImmutableList", "string", string);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = functionType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        Map actual = ((Map) inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments));
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getTemplateTypeMap()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1014) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = ((Object) null);
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        try {
            inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1014) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", noObjectTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = noObjectType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        try {
            inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.TemplateTypeMap#getTemplateKeys()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplateTypesFromParameters_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1014) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", noObjectTypeType, nodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = noObjectType;
        inferTemplateTypesFromParametersMethodArguments[1] = ((Object) null);
        try {
            inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    @Test
    public void testInferTemplateTypesFromParameters1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        ImmutableList templateKeys = ((ImmutableList) createInstance("com.google.common.collect.CartesianList$1"));
        Object this$0 = createInstance("com.google.common.collect.CartesianList");
        Object axes = createInstance("com.google.common.collect.RegularImmutableList");
        setField(this$0, "com.google.common.collect.CartesianList", "axes", axes);
        setField(templateKeys, "com.google.common.collect.CartesianList$1", "this$0", this$0);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(functionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", functionTypeType, stringNodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = functionType;
        inferTemplateTypesFromParametersMethodArguments[1] = stringNode;
        Map actual = ((Map) inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments));
        
        Map expected = new LinkedHashMap();
        
        assertTrue(deepEquals(expected, actual));
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferTemplateTypesFromParameters(com.google.javascript.rhino.jstype.FunctionType, com.google.javascript.rhino.Node)
    
    @Test
    public void testInferTemplateTypesFromParameters2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        ImmutableList templateKeys = ((ImmutableList) createInstance("com.google.common.collect.CartesianList$1"));
        Object this$0 = createInstance("com.google.common.collect.CartesianList");
        Object axes = createInstance("com.google.common.collect.SingletonImmutableList");
        setField(this$0, "com.google.common.collect.CartesianList", "axes", axes);
        setField(templateKeys, "com.google.common.collect.CartesianList$1", "this$0", this$0);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGet(NodeUtil.java:1582)
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1021) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method inferTemplateTypesFromParametersMethod = typeInferenceClazz.getDeclaredMethod("inferTemplateTypesFromParameters", anonymousFunctionTypeType, stringNodeType);
        inferTemplateTypesFromParametersMethod.setAccessible(true);
        java.lang.Object[] inferTemplateTypesFromParametersMethodArguments = new java.lang.Object[2];
        inferTemplateTypesFromParametersMethodArguments[0] = anonymousFunctionType;
        inferTemplateTypesFromParametersMethodArguments[1] = stringNode;
        try {
            inferTemplateTypesFromParametersMethod.invoke(typeInference, inferTemplateTypesFromParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateTypeOfParameters
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateTypeOfParameters(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfParameters(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int childCount = n.getChildCount();
 *  */
    @Test
    public void testUpdateTypeOfParameters_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:983) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = ((Object) null);
        updateTypeOfParametersMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfParameters(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node iParameter: fnType.getParameters())
 *  */
    @Test
    public void testUpdateTypeOfParameters_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:984) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", numberNodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = numberNode;
        updateTypeOfParametersMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateTypeOfParameters(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node iParameter: fnType.getParameters())
 *  */
    @Test
    public void testUpdateTypeOfParameters_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateTypeOfParameters] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:984) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = node;
        updateTypeOfParametersMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method updateTypeOfParameters(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testUpdateTypeOfParameters1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, noTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = node;
        updateTypeOfParametersMethodArguments[1] = noType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParameters2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", numberNodeType, noTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = numberNode;
        updateTypeOfParametersMethodArguments[1] = noType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParameters3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, noTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = node;
        updateTypeOfParametersMethodArguments[1] = noType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParameters4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, noTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = node;
        updateTypeOfParametersMethodArguments[1] = noType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    
    @Test
    public void testUpdateTypeOfParameters5() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", nodeType, noTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = node;
        updateTypeOfParametersMethodArguments[1] = noType;
        updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method updateTypeOfParameters(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test(timeout = 1000L)
    public void testUpdateTypeOfParameters6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(next, "com.google.javascript.rhino.Node", "next", next);
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method updateTypeOfParametersMethod = typeInferenceClazz.getDeclaredMethod("updateTypeOfParameters", numberNodeType, functionTypeType);
        updateTypeOfParametersMethod.setAccessible(true);
        java.lang.Object[] updateTypeOfParametersMethodArguments = new java.lang.Object[2];
        updateTypeOfParametersMethodArguments[0] = numberNode;
        updateTypeOfParametersMethodArguments[1] = ((Object) null);
        try {
            updateTypeOfParametersMethod.invoke(typeInference, updateTypeOfParametersMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.resolvedTemplateType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method resolvedTemplateType(java.util.Map, com.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#resolvedTemplateType(java.util.Map,com.google.javascript.rhino.jstype.TemplateType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link java.util.Map#get(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType previous = map.get(template);
 *  */
    @Test
    public void testResolvedTemplateType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.resolvedTemplateType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1127) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class mapType = Class.forName("java.util.Map");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.TemplateType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method resolvedTemplateTypeMethod = typeInferenceClazz.getDeclaredMethod("resolvedTemplateType", mapType, templateTypeType, jSTypeType);
        resolvedTemplateTypeMethod.setAccessible(true);
        java.lang.Object[] resolvedTemplateTypeMethodArguments = new java.lang.Object[3];
        resolvedTemplateTypeMethodArguments[0] = ((Object) null);
        resolvedTemplateTypeMethodArguments[1] = ((Object) null);
        resolvedTemplateTypeMethodArguments[2] = ((Object) null);
        try {
            resolvedTemplateTypeMethod.invoke(typeInference, resolvedTemplateTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method resolvedTemplateType(java.util.Map, com.google.javascript.rhino.jstype.TemplateType, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testResolvedTemplateType1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.resolvedTemplateType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1128) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.TemplateType");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method resolvedTemplateTypeMethod = typeInferenceClazz.getDeclaredMethod("resolvedTemplateType", linkedHashMapType, templateTypeType, jSTypeType);
        resolvedTemplateTypeMethod.setAccessible(true);
        java.lang.Object[] resolvedTemplateTypeMethodArguments = new java.lang.Object[3];
        resolvedTemplateTypeMethodArguments[0] = linkedHashMap;
        resolvedTemplateTypeMethodArguments[1] = ((Object) null);
        resolvedTemplateTypeMethodArguments[2] = ((Object) null);
        try {
            resolvedTemplateTypeMethod.invoke(typeInference, resolvedTemplateTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.returnsFrom {@code return new BooleanOutcomePair(BooleanLiteralSet.BOTH, BooleanLiteralSet.BOTH, flowScope, flowScope);}
 *  */
    @Test
    public void testNewBooleanOutcomePair_JsTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", jSTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = ((Object) null);
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        Object actual = newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:939)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1540) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noResolvedTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noResolvedType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1540) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noResolvedTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noResolvedType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: registry.getNativeType(BOOLEAN_TYPE).isSubtype(jsType)
 *  */
    @Test
    public void testNewBooleanOutcomePair_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1540) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noResolvedTypeType, flowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noResolvedType;
        newBooleanOutcomePairMethodArguments[1] = ((Object) null);
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method newBooleanOutcomePair(com.google.javascript.rhino.jstype.JSType, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testNewBooleanOutcomePair1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[11];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[0] = ((JSType) enumElementType);
        nativeTypes[1] = ((JSType) enumElementType);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[2] = ((JSType) anonymousFunctionType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.checkEquivalenceHelper(JSType.java:611)
            com.google.javascript.rhino.jstype.JSType.isEquivalentTo(JSType.java:544)
            com.google.javascript.rhino.jstype.JSType.isSubtypeHelper(JSType.java:1247)
            com.google.javascript.rhino.jstype.FunctionType.isSubtype(FunctionType.java:1016)
            com.google.javascript.jscomp.TypeInference.newBooleanOutcomePair(TypeInference.java:1540) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method newBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("newBooleanOutcomePair", noTypeType, linkedFlowScopeType);
        newBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] newBooleanOutcomePairMethodArguments = new java.lang.Object[2];
        newBooleanOutcomePairMethodArguments[0] = noType;
        newBooleanOutcomePairMethodArguments[1] = linkedFlowScope;
        try {
            newBooleanOutcomePairMethod.invoke(typeInference, newBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testTraverseWithinShortCircuitingBinOp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", nodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = ((Object) null);
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(152);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(155);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(4);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        Object actual = traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.BOTH;
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(22);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:388)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(120);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:491)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:447)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1241)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:423)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(28);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:352)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(52);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:419)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(98);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:816)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:330)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(85);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:398)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(93);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:777)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:347)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(130);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:428)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(30);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1194)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:342)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(37);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:852)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:316)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(32);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:403)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1436) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1436) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1433) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1433) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1436) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp24() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(100);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:417)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1436) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseWithinShortCircuitingBinOp25() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(101);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:417)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1433) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, linkedFlowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseWithinShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseWithinShortCircuitingBinOp26() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseWithinShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseWithinShortCircuitingBinOp", numberNodeType, flowScopeType);
        traverseWithinShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseWithinShortCircuitingBinOpMethodArguments = new java.lang.Object[2];
        traverseWithinShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseWithinShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        try {
            traverseWithinShortCircuitingBinOpMethod.invoke(typeInference, traverseWithinShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseArrayLiteral
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseArrayLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseArrayLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#traverseChildren(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = traverseChildren(n, scope);
 *  */
    @Test
    public void testTraverseArrayLiteral_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1233)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", nodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = ((Object) null);
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseArrayLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseArrayLiteral1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:385)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:126)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:41)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:361)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, linkedFlowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = linkedFlowScope;
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:715) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(11);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:388)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(85);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:398)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(52);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:419)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(28);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:352)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1241)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:423)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:667)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:312)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(21);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:777)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:347)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(4);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:715) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(155);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:715) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(83);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:392)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1194)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:342)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:434)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:715) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(98);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:816)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:330)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:715)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:357)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:316)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:361)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:714) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:715) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", stringNodeType, linkedFlowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = stringNode;
        traverseArrayLiteralMethodArguments[1] = linkedFlowScope;
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseArrayLiteral22() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseArrayLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:939)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:715) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", stringNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = stringNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseArrayLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = NullPointerException.class)
    public void testTraverseArrayLiteral23() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseArrayLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseArrayLiteral", numberNodeType, flowScopeType);
        traverseArrayLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseArrayLiteralMethodArguments = new java.lang.Object[2];
        traverseArrayLiteralMethodArguments[0] = numberNode;
        traverseArrayLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseArrayLiteralMethod.invoke(typeInference, traverseArrayLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = callNode.getFirstChild();
 *  */
    @Test
    public void testTightenTypesAfterAssertions_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:868) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = ((Object) null);
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node firstParam = left.getNext();
 *  */
    @Test
    public void testTightenTypesAfterAssertions_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:869) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, numberNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = numberNode;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assertionFunctionsMap.get(left.getQualifiedName())
 *  */
    @Test
    public void testTightenTypesAfterAssertions_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:871) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, numberNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = numberNode;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: assertionFunctionsMap.get(left.getQualifiedName())
 *  */
    @Test
    public void testTightenTypesAfterAssertions_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:871) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", flowScopeType, stringNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = ((Object) null);
        tightenTypesAfterAssertionsMethodArguments[1] = stringNode;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node)
    
    @Test
    public void testTightenTypesAfterAssertions1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedHashMap assertionFunctionsMap = new LinkedHashMap();
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "assertionFunctionsMap", assertionFunctionsMap);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", linkedFlowScopeType, stringNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = linkedFlowScope;
        tightenTypesAfterAssertionsMethodArguments[1] = stringNode;
        LinkedFlowScope actual = ((LinkedFlowScope) tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments));
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(linkedFlowScope, actual);
    }
    
    @Test
    public void testTightenTypesAfterAssertions2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedHashMap assertionFunctionsMap = new LinkedHashMap();
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "assertionFunctionsMap", assertionFunctionsMap);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", linkedFlowScopeType, numberNodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = linkedFlowScope;
        tightenTypesAfterAssertionsMethodArguments[1] = numberNode;
        LinkedFlowScope actual = ((LinkedFlowScope) tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments));
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(linkedFlowScope, actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method tightenTypesAfterAssertions(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node)
    
    @Test
    public void testTightenTypesAfterAssertions3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        Object next = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1580)
            com.google.javascript.jscomp.TypeInference.tightenTypesAfterAssertions(TypeInference.java:871) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method tightenTypesAfterAssertionsMethod = typeInferenceClazz.getDeclaredMethod("tightenTypesAfterAssertions", linkedFlowScopeType, nodeType);
        tightenTypesAfterAssertionsMethod.setAccessible(true);
        java.lang.Object[] tightenTypesAfterAssertionsMethodArguments = new java.lang.Object[2];
        tightenTypesAfterAssertionsMethodArguments[0] = linkedFlowScope;
        tightenTypesAfterAssertionsMethodArguments[1] = node;
        try {
            tightenTypesAfterAssertionsMethod.invoke(typeInference, tightenTypesAfterAssertionsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.util.Map)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isTemplateType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#toMaybeTemplateType()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#resolvedTemplateType(java.util.Map,com.google.javascript.rhino.jstype.TemplateType,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: resolvedTemplateType(resolvedTypes, paramType.toMaybeTemplateType(), argType);
 *  */
    @Test
    public void testMaybeResolveTemplatedType_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1127)
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType(TypeInference.java:1044) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplatedTypeMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplatedType", templateTypeType, templateTypeType, mapType);
        maybeResolveTemplatedTypeMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplatedTypeMethodArguments = new java.lang.Object[3];
        maybeResolveTemplatedTypeMethodArguments[0] = templateType;
        maybeResolveTemplatedTypeMethodArguments[1] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplatedTypeMethod.invoke(typeInference, maybeResolveTemplatedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: paramType.isTemplateType()
 *  */
    @Test
    public void testMaybeResolveTemplatedType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType(TypeInference.java:1042) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplatedTypeMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplatedType", jSTypeType, jSTypeType, mapType);
        maybeResolveTemplatedTypeMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplatedTypeMethodArguments = new java.lang.Object[3];
        maybeResolveTemplatedTypeMethodArguments[0] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[1] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplatedTypeMethod.invoke(typeInference, maybeResolveTemplatedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.util.Map)
    
    @Test
    public void testMaybeResolveTemplatedType1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplatedTypeMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplatedType", enumElementTypeType, enumElementTypeType, mapType);
        maybeResolveTemplatedTypeMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplatedTypeMethodArguments = new java.lang.Object[3];
        maybeResolveTemplatedTypeMethodArguments[0] = enumElementType;
        maybeResolveTemplatedTypeMethodArguments[1] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[2] = ((Object) null);
        maybeResolveTemplatedTypeMethod.invoke(typeInference, maybeResolveTemplatedTypeMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method maybeResolveTemplatedType(com.google.javascript.rhino.jstype.JSType, com.google.javascript.rhino.jstype.JSType, java.util.Map)
    
    @Test(expected = StackOverflowError.class)
    public void testMaybeResolveTemplatedType2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplatizedType referencedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplatedTypeMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplatedType", templatizedTypeType, templatizedTypeType, mapType);
        maybeResolveTemplatedTypeMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplatedTypeMethodArguments = new java.lang.Object[3];
        maybeResolveTemplatedTypeMethodArguments[0] = templatizedType;
        maybeResolveTemplatedTypeMethodArguments[1] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplatedTypeMethod.invoke(typeInference, maybeResolveTemplatedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeResolveTemplatedType3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1128)
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType(TypeInference.java:1044) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method maybeResolveTemplatedTypeMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplatedType", templateTypeType, templateTypeType, linkedHashMapType);
        maybeResolveTemplatedTypeMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplatedTypeMethodArguments = new java.lang.Object[3];
        maybeResolveTemplatedTypeMethodArguments[0] = templateType;
        maybeResolveTemplatedTypeMethodArguments[1] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[2] = linkedHashMap;
        try {
            maybeResolveTemplatedTypeMethod.invoke(typeInference, maybeResolveTemplatedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeResolveTemplatedType4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1127)
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType(TypeInference.java:1044) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplatedTypeMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplatedType", templatizedTypeType, templatizedTypeType, mapType);
        maybeResolveTemplatedTypeMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplatedTypeMethodArguments = new java.lang.Object[3];
        maybeResolveTemplatedTypeMethodArguments[0] = templatizedType;
        maybeResolveTemplatedTypeMethodArguments[1] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplatedTypeMethod.invoke(typeInference, maybeResolveTemplatedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testMaybeResolveTemplatedType5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        TemplatizedType templatizedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplatizedType referencedType = ((TemplatizedType) createInstance("com.google.javascript.rhino.jstype.TemplatizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templatizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.resolvedTemplateType(TypeInference.java:1127)
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplatedType(TypeInference.java:1044) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class templatizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplatedTypeMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplatedType", templatizedTypeType, templatizedTypeType, mapType);
        maybeResolveTemplatedTypeMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplatedTypeMethodArguments = new java.lang.Object[3];
        maybeResolveTemplatedTypeMethodArguments[0] = templatizedType;
        maybeResolveTemplatedTypeMethodArguments[1] = ((Object) null);
        maybeResolveTemplatedTypeMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplatedTypeMethod.invoke(typeInference, maybeResolveTemplatedTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferTemplatedTypesForCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, noObjectTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = noObjectType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.ImmutableList$SubList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, noObjectTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = noObjectType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.Lists$StringAsImmutableList");
        String string = "";
        setField(templateKeys, "com.google.common.collect.Lists$StringAsImmutableList", "string", string);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, noObjectTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = noObjectType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse_3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        ImmutableList templateKeys = ((ImmutableList) createInstance("com.google.common.collect.CartesianList$1"));
        Object this$0 = createInstance("com.google.common.collect.CartesianList");
        Object axes = createInstance("com.google.common.collect.RegularImmutableList");
        setField(this$0, "com.google.common.collect.CartesianList", "axes", axes);
        setField(templateKeys, "com.google.common.collect.CartesianList$1", "this$0", this$0);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, noObjectTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = noObjectType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ReturnFalse_4() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        ImmutableList templateKeys = ((ImmutableList) createInstance("com.google.common.collect.CartesianList$1"));
        Object this$0 = createInstance("com.google.common.collect.CartesianList");
        Object axes = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(this$0, "com.google.common.collect.CartesianList", "axes", axes);
        setField(templateKeys, "com.google.common.collect.CartesianList$1", "this$0", this$0);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, noObjectTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = noObjectType;
        boolean actual = ((Boolean) inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferTemplatedTypesForCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1166) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, functionTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = ((Object) null);
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1166) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, noObjectTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = noObjectType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferTemplatedTypesForCall(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.TemplateTypeMap#getTemplateKeys()}
 * @utbot.invokes {@link com.google.common.collect.ImmutableList#isEmpty()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: fnType.getTemplateTypeMap().getTemplateKeys().isEmpty()
 *  */
    @Test
    public void testInferTemplatedTypesForCall_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1166) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, noObjectTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = noObjectType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method inferTemplatedTypesForCall(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testInferTemplatedTypesForCall1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.ImmutableList$SubList");
        setField(templateKeys, "com.google.common.collect.ImmutableList$SubList", "length", 1);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGet(NodeUtil.java:1582)
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1021)
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1171) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", numberNodeType, noTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = numberNode;
        inferTemplatedTypesForCallMethodArguments[1] = noType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferTemplatedTypesForCall2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        ImmutableList templateKeys = ((ImmutableList) createInstance("com.google.common.collect.CartesianList$1"));
        Object this$0 = createInstance("com.google.common.collect.CartesianList");
        Object axes = createInstance("com.google.common.collect.RegularImmutableList");
        setField(axes, "com.google.common.collect.RegularImmutableList", "size", 1);
        setField(this$0, "com.google.common.collect.CartesianList", "axes", axes);
        setField(templateKeys, "com.google.common.collect.CartesianList$1", "this$0", this$0);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGet(NodeUtil.java:1582)
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1021)
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1171) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", stringNodeType, noTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = stringNode;
        inferTemplatedTypesForCallMethodArguments[1] = noType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferTemplatedTypesForCall3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        ImmutableList templateKeys = ((ImmutableList) createInstance("com.google.common.collect.CartesianList$1"));
        Object this$0 = createInstance("com.google.common.collect.CartesianList");
        Object axes = createInstance("com.google.common.collect.SingletonImmutableList");
        setField(this$0, "com.google.common.collect.CartesianList", "axes", axes);
        setField(templateKeys, "com.google.common.collect.CartesianList$1", "this$0", this$0);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeUtil.isGet(NodeUtil.java:1582)
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1021)
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1171) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", numberNodeType, noTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = numberNode;
        inferTemplatedTypesForCallMethodArguments[1] = noType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testInferTemplatedTypesForCall4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.Lists$StringAsImmutableList");
        String string = "\u0000";
        setField(templateKeys, "com.google.common.collect.Lists$StringAsImmutableList", "string", string);
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplateTypesFromParameters(TypeInference.java:1020)
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1171) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method inferTemplatedTypesForCallMethod = typeInferenceClazz.getDeclaredMethod("inferTemplatedTypesForCall", nodeType, noTypeType);
        inferTemplatedTypesForCallMethod.setAccessible(true);
        java.lang.Object[] inferTemplatedTypesForCallMethodArguments = new java.lang.Object[2];
        inferTemplatedTypesForCallMethodArguments[0] = ((Object) null);
        inferTemplatedTypesForCallMethodArguments[1] = noType;
        try {
            inferTemplatedTypesForCallMethod.invoke(typeInference, inferTemplatedTypesForCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1451) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = ((Object) null);
        getBooleanOutcomePairMethodArguments[1] = ((Object) null);
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1454) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1454) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1454) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,com.google.javascript.jscomp.TypeInference.BooleanOutcomePair,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getBooleanOutcomes(left.toBooleanOutcomes, right.toBooleanOutcomes, condition)
 *  */
    @Test
    public void testGetBooleanOutcomePair_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1451) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = ((Object) null);
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, boolean)
    
    @Test
    public void testGetBooleanOutcomePair1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        Object actual = getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        
        Object expected = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", toBooleanOutcomes);
        setField(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "this$0", typeInference);
        
        BooleanLiteralSet expectedToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        BooleanLiteralSet actualToBooleanOutcomes = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes"));
        assertEquals(expectedToBooleanOutcomes, actualToBooleanOutcomes);
        
        BooleanLiteralSet expectedBooleanValues = ((BooleanLiteralSet) getFieldValue(expected, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        BooleanLiteralSet actualBooleanValues = ((BooleanLiteralSet) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues"));
        assertEquals(expectedBooleanValues, actualBooleanValues);
        
        FlowScope actualLeftScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "leftScope"));
        assertNull(actualLeftScope);
        
        FlowScope actualRightScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "rightScope"));
        assertNull(actualRightScope);
        
        FlowScope actualJoinedScope = ((FlowScope) getFieldValue(actual, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "joinedScope"));
        assertNull(actualJoinedScope);
        
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method getBooleanOutcomePair(com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, com.google.javascript.jscomp.TypeInference$BooleanOutcomePair, boolean)
    
    @Test
    public void testGetBooleanOutcomePair2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1454) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetBooleanOutcomePair3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1454) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = false;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetBooleanOutcomePair4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.FALSE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1454) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetBooleanOutcomePair5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes1 = BooleanLiteralSet.TRUE;
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes1);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1454) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testGetBooleanOutcomePair6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object booleanOutcomePair = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        BooleanLiteralSet toBooleanOutcomes = BooleanLiteralSet.EMPTY;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        BooleanLiteralSet booleanValues = BooleanLiteralSet.BOTH;
        setField(booleanOutcomePair, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "booleanValues", booleanValues);
        Object booleanOutcomePair1 = createInstance("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        setField(booleanOutcomePair1, "com.google.javascript.jscomp.TypeInference$BooleanOutcomePair", "toBooleanOutcomes", toBooleanOutcomes);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472)
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomePair(TypeInference.java:1454) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class booleanOutcomePairType = Class.forName("com.google.javascript.jscomp.TypeInference$BooleanOutcomePair");
        Class booleanType = boolean.class;
        Method getBooleanOutcomePairMethod = typeInferenceClazz.getDeclaredMethod("getBooleanOutcomePair", booleanOutcomePairType, booleanOutcomePairType, booleanType);
        getBooleanOutcomePairMethod.setAccessible(true);
        java.lang.Object[] getBooleanOutcomePairMethodArguments = new java.lang.Object[3];
        getBooleanOutcomePairMethodArguments[0] = booleanOutcomePair;
        getBooleanOutcomePairMethodArguments[1] = booleanOutcomePair1;
        getBooleanOutcomePairMethodArguments[2] = true;
        try {
            getBooleanOutcomePairMethod.invoke(typeInference, getBooleanOutcomePairMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseObjectLiteral
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#cast(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testTraverseObjectLiteral_ObjectTypeCast() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        UnionType jsType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = n.getJSType();
 *  */
    @Test
    public void testTraverseObjectLiteral_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseObjectLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:720) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", nodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = ((Object) null);
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseObjectLiteral(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(type);
 *  */
    @Test(expected = NullPointerException.class)
    public void testTraverseObjectLiteral_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", numberNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = numberNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseObjectLiteral1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(34);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseObjectLiteral(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(92);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(17);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(98);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(93);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testTraverseObjectLiteral10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(32);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseObjectLiteral11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseObjectLiteral] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:495)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:447)
            com.google.javascript.jscomp.TypeInference.traverseObjectLiteral(TypeInference.java:724) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseObjectLiteralMethod = typeInferenceClazz.getDeclaredMethod("traverseObjectLiteral", stringNodeType, flowScopeType);
        traverseObjectLiteralMethod.setAccessible(true);
        java.lang.Object[] traverseObjectLiteralMethodArguments = new java.lang.Object[2];
        traverseObjectLiteralMethodArguments[0] = stringNode;
        traverseObjectLiteralMethodArguments[1] = ((Object) null);
        try {
            traverseObjectLiteralMethod.invoke(typeInference, traverseObjectLiteralMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method backwardsInferenceFromCallSite(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#backwardsInferenceFromCallSite(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean updatedFnType = inferTemplatedTypesForCall(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1166)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:946) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, functionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = ((Object) null);
        backwardsInferenceFromCallSiteMethodArguments[1] = ((Object) null);
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#backwardsInferenceFromCallSite(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean updatedFnType = inferTemplatedTypesForCall(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1166)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:946) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, noObjectTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = ((Object) null);
        backwardsInferenceFromCallSiteMethodArguments[1] = noObjectType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#backwardsInferenceFromCallSite(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#updateTypeOfParameters(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: updateTypeOfParameters(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:983)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:950) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, noObjectTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = ((Object) null);
        backwardsInferenceFromCallSiteMethodArguments[1] = noObjectType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#backwardsInferenceFromCallSite(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: boolean updatedFnType = inferTemplatedTypesForCall(n, fnType);
 *  */
    @Test
    public void testBackwardsInferenceFromCallSite_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferTemplatedTypesForCall(TypeInference.java:1166)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:946) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, noObjectTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = ((Object) null);
        backwardsInferenceFromCallSiteMethodArguments[1] = noObjectType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method backwardsInferenceFromCallSite(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testBackwardsInferenceFromCallSite1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:960)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:951) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, anonymousFunctionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = node;
        backwardsInferenceFromCallSiteMethodArguments[1] = anonymousFunctionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBackwardsInferenceFromCallSite2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", first);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:960)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:951) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, anonymousFunctionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = node;
        backwardsInferenceFromCallSiteMethodArguments[1] = anonymousFunctionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBackwardsInferenceFromCallSite3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Object parameters = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first1 = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parameters, "com.google.javascript.rhino.Node", "first", first1);
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateTypeOfParameters(TypeInference.java:999)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:950) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, anonymousFunctionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = node;
        backwardsInferenceFromCallSiteMethodArguments[1] = anonymousFunctionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testBackwardsInferenceFromCallSite4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node next = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", next);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:960)
            com.google.javascript.jscomp.TypeInference.backwardsInferenceFromCallSite(TypeInference.java:951) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", numberNodeType, errorFunctionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = numberNode;
        backwardsInferenceFromCallSiteMethodArguments[1] = errorFunctionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method backwardsInferenceFromCallSite(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test(timeout = 1000L)
    public void testBackwardsInferenceFromCallSite5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        TemplateTypeMap templateTypeMap = ((TemplateTypeMap) createInstance("com.google.javascript.rhino.jstype.TemplateTypeMap"));
        Object templateKeys = createInstance("com.google.common.collect.EmptyImmutableList");
        setField(templateTypeMap, "com.google.javascript.rhino.jstype.TemplateTypeMap", "templateKeys", templateKeys);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.JSType", "templateTypeMap", templateTypeMap);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method backwardsInferenceFromCallSiteMethod = typeInferenceClazz.getDeclaredMethod("backwardsInferenceFromCallSite", nodeType, anonymousFunctionTypeType);
        backwardsInferenceFromCallSiteMethod.setAccessible(true);
        java.lang.Object[] backwardsInferenceFromCallSiteMethodArguments = new java.lang.Object[2];
        backwardsInferenceFromCallSiteMethodArguments[0] = node;
        backwardsInferenceFromCallSiteMethodArguments[1] = anonymousFunctionType;
        try {
            backwardsInferenceFromCallSiteMethod.invoke(typeInference, backwardsInferenceFromCallSiteMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (qName != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_QNameEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", numberNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = numberNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:638) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = ((Object) null);
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:638) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", numberNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = numberNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.executesCondition {@code (qName != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getVar(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = syntacticScope.getVar(qName);
 *  */
    @Test
    public void testEnsurePropertyDeclaredHelper_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(42);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:641) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", numberNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = numberNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsurePropertyDeclaredHelper_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", numberNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = numberNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String propName = getprop.getLastChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsurePropertyDeclaredHelper_ThrowIllegalStateException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", numberNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = numberNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String qName = getprop.getQualifiedName();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testEnsurePropertyDeclaredHelper_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(38);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", nodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = node;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testEnsurePropertyDeclaredHelper1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", numberNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = numberNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ensurePropertyDeclaredHelper(com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testEnsurePropertyDeclaredHelper2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1580)
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1580)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:639) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", numberNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = numberNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsurePropertyDeclaredHelper3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1578)
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1580)
            com.google.javascript.jscomp.TypeInference.ensurePropertyDeclaredHelper(TypeInference.java:639) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method ensurePropertyDeclaredHelperMethod = typeInferenceClazz.getDeclaredMethod("ensurePropertyDeclaredHelper", numberNodeType, objectTypeType);
        ensurePropertyDeclaredHelperMethod.setAccessible(true);
        java.lang.Object[] ensurePropertyDeclaredHelperMethodArguments = new java.lang.Object[2];
        ensurePropertyDeclaredHelperMethodArguments[0] = numberNode;
        ensurePropertyDeclaredHelperMethodArguments[1] = ((Object) null);
        try {
            ensurePropertyDeclaredHelperMethod.invoke(typeInference, ensurePropertyDeclaredHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1367) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", nodeType, flowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = ((Object) null);
        traverseShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseShortCircuitingBinOp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope.createChildFlowScope()
 *  */
    @Test
    public void testTraverseShortCircuitingBinOp_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", stringNodeType, flowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = stringNode;
        traverseShortCircuitingBinOpMethodArguments[1] = ((Object) null);
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test
    public void testTraverseShortCircuitingBinOp1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(74);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1379) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException] */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(28);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException] */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(92);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:388)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(4);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1379) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(49);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1379) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(16);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:419)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(21);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:777)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:347)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1241)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:423)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1194)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:342)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(32);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:403)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:428)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:715)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:357)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(100);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1436)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1433)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseShortCircuitingBinOp17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:417)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseShortCircuitingBinOp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope, boolean)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseShortCircuitingBinOp18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class booleanType = boolean.class;
        Method traverseShortCircuitingBinOpMethod = typeInferenceClazz.getDeclaredMethod("traverseShortCircuitingBinOp", numberNodeType, linkedFlowScopeType, booleanType);
        traverseShortCircuitingBinOpMethod.setAccessible(true);
        java.lang.Object[] traverseShortCircuitingBinOpMethodArguments = new java.lang.Object[3];
        traverseShortCircuitingBinOpMethodArguments[0] = numberNode;
        traverseShortCircuitingBinOpMethodArguments[1] = linkedFlowScope;
        traverseShortCircuitingBinOpMethodArguments[2] = false;
        try {
            traverseShortCircuitingBinOpMethod.invoke(typeInference, traverseShortCircuitingBinOpMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeResolveTemplateTypeFromNodes(java.lang.Iterable, java.lang.Iterable, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#maybeResolveTemplateTypeFromNodes(java.lang.Iterable,java.lang.Iterable,java.util.Map)}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: declParams.iterator()
 *  */
    @Test
    public void testMaybeResolveTemplateTypeFromNodes_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(TypeInference.java:1101) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class iterableType = Class.forName("java.lang.Iterable");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplateTypeFromNodesMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplateTypeFromNodes", iterableType, iterableType, mapType);
        maybeResolveTemplateTypeFromNodesMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplateTypeFromNodesMethodArguments = new java.lang.Object[3];
        maybeResolveTemplateTypeFromNodesMethodArguments[0] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[1] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplateTypeFromNodesMethod.invoke(typeInference, maybeResolveTemplateTypeFromNodesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method maybeResolveTemplateTypeFromNodes(java.lang.Iterable, java.lang.Iterable, java.util.Map)
    
    @Test
    public void testMaybeResolveTemplateTypeFromNodes1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        ArrayList arrayList = new ArrayList();
        arrayList.add(null);
        arrayList.add(null);
        arrayList.add(null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(TypeInference.java:1101) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class arrayListType = Class.forName("java.lang.Iterable");
        Class linkedHashMapType = Class.forName("java.util.Map");
        Method maybeResolveTemplateTypeFromNodesMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplateTypeFromNodes", arrayListType, arrayListType, linkedHashMapType);
        maybeResolveTemplateTypeFromNodesMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplateTypeFromNodesMethodArguments = new java.lang.Object[3];
        maybeResolveTemplateTypeFromNodesMethodArguments[0] = arrayList;
        maybeResolveTemplateTypeFromNodesMethodArguments[1] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[2] = linkedHashMap;
        try {
            maybeResolveTemplateTypeFromNodesMethod.invoke(typeInference, maybeResolveTemplateTypeFromNodesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method maybeResolveTemplateTypeFromNodes(java.util.Iterator, java.util.Iterator, java.util.Map)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#maybeResolveTemplateTypeFromNodes(java.util.Iterator,java.util.Iterator,java.util.Map)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: while(declParams.hasNext() && callParams.hasNext())
 *  */
    @Test
    public void testMaybeResolveTemplateTypeFromNodes_ThrowNullPointerException1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.maybeResolveTemplateTypeFromNodes(TypeInference.java:1108) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class iteratorType = Class.forName("java.util.Iterator");
        Class mapType = Class.forName("java.util.Map");
        Method maybeResolveTemplateTypeFromNodesMethod = typeInferenceClazz.getDeclaredMethod("maybeResolveTemplateTypeFromNodes", iteratorType, iteratorType, mapType);
        maybeResolveTemplateTypeFromNodesMethod.setAccessible(true);
        java.lang.Object[] maybeResolveTemplateTypeFromNodesMethodArguments = new java.lang.Object[3];
        maybeResolveTemplateTypeFromNodesMethodArguments[0] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[1] = ((Object) null);
        maybeResolveTemplateTypeFromNodesMethodArguments[2] = ((Object) null);
        try {
            maybeResolveTemplateTypeFromNodesMethod.invoke(typeInference, maybeResolveTemplateTypeFromNodesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseAnd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAnd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAnd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, true);
 *  */
    @Test
    public void testTraverseAnd_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1367)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", nodeType, flowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = ((Object) null);
        traverseAndMethodArguments[1] = ((Object) null);
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAnd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return traverseShortCircuitingBinOp(n, scope, true);
 *  */
    @Test
    public void testTraverseAnd_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, flowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = ((Object) null);
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseAnd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseAnd1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(100);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1436)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1431)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1433)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.<init>(LinkedFlowScope.java:417)
            com.google.javascript.jscomp.LinkedFlowScope.createChildFlowScope(LinkedFlowScope.java:166)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(45);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:419)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:852)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1194)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:342)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(85);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:398)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(25);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:388)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(93);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:777)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:347)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(42);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache.access$100(LinkedFlowScope.java:385)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:126)
            com.google.javascript.jscomp.LinkedFlowScope.getTypeOfThis(LinkedFlowScope.java:41)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:361)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(49);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1379)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.LinkedFlowScope.getSlot(LinkedFlowScope.java:144)
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:667)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:312)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(130);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:428)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(155);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1379)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(138);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1379)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:434)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(83);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:392)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseAnd19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(29);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAnd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:352)
            com.google.javascript.jscomp.TypeInference.traverseWithinShortCircuitingBinOp(TypeInference.java:1439)
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1372)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseAnd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = NullPointerException.class)
    public void testTraverseAnd20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", -2147483397);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAndMethod = typeInferenceClazz.getDeclaredMethod("traverseAnd", numberNodeType, linkedFlowScopeType);
        traverseAndMethod.setAccessible(true);
        java.lang.Object[] traverseAndMethodArguments = new java.lang.Object[2];
        traverseAndMethodArguments[0] = numberNode;
        traverseAndMethodArguments[1] = linkedFlowScope;
        try {
            traverseAndMethod.invoke(typeInference, traverseAndMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseChildren
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseChildren(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testTraverseChildren_ReturnScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseChildren(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node el = n.getFirstChild(); el != null; el = el.getNext())
 *  */
    @Test
    public void testTraverseChildren_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1233) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", nodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = ((Object) null);
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseChildren1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTraverseChildren2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(155);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments));
        
        assertNull(actual);
    }
    
    @Test
    public void testTraverseChildren3() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(118);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        FlowScope actual = ((FlowScope) traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments));
        
        assertNull(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test
    public void testTraverseChildren4() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(52);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:419)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren5() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(24);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:388)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren6() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(29);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:352)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren7() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(120);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:491)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:447)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren8() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(101);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373)
            com.google.javascript.jscomp.TypeInference.traverseAnd(TypeInference.java:1229)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:320)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren9() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(86);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:507)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:308)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren10() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:667)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:312)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren11() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(83);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:392)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren12() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1256)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:316)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren13() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(30);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseNew(TypeInference.java:1194)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:342)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren14() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(35);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverseGetElem(TypeInference.java:1241)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:423)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren15() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(100);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseShortCircuitingBinOp(TypeInference.java:1373)
            com.google.javascript.jscomp.TypeInference.traverseOr(TypeInference.java:1362)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:325)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren16() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569)
            com.google.javascript.jscomp.TypeInference.traverseCall(TypeInference.java:852)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:338)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren17() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(21);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:777)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:347)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren18() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(98);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:816)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:330)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren19() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(63);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseArrayLiteral(TypeInference.java:715)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:357)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testTraverseChildren20() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(110);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseChildren] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:306)
            com.google.javascript.jscomp.TypeInference.traverse(TypeInference.java:434)
            com.google.javascript.jscomp.TypeInference.traverseChildren(TypeInference.java:1234) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseChildren(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    @Test(expected = NullPointerException.class)
    public void testTraverseChildren21() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseChildrenMethod = typeInferenceClazz.getDeclaredMethod("traverseChildren", numberNodeType, flowScopeType);
        traverseChildrenMethod.setAccessible(true);
        java.lang.Object[] traverseChildrenMethodArguments = new java.lang.Object[2];
        traverseChildrenMethodArguments[0] = numberNode;
        traverseChildrenMethodArguments[1] = ((Object) null);
        try {
            traverseChildrenMethod.invoke(typeInference, traverseChildrenMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseGetProp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseGetProp(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseGetProp(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node objNode = n.getFirstChild();
 *  */
    @Test
    public void testTraverseGetProp_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseGetProp(TypeInference.java:1250) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseGetPropMethod = typeInferenceClazz.getDeclaredMethod("traverseGetProp", nodeType, flowScopeType);
        traverseGetPropMethod.setAccessible(true);
        java.lang.Object[] traverseGetPropMethodArguments = new java.lang.Object[2];
        traverseGetPropMethodArguments[0] = ((Object) null);
        traverseGetPropMethodArguments[1] = ((Object) null);
        try {
            traverseGetPropMethod.invoke(typeInference, traverseGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.flowThrough
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (input == bottomScope): True}
 * @utbot.returnsFrom {@code return input;}
 *  */
    @Test
    public void testFlowThrough_InputEqualsBottomScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        FlowScope actual = typeInference.flowThrough(null, null);
        
        assertNull(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method flowThrough(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#flowThrough(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (input == bottomScope): False}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FlowScope output = input.createChildFlowScope();
 *  */
    @Test
    public void testFlowThrough_ThrowNullPointerException() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope bottomScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "bottomScope", bottomScope);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.flowThrough] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.flowThrough(TypeInference.java:185) */
        typeInference.flowThrough(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.inferArguments
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method inferArguments(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isCallOrNewTarget(functionNode)): True}
 * @utbot.executesCondition {@code (functionType != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 *  */
    @Test
    public void testInferArguments_NodeUtilIsCallOrNewTarget() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(rootNode, "com.google.javascript.rhino.Node", "first", rootNode);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", rootNode);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isCallOrNewTarget(functionNode)): False}
 * @utbot.executesCondition {@code (functionType != null): False}
 *  */
    @Test
    public void testInferArguments_FunctionTypeEqualsNull_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(-255);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isCallOrNewTarget(functionNode)): False}
 * @utbot.executesCondition {@code (functionType != null): False}
 *  */
    @Test
    public void testInferArguments_FunctionTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isCallOrNewTarget(functionNode)): False}
 * @utbot.executesCondition {@code (functionType != null): False}
 *  */
    @Test
    public void testInferArguments_FunctionTypeEqualsNull_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(37);
        setField(rootNode, "com.google.javascript.rhino.Node", "parent", parent);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isCallOrNewTarget(functionNode)): False}
 * @utbot.executesCondition {@code (functionType != null): True}
 * @utbot.executesCondition {@code (parameterTypes != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getParametersNode()}
 *  */
    @Test
    public void testInferArguments_ParameterTypesEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method inferArguments(com.google.javascript.jscomp.Scope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.invokes {@link com.google.javascript.jscomp.Scope#getRootNode()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node functionNode = functionScope.getRootNode();
 *  */
    @Test
    public void testInferArguments_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:123) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = ((Object) null);
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node astParameters = functionNode.getFirstChild().getNext();
 *  */
    @Test
    public void testInferArguments_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:124) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node astParameters = functionNode.getFirstChild().getNext();
 *  */
    @Test
    public void testInferArguments_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:124) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#inferArguments(com.google.javascript.jscomp.Scope)}
 * @utbot.executesCondition {@code (NodeUtil.isCallOrNewTarget(functionNode)): False}
 * @utbot.executesCondition {@code (functionType != null): True}
 * @utbot.executesCondition {@code (parameterTypes != null): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#isCallOrNewTarget(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#toMaybeFunctionType(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getParametersNode()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(Node astParameter: astParameters.children())
 *  */
    @Test
    public void testInferArguments_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Object rootNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(rootNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Object call = createInstance("com.google.javascript.rhino.jstype.ArrowType");
        Node parameters = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(call, "com.google.javascript.rhino.jstype.ArrowType", "parameters", parameters);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "call", call);
        setField(rootNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(scope, "com.google.javascript.jscomp.Scope", "rootNode", rootNode);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.inferArguments] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.inferArguments(TypeInference.java:137) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Method inferArgumentsMethod = typeInferenceClazz.getDeclaredMethod("inferArguments", scopeType);
        inferArgumentsMethod.setAccessible(true);
        java.lang.Object[] inferArgumentsMethodArguments = new java.lang.Object[1];
        inferArgumentsMethodArguments[0] = scope;
        try {
            inferArgumentsMethod.invoke(typeInference, inferArgumentsMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.createEntryLattice
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method createEntryLattice()
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#createEntryLattice()}
 * @utbot.returnsFrom {@code return functionScope;}
 *  */
    @Test
    public void testCreateEntryLattice_ReturnFunctionScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope functionScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "functionScope", functionScope);
        
        LinkedFlowScope actual = ((LinkedFlowScope) typeInference.createEntryLattice());
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(functionScope, actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseCatch
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: type = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testTraverseCatch_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:939)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:495) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node name = catchNode.getFirstChild();
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:487) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = ((Object) null);
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo info = name.getJSDocInfo();
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:491) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", numberNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = numberNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:495) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = getNativeType(JSTypeNative.UNKNOWN_TYPE);
 *  */
    @Test
    public void testTraverseCatch_ThrowNullPointerException_3() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseCatch] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582)
            com.google.javascript.jscomp.TypeInference.traverseCatch(TypeInference.java:495) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", nodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = node;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseCatch(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseCatch(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSDocInfo info = name.getJSDocInfo();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testTraverseCatch_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(first, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseCatchMethod = typeInferenceClazz.getDeclaredMethod("traverseCatch", numberNodeType, flowScopeType);
        traverseCatchMethod.setAccessible(true);
        java.lang.Object[] traverseCatchMethodArguments = new java.lang.Object[2];
        traverseCatchMethodArguments[0] = numberNode;
        traverseCatchMethodArguments[1] = ((Object) null);
        try {
            traverseCatchMethod.invoke(typeInference, traverseCatchMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseAssign
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAssign(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAssign(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseAssign_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAssign(TypeInference.java:503) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAssignMethod = typeInferenceClazz.getDeclaredMethod("traverseAssign", nodeType, flowScopeType);
        traverseAssignMethod.setAccessible(true);
        java.lang.Object[] traverseAssignMethodArguments = new java.lang.Object[2];
        traverseAssignMethodArguments[0] = ((Object) null);
        traverseAssignMethodArguments[1] = ((Object) null);
        try {
            traverseAssignMethod.invoke(typeInference, traverseAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseName
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String varName = n.getString();
 *  */
    @Test
    public void testTraverseName_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:658) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", nodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = ((Object) null);
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.executesCondition {@code (value != null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#getSlot(java.lang.String)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: StaticSlot<JSType> var = scope.getSlot(varName);
 *  */
    @Test
    public void testTraverseName_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseName(TypeInference.java:667) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", stringNodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = stringNode;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method traverseName(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String varName = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseName_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(0);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", nodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = node;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseName(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String varName = n.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testTraverseName_ThrowIllegalStateException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(40);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseNameMethod = typeInferenceClazz.getDeclaredMethod("traverseName", nodeType, flowScopeType);
        traverseNameMethod.setAccessible(true);
        java.lang.Object[] traverseNameMethodArguments = new java.lang.Object[2];
        traverseNameMethodArguments[0] = node;
        traverseNameMethodArguments[1] = ((Object) null);
        try {
            traverseNameMethod.invoke(typeInference, traverseNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseHook
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseHook(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseHook(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node condition = n.getFirstChild();
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:815) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", nodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = ((Object) null);
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseHook(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node trueNode = condition.getNext();
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:816) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", numberNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = numberNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseHook(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getNext()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#traverse(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)
 * @utbot.invokes {@link com.google.javascript.jscomp.type.ReverseAbstractInterpreter#getPreciserScopeKnowingConditionOutcome(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: getPreciserScopeKnowingConditionOutcome
 *  */
    @Test
    public void testTraverseHook_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(137);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseHook] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseHook(TypeInference.java:824) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseHookMethod = typeInferenceClazz.getDeclaredMethod("traverseHook", stringNodeType, flowScopeType);
        traverseHookMethod.setAccessible(true);
        java.lang.Object[] traverseHookMethodArguments = new java.lang.Object[2];
        traverseHookMethodArguments[0] = stringNode;
        traverseHookMethodArguments[1] = ((Object) null);
        try {
            traverseHookMethod.invoke(typeInference, traverseHookMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.narrowScope
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isThis()): True}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testNarrowScope_NodeIsThis() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(42);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", flowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = ((Object) null);
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        FlowScope actual = ((FlowScope) narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isThis()): False}
 * @utbot.executesCondition {@code (node.isGetProp()): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#inferQualifiedSlot(com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.returnsFrom {@code return scope;}
 *  */
    @Test
    public void testNarrowScope_NodeIsGetProp() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        Object cache = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        Scope functionScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(cache, "com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache", "functionScope", functionScope);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 250);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) first)).setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, nodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = node;
        narrowScopeMethodArguments[2] = ((Object) null);
        LinkedFlowScope actual = ((LinkedFlowScope) narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments));
        
        LinkedFlowScope expected = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "cache", cache);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "parent", linkedFlowScope);
        setField(expected, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        
        // com.google.javascript.jscomp.LinkedFlowScope has overridden equals method
        assertEquals(expected, actual);
        
        boolean finalLinkedFlowScopeFrozen = ((Boolean) getFieldValue(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "frozen"));
        
        assertTrue(finalLinkedFlowScopeFrozen);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isThis()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isThis()}
 * @utbot.invokes {@link com.google.javascript.jscomp.type.FlowScope#createChildFlowScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: scope = scope.createChildFlowScope();
 *  */
    @Test
    public void testNarrowScope_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:910) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", flowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = ((Object) null);
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isThis()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: node.isThis()
 *  */
    @Test
    public void testNarrowScope_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.narrowScope] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.narrowScope(TypeInference.java:905) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", flowScopeType, nodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = ((Object) null);
        narrowScopeMethodArguments[1] = ((Object) null);
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method narrowScope(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isGetProp()): False}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: redeclareSimpleVar(scope, node, narrowed);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testNarrowScope_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#narrowScope(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (node.isGetProp()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: node
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testNarrowScope_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        LinkedFlowScope linkedFlowScope = ((LinkedFlowScope) createInstance("com.google.javascript.jscomp.LinkedFlowScope"));
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "depth", 251);
        Object flattened = createInstance("com.google.javascript.jscomp.LinkedFlowScope$FlatFlowScopeCache");
        setField(linkedFlowScope, "com.google.javascript.jscomp.LinkedFlowScope", "flattened", flattened);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class linkedFlowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method narrowScopeMethod = typeInferenceClazz.getDeclaredMethod("narrowScope", linkedFlowScopeType, stringNodeType, jSTypeType);
        narrowScopeMethod.setAccessible(true);
        java.lang.Object[] narrowScopeMethodArguments = new java.lang.Object[3];
        narrowScopeMethodArguments[0] = linkedFlowScope;
        narrowScopeMethodArguments[1] = stringNode;
        narrowScopeMethodArguments[2] = ((Object) null);
        try {
            narrowScopeMethod.invoke(typeInference, narrowScopeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.isAddedAsNumber
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createUnionType(com.google.javascript.rhino.jstype.JSTypeNative[])}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return type.isSubtype(registry.createUnionType(VOID_TYPE, NULL_TYPE, NUMBER_VALUE_OR_OBJECT_TYPE, BOOLEAN_TYPE, BOOLEAN_OBJECT_TYPE));
 *  */
    @Test
    public void testIsAddedAsNumber_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.ArrayIndexOutOfBoundsException: Index 38 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:939)
            com.google.javascript.rhino.jstype.JSTypeRegistry.createUnionType(JSTypeRegistry.java:1092)
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:810) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isAddedAsNumber(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#createUnionType(com.google.javascript.rhino.jstype.JSTypeNative[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return type.isSubtype(registry.createUnionType(VOID_TYPE, NULL_TYPE, NUMBER_VALUE_OR_OBJECT_TYPE, BOOLEAN_TYPE, BOOLEAN_OBJECT_TYPE));
 *  */
    @Test
    public void testIsAddedAsNumber_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.isAddedAsNumber] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.isAddedAsNumber(TypeInference.java:810) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method isAddedAsNumberMethod = typeInferenceClazz.getDeclaredMethod("isAddedAsNumber", jSTypeType);
        isAddedAsNumberMethod.setAccessible(true);
        java.lang.Object[] isAddedAsNumberMethodArguments = new java.lang.Object[1];
        isAddedAsNumberMethodArguments[0] = ((Object) null);
        try {
            isAddedAsNumberMethod.invoke(typeInference, isAddedAsNumberMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.traverseAdd
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method traverseAdd(com.google.javascript.rhino.Node, com.google.javascript.jscomp.type.FlowScope)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAdd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testTraverseAdd_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:776) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", nodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = ((Object) null);
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#traverseAdd(com.google.javascript.rhino.Node,com.google.javascript.jscomp.type.FlowScope)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node right = left.getNext();
 *  */
    @Test
    public void testTraverseAdd_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.traverseAdd] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.traverseAdd(TypeInference.java:777) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Method traverseAddMethod = typeInferenceClazz.getDeclaredMethod("traverseAdd", numberNodeType, flowScopeType);
        traverseAddMethod.setAccessible(true);
        java.lang.Object[] traverseAddMethodArguments = new java.lang.Object[2];
        traverseAddMethodArguments[0] = numberNode;
        traverseAddMethodArguments[1] = ((Object) null);
        try {
            traverseAddMethod.invoke(typeInference, traverseAddMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.updateBind
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method updateBind(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateBind(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().describeFunctionBind(n, true)
 *  */
    @Test
    public void testUpdateBind_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateBind] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:960) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method updateBindMethod = typeInferenceClazz.getDeclaredMethod("updateBind", nodeType);
        updateBindMethod.setAccessible(true);
        java.lang.Object[] updateBindMethodArguments = new java.lang.Object[1];
        updateBindMethodArguments[0] = ((Object) null);
        try {
            updateBindMethod.invoke(typeInference, updateBindMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#updateBind(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().describeFunctionBind(n, true)
 *  */
    @Test
    public void testUpdateBind_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "compiler", compiler);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.updateBind] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.updateBind(TypeInference.java:960) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method updateBindMethod = typeInferenceClazz.getDeclaredMethod("updateBind", nodeType);
        updateBindMethod.setAccessible(true);
        java.lang.Object[] updateBindMethodArguments = new java.lang.Object[1];
        updateBindMethodArguments[0] = ((Object) null);
        try {
            updateBindMethod.invoke(typeInference, updateBindMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.redeclareSimpleVar
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isName()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(nameNode.isName());
 *  */
    @Test
    public void testRedeclareSimpleVar_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclareSimpleVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1547) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, nodeType, jSTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = ((Object) null);
        redeclareSimpleVarMethodArguments[2] = ((Object) null);
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType == null): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isUnflowable(syntacticScope.getVar(varName))
 *  */
    @Test
    public void testRedeclareSimpleVar_ThrowNullPointerException_1() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(38);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclareSimpleVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1552) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, stringNodeType, enumElementTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = stringNode;
        redeclareSimpleVarMethodArguments[2] = enumElementType;
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (varType == null): True}
 * @utbot.invokes com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.throwsException {@link java.lang.NullPointerException} when: isUnflowable(syntacticScope.getVar(varName))
 *  */
    @Test
    public void testRedeclareSimpleVar_ThrowNullPointerException_2() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(stringNode, "com.google.javascript.rhino.Node$StringNode", "str", str);
        (((Node) stringNode)).setType(38);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.redeclareSimpleVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.redeclareSimpleVar(TypeInference.java:1552) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, stringNodeType, jSTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = stringNode;
        redeclareSimpleVarMethodArguments[2] = ((Object) null);
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(nameNode.isName());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testRedeclareSimpleVar_ThrowIllegalStateException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, stringNodeType, jSTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = stringNode;
        redeclareSimpleVarMethodArguments[2] = ((Object) null);
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#redeclareSimpleVar(com.google.javascript.jscomp.type.FlowScope,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String varName = nameNode.getString();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testRedeclareSimpleVar_ThrowUnsupportedOperationException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Node node = new Node(38);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class flowScopeType = Class.forName("com.google.javascript.jscomp.type.FlowScope");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method redeclareSimpleVarMethod = typeInferenceClazz.getDeclaredMethod("redeclareSimpleVar", flowScopeType, nodeType, jSTypeType);
        redeclareSimpleVarMethod.setAccessible(true);
        java.lang.Object[] redeclareSimpleVarMethodArguments = new java.lang.Object[3];
        redeclareSimpleVarMethodArguments[0] = ((Object) null);
        redeclareSimpleVarMethodArguments[1] = node;
        redeclareSimpleVarMethodArguments[2] = ((Object) null);
        try {
            redeclareSimpleVarMethod.invoke(typeInference, redeclareSimpleVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return registry.getNativeType(typeId);}
 *  */
    @Test
    public void testGetNativeType_JSTypeRegistryGetNativeType() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeInferenceClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        JSType actual = ((JSType) getNativeTypeMethod.invoke(typeInference, getNativeTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeInferenceRegistry = ((JSTypeRegistry) getFieldValue(typeInference, "com.google.javascript.jscomp.TypeInference", "registry"));
        com.google.javascript.rhino.jstype.JSType[] typeInferenceRegistryRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeInferenceRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeInferenceRegistryNativeTypes0 = ((JSType) get(typeInferenceRegistryRegistryNativeTypes, 0));
        
        assertNull(finalTypeInferenceRegistryNativeTypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return registry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "registry", registry);
        JSTypeNative jSTypeNative = JSTypeNative.SYNTAX_ERROR_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 32 out of bounds for length 2]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:939)
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeInferenceClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        try {
            getNativeTypeMethod.invoke(typeInference, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return registry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getNativeType(TypeInference.java:1582) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeInferenceClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = ((Object) null);
        try {
            getNativeTypeMethod.invoke(typeInference, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.isUnflowable
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method isUnflowable(com.google.javascript.jscomp.Scope$Var)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VEqualsNullAndVIsLocalAndVIsMarkedEscapedAndVGetScopeEqualsSyntacticScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varType);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = ((Object) null);
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VEqualsNullAndVIsLocalAndVIsMarkedEscapedAndVGetScopeEqualsSyntacticScope_2() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", scope);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varType);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = var;
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (v.getScope() == syntacticScope): True}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VGetScopeEqualsSyntacticScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope syntacticScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(syntacticScope, "com.google.javascript.jscomp.Scope", "parent", syntacticScope);
        setField(typeInference, "com.google.javascript.jscomp.TypeInference", "syntacticScope", syntacticScope);
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", syntacticScope);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "markedEscaped", true);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varType);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = var;
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.executesCondition {@code (v.getScope() == syntacticScope): False}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VGetScopeNotEqualsSyntacticScope() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope.Var var = ((Scope.Var) createInstance("com.google.javascript.jscomp.Scope$Var"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(scope, "com.google.javascript.jscomp.Scope", "parent", scope);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "scope", scope);
        setField(var, "com.google.javascript.jscomp.Scope$Var", "markedEscaped", true);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class varType = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varType);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = var;
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#isUnflowable(com.google.javascript.jscomp.Scope.Var)}
 * @utbot.returnsFrom {@code return v != null && v.isLocal() && v.isMarkedEscaped() && v.getScope() == syntacticScope;}
 *  */
    @Test
    public void testIsUnflowable_VEqualsNullAndVIsLocalAndVIsMarkedEscapedAndVGetScopeEqualsSyntacticScope_1() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Scope scope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Class varClazz = Class.forName("com.google.javascript.jscomp.Scope$Var");
        Class booleanType = boolean.class;
        Class stringType = Class.forName("java.lang.String");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class scopeType = Class.forName("com.google.javascript.jscomp.Scope");
        Class intType = int.class;
        Class compilerInputType = Class.forName("com.google.javascript.jscomp.CompilerInput");
        Class anonymousPredicateType = Class.forName("com.google.javascript.jscomp.Scope$1");
        Constructor varConstructor = varClazz.getDeclaredConstructor(booleanType, stringType, nodeType, jSTypeType, scopeType, intType, compilerInputType, anonymousPredicateType);
        varConstructor.setAccessible(true);
        java.lang.Object[] varConstructorArguments = new java.lang.Object[8];
        varConstructorArguments[0] = false;
        varConstructorArguments[1] = ((Object) null);
        varConstructorArguments[2] = ((Object) null);
        varConstructorArguments[3] = ((Object) null);
        varConstructorArguments[4] = scope;
        varConstructorArguments[5] = 0;
        varConstructorArguments[6] = ((Object) null);
        varConstructorArguments[7] = ((Object) null);
        Scope.Var var = ((Scope.Var) varConstructor.newInstance(varConstructorArguments));
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Method isUnflowableMethod = typeInferenceClazz.getDeclaredMethod("isUnflowable", varClazz);
        isUnflowableMethod.setAccessible(true);
        java.lang.Object[] isUnflowableMethodArguments = new java.lang.Object[1];
        isUnflowableMethodArguments[0] = var;
        boolean actual = ((Boolean) isUnflowableMethod.invoke(typeInference, isUnflowableMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getBooleanOutcomes
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.BooleanLiteralSet#get(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.BooleanLiteralSet#intersection(com.google.javascript.rhino.jstype.BooleanLiteralSet)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.BooleanLiteralSet#union(com.google.javascript.rhino.jstype.BooleanLiteralSet)}
 * @utbot.returnsFrom {@code return right.union(left.intersection(BooleanLiteralSet.get(!condition)));}
 *  */
    @Test
    public void testGetBooleanOutcomes_RightUnion() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.BOTH;
        
        BooleanLiteralSet actual = TypeInference.getBooleanOutcomes(booleanLiteralSet, booleanLiteralSet, true);
        
        assertEquals(booleanLiteralSet, actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_2() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.BOTH;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472) */
        TypeInference.getBooleanOutcomes(booleanLiteralSet, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_3() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.EMPTY;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472) */
        TypeInference.getBooleanOutcomes(booleanLiteralSet, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_4() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.FALSE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472) */
        TypeInference.getBooleanOutcomes(booleanLiteralSet, null, true);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException() {
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472) */
        TypeInference.getBooleanOutcomes(null, null, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return right.union(left.intersection(BooleanLiteralSet.get(!condition)));
 *  */
    @Test
    public void testGetBooleanOutcomes_ThrowNullPointerException_1() {
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472) */
        TypeInference.getBooleanOutcomes(null, null, true);
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet, com.google.javascript.rhino.jstype.BooleanLiteralSet, boolean)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.TypeInference}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getBooleanOutcomes(com.google.javascript.rhino.jstype.BooleanLiteralSet,com.google.javascript.rhino.jstype.BooleanLiteralSet,boolean)}
     */
    @Test
    public void testGetBooleanOutcomesThrowsNPE() {
        BooleanLiteralSet booleanLiteralSet = BooleanLiteralSet.FALSE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getBooleanOutcomes] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getBooleanOutcomes(TypeInference.java:1472) */
        TypeInference.getBooleanOutcomes(null, booleanLiteralSet, true);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeInference.getJSType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.returnsFrom {@code return unknownType;}
 *  */
    @Test
    public void testGetJSType_JsTypeEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", numberNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = numberNode;
        JSType actual = ((JSType) getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments));
        
        assertNull(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): False}
 * @utbot.returnsFrom {@code return jsType;}
 *  */
    @Test
    public void testGetJSType_JsTypeNotEqualsNull() throws Exception  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", numberNodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = numberNode;
        EnumElementType actual = ((EnumElementType) getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments));
        
        JSType actualPrimitiveType = actual.getPrimitiveType();
        assertNull(actualPrimitiveType);
        
        ObjectType actualPrimitiveObjectType = ((ObjectType) getFieldValue(actual, "com.google.javascript.rhino.jstype.EnumElementType", "primitiveObjectType"));
        assertNull(actualPrimitiveObjectType);
        
        String actualName = ((String) getFieldValue(actual, "com.google.javascript.rhino.jstype.EnumElementType", "name"));
        assertNull(actualName);
        
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
        
        TemplateTypeMap actualTemplateTypeMap = actual.getTemplateTypeMap();
        assertNull(actualTemplateTypeMap);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeInference}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeInference#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = n.getJSType();
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException() throws Throwable  {
        TypeInference typeInference = ((TypeInference) createInstance("com.google.javascript.jscomp.TypeInference"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeInference.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeInference.getJSType(TypeInference.java:1569) */
        Class typeInferenceClazz = Class.forName("com.google.javascript.jscomp.TypeInference");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeInferenceClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = ((Object) null);
        try {
            getJSTypeMethod.invoke(typeInference, getJSTypeMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields919286496419200 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields919286496419200.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass919286496424700 = (java.lang.reflect.Field[]) methodForGetDeclaredFields919286496419200.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass919286496424700).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
        modifiersField.setAccessible(true);
        modifiersField.setInt(field, field.getModifiers() & ~java.lang.reflect.Modifier.FINAL);
    
        field.setAccessible(true);
        field.set(object, fieldValue);
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
    
    private static Object getFieldValue(Object obj, String fieldClassName, String fieldName) throws ClassNotFoundException, NoSuchMethodException, java.lang.reflect.InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        Class<?> clazz = Class.forName(fieldClassName);
        java.lang.reflect.Field field = clazz.getDeclaredField(fieldName);
        
        field.setAccessible(true);
        
        java.lang.reflect.Field modifiersField;
        
            java.lang.reflect.Method methodForGetDeclaredFields919286499946700 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields919286499946700.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass919286499949500 = (java.lang.reflect.Field[]) methodForGetDeclaredFields919286499946700.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass919286499949500).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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

