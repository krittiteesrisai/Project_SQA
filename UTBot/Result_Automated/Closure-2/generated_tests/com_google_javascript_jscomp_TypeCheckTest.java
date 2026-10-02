package com.google.javascript.jscomp;

import org.junit.Test;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.ParameterizedType;
import java.lang.reflect.Method;
import com.google.javascript.rhino.jstype.EnumElementType;
import com.google.javascript.rhino.jstype.TemplateType;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.NullType;
import java.util.LinkedList;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.jscomp.SourceFile.Preloaded;
import com.google.javascript.rhino.jstype.BooleanType;
import com.google.javascript.rhino.jstype.UnionType;
import java.util.ArrayList;
import com.google.javascript.rhino.jstype.StringType;
import com.google.javascript.rhino.jstype.Property;
import com.google.javascript.rhino.jstype.NumberType;
import com.google.javascript.rhino.jstype.NoObjectType;
import com.google.javascript.jscomp.CodingConventions.Proxy;
import java.util.LinkedHashSet;
import com.google.javascript.rhino.jstype.EnumType;
import java.util.ArrayDeque;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.jstype.NoType;
import java.lang.reflect.InvocationTargetException;
import com.google.javascript.rhino.jstype.AllType;
import com.google.javascript.rhino.jstype.UnknownType;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static java.lang.reflect.Array.get;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

public final class com_google_javascript_jscomp_TypeCheckTest {
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkPropertyAccess
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPropertyAccess(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyAccess(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} when: propType.isEquivalentTo(typeRegistry.getNativeType(UNKNOWN_TYPE))
 *  */
    @Test
    public void testCheckPropertyAccess_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropertyAccess] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.checkPropertyAccess(TypeCheck.java:1415) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyAccessMethod = typeCheckClazz.getDeclaredMethod("checkPropertyAccess", jSTypeType, stringType, nodeTraversalType, nodeType);
        checkPropertyAccessMethod.setAccessible(true);
        java.lang.Object[] checkPropertyAccessMethodArguments = new java.lang.Object[4];
        checkPropertyAccessMethodArguments[0] = ((Object) null);
        checkPropertyAccessMethodArguments[1] = ((Object) null);
        checkPropertyAccessMethodArguments[2] = ((Object) null);
        checkPropertyAccessMethodArguments[3] = node;
        try {
            checkPropertyAccessMethod.invoke(typeCheck, checkPropertyAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyAccess(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType propType = getJSType(n);
 *  */
    @Test
    public void testCheckPropertyAccess_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropertyAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.checkPropertyAccess(TypeCheck.java:1414) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyAccessMethod = typeCheckClazz.getDeclaredMethod("checkPropertyAccess", jSTypeType, stringType, nodeTraversalType, nodeType);
        checkPropertyAccessMethod.setAccessible(true);
        java.lang.Object[] checkPropertyAccessMethodArguments = new java.lang.Object[4];
        checkPropertyAccessMethodArguments[0] = ((Object) null);
        checkPropertyAccessMethodArguments[1] = ((Object) null);
        checkPropertyAccessMethodArguments[2] = ((Object) null);
        checkPropertyAccessMethodArguments[3] = ((Object) null);
        try {
            checkPropertyAccessMethod.invoke(typeCheck, checkPropertyAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyAccess(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: propType.isEquivalentTo(typeRegistry.getNativeType(UNKNOWN_TYPE))
 *  */
    @Test
    public void testCheckPropertyAccess_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropertyAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkPropertyAccess(TypeCheck.java:1415) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyAccessMethod = typeCheckClazz.getDeclaredMethod("checkPropertyAccess", jSTypeType, stringType, nodeTraversalType, nodeType);
        checkPropertyAccessMethod.setAccessible(true);
        java.lang.Object[] checkPropertyAccessMethodArguments = new java.lang.Object[4];
        checkPropertyAccessMethodArguments[0] = ((Object) null);
        checkPropertyAccessMethodArguments[1] = ((Object) null);
        checkPropertyAccessMethodArguments[2] = ((Object) null);
        checkPropertyAccessMethodArguments[3] = node;
        try {
            checkPropertyAccessMethod.invoke(typeCheck, checkPropertyAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyAccess(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType propType = getJSType(n);
 *  */
    @Test
    public void testCheckPropertyAccess_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropertyAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.checkPropertyAccess(TypeCheck.java:1414) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyAccessMethod = typeCheckClazz.getDeclaredMethod("checkPropertyAccess", jSTypeType, stringType, nodeTraversalType, nodeType);
        checkPropertyAccessMethod.setAccessible(true);
        java.lang.Object[] checkPropertyAccessMethodArguments = new java.lang.Object[4];
        checkPropertyAccessMethodArguments[0] = ((Object) null);
        checkPropertyAccessMethodArguments[1] = ((Object) null);
        checkPropertyAccessMethodArguments[2] = ((Object) null);
        checkPropertyAccessMethodArguments[3] = node;
        try {
            checkPropertyAccessMethod.invoke(typeCheck, checkPropertyAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyAccess(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (propType.isEquivalentTo(typeRegistry.getNativeType(UNKNOWN_TYPE))): True}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isEquivalentTo(com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#autobox()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: childType = childType.autobox();
 *  */
    @Test
    public void testCheckPropertyAccess_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        nativeTypes[35] = ((JSType) parameterizedType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", parameterizedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropertyAccess] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkPropertyAccess(TypeCheck.java:1416) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyAccessMethod = typeCheckClazz.getDeclaredMethod("checkPropertyAccess", jSTypeType, stringType, nodeTraversalType, nodeType);
        checkPropertyAccessMethod.setAccessible(true);
        java.lang.Object[] checkPropertyAccessMethodArguments = new java.lang.Object[4];
        checkPropertyAccessMethodArguments[0] = ((Object) null);
        checkPropertyAccessMethodArguments[1] = ((Object) null);
        checkPropertyAccessMethodArguments[2] = ((Object) null);
        checkPropertyAccessMethodArguments[3] = node;
        try {
            checkPropertyAccessMethod.invoke(typeCheck, checkPropertyAccessMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.check
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method check(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#check(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#traverseWithScope(com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: t.traverseWithScope(node, topScope);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheck_ThrowIllegalStateException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(topScope, "com.google.javascript.jscomp.Scope", "parent", topScope);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        Node node = new Node(0);
        
        typeCheck.check(node, false);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#check(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(node);
 *  */
    @Test(expected = NullPointerException.class)
    public void testCheck_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        typeCheck.check(null, false);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visit
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visit(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testVisit_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:485) */
        typeCheck.visit(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.THIS}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, t.getScope().getTypeOfThis());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(42);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:517) */
        typeCheck.visit(null, node, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visit(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: Token.CASE}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType switchType = getJSType(parent.getFirstChild());
 *  */
    @Test
    public void testVisit_ThrowNullPointerException_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(111);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visit] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visit(TypeCheck.java:763) */
        typeCheck.visit(null, node, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.process
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkNotNull(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node externsAndJs = jsRoot.getParent();
 *  */
    @Test
    public void testProcess_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.process] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.process(TypeCheck.java:367) */
        typeCheck.process(null, null);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method process(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(externsAndJs != null);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(externsAndJs != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        typeCheck.process(null, node);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(externsAndJs != null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(externsRoot == null || externsAndJs.hasChild(externsRoot));): True}
 * @utbot.executesCondition {@code (externsRoot == null || externsAndJs.hasChild(externsRoot)): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(externsRoot == null || externsAndJs.hasChild(externsRoot));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = typeCheckClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = node;
        try {
            processMethod.invoke(typeCheck, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(externsAndJs != null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(externsRoot == null || externsAndJs.hasChild(externsRoot));): True}
 * @utbot.executesCondition {@code (externsRoot == null || externsAndJs.hasChild(externsRoot)): True}
 * @utbot.executesCondition {@code (externsRoot != null): True}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeCheck#check(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: check(externsRoot, true);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcess_ThrowIllegalStateException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        Scope parent = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(topScope, "com.google.javascript.jscomp.Scope", "parent", parent);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", numberNode);
        setField(parent1, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent1);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processMethod = typeCheckClazz.getDeclaredMethod("process", numberNodeType, numberNodeType);
        processMethod.setAccessible(true);
        java.lang.Object[] processMethodArguments = new java.lang.Object[2];
        processMethodArguments[0] = numberNode;
        processMethodArguments[1] = stringNode;
        try {
            processMethod.invoke(typeCheck, processMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(scopeCreator);
 *  */
    @Test(expected = NullPointerException.class)
    public void testProcess_ThrowNullPointerException_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        typeCheck.process(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#process(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkNotNull(topScope);
 *  */
    @Test(expected = NullPointerException.class)
    public void testProcess_ThrowNullPointerException_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        typeCheck.process(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.report
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method report(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.executesCondition {@code (noTypeCheckSection == 0): False}
 *  */
    @Test
    public void testReport_NoTypeCheckSectionNotEqualsZero() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = ((Object) null);
        reportMethodArguments[1] = ((Object) null);
        reportMethodArguments[2] = ((Object) null);
        reportMethodArguments[3] = ((Object) null);
        reportMethod.invoke(typeCheck, reportMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method report(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.jstype.StaticSourceFile ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.StaticSourceFile is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1091)
            com.google.javascript.rhino.Node.getSourceFileName(Node.java:1085)
            com.google.javascript.jscomp.NodeTraversal.getBestSourceFileName(NodeTraversal.java:688)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:650)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:436) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, numberNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = numberNode;
        reportMethodArguments[2] = ((Object) null);
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:436) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = ((Object) null);
        reportMethodArguments[1] = ((Object) null);
        reportMethodArguments[2] = ((Object) null);
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        String sourceName = "";
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "sourceName", sourceName);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:171)
            com.google.javascript.jscomp.JSError.make(JSError.java:115)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:650)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:436) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = ((Object) null);
        reportMethodArguments[2] = ((Object) null);
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -256);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:171)
            com.google.javascript.jscomp.JSError.make(JSError.java:115)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:650)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:436) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = node;
        reportMethodArguments[2] = diagnosticType;
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "sourcePosition", -1);
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:171)
            com.google.javascript.jscomp.JSError.make(JSError.java:115)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:650)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:436) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = node;
        reportMethodArguments[2] = diagnosticType;
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t.report(n, diagnosticType, arguments);
 *  */
    @Test
    public void testReport_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        DiagnosticType diagnosticType = ((DiagnosticType) createInstance("com.google.javascript.jscomp.DiagnosticType"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.report] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JSError.<init>(JSError.java:157)
            com.google.javascript.jscomp.JSError.<init>(JSError.java:171)
            com.google.javascript.jscomp.JSError.make(JSError.java:115)
            com.google.javascript.jscomp.NodeTraversal.report(NodeTraversal.java:650)
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:436) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, nodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = ((Object) null);
        reportMethodArguments[2] = diagnosticType;
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method report(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.jscomp.DiagnosticType, [Ljava.lang.String;)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testReport_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, numberNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = numberNode;
        reportMethodArguments[2] = ((Object) null);
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#report(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.jscomp.DiagnosticType,java.lang.String[])}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testReport_ThrowUnsupportedOperationException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class diagnosticTypeType = Class.forName("com.google.javascript.jscomp.DiagnosticType");
        Class stringArrayType = Class.forName("[Ljava.lang.String;");
        Method reportMethod = typeCheckClazz.getDeclaredMethod("report", nodeTraversalType, numberNodeType, diagnosticTypeType, stringArrayType);
        reportMethod.setAccessible(true);
        java.lang.Object[] reportMethodArguments = new java.lang.Object[4];
        reportMethodArguments[0] = nodeTraversal;
        reportMethodArguments[1] = numberNode;
        reportMethodArguments[2] = ((Object) null);
        reportMethodArguments[3] = ((Object) null);
        try {
            reportMethod.invoke(typeCheck, reportMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkTypeofString
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkTypeofString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkTypeofString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.executesCondition {@code (!(s.equals("number") || s.equals("string") || s.equals("boolean") || s.equals("undefined") || s.equals("function") || s.equals("object") || s.equals("unknown"))): False}
 *  */
    @Test
    public void testCheckTypeofString_SEqualsOrSEqualsOrSEqualsOrSEqualsOrSEqualsOrSEqualsOrSEquals() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        String string = "number";
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method checkTypeofStringMethod = typeCheckClazz.getDeclaredMethod("checkTypeofString", nodeTraversalType, nodeType, stringType);
        checkTypeofStringMethod.setAccessible(true);
        java.lang.Object[] checkTypeofStringMethodArguments = new java.lang.Object[3];
        checkTypeofStringMethodArguments[0] = ((Object) null);
        checkTypeofStringMethodArguments[1] = ((Object) null);
        checkTypeofStringMethodArguments[2] = string;
        checkTypeofStringMethod.invoke(typeCheck, checkTypeofStringMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkTypeofString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.executesCondition {@code (!(s.equals("number") || s.equals("string") || s.equals("boolean") || s.equals("undefined") || s.equals("function") || s.equals("object") || s.equals("unknown"))): True}
 * @utbot.executesCondition {@code (if (!(s.equals("number") || s.equals("string") || s.equals("boolean") || s.equals("undefined") || s.equals("function") || s.equals("object") || s.equals("unknown"))) {
 *     validator.expectValidTypeofName(t, n, s);
 * }): False}
 *  */
    @Test
    public void testCheckTypeofString_NotSEqualsOrSEqualsOrSEqualsOrSEqualsOrSEqualsOrSEqualsOrSEquals() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        String string = "string";
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method checkTypeofStringMethod = typeCheckClazz.getDeclaredMethod("checkTypeofString", nodeTraversalType, nodeType, stringType);
        checkTypeofStringMethod.setAccessible(true);
        java.lang.Object[] checkTypeofStringMethodArguments = new java.lang.Object[3];
        checkTypeofStringMethodArguments[0] = ((Object) null);
        checkTypeofStringMethodArguments[1] = ((Object) null);
        checkTypeofStringMethodArguments[2] = string;
        checkTypeofStringMethod.invoke(typeCheck, checkTypeofStringMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkTypeofString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.executesCondition {@code (!(s.equals("number") || s.equals("string") || s.equals("boolean") || s.equals("undefined") || s.equals("function") || s.equals("object") || s.equals("unknown"))): True}
 * @utbot.executesCondition {@code (if (!(s.equals("number") || s.equals("string") || s.equals("boolean") || s.equals("undefined") || s.equals("function") || s.equals("object") || s.equals("unknown"))) {
 *     validator.expectValidTypeofName(t, n, s);
 * }): True}
 * @utbot.executesCondition {@code (if (!(s.equals("number") || s.equals("string") || s.equals("boolean") || s.equals("undefined") || s.equals("function") || s.equals("object") || s.equals("unknown"))) {
 *     validator.expectValidTypeofName(t, n, s);
 * }): False}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 *  */
    @Test
    public void testCheckTypeofString_NotSEqualsOrSEqualsOrSEqualsOrSEqualsOrSEqualsOrSEqualsOrSEquals_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        String string = "boolean";
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method checkTypeofStringMethod = typeCheckClazz.getDeclaredMethod("checkTypeofString", nodeTraversalType, nodeType, stringType);
        checkTypeofStringMethod.setAccessible(true);
        java.lang.Object[] checkTypeofStringMethodArguments = new java.lang.Object[3];
        checkTypeofStringMethodArguments[0] = ((Object) null);
        checkTypeofStringMethodArguments[1] = ((Object) null);
        checkTypeofStringMethodArguments[2] = string;
        checkTypeofStringMethod.invoke(typeCheck, checkTypeofStringMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkTypeofString(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkTypeofString(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String)}
 * @utbot.invokes {@link java.lang.String#equals(java.lang.Object)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !(s.equals("number") || s.equals("string") || s.equals("boolean") || s.equals("undefined") || s.equals("function") || s.equals("object") || s.equals("unknown"))
 *  */
    @Test
    public void testCheckTypeofString_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkTypeofString] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkTypeofString(TypeCheck.java:857) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method checkTypeofStringMethod = typeCheckClazz.getDeclaredMethod("checkTypeofString", nodeTraversalType, nodeType, stringType);
        checkTypeofStringMethod.setAccessible(true);
        java.lang.Object[] checkTypeofStringMethodArguments = new java.lang.Object[3];
        checkTypeofStringMethodArguments[0] = ((Object) null);
        checkTypeofStringMethodArguments[1] = ((Object) null);
        checkTypeofStringMethodArguments[2] = ((Object) null);
        try {
            checkTypeofStringMethod.invoke(typeCheck, checkTypeofStringMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.processForTesting
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method processForTesting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#processForTesting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(scopeCreator == null);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(scopeCreator == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessForTesting_ThrowIllegalStateException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        MemoizedScopeCreator scopeCreator = ((MemoizedScopeCreator) createInstance("com.google.javascript.jscomp.MemoizedScopeCreator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "scopeCreator", scopeCreator);
        
        typeCheck.processForTesting(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#processForTesting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(scopeCreator == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(topScope == null);): False}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(topScope == null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessForTesting_ThrowIllegalStateException_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Scope topScope = ((Scope) createInstance("com.google.javascript.jscomp.Scope"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "topScope", topScope);
        
        typeCheck.processForTesting(null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#processForTesting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(scopeCreator == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(topScope == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(jsRoot.getParent() != null);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: Preconditions.checkState(jsRoot.getParent() != null);
 *  */
    @Test(expected = IllegalStateException.class)
    public void testProcessForTesting_ThrowIllegalStateException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method processForTestingMethod = typeCheckClazz.getDeclaredMethod("processForTesting", nodeType, nodeType);
        processForTestingMethod.setAccessible(true);
        java.lang.Object[] processForTestingMethodArguments = new java.lang.Object[2];
        processForTestingMethodArguments[0] = ((Object) null);
        processForTestingMethodArguments[1] = numberNode;
        try {
            processForTestingMethod.invoke(typeCheck, processForTestingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method processForTesting(com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#processForTesting(com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (Preconditions.checkState(scopeCreator == null);): True}
 * @utbot.executesCondition {@code (Preconditions.checkState(topScope == null);): True}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkState(boolean)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(jsRoot.getParent() != null);
 *  */
    @Test
    public void testProcessForTesting_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.processForTesting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.processForTesting(TypeCheck.java:383) */
        typeCheck.processForTesting(null, null);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitAssign
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lvalue.isGetProp()): False}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType leftType = getJSType(lvalue);
 *  */
    @Test
    public void testVisitAssign_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(2);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:970) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, nodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = node;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSDocInfo info = assign.getJSDocInfo();
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:892) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, nodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = ((Object) null);
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lvalue.isGetProp()
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:897) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, numberNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = numberNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lvalue.isGetProp()): False}
 * @utbot.executesCondition {@code (lvalue.isQualifiedName()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType rightType = getJSType(rightChild);
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:994) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, numberNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = numberNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lvalue.isGetProp()): False}
 * @utbot.executesCondition {@code (lvalue.isQualifiedName()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType rvalueType = getJSType(assign.getLastChild());
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:973) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, nodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = node;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lvalue.isGetProp()): True}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String pname = property.getString();
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(first, "com.google.javascript.rhino.Node", "first", first);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:901) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, nodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = node;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lvalue.isGetProp()
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:897) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, numberNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = numberNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lvalue.isGetProp()): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType leftType = getJSType(lvalue);
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:970) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, numberNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = numberNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lvalue.isGetProp()): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType objectJsType = getJSType(object);
 *  */
    @Test
    public void testVisitAssign_ThrowNullPointerException_7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(33);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitAssign(TypeCheck.java:899) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, numberNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = numberNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSDocInfo info = assign.getJSDocInfo();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisitAssign_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, numberNodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = numberNode;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (lvalue.isGetProp()): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isQualifiedName()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: lvalue.isQualifiedName()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisitAssign_ThrowUnsupportedOperationException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitAssignMethod = typeCheckClazz.getDeclaredMethod("visitAssign", nodeTraversalType, nodeType);
        visitAssignMethod.setAccessible(true);
        java.lang.Object[] visitAssignMethodArguments = new java.lang.Object[2];
        visitAssignMethodArguments[0] = ((Object) null);
        visitAssignMethodArguments[1] = node;
        try {
            visitAssignMethod.invoke(typeCheck, visitAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.shouldTraverse
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testShouldTraverse_ReturnTrue_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -255);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        boolean actual = ((Boolean) shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.JSDocInfo ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1851)
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:420)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:443) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        try {
            shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:414)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:443) */
        typeCheck.shouldTraverse(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: final Scope outerScope = t.getScope();
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:447) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        try {
            shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:443) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        try {
            shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:443) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        try {
            shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -1);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 32);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:443) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        try {
            shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(118);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:443) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        try {
            shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: checkNoTypeCheckSection(n, true);
 *  */
    @Test
    public void testShouldTraverse_ThrowNullPointerException_6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.shouldTraverse] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428)
            com.google.javascript.jscomp.TypeCheck.shouldTraverse(TypeCheck.java:443) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        try {
            shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method shouldTraverse(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#shouldTraverse(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} 
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testShouldTraverse_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(86);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method shouldTraverseMethod = typeCheckClazz.getDeclaredMethod("shouldTraverse", nodeTraversalType, numberNodeType, numberNodeType);
        shouldTraverseMethod.setAccessible(true);
        java.lang.Object[] shouldTraverseMethodArguments = new java.lang.Object[3];
        shouldTraverseMethodArguments[0] = ((Object) null);
        shouldTraverseMethodArguments[1] = numberNode;
        shouldTraverseMethodArguments[2] = ((Object) null);
        try {
            shouldTraverseMethod.invoke(typeCheck, shouldTraverseMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitGetProp
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitGetProp(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitGetProp_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1390) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, numberNodeType, numberNodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = numberNode;
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node property = n.getLastChild();
 *  */
    @Test
    public void testVisitGetProp_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1388) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, nodeType, nodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = ((Object) null);
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(objNode);
 *  */
    @Test
    public void testVisitGetProp_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1390) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, numberNodeType, numberNodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = numberNode;
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(objNode);
 *  */
    @Test
    public void testVisitGetProp_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1390) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, numberNodeType, numberNodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = numberNode;
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetProp(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isDict()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: childType.isDict()
 *  */
    @Test
    public void testVisitGetProp_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetProp] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitGetProp(TypeCheck.java:1392) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetPropMethod = typeCheckClazz.getDeclaredMethod("visitGetProp", nodeTraversalType, numberNodeType, numberNodeType);
        visitGetPropMethod.setAccessible(true);
        java.lang.Object[] visitGetPropMethodArguments = new java.lang.Object[3];
        visitGetPropMethodArguments[0] = ((Object) null);
        visitGetPropMethodArguments[1] = numberNode;
        visitGetPropMethodArguments[2] = ((Object) null);
        try {
            visitGetPropMethod.invoke(typeCheck, visitGetPropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitName
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testVisitName_ParentNodeTypeEqualsTokenFUNCTION() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, nodeType, nodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = ((Object) null);
        visitNameMethodArguments[2] = stringNode;
        boolean actual = ((Boolean) visitNameMethod.invoke(typeCheck, visitNameMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.PARAM_LIST): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testVisitName_ParentNodeTypeEqualsTokenPARAM_LIST() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(83);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, nodeType, nodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = ((Object) null);
        visitNameMethodArguments[2] = stringNode;
        boolean actual = ((Boolean) visitNameMethod.invoke(typeCheck, visitNameMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.PARAM_LIST): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.VAR): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testVisitName_ParentNodeTypeEqualsTokenVAR() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(118);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, nodeType, nodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = ((Object) null);
        visitNameMethodArguments[2] = stringNode;
        boolean actual = ((Boolean) visitNameMethod.invoke(typeCheck, visitNameMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): True}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testVisitName_ParentNodeTypeEqualsTokenCATCH() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(120);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, nodeType, nodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = ((Object) null);
        visitNameMethodArguments[2] = stringNode;
        boolean actual = ((Boolean) visitNameMethod.invoke(typeCheck, visitNameMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.PARAM_LIST): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.VAR): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = n.getJSType();
 *  */
    @Test
    public void testVisitName_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1360) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, nodeType, nodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = ((Object) null);
        visitNameMethodArguments[2] = stringNode;
        try {
            visitNameMethod.invoke(typeCheck, visitNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: int parentNodeType = parent.getType();
 *  */
    @Test
    public void testVisitName_ThrowNullPointerException() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1352) */
        typeCheck.visitName(null, null, null);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.PARAM_LIST): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.VAR): False}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type = getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testVisitName_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(-255);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1362) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, stringNodeType, stringNodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = stringNode;
        visitNameMethodArguments[2] = stringNode1;
        try {
            visitNameMethod.invoke(typeCheck, visitNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitName(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (parentNodeType == Token.FUNCTION): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.CATCH): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.PARAM_LIST): False}
 * @utbot.executesCondition {@code (parentNodeType == Token.VAR): False}
 * @utbot.executesCondition {@code (type == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Var var = t.getScope().getVar(n.getString());
 *  */
    @Test
    public void testVisitName_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object stringNode1 = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode1)).setType(4);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1363) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, stringNodeType, stringNodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = stringNode;
        visitNameMethodArguments[2] = stringNode1;
        try {
            visitNameMethod.invoke(typeCheck, visitNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitName1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        Node node1 = new Node(0);
        
        boolean actual = typeCheck.visitName(null, node, node1);
        
        assertTrue(actual);
    }
    
    @Test
    public void testVisitName2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        NullType jsType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, numberNodeType, numberNodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = numberNode;
        visitNameMethodArguments[2] = stringNode;
        boolean actual = ((Boolean) visitNameMethod.invoke(typeCheck, visitNameMethodArguments));
        
        assertTrue(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitName3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1362) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, numberNodeType, numberNodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = numberNode;
        visitNameMethodArguments[2] = node;
        try {
            visitNameMethod.invoke(typeCheck, visitNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitName4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitName] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:598)
            com.google.javascript.jscomp.TypeCheck.visitName(TypeCheck.java:1363) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, stringNodeType, stringNodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = nodeTraversal;
        visitNameMethodArguments[1] = stringNode;
        visitNameMethodArguments[2] = numberNode;
        try {
            visitNameMethod.invoke(typeCheck, visitNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitName(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testVisitName5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        NullType jsType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNameMethod = typeCheckClazz.getDeclaredMethod("visitName", nodeTraversalType, numberNodeType, numberNodeType);
        visitNameMethod.setAccessible(true);
        java.lang.Object[] visitNameMethodArguments = new java.lang.Object[3];
        visitNameMethodArguments[0] = ((Object) null);
        visitNameMethodArguments[1] = numberNode;
        visitNameMethodArguments[2] = stringNode;
        try {
            visitNameMethod.invoke(typeCheck, visitNameMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitObjLitKey
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitObjLitKey(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitObjLitKey(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: objlit.isFromExterns()
 *  */
    @Test
    public void testVisitObjLitKey_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        int[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitObjLitKey] produces [java.lang.ClassCastException: class [I cannot be cast to class com.google.javascript.rhino.jstype.StaticSourceFile ([I is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.jstype.StaticSourceFile is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.Node.getStaticSourceFile(Node.java:1091)
            com.google.javascript.rhino.Node.isFromExterns(Node.java:1109)
            com.google.javascript.jscomp.TypeCheck.visitObjLitKey(TypeCheck.java:1063) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitObjLitKey(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objlit.isFromExterns()
 *  */
    @Test
    public void testVisitObjLitKey_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitObjLitKey] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitObjLitKey(TypeCheck.java:1063) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = ((Object) null);
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitObjLitKey(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: litType.isStruct() && key.isQuotedString()
 *  */
    @Test
    public void testVisitObjLitKey_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitObjLitKey] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitObjLitKey(TypeCheck.java:1069) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitObjLitKey(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: litType.isStruct() && key.isQuotedString()
 *  */
    @Test
    public void testVisitObjLitKey_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SimpleSourceFile objectValue = ((SimpleSourceFile) createInstance("com.google.javascript.rhino.jstype.SimpleSourceFile"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitObjLitKey] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitObjLitKey(TypeCheck.java:1069) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitObjLitKey(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: litType.isStruct() && key.isQuotedString()
 *  */
    @Test
    public void testVisitObjLitKey_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitObjLitKey] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitObjLitKey(TypeCheck.java:1069) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitObjLitKey(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, key);
 *  */
    @Test
    public void testVisitObjLitKey_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "isExternFile", true);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitObjLitKey] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1938)
            com.google.javascript.jscomp.TypeCheck.visitObjLitKey(TypeCheck.java:1064) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitObjLitKey(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitObjLitKey(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isFromExterns()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} when: objlit.isFromExterns()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisitObjLitKey_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visitObjLitKey(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testVisitObjLitKey1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[35] = ((JSType) anonymousFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object numberNode1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "isExternFile", true);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(numberNode1, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, numberNodeType, numberNodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = nodeTraversal;
        visitObjLitKeyMethodArguments[1] = numberNode;
        visitObjLitKeyMethodArguments[2] = numberNode1;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes36 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 36));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes36);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitObjLitKey(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = StackOverflowError.class)
    public void testVisitObjLitKey2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(0);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, templateTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = templateType;
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisitObjLitKey3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, numberNodeType, numberNodeType, templateTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = nodeTraversal;
        visitObjLitKeyMethodArguments[1] = numberNode;
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = templateType;
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testVisitObjLitKey4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, numberNodeType, numberNodeType, parameterizedTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = nodeTraversal;
        visitObjLitKeyMethodArguments[1] = numberNode;
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = parameterizedType;
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitObjLitKey5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        SourceFile.Preloaded objectValue = ((SourceFile.Preloaded) createInstance("com.google.javascript.jscomp.SourceFile$Preloaded"));
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "isExternFile", true);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitObjLitKey] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 6]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1938)
            com.google.javascript.jscomp.TypeCheck.visitObjLitKey(TypeCheck.java:1064) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitObjLitKey6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSSourceFile objectValue = ((JSSourceFile) createInstance("com.google.javascript.jscomp.JSSourceFile"));
        setField(objectValue, "com.google.javascript.jscomp.SourceFile", "isExternFile", true);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(stringNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitObjLitKey] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1966)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1938)
            com.google.javascript.jscomp.TypeCheck.visitObjLitKey(TypeCheck.java:1064) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, numberNodeType, numberNodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = nodeTraversal;
        visitObjLitKeyMethodArguments[1] = numberNode;
        visitObjLitKeyMethodArguments[2] = stringNode;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitObjLitKey7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 51);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType2 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitObjLitKey] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:188)
            com.google.javascript.rhino.jstype.ParameterizedType.isStruct(ParameterizedType.java:52)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:188)
            com.google.javascript.rhino.jstype.TemplateType.isStruct(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:188)
            com.google.javascript.rhino.jstype.TemplateType.isStruct(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.isStruct(ProxyObjectType.java:188)
            com.google.javascript.rhino.jstype.ParameterizedType.isStruct(ParameterizedType.java:52)
            com.google.javascript.jscomp.TypeCheck.visitObjLitKey(TypeCheck.java:1069) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class parameterizedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, numberNodeType, numberNodeType, parameterizedTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = nodeTraversal;
        visitObjLitKeyMethodArguments[1] = numberNode;
        visitObjLitKeyMethodArguments[2] = node;
        visitObjLitKeyMethodArguments[3] = parameterizedType;
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method visitObjLitKey(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test(timeout = 1000L)
    public void testVisitObjLitKey8() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method visitObjLitKeyMethod = typeCheckClazz.getDeclaredMethod("visitObjLitKey", nodeTraversalType, nodeType, nodeType, jSTypeType);
        visitObjLitKeyMethod.setAccessible(true);
        java.lang.Object[] visitObjLitKeyMethodArguments = new java.lang.Object[4];
        visitObjLitKeyMethodArguments[0] = ((Object) null);
        visitObjLitKeyMethodArguments[1] = ((Object) null);
        visitObjLitKeyMethodArguments[2] = numberNode;
        visitObjLitKeyMethodArguments[3] = ((Object) null);
        try {
            visitObjLitKeyMethod.invoke(typeCheck, visitObjLitKeyMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkPropCreation
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkPropCreation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 *  */
    @Test
    public void testCheckPropCreation_NodeIsGetProp() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = numberNode;
        checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPropCreation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testCheckPropCreation_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.checkPropCreation(TypeCheck.java:1008) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = numberNode;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: lvalue.isGetProp()
 *  */
    @Test
    public void testCheckPropCreation_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkPropCreation(TypeCheck.java:1005) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, nodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = ((Object) null);
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType objType = getJSType(obj);
 *  */
    @Test
    public void testCheckPropCreation_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.checkPropCreation(TypeCheck.java:1008) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = numberNode;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String pname = prop.getString();
 *  */
    @Test
    public void testCheckPropCreation_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkPropCreation(TypeCheck.java:1009) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = numberNode;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType objType = getJSType(obj);
 *  */
    @Test
    public void testCheckPropCreation_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.checkPropCreation(TypeCheck.java:1008) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, nodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = node;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String pname = prop.getString();
 *  */
    @Test
    public void testCheckPropCreation_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkPropCreation(TypeCheck.java:1009) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, nodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = node;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isStruct()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: objType.isStruct() && !objType.hasProperty(pname)
 *  */
    @Test
    public void testCheckPropCreation_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkPropCreation(TypeCheck.java:1010) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = numberNode;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkPropCreation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String pname = prop.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckPropCreation_ThrowIllegalStateException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, nodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = node;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropCreation(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String pname = prop.getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckPropCreation_ThrowIllegalStateException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, nodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = node;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkPropCreation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testCheckPropCreation1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        BooleanType jsType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = nodeTraversal;
        checkPropCreationMethodArguments[1] = numberNode;
        checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkPropCreation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testCheckPropCreation2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, nodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = nodeTraversal;
        checkPropCreationMethodArguments[1] = node;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCheckPropCreation3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = nodeTraversal;
        checkPropCreationMethodArguments[1] = numberNode;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCheckPropCreation4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        nativeTypes[35] = ((JSType) parameterizedType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.NullPointerException] */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = nodeTraversal;
        checkPropCreationMethodArguments[1] = numberNode;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCheckPropCreation5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[35] = ((JSType) anonymousFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSTypeRegistry$1.getConstructor(JSTypeRegistry.java:527)
            com.google.javascript.rhino.jstype.JSType.isStruct(JSType.java:306)
            com.google.javascript.jscomp.TypeCheck.checkPropCreation(TypeCheck.java:1010) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = nodeTraversal;
        checkPropCreationMethodArguments[1] = numberNode;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCheckPropCreation6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType3 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType2, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType3);
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropCreation] produces [java.lang.NullPointerException] */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, nodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = ((Object) null);
        checkPropCreationMethodArguments[1] = node;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkPropCreation(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testCheckPropCreation7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[0] = ((JSType) enumElementType);
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        nativeTypes[13] = ((JSType) enumElementType);
        nativeTypes[14] = ((JSType) enumElementType);
        nativeTypes[15] = ((JSType) enumElementType);
        nativeTypes[16] = ((JSType) enumElementType);
        nativeTypes[17] = ((JSType) enumElementType);
        nativeTypes[18] = ((JSType) enumElementType);
        nativeTypes[19] = ((JSType) enumElementType);
        nativeTypes[20] = ((JSType) enumElementType);
        nativeTypes[21] = ((JSType) enumElementType);
        nativeTypes[22] = ((JSType) enumElementType);
        nativeTypes[23] = ((JSType) enumElementType);
        nativeTypes[24] = ((JSType) enumElementType);
        nativeTypes[25] = ((JSType) enumElementType);
        nativeTypes[26] = ((JSType) enumElementType);
        nativeTypes[27] = ((JSType) enumElementType);
        nativeTypes[28] = ((JSType) enumElementType);
        nativeTypes[29] = ((JSType) enumElementType);
        nativeTypes[30] = ((JSType) enumElementType);
        nativeTypes[31] = ((JSType) enumElementType);
        nativeTypes[32] = ((JSType) enumElementType);
        nativeTypes[33] = ((JSType) enumElementType);
        nativeTypes[34] = ((JSType) enumElementType);
        nativeTypes[36] = ((JSType) enumElementType);
        nativeTypes[37] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropCreationMethod = typeCheckClazz.getDeclaredMethod("checkPropCreation", nodeTraversalType, numberNodeType);
        checkPropCreationMethod.setAccessible(true);
        java.lang.Object[] checkPropCreationMethodArguments = new java.lang.Object[2];
        checkPropCreationMethodArguments[0] = nodeTraversal;
        checkPropCreationMethodArguments[1] = numberNode;
        try {
            checkPropCreationMethod.invoke(typeCheck, checkPropCreationMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitNew
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitNew(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitNew_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1539) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, nodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = node;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node constructor = n.getFirstChild();
 *  */
    @Test
    public void testVisitNew_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1538) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, nodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = ((Object) null);
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(constructor).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testVisitNew_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1539) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, numberNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = numberNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(constructor).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testVisitNew_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1539) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, nodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = node;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitNew(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = getJSType(constructor).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testVisitNew_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1539) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, stringNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = stringNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitNew(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitNew1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NullType jsType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NullType.restrictByNotNullOrUndefined(NullType.java:84)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1539) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, stringNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = nodeTraversal;
        visitNewMethodArguments[1] = stringNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitNew2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:209)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1539) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, stringNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = stringNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitNew3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        nativeTypes[35] = ((JSType) errorFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isEmptyType(JSType.java:202)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1540) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, numberNodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = ((Object) null);
        visitNewMethodArguments[1] = numberNode;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitNew4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnionType jsType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(jsType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitNew] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:306)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:318)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:212)
            com.google.javascript.jscomp.TypeCheck.visitNew(TypeCheck.java:1539) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitNewMethod = typeCheckClazz.getDeclaredMethod("visitNew", nodeTraversalType, nodeType);
        visitNewMethod.setAccessible(true);
        java.lang.Object[] visitNewMethodArguments = new java.lang.Object[2];
        visitNewMethodArguments[0] = nodeTraversal;
        visitNewMethodArguments[1] = node;
        try {
            visitNewMethod.invoke(typeCheck, visitNewMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitGetElem
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitGetElem_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1492) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1492) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = ((Object) null);
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1492) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, numberNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = numberNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectIndexMatch(t, n, getJSType(n.getFirstChild()), getJSType(n.getLastChild()));
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1491) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, numberNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = numberNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1492) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, stringNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = stringNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1492) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, numberNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = numberNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: t
 *  */
    @Test
    public void testVisitGetElem_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1492) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, stringNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = stringNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitGetElem(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#expectIndexMatch(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: validator.expectIndexMatch(t, n, getJSType(n.getFirstChild()), getJSType(n.getLastChild()));
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisitGetElem_ThrowIllegalStateException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(-255);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, stringNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = stringNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitGetElem1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(35);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException] */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, stringNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = nodeTraversal;
        visitGetElemMethodArguments[1] = stringNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetElem2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException] */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, numberNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = nodeTraversal;
        visitGetElemMethodArguments[1] = numberNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetElem3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(35);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        NullType jsType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType1);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.NullType.restrictByNotNullOrUndefined(NullType.java:84)
            com.google.javascript.rhino.jstype.JSType.autobox(JSType.java:886)
            com.google.javascript.rhino.jstype.JSType.dereference(JSType.java:898)
            com.google.javascript.jscomp.TypeValidator.expectIndexMatch(TypeValidator.java:335)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1491) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, numberNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = numberNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitGetElem4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        StringType jsType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitGetElem] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitGetElem(TypeCheck.java:1492) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, numberNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = numberNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitGetElem(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testVisitGetElem5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[0] = ((JSType) enumElementType);
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        nativeTypes[13] = ((JSType) enumElementType);
        nativeTypes[14] = ((JSType) enumElementType);
        nativeTypes[15] = ((JSType) enumElementType);
        nativeTypes[16] = ((JSType) enumElementType);
        nativeTypes[17] = ((JSType) enumElementType);
        nativeTypes[18] = ((JSType) enumElementType);
        nativeTypes[19] = ((JSType) enumElementType);
        nativeTypes[20] = ((JSType) enumElementType);
        nativeTypes[21] = ((JSType) enumElementType);
        nativeTypes[22] = ((JSType) enumElementType);
        nativeTypes[23] = ((JSType) enumElementType);
        nativeTypes[24] = ((JSType) enumElementType);
        nativeTypes[25] = ((JSType) enumElementType);
        nativeTypes[26] = ((JSType) enumElementType);
        nativeTypes[27] = ((JSType) enumElementType);
        nativeTypes[28] = ((JSType) enumElementType);
        nativeTypes[29] = ((JSType) enumElementType);
        nativeTypes[30] = ((JSType) enumElementType);
        nativeTypes[31] = ((JSType) enumElementType);
        nativeTypes[32] = ((JSType) enumElementType);
        nativeTypes[33] = ((JSType) enumElementType);
        nativeTypes[34] = ((JSType) enumElementType);
        nativeTypes[36] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = nodeTraversal;
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testVisitGetElem6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        StringType jsType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, numberNodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = ((Object) null);
        visitGetElemMethodArguments[1] = numberNode;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testVisitGetElem7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[40];
        BooleanType booleanType = ((BooleanType) createInstance("com.google.javascript.rhino.jstype.BooleanType"));
        nativeTypes[35] = ((JSType) booleanType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitGetElemMethod = typeCheckClazz.getDeclaredMethod("visitGetElem", nodeTraversalType, nodeType);
        visitGetElemMethod.setAccessible(true);
        java.lang.Object[] visitGetElemMethodArguments = new java.lang.Object[2];
        visitGetElemMethodArguments[0] = nodeTraversal;
        visitGetElemMethodArguments[1] = node;
        try {
            visitGetElemMethod.invoke(typeCheck, visitGetElemMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitParameterList
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitParameterList(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitParameterList(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#children()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Iterator<Node> arguments = call.children().iterator();
 *  */
    @Test
    public void testVisitParameterList_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitParameterList] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitParameterList(TypeCheck.java:1739) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method visitParameterListMethod = typeCheckClazz.getDeclaredMethod("visitParameterList", nodeTraversalType, nodeType, functionTypeType);
        visitParameterListMethod.setAccessible(true);
        java.lang.Object[] visitParameterListMethodArguments = new java.lang.Object[3];
        visitParameterListMethodArguments[0] = ((Object) null);
        visitParameterListMethodArguments[1] = ((Object) null);
        visitParameterListMethodArguments[2] = ((Object) null);
        try {
            visitParameterListMethod.invoke(typeCheck, visitParameterListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitParameterList(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testVisitParameterList1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitParameterList] produces [java.util.NoSuchElementException]
            java.base/java.util.Collections$EmptyIterator.next(Collections.java:4310)
            com.google.javascript.jscomp.TypeCheck.visitParameterList(TypeCheck.java:1740) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method visitParameterListMethod = typeCheckClazz.getDeclaredMethod("visitParameterList", nodeTraversalType, numberNodeType, functionTypeType);
        visitParameterListMethod.setAccessible(true);
        java.lang.Object[] visitParameterListMethodArguments = new java.lang.Object[3];
        visitParameterListMethodArguments[0] = nodeTraversal;
        visitParameterListMethodArguments[1] = numberNode;
        visitParameterListMethodArguments[2] = ((Object) null);
        try {
            visitParameterListMethod.invoke(typeCheck, visitParameterListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitParameterList2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitParameterList] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitParameterList(TypeCheck.java:1742) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method visitParameterListMethod = typeCheckClazz.getDeclaredMethod("visitParameterList", nodeTraversalType, numberNodeType, functionTypeType);
        visitParameterListMethod.setAccessible(true);
        java.lang.Object[] visitParameterListMethodArguments = new java.lang.Object[3];
        visitParameterListMethodArguments[0] = nodeTraversal;
        visitParameterListMethodArguments[1] = numberNode;
        visitParameterListMethodArguments[2] = ((Object) null);
        try {
            visitParameterListMethod.invoke(typeCheck, visitParameterListMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitVar
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitVar(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasOneChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.hasOneChild()
 *  */
    @Test
    public void testVisitVar_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1507) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, nodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = ((Object) null);
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitVar(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#hasOneChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: n.getJSDocInfo()
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testVisitVar_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, nodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = node;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitVar1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, nodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = nodeTraversal;
        visitVarMethodArguments[1] = node;
        visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitVar2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1511) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, nodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = node;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitVar3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:597)
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1511) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, nodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = nodeTraversal;
        visitVarMethodArguments[1] = node;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitVar4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:597)
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1511) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, nodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = nodeTraversal;
        visitVarMethodArguments[1] = node;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitVar5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitVar] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitVar(TypeCheck.java:1511) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, nodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = node;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method visitVar(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testVisitVar6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "last", first);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitVarMethod = typeCheckClazz.getDeclaredMethod("visitVar", nodeTraversalType, nodeType);
        visitVarMethod.setAccessible(true);
        java.lang.Object[] visitVarMethodArguments = new java.lang.Object[2];
        visitVarMethodArguments[0] = ((Object) null);
        visitVarMethodArguments[1] = node;
        try {
            visitVarMethod.invoke(typeCheck, visitVarMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitFunction
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getSuperClassConstructor()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: FunctionType baseConstructor = functionType.getSuperClassConstructor();
 *  */
    @Test
    public void testVisitFunction_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        NumberType type = ((NumberType) createInstance("com.google.javascript.rhino.jstype.NumberType"));
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.NumberType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.NumberType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:384)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:833)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1605) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, numberNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = numberNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: FunctionType functionType = JSType.toMaybeFunctionType(n.getJSType());
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1602) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = ((Object) null);
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String functionPrivateName = n.getFirstChild().getString();
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1603) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = node;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String functionPrivateName = n.getFirstChild().getString();
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1603) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, stringNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = stringNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: String functionPrivateName = n.getFirstChild().getString();
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        NoObjectType jsType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1603) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, stringNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = stringNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: functionType.isConstructor()
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1604) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = node;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} 
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        Object jsType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:833)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1605) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, numberNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = numberNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#getExtendedInterfaces()}
 * @utbot.invokes {@link java.lang.Iterable#iterator()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: for(ObjectType extInterface: functionType.getExtendedInterfaces())
 *  */
    @Test
    public void testVisitFunction_ThrowNullPointerException_6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1646) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, numberNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = numberNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String functionPrivateName = n.getFirstChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisitFunction_ThrowIllegalStateException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = node;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitFunction(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String functionPrivateName = n.getFirstChild().getString();
 *  */
    @Test(expected = IllegalStateException.class)
    public void testVisitFunction_ThrowIllegalStateException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = node;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitFunction1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(jsType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:833)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1605) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, stringNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = stringNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object jsType = createInstance("com.google.javascript.rhino.jstype.IndexedType");
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeFunctionType(ProxyObjectType.java:214)
            com.google.javascript.rhino.jstype.JSType.toMaybeFunctionType(JSType.java:382)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1602) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, numberNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = nodeTraversal;
        visitFunctionMethodArguments[1] = numberNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        String str = "";
        setField(first, "com.google.javascript.rhino.Node$StringNode", "str", str);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        Object type = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1606) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, nodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = nodeTraversal;
        visitFunctionMethodArguments[1] = node;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object ownerFunction = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:379)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:833)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1605) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, numberNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = numberNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        NoObjectType ownerFunction = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:379)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:833)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1605) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, numberNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = numberNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(jsType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:379)
            com.google.javascript.rhino.jstype.FunctionType.getSuperClassConstructor(FunctionType.java:833)
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1605) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, stringNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = ((Object) null);
        visitFunctionMethodArguments[1] = stringNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitFunction7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(jsType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ArrayList extendedInterfaces = new ArrayList();
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        extendedInterfaces.add(null);
        jsType.setExtendedInterfaces(extendedInterfaces);
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitFunction] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitFunction(TypeCheck.java:1647) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, stringNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = nodeTraversal;
        visitFunctionMethodArguments[1] = stringNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method visitFunction(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testVisitFunction8() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitFunctionMethod = typeCheckClazz.getDeclaredMethod("visitFunction", nodeTraversalType, stringNodeType);
        visitFunctionMethod.setAccessible(true);
        java.lang.Object[] visitFunctionMethodArguments = new java.lang.Object[2];
        visitFunctionMethodArguments[0] = nodeTraversal;
        visitFunctionMethodArguments[1] = stringNode;
        try {
            visitFunctionMethod.invoke(typeCheck, visitFunctionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.isPropertyTest
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method isPropertyTest(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return true;}
 *  */
    @Test
    public void testIsPropertyTest_ReturnTrue() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(32);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testIsPropertyTest_ReturnFalse() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(-255);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return parent.getFirstChild() != getProp && compiler.getCodingConvention().isPropertyTestFunction(parent);}
 *  */
    @Test
    public void testIsPropertyTest_ParentGetFirstChildEqualsGetPropAndCompilerGetCodingConventionIsPropertyTestFunction() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(37);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent.getFirstChild() == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_ParentGetFirstChildEqualsGetProp() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(101);
        setField(parent, "com.google.javascript.rhino.Node", "first", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isOr()}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return parent.getParent().isOr() && parent.getParent().getFirstChild() == parent;}
 *  */
    @Test
    public void testIsPropertyTest_ParentGetParentIsOrAndParentGetParentGetFirstChildEqualsParent() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(26);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent1)).setType(-255);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return parent.getFirstChild() == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_ParentGetFirstChildNotEqualsGetProp() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(101);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method isPropertyTest(com.google.javascript.rhino.Node)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests invoke:
    ///     {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)} once
    /// return from: {@code return NodeUtil.getConditionExpression(parent) == getProp;}
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getConditionExpression(parent) == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_NodeUtilGetConditionExpressionEqualsGetProp() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(114);
        setField(parent, "com.google.javascript.rhino.Node", "last", node);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertTrue(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.returnsFrom {@code return NodeUtil.getConditionExpression(parent) == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_NodeUtilGetConditionExpressionNotEqualsGetProp() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(114);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.returnsFrom {@code return NodeUtil.getConditionExpression(parent) == getProp;}
 *  */
    @Test
    public void testIsPropertyTest_SwitchParentGetTypeCasedefault() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(108);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method isPropertyTest(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node parent = getProp.getParent();
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1456) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = ((Object) null);
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(parent.getType())
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1457) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return parent.getParent().isOr() && parent.getParent().getFirstChild() == parent;
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(26);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1477) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().isPropertyTestFunction(parent)
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(37);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1460) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().isPropertyTestFunction(parent)
 *  */
    @Test
    public void testIsPropertyTest_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(37);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1460) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", stringNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = stringNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isPropertyTest(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#isPropertyTest(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getParent()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeUtil#getConditionExpression(com.google.javascript.rhino.Node)}
 * @utbot.activatesSwitch {@code switch(parent.getType()) case: default}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: return NodeUtil.getConditionExpression(parent) == getProp;
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testIsPropertyTest_ThrowIllegalArgumentException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(115);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method isPropertyTest(com.google.javascript.rhino.Node)
    
    @Test
    public void testIsPropertyTest1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(26);
        Object parent1 = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent1)).setType(100);
        setField(parent, "com.google.javascript.rhino.Node", "parent", parent1);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        boolean actual = ((Boolean) isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method isPropertyTest(com.google.javascript.rhino.Node)
    
    @Test
    public void testIsPropertyTest2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        CodingConventions.Proxy codingConvention = ((CodingConventions.Proxy) createInstance("com.google.javascript.jscomp.CodingConventions$Proxy"));
        options.setCodingConvention(codingConvention);
        compiler.options = options;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(37);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodingConventions$Proxy.isPropertyTestFunction(CodingConventions.java:225)
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1460) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsPropertyTest3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        LinkedHashSet propertyTestFunctions = new LinkedHashSet();
        setField(codingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions", propertyTestFunctions);
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodingConventions$Proxy.isPropertyTestFunction(CodingConventions.java:225)
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:321)
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1460) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", numberNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = numberNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsPropertyTest4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        ClosureCodingConvention codingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        LinkedHashSet propertyTestFunctions = new LinkedHashSet();
        setField(codingConvention, "com.google.javascript.jscomp.ClosureCodingConvention", "propertyTestFunctions", propertyTestFunctions);
        Class compilerOptionsClazz = Class.forName("com.google.javascript.jscomp.CompilerOptions");
        Class codingConventionType = Class.forName("com.google.javascript.jscomp.CodingConvention");
        Method setCodingConventionMethod = compilerOptionsClazz.getDeclaredMethod("setCodingConvention", codingConventionType);
        setCodingConventionMethod.setAccessible(true);
        java.lang.Object[] setCodingConventionMethodArguments = new java.lang.Object[1];
        setCodingConventionMethodArguments[0] = codingConvention;
        setCodingConventionMethod.invoke(options, setCodingConventionMethodArguments);
        compiler.options = options;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(37);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(42);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.CodingConventions$Proxy.isPropertyTestFunction(CodingConventions.java:225)
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:321)
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1460) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsPropertyTest5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
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
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(33);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.Node.getQualifiedName(Node.java:1553)
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:320)
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1460) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", stringNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = stringNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsPropertyTest6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        JqueryCodingConvention defaultCodingConvention = ((JqueryCodingConvention) createInstance("com.google.javascript.jscomp.JqueryCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(37);
        setField(numberNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.JqueryCodingConvention.isPropertyTestFunction(JqueryCodingConvention.java:52)
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1460) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", numberNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = numberNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testIsPropertyTest7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) parent)).setType(37);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.isPropertyTest] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.ClosureCodingConvention.isPropertyTestFunction(ClosureCodingConvention.java:320)
            com.google.javascript.jscomp.TypeCheck.isPropertyTest(TypeCheck.java:1460) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", stringNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = stringNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method isPropertyTest(com.google.javascript.rhino.Node)
    
    @Test(expected = UnsupportedOperationException.class)
    public void testIsPropertyTest8() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
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
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object parent = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) parent)).setType(37);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(38);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(stringNode, "com.google.javascript.rhino.Node", "parent", parent);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", stringNodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = stringNode;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method isPropertyTest(com.google.javascript.rhino.Node)
    
    @Test(timeout = 1000L)
    public void testIsPropertyTest9() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node parent = ((Node) createInstance("com.google.javascript.rhino.Node"));
        parent.setType(115);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(first, "com.google.javascript.rhino.Node", "next", first);
        setField(parent, "com.google.javascript.rhino.Node", "first", first);
        setField(node, "com.google.javascript.rhino.Node", "parent", parent);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method isPropertyTestMethod = typeCheckClazz.getDeclaredMethod("isPropertyTest", nodeType);
        isPropertyTestMethod.setAccessible(true);
        java.lang.Object[] isPropertyTestMethodArguments = new java.lang.Object[1];
        isPropertyTestMethodArguments[0] = node;
        try {
            isPropertyTestMethod.invoke(typeCheck, isPropertyTestMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitCall
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitCall_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1681) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, stringNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = stringNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node child = n.getFirstChild();
 *  */
    @Test
    public void testVisitCall_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1680) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, nodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = ((Object) null);
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(child).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testVisitCall_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1681) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, nodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = node;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(child).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testVisitCall_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1681) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, numberNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = numberNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitCall(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#restrictByNotNullOrUndefined()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType childType = getJSType(child).restrictByNotNullOrUndefined();
 *  */
    @Test
    public void testVisitCall_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1681) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, stringNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = stringNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitCall(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitCall1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.EnumElementType.canBeCalled(EnumElementType.java:103)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1683) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, stringNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = nodeTraversal;
        visitCallMethodArguments[1] = stringNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitCall2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        UnionType unionType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        nativeTypes[35] = ((JSType) unionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:209)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1681) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, stringNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = nodeTraversal;
        visitCallMethodArguments[1] = stringNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitCall3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        EnumType enumType = ((EnumType) createInstance("com.google.javascript.rhino.jstype.EnumType"));
        nativeTypes[35] = ((JSType) enumType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.report(TypeCheck.java:436)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1684) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, stringNodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = stringNode;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitCall4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        UnionType jsType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        setField(jsType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionTypeBuilder.reduceAlternatesWithoutUnion(UnionTypeBuilder.java:306)
            com.google.javascript.rhino.jstype.UnionTypeBuilder.build(UnionTypeBuilder.java:318)
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:212)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1681) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, nodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = ((Object) null);
        visitCallMethodArguments[1] = node;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitCall5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        UnionType jsType = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        ArrayList alternates = new ArrayList();
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        alternates.add(null);
        setField(jsType, "com.google.javascript.rhino.jstype.UnionType", "alternates", alternates);
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitCall] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.UnionType.restrictByNotNullOrUndefined(UnionType.java:210)
            com.google.javascript.jscomp.TypeCheck.visitCall(TypeCheck.java:1681) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitCallMethod = typeCheckClazz.getDeclaredMethod("visitCall", nodeTraversalType, nodeType);
        visitCallMethod.setAccessible(true);
        java.lang.Object[] visitCallMethodArguments = new java.lang.Object[2];
        visitCallMethodArguments[0] = nodeTraversal;
        visitCallMethodArguments[1] = node;
        try {
            visitCallMethod.invoke(typeCheck, visitCallMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkEnumAlias
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkEnumAlias(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumAlias(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (declInfo == null): False}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#hasEnumParameterType()}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckEnumAlias_DeclInfoNotEqualsNull() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", -255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = ((Object) null);
        checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumAlias(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (declInfo == null): True}
 * @utbot.returnsFrom {@code return;}
 *  */
    @Test
    public void testCheckEnumAlias_DeclInfoEqualsNull() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = ((Object) null);
        checkEnumAliasMethodArguments[2] = ((Object) null);
        checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkEnumAlias(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumAlias(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType valueType = getJSType(value);
 *  */
    @Test
    public void testCheckEnumAlias_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumAlias] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.checkEnumAlias(TypeCheck.java:1897) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = node;
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumAlias(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType valueType = getJSType(value);
 *  */
    @Test
    public void testCheckEnumAlias_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumAlias] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.checkEnumAlias(TypeCheck.java:1897) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = ((Object) null);
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumAlias(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType valueType = getJSType(value);
 *  */
    @Test
    public void testCheckEnumAlias_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumAlias] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.checkEnumAlias(TypeCheck.java:1897) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = node;
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkEnumAlias(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isEnumType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !valueType.isEnumType()
 *  */
    @Test
    public void testCheckEnumAlias_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumAlias] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkEnumAlias(TypeCheck.java:1898) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, stringNodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = stringNode;
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkEnumAlias(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)
    
    @Test
    public void testCheckEnumAlias1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = nodeTraversal;
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = node;
        checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
    }
    
    @Test
    public void testCheckEnumAlias2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        Object prototypeObjectType = createInstance("com.google.javascript.rhino.jstype.PrototypeObjectType");
        nativeTypes[35] = ((JSType) prototypeObjectType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, numberNodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = nodeTraversal;
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = numberNode;
        checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkEnumAlias(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testCheckEnumAlias3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = node;
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCheckEnumAlias4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = nodeTraversal;
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = node;
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = StackOverflowError.class)
    public void testCheckEnumAlias5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = node;
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCheckEnumAlias6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[38];
        ParameterizedType parameterizedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        TemplateType referencedType1 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        TemplateType referencedType2 = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(referencedType1, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType2);
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(parameterizedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        nativeTypes[35] = ((JSType) parameterizedType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumAlias] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.TemplateType.toMaybeEnumType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.TemplateType.toMaybeEnumType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.ParameterizedType.toMaybeEnumType(ParameterizedType.java:52)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.ParameterizedType.toMaybeEnumType(ParameterizedType.java:52)
            com.google.javascript.rhino.jstype.JSType.isEnumType(JSType.java:397)
            com.google.javascript.jscomp.TypeCheck.checkEnumAlias(TypeCheck.java:1898) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, numberNodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = nodeTraversal;
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = numberNode;
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCheckEnumAlias7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        nativeTypes[35] = ((JSType) templateType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumAlias] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.ParameterizedType.toMaybeEnumType(ParameterizedType.java:52)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.ParameterizedType.toMaybeEnumType(ParameterizedType.java:52)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.TemplateType.toMaybeEnumType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.isEnumType(JSType.java:397)
            com.google.javascript.jscomp.TypeCheck.checkEnumAlias(TypeCheck.java:1898) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = node;
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testCheckEnumAlias8() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSDocInfo jSDocInfo = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(jSDocInfo, "com.google.javascript.rhino.JSDocInfo", "bitset", 1610612736);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType1 = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkEnumAlias] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.ParameterizedType.toMaybeEnumType(ParameterizedType.java:52)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.ParameterizedType.toMaybeEnumType(ParameterizedType.java:52)
            com.google.javascript.rhino.jstype.ProxyObjectType.toMaybeEnumType(ProxyObjectType.java:153)
            com.google.javascript.rhino.jstype.TemplateType.toMaybeEnumType(TemplateType.java:48)
            com.google.javascript.rhino.jstype.JSType.isEnumType(JSType.java:397)
            com.google.javascript.jscomp.TypeCheck.checkEnumAlias(TypeCheck.java:1898) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkEnumAliasMethod = typeCheckClazz.getDeclaredMethod("checkEnumAlias", nodeTraversalType, jSDocInfoType, nodeType);
        checkEnumAliasMethod.setAccessible(true);
        java.lang.Object[] checkEnumAliasMethodArguments = new java.lang.Object[3];
        checkEnumAliasMethodArguments[0] = ((Object) null);
        checkEnumAliasMethodArguments[1] = jSDocInfo;
        checkEnumAliasMethodArguments[2] = node;
        try {
            checkEnumAliasMethod.invoke(typeCheck, checkEnumAliasMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitReturn
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getEnclosingFunction()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = getJSType(t.getEnclosingFunction());
 *  */
    @Test
    public void testVisitReturn_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitReturn(TypeCheck.java:1781) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitReturnMethod = typeCheckClazz.getDeclaredMethod("visitReturn", nodeTraversalType, nodeType);
        visitReturnMethod.setAccessible(true);
        java.lang.Object[] visitReturnMethodArguments = new java.lang.Object[2];
        visitReturnMethodArguments[0] = ((Object) null);
        visitReturnMethodArguments[1] = ((Object) null);
        try {
            visitReturnMethod.invoke(typeCheck, visitReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitReturn(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getEnclosingFunction()}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = getJSType(t.getEnclosingFunction());
 *  */
    @Test
    public void testVisitReturn_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitReturn(TypeCheck.java:1781) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitReturnMethod = typeCheckClazz.getDeclaredMethod("visitReturn", nodeTraversalType, nodeType);
        visitReturnMethod.setAccessible(true);
        java.lang.Object[] visitReturnMethodArguments = new java.lang.Object[2];
        visitReturnMethodArguments[0] = nodeTraversal;
        visitReturnMethodArguments[1] = ((Object) null);
        try {
            visitReturnMethod.invoke(typeCheck, visitReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method visitReturn(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testVisitReturn1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getEnclosingFunction(NodeTraversal.java:555)
            com.google.javascript.jscomp.TypeCheck.visitReturn(TypeCheck.java:1781) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitReturnMethod = typeCheckClazz.getDeclaredMethod("visitReturn", nodeTraversalType, nodeType);
        visitReturnMethod.setAccessible(true);
        java.lang.Object[] visitReturnMethodArguments = new java.lang.Object[2];
        visitReturnMethodArguments[0] = nodeTraversal;
        visitReturnMethodArguments[1] = ((Object) null);
        try {
            visitReturnMethod.invoke(typeCheck, visitReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testVisitReturn2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        scopeRoots.add(null);
        scopeRoots.add(null);
        scopeRoots.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitReturn] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitReturn(TypeCheck.java:1781) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitReturnMethod = typeCheckClazz.getDeclaredMethod("visitReturn", nodeTraversalType, nodeType);
        visitReturnMethod.setAccessible(true);
        java.lang.Object[] visitReturnMethodArguments = new java.lang.Object[2];
        visitReturnMethodArguments[0] = nodeTraversal;
        visitReturnMethodArguments[1] = ((Object) null);
        try {
            visitReturnMethod.invoke(typeCheck, visitReturnMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.ensureTyped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureTyped(t, n, getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testEnsureTyped_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1938) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1938) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1965)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1938) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(UNKNOWN_TYPE));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1966)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1938) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testEnsureTyped1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        nativeTypes[35] = ((JSType) anonymousFunctionType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
    }
    
    @Test
    public void testEnsureTyped2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[0] = ((JSType) enumElementType);
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        nativeTypes[13] = ((JSType) enumElementType);
        nativeTypes[14] = ((JSType) enumElementType);
        nativeTypes[15] = ((JSType) enumElementType);
        nativeTypes[16] = ((JSType) enumElementType);
        nativeTypes[17] = ((JSType) enumElementType);
        nativeTypes[18] = ((JSType) enumElementType);
        nativeTypes[19] = ((JSType) enumElementType);
        nativeTypes[20] = ((JSType) enumElementType);
        nativeTypes[21] = ((JSType) enumElementType);
        nativeTypes[22] = ((JSType) enumElementType);
        nativeTypes[23] = ((JSType) enumElementType);
        nativeTypes[24] = ((JSType) enumElementType);
        nativeTypes[25] = ((JSType) enumElementType);
        nativeTypes[26] = ((JSType) enumElementType);
        nativeTypes[27] = ((JSType) enumElementType);
        nativeTypes[28] = ((JSType) enumElementType);
        nativeTypes[29] = ((JSType) enumElementType);
        nativeTypes[30] = ((JSType) enumElementType);
        nativeTypes[31] = ((JSType) enumElementType);
        nativeTypes[32] = ((JSType) enumElementType);
        nativeTypes[33] = ((JSType) enumElementType);
        nativeTypes[34] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 35));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
    }
    
    @Test
    public void testEnsureTyped3() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object jsType = createInstance("com.google.javascript.rhino.jstype.NamedType");
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 35));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
    }
    
    @Test
    public void testEnsureTyped4() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 35));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
    }
    
    @Test
    public void testEnsureTyped5() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 35));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = IllegalStateException.class)
    public void testEnsureTyped6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        StringType stringType = ((StringType) createInstance("com.google.javascript.rhino.jstype.StringType"));
        nativeTypes[35] = ((JSType) stringType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[2];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = stringNode;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.ensureTyped
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: ensureTyped(t, n, getNativeType(type));
 *  */
    @Test
    public void testEnsureTyped_ThrowArrayIndexOutOfBoundsException1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1942) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        ensureTypedMethodArguments[2] = jSTypeNative;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(type));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_21() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(105);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1966)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1942) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethodArguments[2] = jSTypeNative;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(type));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_11() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1965)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1942) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        ensureTypedMethodArguments[2] = jSTypeNative;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ensureTyped(t, n, getNativeType(type));
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1942) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSTypeNative)
    
    @Test
    public void testEnsureTyped7() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[0] = ((JSType) enumElementType);
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        nativeTypes[8] = ((JSType) functionType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        nativeTypes[13] = ((JSType) enumElementType);
        nativeTypes[14] = ((JSType) enumElementType);
        nativeTypes[15] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) stringNode)).setType(105);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, stringNodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = stringNode;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    @Test
    public void testEnsureTyped8() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        nativeTypes[13] = ((JSType) enumElementType);
        nativeTypes[14] = ((JSType) enumElementType);
        nativeTypes[15] = ((JSType) enumElementType);
        nativeTypes[16] = ((JSType) enumElementType);
        nativeTypes[17] = ((JSType) enumElementType);
        nativeTypes[18] = ((JSType) enumElementType);
        nativeTypes[19] = ((JSType) enumElementType);
        nativeTypes[20] = ((JSType) enumElementType);
        nativeTypes[21] = ((JSType) enumElementType);
        nativeTypes[22] = ((JSType) enumElementType);
        nativeTypes[23] = ((JSType) enumElementType);
        nativeTypes[24] = ((JSType) enumElementType);
        nativeTypes[25] = ((JSType) enumElementType);
        nativeTypes[26] = ((JSType) enumElementType);
        nativeTypes[27] = ((JSType) enumElementType);
        nativeTypes[28] = ((JSType) enumElementType);
        nativeTypes[29] = ((JSType) enumElementType);
        nativeTypes[30] = ((JSType) enumElementType);
        nativeTypes[31] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
    }
    
    @Test
    public void testEnsureTyped9() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[8] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        nativeTypes[13] = ((JSType) enumElementType);
        nativeTypes[14] = ((JSType) enumElementType);
        nativeTypes[15] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
    }
    
    @Test
    public void testEnsureTyped10() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[16];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[0] = ((JSType) enumElementType);
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        nativeTypes[13] = ((JSType) enumElementType);
        nativeTypes[14] = ((JSType) enumElementType);
        nativeTypes[15] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(numberNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 8));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
    }
    
    @Test
    public void testEnsureTyped11() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[32];
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        nativeTypes[0] = ((JSType) enumElementType);
        nativeTypes[1] = ((JSType) enumElementType);
        nativeTypes[2] = ((JSType) enumElementType);
        nativeTypes[3] = ((JSType) enumElementType);
        nativeTypes[4] = ((JSType) enumElementType);
        nativeTypes[5] = ((JSType) enumElementType);
        nativeTypes[6] = ((JSType) enumElementType);
        nativeTypes[7] = ((JSType) enumElementType);
        nativeTypes[9] = ((JSType) enumElementType);
        nativeTypes[10] = ((JSType) enumElementType);
        nativeTypes[11] = ((JSType) enumElementType);
        nativeTypes[12] = ((JSType) enumElementType);
        nativeTypes[13] = ((JSType) enumElementType);
        nativeTypes[14] = ((JSType) enumElementType);
        nativeTypes[15] = ((JSType) enumElementType);
        nativeTypes[16] = ((JSType) enumElementType);
        nativeTypes[17] = ((JSType) enumElementType);
        nativeTypes[18] = ((JSType) enumElementType);
        nativeTypes[19] = ((JSType) enumElementType);
        nativeTypes[20] = ((JSType) enumElementType);
        nativeTypes[21] = ((JSType) enumElementType);
        nativeTypes[22] = ((JSType) enumElementType);
        nativeTypes[23] = ((JSType) enumElementType);
        nativeTypes[24] = ((JSType) enumElementType);
        nativeTypes[25] = ((JSType) enumElementType);
        nativeTypes[26] = ((JSType) enumElementType);
        nativeTypes[27] = ((JSType) enumElementType);
        nativeTypes[28] = ((JSType) enumElementType);
        nativeTypes[29] = ((JSType) enumElementType);
        nativeTypes[30] = ((JSType) enumElementType);
        nativeTypes[31] = ((JSType) enumElementType);
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        JSTypeNative jSTypeNative = JSTypeNative.ERROR_FUNCTION_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeNativeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = jSTypeNative;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 8));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.ensureTyped
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#setJSType(com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testEnsureTyped_NodeSetJSType() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(-255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testEnsureTyped() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-224);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testEnsureTyped_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-256);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        TemplateType jsType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!inExterns): False}
 *  */
    @Test
    public void testEnsureTyped_InExterns() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "inExterns", true);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(2);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testEnsureTyped_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(2);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test
    public void testEnsureTyped_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1851)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1968) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkState(!n.isFunction() || type.isFunctionType() || type.isUnknownType());
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1965) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = ((Object) null);
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: type.isFunctionType()
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_12() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(105);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1966) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#getType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.NodeTraversal#getScope()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType infoType = info.getType().evaluate(t.getScope(), typeRegistry);
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_22() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(-255);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1975) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!inExterns): True}
 * @utbot.invokes {@link com.google.javascript.rhino.JSDocInfo#isImplicitCast()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getString()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: n.getLastChild().getString()
 *  */
    @Test
    public void testEnsureTyped_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1982) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testEnsureTyped_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, errorFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = errorFunctionType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!inExterns): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: n.getLastChild().getString()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsureTyped_ThrowIllegalStateException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#ensureTyped(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.executesCondition {@code (!inExterns): True}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: n.getLastChild().getString()
 *  */
    @Test(expected = IllegalStateException.class)
    public void testEnsureTyped_ThrowIllegalStateException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testEnsureTyped12() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(105);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        JSType initialNodeJsType = ((JSType) getFieldValue(node, "com.google.javascript.rhino.Node", "jsType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, anonymousFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = anonymousFunctionType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        
        JSType finalNodeJsType = ((JSType) getFieldValue(node, "com.google.javascript.rhino.Node", "jsType"));
        
        assertFalse(initialNodeJsType == finalNodeJsType);
    }
    
    @Test
    public void testEnsureTyped13() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, anonymousFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = anonymousFunctionType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    @Test
    public void testEnsureTyped14() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        NullType nullType = ((NullType) createInstance("com.google.javascript.rhino.jstype.NullType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class nullTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, nullTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = nullType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    
    @Test
    public void testEnsureTyped15() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, anonymousFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = anonymousFunctionType;
        ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test
    public void testEnsureTyped16() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(105);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:597)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1975) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, anonymousFunctionTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = anonymousFunctionType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped17() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 8192);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        Object indexedType = createInstance("com.google.javascript.rhino.jstype.IndexedType");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1984) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class indexedTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, indexedTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = ((Object) null);
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = indexedType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped18() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        ArrayDeque scopes = new ArrayDeque();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        LinkedList scopeRoots = new LinkedList();
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopeRoots", scopeRoots);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1975) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testEnsureTyped19() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        LinkedList scopes = new LinkedList();
        scopes.add(null);
        scopes.add(null);
        scopes.add(null);
        setField(nodeTraversal, "com.google.javascript.jscomp.NodeTraversal", "scopes", scopes);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        Object next = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 536870912);
        setField(next, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(next, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", next);
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.ensureTyped] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.NodeTraversal.getScope(NodeTraversal.java:598)
            com.google.javascript.jscomp.TypeCheck.ensureTyped(TypeCheck.java:1975) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, numberNodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = numberNode;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test(expected = IllegalStateException.class)
    public void testEnsureTyped20() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(105);
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, noObjectTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = noObjectType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test(expected = IllegalStateException.class)
    public void testEnsureTyped21() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(105);
        EnumElementType enumElementType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class enumElementTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, enumElementTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = enumElementType;
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: TIMEOUTS for method ensureTyped(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.JSType)
    
    @Test(timeout = 1000L)
    public void testEnsureTyped22() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "next", propListHead);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This execution may take longer than the 1000 ms timeout
         and therefore fail due to exceeding the timeout. */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method ensureTypedMethod = typeCheckClazz.getDeclaredMethod("ensureTyped", nodeTraversalType, nodeType, jSTypeType);
        ensureTypedMethod.setAccessible(true);
        java.lang.Object[] ensureTypedMethodArguments = new java.lang.Object[3];
        ensureTypedMethodArguments[0] = nodeTraversal;
        ensureTypedMethodArguments[1] = node;
        ensureTypedMethodArguments[2] = ((Object) null);
        try {
            ensureTypedMethod.invoke(typeCheck, ensureTypedMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.getTypedPercent
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getTypedPercent()
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getTypedPercent()}
 * @utbot.executesCondition {@code ((total == 0)): True}
 * @utbot.returnsFrom {@code return (total == 0) ? 0.0 : (100.0 * typedCount) / total;}
 *  */
    @Test
    public void testGetTypedPercent_TotalEqualsZero() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typedCount", -1);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount", 2);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount", -1);
        
        double actual = typeCheck.getTypedPercent();
        
        assertEquals(0.0, actual, 1.0E-6);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getTypedPercent()}
 * @utbot.executesCondition {@code ((total == 0)): False}
 * @utbot.returnsFrom {@code return (total == 0) ? 0.0 : (100.0 * typedCount) / total;}
 *  */
    @Test
    public void testGetTypedPercent_TotalNotEqualsZero() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typedCount", -1);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount", -3);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount", -2);
        
        double actual = typeCheck.getTypedPercent();
        
        assertEquals(16.666666666666668, actual, 1.0E-6);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.getJSType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
 * @utbot.returnsFrom {@code return getNativeType(UNKNOWN_TYPE);}
 *  */
    @Test
    public void testGetJSType_JsTypeEqualsNull() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        JSType actual = ((JSType) getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        JSTypeRegistry typeCheckTypeRegistry1 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry1TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry1, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes1 = ((JSType) get(typeCheckTypeRegistry1TypeRegistryNativeTypes, 1));
        JSTypeRegistry typeCheckTypeRegistry2 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry2TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry2, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes2 = ((JSType) get(typeCheckTypeRegistry2TypeRegistryNativeTypes, 2));
        JSTypeRegistry typeCheckTypeRegistry3 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry3TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry3, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes3 = ((JSType) get(typeCheckTypeRegistry3TypeRegistryNativeTypes, 3));
        JSTypeRegistry typeCheckTypeRegistry4 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry4TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry4, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes4 = ((JSType) get(typeCheckTypeRegistry4TypeRegistryNativeTypes, 4));
        JSTypeRegistry typeCheckTypeRegistry5 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry5TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry5, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes5 = ((JSType) get(typeCheckTypeRegistry5TypeRegistryNativeTypes, 5));
        JSTypeRegistry typeCheckTypeRegistry6 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry6TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry6, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes6 = ((JSType) get(typeCheckTypeRegistry6TypeRegistryNativeTypes, 6));
        JSTypeRegistry typeCheckTypeRegistry7 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry7TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry7, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes7 = ((JSType) get(typeCheckTypeRegistry7TypeRegistryNativeTypes, 7));
        JSTypeRegistry typeCheckTypeRegistry8 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry8TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry8, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes8 = ((JSType) get(typeCheckTypeRegistry8TypeRegistryNativeTypes, 8));
        JSTypeRegistry typeCheckTypeRegistry9 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry9TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry9, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes9 = ((JSType) get(typeCheckTypeRegistry9TypeRegistryNativeTypes, 9));
        JSTypeRegistry typeCheckTypeRegistry10 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry10TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry10, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes10 = ((JSType) get(typeCheckTypeRegistry10TypeRegistryNativeTypes, 10));
        JSTypeRegistry typeCheckTypeRegistry11 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry11TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry11, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes11 = ((JSType) get(typeCheckTypeRegistry11TypeRegistryNativeTypes, 11));
        JSTypeRegistry typeCheckTypeRegistry12 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry12TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry12, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes12 = ((JSType) get(typeCheckTypeRegistry12TypeRegistryNativeTypes, 12));
        JSTypeRegistry typeCheckTypeRegistry13 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry13TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry13, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes13 = ((JSType) get(typeCheckTypeRegistry13TypeRegistryNativeTypes, 13));
        JSTypeRegistry typeCheckTypeRegistry14 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry14TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry14, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes14 = ((JSType) get(typeCheckTypeRegistry14TypeRegistryNativeTypes, 14));
        JSTypeRegistry typeCheckTypeRegistry15 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry15TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry15, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes15 = ((JSType) get(typeCheckTypeRegistry15TypeRegistryNativeTypes, 15));
        JSTypeRegistry typeCheckTypeRegistry16 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry16TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry16, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes16 = ((JSType) get(typeCheckTypeRegistry16TypeRegistryNativeTypes, 16));
        JSTypeRegistry typeCheckTypeRegistry17 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry17TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry17, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes17 = ((JSType) get(typeCheckTypeRegistry17TypeRegistryNativeTypes, 17));
        JSTypeRegistry typeCheckTypeRegistry18 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry18TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry18, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes18 = ((JSType) get(typeCheckTypeRegistry18TypeRegistryNativeTypes, 18));
        JSTypeRegistry typeCheckTypeRegistry19 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry19TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry19, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes19 = ((JSType) get(typeCheckTypeRegistry19TypeRegistryNativeTypes, 19));
        JSTypeRegistry typeCheckTypeRegistry20 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry20TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry20, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes20 = ((JSType) get(typeCheckTypeRegistry20TypeRegistryNativeTypes, 20));
        JSTypeRegistry typeCheckTypeRegistry21 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry21TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry21, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes21 = ((JSType) get(typeCheckTypeRegistry21TypeRegistryNativeTypes, 21));
        JSTypeRegistry typeCheckTypeRegistry22 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry22TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry22, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes22 = ((JSType) get(typeCheckTypeRegistry22TypeRegistryNativeTypes, 22));
        JSTypeRegistry typeCheckTypeRegistry23 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry23TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry23, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes23 = ((JSType) get(typeCheckTypeRegistry23TypeRegistryNativeTypes, 23));
        JSTypeRegistry typeCheckTypeRegistry24 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry24TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry24, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes24 = ((JSType) get(typeCheckTypeRegistry24TypeRegistryNativeTypes, 24));
        JSTypeRegistry typeCheckTypeRegistry25 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry25TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry25, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes25 = ((JSType) get(typeCheckTypeRegistry25TypeRegistryNativeTypes, 25));
        JSTypeRegistry typeCheckTypeRegistry26 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry26TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry26, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes26 = ((JSType) get(typeCheckTypeRegistry26TypeRegistryNativeTypes, 26));
        JSTypeRegistry typeCheckTypeRegistry27 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry27TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry27, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes27 = ((JSType) get(typeCheckTypeRegistry27TypeRegistryNativeTypes, 27));
        JSTypeRegistry typeCheckTypeRegistry28 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry28TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry28, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes28 = ((JSType) get(typeCheckTypeRegistry28TypeRegistryNativeTypes, 28));
        JSTypeRegistry typeCheckTypeRegistry29 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry29TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry29, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes29 = ((JSType) get(typeCheckTypeRegistry29TypeRegistryNativeTypes, 29));
        JSTypeRegistry typeCheckTypeRegistry30 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry30TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry30, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes30 = ((JSType) get(typeCheckTypeRegistry30TypeRegistryNativeTypes, 30));
        JSTypeRegistry typeCheckTypeRegistry31 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry31TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry31, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes31 = ((JSType) get(typeCheckTypeRegistry31TypeRegistryNativeTypes, 31));
        JSTypeRegistry typeCheckTypeRegistry32 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry32TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry32, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes32 = ((JSType) get(typeCheckTypeRegistry32TypeRegistryNativeTypes, 32));
        JSTypeRegistry typeCheckTypeRegistry33 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry33TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry33, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes33 = ((JSType) get(typeCheckTypeRegistry33TypeRegistryNativeTypes, 33));
        JSTypeRegistry typeCheckTypeRegistry34 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry34TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry34, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes34 = ((JSType) get(typeCheckTypeRegistry34TypeRegistryNativeTypes, 34));
        JSTypeRegistry typeCheckTypeRegistry35 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry35TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry35, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes35 = ((JSType) get(typeCheckTypeRegistry35TypeRegistryNativeTypes, 35));
        JSTypeRegistry typeCheckTypeRegistry36 = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistry36TypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry36, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes36 = ((JSType) get(typeCheckTypeRegistry36TypeRegistryNativeTypes, 36));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes1);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes2);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes3);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes4);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes5);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes6);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes7);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes8);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes9);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes10);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes11);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes12);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes13);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes14);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes15);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes16);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes17);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes18);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes19);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes20);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes21);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes22);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes23);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes24);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes25);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes26);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes27);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes28);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes29);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes30);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes31);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes32);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes33);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes34);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes35);
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes36);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): False}
 * @utbot.returnsFrom {@code return jsType;}
 *  */
    @Test
    public void testGetJSType_JsTypeNotEqualsNull() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        EnumElementType actual = ((EnumElementType) getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments));
        
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
        
        ImmutableList actualTemplateKeys = actual.getTemplateKeys();
        assertNull(actualTemplateKeys);
        
        ImmutableList actualTemplatizedTypes = actual.getTemplatizedTypes();
        assertNull(actualTemplatizedTypes);
        
        boolean actualInTemplatedCheckVisit = ((Boolean) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "inTemplatedCheckVisit"));
        assertFalse(actualInTemplatedCheckVisit);
        
        JSTypeRegistry actualRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.rhino.jstype.JSType", "registry"));
        assertNull(actualRegistry);
        
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getJSType(com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getJSType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        try {
            getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType jsType = n.getJSType();
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = ((Object) null);
        try {
            getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)}
 * @utbot.executesCondition {@code (jsType == null): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return getNativeType(UNKNOWN_TYPE);
 *  */
    @Test
    public void testGetJSType_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getJSType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method getJSTypeMethod = typeCheckClazz.getDeclaredMethod("getJSType", nodeType);
        getJSTypeMethod.setAccessible(true);
        java.lang.Object[] getJSTypeMethodArguments = new java.lang.Object[1];
        getJSTypeMethodArguments[0] = node;
        try {
            getJSTypeMethod.invoke(typeCheck, getJSTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.getNativeType
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.returnsFrom {@code return typeRegistry.getNativeType(typeId);}
 *  */
    @Test
    public void testGetNativeType_JSTypeRegistryGetNativeType() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeCheckClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        JSType actual = ((JSType) getNativeTypeMethod.invoke(typeCheck, getNativeTypeMethodArguments));
        
        assertNull(actual);
        
        JSTypeRegistry typeCheckTypeRegistry = ((JSTypeRegistry) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] typeCheckTypeRegistryTypeRegistryNativeTypes = ((com.google.javascript.rhino.jstype.JSType[]) getFieldValue(typeCheckTypeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes"));
        JSType finalTypeCheckTypeRegistryNativeTypes0 = ((JSType) get(typeCheckTypeRegistryTypeRegistryNativeTypes, 0));
        
        assertNull(finalTypeCheckTypeRegistryNativeTypes0);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: return typeRegistry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        JSTypeNative jSTypeNative = JSTypeNative.ARRAY_TYPE;
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getNativeType] produces [java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeCheckClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = jSTypeNative;
        try {
            getNativeTypeMethod.invoke(typeCheck, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSTypeRegistry#getNativeType(com.google.javascript.rhino.jstype.JSTypeNative)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: return typeRegistry.getNativeType(typeId);
 *  */
    @Test
    public void testGetNativeType_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.getNativeType] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeNativeType = Class.forName("com.google.javascript.rhino.jstype.JSTypeNative");
        Method getNativeTypeMethod = typeCheckClazz.getDeclaredMethod("getNativeType", jSTypeNativeType);
        getNativeTypeMethod.setAccessible(true);
        java.lang.Object[] getNativeTypeMethodArguments = new java.lang.Object[1];
        getNativeTypeMethodArguments[0] = ((Object) null);
        try {
            getNativeTypeMethod.invoke(typeCheck, getNativeTypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.reportMissingProperties
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method reportMissingProperties(boolean)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#reportMissingProperties(boolean)}
 * @utbot.returnsFrom {@code return this;}
 *  */
    @Test
    public void testReportMissingProperties_Return() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        TypeCheck actual = typeCheck.reportMissingProperties(false);
        
        AbstractCompiler actualCompiler = ((AbstractCompiler) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "compiler"));
        assertNull(actualCompiler);
        
        TypeValidator actualValidator = ((TypeValidator) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "validator"));
        assertNull(actualValidator);
        
        ReverseAbstractInterpreter actualReverseInterpreter = ((ReverseAbstractInterpreter) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "reverseInterpreter"));
        assertNull(actualReverseInterpreter);
        
        JSTypeRegistry actualTypeRegistry = ((JSTypeRegistry) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "typeRegistry"));
        assertNull(actualTypeRegistry);
        
        Scope actualTopScope = ((Scope) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "topScope"));
        assertNull(actualTopScope);
        
        MemoizedScopeCreator actualScopeCreator = ((MemoizedScopeCreator) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "scopeCreator"));
        assertNull(actualScopeCreator);
        
        CheckLevel actualReportMissingOverride = ((CheckLevel) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "reportMissingOverride"));
        assertNull(actualReportMissingOverride);
        
        CheckLevel actualReportUnknownTypes = ((CheckLevel) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "reportUnknownTypes"));
        assertNull(actualReportUnknownTypes);
        
        boolean actualReportMissingProperties = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "reportMissingProperties"));
        assertFalse(actualReportMissingProperties);
        
        InferJSDocInfo actualInferJSDocInfo = ((InferJSDocInfo) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "inferJSDocInfo"));
        assertNull(actualInferJSDocInfo);
        
        int typeCheckTypedCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typedCount"));
        int actualTypedCount = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "typedCount"));
        org.junit.Assert.assertEquals(typeCheckTypedCount, actualTypedCount);
        
        int typeCheckNullCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount"));
        int actualNullCount = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "nullCount"));
        org.junit.Assert.assertEquals(typeCheckNullCount, actualNullCount);
        
        int typeCheckUnknownCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount"));
        int actualUnknownCount = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "unknownCount"));
        org.junit.Assert.assertEquals(typeCheckUnknownCount, actualUnknownCount);
        
        boolean actualInExterns = ((Boolean) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "inExterns"));
        assertFalse(actualInExterns);
        
        int typeCheckNoTypeCheckSection = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection"));
        int actualNoTypeCheckSection = ((Integer) getFieldValue(actual, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection"));
        org.junit.Assert.assertEquals(typeCheckNoTypeCheckSection, actualNoTypeCheckSection);
        
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isUnknownType()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 *  */
    @Test
    public void testHasUnknownOrEmptySupertype_PreconditionsCheckArgument() throws Exception  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        Object type = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", noTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = noType;
        boolean actual = ((Boolean) hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: ctor.getPrototype().getImplicitPrototype()
 *  */
    @Test
    public void testHasUnknownOrEmptySupertype_ThrowClassCastException() throws Throwable  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        UnionType type = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:384)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", noTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = noType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Preconditions.checkArgument(ctor.isConstructor() || ctor.isInterface());
 *  */
    @Test
    public void testHasUnknownOrEmptySupertype_ThrowNullPointerException() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1275) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", functionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = ((Object) null);
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ctor.getPrototype().getImplicitPrototype()
 *  */
    @Test
    public void testHasUnknownOrEmptySupertype_ThrowNullPointerException_1() throws Throwable  {
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", noTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = noType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isConstructor()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.FunctionType#isInterface()}
 * @utbot.invokes {@link com.google.common.base.Preconditions#checkArgument(boolean)}
 * @utbot.throwsException {@link java.lang.IllegalArgumentException} in: Preconditions.checkArgument(ctor.isConstructor() || ctor.isInterface());
 *  */
    @Test(expected = IllegalArgumentException.class)
    public void testHasUnknownOrEmptySupertype_ThrowIllegalArgumentException() throws Throwable  {
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "ORDINARY");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", noObjectTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = noObjectType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region FUZZER: ERROR SUITE for method hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)
    
    /**
     * @utbot.classUnderTest {@link com.google.javascript.jscomp.TypeCheck}
     * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)}
     */
    @Test
    public void testHasUnknownOrEmptySupertypeThrowsNPE() throws Throwable  {
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1275) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", functionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = ((Object) null);
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)
    
    @Test
    public void testHasUnknownOrEmptySupertype1() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        FunctionType type = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.UnresolvedTypeExpression");
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        boolean actual = ((Boolean) hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments));
        
        assertTrue(actual);
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype2() throws Exception  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        FunctionType type = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        boolean actual = ((Boolean) hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method hasUnknownOrEmptySupertype(com.google.javascript.rhino.jstype.FunctionType)
    
    @Test(expected = StackOverflowError.class)
    public void testHasUnknownOrEmptySupertype3() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ParameterizedType implicitPrototypeFallback = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedObjType", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype4() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        UnionType type = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:384)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype5() throws Throwable  {
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        AllType allType = ((AllType) createInstance("com.google.javascript.rhino.jstype.AllType"));
        nativeTypes[35] = ((JSType) allType);
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.AllType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.AllType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", errorFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = errorFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype6() throws Throwable  {
        Object errorFunctionType = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        JSTypeRegistry registry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {null, null, null, null, null, null, null, null, null};
        setField(registry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(errorFunctionType, "com.google.javascript.rhino.jstype.JSType", "registry", registry);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 9]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeObjectType(JSTypeRegistry.java:895)
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class errorFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", errorFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = errorFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype7() throws Throwable  {
        Object noResolvedType = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noResolvedType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(noResolvedType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class noResolvedTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", noResolvedTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = noResolvedType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype8() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype9() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype10() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        Object ownerFunction = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.isUnknownType(ObjectType.java:573)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1276) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype11() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "nativeType", true);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype12() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        ParameterizedType implicitPrototypeFallback = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ProxyObjectType.isUnknownType(ProxyObjectType.java:138)
            com.google.javascript.rhino.jstype.ParameterizedType.isUnknownType(ParameterizedType.java:52)
            com.google.javascript.rhino.jstype.ObjectType.isUnknownType(ObjectType.java:580)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1276) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype13() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        FunctionType type = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Object implicitPrototypeFallback = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(type, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.JSType.isEmptyType(JSType.java:202)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1287) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype14() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.ObjectType", "unknown", true);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype15() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object ownerFunction = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:379)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype16() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object ownerFunction = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:379)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype17() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object ownerFunction = createInstance("com.google.javascript.rhino.jstype.NoResolvedType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:379)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype18() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        Object ownerFunction = createInstance("com.google.javascript.rhino.jstype.ErrorFunctionType");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "ownerFunction", ownerFunction);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:379)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testHasUnknownOrEmptySupertype19() throws Throwable  {
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        String className = "";
        setField(anonymousFunctionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "className", className);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:379)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Method hasUnknownOrEmptySupertypeMethod = typeCheckClazz.getDeclaredMethod("hasUnknownOrEmptySupertype", anonymousFunctionTypeType);
        hasUnknownOrEmptySupertypeMethod.setAccessible(true);
        java.lang.Object[] hasUnknownOrEmptySupertypeMethodArguments = new java.lang.Object[1];
        hasUnknownOrEmptySupertypeMethodArguments[0] = anonymousFunctionType;
        try {
            hasUnknownOrEmptySupertypeMethod.invoke(null, hasUnknownOrEmptySupertypeMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitBinaryOperator
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitBinaryOperator(int, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} in: JSType leftType = getJSType(left);
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        setField(stringNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1822) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, stringNodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = 1;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = stringNode;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getFirstChild()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: Node left = n.getFirstChild();
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1821) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, nodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = -255;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = ((Object) null);
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType leftType = getJSType(left);
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1822) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, nodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = -255;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = node;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType leftType = getJSType(left);
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object first = createInstance("com.google.javascript.rhino.Node$StringNode");
        setField(numberNode, "com.google.javascript.rhino.Node", "first", first);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1822) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, numberNodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = -255;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = numberNode;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#expectBitwiseable(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.activatesSwitch {@code switch(op) case: Token.BITOR}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectBitwiseable(t, left, leftType, "bad left operand to bitwise operator");
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1860) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, nodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = 89;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = node;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitBinaryOperator(int,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#expectNumber(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.JSType,java.lang.String)}
 * @utbot.activatesSwitch {@code switch(op) case: Token.SUB}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.expectNumber(t, left, leftType, "left operand");
 *  */
    @Test
    public void testVisitBinaryOperator_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(first, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "first", first);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        setField(last, "com.google.javascript.rhino.Node", "jsType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "last", last);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitBinaryOperator] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitBinaryOperator(TypeCheck.java:1850) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class intType = int.class;
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method visitBinaryOperatorMethod = typeCheckClazz.getDeclaredMethod("visitBinaryOperator", intType, nodeTraversalType, nodeType);
        visitBinaryOperatorMethod.setAccessible(true);
        java.lang.Object[] visitBinaryOperatorMethodArguments = new java.lang.Object[3];
        visitBinaryOperatorMethodArguments[0] = 95;
        visitBinaryOperatorMethodArguments[1] = ((Object) null);
        visitBinaryOperatorMethodArguments[2] = node;
        try {
            visitBinaryOperatorMethod.invoke(typeCheck, visitBinaryOperatorMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkNoTypeCheckSection(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testCheckNoTypeCheckSection_SwitchNGetTypeCasedefault() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(-255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.invokes {@link com.google.javascript.jscomp.TypeValidator#setShouldReport(boolean)}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ValidatorSetShouldReport() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TypeValidator validator = ((TypeValidator) createInstance("com.google.javascript.jscomp.TypeValidator"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "validator", validator);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -255);
        Node node = new Node(125);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkNoTypeCheckSection(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.throwsException {@link java.lang.ClassCastException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        byte[] objectValue = {};
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.ClassCastException: class [B cannot be cast to class com.google.javascript.rhino.JSDocInfo ([B is in module java.base of loader 'bootstrap'; com.google.javascript.rhino.JSDocInfo is in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.Node.getJSDocInfo(Node.java:1851)
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:420) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: switch(n.getType())
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:414) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = ((Object) null);
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", -255);
        Node node = new Node(125);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = new Node(125);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.isNoTypeCheck()): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.isNoTypeCheck()): True}
 * @utbot.executesCondition {@code (enterSection): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): True}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 32);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): True}
 * @utbot.executesCondition {@code (info.isNoTypeCheck()): True}
 * @utbot.executesCondition {@code (enterSection): True}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(86);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        JSDocInfo objectValue = ((JSDocInfo) createInstance("com.google.javascript.rhino.JSDocInfo"));
        setField(objectValue, "com.google.javascript.rhino.JSDocInfo", "bitset", 32);
        setField(propListHead, "com.google.javascript.rhino.Node$ObjectPropListItem", "objectValue", objectValue);
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = true;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.executesCondition {@code (info != null): False}
 * @utbot.executesCondition {@code (validator.setShouldReport(noTypeCheckSection == 0);): False}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: validator.setShouldReport(noTypeCheckSection == 0);
 *  */
    @Test
    public void testCheckNoTypeCheckSection_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "noTypeCheckSection", 1);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$ObjectPropListItem");
        setField(numberNode, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkNoTypeCheckSection(TypeCheck.java:428) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", numberNodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = numberNode;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkNoTypeCheckSection(com.google.javascript.rhino.Node, boolean)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkNoTypeCheckSection(com.google.javascript.rhino.Node,boolean)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getJSDocInfo()}
 * @utbot.activatesSwitch {@code switch(n.getType()) case: default}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: JSDocInfo info = n.getJSDocInfo();
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckNoTypeCheckSection_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        node.setType(132);
        Object propListHead = createInstance("com.google.javascript.rhino.Node$IntPropListItem");
        setField(propListHead, "com.google.javascript.rhino.Node$AbstractPropListItem", "propType", 29);
        setField(node, "com.google.javascript.rhino.Node", "propListHead", propListHead);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class booleanType = boolean.class;
        Method checkNoTypeCheckSectionMethod = typeCheckClazz.getDeclaredMethod("checkNoTypeCheckSection", nodeType, booleanType);
        checkNoTypeCheckSectionMethod.setAccessible(true);
        java.lang.Object[] checkNoTypeCheckSectionMethodArguments = new java.lang.Object[2];
        checkNoTypeCheckSectionMethodArguments[0] = node;
        checkNoTypeCheckSectionMethodArguments[1] = false;
        try {
            checkNoTypeCheckSectionMethod.invoke(typeCheck, checkNoTypeCheckSectionMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.propertyIsImplicitCast
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method propertyIsImplicitCast(com.google.javascript.rhino.jstype.ObjectType, java.lang.String)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#propertyIsImplicitCast(com.google.javascript.rhino.jstype.ObjectType,java.lang.String)}
 * @utbot.returnsFrom {@code return false;}
 *  */
    @Test
    public void testPropertyIsImplicitCast_ReturnFalse() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Class stringType = Class.forName("java.lang.String");
        Method propertyIsImplicitCastMethod = typeCheckClazz.getDeclaredMethod("propertyIsImplicitCast", objectTypeType, stringType);
        propertyIsImplicitCastMethod.setAccessible(true);
        java.lang.Object[] propertyIsImplicitCastMethodArguments = new java.lang.Object[2];
        propertyIsImplicitCastMethodArguments[0] = ((Object) null);
        propertyIsImplicitCastMethodArguments[1] = ((Object) null);
        boolean actual = ((Boolean) propertyIsImplicitCastMethod.invoke(typeCheck, propertyIsImplicitCastMethodArguments));
        
        assertFalse(actual);
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.jstype.FunctionType, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: hasUnknownOrEmptySupertype(ctorType)
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_ThrowClassCastException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        UnionType type = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:384)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282)
            com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance(TypeCheck.java:1155) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, functionTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = functionType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        try {
            checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.ClassCastException} when: hasUnknownOrEmptySupertype(ctorType)
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_ThrowClassCastException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        UnionType type = ((UnionType) createInstance("com.google.javascript.rhino.jstype.UnionType"));
        setField(prototypeSlot, "com.google.javascript.rhino.jstype.Property", "type", type);
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "INTERFACE");
        setField(functionType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance] produces [java.lang.ClassCastException: class com.google.javascript.rhino.jstype.UnionType cannot be cast to class com.google.javascript.rhino.jstype.ObjectType (com.google.javascript.rhino.jstype.UnionType and com.google.javascript.rhino.jstype.ObjectType are in unnamed module of loader org.utbot.instrumentation.process.HandlerClassesLoader @89641db)]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:384)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282)
            com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance(TypeCheck.java:1155) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, functionTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = functionType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        try {
            checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: hasUnknownOrEmptySupertype(ctorType)
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1275)
            com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance(TypeCheck.java:1155) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, functionTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        try {
            checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: hasUnknownOrEmptySupertype(ctorType)
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.FunctionType.getPrototype(FunctionType.java:372)
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282)
            com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance(TypeCheck.java:1155) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, noObjectTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = noObjectType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        try {
            checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkDeclaredPropertyInheritance(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.jstype.FunctionType,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: hasUnknownOrEmptySupertype(ctorType)
 *  */
    @Test
    public void testCheckDeclaredPropertyInheritance_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NoObjectType noObjectType = ((NoObjectType) createInstance("com.google.javascript.rhino.jstype.NoObjectType"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        Class kindClazz = Class.forName("com.google.javascript.rhino.jstype.FunctionType$Kind");
        Object kind = getEnumConstantByName(kindClazz, "CONSTRUCTOR");
        setField(noObjectType, "com.google.javascript.rhino.jstype.FunctionType", "kind", kind);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.hasUnknownOrEmptySupertype(TypeCheck.java:1282)
            com.google.javascript.jscomp.TypeCheck.checkDeclaredPropertyInheritance(TypeCheck.java:1155) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class noObjectTypeType = Class.forName("com.google.javascript.rhino.jstype.FunctionType");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkDeclaredPropertyInheritanceMethod = typeCheckClazz.getDeclaredMethod("checkDeclaredPropertyInheritance", nodeTraversalType, nodeType, noObjectTypeType, stringType, jSDocInfoType, jSTypeType);
        checkDeclaredPropertyInheritanceMethod.setAccessible(true);
        java.lang.Object[] checkDeclaredPropertyInheritanceMethodArguments = new java.lang.Object[6];
        checkDeclaredPropertyInheritanceMethodArguments[0] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[1] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[2] = noObjectType;
        checkDeclaredPropertyInheritanceMethodArguments[3] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[4] = ((Object) null);
        checkDeclaredPropertyInheritanceMethodArguments[5] = ((Object) null);
        try {
            checkDeclaredPropertyInheritanceMethod.invoke(typeCheck, checkDeclaredPropertyInheritanceMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testDoPercentTypedAccounting() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount", -255);
        Node node = new Node(0);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = node;
        doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        
        int finalTypeCheckNullCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "nullCount"));
        
        org.junit.Assert.assertEquals(-254, finalTypeCheckNullCount);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isUnknownType()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CheckLevel#isOn()}
 *  */
    @Test
    public void testDoPercentTypedAccounting_CheckLevelIsOn() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        CheckLevel reportUnknownTypes = CheckLevel.OFF;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "reportUnknownTypes", reportUnknownTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount", 4);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = node;
        doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        
        int finalTypeCheckUnknownCount = ((Integer) getFieldValue(typeCheck, "com.google.javascript.jscomp.TypeCheck", "unknownCount"));
        
        org.junit.Assert.assertEquals(5, finalTypeCheckUnknownCount);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType type = n.getJSType();
 *  */
    @Test
    public void testDoPercentTypedAccounting_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:869) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = ((Object) null);
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: reportUnknownTypes.isOn()
 *  */
    @Test
    public void testDoPercentTypedAccounting_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:873) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = node;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: reportUnknownTypes.isOn()
 *  */
    @Test
    public void testDoPercentTypedAccounting_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:873) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = node;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test
    public void testDoPercentTypedAccounting1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = ((Object) null);
        doPercentTypedAccountingMethodArguments[1] = node;
        doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method doPercentTypedAccounting(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    @Test(expected = StackOverflowError.class)
    public void testDoPercentTypedAccounting2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", jsType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = nodeTraversal;
        doPercentTypedAccountingMethodArguments[1] = node;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoPercentTypedAccounting3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        ParameterizedType jsType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        ParameterizedType referencedType = ((ParameterizedType) createInstance("com.google.javascript.rhino.jstype.ParameterizedType"));
        UnknownType referencedType1 = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(referencedType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType1);
        setField(jsType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:873) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, nodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = nodeTraversal;
        doPercentTypedAccountingMethodArguments[1] = node;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    @Test
    public void testDoPercentTypedAccounting4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        CheckLevel reportUnknownTypes = CheckLevel.WARNING;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "reportUnknownTypes", reportUnknownTypes);
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Object stringNode = createInstance("com.google.javascript.rhino.Node$StringNode");
        UnknownType jsType = ((UnknownType) createInstance("com.google.javascript.rhino.jstype.UnknownType"));
        setField(stringNode, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.doPercentTypedAccounting(TypeCheck.java:874) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class stringNodeType = Class.forName("com.google.javascript.rhino.Node");
        Method doPercentTypedAccountingMethod = typeCheckClazz.getDeclaredMethod("doPercentTypedAccounting", nodeTraversalType, stringNodeType);
        doPercentTypedAccountingMethod.setAccessible(true);
        java.lang.Object[] doPercentTypedAccountingMethodArguments = new java.lang.Object[2];
        doPercentTypedAccountingMethodArguments[0] = nodeTraversal;
        doPercentTypedAccountingMethodArguments[1] = stringNode;
        try {
            doPercentTypedAccountingMethod.invoke(typeCheck, doPercentTypedAccountingMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes com.google.javascript.jscomp.TypeCheck#getJSType(com.google.javascript.rhino.Node)
 * @utbot.invokes {@link com.google.javascript.jscomp.AbstractCompiler#getCodingConvention()}
 * @utbot.invokes {@link com.google.javascript.jscomp.CodingConvention#getAbstractMethodName()}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isFunctionType()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isFunction()}
 *  */
    @Test
    public void testVisitInterfaceGetprop_NodeIsFunction() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(1);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, numberNodeType, numberNodeType, stringType, numberNodeType, numberNodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = numberNode;
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = node;
        visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.ArrayIndexOutOfBoundsException} 
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowArrayIndexOutOfBoundsException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = {};
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.ArrayIndexOutOfBoundsException: Index 35 out of bounds for length 0]
            com.google.javascript.rhino.jstype.JSTypeRegistry.getNativeType(JSTypeRegistry.java:891)
            com.google.javascript.jscomp.TypeCheck.getNativeType(TypeCheck.java:2003)
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1921)
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1307) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = node;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: JSType rvalueType = getJSType(rvalue);
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.getJSType(TypeCheck.java:1915)
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1307) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = ((Object) null);
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().getAbstractMethodName()
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1316) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = node;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: assign.getLastChild().isFunction() && !NodeUtil.isEmptyBlock(assign.getLastChild().getLastChild())
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_6() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
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
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1327) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = node;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: assign.getLastChild().isFunction() && !NodeUtil.isEmptyBlock(assign.getLastChild().getLastChild())
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_3() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1327) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = node;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().getAbstractMethodName()
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_5() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[37];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1316) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = numberNode;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: compiler.getCodingConvention().getAbstractMethodName()
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        EnumElementType jsType = ((EnumElementType) createInstance("com.google.javascript.rhino.jstype.EnumElementType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1316) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = node;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#getLastChild()}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isFunction()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: assign.getLastChild().isFunction() && !NodeUtil.isEmptyBlock(assign.getLastChild().getLastChild())
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_4() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        Node node = ((Node) createInstance("com.google.javascript.rhino.Node"));
        FunctionType jsType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        setField(node, "com.google.javascript.rhino.Node", "jsType", jsType);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1327) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class numberNodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, numberNodeType, numberNodeType, stringType, numberNodeType, numberNodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = numberNode;
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = node;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#visitInterfaceGetprop(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node)}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !rvalueType.isFunctionType()
 *  */
    @Test
    public void testVisitInterfaceGetprop_ThrowNullPointerException_7() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Compiler compiler = ((Compiler) createInstance("com.google.javascript.jscomp.Compiler"));
        CompilerOptions options = ((CompilerOptions) createInstance("com.google.javascript.jscomp.CompilerOptions"));
        compiler.options = options;
        ClosureCodingConvention defaultCodingConvention = ((ClosureCodingConvention) createInstance("com.google.javascript.jscomp.ClosureCodingConvention"));
        setField(compiler, "com.google.javascript.jscomp.Compiler", "defaultCodingConvention", defaultCodingConvention);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "compiler", compiler);
        JSTypeRegistry typeRegistry = ((JSTypeRegistry) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry"));
        com.google.javascript.rhino.jstype.JSType[] nativeTypes = new com.google.javascript.rhino.jstype.JSType[36];
        setField(typeRegistry, "com.google.javascript.rhino.jstype.JSTypeRegistry", "nativeTypes", nativeTypes);
        setField(typeCheck, "com.google.javascript.jscomp.TypeCheck", "typeRegistry", typeRegistry);
        Node node = new Node(0);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.visitInterfaceGetprop(TypeCheck.java:1317) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Method visitInterfaceGetpropMethod = typeCheckClazz.getDeclaredMethod("visitInterfaceGetprop", nodeTraversalType, nodeType, nodeType, stringType, nodeType, nodeType);
        visitInterfaceGetpropMethod.setAccessible(true);
        java.lang.Object[] visitInterfaceGetpropMethodArguments = new java.lang.Object[6];
        visitInterfaceGetpropMethodArguments[0] = ((Object) null);
        visitInterfaceGetpropMethodArguments[1] = ((Object) null);
        visitInterfaceGetpropMethodArguments[2] = ((Object) null);
        visitInterfaceGetpropMethodArguments[3] = ((Object) null);
        visitInterfaceGetpropMethodArguments[4] = ((Object) null);
        visitInterfaceGetpropMethodArguments[5] = node;
        try {
            visitInterfaceGetpropMethod.invoke(typeCheck, visitInterfaceGetpropMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkPropertyAccessHelper
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS for method checkPropertyAccessHelper(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyAccessHelper(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testCheckPropertyAccessHelper() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NoType noType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class noTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyAccessHelperMethod = typeCheckClazz.getDeclaredMethod("checkPropertyAccessHelper", noTypeType, stringType, nodeTraversalType, nodeType);
        checkPropertyAccessHelperMethod.setAccessible(true);
        java.lang.Object[] checkPropertyAccessHelperMethodArguments = new java.lang.Object[4];
        checkPropertyAccessHelperMethodArguments[0] = noType;
        checkPropertyAccessHelperMethodArguments[1] = ((Object) null);
        checkPropertyAccessHelperMethodArguments[2] = ((Object) null);
        checkPropertyAccessHelperMethodArguments[3] = ((Object) null);
        checkPropertyAccessHelperMethod.invoke(typeCheck, checkPropertyAccessHelperMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyAccessHelper(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 *  */
    @Test
    public void testCheckPropertyAccessHelper_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        TemplateType templateType = ((TemplateType) createInstance("com.google.javascript.rhino.jstype.TemplateType"));
        NoType referencedType = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        setField(templateType, "com.google.javascript.rhino.jstype.ProxyObjectType", "referencedType", referencedType);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class templateTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyAccessHelperMethod = typeCheckClazz.getDeclaredMethod("checkPropertyAccessHelper", templateTypeType, stringType, nodeTraversalType, nodeType);
        checkPropertyAccessHelperMethod.setAccessible(true);
        java.lang.Object[] checkPropertyAccessHelperMethodArguments = new java.lang.Object[4];
        checkPropertyAccessHelperMethodArguments[0] = templateType;
        checkPropertyAccessHelperMethodArguments[1] = ((Object) null);
        checkPropertyAccessHelperMethodArguments[2] = ((Object) null);
        checkPropertyAccessHelperMethodArguments[3] = ((Object) null);
        checkPropertyAccessHelperMethod.invoke(typeCheck, checkPropertyAccessHelperMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPropertyAccessHelper(com.google.javascript.rhino.jstype.JSType, java.lang.String, com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyAccessHelper(com.google.javascript.rhino.jstype.JSType,java.lang.String,com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.JSType#isEmptyType()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: !objectType.isEmptyType() && reportMissingProperties && !isPropertyTest(n)
 *  */
    @Test
    public void testCheckPropertyAccessHelper_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropertyAccessHelper] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkPropertyAccessHelper(TypeCheck.java:1440) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Class stringType = Class.forName("java.lang.String");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Method checkPropertyAccessHelperMethod = typeCheckClazz.getDeclaredMethod("checkPropertyAccessHelper", jSTypeType, stringType, nodeTraversalType, nodeType);
        checkPropertyAccessHelperMethod.setAccessible(true);
        java.lang.Object[] checkPropertyAccessHelperMethodArguments = new java.lang.Object[4];
        checkPropertyAccessHelperMethodArguments[0] = ((Object) null);
        checkPropertyAccessHelperMethodArguments[1] = ((Object) null);
        checkPropertyAccessHelperMethodArguments[2] = ((Object) null);
        checkPropertyAccessHelperMethodArguments[3] = ((Object) null);
        try {
            checkPropertyAccessHelperMethod.invoke(typeCheck, checkPropertyAccessHelperMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkInterfaceConflictProperties
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkInterfaceConflictProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, java.util.HashMap, java.util.HashMap, com.google.javascript.rhino.jstype.ObjectType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkInterfaceConflictProperties(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,java.util.HashMap,java.util.HashMap,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getImplicitPrototype()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: ObjectType implicitProto = interfaceType.getImplicitPrototype();
 *  */
    @Test
    public void testCheckInterfaceConflictProperties_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkInterfaceConflictProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkInterfaceConflictProperties(TypeCheck.java:1570) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class objectTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method checkInterfaceConflictPropertiesMethod = typeCheckClazz.getDeclaredMethod("checkInterfaceConflictProperties", nodeTraversalType, nodeType, stringType, hashMapType, hashMapType, objectTypeType);
        checkInterfaceConflictPropertiesMethod.setAccessible(true);
        java.lang.Object[] checkInterfaceConflictPropertiesMethodArguments = new java.lang.Object[6];
        checkInterfaceConflictPropertiesMethodArguments[0] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[1] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[2] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[3] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[4] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[5] = ((Object) null);
        try {
            checkInterfaceConflictPropertiesMethod.invoke(typeCheck, checkInterfaceConflictPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkInterfaceConflictProperties(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,java.lang.String,java.util.HashMap,java.util.HashMap,com.google.javascript.rhino.jstype.ObjectType)}
 * @utbot.invokes {@link com.google.javascript.rhino.jstype.ObjectType#getImplicitPrototype()}
 * @utbot.throwsException {@link java.lang.NullPointerException} in: currentPropertyNames = implicitProto.getOwnPropertyNames();
 *  */
    @Test
    public void testCheckInterfaceConflictProperties_ThrowNullPointerException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        FunctionType anonymousFunctionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.JSTypeRegistry$1"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkInterfaceConflictProperties] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkInterfaceConflictProperties(TypeCheck.java:1574) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class anonymousFunctionTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method checkInterfaceConflictPropertiesMethod = typeCheckClazz.getDeclaredMethod("checkInterfaceConflictProperties", nodeTraversalType, nodeType, stringType, hashMapType, hashMapType, anonymousFunctionTypeType);
        checkInterfaceConflictPropertiesMethod.setAccessible(true);
        java.lang.Object[] checkInterfaceConflictPropertiesMethodArguments = new java.lang.Object[6];
        checkInterfaceConflictPropertiesMethodArguments[0] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[1] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[2] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[3] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[4] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[5] = anonymousFunctionType;
        try {
            checkInterfaceConflictPropertiesMethod.invoke(typeCheck, checkInterfaceConflictPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region OTHER: SUCCESSFUL EXECUTIONS for method checkInterfaceConflictProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, java.util.HashMap, java.util.HashMap, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testCheckInterfaceConflictProperties1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        String string = "";
        HashMap hashMap = new HashMap();
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        NoType implicitPrototypeFallback = ((NoType) createInstance("com.google.javascript.rhino.jstype.NoType"));
        Object properties = createInstance("com.google.javascript.rhino.jstype.PropertyMap");
        LinkedHashMap properties1 = new LinkedHashMap();
        setField(properties, "com.google.javascript.rhino.jstype.PropertyMap", "properties", properties1);
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.PrototypeObjectType", "properties", properties);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method checkInterfaceConflictPropertiesMethod = typeCheckClazz.getDeclaredMethod("checkInterfaceConflictProperties", nodeTraversalType, nodeType, stringType, hashMapType, hashMapType, functionTypeType);
        checkInterfaceConflictPropertiesMethod.setAccessible(true);
        java.lang.Object[] checkInterfaceConflictPropertiesMethodArguments = new java.lang.Object[6];
        checkInterfaceConflictPropertiesMethodArguments[0] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[1] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[2] = string;
        checkInterfaceConflictPropertiesMethodArguments[3] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[4] = hashMap;
        checkInterfaceConflictPropertiesMethodArguments[5] = functionType;
        checkInterfaceConflictPropertiesMethod.invoke(typeCheck, checkInterfaceConflictPropertiesMethodArguments);
    }
    ///endregion
    
    ///region OTHER: ERROR SUITE for method checkInterfaceConflictProperties(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, java.lang.String, java.util.HashMap, java.util.HashMap, com.google.javascript.rhino.jstype.ObjectType)
    
    @Test
    public void testCheckInterfaceConflictProperties2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        NodeTraversal nodeTraversal = ((NodeTraversal) createInstance("com.google.javascript.jscomp.NodeTraversal"));
        Node node = new Node(0);
        HashMap hashMap = new HashMap();
        FunctionType functionType = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        FunctionType implicitPrototypeFallback = ((FunctionType) createInstance("com.google.javascript.rhino.jstype.FunctionType"));
        Property prototypeSlot = ((Property) createInstance("com.google.javascript.rhino.jstype.Property"));
        setField(implicitPrototypeFallback, "com.google.javascript.rhino.jstype.FunctionType", "prototypeSlot", prototypeSlot);
        setField(functionType, "com.google.javascript.rhino.jstype.PrototypeObjectType", "implicitPrototypeFallback", implicitPrototypeFallback);
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkInterfaceConflictProperties] produces [java.lang.NullPointerException]
            com.google.javascript.rhino.jstype.ObjectType.getOwnPropertyNames(ObjectType.java:469)
            com.google.javascript.rhino.jstype.FunctionType.getOwnPropertyNames(FunctionType.java:354)
            com.google.javascript.jscomp.TypeCheck.checkInterfaceConflictProperties(TypeCheck.java:1574) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class hashMapType = Class.forName("java.util.HashMap");
        Class functionTypeType = Class.forName("com.google.javascript.rhino.jstype.ObjectType");
        Method checkInterfaceConflictPropertiesMethod = typeCheckClazz.getDeclaredMethod("checkInterfaceConflictProperties", nodeTraversalType, nodeType, stringType, hashMapType, hashMapType, functionTypeType);
        checkInterfaceConflictPropertiesMethod.setAccessible(true);
        java.lang.Object[] checkInterfaceConflictPropertiesMethodArguments = new java.lang.Object[6];
        checkInterfaceConflictPropertiesMethodArguments[0] = nodeTraversal;
        checkInterfaceConflictPropertiesMethodArguments[1] = node;
        checkInterfaceConflictPropertiesMethodArguments[2] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[3] = hashMap;
        checkInterfaceConflictPropertiesMethodArguments[4] = ((Object) null);
        checkInterfaceConflictPropertiesMethodArguments[5] = functionType;
        try {
            checkInterfaceConflictPropertiesMethod.invoke(typeCheck, checkInterfaceConflictPropertiesMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///endregion
    
    ///region Test suites for executable com.google.javascript.jscomp.TypeCheck.checkPropertyInheritanceOnGetpropAssign
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #0 for method checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testCheckPropertyInheritanceOnGetpropAssign() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(-255);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testCheckPropertyInheritanceOnGetpropAssign_1() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(-255);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testCheckPropertyInheritanceOnGetpropAssign_2() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(26);
        Object first = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) first)).setType(-256);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testCheckPropertyInheritanceOnGetpropAssign_3() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$StringNode");
        (((Node) last)).setType(154);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: SUCCESSFUL EXECUTIONS #1 for method checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    /// 
    /// Common steps:
    /// <pre>
    /// Tests execute conditions:
    ///     {@code (null): True},
    ///     {@code (object.isGetProp()): True}
    /// invoke:
    ///     {@link com.google.javascript.rhino.Node#getFirstChild()} twice,
    ///     {@link com.google.javascript.rhino.Node#getLastChild()} twice,
    ///     {@link com.google.javascript.jscomp.NodeUtil#getStringValue(com.google.javascript.rhino.Node)} twice,
    ///     {@link com.google.javascript.rhino.Node#getType()} twice,
    ///     {@link java.lang.String#equals(java.lang.Object)} once,
    ///     {@link org.utbot.engine.overrides.strings.UtString#preconditionCheck()} twice
    /// execute conditions:
    ///     {@code (null): False},
    ///     {@code (null): True}
    /// invoke:
    ///     {@link java.lang.String#length()} twice
    /// execute conditions:
    ///     {@code (null): False}
    /// invoke:
    ///     {@link java.lang.String#equals(java.lang.Object)} once
    /// </pre>
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testCheckPropertyInheritanceOnGetpropAssign_4() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(44);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testCheckPropertyInheritanceOnGetpropAssign_5() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(64);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testCheckPropertyInheritanceOnGetpropAssign_6() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(41);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 *  */
    @Test
    public void testCheckPropertyInheritanceOnGetpropAssign_7() throws Exception  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(43);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: ERROR SUITE for method checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.invokes {@link com.google.javascript.rhino.Node#isGetProp()}
 * @utbot.throwsException {@link java.lang.NullPointerException} when: object.isGetProp()
 *  */
    @Test
    public void testCheckPropertyInheritanceOnGetpropAssign_ThrowNullPointerException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        
        /* This test fails because method [com.google.javascript.jscomp.TypeCheck.checkPropertyInheritanceOnGetpropAssign] produces [java.lang.NullPointerException]
            com.google.javascript.jscomp.TypeCheck.checkPropertyInheritanceOnGetpropAssign(TypeCheck.java:1033) */
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        try {
            checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    ///endregion
    
    ///region SYMBOLIC EXECUTION: EXPLICITLY THROWN UNCHECKED EXCEPTIONS for method checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal, com.google.javascript.rhino.Node, com.google.javascript.rhino.Node, java.lang.String, com.google.javascript.rhino.JSDocInfo, com.google.javascript.rhino.jstype.JSType)
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String property2 = NodeUtil.getStringValue(object.getLastChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckPropertyInheritanceOnGetpropAssign_ThrowIllegalStateException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(39);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        try {
            checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String property2 = NodeUtil.getStringValue(object.getLastChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckPropertyInheritanceOnGetpropAssign_ThrowIllegalStateException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(40);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        try {
            checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String property2 = NodeUtil.getStringValue(object.getLastChild());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckPropertyInheritanceOnGetpropAssign_ThrowUnsupportedOperationException() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(154);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        try {
            checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String property2 = NodeUtil.getStringValue(object.getLastChild());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckPropertyInheritanceOnGetpropAssign_ThrowUnsupportedOperationException_1() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Node last = ((Node) createInstance("com.google.javascript.rhino.Node"));
        last.setType(38);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        try {
            checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.IllegalStateException} in: String property2 = NodeUtil.getStringValue(object.getLastChild());
 *  */
    @Test(expected = IllegalStateException.class)
    public void testCheckPropertyInheritanceOnGetpropAssign_ThrowIllegalStateException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(39);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        try {
            checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
        } catch (java.lang.reflect.InvocationTargetException invocationTargetException) {
            throw invocationTargetException.getTargetException();
        }
    }
    
    /**
    @utbot.classUnderTest {@link TypeCheck}
 * @utbot.methodUnderTest {@link com.google.javascript.jscomp.TypeCheck#checkPropertyInheritanceOnGetpropAssign(com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node,java.lang.String,com.google.javascript.rhino.JSDocInfo,com.google.javascript.rhino.jstype.JSType)}
 * @utbot.throwsException {@link java.lang.UnsupportedOperationException} in: String property2 = NodeUtil.getStringValue(object.getLastChild());
 *  */
    @Test(expected = UnsupportedOperationException.class)
    public void testCheckPropertyInheritanceOnGetpropAssign_ThrowUnsupportedOperationException_2() throws Throwable  {
        TypeCheck typeCheck = ((TypeCheck) createInstance("com.google.javascript.jscomp.TypeCheck"));
        Object numberNode = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) numberNode)).setType(33);
        Object last = createInstance("com.google.javascript.rhino.Node$NumberNode");
        (((Node) last)).setType(26);
        Node first = ((Node) createInstance("com.google.javascript.rhino.Node"));
        first.setType(38);
        setField(last, "com.google.javascript.rhino.Node", "first", first);
        setField(numberNode, "com.google.javascript.rhino.Node", "last", last);
        
        Class typeCheckClazz = Class.forName("com.google.javascript.jscomp.TypeCheck");
        Class nodeTraversalType = Class.forName("com.google.javascript.jscomp.NodeTraversal");
        Class nodeType = Class.forName("com.google.javascript.rhino.Node");
        Class stringType = Class.forName("java.lang.String");
        Class jSDocInfoType = Class.forName("com.google.javascript.rhino.JSDocInfo");
        Class jSTypeType = Class.forName("com.google.javascript.rhino.jstype.JSType");
        Method checkPropertyInheritanceOnGetpropAssignMethod = typeCheckClazz.getDeclaredMethod("checkPropertyInheritanceOnGetpropAssign", nodeTraversalType, nodeType, nodeType, stringType, jSDocInfoType, jSTypeType);
        checkPropertyInheritanceOnGetpropAssignMethod.setAccessible(true);
        java.lang.Object[] checkPropertyInheritanceOnGetpropAssignMethodArguments = new java.lang.Object[6];
        checkPropertyInheritanceOnGetpropAssignMethodArguments[0] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[1] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[2] = numberNode;
        checkPropertyInheritanceOnGetpropAssignMethodArguments[3] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[4] = ((Object) null);
        checkPropertyInheritanceOnGetpropAssignMethodArguments[5] = ((Object) null);
        try {
            checkPropertyInheritanceOnGetpropAssignMethod.invoke(typeCheck, checkPropertyInheritanceOnGetpropAssignMethodArguments);
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
        
                java.lang.reflect.Method methodForGetDeclaredFields879778373332400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
                methodForGetDeclaredFields879778373332400.setAccessible(true);
                java.lang.reflect.Field[] allFieldsFromFieldClass879778373351200 = (java.lang.reflect.Field[]) methodForGetDeclaredFields879778373332400.invoke(java.lang.reflect.Field.class, false);
                modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass879778373351200).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
        
            java.lang.reflect.Method methodForGetDeclaredFields879778374083400 = java.lang.Class.class.getDeclaredMethod("getDeclaredFields0", boolean.class);
            methodForGetDeclaredFields879778374083400.setAccessible(true);
            java.lang.reflect.Field[] allFieldsFromFieldClass879778374084900 = (java.lang.reflect.Field[]) methodForGetDeclaredFields879778374083400.invoke(java.lang.reflect.Field.class, false);
            modifiersField = java.util.Arrays.stream(allFieldsFromFieldClass879778374084900).filter(field1 -> field1.getName().equals("modifiers")).findFirst().get();
    
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
    
    private static Object getUnsafeInstance() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        java.lang.reflect.Field f = Class.forName("sun.misc.Unsafe").getDeclaredField("theUnsafe");
        f.setAccessible(true);
        return f.get(null);
    }
    ///endregion
}

